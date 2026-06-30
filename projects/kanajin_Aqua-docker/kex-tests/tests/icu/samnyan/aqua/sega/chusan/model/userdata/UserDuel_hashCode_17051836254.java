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

public class UserDuel_hashCode_17051836254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17686;

    public UserDuel_hashCode_17051836254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17686 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17686, term17686.getClass(), "id", 0L);
        setField(term17686, term17686.getClass(), "user", null);
        setIntField(term17686, term17686.getClass(), "duelId", 0);
        setIntField(term17686, term17686.getClass(), "progress", 0);
        setIntField(term17686, term17686.getClass(), "point", 0);
        setBooleanField(term17686, term17686.getClass(), "isClear", false);
        setField(term17686, term17686.getClass(), "lastPlayDate", null);
        setIntField(term17686, term17686.getClass(), "param1", 0);
        setIntField(term17686, term17686.getClass(), "param2", 0);
        setIntField(term17686, term17686.getClass(), "param3", 0);
        setIntField(term17686, term17686.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17686, args);
    }

};


