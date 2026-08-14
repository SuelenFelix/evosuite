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

public class SqliteDanMuReader_countNum_14789014791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SqliteDanMuReader_countNum_14789014791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term4 = new Long(6375119433582206027L);
        Long term6 = new Long(-8257434502486459194L);
        Integer term8 = new Integer(568599855);
        Integer term22 = new Integer(1162663216);
        Integer term24 = new Integer(1484323161);
        Long term26 = new Long(-8400487765614892086L);
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term1, term1.getClass(), "startCreateTime", term2);
        setField(term1, term1.getClass(), "endCreateTime", term4);
        setField(term1, term1.getClass(), "id", term6);
        setField(term1, term1.getClass(), "userId", term8);
        setField(term1, term1.getClass(), "data", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "format", term22);
        setField(term1, term1.getClass(), "type", term24);
        setField(term1, term1.getClass(), "createTime", term26);
        setField(term1, term1.getClass(), "createTimeText", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "countNum", argTypes, null, args);
    }

};


