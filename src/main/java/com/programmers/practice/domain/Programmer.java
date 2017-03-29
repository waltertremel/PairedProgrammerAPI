package com.programmers.practice.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by xpdesktop on 3/28/17.
 */
@JsonDeserialize(builder = Programmer.Builder.class)
public class Programmer {
    private Integer id;
    private String name;

    private Programmer(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder copy() {
        return builder().withId(id).withName(name);
    }

    @JsonPOJOBuilder
    public static class Builder{
        private Integer id;
        private String name;

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Programmer build(){
            return new Programmer(this);
        }
    }
}
