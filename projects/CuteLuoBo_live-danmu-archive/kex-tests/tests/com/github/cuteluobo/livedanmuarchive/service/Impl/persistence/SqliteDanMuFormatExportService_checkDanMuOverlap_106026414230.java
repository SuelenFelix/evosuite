package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SqliteDanMuFormatExportService_checkDanMuOverlap_106026414230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;
     Object term444;
     Object term446;

    public SqliteDanMuFormatExportService_checkDanMuOverlap_106026414230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = new Integer(0);
        term444 = new Integer(0);
        term446 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.SqliteDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData");
        argTypes[2] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term442;
        args[1] = null;
        args[2] = null;
        args[3] = term444;
        args[4] = term446;
        callMethod(klass, "checkDanMuOverlap", argTypes, null, args);
    }

};


