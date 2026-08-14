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

public class SqliteDanMuReader_listTimeDataByTime_14082366155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public SqliteDanMuReader_listTimeDataByTime_14082366155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246 = new Long(-316468845751588286L);
        Long term248 = new Long(5127676408959197577L);
        Long term250 = new Long(-6573104506744284592L);
        Integer term252 = new Integer(1134449235);
        Integer term266 = new Integer(-883034806);
        Integer term268 = new Integer(1585847225);
        Long term270 = new Long(-4920224193275732920L);
        term245 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term245, term245.getClass(), "startCreateTime", term246);
        setField(term245, term245.getClass(), "endCreateTime", term248);
        setField(term245, term245.getClass(), "id", term250);
        setField(term245, term245.getClass(), "userId", term252);
        setField(term245, term245.getClass(), "data", "hRNSzYYIrc");
        setField(term245, term245.getClass(), "format", term266);
        setField(term245, term245.getClass(), "type", term268);
        setField(term245, term245.getClass(), "createTime", term270);
        setField(term245, term245.getClass(), "createTimeText", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term245;
        callMethod(klass, "listTimeDataByTime", argTypes, null, args);
    }

};


