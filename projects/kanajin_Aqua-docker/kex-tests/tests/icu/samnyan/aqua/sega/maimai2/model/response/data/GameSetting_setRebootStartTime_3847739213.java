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

public class GameSetting_setRebootStartTime_3847739213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3836;

    public GameSetting_setRebootStartTime_3847739213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3836 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3836, term3836.getClass(), "isMaintenance", false);
        setIntField(term3836, term3836.getClass(), "requestInterval", -1100497683);
        setField(term3836, term3836.getClass(), "rebootStartTime", "EnmiAvfpJv");
        setField(term3836, term3836.getClass(), "rebootEndTime", "AdYzLPMcwe");
        setIntField(term3836, term3836.getClass(), "movieUploadLimit", 155423433);
        setIntField(term3836, term3836.getClass(), "movieStatus", -815471632);
        setField(term3836, term3836.getClass(), "movieServerUri", "FrTZLybkKk");
        setField(term3836, term3836.getClass(), "deliverServerUri", "FlxVmiMYKP");
        setField(term3836, term3836.getClass(), "oldServerUri", "fgOpAWlGYN");
        setField(term3836, term3836.getClass(), "usbDlServerUri", "PNzNzzjSXM");
        setIntField(term3836, term3836.getClass(), "rebootInterval", -1469668708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ktKcSZiuGM";
        callMethod(klass, "setRebootStartTime", argTypes, term3836, args);
    }

};


