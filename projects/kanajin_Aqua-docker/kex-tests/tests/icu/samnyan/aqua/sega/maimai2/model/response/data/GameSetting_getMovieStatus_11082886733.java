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

public class GameSetting_getMovieStatus_11082886733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5942;

    public GameSetting_getMovieStatus_11082886733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5942 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5942, term5942.getClass(), "isMaintenance", false);
        setIntField(term5942, term5942.getClass(), "requestInterval", 0);
        setField(term5942, term5942.getClass(), "rebootStartTime", null);
        setField(term5942, term5942.getClass(), "rebootEndTime", null);
        setIntField(term5942, term5942.getClass(), "movieUploadLimit", 0);
        setIntField(term5942, term5942.getClass(), "movieStatus", 0);
        setField(term5942, term5942.getClass(), "movieServerUri", null);
        setField(term5942, term5942.getClass(), "deliverServerUri", null);
        setField(term5942, term5942.getClass(), "oldServerUri", null);
        setField(term5942, term5942.getClass(), "usbDlServerUri", null);
        setIntField(term5942, term5942.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieStatus", argTypes, term5942, args);
    }

};


