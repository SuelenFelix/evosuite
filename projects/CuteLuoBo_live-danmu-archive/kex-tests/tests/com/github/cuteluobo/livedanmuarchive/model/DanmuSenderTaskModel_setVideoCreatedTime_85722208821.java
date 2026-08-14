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

public class DanmuSenderTaskModel_setVideoCreatedTime_85722208821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1800;
     Object term1857;

    public DanmuSenderTaskModel_setVideoCreatedTime_85722208821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1801 = new Integer(-6029667);
        Long term1839 = new Long(50358265865610362L);
        Long term1841 = new Long(0L);
        Long term1843 = new Long(0L);
        Integer term1845 = new Integer(0);
        Boolean term1847 = new Boolean(false);
        Boolean term1849 = new Boolean(false);
        Long term1851 = new Long(5510783420697225605L);
        Long term1853 = new Long(6005241913654469005L);
        Long term1855 = new Long(-1983291584002806658L);
        term1800 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1800, term1800.getClass(), "id", term1801);
        setField(term1800, term1800.getClass(), "platform", "eqJfYWRaEL");
        setField(term1800, term1800.getClass(), "videoCreatorUid", "fhkbdRViHi");
        setField(term1800, term1800.getClass(), "videoId", "uWHnvSvaPl");
        setField(term1800, term1800.getClass(), "videoCreatedTime", term1839);
        setField(term1800, term1800.getClass(), "danmuTotalNum", term1841);
        setField(term1800, term1800.getClass(), "danmuSentNum", term1843);
        setField(term1800, term1800.getClass(), "pageSize", term1845);
        setField(term1800, term1800.getClass(), "skip", term1847);
        setField(term1800, term1800.getClass(), "taskFail", term1849);
        setField(term1800, term1800.getClass(), "createTime", term1851);
        setField(term1800, term1800.getClass(), "updateTime", term1853);
        setField(term1800, term1800.getClass(), "finishTime", term1855);
        term1857 = new Long(5946780097489996391L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1857;
        callMethod(klass, "setVideoCreatedTime", argTypes, term1800, args);
    }

};


