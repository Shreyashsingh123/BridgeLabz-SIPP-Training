class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    
    Task(int taskId, String taskName, int priority, String dueDate) {
    this.taskId = taskId;
    this.taskName = taskName;
    this.priority = priority;
    this.dueDate = dueDate;
    this.next = null;
    }
    }
    
    class TaskScheduler {
    Task head = null;
    Task current = null;
    
    void addAtBeginning(Task newTask) {
    if (head == null) {
    head = newTask;
    head.next = head;
    } else {
    Task temp = head;
    while (temp.next != head) {
    temp = temp.next;
    }
    newTask.next = head;
    head = newTask;
    temp.next = head;
    }
    }
    
    void addAtEnd(Task newTask) {
    if (head == null) {
    head = newTask;
    head.next = head;
    } else {
    Task temp = head;
    while (temp.next != head) {
    temp = temp.next;
    }
    temp.next = newTask;
    newTask.next = head;
    }
    }
    
    void addAtPosition(Task newTask, int position) {
    if (position <= 1 || head == null) {
    addAtBeginning(newTask);
    return;
    }
    Task temp = head;
    int count = 1;
    while (count < position - 1 && temp.next != head) {
    temp = temp.next;
    count++;
    }
    newTask.next = temp.next;
    temp.next = newTask;
    }
    
    void removeById(int taskId) {
    if (head == null) return;
    Task temp = head;
    Task prev = null;
    do {
    if (temp.taskId == taskId) {
    if (temp == head) {
    if (head.next == head) {
    head = null;
    return;
    }
    Task last = head;
    while (last.next != head) {
    last = last.next;
    }
    head = head.next;
    last.next = head;
    } else {
    prev.next = temp.next;
    }
    System.out.println("Task ID " + taskId + " removed.");
    return;
    }
    prev = temp;
    temp = temp.next;
    } while (temp != head);
    System.out.println("Task ID not found.");
    }
    
    void viewCurrentAndMoveNext() {
    if (current == null) current = head;
    if (current == null) {
    System.out.println("No tasks available.");
    return;
    }
    System.out.println("Current Task: ID=" + current.taskId + ", Name=" + current.taskName);
    current = current.next;
    }
    
    void displayAllTasks() {
    if (head == null) {
    System.out.println("No tasks to display.");
    return;
    }
    Task temp = head;
    do {
    System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
    temp = temp.next;
    } while (temp != head);
    }
    
    void searchByPriority(int priority) {
    if (head == null) {
    System.out.println("No tasks available.");
    return;
    }
    Task temp = head;
    boolean found = false;
    do {
    if (temp.priority == priority) {
    System.out.println("Found Task: ID=" + temp.taskId + ", Name=" + temp.taskName);
    found = true;
    }
    temp = temp.next;
    } while (temp != head);
    if (!found) {
    System.out.println("No tasks with priority " + priority);
    }
    }
    }
    public class TaskSceduler {
        public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        
        scheduler.addAtEnd(new Task(1, "Task A", 2, "2025-07-08"));
        scheduler.addAtBeginning(new Task(2, "Task B", 1, "2025-07-07"));
        scheduler.addAtPosition(new Task(3, "Task C", 3, "2025-07-09"), 2);
        
        System.out.println("\nAll Tasks:");
        scheduler.displayAllTasks();
        
        System.out.println("\nSearching for Priority 1:");
        scheduler.searchByPriority(1);
        
        System.out.println("\nViewing Tasks:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        
        System.out.println("\nRemoving Task ID 2:");
        scheduler.removeById(2);
        scheduler.displayAllTasks();
        }
        }
            