import java.util.*;

class User {
int id;
String name;
int age;
List<Integer> friends;
User next;
User(int id, String name, int age) {
this.id = id;
this.name = name;
this.age = age;
this.friends = new ArrayList<>();
this.next = null;
}
}

class SocialMedia {
User head;

void addUser(int id, String name, int age) {
User newUser = new User(id, name, age);
if (head == null) {
head = newUser;
return;
}
User temp = head;
while (temp.next != null) temp = temp.next;
temp.next = newUser;
}

User findUserById(int id) {
User temp = head;
while (temp != null) {
if (temp.id == id) return temp;
temp = temp.next;
}
return null;
}

User findUserByName(String name) {
User temp = head;
while (temp != null) {
if (temp.name.equalsIgnoreCase(name)) return temp;
temp = temp.next;
}
return null;
}

void addFriend(int id1, int id2) {
User u1 = findUserById(id1);
User u2 = findUserById(id2);
if (u1 != null && u2 != null && id1 != id2) {
if (!u1.friends.contains(id2)) u1.friends.add(id2);
if (!u2.friends.contains(id1)) u2.friends.add(id1);
}
}

void removeFriend(int id1, int id2) {
User u1 = findUserById(id1);
User u2 = findUserById(id2);
if (u1 != null && u2 != null) {
u1.friends.remove(Integer.valueOf(id2));
u2.friends.remove(Integer.valueOf(id1));
}
}

void showFriends(int id) {
User user = findUserById(id);
if (user != null) {
System.out.println("Friends of " + user.name + ":");
for (int fid : user.friends) {
User f = findUserById(fid);
if (f != null) System.out.println(f.name + " (ID: " + f.id + ")");
}
}
}

void mutualFriends(int id1, int id2) {
User u1 = findUserById(id1);
User u2 = findUserById(id2);
if (u1 != null && u2 != null) {
System.out.println("Mutual friends:");
for (int f1 : u1.friends) {
if (u2.friends.contains(f1)) {
User mf = findUserById(f1);
if (mf != null) System.out.println(mf.name + " (ID: " + mf.id + ")");
}
}
}
}

void countAllFriends() {
User temp = head;
while (temp != null) {
System.out.println(temp.name + " has " + temp.friends.size() + " friends");
temp = temp.next;
}
}
}

public class SocialMediaConnections {
public static void main(String[] args) {
SocialMedia sm = new SocialMedia();
sm.addUser(1, "ram", 25);
sm.addUser(2, "harsh", 26);
sm.addUser(3, "shyam", 24);
sm.addUser(4, "vikash", 23);
sm.addFriend(1, 2);
sm.addFriend(1, 3);
sm.addFriend(2, 3);
sm.addFriend(2, 4);
sm.showFriends(2);
sm.mutualFriends(1, 2);
User u = sm.findUserByName("shyam");
if (u != null) System.out.println("Found: " + u.name + ", ID: " + u.id);
sm.removeFriend(1, 2);
System.out.println("After removing friendship between ram and harsh:");
sm.showFriends(1);
sm.showFriends(2);
sm.countAllFriends();
}
}

