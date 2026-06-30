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

public class UserCharacter_setParam2_121505361555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87635;
     Object term87647;

    public UserCharacter_setParam2_121505361555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87635 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87635, term87635.getClass(), "id", 0L);
        setField(term87635, term87635.getClass(), "user", null);
        setIntField(term87635, term87635.getClass(), "characterId", 0);
        setIntField(term87635, term87635.getClass(), "playCount", 0);
        setIntField(term87635, term87635.getClass(), "level", 0);
        setIntField(term87635, term87635.getClass(), "friendshipExp", 0);
        setBooleanField(term87635, term87635.getClass(), "isValid", false);
        setBooleanField(term87635, term87635.getClass(), "isNewMark", false);
        setIntField(term87635, term87635.getClass(), "exMaxLv", 0);
        setIntField(term87635, term87635.getClass(), "assignIllust", 0);
        setIntField(term87635, term87635.getClass(), "param1", 0);
        setIntField(term87635, term87635.getClass(), "param2", 0);
        term87647 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87647;
        callMethod(klass, "setParam2", argTypes, term87635, args);
    }

};


