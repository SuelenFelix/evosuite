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

public class UserCard_setKaikaDate_158456945869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133582;

    public UserCard_setKaikaDate_158456945869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133582 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133582, term133582.getClass(), "id", 0L);
        setField(term133582, term133582.getClass(), "user", null);
        setIntField(term133582, term133582.getClass(), "cardId", 0);
        setIntField(term133582, term133582.getClass(), "digitalStock", 0);
        setIntField(term133582, term133582.getClass(), "analogStock", 0);
        setIntField(term133582, term133582.getClass(), "level", 0);
        setIntField(term133582, term133582.getClass(), "maxLevel", 0);
        setIntField(term133582, term133582.getClass(), "exp", 0);
        setIntField(term133582, term133582.getClass(), "printCount", 0);
        setIntField(term133582, term133582.getClass(), "useCount", 0);
        setBooleanField(term133582, term133582.getClass(), "isNew", false);
        setField(term133582, term133582.getClass(), "kaikaDate", null);
        setField(term133582, term133582.getClass(), "choKaikaDate", null);
        setIntField(term133582, term133582.getClass(), "skillId", 0);
        setBooleanField(term133582, term133582.getClass(), "isAcquired", false);
        setField(term133582, term133582.getClass(), "created", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKaikaDate", argTypes, term133582, args);
    }

};


