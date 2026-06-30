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

public class PowerOnRequest_getFormatver_69653867533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5754;

    public PowerOnRequest_getFormatver_69653867533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5754 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5754, term5754.getClass(), "game_id", null);
        setField(term5754, term5754.getClass(), "ver", null);
        setField(term5754, term5754.getClass(), "serial", null);
        setField(term5754, term5754.getClass(), "ip", null);
        setField(term5754, term5754.getClass(), "firm_ver", null);
        setField(term5754, term5754.getClass(), "boot_ver", null);
        setField(term5754, term5754.getClass(), "encode", null);
        setField(term5754, term5754.getClass(), "format_ver", null);
        setField(term5754, term5754.getClass(), "hops", null);
        setField(term5754, term5754.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat_ver", argTypes, term5754, args);
    }

};


