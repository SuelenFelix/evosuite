package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserCharacter_setCharacterId_7819930443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120872;
     Object term120883;

    public UserCharacter_setCharacterId_7819930443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120872 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120872, term120872.getClass(), "id", 0L);
        setField(term120872, term120872.getClass(), "user", null);
        setIntField(term120872, term120872.getClass(), "characterId", 0);
        setIntField(term120872, term120872.getClass(), "playCount", 0);
        setIntField(term120872, term120872.getClass(), "level", 0);
        setIntField(term120872, term120872.getClass(), "skillId", 0);
        setIntField(term120872, term120872.getClass(), "friendshipExp", 0);
        setBooleanField(term120872, term120872.getClass(), "isValid", false);
        setBooleanField(term120872, term120872.getClass(), "isNewMark", false);
        setIntField(term120872, term120872.getClass(), "param1", 0);
        setIntField(term120872, term120872.getClass(), "param2", 0);
        term120883 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120883;
        callMethod(klass, "setCharacterId", argTypes, term120872, args);
    }

};


