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

public class PowerOnRequest_getGameid_6944928140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PowerOnRequest_getGameid_6944928140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1, term1.getClass(), "game_id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "ver", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "serial", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "ip", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "firm_ver", "jJCZpVmanW");
        setField(term1, term1.getClass(), "boot_ver", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "encode", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "format_ver", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "hops", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "token", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGame_id", argTypes, term1, args);
    }

};


