package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Cash_hashCode_8363942724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14395;

    public Cash_hashCode_8363942724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14396 = new Integer(-358526505);
        Integer term14402 = new Integer(1843268026);
        Integer term14404 = new Integer(954660603);
        Integer term14406 = new Integer(-1351605385);
        Integer term14408 = new Integer(278355793);
        Integer term14410 = new Integer(-310648604);
        Integer term14412 = new Integer(-648200466);
        Integer term14414 = new Integer(2007134147);
        Integer term14416 = new Integer(993388358);
        Integer term14418 = new Integer(-765191335);
        term14395 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14398 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14395, term14395.getClass(), "id", term14396);
        setIntField(term14398, term14398.getClass(), "year", 2028);
        setShortField(term14398, term14398.getClass(), "month", (short) 5);
        setShortField(term14398, term14398.getClass(), "day", (short) 29);
        setField(term14395, term14395.getClass(), "date", term14398);
        setField(term14395, term14395.getClass(), "man1", term14402);
        setField(term14395, term14395.getClass(), "sen5", term14404);
        setField(term14395, term14395.getClass(), "sen1", term14406);
        setField(term14395, term14395.getClass(), "hyaku5", term14408);
        setField(term14395, term14395.getClass(), "hyaku1", term14410);
        setField(term14395, term14395.getClass(), "jyuu5", term14412);
        setField(term14395, term14395.getClass(), "jyuu1", term14414);
        setField(term14395, term14395.getClass(), "en5", term14416);
        setField(term14395, term14395.getClass(), "en1", term14418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14395, args);
    }

};


