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

public class GameSetting_getUsbDlServerUri_5317118319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3798;

    public GameSetting_getUsbDlServerUri_5317118319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3798 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3798, term3798.getClass(), "isMaintenance", false);
        setIntField(term3798, term3798.getClass(), "requestInterval", -334260786);
        setField(term3798, term3798.getClass(), "rebootStartTime", "mGRiYhnMcR");
        setField(term3798, term3798.getClass(), "rebootEndTime", "NFlvfJCVPO");
        setIntField(term3798, term3798.getClass(), "movieUploadLimit", -765890956);
        setIntField(term3798, term3798.getClass(), "movieStatus", -214452542);
        setField(term3798, term3798.getClass(), "movieServerUri", "KarbTXFmUU");
        setField(term3798, term3798.getClass(), "deliverServerUri", "jiUSjqwSIQ");
        setField(term3798, term3798.getClass(), "oldServerUri", "MgLCedQfoj");
        setField(term3798, term3798.getClass(), "usbDlServerUri", "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsbDlServerUri", argTypes, term3798, args);
    }

};


