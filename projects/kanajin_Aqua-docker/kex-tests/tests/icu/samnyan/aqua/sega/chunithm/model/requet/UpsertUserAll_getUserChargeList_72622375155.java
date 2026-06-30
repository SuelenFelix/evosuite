package icu.samnyan.aqua.sega.chunithm.model.requet;

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
import static icu.samnyan.aqua.sega.chunithm.model.requet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpsertUserAll_getUserChargeList_72622375155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75429;

    public UpsertUserAll_getUserChargeList_72622375155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75429 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75429, term75429.getClass(), "userData", null);
        setField(term75429, term75429.getClass(), "userGameOption", null);
        setField(term75429, term75429.getClass(), "userGameOptionEx", null);
        setField(term75429, term75429.getClass(), "userMapList", null);
        setField(term75429, term75429.getClass(), "userCharacterList", null);
        setField(term75429, term75429.getClass(), "userItemList", null);
        setField(term75429, term75429.getClass(), "userMusicDetailList", null);
        setField(term75429, term75429.getClass(), "userActivityList", null);
        setField(term75429, term75429.getClass(), "userRecentRatingList", null);
        setField(term75429, term75429.getClass(), "userChargeList", null);
        setField(term75429, term75429.getClass(), "userPlaylogList", null);
        setField(term75429, term75429.getClass(), "userCourseList", null);
        setField(term75429, term75429.getClass(), "userDataEx", null);
        setField(term75429, term75429.getClass(), "userDuelList", null);
        setField(term75429, term75429.getClass(), "isNewMapList", null);
        setField(term75429, term75429.getClass(), "isNewCharacterList", null);
        setField(term75429, term75429.getClass(), "isNewMusicDetailList", null);
        setField(term75429, term75429.getClass(), "isNewItemList", null);
        setField(term75429, term75429.getClass(), "isNewCourseList", null);
        setField(term75429, term75429.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserChargeList", argTypes, term75429, args);
    }

};


