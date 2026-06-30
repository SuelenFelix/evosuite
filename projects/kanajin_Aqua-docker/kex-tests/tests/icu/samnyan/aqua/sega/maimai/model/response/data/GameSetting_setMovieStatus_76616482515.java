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

public class GameSetting_setMovieStatus_76616482515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4670;
     Object term4747;

    public GameSetting_setMovieStatus_76616482515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4670 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4670, term4670.getClass(), "isMaintenance", false);
        setIntField(term4670, term4670.getClass(), "requestInterval", 962385185);
        setField(term4670, term4670.getClass(), "rebootStartTime", "nQhIgWXdRc");
        setField(term4670, term4670.getClass(), "rebootEndTime", "EusenEbIoF");
        setIntField(term4670, term4670.getClass(), "movieUploadLimit", 2146718886);
        setIntField(term4670, term4670.getClass(), "movieStatus", -985577036);
        setField(term4670, term4670.getClass(), "movieServerUri", "SScVQYSvWH");
        setField(term4670, term4670.getClass(), "deliverServerUri", "MnovcqFhCl");
        setField(term4670, term4670.getClass(), "oldServerUri", "qYtAeLzOhW");
        setField(term4670, term4670.getClass(), "usbDlServerUri", "tJzmOfcUnY");
        term4747 = new Integer(802539130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4747;
        callMethod(klass, "setMovieStatus", argTypes, term4670, args);
    }

};


