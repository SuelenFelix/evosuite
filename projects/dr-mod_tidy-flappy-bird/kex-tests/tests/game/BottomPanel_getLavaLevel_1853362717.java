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

public class BottomPanel_getLavaLevel_1853362717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9271;

    public BottomPanel_getLavaLevel_1853362717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9271 = newInstance(Class.forName("game.BottomPanel"));
        setField(term9271, term9271.getClass(), "image", null);
        setField(term9271, term9271.getClass(), "x", null);
        setIntField(term9271, term9271.getClass(), "y", 0);
        setIntField(term9271, term9271.getClass(), "imageWidth", 0);
        setIntField(term9271, term9271.getClass(), "lavaLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.BottomPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLavaLevel", argTypes, term9271, args);
    }

};


