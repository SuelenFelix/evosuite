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

public class DanmuAccountTaskModel_setLastDanmuIndex_113157393516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4246;
     Object term4293;

    public DanmuAccountTaskModel_setLastDanmuIndex_113157393516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4247 = new Integer(1532716628);
        Integer term4249 = new Integer(-1801760683);
        Integer term4275 = new Integer(1141317871);
        Long term4277 = new Long(8863790908271299748L);
        Integer term4279 = new Integer(0);
        Integer term4281 = new Integer(0);
        Integer term4283 = new Integer(890669485);
        Boolean term4285 = new Boolean(false);
        Long term4287 = new Long(9205327385733285058L);
        Long term4289 = new Long(4199886998224701110L);
        Long term4291 = new Long(8540994973773607992L);
        term4246 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4246, term4246.getClass(), "id", term4247);
        setField(term4246, term4246.getClass(), "danmuSenderTaskId", term4249);
        setField(term4246, term4246.getClass(), "senderUid", "yVMkkQhvmN");
        setField(term4246, term4246.getClass(), "videoId", "mvrkADEgpp");
        setField(term4246, term4246.getClass(), "lastVideoPartIndex", term4275);
        setField(term4246, term4246.getClass(), "lastVideoPartCid", term4277);
        setField(term4246, term4246.getClass(), "pageIndex", term4279);
        setField(term4246, term4246.getClass(), "pageSize", term4281);
        setField(term4246, term4246.getClass(), "lastDanmuIndex", term4283);
        setField(term4246, term4246.getClass(), "stop", term4285);
        setField(term4246, term4246.getClass(), "createTime", term4287);
        setField(term4246, term4246.getClass(), "updateTime", term4289);
        setField(term4246, term4246.getClass(), "finishTime", term4291);
        term4293 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4293;
        callMethod(klass, "setLastDanmuIndex", argTypes, term4246, args);
    }

};


