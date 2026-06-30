package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCourse_getCourseId_193315215038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93993;

    public UserCourse_getCourseId_193315215038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93993 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term93993, term93993.getClass(), "id", 0L);
        setField(term93993, term93993.getClass(), "user", null);
        setIntField(term93993, term93993.getClass(), "courseId", 0);
        setBooleanField(term93993, term93993.getClass(), "isLastClear", false);
        setIntField(term93993, term93993.getClass(), "totalRestlife", 0);
        setIntField(term93993, term93993.getClass(), "totalAchievement", 0);
        setIntField(term93993, term93993.getClass(), "totalDeluxscore", 0);
        setIntField(term93993, term93993.getClass(), "playCount", 0);
        setField(term93993, term93993.getClass(), "clearDate", null);
        setField(term93993, term93993.getClass(), "lastPlayDate", null);
        setIntField(term93993, term93993.getClass(), "bestAchievement", 0);
        setField(term93993, term93993.getClass(), "bestAchievementDate", null);
        setIntField(term93993, term93993.getClass(), "bestDeluxscore", 0);
        setField(term93993, term93993.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseId", argTypes, term93993, args);
    }

};


