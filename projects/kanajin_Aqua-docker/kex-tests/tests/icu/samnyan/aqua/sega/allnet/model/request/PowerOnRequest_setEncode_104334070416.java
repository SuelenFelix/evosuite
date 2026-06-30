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

public class PowerOnRequest_setEncode_104334070416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3669;

    public PowerOnRequest_setEncode_104334070416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3669 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term3669, term3669.getClass(), "game_id", "smnHEqRFRx");
        setField(term3669, term3669.getClass(), "ver", "XYtryyobou");
        setField(term3669, term3669.getClass(), "serial", "OYbzXylRWW");
        setField(term3669, term3669.getClass(), "ip", "DSNsTGYXDF");
        setField(term3669, term3669.getClass(), "firm_ver", "sQvGcVjdEx");
        setField(term3669, term3669.getClass(), "boot_ver", "rLHAoqXgPh");
        setField(term3669, term3669.getClass(), "encode", "zUlRdimJtU");
        setField(term3669, term3669.getClass(), "format_ver", "vwbEQQNQrx");
        setField(term3669, term3669.getClass(), "hops", "xtftXXMbem");
        setField(term3669, term3669.getClass(), "token", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        callMethod(klass, "setEncode", argTypes, term3669, args);
    }

};


