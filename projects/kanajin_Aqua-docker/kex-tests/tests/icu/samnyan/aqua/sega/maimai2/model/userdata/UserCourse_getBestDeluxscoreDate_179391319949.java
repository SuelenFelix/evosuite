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

public class UserCourse_getBestDeluxscoreDate_179391319949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94103;

    public UserCourse_getBestDeluxscoreDate_179391319949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94103, term94103.getClass(), "id", 0L);
        setField(term94103, term94103.getClass(), "user", null);
        setIntField(term94103, term94103.getClass(), "courseId", 0);
        setBooleanField(term94103, term94103.getClass(), "isLastClear", false);
        setIntField(term94103, term94103.getClass(), "totalRestlife", 0);
        setIntField(term94103, term94103.getClass(), "totalAchievement", 0);
        setIntField(term94103, term94103.getClass(), "totalDeluxscore", 0);
        setIntField(term94103, term94103.getClass(), "playCount", 0);
        setField(term94103, term94103.getClass(), "clearDate", null);
        setField(term94103, term94103.getClass(), "lastPlayDate", null);
        setIntField(term94103, term94103.getClass(), "bestAchievement", 0);
        setField(term94103, term94103.getClass(), "bestAchievementDate", null);
        setIntField(term94103, term94103.getClass(), "bestDeluxscore", 0);
        setField(term94103, term94103.getClass(), "bestDeluxscoreDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestDeluxscoreDate", argTypes, term94103, args);
    }

};


