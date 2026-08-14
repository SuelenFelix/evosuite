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

public class DanmuSenderTaskModel_setFinishTime_8095217427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2328;
     Object term2385;

    public DanmuSenderTaskModel_setFinishTime_8095217427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2329 = new Integer(865208305);
        Long term2367 = new Long(2354625302846375590L);
        Long term2369 = new Long(0L);
        Long term2371 = new Long(0L);
        Integer term2373 = new Integer(0);
        Boolean term2375 = new Boolean(false);
        Boolean term2377 = new Boolean(false);
        Long term2379 = new Long(7276637106827860087L);
        Long term2381 = new Long(-3936701866695933852L);
        Long term2383 = new Long(1215116475929634177L);
        term2328 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2328, term2328.getClass(), "id", term2329);
        setField(term2328, term2328.getClass(), "platform", "VgZnGoIFwQ");
        setField(term2328, term2328.getClass(), "videoCreatorUid", "jUbSRrkrYZ");
        setField(term2328, term2328.getClass(), "videoId", "bWWfajKbEX");
        setField(term2328, term2328.getClass(), "videoCreatedTime", term2367);
        setField(term2328, term2328.getClass(), "danmuTotalNum", term2369);
        setField(term2328, term2328.getClass(), "danmuSentNum", term2371);
        setField(term2328, term2328.getClass(), "pageSize", term2373);
        setField(term2328, term2328.getClass(), "skip", term2375);
        setField(term2328, term2328.getClass(), "taskFail", term2377);
        setField(term2328, term2328.getClass(), "createTime", term2379);
        setField(term2328, term2328.getClass(), "updateTime", term2381);
        setField(term2328, term2328.getClass(), "finishTime", term2383);
        term2385 = new Long(1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2385;
        callMethod(klass, "setFinishTime", argTypes, term2328, args);
    }

};


