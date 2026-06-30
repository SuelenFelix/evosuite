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

public class UserKop_setUser_89546194036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282625;

    public UserKop_setUser_89546194036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282625 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282625, term282625.getClass(), "id", 0L);
        setField(term282625, term282625.getClass(), "user", null);
        setField(term282625, term282625.getClass(), "authKey", null);
        setIntField(term282625, term282625.getClass(), "kopId", 0);
        setIntField(term282625, term282625.getClass(), "areaId", 0);
        setIntField(term282625, term282625.getClass(), "totalTechScore", 0);
        setIntField(term282625, term282625.getClass(), "totalPlatinumScore", 0);
        setField(term282625, term282625.getClass(), "techRecordDate", null);
        setBooleanField(term282625, term282625.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term282625, args);
    }

};


