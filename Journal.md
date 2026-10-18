## Phase 3

From what I understand, the boolean hook gives subclasses the choice to run an extra step without making it required. An abstract method has to be implemented, but the hook already has a default behavior. In this case, TruckReport returns true so it runs the maintenance check, while BikeReport uses false and skips it.