package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class GetGameSettingResp_setAou_19431345915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26490;
     Object term26525;

    public GetGameSettingResp_setAou_19431345915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26490 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26491 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26491, term26491.getClass(), "dataVersion", 402612318);
        setBooleanField(term26491, term26491.getClass(), "isMaintenance", false);
        setIntField(term26491, term26491.getClass(), "requestInterval", -1628481565);
        setField(term26491, term26491.getClass(), "rebootStartTime", "taPBiMFNEZ");
        setField(term26491, term26491.getClass(), "rebootEndTime", "NoAFAfGyYL");
        setBooleanField(term26491, term26491.getClass(), "isBackgroundDistribute", false);
        setIntField(term26491, term26491.getClass(), "maxCountCharacter", -217226756);
        setIntField(term26491, term26491.getClass(), "maxCountItem", 1608000247);
        setIntField(term26491, term26491.getClass(), "maxCountMusic", 1354560887);
        setField(term26490, term26490.getClass(), "gameSetting", term26491);
        setBooleanField(term26490, term26490.getClass(), "isDumpUpload", true);
        setBooleanField(term26490, term26490.getClass(), "isAou", false);
        term26525 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26525;
        callMethod(klass, "setAou", argTypes, term26490, args);
    }

};


