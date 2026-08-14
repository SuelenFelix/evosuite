package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Match_init_3293753972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;
     Object term1008;

    public Match_init_3293753972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1006 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term1006, term1006.getClass(), "clause", null);
        setIntField(term1006, term1006.getClass(), "startPos", -1504890659);
        term1008 = new Integer(1358829571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1006;
        args[1] = term1008;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


