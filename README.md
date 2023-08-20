# Assessment 2 : ShopKepperProject

# Comparison and Contrast

## Non-Concurrent Version vs. Concurrent Version

### Non-Concurrent Version
- The non-concurrent version of the program runs sequentially, executing each step in order. It calculates and displays results for each time slot sequentially.
- Actions such as the shopkeeper's tasks, pancake making, and user eating are not concurrent. Users eat pancakes one after another within a time slot.

### Concurrent Version
- The concurrent version of the program utilizes threads for the three users. Each user operates within a separate thread, enabling them to eat pancakes simultaneously. This version can leverage parallelism for improved efficiency.
- In the concurrent version, users eat pancakes concurrently, resulting in a more realistic simulation of multiple users in a real-world scenario.
- Careful synchronization is required in the concurrent version to ensure thread safety, especially when updating shared variables like `totalPancakesEaten` and `totalOrdersNotMet`.

## Observations

### Non-Concurrent Version
- The non-concurrent version is simpler to understand and implement due to the absence of thread synchronization complexities.
- It may be suitable when dealing with a small number of users and pancakes, offering ease of management.

### Concurrent Version
- The concurrent version offers a more realistic simulation of multiple users eating simultaneously, potentially leading to more efficient resource utilization.
- Proper synchronization is essential to avoid data races and ensure accurate results in the concurrent version.
- Debugging and maintaining the concurrent version can be more complex due to the potential for race conditions and synchronization issues.

### Considerations
- The choice between the two versions depends on the simulation's specific requirements, desired level of realism, and desired complexity.

---
*Both versions use random numbers to simulate various aspects, including pancake orders, pancake making, and eating times.*
