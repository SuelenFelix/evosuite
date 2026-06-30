package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetGameSettingResp_getGameSetting_203524508011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395;

    public GetGameSettingResp_getGameSetting_203524508011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        setBooleanField(term1395, term1395.getClass(), "isAouAccession", false);
        setField(term1395, term1395.getClass(), "gameSetting", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term1395, args);
    }

};


