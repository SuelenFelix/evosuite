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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class SqliteDanMuFormatExportService_appendDanMuUserInfoTemp_13389981081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public SqliteDanMuFormatExportService_appendDanMuUserInfoTemp_13389981081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        Integer term7 = new Integer(568599855);
        Long term9 = new Long(2442117782898005296L);
        Object term6 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term6, term6.getClass(), "id", term7);
        setField(term6, term6.getClass(), "addTime", term9);
        setField(term6, term6.getClass(), "uid", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "nickName", "sjlJAEtRrb");
        Integer term37 = new Integer(1162663216);
        Long term39 = new Long(6375119433582206027L);
        Object term36 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term36, term36.getClass(), "id", term37);
        setField(term36, term36.getClass(), "addTime", term39);
        setField(term36, term36.getClass(), "uid", "");
        setField(term36, term36.getClass(), "nickName", "");
        Integer term45 = new Integer(1484323161);
        Long term47 = new Long(-8257434502486459194L);
        Object term44 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term44, term44.getClass(), "id", term45);
        setField(term44, term44.getClass(), "addTime", term47);
        setField(term44, term44.getClass(), "uid", null);
        setField(term44, term44.getClass(), "nickName", null);
        term3 = new LinkedList();
        ((LinkedList) term3).add(term6);
        ((LinkedList) term3).add(term36);
        ((LinkedList) term3).add(term44);
        ((LinkedList) term3).add((Object)null);
        ((LinkedList) term3).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.SqliteDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        callMethod(klass, "appendDanMuUserInfoTemp", argTypes, null, args);
    }

};


