
public class RingBuffer {
	    private double[] ringBuffer;          // items in the buffer
	    private int first;            // index for the next dequeue or peek (ringBuffer[first])
	    private int last;             // index for the next enqueue (ringBuffer[last-1])
	    private int size;             // number of items in the buffer

	    // create an empty buffer, with given max capacity
	    public RingBuffer(int capacity) {
	        ringBuffer = new double[capacity];
	    }

	    // return number of items currently in the buffer
	    public int size() {
	        return size;
	    }

	    // is the buffer empty (size equals zero)?
	    public boolean isEmpty() {
	        // YOUR CODE HERE
	        return size == 0; 
	    }

	    // is the buffer full (size equals array capacity)?
	    public boolean isFull() {
	        // YOUR CODE HERE
	        return size == ringBuffer.length; 
	    }

	    // add item x to the end
	    public void enqueue(double x) {
	        if (isFull()) {
	            throw new RuntimeException("Ring buffer overflow");
	        }
	        // YOUR CODE HERE
	        else {
	        	size++;
	        	ringBuffer[last] = x;
	        	last++;
	        	if(last == ringBuffer.length) {
	        		last = 0;
	        	}
	        }
	    }

	    // delete and return item from the front
	    public double dequeue() {
	        if (isEmpty()) {
	            throw new RuntimeException("Ring buffer underflow");
	        }
	        // YOUR CODE HERE
	        else {
	        	size--;
	        	double current = ringBuffer[first];
	        	first ++;
	        	if(first == ringBuffer.length) {
	        		first = 0;
	        	}
	        	return current;
	        }
	 
	    }
	    // return (but do not delete) item from the front
	    public double peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Ring buffer underflow");
	        }
	        // YOUR CODE HERE
	        return ringBuffer[first]; // dummy return statement so the code compiles
	    }

	    // a simple test of the constructor and methods in RingBuffer
	    public static void main(String[] args) {
	        int N = Integer.parseInt(args[0]);
	        RingBuffer buffer = new RingBuffer(N);
	        for (int i = 1; i <= N; i++) {
	            buffer.enqueue(i);
	        }
	        double t = buffer.dequeue();
	        buffer.enqueue(t);
	        System.out.println("Size after wrap-around is " + buffer.size());
	        while (buffer.size() >= 2) {
	            double x = buffer.dequeue();
	            double y = buffer.dequeue();
	            buffer.enqueue(x + y);
	        }
	        System.out.println(buffer.peek());
	    }

	}


