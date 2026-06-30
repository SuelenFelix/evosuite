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
import java.lang.Integer;

public class UserCard_setUseCount_154651253667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133552;
     Object term133565;

    public UserCard_setUseCount_154651253667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133552 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133552, term133552.getClass(), "id", 0L);
        setField(term133552, term133552.getClass(), "user", null);
        setIntField(term133552, term133552.getClass(), "cardId", 0);
        setIntField(term133552, term133552.getClass(), "digitalStock", 0);
        setIntField(term133552, term133552.getClass(), "analogStock", 0);
        setIntField(term133552, term133552.getClass(), "level", 0);
        setIntField(term133552, term133552.getClass(), "maxLevel", 0);
        setIntField(term133552, term133552.getClass(), "exp", 0);
        setIntField(term133552, term133552.getClass(), "printCount", 0);
        setIntField(term133552, term133552.getClass(), "useCount", 0);
        setBooleanField(term133552, term133552.getClass(), "isNew", false);
        setField(term133552, term133552.getClass(), "kaikaDate", null);
        setField(term133552, term133552.getClass(), "choKaikaDate", null);
        setIntField(term133552, term133552.getClass(), "skillId", 0);
        setBooleanField(term133552, term133552.getClass(), "isAcquired", false);
        setField(term133552, term133552.getClass(), "created", null);
        term133565 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133565;
        callMethod(klass, "setUseCount", argTypes, term133552, args);
    }

};


