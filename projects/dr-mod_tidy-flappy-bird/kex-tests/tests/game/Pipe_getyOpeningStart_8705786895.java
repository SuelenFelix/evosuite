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

public class Pipe_getyOpeningStart_8705786895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8477;

    public Pipe_getyOpeningStart_8705786895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8477 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8477, term8477.getClass(), "x", -1885268968);
        setIntField(term8477, term8477.getClass(), "yOpeningStart", 277855691);
        setIntField(term8477, term8477.getClass(), "yOpeningEnd", 675891483);
        setIntField(term8477, term8477.getClass(), "width", -317900470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getyOpeningStart", argTypes, term8477, args);
    }

};


