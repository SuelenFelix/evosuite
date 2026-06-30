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

public class GameSetting_setMovieStatus_171698670744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6014;
     Object term6020;

    public GameSetting_setMovieStatus_171698670744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6014 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term6014, term6014.getClass(), "isMaintenance", false);
        setIntField(term6014, term6014.getClass(), "requestInterval", 0);
        setField(term6014, term6014.getClass(), "rebootStartTime", null);
        setField(term6014, term6014.getClass(), "rebootEndTime", null);
        setIntField(term6014, term6014.getClass(), "movieUploadLimit", 0);
        setIntField(term6014, term6014.getClass(), "movieStatus", 0);
        setField(term6014, term6014.getClass(), "movieServerUri", null);
        setField(term6014, term6014.getClass(), "deliverServerUri", null);
        setField(term6014, term6014.getClass(), "oldServerUri", null);
        setField(term6014, term6014.getClass(), "usbDlServerUri", null);
        setIntField(term6014, term6014.getClass(), "rebootInterval", 0);
        term6020 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6020;
        callMethod(klass, "setMovieStatus", argTypes, term6014, args);
    }

};


