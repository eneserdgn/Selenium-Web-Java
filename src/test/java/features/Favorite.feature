Feature: Favorite Page

  Scenario Outline:  Empty Favorite Tab
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks "<tab>" button on tabs
    Then user should see empty tab message "<emptyTabMessage>" on tab
    Examples:
      | email                  | password  | tab         |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim |

  Scenario Outline:  Empty Favorite Page
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |

  Scenario Outline:  Add Favorite Restaurant
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |

  Scenario Outline:  Empty Message After Delete Favorite Restaurant
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |

  Scenario Outline:  Restaurant Remains After Delete Favorite Restaurant
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |


  Scenario Outline:  Delete Multiple Favorite Restaurant
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |


  Scenario Outline:  Redirect From Favorite Page to Restaurant Page
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |

  Scenario Outline:  Return From Restaurant Page to Favorites Page
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |


  Scenario Outline:  Return From Favorite Tab
    Given user is on login page
    When user enters email "<email>"
    When user enters password "<password>"
    When user clicks on Login button
    When user clicks popup close button
    When user clicks menü
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |


