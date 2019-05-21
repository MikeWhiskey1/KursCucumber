Feature: Form Test

  Scenario: user can register on the page http://aavtrain.com/
    Given there is browser opened with the home page "http://aavtrain.com/"
    When user click on registration button
    Then user is on registration page
    When user fills all mandatory fields
      | Karol           |
      | Kowalski        |
      | karol@gmail.com |
      | karolek12       |
      | Dobra 56        |
      | Akacjowa 34     |
      | 66666666        |
      | Warszawa        |
      | Polska          |
      | 01-494          |
      | alaMaKota       |




  Scenario Outline: repeating
    Given repeating there is browser opened with the home page "http://aavtrain.com/"
    When repeating user click on registration button
    Then repeating user is on registration page
    When repeating user fills <fn> <ln> <email> <userName> <addr1> <addr2> <phone> <city> <prov> <zip> <pass>
    Examples:
      | fn    | ln       | email           | userName  | addr1    | addr2       | phone    | city     | prov   | zip    | pass        |
      | Karol | Kowalski | karol@gmail.com | karolek12 | Dobra 56 | Akacjowa 34 | 66666666 | Warszawa | Polska | 01-494 | karolMaKota |
      | Ala   | Makota   | ala@gmail.com   | ala12     | Dobra 56 | Akacjowa 34 | 66666666 | Warszawa | Polska | 01-494 | alaMaKota   |



 Scenario: zadII
   Given zadII there is browser opened with the home page "http://aavtrain.com/"
   When zadII user click on registration button
   Then zadII user is on registration page
   And zadII Entering
     | email   | karol@gmail.com |
     | city    | Warszawa         |
     | zip    | 1232              |
     |first_name| Zibi            |