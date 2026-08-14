package com.github.cuteluobo.livedanmuarchive.mapper.danmu;

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
import static com.github.cuteluobo.livedanmuarchive.mapper.danmu.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModelMapper_listPage_11332833710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term66;
     Object term68;

    public DanMuDataModelMapper_listPage_11332833710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28 = new Long(2442117782898005296L);
        Long term30 = new Long(6375119433582206027L);
        Long term32 = new Long(-8257434502486459194L);
        Integer term34 = new Integer(568599855);
        Integer term48 = new Integer(1162663216);
        Integer term50 = new Integer(1484323161);
        Long term52 = new Long(-8400487765614892086L);
        term27 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term27, term27.getClass(), "startCreateTime", term28);
        setField(term27, term27.getClass(), "endCreateTime", term30);
        setField(term27, term27.getClass(), "id", term32);
        setField(term27, term27.getClass(), "userId", term34);
        setField(term27, term27.getClass(), "data", "sjlJAEtRrb");
        setField(term27, term27.getClass(), "format", term48);
        setField(term27, term27.getClass(), "type", term50);
        setField(term27, term27.getClass(), "createTime", term52);
        setField(term27, term27.getClass(), "createTimeText", "MuLcgQHgqz");
        term66 = new Integer(568599855);
        term68 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.mapper.danmu.DanMuDataModelMapper");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term27;
        args[1] = term66;
        args[2] = term68;
        callMethod(klass, "listPage", argTypes, null, args);
    }

};


