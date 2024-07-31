package luca.dev.api.address;

import jakarta.validation.constraints.NotBlank;

public record DataAddress(
        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @NotBlank
        String postalCode,
        @NotBlank
        String city,
        @NotBlank
        String region,
        @NotBlank
        String number,

        String complement) { }
