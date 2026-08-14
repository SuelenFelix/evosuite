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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Sqlite2FileDanMuFormatExportService_writeDanMuData_7647189352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11865;
     Object term11867;
     Object term11892;

    public Sqlite2FileDanMuFormatExportService_writeDanMuData_7647189352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11865 = new Long(-4502405999831680926L);
        Class<? extends Object> term11942 = Class.forName((String) "java.io.File$PathStatus");
        Field term11941 = ((Class) term11942).getDeclaredField((String) "CHECKED");
        ((Field) term11941).setAccessible(true);
        Object enum35 = ((Field) term11941).get((Object) null);
        term11867 = newInstance(Class.forName("java.io.File"));
        setField(term11867, term11867.getClass(), "path", "riMtzCoxNj");
        setField(term11867, term11867.getClass(), "status", enum35);
        setIntField(term11867, term11867.getClass(), "prefixLength", 147209682);
        setField(term11867, term11867.getClass(), "filePath", null);
        Long term11893 = new Long(2120084523938730454L);
        Long term11895 = new Long(6855071767938501807L);
        Long term11897 = new Long(-5892135042702373494L);
        Integer term11899 = new Integer(-203030934);
        Integer term11913 = new Integer(-1179120542);
        Integer term11915 = new Integer(-73683645);
        Long term11917 = new Long(5262507301787091109L);
        term11892 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term11892, term11892.getClass(), "startCreateTime", term11893);
        setField(term11892, term11892.getClass(), "endCreateTime", term11895);
        setField(term11892, term11892.getClass(), "id", term11897);
        setField(term11892, term11892.getClass(), "userId", term11899);
        setField(term11892, term11892.getClass(), "data", "YAXkVjQZcV");
        setField(term11892, term11892.getClass(), "format", term11913);
        setField(term11892, term11892.getClass(), "type", term11915);
        setField(term11892, term11892.getClass(), "createTime", term11917);
        setField(term11892, term11892.getClass(), "createTimeText", "pumvwBWvpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2FileDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.io.File");
        argTypes[2] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[3];
        args[0] = term11865;
        args[1] = term11867;
        args[2] = term11892;
        callMethod(klass, "writeDanMuData", argTypes, null, args);
    }

};


