package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCharge_setValidDate_51341411431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132123;

    public UserCharge_setValidDate_51341411431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        setLongField(term132123, term132123.getClass(), "id", 0L);
        setField(term132123, term132123.getClass(), "user", null);
        setIntField(term132123, term132123.getClass(), "chargeId", 0);
        setIntField(term132123, term132123.getClass(), "stock", 0);
        setField(term132123, term132123.getClass(), "purchaseDate", null);
        setField(term132123, term132123.getClass(), "validDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setValidDate", argTypes, term132123, args);
    }

};


