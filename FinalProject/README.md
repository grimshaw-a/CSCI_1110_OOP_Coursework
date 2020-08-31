# Custom Children's Book

## Synopsis
This folder contains all files necessary to create a custom children's book. This is my final project for my Object Oriented Programming class at Southwest Tech.

## Motivation
<p>My friend was creating custom books and compositing them all manually. I created this for him so that the process would be automated and he could save time.</p>

## How to Run
<p>This program works in two parts. The first part gathers customization information from the user. This is done through a GUI created using JavaFX. Two java files are necessary to make the GUI run: ZooBook.java and InputScreenInterface.java. ZooBook.java defines a class that stores all the customizable properties for the book. InputScreenInterface.java creates an instance of the ZooBook class and then generates a GUI that prompts the user to enter their customization preferences. These preferences are recorded in an instance of ZooBook and then exported to a .txt file. Before using, the code MUST be updated with a valid path for where the .txt file will be stored.</p>
<p>The second part of the process is to apply the customization preferences to the text and graphics of the book. Each spread of the book is stored as a .tif file. A javascript file is provided that will manipulate the .tif files in Adobe Photoshop CC to reflect the customization preferences. The file is named ApplyCustomizations.jsx. This script should be compatible with most versions of Photoshop CC. Again, the code in this script MUST be updated with a valid path for both location of the .tif files and a location to export .jpg files.</p>

## Code Example
