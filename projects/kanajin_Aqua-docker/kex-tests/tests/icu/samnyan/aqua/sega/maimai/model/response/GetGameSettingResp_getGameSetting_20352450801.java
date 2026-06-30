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
import java.lang.Object;

public class GetGameSettingResp_getGameSetting_20352450801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public GetGameSettingResp_getGameSetting_20352450801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term140, term140.getClass(), "isAouAccession", false);
        setBooleanField(term142, term142.getClass(), "isMaintenance", false);
        setIntField(term142, term142.getClass(), "requestInterval", 391863371);
        setField(term142, term142.getClass(), "rebootStartTime", "SzjVpOQTyS");
        setField(term142, term142.getClass(), "rebootEndTime", "MjGYSRKTNF");
        setIntField(term142, term142.getClass(), "movieUploadLimit", -1922583790);
        setIntField(term142, term142.getClass(), "movieStatus", -616727354);
        setField(term142, term142.getClass(), "movieServerUri", "hRNSzYYIrc");
        setField(term142, term142.getClass(), "deliverServerUri", "RMFIsYGgne");
        setField(term142, term142.getClass(), "oldServerUri", "NRdvgJlhkX");
        setField(term142, term142.getClass(), "usbDlServerUri", "uuaPigETmJ");
        setField(term140, term140.getClass(), "gameSetting", term142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term140, args);
    }

};


