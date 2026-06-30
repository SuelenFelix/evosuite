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

public class Pipe_show_17432472662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8460;

    public Pipe_show_17432472662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8460 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8460, term8460.getClass(), "x", 797015478);
        setIntField(term8460, term8460.getClass(), "yOpeningStart", 717574276);
        setIntField(term8460, term8460.getClass(), "yOpeningEnd", 1795369860);
        setIntField(term8460, term8460.getClass(), "width", -570164389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term8460, args);
    }

};


