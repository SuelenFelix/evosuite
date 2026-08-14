package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModelSelector_setEndCreateTime_13720810036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;
     Object term3265;

    public DanMuDataModelSelector_setEndCreateTime_13720810036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3227 = new Long(8073378116544724166L);
        Long term3229 = new Long(-8303973304709662279L);
        Long term3231 = new Long(6853972830905120647L);
        Integer term3233 = new Integer(1474524152);
        Integer term3247 = new Integer(568954359);
        Integer term3249 = new Integer(53410913);
        Long term3251 = new Long(1442167273909860961L);
        term3226 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3226, term3226.getClass(), "startCreateTime", term3227);
        setField(term3226, term3226.getClass(), "endCreateTime", term3229);
        setField(term3226, term3226.getClass(), "id", term3231);
        setField(term3226, term3226.getClass(), "userId", term3233);
        setField(term3226, term3226.getClass(), "data", "PHvxnGHptP");
        setField(term3226, term3226.getClass(), "format", term3247);
        setField(term3226, term3226.getClass(), "type", term3249);
        setField(term3226, term3226.getClass(), "createTime", term3251);
        setField(term3226, term3226.getClass(), "createTimeText", "TimdotUuNC");
        term3265 = new Long(6895382576300001141L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3265;
        callMethod(klass, "setEndCreateTime", argTypes, term3226, args);
    }

};


