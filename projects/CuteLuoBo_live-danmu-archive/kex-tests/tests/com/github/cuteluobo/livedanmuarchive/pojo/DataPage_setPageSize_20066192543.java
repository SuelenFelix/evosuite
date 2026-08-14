package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class DataPage_setPageSize_20066192543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37335;
     Object term37348;

    public DataPage_setPageSize_20066192543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37336 = new ArrayList();
        Integer term37340 = new Integer(-655067527);
        Integer term37342 = new Integer(-6029667);
        Integer term37344 = new Integer(-2068769794);
        Integer term37346 = new Integer(-117576464);
        term37335 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37335, term37335.getClass(), "data", term37336);
        setField(term37335, term37335.getClass(), "current", term37340);
        setField(term37335, term37335.getClass(), "pageSize", term37342);
        setField(term37335, term37335.getClass(), "total", term37344);
        setField(term37335, term37335.getClass(), "maxPageNum", term37346);
        term37348 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term37348;
        callMethod(klass, "setPageSize", argTypes, term37335, args);
    }

};


