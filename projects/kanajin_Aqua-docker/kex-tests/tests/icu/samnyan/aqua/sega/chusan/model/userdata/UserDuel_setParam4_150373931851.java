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

public class UserDuel_setParam4_150373931851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17654;
     Object term17664;

    public UserDuel_setParam4_150373931851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17654 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17654, term17654.getClass(), "id", 0L);
        setField(term17654, term17654.getClass(), "user", null);
        setIntField(term17654, term17654.getClass(), "duelId", 0);
        setIntField(term17654, term17654.getClass(), "progress", 0);
        setIntField(term17654, term17654.getClass(), "point", 0);
        setBooleanField(term17654, term17654.getClass(), "isClear", false);
        setField(term17654, term17654.getClass(), "lastPlayDate", null);
        setIntField(term17654, term17654.getClass(), "param1", 0);
        setIntField(term17654, term17654.getClass(), "param2", 0);
        setIntField(term17654, term17654.getClass(), "param3", 0);
        setIntField(term17654, term17654.getClass(), "param4", 0);
        term17664 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17664;
        callMethod(klass, "setParam4", argTypes, term17654, args);
    }

};


