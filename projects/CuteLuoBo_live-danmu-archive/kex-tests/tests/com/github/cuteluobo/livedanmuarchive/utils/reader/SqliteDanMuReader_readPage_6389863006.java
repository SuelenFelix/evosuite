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

public class SqliteDanMuReader_readPage_6389863006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;
     Object term343;
     Object term345;

    public SqliteDanMuReader_readPage_6389863006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term305 = new Long(8428634514691209827L);
        Long term307 = new Long(-2585684163342970173L);
        Long term309 = new Long(8059786003080744426L);
        Integer term311 = new Integer(597278769);
        Integer term325 = new Integer(-1685132342);
        Integer term327 = new Integer(-1456670397);
        Long term329 = new Long(-4365849114644724155L);
        term304 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term304, term304.getClass(), "startCreateTime", term305);
        setField(term304, term304.getClass(), "endCreateTime", term307);
        setField(term304, term304.getClass(), "id", term309);
        setField(term304, term304.getClass(), "userId", term311);
        setField(term304, term304.getClass(), "data", "NRdvgJlhkX");
        setField(term304, term304.getClass(), "format", term325);
        setField(term304, term304.getClass(), "type", term327);
        setField(term304, term304.getClass(), "createTime", term329);
        setField(term304, term304.getClass(), "createTimeText", "uuaPigETmJ");
        term343 = new Integer(391863371);
        term345 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term304;
        args[1] = term343;
        args[2] = term345;
        callMethod(klass, "readPage", argTypes, null, args);
    }

};


