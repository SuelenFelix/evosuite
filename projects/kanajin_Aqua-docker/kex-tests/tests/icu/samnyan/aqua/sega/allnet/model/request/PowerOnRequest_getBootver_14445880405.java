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

public class PowerOnRequest_getBootver_14445880405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106;

    public PowerOnRequest_getBootver_14445880405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1106 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1106, term1106.getClass(), "game_id", "nGKItKLYNC");
        setField(term1106, term1106.getClass(), "ver", "UiUYnPrcCi");
        setField(term1106, term1106.getClass(), "serial", "UoYtihxVaS");
        setField(term1106, term1106.getClass(), "ip", "JDswTTCZHV");
        setField(term1106, term1106.getClass(), "firm_ver", "onpbIeEKoi");
        setField(term1106, term1106.getClass(), "boot_ver", "YRHGsAkhxb");
        setField(term1106, term1106.getClass(), "encode", "ffYhPOzlUs");
        setField(term1106, term1106.getClass(), "format_ver", "MLqYREekMl");
        setField(term1106, term1106.getClass(), "hops", "ytSBIKXogI");
        setField(term1106, term1106.getClass(), "token", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoot_ver", argTypes, term1106, args);
    }

};


