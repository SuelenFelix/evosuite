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

public class PowerOnRequest_canEqual_105314104621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4863;
     Object term4984;

    public PowerOnRequest_canEqual_105314104621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4863 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term4863, term4863.getClass(), "game_id", "GZdcJyZntS");
        setField(term4863, term4863.getClass(), "ver", "OIHoJeysUi");
        setField(term4863, term4863.getClass(), "serial", "WXMWFDGcLB");
        setField(term4863, term4863.getClass(), "ip", "wKWbJssZuG");
        setField(term4863, term4863.getClass(), "firm_ver", "NzBMMhkhpT");
        setField(term4863, term4863.getClass(), "boot_ver", "qCpEbQDHdF");
        setField(term4863, term4863.getClass(), "encode", "AHbZyFOmlo");
        setField(term4863, term4863.getClass(), "format_ver", "TwfWVQGiIj");
        setField(term4863, term4863.getClass(), "hops", "gUvcueTURF");
        setField(term4863, term4863.getClass(), "token", "EwQBhZjCIT");
        term4984 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4984;
        callMethod(klass, "canEqual", argTypes, term4863, args);
    }

};


