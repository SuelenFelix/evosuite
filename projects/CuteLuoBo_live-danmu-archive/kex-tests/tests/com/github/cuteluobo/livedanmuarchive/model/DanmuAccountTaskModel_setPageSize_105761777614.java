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

public class DanmuAccountTaskModel_setPageSize_105761777614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4110;
     Object term4157;

    public DanmuAccountTaskModel_setPageSize_105761777614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4111 = new Integer(683666002);
        Integer term4113 = new Integer(1596213415);
        Integer term4139 = new Integer(-268815336);
        Long term4141 = new Long(-8327432141027603933L);
        Integer term4143 = new Integer(0);
        Integer term4145 = new Integer(0);
        Integer term4147 = new Integer(-1210583429);
        Boolean term4149 = new Boolean(false);
        Long term4151 = new Long(-433040798405298080L);
        Long term4153 = new Long(-1505191021111100819L);
        Long term4155 = new Long(-1000830646340880796L);
        term4110 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4110, term4110.getClass(), "id", term4111);
        setField(term4110, term4110.getClass(), "danmuSenderTaskId", term4113);
        setField(term4110, term4110.getClass(), "senderUid", "VMeAzAHwZj");
        setField(term4110, term4110.getClass(), "videoId", "PznxWXsZME");
        setField(term4110, term4110.getClass(), "lastVideoPartIndex", term4139);
        setField(term4110, term4110.getClass(), "lastVideoPartCid", term4141);
        setField(term4110, term4110.getClass(), "pageIndex", term4143);
        setField(term4110, term4110.getClass(), "pageSize", term4145);
        setField(term4110, term4110.getClass(), "lastDanmuIndex", term4147);
        setField(term4110, term4110.getClass(), "stop", term4149);
        setField(term4110, term4110.getClass(), "createTime", term4151);
        setField(term4110, term4110.getClass(), "updateTime", term4153);
        setField(term4110, term4110.getClass(), "finishTime", term4155);
        term4157 = new Integer(-663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4157;
        callMethod(klass, "setPageSize", argTypes, term4110, args);
    }

};


