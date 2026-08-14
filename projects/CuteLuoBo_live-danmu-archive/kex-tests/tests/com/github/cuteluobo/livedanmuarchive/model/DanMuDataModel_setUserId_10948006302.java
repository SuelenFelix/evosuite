package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModel_setUserId_10948006302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5281;
     Object term5316;

    public DanMuDataModel_setUserId_10948006302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5282 = new Long(918397384129253729L);
        Integer term5284 = new Integer(-1274456137);
        Integer term5298 = new Integer(1041916673);
        Integer term5300 = new Integer(-601863069);
        Long term5302 = new Long(-2187638136407967948L);
        term5281 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5281, term5281.getClass(), "id", term5282);
        setField(term5281, term5281.getClass(), "userId", term5284);
        setField(term5281, term5281.getClass(), "data", "rLHAoqXgPh");
        setField(term5281, term5281.getClass(), "format", term5298);
        setField(term5281, term5281.getClass(), "type", term5300);
        setField(term5281, term5281.getClass(), "createTime", term5302);
        setField(term5281, term5281.getClass(), "createTimeText", "zUlRdimJtU");
        term5316 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5316;
        callMethod(klass, "setUserId", argTypes, term5281, args);
    }

};


