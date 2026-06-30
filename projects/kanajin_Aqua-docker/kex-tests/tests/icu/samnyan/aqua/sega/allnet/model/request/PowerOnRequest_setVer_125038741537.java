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

public class PowerOnRequest_setVer_125038741537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5758;

    public PowerOnRequest_setVer_125038741537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5758 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5758, term5758.getClass(), "game_id", null);
        setField(term5758, term5758.getClass(), "ver", null);
        setField(term5758, term5758.getClass(), "serial", null);
        setField(term5758, term5758.getClass(), "ip", null);
        setField(term5758, term5758.getClass(), "firm_ver", null);
        setField(term5758, term5758.getClass(), "boot_ver", null);
        setField(term5758, term5758.getClass(), "encode", null);
        setField(term5758, term5758.getClass(), "format_ver", null);
        setField(term5758, term5758.getClass(), "hops", null);
        setField(term5758, term5758.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVer", argTypes, term5758, args);
    }

};


