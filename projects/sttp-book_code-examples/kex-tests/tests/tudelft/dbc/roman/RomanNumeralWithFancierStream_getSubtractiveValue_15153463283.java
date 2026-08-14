package tudelft.dbc.roman;

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
import static tudelft.dbc.roman.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RomanNumeralWithFancierStream_getSubtractiveValue_15153463283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term28;
     Object term34;
     Object term36;

    public RomanNumeralWithFancierStream_getSubtractiveValue_15153463283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream"));
        term28 = (char[]) newCharArray(5);
        setCharElement(term28, 0, 'A');
        setCharElement(term28, 1, 'E');
        setCharElement(term28, 2, 'B');
        setCharElement(term28, 3, 't');
        setCharElement(term28, 4, 'n');
        term34 = new Integer(568599855);
        term36 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term28;
        args[1] = term34;
        args[2] = term36;
        callMethod(klass, "getSubtractiveValue", argTypes, term27, args);
    }

};


