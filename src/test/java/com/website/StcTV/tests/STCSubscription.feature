Feature: STC TV subscription


  Scenario Outline:  customer can subscribe in one of three plans in all the countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    And select "<country>" from countries list
    Then the lite plan and its button should be displayed
    And lite plan price should be in country local currency "<currency>"
    And classic plan and its button should be displayed
    And classic plan price should be in country local currency "<currency>"
    And premium plan and its button should be displayed
    And premium plan price should be in country local currency "<currency>"

    Examples:
      | country    | currency | preferredLanguage |
      | country1En | SAR      | en                |
      | country2En | KWD      | en                |
      | country3En | BHD      | en                |


  Scenario Outline: customer should have 30 days free trial in lite plan in all countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    When select "<country>" from countries list
    And click on lite plan button
    Then checkout page should be displayed
    Then Total amount in checkout page should be zero
    Examples:
      | country    | preferredLanguage |
      | country1En | en                |
      | country2En | en                |
      | country3En | en                |


  Scenario Outline: customer should have 30 days free trial in classic plan in all countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    When select "<country>" from countries list
    And click on classic plan button
    Then checkout page should be displayed
    Then Total amount in checkout page should be zero
    Examples:
      | country    | preferredLanguage |
      | country1En | en                |
      | country2En | en                |
      | country3En | en                |

  Scenario Outline: customer should have 30 days free trial in premium plan in all countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    When select "<country>" from countries list
    And click on premium plan button
    Then checkout page should be displayed
    Then Total amount in checkout page should be zero
    Examples:
      | country    | preferredLanguage |
      | country1En | en                |
      | country2En | en                |
      | country3En | en                |






