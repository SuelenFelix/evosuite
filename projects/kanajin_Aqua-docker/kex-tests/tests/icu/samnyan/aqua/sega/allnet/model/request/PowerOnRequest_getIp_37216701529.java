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

public class PowerOnRequest_getIp_37216701529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5750;

    public PowerOnRequest_getIp_37216701529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5750 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5750, term5750.getClass(), "game_id", null);
        setField(term5750, term5750.getClass(), "ver", null);
        setField(term5750, term5750.getClass(), "serial", null);
        setField(term5750, term5750.getClass(), "ip", null);
        setField(term5750, term5750.getClass(), "firm_ver", null);
        setField(term5750, term5750.getClass(), "boot_ver", null);
        setField(term5750, term5750.getClass(), "encode", null);
        setField(term5750, term5750.getClass(), "format_ver", null);
        setField(term5750, term5750.getClass(), "hops", null);
        setField(term5750, term5750.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term5750, args);
    }

};


