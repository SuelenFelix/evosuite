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

public class UserCharacter_isNew_183188254140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181022;

    public UserCharacter_isNew_183188254140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        setLongField(term181022, term181022.getClass(), "id", 0L);
        setField(term181022, term181022.getClass(), "user", null);
        setIntField(term181022, term181022.getClass(), "characterId", 0);
        setIntField(term181022, term181022.getClass(), "costumeId", 0);
        setIntField(term181022, term181022.getClass(), "attachmentId", 0);
        setIntField(term181022, term181022.getClass(), "playCount", 0);
        setIntField(term181022, term181022.getClass(), "intimateLevel", 0);
        setIntField(term181022, term181022.getClass(), "intimateCount", 0);
        setIntField(term181022, term181022.getClass(), "intimateCountRewarded", 0);
        setField(term181022, term181022.getClass(), "intimateCountDate", null);
        setBooleanField(term181022, term181022.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNew", argTypes, term181022, args);
    }

};


