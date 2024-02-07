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
*File Name:* BootStrapData.java | InhousePart.java
*Line Number:* 
- BootStrapData: 72-101
- InhousePart: 19-26  

*Change:*
- Built constructor in InhousePart.java to build sample inventory items
- Created new parts and products for sample inventory in BootStrapData
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

*File Name:* Partr.java | InhousePart.java | mainscreen.html | InhousePartForm.html | OutsourcedPartForm.html | BootStrapData.java | application.properties | MinInvValidator.java | ValidMinInv.java | MaxInvValidator.java | ValidMaxInv.java
*Line Number:*
- Part: 25-26
- InhousePart: 22-41
- mainscreen: 52-65
- InhousePartForm: 22-30
- OutsourcedPartForm: 24-32
- BootStrapData: 72-81
- application.properties: 8-9  
- MinInvValidator: 1-end (new file)
- ValidMinInv: 1-end (new file)
- MaxInvValidator: 1-end (new file)
- ValidMaxInv: 1-end (new file)  

*Change:*
- Added min and max fields to InhousePart.java constructor
- Generated getters and setters for min and max
- Modified the sample inventory created in BootStrapData to include min and max for sample parts
- Added min and max columns to Parts table on mainscreen
- Renamed persistent storage to "jdbc:h2:file:~/partGChange"  
- Created validator annotation & class for both min and max values
- Included Annotations for new min/max validators in Part.java 
- Remapped the exception for min/max to display error in form  

## Part H
### Add validation for between or at the maximum and minimum fields. The validation must include the following:
-  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
-  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
-  Display error messages when adding and updating parts if the inventory is greater than the maximum. \

*File Name:* minInvValidator.java | ValidMinInv.java | MaxInvValidator.java | ValidMaxInv.java | ValidEnufParts.java | EnufPartsValidator.java |AddProductController.java
*Line Number:* 
- MinInvValidator: 1-end (new file)
- ValidMinInv: 1-end (new file)
- MaxInvValidator: 1-end (new file)
- ValidMaxInv: 1-end (new file)  
- ValidEnufParts: 20-21 
- EnufPartsValidator: 38-40
- AddProductController: 172-177

*Change:* 
- Handled error messaging for low and high part inventory above in section G. Files still noted above
- Changed EnufPartsValidator to account for the parts minimum inventory requirements, and ensure that adding the product maintains part minimums. Does not add if there are not enough parts
- AddProductController did not decrement part inventory. Updated to decrement part inventory accord to how many products are being added to inventory

## Part I
### Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
*File Name:* PartTest.java 
*Line Number:* 161-173
*Change:*
 - Created unit test for minInv & maxInv
 - Set the respective inventory for partIn
 - assertEquals for equality

## Part J
### Remove the class files for any unused validators in order to clean your code.
*File Name:* DeletePartValidator.java
*Line Number:* Entire file
*Change:*
 - Ran usage search on DeletePartValidator, which came back with no usages
 - Deleted file


