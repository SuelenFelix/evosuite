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

public class GameSetting_setMovieUploadLimit_209997475915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4156;
     Object term4234;

    public GameSetting_setMovieUploadLimit_209997475915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4156 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term4156, term4156.getClass(), "isMaintenance", true);
        setIntField(term4156, term4156.getClass(), "requestInterval", 1871761182);
        setField(term4156, term4156.getClass(), "rebootStartTime", "zSfoqzJbPT");
        setField(term4156, term4156.getClass(), "rebootEndTime", "QUymMnsCIj");
        setIntField(term4156, term4156.getClass(), "movieUploadLimit", 233983728);
        setIntField(term4156, term4156.getClass(), "movieStatus", -1650132476);
        setField(term4156, term4156.getClass(), "movieServerUri", "ikTtOgdVYS");
        setField(term4156, term4156.getClass(), "deliverServerUri", "JptuwlirlS");
        setField(term4156, term4156.getClass(), "oldServerUri", "TKOMaGswbU");
        setField(term4156, term4156.getClass(), "usbDlServerUri", "YcTbglHiUq");
        setIntField(term4156, term4156.getClass(), "rebootInterval", 1719680265);
        term4234 = new Integer(-1890898783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4234;
        callMethod(klass, "setMovieUploadLimit", argTypes, term4156, args);
    }

};


