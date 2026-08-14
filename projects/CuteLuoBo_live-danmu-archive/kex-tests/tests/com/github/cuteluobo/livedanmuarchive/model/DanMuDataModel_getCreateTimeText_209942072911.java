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

public class DanMuDataModel_getCreateTimeText_209942072911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5806;

    public DanMuDataModel_getCreateTimeText_209942072911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5807 = new Long(3713624957161771816L);
        Integer term5809 = new Integer(1102721075);
        Integer term5823 = new Integer(-426764678);
        Integer term5825 = new Integer(-1222614956);
        Long term5827 = new Long(6130232388739280211L);
        term5806 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5806, term5806.getClass(), "id", term5807);
        setField(term5806, term5806.getClass(), "userId", term5809);
        setField(term5806, term5806.getClass(), "data", "lFRJFUMVbx");
        setField(term5806, term5806.getClass(), "format", term5823);
        setField(term5806, term5806.getClass(), "type", term5825);
        setField(term5806, term5806.getClass(), "createTime", term5827);
        setField(term5806, term5806.getClass(), "createTimeText", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimeText", argTypes, term5806, args);
    }

};


