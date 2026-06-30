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
import java.lang.Boolean;

public class GetGameSettingResp_init_10624188388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263;
     Object term1265;

    public GetGameSettingResp_init_10624188388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1263 = new Boolean(false);
        term1265 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term1265, term1265.getClass(), "isMaintenance", false);
        setIntField(term1265, term1265.getClass(), "requestInterval", -1530420153);
        setField(term1265, term1265.getClass(), "rebootStartTime", "onpbIeEKoi");
        setField(term1265, term1265.getClass(), "rebootEndTime", "YRHGsAkhxb");
        setIntField(term1265, term1265.getClass(), "movieUploadLimit", -469968304);
        setIntField(term1265, term1265.getClass(), "movieStatus", -1145578966);
        setField(term1265, term1265.getClass(), "movieServerUri", "ffYhPOzlUs");
        setField(term1265, term1265.getClass(), "deliverServerUri", "MLqYREekMl");
        setField(term1265, term1265.getClass(), "oldServerUri", "ytSBIKXogI");
        setField(term1265, term1265.getClass(), "usbDlServerUri", "nHXjMycHlU");
        setIntField(term1265, term1265.getClass(), "rebootInterval", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Object[] args = new Object[2];
        args[0] = term1263;
        args[1] = term1265;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


