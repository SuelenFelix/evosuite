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

public class BatchSqliteDanMuReader_readAll_17145650392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;
     Object term608;

    public BatchSqliteDanMuReader_readAll_17145650392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        HashMap term588 = new HashMap();
        HashMap term598 = new HashMap();
        term583 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term583, term583.getClass(), "danMuReaderList", term584);
        setField(term583, term583.getClass(), "startTimeMap", term588);
        setField(term583, term583.getClass(), "endTimeMap", term598);
        Long term609 = new Long(-5788180182343976541L);
        Long term611 = new Long(2936323121573284007L);
        Long term613 = new Long(-1154553077993834885L);
        Integer term615 = new Integer(-1530420153);
        Integer term629 = new Integer(-469968304);
        Integer term631 = new Integer(-1145578966);
        Long term633 = new Long(-2850532706972744550L);
        term608 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term608, term608.getClass(), "startCreateTime", term609);
        setField(term608, term608.getClass(), "endCreateTime", term611);
        setField(term608, term608.getClass(), "id", term613);
        setField(term608, term608.getClass(), "userId", term615);
        setField(term608, term608.getClass(), "data", "BYqFIqCKAV");
        setField(term608, term608.getClass(), "format", term629);
        setField(term608, term608.getClass(), "type", term631);
        setField(term608, term608.getClass(), "createTime", term633);
        setField(term608, term608.getClass(), "createTimeText", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term608;
        callMethod(klass, "readAll", argTypes, term583, args);
    }

};


