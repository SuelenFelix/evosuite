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

public class SqliteDanMuFormatExportService_checkDanMuOverlap_10602641423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term107;
     Object term122;
     Object term137;
     Object term139;

    public SqliteDanMuFormatExportService_checkDanMuOverlap_10602641423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = new Integer(391863371);
        term107 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term107, term107.getClass(), "startTime", 2442117782898005296L);
        setField(term107, term107.getClass(), "content", "NRdvgJlhkX");
        setFloatField(term107, term107.getClass(), "fontSize", 0.13238746F);
        term122 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term122, term122.getClass(), "startTime", 6375119433582206027L);
        setField(term122, term122.getClass(), "content", "uuaPigETmJ");
        setFloatField(term122, term122.getClass(), "fontSize", 0.2707036F);
        term137 = new Integer(-1922583790);
        term139 = new Integer(-616727354);
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
        args[0] = term105;
        args[1] = term107;
        args[2] = term122;
        args[3] = term137;
        args[4] = term139;
        callMethod(klass, "checkDanMuOverlap", argTypes, null, args);
    }

};


