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

public class SwitchDeviceInfo_getPower_9525224265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;

    public SwitchDeviceInfo_getPower_9525224265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term533, term533.getClass(), "on", true);
        setIntField(term533, term533.getClass(), "voltage", -6029667);
        setIntField(term533, term533.getClass(), "power", -2068769794);
        setIntField(term533, term533.getClass(), "energy", -117576464);
        setIntField(term533, term533.getClass(), "temperature", -1007160944);
        setIntField(term533, term533.getClass(), "temperatureOffset", 1135664017);
        setField(term533, term533.getClass(), "deviceType", "SWITCH");
        setField(term533, term533.getClass(), "id", "hNxWaHcfhY");
        setField(term533, term533.getClass(), "ain", "RkybSrpybU");
        setField(term533, term533.getClass(), "name", "xOEqzGAmDU");
        setField(term533, term533.getClass(), "firmware", "eZFUvlxvGV");
        setField(term533, term533.getClass(), "productName", "BYqFIqCKAV");
        setBooleanField(term533, term533.getClass(), "present", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term533, args);
    }

};


