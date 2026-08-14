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

public class DanMuDataModel_getType_9412918887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5582;

    public DanMuDataModel_getType_9412918887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5583 = new Long(-8514728180792822493L);
        Integer term5585 = new Integer(729658803);
        Integer term5599 = new Integer(114754804);
        Integer term5601 = new Integer(1687361082);
        Long term5603 = new Long(5315236285592892506L);
        term5582 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5582, term5582.getClass(), "id", term5583);
        setField(term5582, term5582.getClass(), "userId", term5585);
        setField(term5582, term5582.getClass(), "data", "kVEZMHmRtR");
        setField(term5582, term5582.getClass(), "format", term5599);
        setField(term5582, term5582.getClass(), "type", term5601);
        setField(term5582, term5582.getClass(), "createTime", term5603);
        setField(term5582, term5582.getClass(), "createTimeText", "ekxGuOYIwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term5582, args);
    }

};


