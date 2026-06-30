package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCharge_setId_133648313435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68848;
     Object term68854;

    public UserCharge_setId_133648313435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68848 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68848, term68848.getClass(), "id", 0L);
        setField(term68848, term68848.getClass(), "user", null);
        setIntField(term68848, term68848.getClass(), "chargeId", 0);
        setIntField(term68848, term68848.getClass(), "stock", 0);
        setField(term68848, term68848.getClass(), "purchaseDate", null);
        setField(term68848, term68848.getClass(), "validDate", null);
        setIntField(term68848, term68848.getClass(), "param1", 0);
        setIntField(term68848, term68848.getClass(), "param2", 0);
        setField(term68848, term68848.getClass(), "paramDate", null);
        term68854 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term68854;
        callMethod(klass, "setId", argTypes, term68848, args);
    }

};


