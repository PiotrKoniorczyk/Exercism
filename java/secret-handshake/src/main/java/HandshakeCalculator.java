import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> secretHandshake = new ArrayList<Signal>();
        boolean reverse = false;
        if((number & 16) == 16){
            reverse = true;
        }
        if((number & 1) == 1){
            secretHandshake.add(Signal.WINK);
        }
        if((number & 2) == 2){
            secretHandshake.add(Signal.DOUBLE_BLINK);
        }
        if((number & 4) == 4){
            secretHandshake.add(Signal.CLOSE_YOUR_EYES);
        }
        if((number & 8) == 8){
            secretHandshake.add(Signal.JUMP);
        }
        if(reverse){
            Collections.reverse(secretHandshake);

        }


        return secretHandshake;
    }
    }


