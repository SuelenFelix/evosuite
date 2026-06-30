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

public class BottomPanel_step_17882626915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9263;

    public BottomPanel_step_17882626915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9263 = newInstance(Class.forName("game.BottomPanel"));
        setField(term9263, term9263.getClass(), "image", null);
        setField(term9263, term9263.getClass(), "x", null);
        setIntField(term9263, term9263.getClass(), "y", 0);
        setIntField(term9263, term9263.getClass(), "imageWidth", 0);
        setIntField(term9263, term9263.getClass(), "lavaLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.BottomPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term9263, args);
    }

};


