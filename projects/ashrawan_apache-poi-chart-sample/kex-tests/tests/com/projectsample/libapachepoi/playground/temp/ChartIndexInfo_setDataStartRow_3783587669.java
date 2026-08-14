package com.projectsample.libapachepoi.playground.temp;

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
import static com.projectsample.libapachepoi.playground.temp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ChartIndexInfo_setDataStartRow_3783587669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75792;
     Object term75801;

    public ChartIndexInfo_setDataStartRow_3783587669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75792 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75792, term75792.getClass(), "dataStartRow", -43417861);
        setIntField(term75792, term75792.getClass(), "dataEndRow", -1533843432);
        setIntField(term75792, term75792.getClass(), "dataStartColumn", -123338791);
        setIntField(term75792, term75792.getClass(), "dataEndColumn", -1467089634);
        setIntField(term75792, term75792.getClass(), "categoryStartRow", 413548937);
        setIntField(term75792, term75792.getClass(), "categoryEndRow", 1901317214);
        setIntField(term75792, term75792.getClass(), "categoryStartColumn", 1166710220);
        setIntField(term75792, term75792.getClass(), "categoryEndColumn", -1070592289);
        term75801 = new Integer(-1464172784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75801;
        callMethod(klass, "setDataStartRow", argTypes, term75792, args);
    }

};


