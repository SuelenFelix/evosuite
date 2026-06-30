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

public class UserCourse_hashCode_37164050566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94291;

    public UserCourse_hashCode_37164050566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94291, term94291.getClass(), "id", 0L);
        setField(term94291, term94291.getClass(), "user", null);
        setIntField(term94291, term94291.getClass(), "courseId", 0);
        setBooleanField(term94291, term94291.getClass(), "isLastClear", false);
        setIntField(term94291, term94291.getClass(), "totalRestlife", 0);
        setIntField(term94291, term94291.getClass(), "totalAchievement", 0);
        setIntField(term94291, term94291.getClass(), "totalDeluxscore", 0);
        setIntField(term94291, term94291.getClass(), "playCount", 0);
        setField(term94291, term94291.getClass(), "clearDate", null);
        setField(term94291, term94291.getClass(), "lastPlayDate", null);
        setIntField(term94291, term94291.getClass(), "bestAchievement", 0);
        setField(term94291, term94291.getClass(), "bestAchievementDate", null);
        setIntField(term94291, term94291.getClass(), "bestDeluxscore", 0);
        setField(term94291, term94291.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term94291, args);
    }

};


