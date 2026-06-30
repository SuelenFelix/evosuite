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

public class PowerOnRequest_setToken_82751705719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4398;

    public PowerOnRequest_setToken_82751705719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4398 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term4398, term4398.getClass(), "game_id", "HDaezxQfQR");
        setField(term4398, term4398.getClass(), "ver", "iikZEapDlu");
        setField(term4398, term4398.getClass(), "serial", "nhoHrZfnIN");
        setField(term4398, term4398.getClass(), "ip", "ZkMALXpEAZ");
        setField(term4398, term4398.getClass(), "firm_ver", "tXfQjSqDzN");
        setField(term4398, term4398.getClass(), "boot_ver", "BjugTaMcxJ");
        setField(term4398, term4398.getClass(), "encode", "vGiuZVPJNH");
        setField(term4398, term4398.getClass(), "format_ver", "tlzpzIjMib");
        setField(term4398, term4398.getClass(), "hops", "AZdLeSugwv");
        setField(term4398, term4398.getClass(), "token", "RMsXuyzKJV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FwPbDZcHmB";
        callMethod(klass, "setToken", argTypes, term4398, args);
    }

};


