@FavoritePage
Feature: Favorite Page

  @EmptyFavoriteTab
  Scenario Outline:  Empty Favorite Tab
    Given user is logged in "<email>" and "<password>"
    When user clicks "<tab>" button on tabs
    Then user should see empty tab message "<emptyTabMessage>" on tab
    Examples:
      | email                  | password  | tab         | emptyTabMessage                |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Favori restoranınız bulunamadı |

  @EmptyFavoritePage
  Scenario Outline:  Empty Favorite Page
    Given user is logged in "<email>" and "<password>"
    When user clicks menu
    When user clicks "<menuItem>" button on menu
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Henüz favori restoranınız bulunmamaktadır. |

  @AddFavorite
  Scenario Outline:  Add Favorite Restaurant
    Given user is logged in "<email>" and "<password>"
    When user clicks "<tab>" button on tabs
    When user click "<restaurant>" restaurant on Super Restaurant Tab
    When user click Add Favorite
    When user clicks menu
    When user clicks "<menuItem>" button on menu
    Then user should see "<restaurant>" restaurant on Favorite Page
    Examples:
      | email                  | password  | menuItem    | tab               | restaurant          |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Süper Restoranlar | Ahmet Usta'nın Yeri |

  @DeleteFavorite
  Scenario Outline:  Delete Favorite Restaurant
    Given user is logged in "<email>" and "<password>"
    When user clicks menu
    When user clicks "<menuItem>" button on menu
    When user click check "<restaurant>" restaurant on Favorite Page
    When user click delete button
    Then user should see empty favorite message "<emptyTabMessage>" on Favorite Page
    Examples:
      | email                  | password  | menuItem    | restaurant          | emptyTabMessage                            |
      | enes.erdgn32@gmail.com | Enes.1995 | Favorilerim | Ahmet Usta'nın Yeri | Henüz favori restoranınız bulunmamaktadır. |

