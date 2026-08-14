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

public class SwitchDeviceInfo_getEnergy_1421032557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public SwitchDeviceInfo_getEnergy_1421032557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term799, term799.getClass(), "on", true);
        setIntField(term799, term799.getClass(), "voltage", -73683645);
        setIntField(term799, term799.getClass(), "power", -226514366);
        setIntField(term799, term799.getClass(), "energy", 1193880199);
        setIntField(term799, term799.getClass(), "temperature", -1087774327);
        setIntField(term799, term799.getClass(), "temperatureOffset", -1530420153);
        setField(term799, term799.getClass(), "deviceType", "SWITCH");
        setField(term799, term799.getClass(), "id", "OWDIEULEFu");
        setField(term799, term799.getClass(), "ain", "dWRymuLBtr");
        setField(term799, term799.getClass(), "name", "AijpHYOFuy");
        setField(term799, term799.getClass(), "firmware", "SbAoxhfrkn");
        setField(term799, term799.getClass(), "productName", "kuTXqwMtDB");
        setBooleanField(term799, term799.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnergy", argTypes, term799, args);
    }

};


