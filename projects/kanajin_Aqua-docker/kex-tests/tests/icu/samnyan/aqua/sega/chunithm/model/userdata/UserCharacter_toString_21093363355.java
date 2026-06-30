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

public class UserCharacter_toString_21093363355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121022;

    public UserCharacter_toString_21093363355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121022 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term121022, term121022.getClass(), "id", 0L);
        setField(term121022, term121022.getClass(), "user", null);
        setIntField(term121022, term121022.getClass(), "characterId", 0);
        setIntField(term121022, term121022.getClass(), "playCount", 0);
        setIntField(term121022, term121022.getClass(), "level", 0);
        setIntField(term121022, term121022.getClass(), "skillId", 0);
        setIntField(term121022, term121022.getClass(), "friendshipExp", 0);
        setBooleanField(term121022, term121022.getClass(), "isValid", false);
        setBooleanField(term121022, term121022.getClass(), "isNewMark", false);
        setIntField(term121022, term121022.getClass(), "param1", 0);
        setIntField(term121022, term121022.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term121022, args);
    }

};


