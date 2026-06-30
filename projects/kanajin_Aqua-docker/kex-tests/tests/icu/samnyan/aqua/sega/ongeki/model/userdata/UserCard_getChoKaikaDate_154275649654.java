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

public class UserCard_getChoKaikaDate_154275649654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133367;

    public UserCard_getChoKaikaDate_154275649654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133367 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133367, term133367.getClass(), "id", 0L);
        setField(term133367, term133367.getClass(), "user", null);
        setIntField(term133367, term133367.getClass(), "cardId", 0);
        setIntField(term133367, term133367.getClass(), "digitalStock", 0);
        setIntField(term133367, term133367.getClass(), "analogStock", 0);
        setIntField(term133367, term133367.getClass(), "level", 0);
        setIntField(term133367, term133367.getClass(), "maxLevel", 0);
        setIntField(term133367, term133367.getClass(), "exp", 0);
        setIntField(term133367, term133367.getClass(), "printCount", 0);
        setIntField(term133367, term133367.getClass(), "useCount", 0);
        setBooleanField(term133367, term133367.getClass(), "isNew", false);
        setField(term133367, term133367.getClass(), "kaikaDate", null);
        setField(term133367, term133367.getClass(), "choKaikaDate", null);
        setIntField(term133367, term133367.getClass(), "skillId", 0);
        setBooleanField(term133367, term133367.getClass(), "isAcquired", false);
        setField(term133367, term133367.getClass(), "created", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChoKaikaDate", argTypes, term133367, args);
    }

};


