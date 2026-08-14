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

public class RomanNumeralWithFancierStream_isSubtractive_7575704154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term44;
     Object term49;
     Object term51;

    public RomanNumeralWithFancierStream_isSubtractive_7575704154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream"));
        term44 = (char[]) newCharArray(4);
        setCharElement(term44, 0, 'Z');
        setCharElement(term44, 1, 't');
        setCharElement(term44, 2, 'T');
        setCharElement(term44, 3, 'D');
        term49 = new Integer(1484323161);
        term51 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term44;
        args[1] = term49;
        args[2] = term51;
        callMethod(klass, "isSubtractive", argTypes, term43, args);
    }

};


