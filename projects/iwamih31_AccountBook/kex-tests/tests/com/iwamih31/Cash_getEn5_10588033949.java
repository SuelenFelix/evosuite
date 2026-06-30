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

public class Cash_getEn5_10588033949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13994;

    public Cash_getEn5_10588033949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13995 = new Integer(1830648570);
        Integer term14001 = new Integer(-227365013);
        Integer term14003 = new Integer(11724947);
        Integer term14005 = new Integer(1953277050);
        Integer term14007 = new Integer(1283079251);
        Integer term14009 = new Integer(-523949691);
        Integer term14011 = new Integer(1398204340);
        Integer term14013 = new Integer(229204365);
        Integer term14015 = new Integer(-461771056);
        Integer term14017 = new Integer(-243422082);
        term13994 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13997 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13994, term13994.getClass(), "id", term13995);
        setIntField(term13997, term13997.getClass(), "year", 2016);
        setShortField(term13997, term13997.getClass(), "month", (short) 5);
        setShortField(term13997, term13997.getClass(), "day", (short) 28);
        setField(term13994, term13994.getClass(), "date", term13997);
        setField(term13994, term13994.getClass(), "man1", term14001);
        setField(term13994, term13994.getClass(), "sen5", term14003);
        setField(term13994, term13994.getClass(), "sen1", term14005);
        setField(term13994, term13994.getClass(), "hyaku5", term14007);
        setField(term13994, term13994.getClass(), "hyaku1", term14009);
        setField(term13994, term13994.getClass(), "jyuu5", term14011);
        setField(term13994, term13994.getClass(), "jyuu1", term14013);
        setField(term13994, term13994.getClass(), "en5", term14015);
        setField(term13994, term13994.getClass(), "en1", term14017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEn5", argTypes, term13994, args);
    }

};


