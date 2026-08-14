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

public class DanmuSenderTaskModel_equals_197151102830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2591;
     Object term2648;

    public DanmuSenderTaskModel_equals_197151102830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2592 = new Integer(-203030934);
        Long term2630 = new Long(-7268507582722666254L);
        Long term2632 = new Long(0L);
        Long term2634 = new Long(0L);
        Integer term2636 = new Integer(0);
        Boolean term2638 = new Boolean(false);
        Boolean term2640 = new Boolean(false);
        Long term2642 = new Long(5671808784468963649L);
        Long term2644 = new Long(2297097306706899827L);
        Long term2646 = new Long(-900457279156388404L);
        term2591 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2591, term2591.getClass(), "id", term2592);
        setField(term2591, term2591.getClass(), "platform", "swZVeJAxjt");
        setField(term2591, term2591.getClass(), "videoCreatorUid", "xOcJIiQQDu");
        setField(term2591, term2591.getClass(), "videoId", "GVizqqzXpy");
        setField(term2591, term2591.getClass(), "videoCreatedTime", term2630);
        setField(term2591, term2591.getClass(), "danmuTotalNum", term2632);
        setField(term2591, term2591.getClass(), "danmuSentNum", term2634);
        setField(term2591, term2591.getClass(), "pageSize", term2636);
        setField(term2591, term2591.getClass(), "skip", term2638);
        setField(term2591, term2591.getClass(), "taskFail", term2640);
        setField(term2591, term2591.getClass(), "createTime", term2642);
        setField(term2591, term2591.getClass(), "updateTime", term2644);
        setField(term2591, term2591.getClass(), "finishTime", term2646);
        term2648 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2648;
        callMethod(klass, "equals", argTypes, term2591, args);
    }

};


