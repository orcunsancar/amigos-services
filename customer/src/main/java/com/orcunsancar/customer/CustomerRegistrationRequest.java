package com.orcunsancar.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
