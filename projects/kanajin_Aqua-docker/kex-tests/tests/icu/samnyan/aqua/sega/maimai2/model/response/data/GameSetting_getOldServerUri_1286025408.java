package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getOldServerUri_1286025408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3142;

    public GameSetting_getOldServerUri_1286025408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3142, term3142.getClass(), "isMaintenance", false);
        setIntField(term3142, term3142.getClass(), "requestInterval", -1703642288);
        setField(term3142, term3142.getClass(), "rebootStartTime", "DNOtiLPAIY");
        setField(term3142, term3142.getClass(), "rebootEndTime", "FnEkAHBfyV");
        setIntField(term3142, term3142.getClass(), "movieUploadLimit", 2075139747);
        setIntField(term3142, term3142.getClass(), "movieStatus", 2092881418);
        setField(term3142, term3142.getClass(), "movieServerUri", "VfmNFpEuax");
        setField(term3142, term3142.getClass(), "deliverServerUri", "ANHjlWPmZG");
        setField(term3142, term3142.getClass(), "oldServerUri", "SibzENsyyy");
        setField(term3142, term3142.getClass(), "usbDlServerUri", "mrqGHotaef");
        setIntField(term3142, term3142.getClass(), "rebootInterval", 1732410866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldServerUri", argTypes, term3142, args);
    }

};


