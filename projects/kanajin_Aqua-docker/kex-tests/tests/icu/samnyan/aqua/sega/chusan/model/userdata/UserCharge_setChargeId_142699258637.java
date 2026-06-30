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
import java.lang.Integer;

public class UserCharge_setChargeId_142699258637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68862;
     Object term68868;

    public UserCharge_setChargeId_142699258637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68862 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68862, term68862.getClass(), "id", 0L);
        setField(term68862, term68862.getClass(), "user", null);
        setIntField(term68862, term68862.getClass(), "chargeId", 0);
        setIntField(term68862, term68862.getClass(), "stock", 0);
        setField(term68862, term68862.getClass(), "purchaseDate", null);
        setField(term68862, term68862.getClass(), "validDate", null);
        setIntField(term68862, term68862.getClass(), "param1", 0);
        setIntField(term68862, term68862.getClass(), "param2", 0);
        setField(term68862, term68862.getClass(), "paramDate", null);
        term68868 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68868;
        callMethod(klass, "setChargeId", argTypes, term68862, args);
    }

};


