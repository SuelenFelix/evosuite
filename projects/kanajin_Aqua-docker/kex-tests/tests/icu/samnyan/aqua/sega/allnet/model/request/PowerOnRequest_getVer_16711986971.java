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

public class PowerOnRequest_getVer_16711986971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public PowerOnRequest_getVer_16711986971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term222, term222.getClass(), "game_id", "NRdvgJlhkX");
        setField(term222, term222.getClass(), "ver", "uuaPigETmJ");
        setField(term222, term222.getClass(), "serial", "MxlszYVzRf");
        setField(term222, term222.getClass(), "ip", "LQFpaHEwXR");
        setField(term222, term222.getClass(), "firm_ver", "oVcInYnLWB");
        setField(term222, term222.getClass(), "boot_ver", "aJlieCFVtF");
        setField(term222, term222.getClass(), "encode", "ZiaGIbnzTs");
        setField(term222, term222.getClass(), "format_ver", "tbcdzjIfER");
        setField(term222, term222.getClass(), "hops", "HyxfbSQYBe");
        setField(term222, term222.getClass(), "token", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVer", argTypes, term222, args);
    }

};


