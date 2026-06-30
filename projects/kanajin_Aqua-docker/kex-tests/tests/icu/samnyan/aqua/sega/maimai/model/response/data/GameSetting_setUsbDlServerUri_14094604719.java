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

public class GameSetting_setUsbDlServerUri_14094604719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5286;

    public GameSetting_setUsbDlServerUri_14094604719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5286 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5286, term5286.getClass(), "isMaintenance", false);
        setIntField(term5286, term5286.getClass(), "requestInterval", 1545314376);
        setField(term5286, term5286.getClass(), "rebootStartTime", "WdCiTDUKqn");
        setField(term5286, term5286.getClass(), "rebootEndTime", "PSizQDoxxe");
        setIntField(term5286, term5286.getClass(), "movieUploadLimit", 437959151);
        setIntField(term5286, term5286.getClass(), "movieStatus", 27780241);
        setField(term5286, term5286.getClass(), "movieServerUri", "mKaHyMybrK");
        setField(term5286, term5286.getClass(), "deliverServerUri", "AyrEXuGrEj");
        setField(term5286, term5286.getClass(), "oldServerUri", "yevIIoVYHq");
        setField(term5286, term5286.getClass(), "usbDlServerUri", "UuYWMTqWTV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DSFGlcaXUb";
        callMethod(klass, "setUsbDlServerUri", argTypes, term5286, args);
    }

};


