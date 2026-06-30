package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_canEqual_15360619317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55029;
     Object term55149;

    public GetGameSettingResp_canEqual_15360619317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55029 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term55030 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term55030, term55030.getClass(), "romVersion", "ovYlGvhKKO");
        setField(term55030, term55030.getClass(), "dataVersion", "JvoSiMCDAb");
        setBooleanField(term55030, term55030.getClass(), "isMaintenance", false);
        setIntField(term55030, term55030.getClass(), "requestInterval", 967496047);
        setField(term55030, term55030.getClass(), "rebootStartTime", "JANJXHGMsv");
        setField(term55030, term55030.getClass(), "rebootEndTime", "WVQqsFGJMw");
        setBooleanField(term55030, term55030.getClass(), "isBackgroundDistribute", false);
        setIntField(term55030, term55030.getClass(), "maxCountCharacter", -1410428562);
        setIntField(term55030, term55030.getClass(), "maxCountItem", 1498236261);
        setIntField(term55030, term55030.getClass(), "maxCountMusic", -1544783703);
        setField(term55030, term55030.getClass(), "matchStartTime", "TIPSlmidwP");
        setField(term55030, term55030.getClass(), "matchEndTime", "SRYeqWJJkR");
        setIntField(term55030, term55030.getClass(), "matchTimeLimit", -1332726862);
        setIntField(term55030, term55030.getClass(), "matchErrorLimit", 953524774);
        setField(term55030, term55030.getClass(), "matchingUri", "vUVScKcyFY");
        setField(term55030, term55030.getClass(), "udpHolePunchUri", "DCSMbuGiaM");
        setField(term55030, term55030.getClass(), "reflectorUri", "wtOVzMPrFU");
        setField(term55029, term55029.getClass(), "gameSetting", term55030);
        setBooleanField(term55029, term55029.getClass(), "isDumpUpload", true);
        setBooleanField(term55029, term55029.getClass(), "isAou", true);
        term55149 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55149;
        callMethod(klass, "canEqual", argTypes, term55029, args);
    }

};


