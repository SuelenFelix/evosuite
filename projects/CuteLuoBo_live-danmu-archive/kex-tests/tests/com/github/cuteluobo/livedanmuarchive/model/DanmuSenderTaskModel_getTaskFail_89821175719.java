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

public class DanmuSenderTaskModel_getTaskFail_89821175719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624;

    public DanmuSenderTaskModel_getTaskFail_89821175719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1625 = new Integer(1048535127);
        Long term1663 = new Long(-6723783499250797216L);
        Long term1665 = new Long(0L);
        Long term1667 = new Long(0L);
        Integer term1669 = new Integer(0);
        Boolean term1671 = new Boolean(false);
        Boolean term1673 = new Boolean(false);
        Long term1675 = new Long(41775768178052008L);
        Long term1677 = new Long(6682528376118987775L);
        Long term1679 = new Long(682356318767179819L);
        term1624 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1624, term1624.getClass(), "id", term1625);
        setField(term1624, term1624.getClass(), "platform", "MLqYREekMl");
        setField(term1624, term1624.getClass(), "videoCreatorUid", "ytSBIKXogI");
        setField(term1624, term1624.getClass(), "videoId", "nHXjMycHlU");
        setField(term1624, term1624.getClass(), "videoCreatedTime", term1663);
        setField(term1624, term1624.getClass(), "danmuTotalNum", term1665);
        setField(term1624, term1624.getClass(), "danmuSentNum", term1667);
        setField(term1624, term1624.getClass(), "pageSize", term1669);
        setField(term1624, term1624.getClass(), "skip", term1671);
        setField(term1624, term1624.getClass(), "taskFail", term1673);
        setField(term1624, term1624.getClass(), "createTime", term1675);
        setField(term1624, term1624.getClass(), "updateTime", term1677);
        setField(term1624, term1624.getClass(), "finishTime", term1679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskFail", argTypes, term1624, args);
    }

};


