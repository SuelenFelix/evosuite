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

public class Cash_setSen1_135704658715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14154;
     Object term14179;

    public Cash_setSen1_135704658715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14155 = new Integer(880977281);
        Integer term14161 = new Integer(371943306);
        Integer term14163 = new Integer(982388293);
        Integer term14165 = new Integer(-159494544);
        Integer term14167 = new Integer(-75206835);
        Integer term14169 = new Integer(-1618206977);
        Integer term14171 = new Integer(-1747406163);
        Integer term14173 = new Integer(388157121);
        Integer term14175 = new Integer(1684998508);
        Integer term14177 = new Integer(-1476644457);
        term14154 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14157 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14154, term14154.getClass(), "id", term14155);
        setIntField(term14157, term14157.getClass(), "year", 2027);
        setShortField(term14157, term14157.getClass(), "month", (short) 8);
        setShortField(term14157, term14157.getClass(), "day", (short) 25);
        setField(term14154, term14154.getClass(), "date", term14157);
        setField(term14154, term14154.getClass(), "man1", term14161);
        setField(term14154, term14154.getClass(), "sen5", term14163);
        setField(term14154, term14154.getClass(), "sen1", term14165);
        setField(term14154, term14154.getClass(), "hyaku5", term14167);
        setField(term14154, term14154.getClass(), "hyaku1", term14169);
        setField(term14154, term14154.getClass(), "jyuu5", term14171);
        setField(term14154, term14154.getClass(), "jyuu1", term14173);
        setField(term14154, term14154.getClass(), "en5", term14175);
        setField(term14154, term14154.getClass(), "en1", term14177);
        term14179 = new Integer(1270666529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14179;
        callMethod(klass, "setSen1", argTypes, term14154, args);
    }

};


