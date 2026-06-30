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
import java.lang.Integer;

public class UserCharacter_setIntimateCountRewarded_161079777749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181126;
     Object term181136;

    public UserCharacter_setIntimateCountRewarded_161079777749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181126 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181126, term181126.getClass(), "id", 0L);
        setField(term181126, term181126.getClass(), "user", null);
        setIntField(term181126, term181126.getClass(), "characterId", 0);
        setIntField(term181126, term181126.getClass(), "costumeId", 0);
        setIntField(term181126, term181126.getClass(), "attachmentId", 0);
        setIntField(term181126, term181126.getClass(), "playCount", 0);
        setIntField(term181126, term181126.getClass(), "intimateLevel", 0);
        setIntField(term181126, term181126.getClass(), "intimateCount", 0);
        setIntField(term181126, term181126.getClass(), "intimateCountRewarded", 0);
        setField(term181126, term181126.getClass(), "intimateCountDate", null);
        setBooleanField(term181126, term181126.getClass(), "isNew", false);
        term181136 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181136;
        callMethod(klass, "setIntimateCountRewarded", argTypes, term181126, args);
    }

};


