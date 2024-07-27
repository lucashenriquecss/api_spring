package luca.dev.api.medic;

public record DataAddress(String street,
                          String neighborhood,
                          String postalCode,
                          String city,
                          String region,
                          String number,
                          String complement) { }
