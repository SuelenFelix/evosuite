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

public class DanmuAccountTaskModel_setSenderUid_14302110366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3526;

    public DanmuAccountTaskModel_setSenderUid_14302110366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3527 = new Integer(-112921587);
        Integer term3529 = new Integer(933028652);
        Integer term3555 = new Integer(287287233);
        Long term3557 = new Long(-8649738738252714180L);
        Integer term3559 = new Integer(0);
        Integer term3561 = new Integer(0);
        Integer term3563 = new Integer(962840079);
        Boolean term3565 = new Boolean(false);
        Long term3567 = new Long(-7278883608542636188L);
        Long term3569 = new Long(-1539859611880912454L);
        Long term3571 = new Long(4100236067313034103L);
        term3526 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3526, term3526.getClass(), "id", term3527);
        setField(term3526, term3526.getClass(), "danmuSenderTaskId", term3529);
        setField(term3526, term3526.getClass(), "senderUid", "mXGCWJDOqA");
        setField(term3526, term3526.getClass(), "videoId", "dpNsDgfPso");
        setField(term3526, term3526.getClass(), "lastVideoPartIndex", term3555);
        setField(term3526, term3526.getClass(), "lastVideoPartCid", term3557);
        setField(term3526, term3526.getClass(), "pageIndex", term3559);
        setField(term3526, term3526.getClass(), "pageSize", term3561);
        setField(term3526, term3526.getClass(), "lastDanmuIndex", term3563);
        setField(term3526, term3526.getClass(), "stop", term3565);
        setField(term3526, term3526.getClass(), "createTime", term3567);
        setField(term3526, term3526.getClass(), "updateTime", term3569);
        setField(term3526, term3526.getClass(), "finishTime", term3571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setSenderUid", argTypes, term3526, args);
    }

};


