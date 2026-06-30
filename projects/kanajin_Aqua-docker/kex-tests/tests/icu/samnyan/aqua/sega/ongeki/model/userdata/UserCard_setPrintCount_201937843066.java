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

public class UserCard_setPrintCount_201937843066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133537;
     Object term133550;

    public UserCard_setPrintCount_201937843066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133537 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133537, term133537.getClass(), "id", 0L);
        setField(term133537, term133537.getClass(), "user", null);
        setIntField(term133537, term133537.getClass(), "cardId", 0);
        setIntField(term133537, term133537.getClass(), "digitalStock", 0);
        setIntField(term133537, term133537.getClass(), "analogStock", 0);
        setIntField(term133537, term133537.getClass(), "level", 0);
        setIntField(term133537, term133537.getClass(), "maxLevel", 0);
        setIntField(term133537, term133537.getClass(), "exp", 0);
        setIntField(term133537, term133537.getClass(), "printCount", 0);
        setIntField(term133537, term133537.getClass(), "useCount", 0);
        setBooleanField(term133537, term133537.getClass(), "isNew", false);
        setField(term133537, term133537.getClass(), "kaikaDate", null);
        setField(term133537, term133537.getClass(), "choKaikaDate", null);
        setIntField(term133537, term133537.getClass(), "skillId", 0);
        setBooleanField(term133537, term133537.getClass(), "isAcquired", false);
        setField(term133537, term133537.getClass(), "created", null);
        term133550 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133550;
        callMethod(klass, "setPrintCount", argTypes, term133537, args);
    }

};


