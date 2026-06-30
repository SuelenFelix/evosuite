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

public class UserStory_equals_182002617540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167695;

    public UserStory_equals_182002617540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167695 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167695, term167695.getClass(), "id", 0L);
        setField(term167695, term167695.getClass(), "user", null);
        setIntField(term167695, term167695.getClass(), "storyId", 0);
        setIntField(term167695, term167695.getClass(), "lastChapterId", 0);
        setIntField(term167695, term167695.getClass(), "jewelCount", 0);
        setIntField(term167695, term167695.getClass(), "lastPlayMusicId", 0);
        setIntField(term167695, term167695.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167695, term167695.getClass(), "lastPlayMusicLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term167695, args);
    }

};


