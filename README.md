# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
There is one arraylist for Dog. It also creates three instances of Dog class. The dogs contain both names and legs number. It also creates a comparator.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
It uses the compare method that we implemented.

Collections.sort(dogs, new Comparator<Animal>(){
@Override
public int compare(Animal a, Animal b){
return a.getLegs() - b.getLegs();
}
});
