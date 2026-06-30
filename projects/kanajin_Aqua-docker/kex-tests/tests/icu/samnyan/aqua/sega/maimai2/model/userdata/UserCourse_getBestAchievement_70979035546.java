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

public class UserCourse_getBestAchievement_70979035546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94073;

    public UserCourse_getBestAchievement_70979035546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94073, term94073.getClass(), "id", 0L);
        setField(term94073, term94073.getClass(), "user", null);
        setIntField(term94073, term94073.getClass(), "courseId", 0);
        setBooleanField(term94073, term94073.getClass(), "isLastClear", false);
        setIntField(term94073, term94073.getClass(), "totalRestlife", 0);
        setIntField(term94073, term94073.getClass(), "totalAchievement", 0);
        setIntField(term94073, term94073.getClass(), "totalDeluxscore", 0);
        setIntField(term94073, term94073.getClass(), "playCount", 0);
        setField(term94073, term94073.getClass(), "clearDate", null);
        setField(term94073, term94073.getClass(), "lastPlayDate", null);
        setIntField(term94073, term94073.getClass(), "bestAchievement", 0);
        setField(term94073, term94073.getClass(), "bestAchievementDate", null);
        setIntField(term94073, term94073.getClass(), "bestDeluxscore", 0);
        setField(term94073, term94073.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestAchievement", argTypes, term94073, args);
    }

};


