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

public class GetGameSettingResp_setGameSetting_4788679423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26326;
     Object term26361;

    public GetGameSettingResp_setGameSetting_4788679423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26326 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26327 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26327, term26327.getClass(), "dataVersion", -718204437);
        setBooleanField(term26327, term26327.getClass(), "isMaintenance", false);
        setIntField(term26327, term26327.getClass(), "requestInterval", 468974358);
        setField(term26327, term26327.getClass(), "rebootStartTime", "iTxNduwSjE");
        setField(term26327, term26327.getClass(), "rebootEndTime", "MQUTfIiFnh");
        setBooleanField(term26327, term26327.getClass(), "isBackgroundDistribute", true);
        setIntField(term26327, term26327.getClass(), "maxCountCharacter", 346282818);
        setIntField(term26327, term26327.getClass(), "maxCountItem", -857876056);
        setIntField(term26327, term26327.getClass(), "maxCountMusic", 1392910876);
        setField(term26326, term26326.getClass(), "gameSetting", term26327);
        setBooleanField(term26326, term26326.getClass(), "isDumpUpload", false);
        setBooleanField(term26326, term26326.getClass(), "isAou", false);
        term26361 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26361, term26361.getClass(), "dataVersion", 1086383182);
        setBooleanField(term26361, term26361.getClass(), "isMaintenance", false);
        setIntField(term26361, term26361.getClass(), "requestInterval", 1425319286);
        setField(term26361, term26361.getClass(), "rebootStartTime", "JeyKRznnft");
        setField(term26361, term26361.getClass(), "rebootEndTime", "vQJUCtuYpK");
        setBooleanField(term26361, term26361.getClass(), "isBackgroundDistribute", true);
        setIntField(term26361, term26361.getClass(), "maxCountCharacter", 1729919228);
        setIntField(term26361, term26361.getClass(), "maxCountItem", 872351195);
        setIntField(term26361, term26361.getClass(), "maxCountMusic", -1664328399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = term26361;
        callMethod(klass, "setGameSetting", argTypes, term26326, args);
    }

};


