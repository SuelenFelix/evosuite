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

public class DanmuAccountTaskModel_getLastDanmuIndex_58086175915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4179;

    public DanmuAccountTaskModel_getLastDanmuIndex_58086175915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4180 = new Integer(339854490);
        Integer term4182 = new Integer(-615654495);
        Integer term4208 = new Integer(-1476117762);
        Long term4210 = new Long(5973526439563541711L);
        Integer term4212 = new Integer(0);
        Integer term4214 = new Integer(0);
        Integer term4216 = new Integer(-341962980);
        Boolean term4218 = new Boolean(false);
        Long term4220 = new Long(5246058710498845622L);
        Long term4222 = new Long(4394651392080968777L);
        Long term4224 = new Long(-7310273014364148916L);
        term4179 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4179, term4179.getClass(), "id", term4180);
        setField(term4179, term4179.getClass(), "danmuSenderTaskId", term4182);
        setField(term4179, term4179.getClass(), "senderUid", "ZzIujlwVsw");
        setField(term4179, term4179.getClass(), "videoId", "LWyEaeIyAo");
        setField(term4179, term4179.getClass(), "lastVideoPartIndex", term4208);
        setField(term4179, term4179.getClass(), "lastVideoPartCid", term4210);
        setField(term4179, term4179.getClass(), "pageIndex", term4212);
        setField(term4179, term4179.getClass(), "pageSize", term4214);
        setField(term4179, term4179.getClass(), "lastDanmuIndex", term4216);
        setField(term4179, term4179.getClass(), "stop", term4218);
        setField(term4179, term4179.getClass(), "createTime", term4220);
        setField(term4179, term4179.getClass(), "updateTime", term4222);
        setField(term4179, term4179.getClass(), "finishTime", term4224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDanmuIndex", argTypes, term4179, args);
    }

};


