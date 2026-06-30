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

public class UserCharacter_setParam2_61152955551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120976;
     Object term120987;

    public UserCharacter_setParam2_61152955551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120976 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120976, term120976.getClass(), "id", 0L);
        setField(term120976, term120976.getClass(), "user", null);
        setIntField(term120976, term120976.getClass(), "characterId", 0);
        setIntField(term120976, term120976.getClass(), "playCount", 0);
        setIntField(term120976, term120976.getClass(), "level", 0);
        setIntField(term120976, term120976.getClass(), "skillId", 0);
        setIntField(term120976, term120976.getClass(), "friendshipExp", 0);
        setBooleanField(term120976, term120976.getClass(), "isValid", false);
        setBooleanField(term120976, term120976.getClass(), "isNewMark", false);
        setIntField(term120976, term120976.getClass(), "param1", 0);
        setIntField(term120976, term120976.getClass(), "param2", 0);
        term120987 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120987;
        callMethod(klass, "setParam2", argTypes, term120976, args);
    }

};


