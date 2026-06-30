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

public class UserKop_setTotalPlatinumScore_59347416441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282666;
     Object term282673;

    public UserKop_setTotalPlatinumScore_59347416441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282666 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282666, term282666.getClass(), "id", 0L);
        setField(term282666, term282666.getClass(), "user", null);
        setField(term282666, term282666.getClass(), "authKey", null);
        setIntField(term282666, term282666.getClass(), "kopId", 0);
        setIntField(term282666, term282666.getClass(), "areaId", 0);
        setIntField(term282666, term282666.getClass(), "totalTechScore", 0);
        setIntField(term282666, term282666.getClass(), "totalPlatinumScore", 0);
        setField(term282666, term282666.getClass(), "techRecordDate", null);
        setBooleanField(term282666, term282666.getClass(), "isTotalTechNewRecord", false);
        term282673 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term282673;
        callMethod(klass, "setTotalPlatinumScore", argTypes, term282666, args);
    }

};


