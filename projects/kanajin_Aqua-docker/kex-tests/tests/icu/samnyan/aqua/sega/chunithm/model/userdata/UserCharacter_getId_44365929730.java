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

public class UserCharacter_getId_44365929730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120727;

    public UserCharacter_getId_44365929730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120727 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120727, term120727.getClass(), "id", 0L);
        setField(term120727, term120727.getClass(), "user", null);
        setIntField(term120727, term120727.getClass(), "characterId", 0);
        setIntField(term120727, term120727.getClass(), "playCount", 0);
        setIntField(term120727, term120727.getClass(), "level", 0);
        setIntField(term120727, term120727.getClass(), "skillId", 0);
        setIntField(term120727, term120727.getClass(), "friendshipExp", 0);
        setBooleanField(term120727, term120727.getClass(), "isValid", false);
        setBooleanField(term120727, term120727.getClass(), "isNewMark", false);
        setIntField(term120727, term120727.getClass(), "param1", 0);
        setIntField(term120727, term120727.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term120727, args);
    }

};


