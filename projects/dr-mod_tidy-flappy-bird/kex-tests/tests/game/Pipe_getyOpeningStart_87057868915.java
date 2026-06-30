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

public class Pipe_getyOpeningStart_87057868915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8567;

    public Pipe_getyOpeningStart_87057868915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8567 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8567, term8567.getClass(), "x", 0);
        setIntField(term8567, term8567.getClass(), "yOpeningStart", 0);
        setIntField(term8567, term8567.getClass(), "yOpeningEnd", 0);
        setIntField(term8567, term8567.getClass(), "width", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getyOpeningStart", argTypes, term8567, args);
    }

};


