package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("PROBLEM 1");
        StreamSources.intNumbersStream().forEach(number -> System.out.println(number));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("PROBLEM 2");
        StreamSources.intNumbersStream().filter(num -> num < 5).forEach(number -> System.out.println(number));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("PROBLEM 3");
        StreamSources.intNumbersStream().filter(num -> num > 5)
                .skip(1)
                .limit(2)
                .forEach(num -> System.out.println(num));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("PROBLEM 4");
        StreamSources.intNumbersStream()
                .filter(num -> num > 5)
                .findFirst().ifPresentOrElse(
                        num -> System.out.println(num),
                        () -> System.out.println(-1)
                );

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("PROBLEM 5");
        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("PROBLEM 6");
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(num -> num == user.getId()))
                .forEach(user -> System.out.println(user.getFirstName()));
    }

}
