package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuSenderTaskSelector_getEndFinishTime_195674545511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;

    public DanMuSenderTaskSelector_getEndFinishTime_195674545511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1042 = new Long(3620247240684476031L);
        Long term1044 = new Long(8313800941204938919L);
        Long term1046 = new Long(-1214968196781083707L);
        Long term1048 = new Long(-1804015692891701666L);
        Long term1050 = new Long(-6432617521836576658L);
        Long term1052 = new Long(-2255965562447970862L);
        Long term1054 = new Long(148047808219672941L);
        Long term1056 = new Long(7489064039921396098L);
        Integer term1058 = new Integer(1725571209);
        Long term1096 = new Long(6843866297465638866L);
        Long term1098 = new Long(0L);
        Long term1100 = new Long(0L);
        Integer term1102 = new Integer(0);
        Boolean term1104 = new Boolean(false);
        Boolean term1106 = new Boolean(false);
        Long term1108 = new Long(-4023935540989049732L);
        Long term1110 = new Long(855932984568615096L);
        Long term1112 = new Long(-1616722610139554082L);
        term1041 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1041, term1041.getClass(), "startCreateTime", term1042);
        setField(term1041, term1041.getClass(), "endCreateTime", term1044);
        setField(term1041, term1041.getClass(), "startUpdateTime", term1046);
        setField(term1041, term1041.getClass(), "endUpdateTime", term1048);
        setField(term1041, term1041.getClass(), "startFinishTime", term1050);
        setField(term1041, term1041.getClass(), "endFinishTime", term1052);
        setField(term1041, term1041.getClass(), "startVideoCreatedTime", term1054);
        setField(term1041, term1041.getClass(), "endVideoCreatedTime", term1056);
        setField(term1041, term1041.getClass(), "id", term1058);
        setField(term1041, term1041.getClass(), "platform", "OWDIEULEFu");
        setField(term1041, term1041.getClass(), "videoCreatorUid", "dWRymuLBtr");
        setField(term1041, term1041.getClass(), "videoId", "AijpHYOFuy");
        setField(term1041, term1041.getClass(), "videoCreatedTime", term1096);
        setField(term1041, term1041.getClass(), "danmuTotalNum", term1098);
        setField(term1041, term1041.getClass(), "danmuSentNum", term1100);
        setField(term1041, term1041.getClass(), "pageSize", term1102);
        setField(term1041, term1041.getClass(), "skip", term1104);
        setField(term1041, term1041.getClass(), "taskFail", term1106);
        setField(term1041, term1041.getClass(), "createTime", term1108);
        setField(term1041, term1041.getClass(), "updateTime", term1110);
        setField(term1041, term1041.getClass(), "finishTime", term1112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndFinishTime", argTypes, term1041, args);
    }

};


