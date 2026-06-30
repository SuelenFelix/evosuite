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

public class UserCharge_setStock_206278242538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68870;
     Object term68876;

    public UserCharge_setStock_206278242538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68870 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68870, term68870.getClass(), "id", 0L);
        setField(term68870, term68870.getClass(), "user", null);
        setIntField(term68870, term68870.getClass(), "chargeId", 0);
        setIntField(term68870, term68870.getClass(), "stock", 0);
        setField(term68870, term68870.getClass(), "purchaseDate", null);
        setField(term68870, term68870.getClass(), "validDate", null);
        setIntField(term68870, term68870.getClass(), "param1", 0);
        setIntField(term68870, term68870.getClass(), "param2", 0);
        setField(term68870, term68870.getClass(), "paramDate", null);
        term68876 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68876;
        callMethod(klass, "setStock", argTypes, term68870, args);
    }

};


