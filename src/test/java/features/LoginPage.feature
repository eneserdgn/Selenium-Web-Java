Feature: Login Page

  Scenario Outline:  False SignUp with Email
    Given user is on login page
    When user click SignUp
    When user enters email "<email>" on SignUp Page
    When user clicks SignUp Button
    Then user should see false mail message "<falseMailMessage>"
    Examples:
      | email                     | falseMailMessage                          |
      #iki tane @ girmiyo | a@b@c.com                       | Lütfen geçerli bir e-posta adresi giriniz |
      #special karakter diyo| a”b(c)d,e:f;gi[j\k]l@domain.com | Lütfen geçerli bir e-posta adresi giriniz |
      #special karakter diyo tes slash iiçn| abc is”not\valid@domain.com     | Lütfen geçerli bir e-posta adresi giriniz |
      | test@domain..com          | Lütfen geçerli bir e-posta adresi giriniz |
      | abc”test”email@domain.com | Lütfen geçerli bir e-posta adresi giriniz |
      | .test@domain.com          | Lütfen geçerli bir e-posta adresi giriniz |

  Scenario Outline: Empty Mail
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    Then user should see empty mail message "<emptyMailMessage>"
    Examples:
      | email | password | emptyMailMessage                              |
      |       | password | Lütfen kullanıcı adınızı/e-postanızı giriniz. |


  Scenario Outline: Empty Password
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    Then user should see empty password message "<emptyPassMessage>"
    Examples:
      | email                  | password | emptyPassMessage          |
      | enes.erdogan@gmail.com |          | Lütfen şifrenizi giriniz. |


  Scenario Outline: False Password and Mail
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    Then user should see popup message "<message>"
    Examples:
      | email         | password | message                                                                        |
      | mail@mail.com | password | Hatalı giriş. Lütfen kullanıcı adı ve şifrenizi kontrol edip tekrar deneyiniz. |

  Scenario Outline:  Success Login
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    Then user should see name "<name>"
    Examples:
      | email                  | password  | name         |
      | enes.erdgn32@gmail.com | Enes.1995 | Enes Erdoğan |
#
#  Scenario Outline: Come Back to Successfull Login
#    Given user is successfull Login with "<email>", "<password>","<name>"
#    When user come back to page
#    Then user should see name "<name>"
#    Examples:
#      | email                  | password  | name         |
#      | enes.erdgn32@gmail.com | Enes.1995 | Enes Erdoğan |
#
#  Scenario Outline: Come Back to SignUp
#    Given user is SignUp Page
#    When user come back to page
#    Then user should see SignUp button
#    Examples:
#      | email                  | password  | name         |
#      | enes.erdgn32@gmail.com | Enes.1995 | Enes Erdoğan |


