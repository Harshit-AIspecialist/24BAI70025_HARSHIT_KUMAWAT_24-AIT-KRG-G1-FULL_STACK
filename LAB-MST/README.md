# LAB MST – JavaScript Promises and DOM Manipulation

## Overview

This lab experiment demonstrates two important JavaScript concepts:

1. **Promises in JavaScript**
2. **DOM Manipulation using JavaScript**

The experiment shows how asynchronous operations are handled using Promises and how web page content and styling can be dynamically modified using the Document Object Model (DOM).

---

# Question 1 – JavaScript Promise

## Objective

To create a JavaScript Promise that resolves after 2 seconds and returns the message **"Data fetched successfully"**, and handle it using `.then()` and `.catch()`.

## Concept

A **Promise** in JavaScript represents the eventual completion or failure of an asynchronous operation.

A Promise has three states:

* Pending
* Fulfilled
* Rejected

`.then()` is used when the promise is successfully resolved and `.catch()` is used to handle errors.

## Implementation

The promise waits for 2 seconds using `setTimeout()` and then resolves with the message.

## Output

After 2 seconds, the message is displayed in the console:

Data fetched successfully

---

# Question 2 – DOM Manipulation

## Objective

To create an HTML page with a paragraph and a button that changes the paragraph text and style when the button is clicked.

## Concept

**DOM (Document Object Model)** allows JavaScript to access and modify HTML elements dynamically.

In this experiment:

* `getElementById()` is used to select the paragraph.
* `innerText` is used to change the text.
* `style` property is used to modify the appearance.


## Output

When the button is clicked:

* The paragraph text changes to **"Welcome to JavaScript DOM Manipulation"**
* The paragraph color changes to **blue**
* The font size increases.

---

## Conclusion

This experiment demonstrates how JavaScript handles **asynchronous operations using Promises** and how **DOM manipulation** can dynamically update web page content and styling.
