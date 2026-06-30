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

public class GetGameSettingResp_toString_2436110619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26714;

    public GetGameSettingResp_toString_2436110619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26714 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26715 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26715, term26715.getClass(), "dataVersion", -1472700822);
        setBooleanField(term26715, term26715.getClass(), "isMaintenance", false);
        setIntField(term26715, term26715.getClass(), "requestInterval", 1626670889);
        setField(term26715, term26715.getClass(), "rebootStartTime", "SPQVzOlOzZ");
        setField(term26715, term26715.getClass(), "rebootEndTime", "bOUAgAptAI");
        setBooleanField(term26715, term26715.getClass(), "isBackgroundDistribute", true);
        setIntField(term26715, term26715.getClass(), "maxCountCharacter", -2117361140);
        setIntField(term26715, term26715.getClass(), "maxCountItem", 407708341);
        setIntField(term26715, term26715.getClass(), "maxCountMusic", -287519200);
        setField(term26714, term26714.getClass(), "gameSetting", term26715);
        setBooleanField(term26714, term26714.getClass(), "isDumpUpload", false);
        setBooleanField(term26714, term26714.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26714, args);
    }

};


