# multithreading_parallel_holczer

# see the ppts

# Volatile:
  * move data to ram(main memory) instead of keeping it on the cpu cache. If two threads run on same cache and data is stored in cache then it access from cache and it will be faster, with one cpu
  * if there are 2 cpus then if a tread stores data on one of the cpu cache the othr thread running on another core, can't access cached data, hence use volatile
# Semaphore & Mutex
 - semaphore ->
    * allows multiple program threads to access the finite instances of resourced(not just a single resource)(a library with rooms, with thr front office desk(semaphore). Each student needs to ask at dest for the room, once a student finished using the room then notify the desk)
    * the process or threads blocks itself if no resource is free till the count of the semaphore become greater thatn 0
 - mutex
    * allows multiple program threads to access a single shared resource but one at a time.(synchronized with class level or object level locks)
    * if the lock is already acquired by another thread or process then the thread will wait until the mutex object gets unlocked
    * mutex is very similar to binary semaphore
