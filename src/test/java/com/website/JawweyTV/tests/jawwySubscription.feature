Feature: jawwy subscription

  Scenario Outline: customer get offer banner in his local currency
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    And select "<country>" from countries list
    Then offer banner should be displayed
    And offer currency should be in "<currency>"

    Examples:
      | country  | currency | preferredLanguage |
      | country1En | AED      | en                |
      | country2En | JOD      | en                |

  Scenario Outline:  customer can subscribe in one of three plans in all the countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    And select "<country>" from countries list
    Then the lite plan and its button should be displayed
    And classic plan and its button should be displayed
    And premium plan and its button should be displayed

    Examples:
      | country  | preferredLanguage |
      | country1En | en                |
      | country2En | en                |
      | country3En | en                |
      | country4En | en                |
      | country5En | en                |
      | country6En | en                |
      | country7En | en                |
      | country8En | en                |
      | country9En | en                |

    Scenario Outline: customer should have 30 days free trial in lite plan in all countries
      Given website is opened and user need it to be in language "<preferredLanguage>"
      When click on country button
      When select "<country>" from countries list
      And click on lite plan button
      Then checkout page should be displayed
      Then Total amount in checkout page should be zero
      Examples:
        | country  | preferredLanguage |
        | country1En | en                |
        | country2En | en                |
        | country3En | en                |
        | country4En | en                |
        | country5En | en                |
        | country6En | en                |
        | country7En | en                |
        | country8En | en                |
        | country9En | en                |


  Scenario Outline: customer should have 30 days free trial in classic plan in all countries
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When click on country button
    When select "<country>" from countries list
    And click on classic plan button
    Then checkout page should be displayed
    Then Total amount in checkout page should be zero
    Examples:
      | country  | preferredLanguage |
      | country1En | en                |
      | country2En | en                |
      | country3En | en                |
      | country4En | en                |
      | country5En | en                |
      | country6En | en                |
      | country7En | en                |
      | country8En | en                |
      | country9En | en                |





