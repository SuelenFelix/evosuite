package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserCharacter_setLevel_39989986029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195504;
     Object term195510;

    public UserCharacter_setLevel_39989986029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195504 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        setLongField(term195504, term195504.getClass(), "id", 0L);
        setField(term195504, term195504.getClass(), "user", null);
        setIntField(term195504, term195504.getClass(), "characterId", 0);
        setIntField(term195504, term195504.getClass(), "level", 0);
        setIntField(term195504, term195504.getClass(), "awakening", 0);
        setIntField(term195504, term195504.getClass(), "useCount", 0);
        term195510 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term195510;
        callMethod(klass, "setLevel", argTypes, term195504, args);
    }

};


