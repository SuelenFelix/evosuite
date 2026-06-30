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

public class PowerOnRequest_setFirmver_34288900440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5761;

    public PowerOnRequest_setFirmver_34288900440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5761 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5761, term5761.getClass(), "game_id", null);
        setField(term5761, term5761.getClass(), "ver", null);
        setField(term5761, term5761.getClass(), "serial", null);
        setField(term5761, term5761.getClass(), "ip", null);
        setField(term5761, term5761.getClass(), "firm_ver", null);
        setField(term5761, term5761.getClass(), "boot_ver", null);
        setField(term5761, term5761.getClass(), "encode", null);
        setField(term5761, term5761.getClass(), "format_ver", null);
        setField(term5761, term5761.getClass(), "hops", null);
        setField(term5761, term5761.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirm_ver", argTypes, term5761, args);
    }

};


