package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanmuSenderTaskModel_setPageSize_142763469216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1359;
     Object term1416;

    public DanmuSenderTaskModel_setPageSize_142763469216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1360 = new Integer(597278769);
        Long term1398 = new Long(3892018155439224435L);
        Long term1400 = new Long(0L);
        Long term1402 = new Long(0L);
        Integer term1404 = new Integer(0);
        Boolean term1406 = new Boolean(false);
        Boolean term1408 = new Boolean(false);
        Long term1410 = new Long(5953383087795962419L);
        Long term1412 = new Long(7994303628307559416L);
        Long term1414 = new Long(2443640364875054177L);
        term1359 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1359, term1359.getClass(), "id", term1360);
        setField(term1359, term1359.getClass(), "platform", "xLbjWUgOIL");
        setField(term1359, term1359.getClass(), "videoCreatorUid", "jDtqGUpnZN");
        setField(term1359, term1359.getClass(), "videoId", "nGKItKLYNC");
        setField(term1359, term1359.getClass(), "videoCreatedTime", term1398);
        setField(term1359, term1359.getClass(), "danmuTotalNum", term1400);
        setField(term1359, term1359.getClass(), "danmuSentNum", term1402);
        setField(term1359, term1359.getClass(), "pageSize", term1404);
        setField(term1359, term1359.getClass(), "skip", term1406);
        setField(term1359, term1359.getClass(), "taskFail", term1408);
        setField(term1359, term1359.getClass(), "createTime", term1410);
        setField(term1359, term1359.getClass(), "updateTime", term1412);
        setField(term1359, term1359.getClass(), "finishTime", term1414);
        term1416 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1416;
        callMethod(klass, "setPageSize", argTypes, term1359, args);
    }

};


