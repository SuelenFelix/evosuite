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

public class UserStory_setStoryId_12691486934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167635;
     Object term167643;

    public UserStory_setStoryId_12691486934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167635 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167635, term167635.getClass(), "id", 0L);
        setField(term167635, term167635.getClass(), "user", null);
        setIntField(term167635, term167635.getClass(), "storyId", 0);
        setIntField(term167635, term167635.getClass(), "lastChapterId", 0);
        setIntField(term167635, term167635.getClass(), "jewelCount", 0);
        setIntField(term167635, term167635.getClass(), "lastPlayMusicId", 0);
        setIntField(term167635, term167635.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167635, term167635.getClass(), "lastPlayMusicLevel", 0);
        term167643 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167643;
        callMethod(klass, "setStoryId", argTypes, term167635, args);
    }

};


