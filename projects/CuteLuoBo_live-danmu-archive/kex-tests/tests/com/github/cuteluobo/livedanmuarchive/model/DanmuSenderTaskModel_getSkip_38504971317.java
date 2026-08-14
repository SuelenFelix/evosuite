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

public class DanmuSenderTaskModel_getSkip_38504971317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;

    public DanmuSenderTaskModel_getSkip_38504971317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1449 = new Integer(-1456670397);
        Long term1487 = new Long(-1610676979013636850L);
        Long term1489 = new Long(0L);
        Long term1491 = new Long(0L);
        Integer term1493 = new Integer(0);
        Boolean term1495 = new Boolean(false);
        Boolean term1497 = new Boolean(false);
        Long term1499 = new Long(2062173786000223358L);
        Long term1501 = new Long(-8658027316505137504L);
        Long term1503 = new Long(414749984815662075L);
        term1448 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1448, term1448.getClass(), "id", term1449);
        setField(term1448, term1448.getClass(), "platform", "UiUYnPrcCi");
        setField(term1448, term1448.getClass(), "videoCreatorUid", "UoYtihxVaS");
        setField(term1448, term1448.getClass(), "videoId", "JDswTTCZHV");
        setField(term1448, term1448.getClass(), "videoCreatedTime", term1487);
        setField(term1448, term1448.getClass(), "danmuTotalNum", term1489);
        setField(term1448, term1448.getClass(), "danmuSentNum", term1491);
        setField(term1448, term1448.getClass(), "pageSize", term1493);
        setField(term1448, term1448.getClass(), "skip", term1495);
        setField(term1448, term1448.getClass(), "taskFail", term1497);
        setField(term1448, term1448.getClass(), "createTime", term1499);
        setField(term1448, term1448.getClass(), "updateTime", term1501);
        setField(term1448, term1448.getClass(), "finishTime", term1503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkip", argTypes, term1448, args);
    }

};


