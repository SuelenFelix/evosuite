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

public class JodaTimeUtil_isBetweenStartAndEndTime_129871068017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1599;
     Object term1601;
     Object term1603;

    public JodaTimeUtil_isBetweenStartAndEndTime_129871068017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1599 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1599, term1599.getClass(), "fastTime", 1437757323580L);
        setField(term1599, term1599.getClass(), "cdate", null);
        term1601 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1601, term1601.getClass(), "fastTime", 1668569229825L);
        setField(term1601, term1601.getClass(), "cdate", null);
        term1603 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1603, term1603.getClass(), "fastTime", 1725122217647L);
        setField(term1603, term1603.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.JodaTimeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = Class.forName("java.util.Date");
        Object[] args = new Object[3];
        args[0] = term1599;
        args[1] = term1601;
        args[2] = term1603;
        callMethod(klass, "isBetweenStartAndEndTime", argTypes, null, args);
    }

};


