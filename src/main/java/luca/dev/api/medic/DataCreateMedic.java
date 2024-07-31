package luca.dev.api.medic;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import luca.dev.api.address.DataAddress;

public record DataCreateMedic(
        @NotBlank // validações de campos
        String name,

        @Email
        @NotBlank
        String email,
        @NotBlank
        String phone,

        @NotBlank
        String crm,

        @NotBlank
        Specialty specialty,

        @NotBlank
        @Valid
        DataAddress address
) {
}
