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

public class PowerOnRequest_getHops_1877167328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1769;

    public PowerOnRequest_getHops_1877167328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1769 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1769, term1769.getClass(), "game_id", "idgaQsnJpQ");
        setField(term1769, term1769.getClass(), "ver", "VgZnGoIFwQ");
        setField(term1769, term1769.getClass(), "serial", "jUbSRrkrYZ");
        setField(term1769, term1769.getClass(), "ip", "bWWfajKbEX");
        setField(term1769, term1769.getClass(), "firm_ver", "cAPeiZHKGJ");
        setField(term1769, term1769.getClass(), "boot_ver", "LvJFtLBaxj");
        setField(term1769, term1769.getClass(), "encode", "PHvxnGHptP");
        setField(term1769, term1769.getClass(), "format_ver", "TimdotUuNC");
        setField(term1769, term1769.getClass(), "hops", "PkWMRdJcBb");
        setField(term1769, term1769.getClass(), "token", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHops", argTypes, term1769, args);
    }

};


