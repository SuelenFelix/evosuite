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

public class DanMuDataModel_getId_104334352913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5938;

    public DanMuDataModel_getId_104334352913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5939 = new Long(6041374912351843923L);
        Integer term5941 = new Integer(-571169753);
        Integer term5955 = new Integer(318591690);
        Integer term5957 = new Integer(-165587447);
        Long term5959 = new Long(2535970782317488741L);
        term5938 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5938, term5938.getClass(), "id", term5939);
        setField(term5938, term5938.getClass(), "userId", term5941);
        setField(term5938, term5938.getClass(), "data", "PgPzMSEjjX");
        setField(term5938, term5938.getClass(), "format", term5955);
        setField(term5938, term5938.getClass(), "type", term5957);
        setField(term5938, term5938.getClass(), "createTime", term5959);
        setField(term5938, term5938.getClass(), "createTimeText", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5938, args);
    }

};


