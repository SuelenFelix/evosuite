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

public class UserCourse_setClearDate_12902370458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94207;

    public UserCourse_setClearDate_12902370458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94207 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94207, term94207.getClass(), "id", 0L);
        setField(term94207, term94207.getClass(), "user", null);
        setIntField(term94207, term94207.getClass(), "courseId", 0);
        setBooleanField(term94207, term94207.getClass(), "isLastClear", false);
        setIntField(term94207, term94207.getClass(), "totalRestlife", 0);
        setIntField(term94207, term94207.getClass(), "totalAchievement", 0);
        setIntField(term94207, term94207.getClass(), "totalDeluxscore", 0);
        setIntField(term94207, term94207.getClass(), "playCount", 0);
        setField(term94207, term94207.getClass(), "clearDate", null);
        setField(term94207, term94207.getClass(), "lastPlayDate", null);
        setIntField(term94207, term94207.getClass(), "bestAchievement", 0);
        setField(term94207, term94207.getClass(), "bestAchievementDate", null);
        setIntField(term94207, term94207.getClass(), "bestDeluxscore", 0);
        setField(term94207, term94207.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClearDate", argTypes, term94207, args);
    }

};


