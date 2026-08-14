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

public class DanmuSenderTaskModel_toString_101206466329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;

    public DanmuSenderTaskModel_toString_101206466329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2505 = new Integer(-244121226);
        Long term2543 = new Long(-4924950707540628022L);
        Long term2545 = new Long(0L);
        Long term2547 = new Long(0L);
        Integer term2549 = new Integer(0);
        Boolean term2551 = new Boolean(false);
        Boolean term2553 = new Boolean(false);
        Long term2555 = new Long(-4393710401270724527L);
        Long term2557 = new Long(-4822736661741380518L);
        Long term2559 = new Long(-5386201758403679145L);
        term2504 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2504, term2504.getClass(), "id", term2505);
        setField(term2504, term2504.getClass(), "platform", "TimdotUuNC");
        setField(term2504, term2504.getClass(), "videoCreatorUid", "PkWMRdJcBb");
        setField(term2504, term2504.getClass(), "videoId", "jSpAteRute");
        setField(term2504, term2504.getClass(), "videoCreatedTime", term2543);
        setField(term2504, term2504.getClass(), "danmuTotalNum", term2545);
        setField(term2504, term2504.getClass(), "danmuSentNum", term2547);
        setField(term2504, term2504.getClass(), "pageSize", term2549);
        setField(term2504, term2504.getClass(), "skip", term2551);
        setField(term2504, term2504.getClass(), "taskFail", term2553);
        setField(term2504, term2504.getClass(), "createTime", term2555);
        setField(term2504, term2504.getClass(), "updateTime", term2557);
        setField(term2504, term2504.getClass(), "finishTime", term2559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2504, args);
    }

};


