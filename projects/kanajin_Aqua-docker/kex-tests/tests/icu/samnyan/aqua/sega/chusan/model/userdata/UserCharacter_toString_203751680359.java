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

public class UserCharacter_toString_203751680359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87685;

    public UserCharacter_toString_203751680359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87685 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87685, term87685.getClass(), "id", 0L);
        setField(term87685, term87685.getClass(), "user", null);
        setIntField(term87685, term87685.getClass(), "characterId", 0);
        setIntField(term87685, term87685.getClass(), "playCount", 0);
        setIntField(term87685, term87685.getClass(), "level", 0);
        setIntField(term87685, term87685.getClass(), "friendshipExp", 0);
        setBooleanField(term87685, term87685.getClass(), "isValid", false);
        setBooleanField(term87685, term87685.getClass(), "isNewMark", false);
        setIntField(term87685, term87685.getClass(), "exMaxLv", 0);
        setIntField(term87685, term87685.getClass(), "assignIllust", 0);
        setIntField(term87685, term87685.getClass(), "param1", 0);
        setIntField(term87685, term87685.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term87685, args);
    }

};


