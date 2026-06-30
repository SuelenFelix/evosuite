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

public class UserStory_hashCode_137133950042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167711;

    public UserStory_hashCode_137133950042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167711 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167711, term167711.getClass(), "id", 0L);
        setField(term167711, term167711.getClass(), "user", null);
        setIntField(term167711, term167711.getClass(), "storyId", 0);
        setIntField(term167711, term167711.getClass(), "lastChapterId", 0);
        setIntField(term167711, term167711.getClass(), "jewelCount", 0);
        setIntField(term167711, term167711.getClass(), "lastPlayMusicId", 0);
        setIntField(term167711, term167711.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167711, term167711.getClass(), "lastPlayMusicLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term167711, args);
    }

};


