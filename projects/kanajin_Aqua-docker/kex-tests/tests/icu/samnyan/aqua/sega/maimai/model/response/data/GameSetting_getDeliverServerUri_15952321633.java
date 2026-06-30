package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getDeliverServerUri_15952321633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6170;

    public GameSetting_getDeliverServerUri_15952321633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6170 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term6170, term6170.getClass(), "isMaintenance", false);
        setIntField(term6170, term6170.getClass(), "requestInterval", 0);
        setField(term6170, term6170.getClass(), "rebootStartTime", null);
        setField(term6170, term6170.getClass(), "rebootEndTime", null);
        setIntField(term6170, term6170.getClass(), "movieUploadLimit", 0);
        setIntField(term6170, term6170.getClass(), "movieStatus", 0);
        setField(term6170, term6170.getClass(), "movieServerUri", null);
        setField(term6170, term6170.getClass(), "deliverServerUri", null);
        setField(term6170, term6170.getClass(), "oldServerUri", null);
        setField(term6170, term6170.getClass(), "usbDlServerUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliverServerUri", argTypes, term6170, args);
    }

};


