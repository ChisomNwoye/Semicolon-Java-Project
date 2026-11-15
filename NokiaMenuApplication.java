import java.util.Scanner;

public class NokiaMenuApplication {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        String nokiaMenu = """
                Nokia! Connecting People

                Make your selection from the Menu

                Press 1 for Phone book
                Press 2 for Messages
                Press 3 for Chat
                Press 4 for Call register
                Press 5 for Tones
                Press 6 for Settings
                Press 7 for Call divert
                Press 8 for Music
                Press 9 for Games
                Press 10 for Calculator
                Press 11 for Reminders
                Press 12 for Clock
                Press 13 for Profile
                Press 14 for Services
                Press 15 for SIM services
                Press 0 to Exit
                """;

        System.out.println(nokiaMenu);

        System.out.print("Enter your preferred option: ");
        int nokiaMenuOption = inputCollector.nextInt();

        while (nokiaMenuOption < 0 || nokiaMenuOption > 15) {

            System.out.println("Invalid selection!");
            System.out.print("Please select an option between 0 and 15: ");

            nokiaMenuOption = inputCollector.nextInt();
        }

        System.out.println("You selected option: " + nokiaMenuOption);

       
        // MAIN MENU SWITCH
       

        switch (nokiaMenuOption) {

            
            // 1. PHONE BOOK
            

            case 1 -> {

                System.out.println("""

                        PHONE BOOK

                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Copy
                        7. Assign tone
                        8. Send business card
                        9. Options
                        10. Speed dials
                        11. Voice tags
                        0. Back

                        Select an option:
                        """);

                int phoneBookOption = inputCollector.nextInt();

                switch (phoneBookOption) {

                    case 1 -> System.out.println("Search Phone Book");

                    case 2 -> System.out.println("Service Numbers");

                    case 3 -> System.out.println("Add a New Contact");

                    case 4 -> System.out.println("Erase Contact");

                    case 5 -> System.out.println("Edit Contact");

                    case 6 -> System.out.println("Copy Contact");

                    case 7 -> System.out.println("Assign Ringing Tone");

                    case 8 -> System.out.println("Send Business Card");

                    // PHONE BOOK OPTIONS
                    case 9 -> {

                        System.out.println("""
                                PHONE BOOK OPTIONS

                                1. Memory in use
                                2. Type of view
                                3. Memory status
                                0. Back

                                Select an option:
                                """);

                        int phoneBookSettings = inputCollector.nextInt();

                        switch (phoneBookSettings) {

                            case 1 -> System.out.println("Memory in Use");

                            case 2 -> System.out.println("Type of View");

                            case 3 -> System.out.println("Memory Status");

                            case 0 -> System.out.println("Returning...");

                            default -> System.out.println("Invalid Phone Book Option!");
                        }
                    }

                    case 10 -> System.out.println("Speed Dials");

                    case 11 -> System.out.println("Voice Tags");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Phone Book Selection!");
                }
            }


            
            // 2. MESSAGES
          

            case 2 -> {

                System.out.println("""
                        MESSAGES

                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        0. Back

                        Select an option:
                        """);

                int messageOption = inputCollector.nextInt();

                switch (messageOption) {

                    case 1 -> System.out.println("Write Messages");

                    case 2 -> System.out.println("Message Inbox");

                    case 3 -> System.out.println("Message Outbox");

                    case 4 -> System.out.println("Picture Messages");

                    case 5 -> System.out.println("Message Templates");

                    case 6 -> System.out.println("Smileys");

                    // MESSAGE SETTINGS
                    case 7 -> {

                        System.out.println("""
                                MESSAGE SETTINGS

                                1. Set 1
                                2. Common
                                0. Back

                                Select an option:
                                """);

                        int messageSettings = inputCollector.nextInt();

                        switch (messageSettings) {

                            // SET 1
                            case 1 -> {

                                System.out.println("""
                                        SET 1

                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        0. Back

                                        Select an option:
                                        """);

                                int setOneOption = inputCollector.nextInt();

                                switch (setOneOption) {

                                    case 1 -> System.out.println("Message Centre Number");

                                    case 2 -> System.out.println("Messages Sent As");

                                    case 3 -> System.out.println("Message Validity");

                                    case 0 -> System.out.println("Returning to Message Settings");

                                    default -> System.out.println("Invalid Set 1 Option!");
                                }
                            }

                            // COMMON
                            case 2 -> {

                                System.out.println("""
                                        COMMON

                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        0. Back

                                        Select an option:
                                        """);

                                int commonOption = inputCollector.nextInt();

                                switch (commonOption) {

                                    case 1 -> System.out.println("Delivery Reports");

                                    case 2 -> System.out.println("Reply Via Same Centre");

                                    case 3 -> System.out.println("Character Support");

                                    case 0 -> System.out.println("Returning to Message Settings");

                                    default -> System.out.println("Invalid Common Option!");
                                }
                            }

                            case 0 -> System.out.println("Returning to Messages");

                            default -> System.out.println("Invalid Message Settings Option!");
                        }
                    }

                    case 8 -> System.out.println("Info Service");

                    case 9 -> System.out.println("Voice Mailbox Number");

                    case 10 -> System.out.println("Service Command Editor");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Message Selection!");
                }
            }


            
            // 3. CHAT
            

            case 3 -> System.out.println("Welcome to Chat");


          
            // 4. CALL REGISTER
            

            case 4 -> {

                System.out.println("""
                        CALL REGISTER

                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                        0. Back

                        Select an option:
                        """);

                int callRegisterOption = inputCollector.nextInt();

                switch (callRegisterOption) {

                    case 1 -> System.out.println("Missed Calls");

                    case 2 -> System.out.println("Received Calls");

                    case 3 -> System.out.println("Dialled Numbers");

                    case 4 -> System.out.println("Erase Recent Call Lists");

                    // SHOW CALL DURATION
                    case 5 -> {

                        System.out.println("""
                                SHOW CALL DURATION

                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                0. Back

                                Select an option:
                                """);

                        int callDurationOption = inputCollector.nextInt();

                        switch (callDurationOption) {

                            case 1 -> System.out.println("Last Call Duration");

                            case 2 -> System.out.println("All Calls' Duration");

                            case 3 -> System.out.println("Received Calls' Duration");

                            case 4 -> System.out.println("Dialled Calls' Duration");

                            case 5 -> System.out.println("Clear Timers");

                            case 0 -> System.out.println("Returning to Call Register");

                            default -> System.out.println("Invalid Call Duration Option!");
                        }
                    }

                    // SHOW CALL COSTS
                    case 6 -> {

                        System.out.println("""
                                SHOW CALL COSTS

                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                0. Back

                                Select an option:
                                """);

                        int callCostOption = inputCollector.nextInt();

                        switch (callCostOption) {

                            case 1 -> System.out.println("Last Call Cost");

                            case 2 -> System.out.println("All Calls' Cost");

                            case 3 -> System.out.println("Clear Counters");

                            case 0 -> System.out.println("Returning to Call Register");

                            default -> System.out.println("Invalid Call Cost Option!");
                        }
                    }

                    // CALL COST SETTINGS
                    case 7 -> {

                        System.out.println("""
                                CALL COST SETTINGS

                                1. Call cost limit
                                2. Show costs in
                                0. Back

                                Select an option:
                                """);

                        int callCostSettings = inputCollector.nextInt();

                        switch (callCostSettings) {

                            case 1 -> System.out.println("Call Cost Limit");

                            case 2 -> System.out.println("Show Costs In");

                            case 0 -> System.out.println("Returning to Call Register");

                            default -> System.out.println("Invalid Call Cost Settings Option!");
                        }
                    }

                    case 8 -> System.out.println("Prepaid Credit");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Call Register Selection!");
                }
            }


            
            // 5. TONES
            

            case 5 -> {

                System.out.println("""
                        TONES

                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Message alert tone
                        5. Keypad tones
                        6. Warning tones
                        7. Vibrating alert
                        8. Screen saver
                        0. Back

                        Select an option:
                        """);

                int tonesOption = inputCollector.nextInt();

                switch (tonesOption) {

                    case 1 -> System.out.println("Ringing Tone");

                    case 2 -> System.out.println("Ringing Volume");

                    case 3 -> System.out.println("Incoming Call Alert");

                    case 4 -> System.out.println("Message Alert Tone");

                    case 5 -> System.out.println("Keypad Tones");

                    case 6 -> System.out.println("Warning Tones");

                    case 7 -> System.out.println("Vibrating Alert");

                    case 8 -> System.out.println("Screen Saver");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Tones Selection!");
                }
            }


            
            // 6. SETTINGS
            

            case 6 -> {

                System.out.println("""
                        SETTINGS

                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        0. Back

                        Select an option:
                        """);

                int settingsOption = inputCollector.nextInt();

                switch (settingsOption) {

                    // CALL SETTINGS
                    case 1 -> {

                        System.out.println("""
                                CALL SETTINGS

                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                0. Back

                                Select an option:
                                """);

                        int callSettingsOption = inputCollector.nextInt();

                        switch (callSettingsOption) {

                            case 1 -> System.out.println("Automatic Redial");

                            case 2 -> System.out.println("Speed Dialling");

                            case 3 -> System.out.println("Call Waiting Options");

                            case 4 -> System.out.println("Own Number Sending");

                            case 5 -> System.out.println("Phone Line in Use");

                            case 6 -> System.out.println("Automatic Answer");

                            case 0 -> System.out.println("Returning to Settings");

                            default -> System.out.println("Invalid Call Settings Option!");
                        }
                    }

                    // PHONE SETTINGS
                    case 2 -> {

                        System.out.println("""
                                PHONE SETTINGS

                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Confirm SIM service actions
                                0. Back

                                Select an option:
                                """);

                        int phoneSettingsOption = inputCollector.nextInt();

                        switch (phoneSettingsOption) {

                            case 1 -> System.out.println("Language");

                            case 2 -> System.out.println("Cell Info Display");

                            case 3 -> System.out.println("Welcome Note");

                            case 4 -> System.out.println("Network Selection");

                            case 5 -> System.out.println("Confirm SIM Service Actions");

                            case 0 -> System.out.println("Returning to Settings");

                            default -> System.out.println("Invalid Phone Settings Option!");
                        }
                    }

                    // SECURITY SETTINGS
                    case 3 -> {

                        System.out.println("""
                                SECURITY SETTINGS

                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Security level
                                6. Change access codes
                                0. Back

                                Select an option:
                                """);

                        int securitySettingsOption = inputCollector.nextInt();

                        switch (securitySettingsOption) {

                            case 1 -> System.out.println("PIN Code Request");

                            case 2 -> System.out.println("Call Barring Service");

                            case 3 -> System.out.println("Fixed Dialling");

                            case 4 -> System.out.println("Closed User Group");

                            case 5 -> System.out.println("Security Level");

                            case 6 -> System.out.println("Change Access Codes");

                            case 0 -> System.out.println("Returning to Settings");

                            default -> System.out.println("Invalid Security Settings Option!");
                        }
                    }

                    case 4 -> System.out.println("Restore Factory Settings");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Settings Selection!");
                }
            }


            
            // 7. CALL DIVERT
            

            case 7 -> System.out.println("Welcome to Call Divert");


            
            // 8. MUSIC
            

            case 8 -> {

                System.out.println("""
                        MUSIC

                        1. Music player
                        2. Radio
                        3. Recorder
                        4. Track list
                        0. Back

                        Select an option:
                        """);

                int musicOption = inputCollector.nextInt();

                switch (musicOption) {

                    case 1 -> System.out.println("Music Player");

                    case 2 -> System.out.println("Radio");

                    case 3 -> System.out.println("Recorder");

                    case 4 -> System.out.println("Track List");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Music Selection!");
                }
            }


            
            // 9. GAMES
            

            case 9 -> System.out.println("Welcome to Games");


            
            // 10. CALCULATOR
            

            case 10 -> System.out.println("Welcome to Calculator");


            
            // 11. REMINDERS
            

            case 11 -> System.out.println("Welcome to Reminders");


            
            // 12. CLOCK
            

            case 12 -> {

                System.out.println("""
                        CLOCK

                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        0. Back

                        Select an option:
                        """);

                int clockOption = inputCollector.nextInt();

                switch (clockOption) {

                    case 1 -> System.out.println("Alarm Clock");

                    case 2 -> System.out.println("Clock Settings");

                    case 3 -> System.out.println("Date Setting");

                    case 4 -> System.out.println("Stopwatch");

                    case 5 -> System.out.println("Countdown Timer");

                    case 6 -> System.out.println("Auto Update of Date and Time");

                    case 0 -> System.out.println("Returning to Main Menu");

                    default -> System.out.println("Invalid Clock Selection!");
                }
            }


            
            // 13. PROFILES
            

            case 13 -> System.out.println("Welcome to Profiles");


            
            // 14. SERVICES
           

            case 14 -> System.out.println("Welcome to Services");


            
            // 15. SIM SERVICES
           

            case 15 -> System.out.println("Welcome to SIM Services");


            
            // 0. EXIT
            

            case 0 -> System.out.println("Thank you for using Nokia!");

            default -> System.out.println("Invalid Main Menu Selection!");
        }
    }
}
