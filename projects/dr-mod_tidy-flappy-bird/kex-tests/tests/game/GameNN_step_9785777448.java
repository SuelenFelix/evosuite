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

public class GameNN_step_9785777448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5971;

    public GameNN_step_9785777448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5971 = newInstance(Class.forName("game.GameNN"));
        setField(term5971, term5971.getClass(), "birds", null);
        setField(term5971, term5971.getClass(), "bottomPanel", null);
        setField(term5971, term5971.getClass(), "pipesController", null);
        setField(term5971, term5971.getClass(), "collisionDetector", null);
        setBooleanField(term5971, term5971.getClass(), "collision", false);
        setField(term5971, term5971.getClass(), "font", null);
        setField(term5971, term5971.getClass(), "population", null);
        setField(term5971, term5971.getClass(), "genomeFitnessMap", null);
        setField(term5971, term5971.getClass(), "nnGenomeMap", null);
        setField(term5971, term5971.getClass(), "birdNNMap", null);
        setLongField(term5971, term5971.getClass(), "allSteps", 0L);
        setIntField(term5971, term5971.getClass(), "attempt", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term5971, args);
    }

};


