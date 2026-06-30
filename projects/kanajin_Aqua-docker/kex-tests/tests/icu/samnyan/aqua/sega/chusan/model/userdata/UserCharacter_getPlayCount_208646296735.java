package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCharacter_getPlayCount_208646296735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87375;

    public UserCharacter_getPlayCount_208646296735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87375 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87375, term87375.getClass(), "id", 0L);
        setField(term87375, term87375.getClass(), "user", null);
        setIntField(term87375, term87375.getClass(), "characterId", 0);
        setIntField(term87375, term87375.getClass(), "playCount", 0);
        setIntField(term87375, term87375.getClass(), "level", 0);
        setIntField(term87375, term87375.getClass(), "friendshipExp", 0);
        setBooleanField(term87375, term87375.getClass(), "isValid", false);
        setBooleanField(term87375, term87375.getClass(), "isNewMark", false);
        setIntField(term87375, term87375.getClass(), "exMaxLv", 0);
        setIntField(term87375, term87375.getClass(), "assignIllust", 0);
        setIntField(term87375, term87375.getClass(), "param1", 0);
        setIntField(term87375, term87375.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term87375, args);
    }

};


