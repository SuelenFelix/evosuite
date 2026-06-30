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

public class GameSetting_getMovieUploadLimit_34484567332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5936;

    public GameSetting_getMovieUploadLimit_34484567332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5936 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5936, term5936.getClass(), "isMaintenance", false);
        setIntField(term5936, term5936.getClass(), "requestInterval", 0);
        setField(term5936, term5936.getClass(), "rebootStartTime", null);
        setField(term5936, term5936.getClass(), "rebootEndTime", null);
        setIntField(term5936, term5936.getClass(), "movieUploadLimit", 0);
        setIntField(term5936, term5936.getClass(), "movieStatus", 0);
        setField(term5936, term5936.getClass(), "movieServerUri", null);
        setField(term5936, term5936.getClass(), "deliverServerUri", null);
        setField(term5936, term5936.getClass(), "oldServerUri", null);
        setField(term5936, term5936.getClass(), "usbDlServerUri", null);
        setIntField(term5936, term5936.getClass(), "rebootInterval", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieUploadLimit", argTypes, term5936, args);
    }

};


