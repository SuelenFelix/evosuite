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

public class GetGameSettingResp_getGameSetting_18541636720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26161;

    public GetGameSettingResp_getGameSetting_18541636720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26161 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26162 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26162, term26162.getClass(), "dataVersion", 1844345719);
        setBooleanField(term26162, term26162.getClass(), "isMaintenance", false);
        setIntField(term26162, term26162.getClass(), "requestInterval", 1704024265);
        setField(term26162, term26162.getClass(), "rebootStartTime", "kdCYNMSuoD");
        setField(term26162, term26162.getClass(), "rebootEndTime", "eRYlSLwtvV");
        setBooleanField(term26162, term26162.getClass(), "isBackgroundDistribute", true);
        setIntField(term26162, term26162.getClass(), "maxCountCharacter", 501801161);
        setIntField(term26162, term26162.getClass(), "maxCountItem", 2103971768);
        setIntField(term26162, term26162.getClass(), "maxCountMusic", -939132796);
        setField(term26161, term26161.getClass(), "gameSetting", term26162);
        setBooleanField(term26161, term26161.getClass(), "isDumpUpload", false);
        setBooleanField(term26161, term26161.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term26161, args);
    }

};


