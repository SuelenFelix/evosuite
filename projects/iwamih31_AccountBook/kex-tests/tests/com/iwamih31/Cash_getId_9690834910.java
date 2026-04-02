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

public class Cash_getId_9690834910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13769;

    public Cash_getId_9690834910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13770 = new Integer(-1588772968);
        Integer term13776 = new Integer(-93135961);
        Integer term13778 = new Integer(-112921587);
        Integer term13780 = new Integer(933028652);
        Integer term13782 = new Integer(287287233);
        Integer term13784 = new Integer(962840079);
        Integer term13786 = new Integer(1540719661);
        Integer term13788 = new Integer(1265463001);
        Integer term13790 = new Integer(335112684);
        Integer term13792 = new Integer(1551099402);
        term13769 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13772 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13769, term13769.getClass(), "id", term13770);
        setIntField(term13772, term13772.getClass(), "year", 2017);
        setShortField(term13772, term13772.getClass(), "month", (short) 6);
        setShortField(term13772, term13772.getClass(), "day", (short) 7);
        setField(term13769, term13769.getClass(), "date", term13772);
        setField(term13769, term13769.getClass(), "man1", term13776);
        setField(term13769, term13769.getClass(), "sen5", term13778);
        setField(term13769, term13769.getClass(), "sen1", term13780);
        setField(term13769, term13769.getClass(), "hyaku5", term13782);
        setField(term13769, term13769.getClass(), "hyaku1", term13784);
        setField(term13769, term13769.getClass(), "jyuu5", term13786);
        setField(term13769, term13769.getClass(), "jyuu1", term13788);
        setField(term13769, term13769.getClass(), "en5", term13790);
        setField(term13769, term13769.getClass(), "en1", term13792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13769, args);
    }

};


