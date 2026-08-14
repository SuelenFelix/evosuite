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

public class DanmuAccountTaskModel_setStop_78590356018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4382;
     Object term4429;

    public DanmuAccountTaskModel_setStop_78590356018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4383 = new Integer(1386130016);
        Integer term4385 = new Integer(1072005683);
        Integer term4411 = new Integer(1861318859);
        Long term4413 = new Long(3580984732036213717L);
        Integer term4415 = new Integer(0);
        Integer term4417 = new Integer(0);
        Integer term4419 = new Integer(1474524152);
        Boolean term4421 = new Boolean(false);
        Long term4423 = new Long(5330761990446327930L);
        Long term4425 = new Long(-3954795081650780841L);
        Long term4427 = new Long(3288791194263207397L);
        term4382 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4382, term4382.getClass(), "id", term4383);
        setField(term4382, term4382.getClass(), "danmuSenderTaskId", term4385);
        setField(term4382, term4382.getClass(), "senderUid", "EeBVbzjcCI");
        setField(term4382, term4382.getClass(), "videoId", "UfQtPRyWRC");
        setField(term4382, term4382.getClass(), "lastVideoPartIndex", term4411);
        setField(term4382, term4382.getClass(), "lastVideoPartCid", term4413);
        setField(term4382, term4382.getClass(), "pageIndex", term4415);
        setField(term4382, term4382.getClass(), "pageSize", term4417);
        setField(term4382, term4382.getClass(), "lastDanmuIndex", term4419);
        setField(term4382, term4382.getClass(), "stop", term4421);
        setField(term4382, term4382.getClass(), "createTime", term4423);
        setField(term4382, term4382.getClass(), "updateTime", term4425);
        setField(term4382, term4382.getClass(), "finishTime", term4427);
        term4429 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term4429;
        callMethod(klass, "setStop", argTypes, term4382, args);
    }

};


