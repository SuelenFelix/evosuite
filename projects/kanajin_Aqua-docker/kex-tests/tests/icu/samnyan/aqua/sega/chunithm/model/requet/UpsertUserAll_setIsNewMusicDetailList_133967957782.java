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

public class UpsertUserAll_setIsNewMusicDetailList_133967957782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75456;

    public UpsertUserAll_setIsNewMusicDetailList_133967957782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75456 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75456, term75456.getClass(), "userData", null);
        setField(term75456, term75456.getClass(), "userGameOption", null);
        setField(term75456, term75456.getClass(), "userGameOptionEx", null);
        setField(term75456, term75456.getClass(), "userMapList", null);
        setField(term75456, term75456.getClass(), "userCharacterList", null);
        setField(term75456, term75456.getClass(), "userItemList", null);
        setField(term75456, term75456.getClass(), "userMusicDetailList", null);
        setField(term75456, term75456.getClass(), "userActivityList", null);
        setField(term75456, term75456.getClass(), "userRecentRatingList", null);
        setField(term75456, term75456.getClass(), "userChargeList", null);
        setField(term75456, term75456.getClass(), "userPlaylogList", null);
        setField(term75456, term75456.getClass(), "userCourseList", null);
        setField(term75456, term75456.getClass(), "userDataEx", null);
        setField(term75456, term75456.getClass(), "userDuelList", null);
        setField(term75456, term75456.getClass(), "isNewMapList", null);
        setField(term75456, term75456.getClass(), "isNewCharacterList", null);
        setField(term75456, term75456.getClass(), "isNewMusicDetailList", null);
        setField(term75456, term75456.getClass(), "isNewItemList", null);
        setField(term75456, term75456.getClass(), "isNewCourseList", null);
        setField(term75456, term75456.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewMusicDetailList", argTypes, term75456, args);
    }

};


