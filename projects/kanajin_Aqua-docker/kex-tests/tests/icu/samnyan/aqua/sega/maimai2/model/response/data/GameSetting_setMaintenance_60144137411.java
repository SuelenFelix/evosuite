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
import java.lang.Boolean;

public class GameSetting_setMaintenance_60144137411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3556;
     Object term3634;

    public GameSetting_setMaintenance_60144137411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3556 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3556, term3556.getClass(), "isMaintenance", true);
        setIntField(term3556, term3556.getClass(), "requestInterval", -1016478729);
        setField(term3556, term3556.getClass(), "rebootStartTime", "asMqnMNrZp");
        setField(term3556, term3556.getClass(), "rebootEndTime", "pqFUMTCKJd");
        setIntField(term3556, term3556.getClass(), "movieUploadLimit", -206889003);
        setIntField(term3556, term3556.getClass(), "movieStatus", 638046409);
        setField(term3556, term3556.getClass(), "movieServerUri", "PTEndmPMzk");
        setField(term3556, term3556.getClass(), "deliverServerUri", "aJQuCOCvZs");
        setField(term3556, term3556.getClass(), "oldServerUri", "lHYNCJRiOv");
        setField(term3556, term3556.getClass(), "usbDlServerUri", "QVLresHoaP");
        setIntField(term3556, term3556.getClass(), "rebootInterval", 427274898);
        term3634 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3634;
        callMethod(klass, "setMaintenance", argTypes, term3556, args);
    }

};


