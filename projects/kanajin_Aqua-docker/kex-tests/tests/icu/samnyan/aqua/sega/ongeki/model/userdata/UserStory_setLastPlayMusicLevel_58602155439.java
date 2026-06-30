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

public class UserStory_setLastPlayMusicLevel_58602155439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167685;
     Object term167693;

    public UserStory_setLastPlayMusicLevel_58602155439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167685 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        setLongField(term167685, term167685.getClass(), "id", 0L);
        setField(term167685, term167685.getClass(), "user", null);
        setIntField(term167685, term167685.getClass(), "storyId", 0);
        setIntField(term167685, term167685.getClass(), "lastChapterId", 0);
        setIntField(term167685, term167685.getClass(), "jewelCount", 0);
        setIntField(term167685, term167685.getClass(), "lastPlayMusicId", 0);
        setIntField(term167685, term167685.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term167685, term167685.getClass(), "lastPlayMusicLevel", 0);
        term167693 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167693;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term167685, args);
    }

};


