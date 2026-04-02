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

public class Cash_getSen1_1036257694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13869;

    public Cash_getSen1_1036257694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13870 = new Integer(-663691365);
        Integer term13876 = new Integer(339854490);
        Integer term13878 = new Integer(-615654495);
        Integer term13880 = new Integer(-1476117762);
        Integer term13882 = new Integer(-341962980);
        Integer term13884 = new Integer(1532716628);
        Integer term13886 = new Integer(-1801760683);
        Integer term13888 = new Integer(1141317871);
        Integer term13890 = new Integer(890669485);
        Integer term13892 = new Integer(691577392);
        term13869 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13872 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13869, term13869.getClass(), "id", term13870);
        setIntField(term13872, term13872.getClass(), "year", 2029);
        setShortField(term13872, term13872.getClass(), "month", (short) 6);
        setShortField(term13872, term13872.getClass(), "day", (short) 22);
        setField(term13869, term13869.getClass(), "date", term13872);
        setField(term13869, term13869.getClass(), "man1", term13876);
        setField(term13869, term13869.getClass(), "sen5", term13878);
        setField(term13869, term13869.getClass(), "sen1", term13880);
        setField(term13869, term13869.getClass(), "hyaku5", term13882);
        setField(term13869, term13869.getClass(), "hyaku1", term13884);
        setField(term13869, term13869.getClass(), "jyuu5", term13886);
        setField(term13869, term13869.getClass(), "jyuu1", term13888);
        setField(term13869, term13869.getClass(), "en5", term13890);
        setField(term13869, term13869.getClass(), "en1", term13892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSen1", argTypes, term13869, args);
    }

};


