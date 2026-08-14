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
import java.lang.Character;

public class RomanNumeralWithFancierStream_asArabic_19223686592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public RomanNumeralWithFancierStream_asArabic_19223686592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream"));
        term25 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.dbc.roman.RomanNumeralWithFancierStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "asArabic", argTypes, term24, args);
    }

};


