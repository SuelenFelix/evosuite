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

public class DanmuAccountTaskModel_setPageIndex_15137475312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3974;
     Object term4021;

    public DanmuAccountTaskModel_setPageIndex_15137475312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3975 = new Integer(-344842608);
        Integer term3977 = new Integer(941650513);
        Integer term4003 = new Integer(444029505);
        Long term4005 = new Long(3090901538358721367L);
        Integer term4007 = new Integer(0);
        Integer term4009 = new Integer(0);
        Integer term4011 = new Integer(-1034506028);
        Boolean term4013 = new Boolean(false);
        Long term4015 = new Long(-1677189124507026637L);
        Long term4017 = new Long(4795660804170399986L);
        Long term4019 = new Long(-4030863184426321096L);
        term3974 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3974, term3974.getClass(), "id", term3975);
        setField(term3974, term3974.getClass(), "danmuSenderTaskId", term3977);
        setField(term3974, term3974.getClass(), "senderUid", "EYtfuJaxiM");
        setField(term3974, term3974.getClass(), "videoId", "gCWtLVKVVe");
        setField(term3974, term3974.getClass(), "lastVideoPartIndex", term4003);
        setField(term3974, term3974.getClass(), "lastVideoPartCid", term4005);
        setField(term3974, term3974.getClass(), "pageIndex", term4007);
        setField(term3974, term3974.getClass(), "pageSize", term4009);
        setField(term3974, term3974.getClass(), "lastDanmuIndex", term4011);
        setField(term3974, term3974.getClass(), "stop", term4013);
        setField(term3974, term3974.getClass(), "createTime", term4015);
        setField(term3974, term3974.getClass(), "updateTime", term4017);
        setField(term3974, term3974.getClass(), "finishTime", term4019);
        term4021 = new Integer(-1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4021;
        callMethod(klass, "setPageIndex", argTypes, term3974, args);
    }

};


