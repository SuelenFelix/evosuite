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

public class PowerOnRequest_hashCode_198897694622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;

    public PowerOnRequest_hashCode_198897694622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5085 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term5085, term5085.getClass(), "game_id", "aSkmSwTnEw");
        setField(term5085, term5085.getClass(), "ver", "xvkbvaEGYd");
        setField(term5085, term5085.getClass(), "serial", "HBGNxdNURv");
        setField(term5085, term5085.getClass(), "ip", "mfCpTPPQQm");
        setField(term5085, term5085.getClass(), "firm_ver", "OcJCIDNIXA");
        setField(term5085, term5085.getClass(), "boot_ver", "XfRABIFVEp");
        setField(term5085, term5085.getClass(), "encode", "MHGKyEnwKc");
        setField(term5085, term5085.getClass(), "format_ver", "ShIELyuULw");
        setField(term5085, term5085.getClass(), "hops", "IpQuOGMgmj");
        setField(term5085, term5085.getClass(), "token", "pJbnHTYrxn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5085, args);
    }

};


