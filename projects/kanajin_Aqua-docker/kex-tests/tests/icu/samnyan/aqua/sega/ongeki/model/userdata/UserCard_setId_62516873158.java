package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCard_setId_62516873158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133419;
     Object term133432;

    public UserCard_setId_62516873158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133419 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133419, term133419.getClass(), "id", 0L);
        setField(term133419, term133419.getClass(), "user", null);
        setIntField(term133419, term133419.getClass(), "cardId", 0);
        setIntField(term133419, term133419.getClass(), "digitalStock", 0);
        setIntField(term133419, term133419.getClass(), "analogStock", 0);
        setIntField(term133419, term133419.getClass(), "level", 0);
        setIntField(term133419, term133419.getClass(), "maxLevel", 0);
        setIntField(term133419, term133419.getClass(), "exp", 0);
        setIntField(term133419, term133419.getClass(), "printCount", 0);
        setIntField(term133419, term133419.getClass(), "useCount", 0);
        setBooleanField(term133419, term133419.getClass(), "isNew", false);
        setField(term133419, term133419.getClass(), "kaikaDate", null);
        setField(term133419, term133419.getClass(), "choKaikaDate", null);
        setIntField(term133419, term133419.getClass(), "skillId", 0);
        setBooleanField(term133419, term133419.getClass(), "isAcquired", false);
        setField(term133419, term133419.getClass(), "created", null);
        term133432 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term133432;
        callMethod(klass, "setId", argTypes, term133419, args);
    }

};


