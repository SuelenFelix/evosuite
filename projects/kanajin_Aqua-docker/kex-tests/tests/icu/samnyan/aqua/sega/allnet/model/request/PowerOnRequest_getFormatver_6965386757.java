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

public class PowerOnRequest_getFormatver_6965386757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1548;

    public PowerOnRequest_getFormatver_6965386757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1548 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1548, term1548.getClass(), "game_id", "whBvTVIIlC");
        setField(term1548, term1548.getClass(), "ver", "IgRJUzaCwW");
        setField(term1548, term1548.getClass(), "serial", "JUmudUmaaV");
        setField(term1548, term1548.getClass(), "ip", "KoyGrUJeJW");
        setField(term1548, term1548.getClass(), "firm_ver", "HqBOwkVqjD");
        setField(term1548, term1548.getClass(), "boot_ver", "MAcUBcBckh");
        setField(term1548, term1548.getClass(), "encode", "oVgzLbrsFr");
        setField(term1548, term1548.getClass(), "format_ver", "vQVyKLdtaz");
        setField(term1548, term1548.getClass(), "hops", "OWKQODBLzb");
        setField(term1548, term1548.getClass(), "token", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat_ver", argTypes, term1548, args);
    }

};


