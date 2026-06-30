package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserCharacter_setId_190971876841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181032;
     Object term181042;

    public UserCharacter_setId_190971876841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181032 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181032, term181032.getClass(), "id", 0L);
        setField(term181032, term181032.getClass(), "user", null);
        setIntField(term181032, term181032.getClass(), "characterId", 0);
        setIntField(term181032, term181032.getClass(), "costumeId", 0);
        setIntField(term181032, term181032.getClass(), "attachmentId", 0);
        setIntField(term181032, term181032.getClass(), "playCount", 0);
        setIntField(term181032, term181032.getClass(), "intimateLevel", 0);
        setIntField(term181032, term181032.getClass(), "intimateCount", 0);
        setIntField(term181032, term181032.getClass(), "intimateCountRewarded", 0);
        setField(term181032, term181032.getClass(), "intimateCountDate", null);
        setBooleanField(term181032, term181032.getClass(), "isNew", false);
        term181042 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term181042;
        callMethod(klass, "setId", argTypes, term181032, args);
    }

};


