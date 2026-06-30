package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AttendResponse_setAtndprm3_206118439116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369;

    public AttendResponse_setAtndprm3_206118439116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1369 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        setField(term1369, term1369.getClass(), "atnd_prm1", null);
        setField(term1369, term1369.getClass(), "atnd_prm2", null);
        setField(term1369, term1369.getClass(), "atnd_prm3", null);
        setField(term1369, term1369.getClass(), "atnd_lut", null);
        setField(term1369, term1369.getClass(), "cmd", null);
        setField(term1369, term1369.getClass(), "req_id", null);
        setField(term1369, term1369.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAtnd_prm3", argTypes, term1369, args);
    }

};


