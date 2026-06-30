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

public class UserStory_setJewelCount_119694939736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167655;
     Object term167663;

    public UserStory_setJewelCount_119694939736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167655 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167655, term167655.getClass(), "id", 0L);
        setField(term167655, term167655.getClass(), "user", null);
        setIntField(term167655, term167655.getClass(), "storyId", 0);
        setIntField(term167655, term167655.getClass(), "lastChapterId", 0);
        setIntField(term167655, term167655.getClass(), "jewelCount", 0);
        setIntField(term167655, term167655.getClass(), "lastPlayMusicId", 0);
        setIntField(term167655, term167655.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167655, term167655.getClass(), "lastPlayMusicLevel", 0);
        term167663 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167663;
        callMethod(klass, "setJewelCount", argTypes, term167655, args);
    }

};


