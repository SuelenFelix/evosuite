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

public class DanmuAccountTaskModel_getSenderUid_12674535965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3459;

    public DanmuAccountTaskModel_getSenderUid_12674535965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3460 = new Integer(1225272962);
        Integer term3462 = new Integer(1324040357);
        Integer term3488 = new Integer(-1588772968);
        Long term3490 = new Long(1457594663983990440L);
        Integer term3492 = new Integer(0);
        Integer term3494 = new Integer(0);
        Integer term3496 = new Integer(-93135961);
        Boolean term3498 = new Boolean(false);
        Long term3500 = new Long(3452833434644634217L);
        Long term3502 = new Long(-8603648071751666348L);
        Long term3504 = new Long(-7884871963229073324L);
        term3459 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3459, term3459.getClass(), "id", term3460);
        setField(term3459, term3459.getClass(), "danmuSenderTaskId", term3462);
        setField(term3459, term3459.getClass(), "senderUid", "XylxrMBraH");
        setField(term3459, term3459.getClass(), "videoId", "pORebkoRdD");
        setField(term3459, term3459.getClass(), "lastVideoPartIndex", term3488);
        setField(term3459, term3459.getClass(), "lastVideoPartCid", term3490);
        setField(term3459, term3459.getClass(), "pageIndex", term3492);
        setField(term3459, term3459.getClass(), "pageSize", term3494);
        setField(term3459, term3459.getClass(), "lastDanmuIndex", term3496);
        setField(term3459, term3459.getClass(), "stop", term3498);
        setField(term3459, term3459.getClass(), "createTime", term3500);
        setField(term3459, term3459.getClass(), "updateTime", term3502);
        setField(term3459, term3459.getClass(), "finishTime", term3504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSenderUid", argTypes, term3459, args);
    }

};


