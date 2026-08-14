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
import java.lang.Integer;
import java.lang.Long;

public class DanMuUserInfoModel_getAddTime_3986701957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;

    public DanMuUserInfoModel_getAddTime_3986701957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3024 = new Integer(679763016);
        Long term3026 = new Long(6843866297465638866L);
        term3023 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term3023, term3023.getClass(), "id", term3024);
        setField(term3023, term3023.getClass(), "addTime", term3026);
        setField(term3023, term3023.getClass(), "uid", "qxSDVejjiY");
        setField(term3023, term3023.getClass(), "nickName", "xBsXSDjXYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddTime", argTypes, term3023, args);
    }

};


