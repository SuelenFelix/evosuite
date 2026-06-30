package kyungseo.poc.simple.web.appcore.util;

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
import static kyungseo.poc.simple.web.appcore.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MessageSourceUtil_getMessage_13026950340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;

    public MessageSourceUtil_getMessage_13026950340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1652 = (Object[]) newArray("java.lang.Object", 5);
        Object term1653 = newInstance(Class.forName("java.lang.Object"));
        Object term1654 = newInstance(Class.forName("java.lang.Object"));
        Object term1655 = newInstance(Class.forName("java.lang.Object"));
        Object term1656 = newInstance(Class.forName("java.lang.Object"));
        Object term1657 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1652, 0, term1653);
        setElement(term1652, 1, term1654);
        setElement(term1652, 2, term1655);
        setElement(term1652, 3, term1656);
        setElement(term1652, 4, term1657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.MessageSourceUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "UlajhuVLaP";
        args[1] = term1652;
        callMethod(klass, "getMessage", argTypes, null, args);
    }

};


