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

public class UserCard_getMaxLevel_41714096248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133289;

    public UserCard_getMaxLevel_41714096248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133289 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133289, term133289.getClass(), "id", 0L);
        setField(term133289, term133289.getClass(), "user", null);
        setIntField(term133289, term133289.getClass(), "cardId", 0);
        setIntField(term133289, term133289.getClass(), "digitalStock", 0);
        setIntField(term133289, term133289.getClass(), "analogStock", 0);
        setIntField(term133289, term133289.getClass(), "level", 0);
        setIntField(term133289, term133289.getClass(), "maxLevel", 0);
        setIntField(term133289, term133289.getClass(), "exp", 0);
        setIntField(term133289, term133289.getClass(), "printCount", 0);
        setIntField(term133289, term133289.getClass(), "useCount", 0);
        setBooleanField(term133289, term133289.getClass(), "isNew", false);
        setField(term133289, term133289.getClass(), "kaikaDate", null);
        setField(term133289, term133289.getClass(), "choKaikaDate", null);
        setIntField(term133289, term133289.getClass(), "skillId", 0);
        setBooleanField(term133289, term133289.getClass(), "isAcquired", false);
        setField(term133289, term133289.getClass(), "created", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLevel", argTypes, term133289, args);
    }

};


