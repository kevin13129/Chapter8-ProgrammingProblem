# Journal
## Phase 2

I noticed that VehicleReport controls the order of the steps for both the truck and bike. The subclasses only handle their own formatting. I think inheritance made this easier because I didn't have to rewrite the same methods for both vehicles. The only tricky part was understanding how the parent class calls the methods from the subclasses.