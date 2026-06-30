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

public class GameSetting_getUsbDlServerUri_14825337139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3280;

    public GameSetting_getUsbDlServerUri_14825337139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3280 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3280, term3280.getClass(), "isMaintenance", true);
        setIntField(term3280, term3280.getClass(), "requestInterval", 1084102599);
        setField(term3280, term3280.getClass(), "rebootStartTime", "UbZGBpQZQW");
        setField(term3280, term3280.getClass(), "rebootEndTime", "SvGTualQPa");
        setIntField(term3280, term3280.getClass(), "movieUploadLimit", -1743503755);
        setIntField(term3280, term3280.getClass(), "movieStatus", 1641342112);
        setField(term3280, term3280.getClass(), "movieServerUri", "mdxcgZwsaP");
        setField(term3280, term3280.getClass(), "deliverServerUri", "XildIRoZHG");
        setField(term3280, term3280.getClass(), "oldServerUri", "lEcrFlxJXH");
        setField(term3280, term3280.getClass(), "usbDlServerUri", "VNdDwXMYxR");
        setIntField(term3280, term3280.getClass(), "rebootInterval", -1551790945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsbDlServerUri", argTypes, term3280, args);
    }

};


