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

public class Bird_step_133810293512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9052;

    public Bird_step_133810293512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9052 = newInstance(Class.forName("game.Bird"));
        setIntField(term9052, term9052.getClass(), "x", 0);
        setIntField(term9052, term9052.getClass(), "y", 0);
        setIntField(term9052, term9052.getClass(), "birdHeight", 0);
        setIntField(term9052, term9052.getClass(), "birdWidth", 0);
        setDoubleField(term9052, term9052.getClass(), "velocity", 0.0);
        setIntField(term9052, term9052.getClass(), "count", 0);
        setField(term9052, term9052.getClass(), "images", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term9052, args);
    }

};


