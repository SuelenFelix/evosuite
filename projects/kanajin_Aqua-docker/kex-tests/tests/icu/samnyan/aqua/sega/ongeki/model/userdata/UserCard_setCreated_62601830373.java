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

public class UserCard_setCreated_62601830373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133638;

    public UserCard_setCreated_62601830373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133638 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133638, term133638.getClass(), "id", 0L);
        setField(term133638, term133638.getClass(), "user", null);
        setIntField(term133638, term133638.getClass(), "cardId", 0);
        setIntField(term133638, term133638.getClass(), "digitalStock", 0);
        setIntField(term133638, term133638.getClass(), "analogStock", 0);
        setIntField(term133638, term133638.getClass(), "level", 0);
        setIntField(term133638, term133638.getClass(), "maxLevel", 0);
        setIntField(term133638, term133638.getClass(), "exp", 0);
        setIntField(term133638, term133638.getClass(), "printCount", 0);
        setIntField(term133638, term133638.getClass(), "useCount", 0);
        setBooleanField(term133638, term133638.getClass(), "isNew", false);
        setField(term133638, term133638.getClass(), "kaikaDate", null);
        setField(term133638, term133638.getClass(), "choKaikaDate", null);
        setIntField(term133638, term133638.getClass(), "skillId", 0);
        setBooleanField(term133638, term133638.getClass(), "isAcquired", false);
        setField(term133638, term133638.getClass(), "created", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreated", argTypes, term133638, args);
    }

};


