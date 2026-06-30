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

public class GetGameSettingResp_getGameSetting_18972912400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53347;

    public GetGameSettingResp_getGameSetting_18972912400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53347 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term53348 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term53348, term53348.getClass(), "romVersion", "jesZbitPYU");
        setField(term53348, term53348.getClass(), "dataVersion", "oIbEvXxpda");
        setBooleanField(term53348, term53348.getClass(), "isMaintenance", true);
        setIntField(term53348, term53348.getClass(), "requestInterval", 272546912);
        setField(term53348, term53348.getClass(), "rebootStartTime", "QyHVDeaOqb");
        setField(term53348, term53348.getClass(), "rebootEndTime", "ZwnEWySrcE");
        setBooleanField(term53348, term53348.getClass(), "isBackgroundDistribute", false);
        setIntField(term53348, term53348.getClass(), "maxCountCharacter", -1534845297);
        setIntField(term53348, term53348.getClass(), "maxCountItem", 1159214599);
        setIntField(term53348, term53348.getClass(), "maxCountMusic", 2063913776);
        setField(term53348, term53348.getClass(), "matchStartTime", "laQWfyDqCq");
        setField(term53348, term53348.getClass(), "matchEndTime", "gMFGfpbPZE");
        setIntField(term53348, term53348.getClass(), "matchTimeLimit", -167719421);
        setIntField(term53348, term53348.getClass(), "matchErrorLimit", 1185474565);
        setField(term53348, term53348.getClass(), "matchingUri", "QcfydYbOGP");
        setField(term53348, term53348.getClass(), "udpHolePunchUri", "FdMzwKizAk");
        setField(term53348, term53348.getClass(), "reflectorUri", "jjwHVTqCkP");
        setField(term53347, term53347.getClass(), "gameSetting", term53348);
        setBooleanField(term53347, term53347.getClass(), "isDumpUpload", true);
        setBooleanField(term53347, term53347.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term53347, args);
    }

};


