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

public class UserCharge_getValidDate_10209399631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68824;

    public UserCharge_getValidDate_10209399631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68824 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68824, term68824.getClass(), "id", 0L);
        setField(term68824, term68824.getClass(), "user", null);
        setIntField(term68824, term68824.getClass(), "chargeId", 0);
        setIntField(term68824, term68824.getClass(), "stock", 0);
        setField(term68824, term68824.getClass(), "purchaseDate", null);
        setField(term68824, term68824.getClass(), "validDate", null);
        setIntField(term68824, term68824.getClass(), "param1", 0);
        setIntField(term68824, term68824.getClass(), "param2", 0);
        setField(term68824, term68824.getClass(), "paramDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValidDate", argTypes, term68824, args);
    }

};


