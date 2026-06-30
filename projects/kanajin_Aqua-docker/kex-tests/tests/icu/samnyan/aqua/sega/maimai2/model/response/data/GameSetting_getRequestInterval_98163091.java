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

public class GameSetting_getRequestInterval_98163091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2176;

    public GameSetting_getRequestInterval_98163091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2176 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2176, term2176.getClass(), "isMaintenance", false);
        setIntField(term2176, term2176.getClass(), "requestInterval", 1701819905);
        setField(term2176, term2176.getClass(), "rebootStartTime", "AhOHzCsHKW");
        setField(term2176, term2176.getClass(), "rebootEndTime", "UqgLPaaAHi");
        setIntField(term2176, term2176.getClass(), "movieUploadLimit", 1721418943);
        setIntField(term2176, term2176.getClass(), "movieStatus", -111082612);
        setField(term2176, term2176.getClass(), "movieServerUri", "xypryEkUPF");
        setField(term2176, term2176.getClass(), "deliverServerUri", "zyZTzHNjQr");
        setField(term2176, term2176.getClass(), "oldServerUri", "YSrFKQQwXE");
        setField(term2176, term2176.getClass(), "usbDlServerUri", "qxhOsmyyjm");
        setIntField(term2176, term2176.getClass(), "rebootInterval", 1253334988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term2176, args);
    }

};


