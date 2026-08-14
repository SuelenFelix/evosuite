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

public class DanmuAccountTaskModel_setId_8265663412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3254;
     Object term3301;

    public DanmuAccountTaskModel_setId_8265663412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3255 = new Integer(1632125673);
        Integer term3257 = new Integer(454281060);
        Integer term3283 = new Integer(-1786399638);
        Long term3285 = new Long(-7115418542247301000L);
        Integer term3287 = new Integer(0);
        Integer term3289 = new Integer(0);
        Integer term3291 = new Integer(2055867847);
        Boolean term3293 = new Boolean(false);
        Long term3295 = new Long(8034714140377562739L);
        Long term3297 = new Long(-2924531382671518368L);
        Long term3299 = new Long(-3948863953565024517L);
        term3254 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3254, term3254.getClass(), "id", term3255);
        setField(term3254, term3254.getClass(), "danmuSenderTaskId", term3257);
        setField(term3254, term3254.getClass(), "senderUid", "SJiQaLvSKv");
        setField(term3254, term3254.getClass(), "videoId", "OEXDRUKcFl");
        setField(term3254, term3254.getClass(), "lastVideoPartIndex", term3283);
        setField(term3254, term3254.getClass(), "lastVideoPartCid", term3285);
        setField(term3254, term3254.getClass(), "pageIndex", term3287);
        setField(term3254, term3254.getClass(), "pageSize", term3289);
        setField(term3254, term3254.getClass(), "lastDanmuIndex", term3291);
        setField(term3254, term3254.getClass(), "stop", term3293);
        setField(term3254, term3254.getClass(), "createTime", term3295);
        setField(term3254, term3254.getClass(), "updateTime", term3297);
        setField(term3254, term3254.getClass(), "finishTime", term3299);
        term3301 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3301;
        callMethod(klass, "setId", argTypes, term3254, args);
    }

};


