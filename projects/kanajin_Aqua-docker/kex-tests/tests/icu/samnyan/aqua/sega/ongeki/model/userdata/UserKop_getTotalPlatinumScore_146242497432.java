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

public class UserKop_getTotalPlatinumScore_146242497432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282595;

    public UserKop_getTotalPlatinumScore_146242497432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282595 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282595, term282595.getClass(), "id", 0L);
        setField(term282595, term282595.getClass(), "user", null);
        setField(term282595, term282595.getClass(), "authKey", null);
        setIntField(term282595, term282595.getClass(), "kopId", 0);
        setIntField(term282595, term282595.getClass(), "areaId", 0);
        setIntField(term282595, term282595.getClass(), "totalTechScore", 0);
        setIntField(term282595, term282595.getClass(), "totalPlatinumScore", 0);
        setField(term282595, term282595.getClass(), "techRecordDate", null);
        setBooleanField(term282595, term282595.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPlatinumScore", argTypes, term282595, args);
    }

};


