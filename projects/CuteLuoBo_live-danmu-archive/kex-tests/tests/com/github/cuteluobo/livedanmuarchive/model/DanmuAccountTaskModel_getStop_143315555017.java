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

public class DanmuAccountTaskModel_getStop_143315555017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315;

    public DanmuAccountTaskModel_getStop_143315555017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4316 = new Integer(-893623680);
        Integer term4318 = new Integer(-1963434938);
        Integer term4344 = new Integer(906181092);
        Long term4346 = new Long(-2338103433822116635L);
        Integer term4348 = new Integer(0);
        Integer term4350 = new Integer(0);
        Integer term4352 = new Integer(1045657203);
        Boolean term4354 = new Boolean(false);
        Long term4356 = new Long(-1885698929232124806L);
        Long term4358 = new Long(5731563613239387113L);
        Long term4360 = new Long(3381333711768010594L);
        term4315 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4315, term4315.getClass(), "id", term4316);
        setField(term4315, term4315.getClass(), "danmuSenderTaskId", term4318);
        setField(term4315, term4315.getClass(), "senderUid", "pXOkjyeIRb");
        setField(term4315, term4315.getClass(), "videoId", "GgZWSjxjyE");
        setField(term4315, term4315.getClass(), "lastVideoPartIndex", term4344);
        setField(term4315, term4315.getClass(), "lastVideoPartCid", term4346);
        setField(term4315, term4315.getClass(), "pageIndex", term4348);
        setField(term4315, term4315.getClass(), "pageSize", term4350);
        setField(term4315, term4315.getClass(), "lastDanmuIndex", term4352);
        setField(term4315, term4315.getClass(), "stop", term4354);
        setField(term4315, term4315.getClass(), "createTime", term4356);
        setField(term4315, term4315.getClass(), "updateTime", term4358);
        setField(term4315, term4315.getClass(), "finishTime", term4360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStop", argTypes, term4315, args);
    }

};


