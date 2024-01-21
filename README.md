
#Game Catalog and Purchase 


  1.Single Responsibility Principle :
    ->The Game class includes the properties of a game (title, genre, and price).
    ->MutiPlayerGame and SinglePlayerGame subclasses extend Game class for specialized game types.
    ->GameCatalog interface handles the responsibility of displaying the catalog and purchasing a game.
    -> The PaymentMethod interface focuses on the responsibility of processing payments.
    ->Each class and interface has a clear, single responsibility.

2. Open/Closed Principle :
  ->The Game class is closed for modification but open for extension, demonstrated by the creation of MutiPlayerGame and SinglePlayerGame subclasses.
  ->Allowing extension without modifying existing code.

3. Liskov's Substitution Principle:
 ->MutiPlayerGame and SinglePlayerGame are substitutable for instances of the base class  Game.

4. Interface Segregation Principle :
 ->The PaymentMethod interface includes only methods necessary for payment processing.
 ->The code provides a specific interface for payment.

5. Dependency Inversion Principle:
 ->The  CatalogServices class depends on abstractions  (GameCatalog and  PaymentMethod) rather than concrete implementations.
 ->CreditCardPayment and  PayPalPayment implement the  PaymentMethod interface.
 ->The code relies on abstractions and injecting dependencies.
