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

public class UserCharacter_setUser_126422545542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120861;

    public UserCharacter_setUser_126422545542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120861 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120861, term120861.getClass(), "id", 0L);
        setField(term120861, term120861.getClass(), "user", null);
        setIntField(term120861, term120861.getClass(), "characterId", 0);
        setIntField(term120861, term120861.getClass(), "playCount", 0);
        setIntField(term120861, term120861.getClass(), "level", 0);
        setIntField(term120861, term120861.getClass(), "skillId", 0);
        setIntField(term120861, term120861.getClass(), "friendshipExp", 0);
        setBooleanField(term120861, term120861.getClass(), "isValid", false);
        setBooleanField(term120861, term120861.getClass(), "isNewMark", false);
        setIntField(term120861, term120861.getClass(), "param1", 0);
        setIntField(term120861, term120861.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term120861, args);
    }

};


