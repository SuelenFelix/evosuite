package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AuthenticationValue_withHeader_6414392784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13837;

    public AuthenticationValue_withHeader_6414392784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13923 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term13922 = ((Class) term13923).getDeclaredField((String) "HEADER");
        ((Field) term13922).setAccessible(true);
        Object enum32 = ((Field) term13922).get((Object) null);
        term13837 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term13872 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term13873 = (Object[]) newArray("java.lang.String", 1);
        setField(term13837, term13837.getClass(), "key", "tShwQLRGNe");
        setField(term13837, term13837.getClass(), "value", "LvtrsXUliU");
        setField(term13837, term13837.getClass(), "type", enum32);
        setElement(term13873, 0, "*");
        setField(term13872, term13872.getClass(), "a", term13873);
        setIntField(term13872, term13872.getClass(), "modCount", 0);
        setField(term13837, term13837.getClass(), "urlPatterns", term13872);
        setField(term13837, term13837.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "xLbjWUgOIL";
        args[1] = "jDtqGUpnZN";
        callMethod(klass, "withHeader", argTypes, term13837, args);
    }

};


