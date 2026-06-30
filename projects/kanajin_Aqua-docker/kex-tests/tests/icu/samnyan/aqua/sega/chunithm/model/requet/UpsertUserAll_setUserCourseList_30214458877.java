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

public class UpsertUserAll_setUserCourseList_30214458877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75451;

    public UpsertUserAll_setUserCourseList_30214458877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75451 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75451, term75451.getClass(), "userData", null);
        setField(term75451, term75451.getClass(), "userGameOption", null);
        setField(term75451, term75451.getClass(), "userGameOptionEx", null);
        setField(term75451, term75451.getClass(), "userMapList", null);
        setField(term75451, term75451.getClass(), "userCharacterList", null);
        setField(term75451, term75451.getClass(), "userItemList", null);
        setField(term75451, term75451.getClass(), "userMusicDetailList", null);
        setField(term75451, term75451.getClass(), "userActivityList", null);
        setField(term75451, term75451.getClass(), "userRecentRatingList", null);
        setField(term75451, term75451.getClass(), "userChargeList", null);
        setField(term75451, term75451.getClass(), "userPlaylogList", null);
        setField(term75451, term75451.getClass(), "userCourseList", null);
        setField(term75451, term75451.getClass(), "userDataEx", null);
        setField(term75451, term75451.getClass(), "userDuelList", null);
        setField(term75451, term75451.getClass(), "isNewMapList", null);
        setField(term75451, term75451.getClass(), "isNewCharacterList", null);
        setField(term75451, term75451.getClass(), "isNewMusicDetailList", null);
        setField(term75451, term75451.getClass(), "isNewItemList", null);
        setField(term75451, term75451.getClass(), "isNewCourseList", null);
        setField(term75451, term75451.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserCourseList", argTypes, term75451, args);
    }

};


