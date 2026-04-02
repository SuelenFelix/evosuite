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

public class GameNN_reCreateGame_18417609972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;

    public GameNN_reCreateGame_18417609972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2521 = newInstance(Class.forName("game.GameNN"));
        setField(term2521, term2521.getClass(), "birds", null);
        setField(term2521, term2521.getClass(), "bottomPanel", null);
        setField(term2521, term2521.getClass(), "pipesController", null);
        setField(term2521, term2521.getClass(), "collisionDetector", null);
        setBooleanField(term2521, term2521.getClass(), "collision", false);
        setField(term2521, term2521.getClass(), "font", null);
        setField(term2521, term2521.getClass(), "population", null);
        setField(term2521, term2521.getClass(), "genomeFitnessMap", null);
        setField(term2521, term2521.getClass(), "nnGenomeMap", null);
        setField(term2521, term2521.getClass(), "birdNNMap", null);
        setLongField(term2521, term2521.getClass(), "allSteps", 0L);
        setIntField(term2521, term2521.getClass(), "attempt", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reCreateGame", argTypes, term2521, args);
    }

};


