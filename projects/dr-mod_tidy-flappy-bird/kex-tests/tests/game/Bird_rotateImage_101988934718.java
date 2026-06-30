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
import java.lang.Integer;

public class Bird_rotateImage_101988934718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9094;
     Object term9101;

    public Bird_rotateImage_101988934718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9094 = newInstance(Class.forName("game.Bird"));
        setIntField(term9094, term9094.getClass(), "x", 0);
        setIntField(term9094, term9094.getClass(), "y", 0);
        setIntField(term9094, term9094.getClass(), "birdHeight", 0);
        setIntField(term9094, term9094.getClass(), "birdWidth", 0);
        setDoubleField(term9094, term9094.getClass(), "velocity", 0.0);
        setIntField(term9094, term9094.getClass(), "count", 0);
        setField(term9094, term9094.getClass(), "images", null);
        term9101 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9101;
        callMethod(klass, "rotateImage", argTypes, term9094, args);
    }

};


