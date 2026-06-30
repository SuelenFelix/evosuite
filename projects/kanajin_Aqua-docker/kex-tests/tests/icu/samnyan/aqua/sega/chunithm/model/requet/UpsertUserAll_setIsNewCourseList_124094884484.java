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

public class UpsertUserAll_setIsNewCourseList_124094884484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75458;

    public UpsertUserAll_setIsNewCourseList_124094884484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75458 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75458, term75458.getClass(), "userData", null);
        setField(term75458, term75458.getClass(), "userGameOption", null);
        setField(term75458, term75458.getClass(), "userGameOptionEx", null);
        setField(term75458, term75458.getClass(), "userMapList", null);
        setField(term75458, term75458.getClass(), "userCharacterList", null);
        setField(term75458, term75458.getClass(), "userItemList", null);
        setField(term75458, term75458.getClass(), "userMusicDetailList", null);
        setField(term75458, term75458.getClass(), "userActivityList", null);
        setField(term75458, term75458.getClass(), "userRecentRatingList", null);
        setField(term75458, term75458.getClass(), "userChargeList", null);
        setField(term75458, term75458.getClass(), "userPlaylogList", null);
        setField(term75458, term75458.getClass(), "userCourseList", null);
        setField(term75458, term75458.getClass(), "userDataEx", null);
        setField(term75458, term75458.getClass(), "userDuelList", null);
        setField(term75458, term75458.getClass(), "isNewMapList", null);
        setField(term75458, term75458.getClass(), "isNewCharacterList", null);
        setField(term75458, term75458.getClass(), "isNewMusicDetailList", null);
        setField(term75458, term75458.getClass(), "isNewItemList", null);
        setField(term75458, term75458.getClass(), "isNewCourseList", null);
        setField(term75458, term75458.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewCourseList", argTypes, term75458, args);
    }

};


