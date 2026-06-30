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

public class GameSetting_setMovieServerUri_86143923517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4436;

    public GameSetting_setMovieServerUri_86143923517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4436 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term4436, term4436.getClass(), "isMaintenance", false);
        setIntField(term4436, term4436.getClass(), "requestInterval", 892170444);
        setField(term4436, term4436.getClass(), "rebootStartTime", "JydxSNTMYt");
        setField(term4436, term4436.getClass(), "rebootEndTime", "KpurAcrHYT");
        setIntField(term4436, term4436.getClass(), "movieUploadLimit", -82417507);
        setIntField(term4436, term4436.getClass(), "movieStatus", -511400358);
        setField(term4436, term4436.getClass(), "movieServerUri", "QjvDwgKJGz");
        setField(term4436, term4436.getClass(), "deliverServerUri", "ngYxiXTZrk");
        setField(term4436, term4436.getClass(), "oldServerUri", "YTxBqWRAlo");
        setField(term4436, term4436.getClass(), "usbDlServerUri", "ReruUQRXwl");
        setIntField(term4436, term4436.getClass(), "rebootInterval", -742178468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DWEsVQwuaE";
        callMethod(klass, "setMovieServerUri", argTypes, term4436, args);
    }

};


