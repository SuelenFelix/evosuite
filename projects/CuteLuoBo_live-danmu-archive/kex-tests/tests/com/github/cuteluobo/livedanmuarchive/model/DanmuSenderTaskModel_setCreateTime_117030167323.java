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

public class DanmuSenderTaskModel_setCreateTime_117030167323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976;
     Object term2033;

    public DanmuSenderTaskModel_setCreateTime_117030167323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1977 = new Integer(-117576464);
        Long term2015 = new Long(-8876856890348836498L);
        Long term2017 = new Long(0L);
        Long term2019 = new Long(0L);
        Integer term2021 = new Integer(0);
        Boolean term2023 = new Boolean(false);
        Boolean term2025 = new Boolean(false);
        Long term2027 = new Long(846579494941632714L);
        Long term2029 = new Long(6689117472719450333L);
        Long term2031 = new Long(5836128569274066678L);
        term1976 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1976, term1976.getClass(), "id", term1977);
        setField(term1976, term1976.getClass(), "platform", "bLPjGVBhlX");
        setField(term1976, term1976.getClass(), "videoCreatorUid", "whBvTVIIlC");
        setField(term1976, term1976.getClass(), "videoId", "IgRJUzaCwW");
        setField(term1976, term1976.getClass(), "videoCreatedTime", term2015);
        setField(term1976, term1976.getClass(), "danmuTotalNum", term2017);
        setField(term1976, term1976.getClass(), "danmuSentNum", term2019);
        setField(term1976, term1976.getClass(), "pageSize", term2021);
        setField(term1976, term1976.getClass(), "skip", term2023);
        setField(term1976, term1976.getClass(), "taskFail", term2025);
        setField(term1976, term1976.getClass(), "createTime", term2027);
        setField(term1976, term1976.getClass(), "updateTime", term2029);
        setField(term1976, term1976.getClass(), "finishTime", term2031);
        term2033 = new Long(-2177368829816872572L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2033;
        callMethod(klass, "setCreateTime", argTypes, term1976, args);
    }

};


