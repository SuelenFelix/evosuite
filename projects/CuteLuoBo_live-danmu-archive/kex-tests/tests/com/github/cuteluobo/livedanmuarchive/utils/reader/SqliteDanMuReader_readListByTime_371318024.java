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

public class SqliteDanMuReader_readListByTime_371318024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;
     Object term221;
     Object term223;

    public SqliteDanMuReader_readListByTime_371318024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term183 = new Long(-4325723315152823407L);
        Long term185 = new Long(2535595959091595249L);
        Long term187 = new Long(-5476826692763582090L);
        Integer term189 = new Integer(-1339778481);
        Integer term203 = new Integer(1725571209);
        Integer term205 = new Integer(-522618178);
        Long term207 = new Long(-872011222785455006L);
        term182 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term182, term182.getClass(), "startCreateTime", term183);
        setField(term182, term182.getClass(), "endCreateTime", term185);
        setField(term182, term182.getClass(), "id", term187);
        setField(term182, term182.getClass(), "userId", term189);
        setField(term182, term182.getClass(), "data", "SzjVpOQTyS");
        setField(term182, term182.getClass(), "format", term203);
        setField(term182, term182.getClass(), "type", term205);
        setField(term182, term182.getClass(), "createTime", term207);
        setField(term182, term182.getClass(), "createTimeText", "MjGYSRKTNF");
        term221 = new Integer(1484323161);
        term223 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term182;
        args[1] = term221;
        args[2] = term223;
        callMethod(klass, "readListByTime", argTypes, null, args);
    }

};


