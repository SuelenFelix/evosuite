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

public class GetGameSettingResp_canEqual_20072200557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26603;
     Object term26638;

    public GetGameSettingResp_canEqual_20072200557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26603 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26604 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26604, term26604.getClass(), "dataVersion", 1125156671);
        setBooleanField(term26604, term26604.getClass(), "isMaintenance", true);
        setIntField(term26604, term26604.getClass(), "requestInterval", 1203107925);
        setField(term26604, term26604.getClass(), "rebootStartTime", "douzkltmiI");
        setField(term26604, term26604.getClass(), "rebootEndTime", "MFKjhvLtpe");
        setBooleanField(term26604, term26604.getClass(), "isBackgroundDistribute", true);
        setIntField(term26604, term26604.getClass(), "maxCountCharacter", 1825448944);
        setIntField(term26604, term26604.getClass(), "maxCountItem", 1769496642);
        setIntField(term26604, term26604.getClass(), "maxCountMusic", -947460705);
        setField(term26603, term26603.getClass(), "gameSetting", term26604);
        setBooleanField(term26603, term26603.getClass(), "isDumpUpload", false);
        setBooleanField(term26603, term26603.getClass(), "isAou", true);
        term26638 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26638;
        callMethod(klass, "canEqual", argTypes, term26603, args);
    }

};


