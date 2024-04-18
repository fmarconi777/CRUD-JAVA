package com.java.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(String id, @NotBlank String name, @NotNull Double price_in_cents) {

}
