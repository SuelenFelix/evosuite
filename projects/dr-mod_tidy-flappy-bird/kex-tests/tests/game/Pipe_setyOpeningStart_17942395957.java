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

public class Pipe_setyOpeningStart_17942395957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8487;
     Object term8492;

    public Pipe_setyOpeningStart_17942395957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8487 = newInstance(Class.forName("game.Pipe"));
        setIntField(term8487, term8487.getClass(), "x", -1742790308);
        setIntField(term8487, term8487.getClass(), "yOpeningStart", -1592093430);
        setIntField(term8487, term8487.getClass(), "yOpeningEnd", 1178214545);
        setIntField(term8487, term8487.getClass(), "width", -985334541);
        term8492 = new Integer(-1870004228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Pipe");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8492;
        callMethod(klass, "setyOpeningStart", argTypes, term8487, args);
    }

};


