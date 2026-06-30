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

public class UserCard_setAnalogStock_78769993862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133477;
     Object term133490;

    public UserCard_setAnalogStock_78769993862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133477 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133477, term133477.getClass(), "id", 0L);
        setField(term133477, term133477.getClass(), "user", null);
        setIntField(term133477, term133477.getClass(), "cardId", 0);
        setIntField(term133477, term133477.getClass(), "digitalStock", 0);
        setIntField(term133477, term133477.getClass(), "analogStock", 0);
        setIntField(term133477, term133477.getClass(), "level", 0);
        setIntField(term133477, term133477.getClass(), "maxLevel", 0);
        setIntField(term133477, term133477.getClass(), "exp", 0);
        setIntField(term133477, term133477.getClass(), "printCount", 0);
        setIntField(term133477, term133477.getClass(), "useCount", 0);
        setBooleanField(term133477, term133477.getClass(), "isNew", false);
        setField(term133477, term133477.getClass(), "kaikaDate", null);
        setField(term133477, term133477.getClass(), "choKaikaDate", null);
        setIntField(term133477, term133477.getClass(), "skillId", 0);
        setBooleanField(term133477, term133477.getClass(), "isAcquired", false);
        setField(term133477, term133477.getClass(), "created", null);
        term133490 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133490;
        callMethod(klass, "setAnalogStock", argTypes, term133477, args);
    }

};


