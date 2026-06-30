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
import java.lang.Integer;

public class UserCharacter_setLevel_109780797848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87537;
     Object term87549;

    public UserCharacter_setLevel_109780797848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87537 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87537, term87537.getClass(), "id", 0L);
        setField(term87537, term87537.getClass(), "user", null);
        setIntField(term87537, term87537.getClass(), "characterId", 0);
        setIntField(term87537, term87537.getClass(), "playCount", 0);
        setIntField(term87537, term87537.getClass(), "level", 0);
        setIntField(term87537, term87537.getClass(), "friendshipExp", 0);
        setBooleanField(term87537, term87537.getClass(), "isValid", false);
        setBooleanField(term87537, term87537.getClass(), "isNewMark", false);
        setIntField(term87537, term87537.getClass(), "exMaxLv", 0);
        setIntField(term87537, term87537.getClass(), "assignIllust", 0);
        setIntField(term87537, term87537.getClass(), "param1", 0);
        setIntField(term87537, term87537.getClass(), "param2", 0);
        term87549 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87549;
        callMethod(klass, "setLevel", argTypes, term87537, args);
    }

};


