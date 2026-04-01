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

public class DateUtil_daysDiff_71295634410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005;
     Object term1007;

    public DateUtil_daysDiff_71295634410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1005 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1005, term1005.getClass(), "fastTime", 1345871412244L);
        setField(term1005, term1005.getClass(), "cdate", null);
        term1007 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1007, term1007.getClass(), "fastTime", 1480438351369L);
        setField(term1007, term1007.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.DateUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term1005;
        args[1] = term1007;
        callMethod(klass, "daysDiff", argTypes, null, args);
    }

};


