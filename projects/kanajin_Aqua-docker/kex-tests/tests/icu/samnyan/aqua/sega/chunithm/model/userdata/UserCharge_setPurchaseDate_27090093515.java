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

public class UserCharge_setPurchaseDate_27090093515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112374;

    public UserCharge_setPurchaseDate_27090093515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2112374 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge"));
        setLongField(term2112374, term2112374.getClass(), "id", 0L);
        setField(term2112374, term2112374.getClass(), "user", null);
        setIntField(term2112374, term2112374.getClass(), "chargeId", 0);
        setIntField(term2112374, term2112374.getClass(), "stock", 0);
        setField(term2112374, term2112374.getClass(), "purchaseDate", null);
        setField(term2112374, term2112374.getClass(), "validDate", null);
        setIntField(term2112374, term2112374.getClass(), "param1", 0);
        setIntField(term2112374, term2112374.getClass(), "param2", 0);
        setField(term2112374, term2112374.getClass(), "paramDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPurchaseDate", argTypes, term2112374, args);
    }

};


