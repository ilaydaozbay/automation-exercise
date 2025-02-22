Feature: Kullanıcı Kayıt Olma

  Scenario: Kullanıcı başarılı bir şekilde siteye kaydolur.
    Given Kullanıcı tarayıcıyı başlatır
    And Kullanıcı ilgili adrese gider.
    Then Kullanıcı ana sayfanın başarılı bir şekilde görüntülendiğini doğrular.
    When Kullanıcı "Signup/Login" butonuna tıklar
    Then Kullanıcı 'New User Signup!' yazısının görünürlüğünü doğrular.
    When Kullanıcı adını girer.
    When Kullanıcı emailini girer.
    And Kullanıcı 'Signup' butonuna tıklar.
    Then Kullanıcı 'ENTER ACCOUNT INFORMATION' yazısının görünürlüğünü doğrular.
    When Kullanıcı Title,Name,Email,Password,Date of Birth bilgilerini girer.
    And Kullanıcı 'Sign up for our newsletter!' kutucuğunu seçer.
    And Kullanıcı 'Receive special offers from our partners!' kutucuğunu seçer.
    When Kullanıcı First name, Last name, Company, Adress, Adress2, Country, State, City,Zipcode,Mobile Number bilgilerini girer.
    And Kullanıcı 'Create Account' butonuna tılar.
    Then Kullanıcı 'ACCOUNT CREATED!' yazısının görünürlüğünü doğrular.
    When Kullanıcı 'Continue' butonuna tıklar.
    Then Kullanıcı 'Logged in as username' yazısının görünürlüğünü doğrular.
    When Kullanıcı 'Delete Account' butonuna tıklar.
    Then Kullanıcı 'ACCOUNT DELETED!' görünürlüğünü doğrular
    And Kullanıcı 'Continue' butonuna tıklar.
