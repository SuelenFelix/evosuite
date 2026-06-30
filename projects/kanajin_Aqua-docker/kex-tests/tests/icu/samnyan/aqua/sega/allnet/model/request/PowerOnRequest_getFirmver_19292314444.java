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

public class PowerOnRequest_getFirmver_19292314444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885;

    public PowerOnRequest_getFirmver_19292314444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term885 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term885, term885.getClass(), "game_id", "wSQxaModmm");
        setField(term885, term885.getClass(), "ver", "UlajhuVLaP");
        setField(term885, term885.getClass(), "serial", "gGSMzuGICf");
        setField(term885, term885.getClass(), "ip", "hxCBltsObl");
        setField(term885, term885.getClass(), "firm_ver", "BndsHwAFMv");
        setField(term885, term885.getClass(), "boot_ver", "GzFkzHGYFt");
        setField(term885, term885.getClass(), "encode", "tShwQLRGNe");
        setField(term885, term885.getClass(), "format_ver", "LvtrsXUliU");
        setField(term885, term885.getClass(), "hops", "xLbjWUgOIL");
        setField(term885, term885.getClass(), "token", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirm_ver", argTypes, term885, args);
    }

};


