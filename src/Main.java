public class Main {
    public static void main(String[] args) {
//Задача.1
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Install the Android version of the app using the link.");
            } else {
                System.out.println("Install the iOS version of the app using the link.");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Install the lite Android version of the app using the link.");
            } else {
                System.out.println("Install the lite iOS version of the app using the link.");
            }
        }
//Задача.2

//Задача.3
        int year = 2024;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year, because this concept was introduced in 1584.");
        }
//Задача.4
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = deliveryDays + 1;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 2;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else {
            System.out.println("You are outside the delivery radius, delivery over a distance of more than 100km is not carried out.");
        }
//Задача.5
        char monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Choose a number from 1 to 12");
        }
//Задача.6

//Задача.7
//Задача.8
    }
    }







