Feature: Dropdown selection

Scenario: User selects Option 1
  Given the user opens the dropdown page
  When the user selects "Option 1"
  Then the dropdown should display "Option 1"

Scenario: User selects Option 2
  Given the user opens the dropdown page
  When the user selects "Option 2"
  Then the dropdown should display "Option 2"