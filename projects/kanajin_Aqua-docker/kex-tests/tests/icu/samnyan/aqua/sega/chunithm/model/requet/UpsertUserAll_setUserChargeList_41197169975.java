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

public class UpsertUserAll_setUserChargeList_41197169975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75449;

    public UpsertUserAll_setUserChargeList_41197169975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75449 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75449, term75449.getClass(), "userData", null);
        setField(term75449, term75449.getClass(), "userGameOption", null);
        setField(term75449, term75449.getClass(), "userGameOptionEx", null);
        setField(term75449, term75449.getClass(), "userMapList", null);
        setField(term75449, term75449.getClass(), "userCharacterList", null);
        setField(term75449, term75449.getClass(), "userItemList", null);
        setField(term75449, term75449.getClass(), "userMusicDetailList", null);
        setField(term75449, term75449.getClass(), "userActivityList", null);
        setField(term75449, term75449.getClass(), "userRecentRatingList", null);
        setField(term75449, term75449.getClass(), "userChargeList", null);
        setField(term75449, term75449.getClass(), "userPlaylogList", null);
        setField(term75449, term75449.getClass(), "userCourseList", null);
        setField(term75449, term75449.getClass(), "userDataEx", null);
        setField(term75449, term75449.getClass(), "userDuelList", null);
        setField(term75449, term75449.getClass(), "isNewMapList", null);
        setField(term75449, term75449.getClass(), "isNewCharacterList", null);
        setField(term75449, term75449.getClass(), "isNewMusicDetailList", null);
        setField(term75449, term75449.getClass(), "isNewItemList", null);
        setField(term75449, term75449.getClass(), "isNewCourseList", null);
        setField(term75449, term75449.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChargeList", argTypes, term75449, args);
    }

};


