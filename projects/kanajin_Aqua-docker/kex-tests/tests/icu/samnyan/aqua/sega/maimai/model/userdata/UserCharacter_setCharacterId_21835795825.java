package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserCharacter_setCharacterId_21835795825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37212;
     Object term37217;

    public UserCharacter_setCharacterId_21835795825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37212 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        setLongField(term37212, term37212.getClass(), "id", 0L);
        setField(term37212, term37212.getClass(), "user", null);
        setIntField(term37212, term37212.getClass(), "characterId", 0);
        setIntField(term37212, term37212.getClass(), "point", 0);
        setIntField(term37212, term37212.getClass(), "level", 0);
        term37217 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37217;
        callMethod(klass, "setCharacterId", argTypes, term37212, args);
    }

};


