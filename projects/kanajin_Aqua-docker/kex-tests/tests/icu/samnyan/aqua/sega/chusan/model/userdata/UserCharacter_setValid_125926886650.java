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
import java.lang.Boolean;

public class UserCharacter_setValid_125926886650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87565;
     Object term87577;

    public UserCharacter_setValid_125926886650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87565 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87565, term87565.getClass(), "id", 0L);
        setField(term87565, term87565.getClass(), "user", null);
        setIntField(term87565, term87565.getClass(), "characterId", 0);
        setIntField(term87565, term87565.getClass(), "playCount", 0);
        setIntField(term87565, term87565.getClass(), "level", 0);
        setIntField(term87565, term87565.getClass(), "friendshipExp", 0);
        setBooleanField(term87565, term87565.getClass(), "isValid", false);
        setBooleanField(term87565, term87565.getClass(), "isNewMark", false);
        setIntField(term87565, term87565.getClass(), "exMaxLv", 0);
        setIntField(term87565, term87565.getClass(), "assignIllust", 0);
        setIntField(term87565, term87565.getClass(), "param1", 0);
        setIntField(term87565, term87565.getClass(), "param2", 0);
        term87577 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term87577;
        callMethod(klass, "setValid", argTypes, term87565, args);
    }

};


