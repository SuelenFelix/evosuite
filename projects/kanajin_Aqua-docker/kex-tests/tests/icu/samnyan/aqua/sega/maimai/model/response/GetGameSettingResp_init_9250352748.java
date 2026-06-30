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
import java.lang.Boolean;

public class GetGameSettingResp_init_9250352748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1254;
     Object term1256;

    public GetGameSettingResp_init_9250352748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1254 = new Boolean(false);
        term1256 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term1256, term1256.getClass(), "isMaintenance", false);
        setIntField(term1256, term1256.getClass(), "requestInterval", 865208305);
        setField(term1256, term1256.getClass(), "rebootStartTime", "onpbIeEKoi");
        setField(term1256, term1256.getClass(), "rebootEndTime", "YRHGsAkhxb");
        setIntField(term1256, term1256.getClass(), "movieUploadLimit", -1275173084);
        setIntField(term1256, term1256.getClass(), "movieStatus", -244121226);
        setField(term1256, term1256.getClass(), "movieServerUri", "ffYhPOzlUs");
        setField(term1256, term1256.getClass(), "deliverServerUri", "MLqYREekMl");
        setField(term1256, term1256.getClass(), "oldServerUri", "ytSBIKXogI");
        setField(term1256, term1256.getClass(), "usbDlServerUri", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Object[] args = new Object[2];
        args[0] = term1254;
        args[1] = term1256;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


