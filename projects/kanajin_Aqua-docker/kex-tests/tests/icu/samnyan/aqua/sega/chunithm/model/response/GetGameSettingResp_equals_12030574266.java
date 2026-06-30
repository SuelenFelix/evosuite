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

public class GetGameSettingResp_equals_12030574266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26547;
     Object term26582;

    public GetGameSettingResp_equals_12030574266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26547 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26548 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26548, term26548.getClass(), "dataVersion", -749474542);
        setBooleanField(term26548, term26548.getClass(), "isMaintenance", false);
        setIntField(term26548, term26548.getClass(), "requestInterval", -47907780);
        setField(term26548, term26548.getClass(), "rebootStartTime", "MFtfkBMyOD");
        setField(term26548, term26548.getClass(), "rebootEndTime", "rdiIyXfRtL");
        setBooleanField(term26548, term26548.getClass(), "isBackgroundDistribute", true);
        setIntField(term26548, term26548.getClass(), "maxCountCharacter", 1131462369);
        setIntField(term26548, term26548.getClass(), "maxCountItem", -1161206731);
        setIntField(term26548, term26548.getClass(), "maxCountMusic", -992847709);
        setField(term26547, term26547.getClass(), "gameSetting", term26548);
        setBooleanField(term26547, term26547.getClass(), "isDumpUpload", false);
        setBooleanField(term26547, term26547.getClass(), "isAou", false);
        term26582 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26582;
        callMethod(klass, "equals", argTypes, term26547, args);
    }

};


