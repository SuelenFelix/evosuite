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

public class DanmuAccountTaskModel_toString_147318780527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4995;

    public DanmuAccountTaskModel_toString_147318780527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4996 = new Integer(1830648570);
        Integer term4998 = new Integer(-227365013);
        Integer term5024 = new Integer(11724947);
        Long term5026 = new Long(3752337209837437327L);
        Integer term5028 = new Integer(0);
        Integer term5030 = new Integer(0);
        Integer term5032 = new Integer(1953277050);
        Boolean term5034 = new Boolean(false);
        Long term5036 = new Long(1860789353508856614L);
        Long term5038 = new Long(-7456852906235966771L);
        Long term5040 = new Long(-67485388932970712L);
        term4995 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4995, term4995.getClass(), "id", term4996);
        setField(term4995, term4995.getClass(), "danmuSenderTaskId", term4998);
        setField(term4995, term4995.getClass(), "senderUid", "DbiCVtPPCT");
        setField(term4995, term4995.getClass(), "videoId", "WzFopsaDuG");
        setField(term4995, term4995.getClass(), "lastVideoPartIndex", term5024);
        setField(term4995, term4995.getClass(), "lastVideoPartCid", term5026);
        setField(term4995, term4995.getClass(), "pageIndex", term5028);
        setField(term4995, term4995.getClass(), "pageSize", term5030);
        setField(term4995, term4995.getClass(), "lastDanmuIndex", term5032);
        setField(term4995, term4995.getClass(), "stop", term5034);
        setField(term4995, term4995.getClass(), "createTime", term5036);
        setField(term4995, term4995.getClass(), "updateTime", term5038);
        setField(term4995, term4995.getClass(), "finishTime", term5040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4995, args);
    }

};


