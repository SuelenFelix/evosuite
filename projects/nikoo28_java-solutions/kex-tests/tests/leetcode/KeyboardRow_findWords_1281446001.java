package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KeyboardRow_findWords_1281446001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12448;

    public KeyboardRow_findWords_1281446001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12448 = (Object[]) newArray("java.lang.String", 8);
        setElement(term12448, 0, "qnvxzwuGKX");
        setElement(term12448, 1, "EdPAvpluZg");
        setElement(term12448, 2, "DzHVBMqWtE");
        setElement(term12448, 3, "THZSpzBRYP");
        setElement(term12448, 4, "ZfBIVGBQOE");
        setElement(term12448, 5, "QSrDQfEsTR");
        setElement(term12448, 6, "PsqusYmejD");
        setElement(term12448, 7, "NTWMiBEaDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.KeyboardRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12448;
        callMethod(klass, "findWords", argTypes, null, args);
    }

};


