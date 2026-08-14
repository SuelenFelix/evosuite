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

public class HeatControllerDeviceInfo_setSetTemperature_8200126378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3093;
     Object term3179;

    public HeatControllerDeviceInfo_setSetTemperature_8200126378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3093 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term3093, term3093.getClass(), "batteryLow", false);
        setIntField(term3093, term3093.getClass(), "batteryLevel", -1963434938);
        setIntField(term3093, term3093.getClass(), "currentTemperature", 906181092);
        setIntField(term3093, term3093.getClass(), "setTemperature", 1045657203);
        setIntField(term3093, term3093.getClass(), "comfortTemperature", 1386130016);
        setIntField(term3093, term3093.getClass(), "economyTemperature", 1072005683);
        setBooleanField(term3093, term3093.getClass(), "windowOpen", false);
        setIntField(term3093, term3093.getClass(), "errorCode", 1861318859);
        setField(term3093, term3093.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term3093, term3093.getClass(), "id", "xBsXSDjXYK");
        setField(term3093, term3093.getClass(), "ain", "sEnIVFtZuQ");
        setField(term3093, term3093.getClass(), "name", "ZVecLZMLHF");
        setField(term3093, term3093.getClass(), "firmware", "fztQhjqwdP");
        setField(term3093, term3093.getClass(), "productName", "eVpkWxjuki");
        setBooleanField(term3093, term3093.getClass(), "present", true);
        term3179 = new Integer(1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3179;
        callMethod(klass, "setSetTemperature", argTypes, term3093, args);
    }

};


