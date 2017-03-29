package contracts.programmer.endpoint

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'POST'
        url '/programmers'
        headers {
            contentType(applicationJson())
        }
        body([
                name: "programmerName"
        ])
    }

    response {
        status 201
        headers {
            contentType(applicationJsonUtf8())
        }
        body([
                id  : 1,
                name: "programmerName"
        ])

    }
}
