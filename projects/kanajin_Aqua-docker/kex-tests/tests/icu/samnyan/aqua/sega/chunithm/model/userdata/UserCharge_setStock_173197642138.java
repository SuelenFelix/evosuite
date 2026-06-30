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
import java.lang.Integer;

public class UserCharge_setStock_173197642138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208859;
     Object term208865;

    public UserCharge_setStock_173197642138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208859 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge"));
        setLongField(term208859, term208859.getClass(), "id", 0L);
        setField(term208859, term208859.getClass(), "user", null);
        setIntField(term208859, term208859.getClass(), "chargeId", 0);
        setIntField(term208859, term208859.getClass(), "stock", 0);
        setField(term208859, term208859.getClass(), "purchaseDate", null);
        setField(term208859, term208859.getClass(), "validDate", null);
        setIntField(term208859, term208859.getClass(), "param1", 0);
        setIntField(term208859, term208859.getClass(), "param2", 0);
        setField(term208859, term208859.getClass(), "paramDate", null);
        term208865 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term208865;
        callMethod(klass, "setStock", argTypes, term208859, args);
    }

};


