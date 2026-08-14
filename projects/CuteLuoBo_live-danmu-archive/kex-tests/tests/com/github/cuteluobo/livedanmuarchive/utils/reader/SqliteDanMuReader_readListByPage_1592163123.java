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
import java.lang.Long;
import java.lang.Integer;

public class SqliteDanMuReader_readListByPage_1592163123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term158;
     Object term160;

    public SqliteDanMuReader_readListByPage_1592163123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120 = new Long(-7237588299778557629L);
        Long term122 = new Long(6967924379644551255L);
        Long term124 = new Long(-2813493605142626659L);
        Integer term126 = new Integer(-1955890973);
        Integer term140 = new Integer(-2038273078);
        Integer term142 = new Integer(1227103734);
        Long term144 = new Long(-8885298608300233488L);
        term119 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term119, term119.getClass(), "startCreateTime", term120);
        setField(term119, term119.getClass(), "endCreateTime", term122);
        setField(term119, term119.getClass(), "id", term124);
        setField(term119, term119.getClass(), "userId", term126);
        setField(term119, term119.getClass(), "data", "jJCZpVmanW");
        setField(term119, term119.getClass(), "format", term140);
        setField(term119, term119.getClass(), "type", term142);
        setField(term119, term119.getClass(), "createTime", term144);
        setField(term119, term119.getClass(), "createTimeText", "EGtDIRbSSb");
        term158 = new Integer(568599855);
        term160 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term119;
        args[1] = term158;
        args[2] = term160;
        callMethod(klass, "readListByPage", argTypes, null, args);
    }

};


