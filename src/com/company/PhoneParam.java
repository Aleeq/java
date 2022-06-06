package com.company;

public class PhoneParam {
    class core {
        String core = "Switched off";

        public void notworking() {
            core = "not working";
            System.out.println(core);
        }

        public void working() {
            core = "working";
            System.out.println(core);

        }
    }

        class memory {


            String memory = "Run";

            public void working() {
                memory = "working";
                System.out.println(memory);

            }

            public void notrun() {
                memory = "not working";
                System.out.println(memory);


            }
        }

        core intelcore = new core();
        memory ram = new memory();

    }

