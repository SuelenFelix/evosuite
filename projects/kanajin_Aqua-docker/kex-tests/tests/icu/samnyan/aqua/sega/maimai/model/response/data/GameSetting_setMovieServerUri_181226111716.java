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

public class GameSetting_setMovieServerUri_181226111716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4809;

    public GameSetting_setMovieServerUri_181226111716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4809, term4809.getClass(), "isMaintenance", true);
        setIntField(term4809, term4809.getClass(), "requestInterval", 2105146188);
        setField(term4809, term4809.getClass(), "rebootStartTime", "TKlccZUpjz");
        setField(term4809, term4809.getClass(), "rebootEndTime", "GGzwMoHZXC");
        setIntField(term4809, term4809.getClass(), "movieUploadLimit", -862415480);
        setIntField(term4809, term4809.getClass(), "movieStatus", 312605349);
        setField(term4809, term4809.getClass(), "movieServerUri", "IpmgwHTgnG");
        setField(term4809, term4809.getClass(), "deliverServerUri", "tIpkeYIezR");
        setField(term4809, term4809.getClass(), "oldServerUri", "YkZtEtthvz");
        setField(term4809, term4809.getClass(), "usbDlServerUri", "dwlZSxlXOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lKrEAkypza";
        callMethod(klass, "setMovieServerUri", argTypes, term4809, args);
    }

};


