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

public class UserKop_hashCode_2030923746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282705;

    public UserKop_hashCode_2030923746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282705 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282705, term282705.getClass(), "id", 0L);
        setField(term282705, term282705.getClass(), "user", null);
        setField(term282705, term282705.getClass(), "authKey", null);
        setIntField(term282705, term282705.getClass(), "kopId", 0);
        setIntField(term282705, term282705.getClass(), "areaId", 0);
        setIntField(term282705, term282705.getClass(), "totalTechScore", 0);
        setIntField(term282705, term282705.getClass(), "totalPlatinumScore", 0);
        setField(term282705, term282705.getClass(), "techRecordDate", null);
        setBooleanField(term282705, term282705.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term282705, args);
    }

};


