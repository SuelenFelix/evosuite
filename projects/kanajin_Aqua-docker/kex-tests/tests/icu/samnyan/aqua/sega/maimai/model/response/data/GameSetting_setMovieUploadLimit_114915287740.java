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
import java.lang.Integer;

public class GameSetting_setMovieUploadLimit_114915287740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6209;
     Object term6214;

    public GameSetting_setMovieUploadLimit_114915287740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6209 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term6209, term6209.getClass(), "isMaintenance", false);
        setIntField(term6209, term6209.getClass(), "requestInterval", 0);
        setField(term6209, term6209.getClass(), "rebootStartTime", null);
        setField(term6209, term6209.getClass(), "rebootEndTime", null);
        setIntField(term6209, term6209.getClass(), "movieUploadLimit", 0);
        setIntField(term6209, term6209.getClass(), "movieStatus", 0);
        setField(term6209, term6209.getClass(), "movieServerUri", null);
        setField(term6209, term6209.getClass(), "deliverServerUri", null);
        setField(term6209, term6209.getClass(), "oldServerUri", null);
        setField(term6209, term6209.getClass(), "usbDlServerUri", null);
        term6214 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6214;
        callMethod(klass, "setMovieUploadLimit", argTypes, term6209, args);
    }

};


