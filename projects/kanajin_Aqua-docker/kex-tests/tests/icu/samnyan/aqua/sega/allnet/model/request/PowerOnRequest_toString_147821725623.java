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

public class PowerOnRequest_toString_147821725623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5306;

    public PowerOnRequest_toString_147821725623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5306 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5306, term5306.getClass(), "game_id", "iIRsCSYqXH");
        setField(term5306, term5306.getClass(), "ver", "nghfqDXyCG");
        setField(term5306, term5306.getClass(), "serial", "WBAOTqErtm");
        setField(term5306, term5306.getClass(), "ip", "PqtVXXZMqK");
        setField(term5306, term5306.getClass(), "firm_ver", "rYbtIDVdnd");
        setField(term5306, term5306.getClass(), "boot_ver", "UKAReurpHG");
        setField(term5306, term5306.getClass(), "encode", "WVRMUmrljA");
        setField(term5306, term5306.getClass(), "format_ver", "NTlKJDDWlk");
        setField(term5306, term5306.getClass(), "hops", "vOuMEpOQAg");
        setField(term5306, term5306.getClass(), "token", "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5306, args);
    }

};


