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

public class UserCard_setUser_207630621459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133434;

    public UserCard_setUser_207630621459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133434 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133434, term133434.getClass(), "id", 0L);
        setField(term133434, term133434.getClass(), "user", null);
        setIntField(term133434, term133434.getClass(), "cardId", 0);
        setIntField(term133434, term133434.getClass(), "digitalStock", 0);
        setIntField(term133434, term133434.getClass(), "analogStock", 0);
        setIntField(term133434, term133434.getClass(), "level", 0);
        setIntField(term133434, term133434.getClass(), "maxLevel", 0);
        setIntField(term133434, term133434.getClass(), "exp", 0);
        setIntField(term133434, term133434.getClass(), "printCount", 0);
        setIntField(term133434, term133434.getClass(), "useCount", 0);
        setBooleanField(term133434, term133434.getClass(), "isNew", false);
        setField(term133434, term133434.getClass(), "kaikaDate", null);
        setField(term133434, term133434.getClass(), "choKaikaDate", null);
        setIntField(term133434, term133434.getClass(), "skillId", 0);
        setBooleanField(term133434, term133434.getClass(), "isAcquired", false);
        setField(term133434, term133434.getClass(), "created", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term133434, args);
    }

};


