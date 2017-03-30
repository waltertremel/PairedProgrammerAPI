package contracts.programmer.endpoint

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url '/programmers/1'
    }
    response {
        status 200

        body(
                [
                        id: 1,
                        name: "programmerName"
                ]
        )
    }

}


