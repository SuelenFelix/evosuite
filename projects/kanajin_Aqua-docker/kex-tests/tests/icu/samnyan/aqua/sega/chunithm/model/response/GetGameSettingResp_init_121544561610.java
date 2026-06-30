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
import java.lang.Boolean;

public class GetGameSettingResp_init_121544561610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26769;
     Object term26801;
     Object term26803;

    public GetGameSettingResp_init_121544561610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26769 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26769, term26769.getClass(), "dataVersion", -1490696181);
        setBooleanField(term26769, term26769.getClass(), "isMaintenance", true);
        setIntField(term26769, term26769.getClass(), "requestInterval", 623717232);
        setField(term26769, term26769.getClass(), "rebootStartTime", "KSZfGbvzPE");
        setField(term26769, term26769.getClass(), "rebootEndTime", "YfgYGgzYER");
        setBooleanField(term26769, term26769.getClass(), "isBackgroundDistribute", true);
        setIntField(term26769, term26769.getClass(), "maxCountCharacter", -1413291732);
        setIntField(term26769, term26769.getClass(), "maxCountItem", 203264365);
        setIntField(term26769, term26769.getClass(), "maxCountMusic", -1066281036);
        term26801 = new Boolean(false);
        term26803 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term26769;
        args[1] = term26801;
        args[2] = term26803;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


