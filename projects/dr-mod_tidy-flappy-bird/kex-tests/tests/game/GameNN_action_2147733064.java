package game;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameNN_action_2147733064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3652;

    public GameNN_action_2147733064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3652 = newInstance(Class.forName("game.GameNN"));
        setField(term3652, term3652.getClass(), "birds", null);
        setField(term3652, term3652.getClass(), "bottomPanel", null);
        setField(term3652, term3652.getClass(), "pipesController", null);
        setField(term3652, term3652.getClass(), "collisionDetector", null);
        setBooleanField(term3652, term3652.getClass(), "collision", false);
        setField(term3652, term3652.getClass(), "font", null);
        setField(term3652, term3652.getClass(), "population", null);
        setField(term3652, term3652.getClass(), "genomeFitnessMap", null);
        setField(term3652, term3652.getClass(), "nnGenomeMap", null);
        setField(term3652, term3652.getClass(), "birdNNMap", null);
        setLongField(term3652, term3652.getClass(), "allSteps", 0L);
        setIntField(term3652, term3652.getClass(), "attempt", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "action", argTypes, term3652, args);
    }

};


