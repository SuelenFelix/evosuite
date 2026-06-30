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

public class GameSetting_isMaintenance_142050185628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5912;

    public GameSetting_isMaintenance_142050185628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5912 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5912, term5912.getClass(), "isMaintenance", false);
        setIntField(term5912, term5912.getClass(), "requestInterval", 0);
        setField(term5912, term5912.getClass(), "rebootStartTime", null);
        setField(term5912, term5912.getClass(), "rebootEndTime", null);
        setIntField(term5912, term5912.getClass(), "movieUploadLimit", 0);
        setIntField(term5912, term5912.getClass(), "movieStatus", 0);
        setField(term5912, term5912.getClass(), "movieServerUri", null);
        setField(term5912, term5912.getClass(), "deliverServerUri", null);
        setField(term5912, term5912.getClass(), "oldServerUri", null);
        setField(term5912, term5912.getClass(), "usbDlServerUri", null);
        setIntField(term5912, term5912.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term5912, args);
    }

};


