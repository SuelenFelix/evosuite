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

public class UserCard_setCardId_62125764360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133447;
     Object term133460;

    public UserCard_setCardId_62125764360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133447 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133447, term133447.getClass(), "id", 0L);
        setField(term133447, term133447.getClass(), "user", null);
        setIntField(term133447, term133447.getClass(), "cardId", 0);
        setIntField(term133447, term133447.getClass(), "digitalStock", 0);
        setIntField(term133447, term133447.getClass(), "analogStock", 0);
        setIntField(term133447, term133447.getClass(), "level", 0);
        setIntField(term133447, term133447.getClass(), "maxLevel", 0);
        setIntField(term133447, term133447.getClass(), "exp", 0);
        setIntField(term133447, term133447.getClass(), "printCount", 0);
        setIntField(term133447, term133447.getClass(), "useCount", 0);
        setBooleanField(term133447, term133447.getClass(), "isNew", false);
        setField(term133447, term133447.getClass(), "kaikaDate", null);
        setField(term133447, term133447.getClass(), "choKaikaDate", null);
        setIntField(term133447, term133447.getClass(), "skillId", 0);
        setBooleanField(term133447, term133447.getClass(), "isAcquired", false);
        setField(term133447, term133447.getClass(), "created", null);
        term133460 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133460;
        callMethod(klass, "setCardId", argTypes, term133447, args);
    }

};


