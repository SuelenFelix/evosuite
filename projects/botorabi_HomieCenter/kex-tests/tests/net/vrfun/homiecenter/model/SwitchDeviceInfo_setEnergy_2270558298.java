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

public class SwitchDeviceInfo_setEnergy_2270558298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931;
     Object term1007;

    public SwitchDeviceInfo_setEnergy_2270558298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931 = newInstance(Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo"));
        setBooleanField(term931, term931.getClass(), "on", false);
        setIntField(term931, term931.getClass(), "voltage", -469968304);
        setIntField(term931, term931.getClass(), "power", -1145578966);
        setIntField(term931, term931.getClass(), "energy", 679763016);
        setIntField(term931, term931.getClass(), "temperature", 1962444399);
        setIntField(term931, term931.getClass(), "temperatureOffset", 767834723);
        setField(term931, term931.getClass(), "deviceType", "SWITCH");
        setField(term931, term931.getClass(), "id", "Ghbwtircqb");
        setField(term931, term931.getClass(), "ain", "xrwlQZdwCp");
        setField(term931, term931.getClass(), "name", "IDCWpPLRkE");
        setField(term931, term931.getClass(), "firmware", "nyiiPDVjAc");
        setField(term931, term931.getClass(), "productName", "aKnKipADSo");
        setBooleanField(term931, term931.getClass(), "present", true);
        term1007 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.SwitchDeviceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1007;
        callMethod(klass, "setEnergy", argTypes, term931, args);
    }

};


