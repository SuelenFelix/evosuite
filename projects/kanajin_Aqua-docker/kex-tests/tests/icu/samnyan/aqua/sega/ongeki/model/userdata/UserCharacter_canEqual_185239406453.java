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

public class UserCharacter_canEqual_185239406453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181170;

    public UserCharacter_canEqual_185239406453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181170 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181170, term181170.getClass(), "id", 0L);
        setField(term181170, term181170.getClass(), "user", null);
        setIntField(term181170, term181170.getClass(), "characterId", 0);
        setIntField(term181170, term181170.getClass(), "costumeId", 0);
        setIntField(term181170, term181170.getClass(), "attachmentId", 0);
        setIntField(term181170, term181170.getClass(), "playCount", 0);
        setIntField(term181170, term181170.getClass(), "intimateLevel", 0);
        setIntField(term181170, term181170.getClass(), "intimateCount", 0);
        setIntField(term181170, term181170.getClass(), "intimateCountRewarded", 0);
        setField(term181170, term181170.getClass(), "intimateCountDate", null);
        setBooleanField(term181170, term181170.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term181170, args);
    }

};


