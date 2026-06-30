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
import java.lang.Integer;

public class GameSetting_setRequestInterval_35334204111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4074;
     Object term4151;

    public GameSetting_setRequestInterval_35334204111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4074 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4074, term4074.getClass(), "isMaintenance", true);
        setIntField(term4074, term4074.getClass(), "requestInterval", -177243872);
        setField(term4074, term4074.getClass(), "rebootStartTime", "IkpjUOuWQU");
        setField(term4074, term4074.getClass(), "rebootEndTime", "boSSpezHeU");
        setIntField(term4074, term4074.getClass(), "movieUploadLimit", 1485047282);
        setIntField(term4074, term4074.getClass(), "movieStatus", 1624190794);
        setField(term4074, term4074.getClass(), "movieServerUri", "OUeBWNTQDh");
        setField(term4074, term4074.getClass(), "deliverServerUri", "gltJarNuUk");
        setField(term4074, term4074.getClass(), "oldServerUri", "ZwZIDwYcSW");
        setField(term4074, term4074.getClass(), "usbDlServerUri", "sOdkipUKRu");
        term4151 = new Integer(-773608881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4151;
        callMethod(klass, "setRequestInterval", argTypes, term4074, args);
    }

};


