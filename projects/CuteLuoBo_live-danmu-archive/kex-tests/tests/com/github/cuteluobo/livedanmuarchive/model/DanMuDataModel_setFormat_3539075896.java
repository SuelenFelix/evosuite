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

public class DanMuDataModel_setFormat_3539075896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5525;
     Object term5560;

    public DanMuDataModel_setFormat_3539075896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5526 = new Long(-113028659747841511L);
        Integer term5528 = new Integer(-506958186);
        Integer term5542 = new Integer(-507387516);
        Integer term5544 = new Integer(-1970452551);
        Long term5546 = new Long(7271112616766426991L);
        term5525 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5525, term5525.getClass(), "id", term5526);
        setField(term5525, term5525.getClass(), "userId", term5528);
        setField(term5525, term5525.getClass(), "data", "DyiXbeYIaN");
        setField(term5525, term5525.getClass(), "format", term5542);
        setField(term5525, term5525.getClass(), "type", term5544);
        setField(term5525, term5525.getClass(), "createTime", term5546);
        setField(term5525, term5525.getClass(), "createTimeText", "VGizxZnyHX");
        term5560 = new Integer(-1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5560;
        callMethod(klass, "setFormat", argTypes, term5525, args);
    }

};


