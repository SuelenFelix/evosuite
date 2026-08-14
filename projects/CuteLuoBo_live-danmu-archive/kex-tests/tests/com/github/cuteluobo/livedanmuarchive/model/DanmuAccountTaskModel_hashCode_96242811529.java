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

public class DanmuAccountTaskModel_hashCode_96242811529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5130;

    public DanmuAccountTaskModel_hashCode_96242811529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5131 = new Integer(-461771056);
        Integer term5133 = new Integer(-243422082);
        Integer term5159 = new Integer(1384592638);
        Long term5161 = new Long(6906379511067694917L);
        Integer term5163 = new Integer(0);
        Integer term5165 = new Integer(0);
        Integer term5167 = new Integer(-1002370457);
        Boolean term5169 = new Boolean(false);
        Long term5171 = new Long(-9204303423581447271L);
        Long term5173 = new Long(6248239231585852341L);
        Long term5175 = new Long(-88538481937688851L);
        term5130 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term5130, term5130.getClass(), "id", term5131);
        setField(term5130, term5130.getClass(), "danmuSenderTaskId", term5133);
        setField(term5130, term5130.getClass(), "senderUid", "XYtryyobou");
        setField(term5130, term5130.getClass(), "videoId", "OYbzXylRWW");
        setField(term5130, term5130.getClass(), "lastVideoPartIndex", term5159);
        setField(term5130, term5130.getClass(), "lastVideoPartCid", term5161);
        setField(term5130, term5130.getClass(), "pageIndex", term5163);
        setField(term5130, term5130.getClass(), "pageSize", term5165);
        setField(term5130, term5130.getClass(), "lastDanmuIndex", term5167);
        setField(term5130, term5130.getClass(), "stop", term5169);
        setField(term5130, term5130.getClass(), "createTime", term5171);
        setField(term5130, term5130.getClass(), "updateTime", term5173);
        setField(term5130, term5130.getClass(), "finishTime", term5175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5130, args);
    }

};


