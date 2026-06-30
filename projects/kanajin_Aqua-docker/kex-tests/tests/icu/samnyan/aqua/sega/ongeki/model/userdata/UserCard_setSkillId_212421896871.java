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

public class UserCard_setSkillId_212421896871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133608;
     Object term133621;

    public UserCard_setSkillId_212421896871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133608 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        setLongField(term133608, term133608.getClass(), "id", 0L);
        setField(term133608, term133608.getClass(), "user", null);
        setIntField(term133608, term133608.getClass(), "cardId", 0);
        setIntField(term133608, term133608.getClass(), "digitalStock", 0);
        setIntField(term133608, term133608.getClass(), "analogStock", 0);
        setIntField(term133608, term133608.getClass(), "level", 0);
        setIntField(term133608, term133608.getClass(), "maxLevel", 0);
        setIntField(term133608, term133608.getClass(), "exp", 0);
        setIntField(term133608, term133608.getClass(), "printCount", 0);
        setIntField(term133608, term133608.getClass(), "useCount", 0);
        setBooleanField(term133608, term133608.getClass(), "isNew", false);
        setField(term133608, term133608.getClass(), "kaikaDate", null);
        setField(term133608, term133608.getClass(), "choKaikaDate", null);
        setIntField(term133608, term133608.getClass(), "skillId", 0);
        setBooleanField(term133608, term133608.getClass(), "isAcquired", false);
        setField(term133608, term133608.getClass(), "created", null);
        term133621 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133621;
        callMethod(klass, "setSkillId", argTypes, term133608, args);
    }

};


