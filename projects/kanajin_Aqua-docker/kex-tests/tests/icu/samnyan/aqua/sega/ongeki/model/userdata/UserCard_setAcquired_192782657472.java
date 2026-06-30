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
import java.lang.Boolean;

public class UserCard_setAcquired_192782657472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133623;
     Object term133636;

    public UserCard_setAcquired_192782657472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133623 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133623, term133623.getClass(), "id", 0L);
        setField(term133623, term133623.getClass(), "user", null);
        setIntField(term133623, term133623.getClass(), "cardId", 0);
        setIntField(term133623, term133623.getClass(), "digitalStock", 0);
        setIntField(term133623, term133623.getClass(), "analogStock", 0);
        setIntField(term133623, term133623.getClass(), "level", 0);
        setIntField(term133623, term133623.getClass(), "maxLevel", 0);
        setIntField(term133623, term133623.getClass(), "exp", 0);
        setIntField(term133623, term133623.getClass(), "printCount", 0);
        setIntField(term133623, term133623.getClass(), "useCount", 0);
        setBooleanField(term133623, term133623.getClass(), "isNew", false);
        setField(term133623, term133623.getClass(), "kaikaDate", null);
        setField(term133623, term133623.getClass(), "choKaikaDate", null);
        setIntField(term133623, term133623.getClass(), "skillId", 0);
        setBooleanField(term133623, term133623.getClass(), "isAcquired", false);
        setField(term133623, term133623.getClass(), "created", null);
        term133636 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term133636;
        callMethod(klass, "setAcquired", argTypes, term133623, args);
    }

};


