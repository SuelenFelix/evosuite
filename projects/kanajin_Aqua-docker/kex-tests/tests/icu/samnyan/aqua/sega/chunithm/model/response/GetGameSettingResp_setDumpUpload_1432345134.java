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

public class GetGameSettingResp_setDumpUpload_1432345134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26433;
     Object term26468;

    public GetGameSettingResp_setDumpUpload_1432345134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26433 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26434 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26434, term26434.getClass(), "dataVersion", 1422430512);
        setBooleanField(term26434, term26434.getClass(), "isMaintenance", true);
        setIntField(term26434, term26434.getClass(), "requestInterval", 1796581482);
        setField(term26434, term26434.getClass(), "rebootStartTime", "GHtOeztAdz");
        setField(term26434, term26434.getClass(), "rebootEndTime", "gSAtqakaLY");
        setBooleanField(term26434, term26434.getClass(), "isBackgroundDistribute", false);
        setIntField(term26434, term26434.getClass(), "maxCountCharacter", 1286440081);
        setIntField(term26434, term26434.getClass(), "maxCountItem", -928538452);
        setIntField(term26434, term26434.getClass(), "maxCountMusic", -1313207353);
        setField(term26433, term26433.getClass(), "gameSetting", term26434);
        setBooleanField(term26433, term26433.getClass(), "isDumpUpload", true);
        setBooleanField(term26433, term26433.getClass(), "isAou", true);
        term26468 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26468;
        callMethod(klass, "setDumpUpload", argTypes, term26433, args);
    }

};


