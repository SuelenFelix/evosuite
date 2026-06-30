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

public class UserCard_setNew_3993858868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133567;
     Object term133580;

    public UserCard_setNew_3993858868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133567 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133567, term133567.getClass(), "id", 0L);
        setField(term133567, term133567.getClass(), "user", null);
        setIntField(term133567, term133567.getClass(), "cardId", 0);
        setIntField(term133567, term133567.getClass(), "digitalStock", 0);
        setIntField(term133567, term133567.getClass(), "analogStock", 0);
        setIntField(term133567, term133567.getClass(), "level", 0);
        setIntField(term133567, term133567.getClass(), "maxLevel", 0);
        setIntField(term133567, term133567.getClass(), "exp", 0);
        setIntField(term133567, term133567.getClass(), "printCount", 0);
        setIntField(term133567, term133567.getClass(), "useCount", 0);
        setBooleanField(term133567, term133567.getClass(), "isNew", false);
        setField(term133567, term133567.getClass(), "kaikaDate", null);
        setField(term133567, term133567.getClass(), "choKaikaDate", null);
        setIntField(term133567, term133567.getClass(), "skillId", 0);
        setBooleanField(term133567, term133567.getClass(), "isAcquired", false);
        setField(term133567, term133567.getClass(), "created", null);
        term133580 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term133580;
        callMethod(klass, "setNew", argTypes, term133567, args);
    }

};


