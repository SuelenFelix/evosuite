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

public class DanMuDataModel_getData_13978483793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5338;

    public DanMuDataModel_getData_13978483793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5339 = new Long(8708846223293804408L);
        Integer term5341 = new Integer(-1885090354);
        Integer term5355 = new Integer(-2066804303);
        Integer term5357 = new Integer(-1731761810);
        Long term5359 = new Long(-2986201902216133814L);
        term5338 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5338, term5338.getClass(), "id", term5339);
        setField(term5338, term5338.getClass(), "userId", term5341);
        setField(term5338, term5338.getClass(), "data", "vwbEQQNQrx");
        setField(term5338, term5338.getClass(), "format", term5355);
        setField(term5338, term5338.getClass(), "type", term5357);
        setField(term5338, term5338.getClass(), "createTime", term5359);
        setField(term5338, term5338.getClass(), "createTimeText", "xtftXXMbem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term5338, args);
    }

};


