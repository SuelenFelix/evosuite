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

public class GameNN_show_5605060106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4797;

    public GameNN_show_5605060106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4797 = newInstance(Class.forName("game.GameNN"));
        setField(term4797, term4797.getClass(), "birds", null);
        setField(term4797, term4797.getClass(), "bottomPanel", null);
        setField(term4797, term4797.getClass(), "pipesController", null);
        setField(term4797, term4797.getClass(), "collisionDetector", null);
        setBooleanField(term4797, term4797.getClass(), "collision", false);
        setField(term4797, term4797.getClass(), "font", null);
        setField(term4797, term4797.getClass(), "population", null);
        setField(term4797, term4797.getClass(), "genomeFitnessMap", null);
        setField(term4797, term4797.getClass(), "nnGenomeMap", null);
        setField(term4797, term4797.getClass(), "birdNNMap", null);
        setLongField(term4797, term4797.getClass(), "allSteps", 0L);
        setIntField(term4797, term4797.getClass(), "attempt", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.GameNN");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term4797, args);
    }

};


