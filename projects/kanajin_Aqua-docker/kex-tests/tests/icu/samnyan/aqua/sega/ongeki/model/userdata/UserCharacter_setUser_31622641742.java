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

public class UserCharacter_setUser_31622641742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181044;

    public UserCharacter_setUser_31622641742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181044 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181044, term181044.getClass(), "id", 0L);
        setField(term181044, term181044.getClass(), "user", null);
        setIntField(term181044, term181044.getClass(), "characterId", 0);
        setIntField(term181044, term181044.getClass(), "costumeId", 0);
        setIntField(term181044, term181044.getClass(), "attachmentId", 0);
        setIntField(term181044, term181044.getClass(), "playCount", 0);
        setIntField(term181044, term181044.getClass(), "intimateLevel", 0);
        setIntField(term181044, term181044.getClass(), "intimateCount", 0);
        setIntField(term181044, term181044.getClass(), "intimateCountRewarded", 0);
        setField(term181044, term181044.getClass(), "intimateCountDate", null);
        setBooleanField(term181044, term181044.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term181044, args);
    }

};


