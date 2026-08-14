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

public class UserCharge_getParam2_42471854034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2116610;

    public UserCharge_getParam2_42471854034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2116610 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge"));
        setLongField(term2116610, term2116610.getClass(), "id", 0L);
        setField(term2116610, term2116610.getClass(), "user", null);
        setIntField(term2116610, term2116610.getClass(), "chargeId", 0);
        setIntField(term2116610, term2116610.getClass(), "stock", 0);
        setField(term2116610, term2116610.getClass(), "purchaseDate", null);
        setField(term2116610, term2116610.getClass(), "validDate", null);
        setIntField(term2116610, term2116610.getClass(), "param1", 0);
        setIntField(term2116610, term2116610.getClass(), "param2", 0);
        setField(term2116610, term2116610.getClass(), "paramDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term2116610, args);
    }

};


