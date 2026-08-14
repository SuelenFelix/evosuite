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

public class DanmuSenderTaskModel_getCreateTime_40909714122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889;

    public DanmuSenderTaskModel_getCreateTime_40909714122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1890 = new Integer(-2068769794);
        Long term1928 = new Long(-8652538484981166496L);
        Long term1930 = new Long(0L);
        Long term1932 = new Long(0L);
        Integer term1934 = new Integer(0);
        Boolean term1936 = new Boolean(false);
        Boolean term1938 = new Boolean(false);
        Long term1940 = new Long(2701184207686293431L);
        Long term1942 = new Long(4474998035090263139L);
        Long term1944 = new Long(2848819812340321742L);
        term1889 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1889, term1889.getClass(), "id", term1890);
        setField(term1889, term1889.getClass(), "platform", "kBdSllIBVz");
        setField(term1889, term1889.getClass(), "videoCreatorUid", "TJmVBGfTML");
        setField(term1889, term1889.getClass(), "videoId", "tPlsykYBqO");
        setField(term1889, term1889.getClass(), "videoCreatedTime", term1928);
        setField(term1889, term1889.getClass(), "danmuTotalNum", term1930);
        setField(term1889, term1889.getClass(), "danmuSentNum", term1932);
        setField(term1889, term1889.getClass(), "pageSize", term1934);
        setField(term1889, term1889.getClass(), "skip", term1936);
        setField(term1889, term1889.getClass(), "taskFail", term1938);
        setField(term1889, term1889.getClass(), "createTime", term1940);
        setField(term1889, term1889.getClass(), "updateTime", term1942);
        setField(term1889, term1889.getClass(), "finishTime", term1944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term1889, args);
    }

};


