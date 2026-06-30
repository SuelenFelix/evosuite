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

public class PowerOnRequest_setBootver_14175440015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3426;

    public PowerOnRequest_setBootver_14175440015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3426 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term3426, term3426.getClass(), "game_id", "aNWLJdrZMq");
        setField(term3426, term3426.getClass(), "ver", "HHmNoYxIGj");
        setField(term3426, term3426.getClass(), "serial", "PtirvZmsGt");
        setField(term3426, term3426.getClass(), "ip", "HWkpTmtlrc");
        setField(term3426, term3426.getClass(), "firm_ver", "hMmaoREuCK");
        setField(term3426, term3426.getClass(), "boot_ver", "VeDtgDzGAN");
        setField(term3426, term3426.getClass(), "encode", "aWYOWZFyaX");
        setField(term3426, term3426.getClass(), "format_ver", "BRIVNtfUWU");
        setField(term3426, term3426.getClass(), "hops", "DbiCVtPPCT");
        setField(term3426, term3426.getClass(), "token", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        callMethod(klass, "setBoot_ver", argTypes, term3426, args);
    }

};


