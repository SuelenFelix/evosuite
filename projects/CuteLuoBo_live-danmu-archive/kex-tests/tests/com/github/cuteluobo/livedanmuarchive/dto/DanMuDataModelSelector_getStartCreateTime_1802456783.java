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

public class DanMuDataModelSelector_getStartCreateTime_1802456783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3047;

    public DanMuDataModelSelector_getStartCreateTime_1802456783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3048 = new Long(7950532649535587877L);
        Long term3050 = new Long(7799452759993694308L);
        Long term3052 = new Long(-1571034605670661708L);
        Integer term3054 = new Integer(890669485);
        Integer term3068 = new Integer(691577392);
        Integer term3070 = new Integer(-893623680);
        Long term3072 = new Long(-7983954942068142191L);
        term3047 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3047, term3047.getClass(), "startCreateTime", term3048);
        setField(term3047, term3047.getClass(), "endCreateTime", term3050);
        setField(term3047, term3047.getClass(), "id", term3052);
        setField(term3047, term3047.getClass(), "userId", term3054);
        setField(term3047, term3047.getClass(), "data", "idgaQsnJpQ");
        setField(term3047, term3047.getClass(), "format", term3068);
        setField(term3047, term3047.getClass(), "type", term3070);
        setField(term3047, term3047.getClass(), "createTime", term3072);
        setField(term3047, term3047.getClass(), "createTimeText", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term3047, args);
    }

};


