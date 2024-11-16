# razorpay-integration-with-springboot
In  this project we are integrating Razorpay Payments Gateway with Spring Boot application.

## Tech stack
- Java, Springboot (for backend code)
- Javascript (Thymeleaf as frontend)
- Bootstrap (to beautify our orders page)
- MySQL DB (to save transaction details of user)

## How to run this program:
- Start you MySQL database (either installing in your system or spinning docker).
- Create database in MySQL with name : razorpay-test-db
- Now Create a Razorpay account, set up your KYC and business detail.
  Invoke 'Test Mode' from drop-down menu at top of navbar of razarpay account, for testing. 
  (Do not select 'LIVE Mode').Go to Accounts & Seetings -> API Keys. Generate your 
  key-id, key-secret, razaorpay-account-name. These will be used in code.

  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/keyid.png)

- Provide your razorpay generated key-id & key-secret in application.properties file. 
  Set up your name & key-id in order.html file (will be used by javascript).
- Run your spring boot application.
- Go to browser and hit URL : http://localhost:8080/orders

## Now you'll able to see. (Demo of this program)
- our orders page
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/1.png)

- payment option page by razarpay
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/2.png)

- razorpay demo bank page to make payment success or failure by razorpay
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/3.png)

- payment success page (our success.html)
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/4.png)

- after payment got success, our orders page will reflec that (you can verify your DB as well)
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/5.png)

- razorpay account transaction dashboard
  ![orders page](https://github.com/AadityaUoHyd/razorpay-integration-with-springboot/blob/main/images/transaction.png)
