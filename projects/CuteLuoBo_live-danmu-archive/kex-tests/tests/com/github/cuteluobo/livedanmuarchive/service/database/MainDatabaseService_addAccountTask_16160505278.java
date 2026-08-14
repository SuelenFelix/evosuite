package com.github.cuteluobo.livedanmuarchive.service.database;

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
import static com.github.cuteluobo.livedanmuarchive.service.database.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class MainDatabaseService_addAccountTask_16160505278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public MainDatabaseService_addAccountTask_16160505278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term477 = new Integer(-883034806);
        Integer term479 = new Integer(1585847225);
        Integer term505 = new Integer(597278769);
        Long term507 = new Long(-484994522244390100L);
        Integer term509 = new Integer(0);
        Integer term511 = new Integer(0);
        Integer term513 = new Integer(-1685132342);
        Boolean term515 = new Boolean(false);
        Long term517 = new Long(1233889271256172047L);
        Long term519 = new Long(6617340557564669657L);
        Long term521 = new Long(1439298019805881866L);
        term476 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term476, term476.getClass(), "id", term477);
        setField(term476, term476.getClass(), "danmuSenderTaskId", term479);
        setField(term476, term476.getClass(), "senderUid", "aJlieCFVtF");
        setField(term476, term476.getClass(), "videoId", "ZiaGIbnzTs");
        setField(term476, term476.getClass(), "lastVideoPartIndex", term505);
        setField(term476, term476.getClass(), "lastVideoPartCid", term507);
        setField(term476, term476.getClass(), "pageIndex", term509);
        setField(term476, term476.getClass(), "pageSize", term511);
        setField(term476, term476.getClass(), "lastDanmuIndex", term513);
        setField(term476, term476.getClass(), "stop", term515);
        setField(term476, term476.getClass(), "createTime", term517);
        setField(term476, term476.getClass(), "updateTime", term519);
        setField(term476, term476.getClass(), "finishTime", term521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "addAccountTask", argTypes, null, args);
    }

};


