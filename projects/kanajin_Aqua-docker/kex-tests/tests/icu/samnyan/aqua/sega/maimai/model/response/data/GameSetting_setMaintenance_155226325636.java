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
import java.lang.Boolean;

public class GameSetting_setMaintenance_155226325636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6185;
     Object term6190;

    public GameSetting_setMaintenance_155226325636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term6185, term6185.getClass(), "isMaintenance", false);
        setIntField(term6185, term6185.getClass(), "requestInterval", 0);
        setField(term6185, term6185.getClass(), "rebootStartTime", null);
        setField(term6185, term6185.getClass(), "rebootEndTime", null);
        setIntField(term6185, term6185.getClass(), "movieUploadLimit", 0);
        setIntField(term6185, term6185.getClass(), "movieStatus", 0);
        setField(term6185, term6185.getClass(), "movieServerUri", null);
        setField(term6185, term6185.getClass(), "deliverServerUri", null);
        setField(term6185, term6185.getClass(), "oldServerUri", null);
        setField(term6185, term6185.getClass(), "usbDlServerUri", null);
        term6190 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6190;
        callMethod(klass, "setMaintenance", argTypes, term6185, args);
    }

};


