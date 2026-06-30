package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserKop_setKopId_203775441138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282639;
     Object term282646;

    public UserKop_setKopId_203775441138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282639 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282639, term282639.getClass(), "id", 0L);
        setField(term282639, term282639.getClass(), "user", null);
        setField(term282639, term282639.getClass(), "authKey", null);
        setIntField(term282639, term282639.getClass(), "kopId", 0);
        setIntField(term282639, term282639.getClass(), "areaId", 0);
        setIntField(term282639, term282639.getClass(), "totalTechScore", 0);
        setIntField(term282639, term282639.getClass(), "totalPlatinumScore", 0);
        setField(term282639, term282639.getClass(), "techRecordDate", null);
        setBooleanField(term282639, term282639.getClass(), "isTotalTechNewRecord", false);
        term282646 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term282646;
        callMethod(klass, "setKopId", argTypes, term282639, args);
    }

};


