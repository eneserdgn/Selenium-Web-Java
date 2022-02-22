@SignupPage
Feature: Signup Page

  @FalseMail
  Scenario Outline:  False Signup with <email>
    Given user is on signUp page
    When user enters email "<email>" on SignUp Page
    When user clicks SignUp Button on SignUp Page
    Then user should see false mail message "<falseMailMessage>"
    Examples:
      | email                           | falseMailMessage                          |
      | a@b@c.com                       | Lütfen geçerli bir e-posta adresi giriniz |
      | .test@domain.com                | Lütfen geçerli bir e-posta adresi giriniz |
      | a”b(c)d,e:f;gi[j\k]l@domain.com | Lütfen geçerli bir e-posta adresi giriniz |
     #| abc”test”email@domain.com       | Lütfen geçerli bir e-posta adresi giriniz |
      #| test@domain..com                | Lütfen geçerli bir e-posta adresi giriniz |
      #| abc is”not\valid@domain.com     | Lütfen geçerli bir e-posta adresi giriniz |
