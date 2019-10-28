---
title: React Game of Thrones Character Browser
type: Lab
duration: "1:30"
creator:
    name: Rachel Moskowitz (adapted from NYC-SEI)
---



# Game of Thrones Character Browser Lab

[An API of Ice and Fire](https://www.anapioficeandfire.com/) is an open-access REST API that includes information about characters, houses, and books from the action-packed high-fantasy epic.

For this assignment, you'll build a React app to browse through the characters in "Game of Thrones."

### Getting Started

1. Fork and clone this repository.
1. Next, `cd` into the directory.
1. Run `npm install`.
1. Make sure to install `axios`!
1. Open up `App.js` and get to work!
1. Look at an example of the API data in the characters endpoint:

    [`https://www.anapioficeandfire.com/api/characters?page=1&pageSize=50`](https://www.anapioficeandfire.com/api/characters?page=1&pageSize=50)

   There's also [documentation on this endpoint](https://www.anapioficeandfire.com/Documentation#characters), if it's useful.
   
1. Upon page load, make an AJAX request to the first page of the characters endpoint and render each separate character into its own component.

    Hint: This would be a good place to map over components.
    <br>
    Hint: Some characters don't have names, so you'll have to use their first alias instead.
    <br>
    Hint: Some characters have a "books" array; rendering these could be another good place to use map.

## Bonus
1. Add a "Next" button. When a user clicks on the button, make an AJAX call to the next page of results in the API, and replace the displayed list of characters with the new results.
1. Add a "Previous" button, which should have similar functionality to the "Next" button but in the reverse direction.
1. Make your page responsive, and add some nice style to the results.
