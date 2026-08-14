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

public class DanmuSenderTaskModel_setSkip_169085847318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535;
     Object term1592;

    public DanmuSenderTaskModel_setSkip_169085847318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1536 = new Integer(1622346318);
        Long term1574 = new Long(463622836963501975L);
        Long term1576 = new Long(0L);
        Long term1578 = new Long(0L);
        Integer term1580 = new Integer(0);
        Boolean term1582 = new Boolean(false);
        Boolean term1584 = new Boolean(false);
        Long term1586 = new Long(305759998609888272L);
        Long term1588 = new Long(-8654565919063661957L);
        Long term1590 = new Long(-5248475803419977214L);
        term1535 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1535, term1535.getClass(), "id", term1536);
        setField(term1535, term1535.getClass(), "platform", "onpbIeEKoi");
        setField(term1535, term1535.getClass(), "videoCreatorUid", "YRHGsAkhxb");
        setField(term1535, term1535.getClass(), "videoId", "ffYhPOzlUs");
        setField(term1535, term1535.getClass(), "videoCreatedTime", term1574);
        setField(term1535, term1535.getClass(), "danmuTotalNum", term1576);
        setField(term1535, term1535.getClass(), "danmuSentNum", term1578);
        setField(term1535, term1535.getClass(), "pageSize", term1580);
        setField(term1535, term1535.getClass(), "skip", term1582);
        setField(term1535, term1535.getClass(), "taskFail", term1584);
        setField(term1535, term1535.getClass(), "createTime", term1586);
        setField(term1535, term1535.getClass(), "updateTime", term1588);
        setField(term1535, term1535.getClass(), "finishTime", term1590);
        term1592 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1592;
        callMethod(klass, "setSkip", argTypes, term1535, args);
    }

};


