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

public class Bird_show_175617466911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9045;

    public Bird_show_175617466911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9045 = newInstance(Class.forName("game.Bird"));
        setIntField(term9045, term9045.getClass(), "x", 0);
        setIntField(term9045, term9045.getClass(), "y", 0);
        setIntField(term9045, term9045.getClass(), "birdHeight", 0);
        setIntField(term9045, term9045.getClass(), "birdWidth", 0);
        setDoubleField(term9045, term9045.getClass(), "velocity", 0.0);
        setIntField(term9045, term9045.getClass(), "count", 0);
        setField(term9045, term9045.getClass(), "images", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term9045, args);
    }

};


