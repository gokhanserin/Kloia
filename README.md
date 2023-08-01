# Kloia
Test Automation Case Study-1 (Web)
Task-1
● Navigate to https://www.n11.com/
● Log in with facebook
● Verify successful login

Task-2
● Navigate to https://www.n11.com/
● Navigate to Perfume & Deodorant under the Cosmetic & Personal Care tab. (Do not
use URL navigation)(Kozmetik & Kişisel Bakım/Parfüm & Deodorant)
● Search for ‘Lacoste’ in Brand filter
● Select ‘Lacoste’
● Click 7th product on the search result page
● Add product to the ‘Favorites’ (Favorilerim)
● Navigate to Favorites (Favorilerim)
● Verify the product title is the same as with the product details page

Task-3
● Navigate to https://www.n11.com/
● Write all the links at the footer to the text file (About us, help, etc)
● Click Brands (Markalar) at the footer
● Verify the footer links with the text file

Notes
● The project should be shared in a git repository.
● Selenium implicit wait should not be used.
● Page Object Model (POM) approach should be used.
● Xpath is forbidden, custom css can be used.
● You can use any tool stack except record & play. We prefer Python-Behave-Selenium.
● Each execution should generate a HTML report.
● Project structure can be suitable for different browsers.
● Readme.md file should be added.
● Project can be run on the Command line.

Test Automation Case Study-2 (API)
BaseURI: https://petstore.swagger.io/v2
Task-1
● Set the Content-type=application/json
● Set path “pet”
● Create one pet with the following JSON model
{
    "category": {
        "id": 0,
        "name": "Pets"
    },
    "name": "Scout",
    "photoUrls": [
        "scout.png"
    ],
    "tags": [
        {
            "id": 0,
            "name": "pet-dog"
        }
    ],
    "status": "available"
}

● Verify the below requested in the response
- Status code should be 200
- Response should has an id
- Created name should be equal to the posted name
- Content-type should be application/json
- Response header should has a date value

Task-2
● Set the Content-type=application/json
● Set path “pet”
● Set id as a path parameters (You can use the id from the response of the Task-1)
● Retrieve the pet information that you requested
● Verify the response
- Status code should be 200
- Response body should be equal to the Task-1’s response body
- Content-type should be application/json
- Response header should has a date value
  
Task-3
● Set the Content-type=application/json
● Set path “pet”
● Set id as a path parameters (You can use the id from the response of the Task-2)
● Delete the pet that you searched
● Verify the response
- Status code should be 200
- Content-type should be application/json
- Response body message should equal to id
- Message should be equal to “unknown”
  
Notes:
● Swagger: https://petstore.swagger.io/
● The project should be shared in a git repository.
● Any programming language and framework can be used.
● Each execution should generate a HTML report.
● Readme.md file should be added.
● Project can be run on the Command line.

  
