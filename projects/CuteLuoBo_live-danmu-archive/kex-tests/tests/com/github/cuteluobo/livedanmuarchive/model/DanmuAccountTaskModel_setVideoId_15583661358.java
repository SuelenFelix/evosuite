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

public class DanmuAccountTaskModel_setVideoId_15583661358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3682;

    public DanmuAccountTaskModel_setVideoId_15583661358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3683 = new Integer(-2027534003);
        Integer term3685 = new Integer(1063420942);
        Integer term3711 = new Integer(1375330971);
        Long term3713 = new Long(-8121849829073967555L);
        Integer term3715 = new Integer(0);
        Integer term3717 = new Integer(0);
        Integer term3719 = new Integer(-478195677);
        Boolean term3721 = new Boolean(false);
        Long term3723 = new Long(5219030281405653303L);
        Long term3725 = new Long(-8471550651709805183L);
        Long term3727 = new Long(-948292411727204525L);
        term3682 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3682, term3682.getClass(), "id", term3683);
        setField(term3682, term3682.getClass(), "danmuSenderTaskId", term3685);
        setField(term3682, term3682.getClass(), "senderUid", "AdxvLJhNLe");
        setField(term3682, term3682.getClass(), "videoId", "lHfTrWKMPk");
        setField(term3682, term3682.getClass(), "lastVideoPartIndex", term3711);
        setField(term3682, term3682.getClass(), "lastVideoPartCid", term3713);
        setField(term3682, term3682.getClass(), "pageIndex", term3715);
        setField(term3682, term3682.getClass(), "pageSize", term3717);
        setField(term3682, term3682.getClass(), "lastDanmuIndex", term3719);
        setField(term3682, term3682.getClass(), "stop", term3721);
        setField(term3682, term3682.getClass(), "createTime", term3723);
        setField(term3682, term3682.getClass(), "updateTime", term3725);
        setField(term3682, term3682.getClass(), "finishTime", term3727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setVideoId", argTypes, term3682, args);
    }

};


