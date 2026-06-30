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

public class UserCharge_getParam1_7549087132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68830;

    public UserCharge_getParam1_7549087132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68830 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68830, term68830.getClass(), "id", 0L);
        setField(term68830, term68830.getClass(), "user", null);
        setIntField(term68830, term68830.getClass(), "chargeId", 0);
        setIntField(term68830, term68830.getClass(), "stock", 0);
        setField(term68830, term68830.getClass(), "purchaseDate", null);
        setField(term68830, term68830.getClass(), "validDate", null);
        setIntField(term68830, term68830.getClass(), "param1", 0);
        setIntField(term68830, term68830.getClass(), "param2", 0);
        setField(term68830, term68830.getClass(), "paramDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term68830, args);
    }

};


