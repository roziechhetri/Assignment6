
    class Rectangle{

        private int length;

        private int width;

        Rectangle(){

            this.length=0; // assuming default length=0

            this.width=0; // assuming default width=0

        }

        Rectangle(int length, int width){

            this.length=length;

            this.width=width;

        }Rectangle(int length){

            this.length=length;

            this.width=length;

        }

        int area(){

            return length*width;

        }

    }

