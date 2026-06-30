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

public class UpsertUserAll_getUserDataEx_27399521858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75432;

    public UpsertUserAll_getUserDataEx_27399521858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75432 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75432, term75432.getClass(), "userData", null);
        setField(term75432, term75432.getClass(), "userGameOption", null);
        setField(term75432, term75432.getClass(), "userGameOptionEx", null);
        setField(term75432, term75432.getClass(), "userMapList", null);
        setField(term75432, term75432.getClass(), "userCharacterList", null);
        setField(term75432, term75432.getClass(), "userItemList", null);
        setField(term75432, term75432.getClass(), "userMusicDetailList", null);
        setField(term75432, term75432.getClass(), "userActivityList", null);
        setField(term75432, term75432.getClass(), "userRecentRatingList", null);
        setField(term75432, term75432.getClass(), "userChargeList", null);
        setField(term75432, term75432.getClass(), "userPlaylogList", null);
        setField(term75432, term75432.getClass(), "userCourseList", null);
        setField(term75432, term75432.getClass(), "userDataEx", null);
        setField(term75432, term75432.getClass(), "userDuelList", null);
        setField(term75432, term75432.getClass(), "isNewMapList", null);
        setField(term75432, term75432.getClass(), "isNewCharacterList", null);
        setField(term75432, term75432.getClass(), "isNewMusicDetailList", null);
        setField(term75432, term75432.getClass(), "isNewItemList", null);
        setField(term75432, term75432.getClass(), "isNewCourseList", null);
        setField(term75432, term75432.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserDataEx", argTypes, term75432, args);
    }

};


