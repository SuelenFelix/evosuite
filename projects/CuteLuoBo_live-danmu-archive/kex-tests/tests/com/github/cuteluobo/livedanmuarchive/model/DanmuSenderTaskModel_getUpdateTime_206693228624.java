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

public class DanmuSenderTaskModel_getUpdateTime_206693228624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2065;

    public DanmuSenderTaskModel_getUpdateTime_206693228624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2066 = new Integer(-1007160944);
        Long term2104 = new Long(-8463029266761149071L);
        Long term2106 = new Long(0L);
        Long term2108 = new Long(0L);
        Integer term2110 = new Integer(0);
        Boolean term2112 = new Boolean(false);
        Boolean term2114 = new Boolean(false);
        Long term2116 = new Long(3133860696238261492L);
        Long term2118 = new Long(7247160664318067468L);
        Long term2120 = new Long(2135754395358000892L);
        term2065 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2065, term2065.getClass(), "id", term2066);
        setField(term2065, term2065.getClass(), "platform", "JUmudUmaaV");
        setField(term2065, term2065.getClass(), "videoCreatorUid", "KoyGrUJeJW");
        setField(term2065, term2065.getClass(), "videoId", "HqBOwkVqjD");
        setField(term2065, term2065.getClass(), "videoCreatedTime", term2104);
        setField(term2065, term2065.getClass(), "danmuTotalNum", term2106);
        setField(term2065, term2065.getClass(), "danmuSentNum", term2108);
        setField(term2065, term2065.getClass(), "pageSize", term2110);
        setField(term2065, term2065.getClass(), "skip", term2112);
        setField(term2065, term2065.getClass(), "taskFail", term2114);
        setField(term2065, term2065.getClass(), "createTime", term2116);
        setField(term2065, term2065.getClass(), "updateTime", term2118);
        setField(term2065, term2065.getClass(), "finishTime", term2120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term2065, args);
    }

};


