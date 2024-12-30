package ArrayLCWD;

class ArrayADTImpl implements ArrayADT {

    // array: to store data
    private int[] array;
    // size: size of array
    private int index;
    // capacity: capacity of array
    private int size;

    // Constructor
    public ArrayADTImpl(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    // insert the data to array
    @Override
    public void insert(int value) {
        // check if array is full
        if (index == this.size) {
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }

    // delete
    @Override
    public void delete(int deleteIndex) {

        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = deleteIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;

    }
    // search the element and result the index value

    @Override
    public int search(int value) {
        int indexResult = -1;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    // get the data
    @Override
    public int get(int getIndex) {
        if (getIndex < 0 || getIndex >= this.index) {
            System.out.println("Invalid index");
            return -1;
        }
        return array[getIndex];
    }

    // traverse
    @Override
    public void traverse() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.println();
    }

    // public void update
    @Override
    public void update(int updateIndex, int value) {
        if (updateIndex < 0 || updateIndex >= index) {
            System.out.println("Invalid Index");
            return;
        }
        array[updateIndex] = value;
    }

    // get the size
    @Override
    public int getSize() {
        return this.index;
    }

}




/*
 // Insert value and increment index
        array[index] = value;
        index++;
ChatGPT said:
ChatGPT
Yeh do lines ka kaam array mein value daalne aur index ko update karne ke liye hai. Samajhte hain ek-ek line ko detail mein:

1. array[index] = value;
Kya karta hai?
Yeh line specified index par value ko store karti hai.
Maan lo:

Array ka current status hai: [10, 20, _, _, _]
index ki value 2 hai (yani third position khaali hai).
Tum insert(30) karte ho.
Toh:

java
Copy code
array[2] = 30;
Ab array ka status hoga: [10, 20, 30, _, _].

2. index++;
Kya karta hai?
Yeh line index ko ek se increment (badha) karti hai.

Jab index badhega, tab agla element agle khaali position par insert hoga.
Iska matlab hai ki agla insert call array[3] par value daalega.
Pichle example mein:

Pehle index = 2 tha.
array[2] = 30 ke baad, index++ se index = 3 ho gaya.
Pura Flow:
Pehle Call:
Tum insert(30) karte ho.

array[2] = 30 karta hai.
Phir index++ karta hai (index = 3).
Agla Call:
Tum insert(40) karte ho.

array[3] = 40 hota hai.
index++ se index = 4 hota hai.
Iss tarah har nayi value apne correct position par jaati hai, aur index ensure karta hai ki agla position khaali ho.

*/







