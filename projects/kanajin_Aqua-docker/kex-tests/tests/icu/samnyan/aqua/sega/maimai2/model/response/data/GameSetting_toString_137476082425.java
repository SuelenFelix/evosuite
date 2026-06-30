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

public class GameSetting_toString_137476082425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5632;

    public GameSetting_toString_137476082425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5632 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5632, term5632.getClass(), "isMaintenance", false);
        setIntField(term5632, term5632.getClass(), "requestInterval", -574611924);
        setField(term5632, term5632.getClass(), "rebootStartTime", "DRhkpDneCC");
        setField(term5632, term5632.getClass(), "rebootEndTime", "vuIJRrypuA");
        setIntField(term5632, term5632.getClass(), "movieUploadLimit", 512521742);
        setIntField(term5632, term5632.getClass(), "movieStatus", 1291000976);
        setField(term5632, term5632.getClass(), "movieServerUri", "AxfSZmaiyA");
        setField(term5632, term5632.getClass(), "deliverServerUri", "lBpveIKbea");
        setField(term5632, term5632.getClass(), "oldServerUri", "uyLBVQYcOV");
        setField(term5632, term5632.getClass(), "usbDlServerUri", "PoTZjDuBHa");
        setIntField(term5632, term5632.getClass(), "rebootInterval", 1143522832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5632, args);
    }

};


