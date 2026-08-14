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

public class DanmuSenderTaskModel_setUpdateTime_64863619625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2152;
     Object term2209;

    public DanmuSenderTaskModel_setUpdateTime_64863619625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2153 = new Integer(1135664017);
        Long term2191 = new Long(-8085190702504231560L);
        Long term2193 = new Long(0L);
        Long term2195 = new Long(0L);
        Integer term2197 = new Integer(0);
        Boolean term2199 = new Boolean(false);
        Boolean term2201 = new Boolean(false);
        Long term2203 = new Long(1672578078364590450L);
        Long term2205 = new Long(4949335493504695457L);
        Long term2207 = new Long(-5216789073301458893L);
        term2152 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2152, term2152.getClass(), "id", term2153);
        setField(term2152, term2152.getClass(), "platform", "MAcUBcBckh");
        setField(term2152, term2152.getClass(), "videoCreatorUid", "oVgzLbrsFr");
        setField(term2152, term2152.getClass(), "videoId", "vQVyKLdtaz");
        setField(term2152, term2152.getClass(), "videoCreatedTime", term2191);
        setField(term2152, term2152.getClass(), "danmuTotalNum", term2193);
        setField(term2152, term2152.getClass(), "danmuSentNum", term2195);
        setField(term2152, term2152.getClass(), "pageSize", term2197);
        setField(term2152, term2152.getClass(), "skip", term2199);
        setField(term2152, term2152.getClass(), "taskFail", term2201);
        setField(term2152, term2152.getClass(), "createTime", term2203);
        setField(term2152, term2152.getClass(), "updateTime", term2205);
        setField(term2152, term2152.getClass(), "finishTime", term2207);
        term2209 = new Long(-1832940336320585644L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2209;
        callMethod(klass, "setUpdateTime", argTypes, term2152, args);
    }

};


