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

public class UpsertUserAll_setUserGameOptionEx_47271704568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75442;

    public UpsertUserAll_setUserGameOptionEx_47271704568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75442 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75442, term75442.getClass(), "userData", null);
        setField(term75442, term75442.getClass(), "userGameOption", null);
        setField(term75442, term75442.getClass(), "userGameOptionEx", null);
        setField(term75442, term75442.getClass(), "userMapList", null);
        setField(term75442, term75442.getClass(), "userCharacterList", null);
        setField(term75442, term75442.getClass(), "userItemList", null);
        setField(term75442, term75442.getClass(), "userMusicDetailList", null);
        setField(term75442, term75442.getClass(), "userActivityList", null);
        setField(term75442, term75442.getClass(), "userRecentRatingList", null);
        setField(term75442, term75442.getClass(), "userChargeList", null);
        setField(term75442, term75442.getClass(), "userPlaylogList", null);
        setField(term75442, term75442.getClass(), "userCourseList", null);
        setField(term75442, term75442.getClass(), "userDataEx", null);
        setField(term75442, term75442.getClass(), "userDuelList", null);
        setField(term75442, term75442.getClass(), "isNewMapList", null);
        setField(term75442, term75442.getClass(), "isNewCharacterList", null);
        setField(term75442, term75442.getClass(), "isNewMusicDetailList", null);
        setField(term75442, term75442.getClass(), "isNewItemList", null);
        setField(term75442, term75442.getClass(), "isNewCourseList", null);
        setField(term75442, term75442.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOptionEx", argTypes, term75442, args);
    }

};


