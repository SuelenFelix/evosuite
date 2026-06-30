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

public class Cash_getMan1_2790947592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13819;

    public Cash_getMan1_2790947592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13820 = new Integer(-1547384488);
        Integer term13826 = new Integer(1442160736);
        Integer term13828 = new Integer(1114000454);
        Integer term13830 = new Integer(-556405712);
        Integer term13832 = new Integer(-1772434990);
        Integer term13834 = new Integer(-1845499264);
        Integer term13836 = new Integer(-505439934);
        Integer term13838 = new Integer(-344842608);
        Integer term13840 = new Integer(941650513);
        Integer term13842 = new Integer(444029505);
        term13819 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13822 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13819, term13819.getClass(), "id", term13820);
        setIntField(term13822, term13822.getClass(), "year", 2015);
        setShortField(term13822, term13822.getClass(), "month", (short) 9);
        setShortField(term13822, term13822.getClass(), "day", (short) 15);
        setField(term13819, term13819.getClass(), "date", term13822);
        setField(term13819, term13819.getClass(), "man1", term13826);
        setField(term13819, term13819.getClass(), "sen5", term13828);
        setField(term13819, term13819.getClass(), "sen1", term13830);
        setField(term13819, term13819.getClass(), "hyaku5", term13832);
        setField(term13819, term13819.getClass(), "hyaku1", term13834);
        setField(term13819, term13819.getClass(), "jyuu5", term13836);
        setField(term13819, term13819.getClass(), "jyuu1", term13838);
        setField(term13819, term13819.getClass(), "en5", term13840);
        setField(term13819, term13819.getClass(), "en1", term13842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMan1", argTypes, term13819, args);
    }

};


