@GetCountryDetails
Feature: Get Full country Details and Validate

  @GetCountryDetails
  Scenario Outline: Get Full country Details and Validate
    Given I will fetch Full country details for "<countryIsoCode>"
    Then Validate response with values "<language>","<currencyIsoCode>","<phoneCode>","<capital>" and "<countryName>"

    Examples: 
      | countryIsoCode | language | currencyIsoCode | phoneCode | capital    | countryName   |
      | IN             | Hindi    | INR             |        91 | New Delhi  | India         |
      | US             | English  | USD             |         1 | Washington | United States |
