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

public class DanmuAccountTaskModel_setLastVideoPartIndex_141100620210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3838;
     Object term3885;

    public DanmuAccountTaskModel_setLastVideoPartIndex_141100620210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3839 = new Integer(-1465035361);
        Integer term3841 = new Integer(1090617576);
        Integer term3867 = new Integer(-1547384488);
        Long term3869 = new Long(-3730936709704460408L);
        Integer term3871 = new Integer(0);
        Integer term3873 = new Integer(0);
        Integer term3875 = new Integer(1442160736);
        Boolean term3877 = new Boolean(false);
        Long term3879 = new Long(-8614778293741404325L);
        Long term3881 = new Long(-5447369594017685765L);
        Long term3883 = new Long(-5724112525188606013L);
        term3838 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3838, term3838.getClass(), "id", term3839);
        setField(term3838, term3838.getClass(), "danmuSenderTaskId", term3841);
        setField(term3838, term3838.getClass(), "senderUid", "SdCKLMIYnX");
        setField(term3838, term3838.getClass(), "videoId", "OJJtVNPyKZ");
        setField(term3838, term3838.getClass(), "lastVideoPartIndex", term3867);
        setField(term3838, term3838.getClass(), "lastVideoPartCid", term3869);
        setField(term3838, term3838.getClass(), "pageIndex", term3871);
        setField(term3838, term3838.getClass(), "pageSize", term3873);
        setField(term3838, term3838.getClass(), "lastDanmuIndex", term3875);
        setField(term3838, term3838.getClass(), "stop", term3877);
        setField(term3838, term3838.getClass(), "createTime", term3879);
        setField(term3838, term3838.getClass(), "updateTime", term3881);
        setField(term3838, term3838.getClass(), "finishTime", term3883);
        term3885 = new Integer(1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3885;
        callMethod(klass, "setLastVideoPartIndex", argTypes, term3838, args);
    }

};


