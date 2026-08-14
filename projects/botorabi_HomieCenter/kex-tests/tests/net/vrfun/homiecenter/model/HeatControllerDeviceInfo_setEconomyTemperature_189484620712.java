package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class HeatControllerDeviceInfo_setEconomyTemperature_189484620712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3697;
     Object term3783;

    public HeatControllerDeviceInfo_setEconomyTemperature_189484620712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3697 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3697, term3697.getClass(), "batteryLow", true);
        setIntField(term3697, term3697.getClass(), "batteryLevel", 344323424);
        setIntField(term3697, term3697.getClass(), "currentTemperature", 9726679);
        setIntField(term3697, term3697.getClass(), "setTemperature", -25637976);
        setIntField(term3697, term3697.getClass(), "comfortTemperature", 1555897383);
        setIntField(term3697, term3697.getClass(), "economyTemperature", 202001407);
        setBooleanField(term3697, term3697.getClass(), "windowOpen", true);
        setIntField(term3697, term3697.getClass(), "errorCode", 158873461);
        setField(term3697, term3697.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3697, term3697.getClass(), "id", "JDaAnsVTGV");
        setField(term3697, term3697.getClass(), "ain", "mLUZFTfjle");
        setField(term3697, term3697.getClass(), "name", "xIeFjkHkOe");
        setField(term3697, term3697.getClass(), "firmware", "SdCKLMIYnX");
        setField(term3697, term3697.getClass(), "productName", "OJJtVNPyKZ");
        setBooleanField(term3697, term3697.getClass(), "present", false);
        term3783 = new Integer(-430151637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3783;
        callMethod(klass, "setEconomyTemperature", argTypes, term3697, args);
    }

};


