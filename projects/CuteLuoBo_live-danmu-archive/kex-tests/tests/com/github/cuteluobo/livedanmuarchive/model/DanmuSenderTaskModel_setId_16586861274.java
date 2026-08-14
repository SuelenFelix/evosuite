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

public class DanmuSenderTaskModel_setId_16586861274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term300;

    public DanmuSenderTaskModel_setId_16586861274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term244 = new Integer(1484323161);
        Long term282 = new Long(6967924379644551255L);
        Long term284 = new Long(0L);
        Long term286 = new Long(0L);
        Integer term288 = new Integer(0);
        Boolean term290 = new Boolean(false);
        Boolean term292 = new Boolean(false);
        Long term294 = new Long(-2813493605142626659L);
        Long term296 = new Long(-8885298608300233488L);
        Long term298 = new Long(-4325723315152823407L);
        term243 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term243, term243.getClass(), "id", term244);
        setField(term243, term243.getClass(), "platform", "RMFIsYGgne");
        setField(term243, term243.getClass(), "videoCreatorUid", "NRdvgJlhkX");
        setField(term243, term243.getClass(), "videoId", "uuaPigETmJ");
        setField(term243, term243.getClass(), "videoCreatedTime", term282);
        setField(term243, term243.getClass(), "danmuTotalNum", term284);
        setField(term243, term243.getClass(), "danmuSentNum", term286);
        setField(term243, term243.getClass(), "pageSize", term288);
        setField(term243, term243.getClass(), "skip", term290);
        setField(term243, term243.getClass(), "taskFail", term292);
        setField(term243, term243.getClass(), "createTime", term294);
        setField(term243, term243.getClass(), "updateTime", term296);
        setField(term243, term243.getClass(), "finishTime", term298);
        term300 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term300;
        callMethod(klass, "setId", argTypes, term243, args);
    }

};


