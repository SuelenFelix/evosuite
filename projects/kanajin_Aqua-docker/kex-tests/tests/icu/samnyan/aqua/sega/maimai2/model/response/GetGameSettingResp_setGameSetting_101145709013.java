package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetGameSettingResp_setGameSetting_101145709013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1411;

    public GetGameSettingResp_setGameSetting_101145709013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1411 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        setBooleanField(term1411, term1411.getClass(), "isAouAccession", false);
        setField(term1411, term1411.getClass(), "gameSetting", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameSetting", argTypes, term1411, args);
    }

};


