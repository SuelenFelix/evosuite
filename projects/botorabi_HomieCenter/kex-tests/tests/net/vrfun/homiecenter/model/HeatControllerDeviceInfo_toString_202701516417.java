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

public class HeatControllerDeviceInfo_toString_202701516417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4453;

    public HeatControllerDeviceInfo_toString_202701516417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4453 = newInstance(Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo"));
        setBooleanField(term4453, term4453.getClass(), "batteryLow", false);
        setIntField(term4453, term4453.getClass(), "batteryLevel", -1885090354);
        setIntField(term4453, term4453.getClass(), "currentTemperature", -2066804303);
        setIntField(term4453, term4453.getClass(), "setTemperature", -1731761810);
        setIntField(term4453, term4453.getClass(), "comfortTemperature", 197109649);
        setIntField(term4453, term4453.getClass(), "economyTemperature", -1239406390);
        setBooleanField(term4453, term4453.getClass(), "windowOpen", true);
        setIntField(term4453, term4453.getClass(), "errorCode", 1557431527);
        setField(term4453, term4453.getClass(), "deviceType", "HEATCONTROLLER");
        setField(term4453, term4453.getClass(), "id", "ZfdXfCCFDf");
        setField(term4453, term4453.getClass(), "ain", "MwwjNtdOFT");
        setField(term4453, term4453.getClass(), "name", "VYkqXKVlAJ");
        setField(term4453, term4453.getClass(), "firmware", "XkIoWJRNwN");
        setField(term4453, term4453.getClass(), "productName", "aNWLJdrZMq");
        setBooleanField(term4453, term4453.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HeatControllerDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4453, args);
    }

};


