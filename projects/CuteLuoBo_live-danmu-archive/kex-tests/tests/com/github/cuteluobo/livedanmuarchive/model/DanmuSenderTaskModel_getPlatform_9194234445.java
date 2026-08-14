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

public class DanmuSenderTaskModel_getPlatform_9194234445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public DanmuSenderTaskModel_getPlatform_9194234445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term333 = new Integer(-1922583790);
        Long term371 = new Long(2535595959091595249L);
        Long term373 = new Long(0L);
        Long term375 = new Long(0L);
        Integer term377 = new Integer(0);
        Boolean term379 = new Boolean(false);
        Boolean term381 = new Boolean(false);
        Long term383 = new Long(-5476826692763582090L);
        Long term385 = new Long(-872011222785455006L);
        Long term387 = new Long(-316468845751588286L);
        term332 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "platform", "MxlszYVzRf");
        setField(term332, term332.getClass(), "videoCreatorUid", "LQFpaHEwXR");
        setField(term332, term332.getClass(), "videoId", "oVcInYnLWB");
        setField(term332, term332.getClass(), "videoCreatedTime", term371);
        setField(term332, term332.getClass(), "danmuTotalNum", term373);
        setField(term332, term332.getClass(), "danmuSentNum", term375);
        setField(term332, term332.getClass(), "pageSize", term377);
        setField(term332, term332.getClass(), "skip", term379);
        setField(term332, term332.getClass(), "taskFail", term381);
        setField(term332, term332.getClass(), "createTime", term383);
        setField(term332, term332.getClass(), "updateTime", term385);
        setField(term332, term332.getClass(), "finishTime", term387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term332, args);
    }

};


