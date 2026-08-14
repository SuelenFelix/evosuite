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

public class DanmuAccountTaskModel_setUpdateTime_183661627224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4790;
     Object term4837;

    public DanmuAccountTaskModel_setUpdateTime_183661627224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4791 = new Integer(9726679);
        Integer term4793 = new Integer(-25637976);
        Integer term4819 = new Integer(1555897383);
        Long term4821 = new Long(8107921244631636572L);
        Integer term4823 = new Integer(0);
        Integer term4825 = new Integer(0);
        Integer term4827 = new Integer(202001407);
        Boolean term4829 = new Boolean(false);
        Long term4831 = new Long(-7904053112604879960L);
        Long term4833 = new Long(-6602460430714339690L);
        Long term4835 = new Long(21047099434645581L);
        term4790 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4790, term4790.getClass(), "id", term4791);
        setField(term4790, term4790.getClass(), "danmuSenderTaskId", term4793);
        setField(term4790, term4790.getClass(), "senderUid", "PtirvZmsGt");
        setField(term4790, term4790.getClass(), "videoId", "HWkpTmtlrc");
        setField(term4790, term4790.getClass(), "lastVideoPartIndex", term4819);
        setField(term4790, term4790.getClass(), "lastVideoPartCid", term4821);
        setField(term4790, term4790.getClass(), "pageIndex", term4823);
        setField(term4790, term4790.getClass(), "pageSize", term4825);
        setField(term4790, term4790.getClass(), "lastDanmuIndex", term4827);
        setField(term4790, term4790.getClass(), "stop", term4829);
        setField(term4790, term4790.getClass(), "createTime", term4831);
        setField(term4790, term4790.getClass(), "updateTime", term4833);
        setField(term4790, term4790.getClass(), "finishTime", term4835);
        term4837 = new Long(-8862087040734407227L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4837;
        callMethod(klass, "setUpdateTime", argTypes, term4790, args);
    }

};


