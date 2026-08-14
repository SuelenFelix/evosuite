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

public class DanMuDataModelSelector_getEndCreateTime_1980366835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3167;

    public DanMuDataModelSelector_getEndCreateTime_1980366835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3168 = new Long(-2083524977884307536L);
        Long term3170 = new Long(-2691996476200751382L);
        Long term3172 = new Long(-3806202176947356197L);
        Integer term3174 = new Integer(1386130016);
        Integer term3188 = new Integer(1072005683);
        Integer term3190 = new Integer(1861318859);
        Long term3192 = new Long(-5534222035915952617L);
        term3167 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3167, term3167.getClass(), "startCreateTime", term3168);
        setField(term3167, term3167.getClass(), "endCreateTime", term3170);
        setField(term3167, term3167.getClass(), "id", term3172);
        setField(term3167, term3167.getClass(), "userId", term3174);
        setField(term3167, term3167.getClass(), "data", "cAPeiZHKGJ");
        setField(term3167, term3167.getClass(), "format", term3188);
        setField(term3167, term3167.getClass(), "type", term3190);
        setField(term3167, term3167.getClass(), "createTime", term3192);
        setField(term3167, term3167.getClass(), "createTimeText", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndCreateTime", argTypes, term3167, args);
    }

};


