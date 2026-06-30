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

public class Game_show_175180016610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1363;

    public Game_show_175180016610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1363 = newInstance(Class.forName("game.Game"));
        setField(term1363, term1363.getClass(), "bird", null);
        setField(term1363, term1363.getClass(), "neuralNetwork", null);
        setField(term1363, term1363.getClass(), "bottomPanel", null);
        setField(term1363, term1363.getClass(), "pipesController", null);
        setField(term1363, term1363.getClass(), "collisionDetector", null);
        setBooleanField(term1363, term1363.getClass(), "collision", false);
        setField(term1363, term1363.getClass(), "font", null);
        setLongField(term1363, term1363.getClass(), "allSteps", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term1363, args);
    }

};


