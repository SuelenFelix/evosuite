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

public class DanmuSenderTaskModel_setDanmuSentNum_6539910714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term1240;

    public DanmuSenderTaskModel_setDanmuSentNum_6539910714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1184 = new Integer(-883034806);
        Long term1222 = new Long(-5788180182343976541L);
        Long term1224 = new Long(0L);
        Long term1226 = new Long(0L);
        Integer term1228 = new Integer(0);
        Boolean term1230 = new Boolean(false);
        Boolean term1232 = new Boolean(false);
        Long term1234 = new Long(2936323121573284007L);
        Long term1236 = new Long(-1154553077993834885L);
        Long term1238 = new Long(-2850532706972744550L);
        term1183 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1183, term1183.getClass(), "id", term1184);
        setField(term1183, term1183.getClass(), "platform", "gGSMzuGICf");
        setField(term1183, term1183.getClass(), "videoCreatorUid", "hxCBltsObl");
        setField(term1183, term1183.getClass(), "videoId", "BndsHwAFMv");
        setField(term1183, term1183.getClass(), "videoCreatedTime", term1222);
        setField(term1183, term1183.getClass(), "danmuTotalNum", term1224);
        setField(term1183, term1183.getClass(), "danmuSentNum", term1226);
        setField(term1183, term1183.getClass(), "pageSize", term1228);
        setField(term1183, term1183.getClass(), "skip", term1230);
        setField(term1183, term1183.getClass(), "taskFail", term1232);
        setField(term1183, term1183.getClass(), "createTime", term1234);
        setField(term1183, term1183.getClass(), "updateTime", term1236);
        setField(term1183, term1183.getClass(), "finishTime", term1238);
        term1240 = new Long(-2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1240;
        callMethod(klass, "setDanmuSentNum", argTypes, term1183, args);
    }

};


