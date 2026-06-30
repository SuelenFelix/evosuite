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
import java.lang.Integer;

public class GameSetting_setRebootInterval_116118509521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5076;
     Object term5154;

    public GameSetting_setRebootInterval_116118509521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5076 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5076, term5076.getClass(), "isMaintenance", true);
        setIntField(term5076, term5076.getClass(), "requestInterval", -1891353352);
        setField(term5076, term5076.getClass(), "rebootStartTime", "YupgKTSEiI");
        setField(term5076, term5076.getClass(), "rebootEndTime", "HuOUlaFmvJ");
        setIntField(term5076, term5076.getClass(), "movieUploadLimit", 113007640);
        setIntField(term5076, term5076.getClass(), "movieStatus", 1782226794);
        setField(term5076, term5076.getClass(), "movieServerUri", "dWVwcwFGNo");
        setField(term5076, term5076.getClass(), "deliverServerUri", "PNdLRrSAIY");
        setField(term5076, term5076.getClass(), "oldServerUri", "nJnRIRiLZK");
        setField(term5076, term5076.getClass(), "usbDlServerUri", "eWnrMSbYbT");
        setIntField(term5076, term5076.getClass(), "rebootInterval", 1115327577);
        term5154 = new Integer(840704993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5154;
        callMethod(klass, "setRebootInterval", argTypes, term5076, args);
    }

};


