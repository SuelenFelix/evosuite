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

public class UserCharacter_getParam2_52657698140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120837;

    public UserCharacter_getParam2_52657698140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120837 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120837, term120837.getClass(), "id", 0L);
        setField(term120837, term120837.getClass(), "user", null);
        setIntField(term120837, term120837.getClass(), "characterId", 0);
        setIntField(term120837, term120837.getClass(), "playCount", 0);
        setIntField(term120837, term120837.getClass(), "level", 0);
        setIntField(term120837, term120837.getClass(), "skillId", 0);
        setIntField(term120837, term120837.getClass(), "friendshipExp", 0);
        setBooleanField(term120837, term120837.getClass(), "isValid", false);
        setBooleanField(term120837, term120837.getClass(), "isNewMark", false);
        setIntField(term120837, term120837.getClass(), "param1", 0);
        setIntField(term120837, term120837.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term120837, args);
    }

};


