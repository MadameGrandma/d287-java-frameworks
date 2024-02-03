# D287 - README
This README contains notes describing where in the code to identify the changes made for the performance assessment of D287, 
parts C through J.

## Part C
### Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
*File Name:* mainscreen.html   
*Line Number:*
- mainscreen: line 14-22

*Change:*
- Added background and text alignment styling
- Changed the title to shop name "Plants by Atlas"
- Changed h1 to shop name "Plants by Atlas"  

## Part D
### Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
*File Name:* about.html | mainscreen.html | AboutUsController.java
*Line Number:*
- about: line 1-end
- mainscreen: line 31-33
- AboutUsController: 1-end (new file)  

*Change:*
- Created AboutUsController.java to handle requests to the about page
- Updated mainscreen to request the about page
- Created about.html to design and serve the page

## Part E
### Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
*File Name:* BootStrapData.java  
*Line Number:* 72-99  
*Change:*
- Created new parts and products for sample inventory
- Saved to partRepository & productRepository respectively  

## Part F
### Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
-  The "Buy Now" button must be next to the buttons that update and delete products.
-  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
-  Display a message that indicates the success or failure of a purchase.

*File Name:* mainscreen.html | AddProductController.java | confirmationbuyproduct.html
*Line Number:*
- mainscreen.html: line 97-98
- AddProductController: 131-152
- confirmationbuyproduct: 1-end (new file)  
- purchaseerror: 1-end (new file)  

*Change:*
- Added BuyNow button to mainscreen
- Pointed button to the buyproduct controller in AddProductController
- Created a controller for buy product, which decrements and saves the current inventory of that product
- Created a redirect page to confirm successful purchase

## Part G
### Modify the parts to track maximum and minimum inventory by doing the following:
-  Add additional fields to the part entity for maximum and minimum inventory.
-  Modify the sample inventory to include the maximum and minimum fields.
-  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
-  Rename the file the persistent storage is saved to.
-  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

*File Name:*
*Line Number:*
*Change:*

## Part H
### Add validation for between or at the maximum and minimum fields. The validation must include the following:
-  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
-  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
-  Display error messages when adding and updating parts if the inventory is greater than the maximum. \

*File Name:*
*Line Number:*
*Change:*

## Part I
### Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
*File Name:*
*Line Number:*
*Change:*

## Part J
### Remove the class files for any unused validators in order to clean your code.
*File Name:*
*Line Number:*
*Change:*
