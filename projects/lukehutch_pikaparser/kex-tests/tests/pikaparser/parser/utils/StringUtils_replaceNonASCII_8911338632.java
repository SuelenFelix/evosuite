package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringUtils_replaceNonASCII_8911338632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497;

    public StringUtils_replaceNonASCII_8911338632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1497 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1498 = (byte[]) newByteArray(16);
        setField(term1497, term1497.getClass(), "value", term1498);
        setByteField(term1497, term1497.getClass(), "coder", (byte) 47);
        setIntField(term1497, term1497.getClass(), "count", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = "LvJFtLBaxj";
        args[1] = term1497;
        callMethod(klass, "replaceNonASCII", argTypes, null, args);
    }

};


