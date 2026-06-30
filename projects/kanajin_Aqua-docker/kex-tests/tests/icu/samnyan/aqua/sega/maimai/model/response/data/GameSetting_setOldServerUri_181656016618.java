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

public class GameSetting_setOldServerUri_181656016618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5127;

    public GameSetting_setOldServerUri_181656016618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5127, term5127.getClass(), "isMaintenance", true);
        setIntField(term5127, term5127.getClass(), "requestInterval", -571931590);
        setField(term5127, term5127.getClass(), "rebootStartTime", "nxSTJflLQy");
        setField(term5127, term5127.getClass(), "rebootEndTime", "FlHzxEfFzI");
        setIntField(term5127, term5127.getClass(), "movieUploadLimit", 37757400);
        setIntField(term5127, term5127.getClass(), "movieStatus", -1632221612);
        setField(term5127, term5127.getClass(), "movieServerUri", "aSATgQUpoe");
        setField(term5127, term5127.getClass(), "deliverServerUri", "VkPSXewZfB");
        setField(term5127, term5127.getClass(), "oldServerUri", "ubodzJoMGW");
        setField(term5127, term5127.getClass(), "usbDlServerUri", "weddIktxOA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uSlMeISsDD";
        callMethod(klass, "setOldServerUri", argTypes, term5127, args);
    }

};


