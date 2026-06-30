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

public class UserCharacter_getFriendshipExp_31734883536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120793;

    public UserCharacter_getFriendshipExp_31734883536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120793 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120793, term120793.getClass(), "id", 0L);
        setField(term120793, term120793.getClass(), "user", null);
        setIntField(term120793, term120793.getClass(), "characterId", 0);
        setIntField(term120793, term120793.getClass(), "playCount", 0);
        setIntField(term120793, term120793.getClass(), "level", 0);
        setIntField(term120793, term120793.getClass(), "skillId", 0);
        setIntField(term120793, term120793.getClass(), "friendshipExp", 0);
        setBooleanField(term120793, term120793.getClass(), "isValid", false);
        setBooleanField(term120793, term120793.getClass(), "isNewMark", false);
        setIntField(term120793, term120793.getClass(), "param1", 0);
        setIntField(term120793, term120793.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendshipExp", argTypes, term120793, args);
    }

};


