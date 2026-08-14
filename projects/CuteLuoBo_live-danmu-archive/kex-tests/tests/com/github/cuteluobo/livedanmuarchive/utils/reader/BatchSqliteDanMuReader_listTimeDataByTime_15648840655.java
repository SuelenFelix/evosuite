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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;

public class BatchSqliteDanMuReader_listTimeDataByTime_15648840655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;
     Object term868;

    public BatchSqliteDanMuReader_listTimeDataByTime_15648840655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term844 = new ArrayList();
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        ((ArrayList) term844).add((Object)null);
        HashMap term848 = new HashMap();
        HashMap term858 = new HashMap();
        term843 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term843, term843.getClass(), "danMuReaderList", term844);
        setField(term843, term843.getClass(), "startTimeMap", term848);
        setField(term843, term843.getClass(), "endTimeMap", term858);
        Long term869 = new Long(305759998609888272L);
        Long term871 = new Long(-8654565919063661957L);
        Long term873 = new Long(-5248475803419977214L);
        Integer term875 = new Integer(-817164822);
        Integer term889 = new Integer(-1016503459);
        Integer term891 = new Integer(-1968847291);
        Long term893 = new Long(-6723783499250797216L);
        term868 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term868, term868.getClass(), "startCreateTime", term869);
        setField(term868, term868.getClass(), "endCreateTime", term871);
        setField(term868, term868.getClass(), "id", term873);
        setField(term868, term868.getClass(), "userId", term875);
        setField(term868, term868.getClass(), "data", "OWDIEULEFu");
        setField(term868, term868.getClass(), "format", term889);
        setField(term868, term868.getClass(), "type", term891);
        setField(term868, term868.getClass(), "createTime", term893);
        setField(term868, term868.getClass(), "createTimeText", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term868;
        callMethod(klass, "listTimeDataByTime", argTypes, term843, args);
    }

};


