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

public class UserCourse_canEqual_162448980965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94281;

    public UserCourse_canEqual_162448980965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94281, term94281.getClass(), "id", 0L);
        setField(term94281, term94281.getClass(), "user", null);
        setIntField(term94281, term94281.getClass(), "courseId", 0);
        setBooleanField(term94281, term94281.getClass(), "isLastClear", false);
        setIntField(term94281, term94281.getClass(), "totalRestlife", 0);
        setIntField(term94281, term94281.getClass(), "totalAchievement", 0);
        setIntField(term94281, term94281.getClass(), "totalDeluxscore", 0);
        setIntField(term94281, term94281.getClass(), "playCount", 0);
        setField(term94281, term94281.getClass(), "clearDate", null);
        setField(term94281, term94281.getClass(), "lastPlayDate", null);
        setIntField(term94281, term94281.getClass(), "bestAchievement", 0);
        setField(term94281, term94281.getClass(), "bestAchievementDate", null);
        setIntField(term94281, term94281.getClass(), "bestDeluxscore", 0);
        setField(term94281, term94281.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term94281, args);
    }

};


