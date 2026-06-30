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

public class GameSetting_getDeliverServerUri_7912986667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3004;

    public GameSetting_getDeliverServerUri_7912986667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3004 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3004, term3004.getClass(), "isMaintenance", true);
        setIntField(term3004, term3004.getClass(), "requestInterval", -91068927);
        setField(term3004, term3004.getClass(), "rebootStartTime", "EHoNUaeyvT");
        setField(term3004, term3004.getClass(), "rebootEndTime", "ZwKmasCVIy");
        setIntField(term3004, term3004.getClass(), "movieUploadLimit", 680714112);
        setIntField(term3004, term3004.getClass(), "movieStatus", 385297023);
        setField(term3004, term3004.getClass(), "movieServerUri", "pxokrVaeMd");
        setField(term3004, term3004.getClass(), "deliverServerUri", "ujxmmZZcbT");
        setField(term3004, term3004.getClass(), "oldServerUri", "BOvgwHfoHQ");
        setField(term3004, term3004.getClass(), "usbDlServerUri", "hPpFNeDBIb");
        setIntField(term3004, term3004.getClass(), "rebootInterval", -134092543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliverServerUri", argTypes, term3004, args);
    }

};


