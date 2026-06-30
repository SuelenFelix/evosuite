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
import java.lang.Double;

public class GameNN_saveFitness_186864273210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7215;
     Object term7219;

    public GameNN_saveFitness_186864273210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7215 = newInstance(Class.forName("game.GameNN"));
        setField(term7215, term7215.getClass(), "birds", null);
        setField(term7215, term7215.getClass(), "bottomPanel", null);
        setField(term7215, term7215.getClass(), "pipesController", null);
        setField(term7215, term7215.getClass(), "collisionDetector", null);
        setBooleanField(term7215, term7215.getClass(), "collision", false);
        setField(term7215, term7215.getClass(), "font", null);
        setField(term7215, term7215.getClass(), "population", null);
        setField(term7215, term7215.getClass(), "genomeFitnessMap", null);
        setField(term7215, term7215.getClass(), "nnGenomeMap", null);
        setField(term7215, term7215.getClass(), "birdNNMap", null);
        setLongField(term7215, term7215.getClass(), "allSteps", 0L);
        setIntField(term7215, term7215.getClass(), "attempt", 0);
        term7219 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Bird");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7219;
        callMethod(klass, "saveFitness", argTypes, term7215, args);
    }

};


