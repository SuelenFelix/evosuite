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

public class UserCharacter_setAttachmentId_29979278145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181078;
     Object term181088;

    public UserCharacter_setAttachmentId_29979278145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181078 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181078, term181078.getClass(), "id", 0L);
        setField(term181078, term181078.getClass(), "user", null);
        setIntField(term181078, term181078.getClass(), "characterId", 0);
        setIntField(term181078, term181078.getClass(), "costumeId", 0);
        setIntField(term181078, term181078.getClass(), "attachmentId", 0);
        setIntField(term181078, term181078.getClass(), "playCount", 0);
        setIntField(term181078, term181078.getClass(), "intimateLevel", 0);
        setIntField(term181078, term181078.getClass(), "intimateCount", 0);
        setIntField(term181078, term181078.getClass(), "intimateCountRewarded", 0);
        setField(term181078, term181078.getClass(), "intimateCountDate", null);
        setBooleanField(term181078, term181078.getClass(), "isNew", false);
        term181088 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181088;
        callMethod(klass, "setAttachmentId", argTypes, term181078, args);
    }

};


