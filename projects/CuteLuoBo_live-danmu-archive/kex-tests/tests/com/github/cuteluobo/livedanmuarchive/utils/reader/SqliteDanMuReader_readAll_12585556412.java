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

public class SqliteDanMuReader_readAll_12585556412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;

    public SqliteDanMuReader_readAll_12585556412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61 = new Long(5270370404989704783L);
        Long term63 = new Long(7411271909051562686L);
        Long term65 = new Long(4872422362414183754L);
        Integer term67 = new Integer(391863371);
        Integer term81 = new Integer(-1922583790);
        Integer term83 = new Integer(-616727354);
        Long term85 = new Long(6811161968424632369L);
        term60 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term60, term60.getClass(), "startCreateTime", term61);
        setField(term60, term60.getClass(), "endCreateTime", term63);
        setField(term60, term60.getClass(), "id", term65);
        setField(term60, term60.getClass(), "userId", term67);
        setField(term60, term60.getClass(), "data", "MuLcgQHgqz");
        setField(term60, term60.getClass(), "format", term81);
        setField(term60, term60.getClass(), "type", term83);
        setField(term60, term60.getClass(), "createTime", term85);
        setField(term60, term60.getClass(), "createTimeText", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term60;
        callMethod(klass, "readAll", argTypes, null, args);
    }

};


