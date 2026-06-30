package icu.samnyan.aqua.sega.allnet.model.request;

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
import static icu.samnyan.aqua.sega.allnet.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnRequest_setSerial_69909657412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2697;

    public PowerOnRequest_setSerial_69909657412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2697 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term2697, term2697.getClass(), "game_id", "WzMEhMXkKx");
        setField(term2697, term2697.getClass(), "ver", "XOiDvlDhdc");
        setField(term2697, term2697.getClass(), "serial", "AdxvLJhNLe");
        setField(term2697, term2697.getClass(), "ip", "lHfTrWKMPk");
        setField(term2697, term2697.getClass(), "firm_ver", "JDaAnsVTGV");
        setField(term2697, term2697.getClass(), "boot_ver", "mLUZFTfjle");
        setField(term2697, term2697.getClass(), "encode", "xIeFjkHkOe");
        setField(term2697, term2697.getClass(), "format_ver", "SdCKLMIYnX");
        setField(term2697, term2697.getClass(), "hops", "OJJtVNPyKZ");
        setField(term2697, term2697.getClass(), "token", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "setSerial", argTypes, term2697, args);
    }

};


