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

public class CollisionDetector_collision_14609001613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public CollisionDetector_collision_14609001613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = newInstance(Class.forName("game.CollisionDetector"));
        setIntField(term74, term74.getClass(), "screenBottom", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.CollisionDetector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Bird");
        argTypes[1] = Class.forName("game.Pipe");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "collision", argTypes, term74, args);
    }

};


