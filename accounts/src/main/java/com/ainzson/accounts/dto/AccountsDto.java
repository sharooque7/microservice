package com.ainzson.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold the accounts information"
)
public class AccountsDto {
    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    @Schema(
            description = "Account Number",
            example = "1234567890"
    )
    private Long accountNumber;
    @NotEmpty(message = "Account Type cannot be empty")
    @Schema(
            description = "Account Type ",
            example = "Savings"
    )
    private String accountType;


    @NotEmpty(message = "Branch Address cannot be empty")
    @Schema(
            description = "Branch Address",
            example = "123 Main St, City, Country"
    )
    private String branchAddress;

}
