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

public class GetGameSettingResp_hashCode_7543707518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26659;

    public GetGameSettingResp_hashCode_7543707518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26659 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26660 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26660, term26660.getClass(), "dataVersion", -1435758764);
        setBooleanField(term26660, term26660.getClass(), "isMaintenance", true);
        setIntField(term26660, term26660.getClass(), "requestInterval", 752858379);
        setField(term26660, term26660.getClass(), "rebootStartTime", "xpbLKEsput");
        setField(term26660, term26660.getClass(), "rebootEndTime", "urlyLwPBVn");
        setBooleanField(term26660, term26660.getClass(), "isBackgroundDistribute", false);
        setIntField(term26660, term26660.getClass(), "maxCountCharacter", -370819357);
        setIntField(term26660, term26660.getClass(), "maxCountItem", -71819242);
        setIntField(term26660, term26660.getClass(), "maxCountMusic", 1268893136);
        setField(term26659, term26659.getClass(), "gameSetting", term26660);
        setBooleanField(term26659, term26659.getClass(), "isDumpUpload", false);
        setBooleanField(term26659, term26659.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26659, args);
    }

};


