package com.github.cuteluobo.livedanmuarchive.utils.reader;

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
import static com.github.cuteluobo.livedanmuarchive.utils.reader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class BatchSqliteDanMuReader_readListByTime_128471481412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;
     Object term1164;
     Object term1166;

    public BatchSqliteDanMuReader_readListByTime_128471481412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1163 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term1163, term1163.getClass(), "danMuReaderList", null);
        setField(term1163, term1163.getClass(), "startTimeMap", null);
        setField(term1163, term1163.getClass(), "endTimeMap", null);
        term1164 = new Integer(0);
        term1166 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1164;
        args[2] = term1166;
        callMethod(klass, "readListByTime", argTypes, term1163, args);
    }

};


