# ShopKepperProject



Comparison and Contrast:
* The non-concurrent version of the program runs sequentially, where each step is executed in order. It calculates and displays the results for each time slot one by one.
* The concurrent version of the program uses threads for the three users. Each user is represented by a separate thread, allowing them to eat pancakes simultaneously. This version can be more efficient as it utilizes parallelism.
* In the non-concurrent version, the actions of the shopkeeper, pancake making, and user eating are not concurrent. Users eat pancakes one after another within a time slot.
* The concurrent version allows users to eat pancakes simultaneously, leading to a more realistic simulation of multiple users in a real scenario.
* The concurrent version requires careful synchronization to ensure thread safety, especially when updating shared variables like totalPancakesEaten and totalOrdersNotMet.
* Both versions of the program use random numbers to simulate various aspects such as pancake orders, pancake making, and eating times.
Observations:
* The non-concurrent version is simpler to understand and implement since it avoids dealing with thread synchronization issues.
* The concurrent version provides a more realistic simulation of multiple users eating simultaneously, which can lead to more efficient resource utilization.
* In the concurrent version, you need to ensure proper synchronization to avoid data races and ensure correct results.
* The concurrent version may have more complex debugging and maintenance requirements due to the potential for race conditions and synchronization issues.
* When dealing with a small number of users and pancakes, the non-concurrent version may be sufficient and easier to manage.
* The choice between the two versions depends on the specific requirements of the simulation and the desired level of realism and complexity.
