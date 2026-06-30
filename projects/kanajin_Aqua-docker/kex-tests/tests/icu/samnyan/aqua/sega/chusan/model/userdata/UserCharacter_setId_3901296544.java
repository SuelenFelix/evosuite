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
import java.lang.Long;

public class UserCharacter_setId_3901296544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87483;
     Object term87495;

    public UserCharacter_setId_3901296544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87483 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87483, term87483.getClass(), "id", 0L);
        setField(term87483, term87483.getClass(), "user", null);
        setIntField(term87483, term87483.getClass(), "characterId", 0);
        setIntField(term87483, term87483.getClass(), "playCount", 0);
        setIntField(term87483, term87483.getClass(), "level", 0);
        setIntField(term87483, term87483.getClass(), "friendshipExp", 0);
        setBooleanField(term87483, term87483.getClass(), "isValid", false);
        setBooleanField(term87483, term87483.getClass(), "isNewMark", false);
        setIntField(term87483, term87483.getClass(), "exMaxLv", 0);
        setIntField(term87483, term87483.getClass(), "assignIllust", 0);
        setIntField(term87483, term87483.getClass(), "param1", 0);
        setIntField(term87483, term87483.getClass(), "param2", 0);
        term87495 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term87495;
        callMethod(klass, "setId", argTypes, term87483, args);
    }

};


