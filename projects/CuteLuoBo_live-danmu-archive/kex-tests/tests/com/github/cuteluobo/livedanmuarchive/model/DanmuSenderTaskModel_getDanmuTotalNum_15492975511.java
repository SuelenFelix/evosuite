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

public class DanmuSenderTaskModel_getDanmuTotalNum_15492975511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;

    public DanmuSenderTaskModel_getDanmuTotalNum_15492975511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term921 = new Integer(1725571209);
        Long term959 = new Long(1439298019805881866L);
        Long term961 = new Long(0L);
        Long term963 = new Long(0L);
        Integer term965 = new Integer(0);
        Boolean term967 = new Boolean(false);
        Boolean term969 = new Boolean(false);
        Long term971 = new Long(-8708192233349544946L);
        Long term973 = new Long(5907001541142728739L);
        Long term975 = new Long(4178434741742309755L);
        term920 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term920, term920.getClass(), "id", term921);
        setField(term920, term920.getClass(), "platform", "SbAoxhfrkn");
        setField(term920, term920.getClass(), "videoCreatorUid", "kuTXqwMtDB");
        setField(term920, term920.getClass(), "videoId", "Ghbwtircqb");
        setField(term920, term920.getClass(), "videoCreatedTime", term959);
        setField(term920, term920.getClass(), "danmuTotalNum", term961);
        setField(term920, term920.getClass(), "danmuSentNum", term963);
        setField(term920, term920.getClass(), "pageSize", term965);
        setField(term920, term920.getClass(), "skip", term967);
        setField(term920, term920.getClass(), "taskFail", term969);
        setField(term920, term920.getClass(), "createTime", term971);
        setField(term920, term920.getClass(), "updateTime", term973);
        setField(term920, term920.getClass(), "finishTime", term975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanmuTotalNum", argTypes, term920, args);
    }

};


