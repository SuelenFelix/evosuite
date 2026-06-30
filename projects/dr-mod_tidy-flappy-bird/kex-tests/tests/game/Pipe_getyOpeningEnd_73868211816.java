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

public class Pipe_getyOpeningEnd_73868211816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8572;

    public Pipe_getyOpeningEnd_73868211816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8572 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8572, term8572.getClass(), "x", 0);
        setIntField(term8572, term8572.getClass(), "yOpeningStart", 0);
        setIntField(term8572, term8572.getClass(), "yOpeningEnd", 0);
        setIntField(term8572, term8572.getClass(), "width", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getyOpeningEnd", argTypes, term8572, args);
    }

};


