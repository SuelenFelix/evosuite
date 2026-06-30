package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCharge_setId_83627468435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208837;
     Object term208843;

    public UserCharge_setId_83627468435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208837 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge"));
        setLongField(term208837, term208837.getClass(), "id", 0L);
        setField(term208837, term208837.getClass(), "user", null);
        setIntField(term208837, term208837.getClass(), "chargeId", 0);
        setIntField(term208837, term208837.getClass(), "stock", 0);
        setField(term208837, term208837.getClass(), "purchaseDate", null);
        setField(term208837, term208837.getClass(), "validDate", null);
        setIntField(term208837, term208837.getClass(), "param1", 0);
        setIntField(term208837, term208837.getClass(), "param2", 0);
        setField(term208837, term208837.getClass(), "paramDate", null);
        term208843 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term208843;
        callMethod(klass, "setId", argTypes, term208837, args);
    }

};


