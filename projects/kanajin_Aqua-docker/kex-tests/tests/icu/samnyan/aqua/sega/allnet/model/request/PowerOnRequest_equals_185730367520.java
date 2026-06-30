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

public class PowerOnRequest_equals_185730367520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4641;
     Object term4762;

    public PowerOnRequest_equals_185730367520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4641 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term4641, term4641.getClass(), "game_id", "hOncybyCAH");
        setField(term4641, term4641.getClass(), "ver", "QduALnDSVo");
        setField(term4641, term4641.getClass(), "serial", "izPpKDErnQ");
        setField(term4641, term4641.getClass(), "ip", "NnpwZBUTvx");
        setField(term4641, term4641.getClass(), "firm_ver", "tlQSNgTkQX");
        setField(term4641, term4641.getClass(), "boot_ver", "PCipZnmBOF");
        setField(term4641, term4641.getClass(), "encode", "zcorEihhLK");
        setField(term4641, term4641.getClass(), "format_ver", "GrqozDKFOk");
        setField(term4641, term4641.getClass(), "hops", "CFyoseFGLF");
        setField(term4641, term4641.getClass(), "token", "SFqCrhEWLm");
        term4762 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4762;
        callMethod(klass, "equals", argTypes, term4641, args);
    }

};


