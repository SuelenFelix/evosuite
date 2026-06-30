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

public class GameNN_shouldMakeAnAction_30515399612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8447;

    public GameNN_shouldMakeAnAction_30515399612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8447 = newInstance(Class.forName("game.GameNN"));
        setField(term8447, term8447.getClass(), "birds", null);
        setField(term8447, term8447.getClass(), "bottomPanel", null);
        setField(term8447, term8447.getClass(), "pipesController", null);
        setField(term8447, term8447.getClass(), "collisionDetector", null);
        setBooleanField(term8447, term8447.getClass(), "collision", false);
        setField(term8447, term8447.getClass(), "font", null);
        setField(term8447, term8447.getClass(), "population", null);
        setField(term8447, term8447.getClass(), "genomeFitnessMap", null);
        setField(term8447, term8447.getClass(), "nnGenomeMap", null);
        setField(term8447, term8447.getClass(), "birdNNMap", null);
        setLongField(term8447, term8447.getClass(), "allSteps", 0L);
        setIntField(term8447, term8447.getClass(), "attempt", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Bird");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "shouldMakeAnAction", argTypes, term8447, args);
    }

};


