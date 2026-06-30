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

public class UserStory_setLastChapterId_2140507935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167645;
     Object term167653;

    public UserStory_setLastChapterId_2140507935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167645 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167645, term167645.getClass(), "id", 0L);
        setField(term167645, term167645.getClass(), "user", null);
        setIntField(term167645, term167645.getClass(), "storyId", 0);
        setIntField(term167645, term167645.getClass(), "lastChapterId", 0);
        setIntField(term167645, term167645.getClass(), "jewelCount", 0);
        setIntField(term167645, term167645.getClass(), "lastPlayMusicId", 0);
        setIntField(term167645, term167645.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167645, term167645.getClass(), "lastPlayMusicLevel", 0);
        term167653 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167653;
        callMethod(klass, "setLastChapterId", argTypes, term167645, args);
    }

};


