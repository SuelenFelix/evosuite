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

public class UpsertUserAll_getUserGameOption_25487363647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75421;

    public UpsertUserAll_getUserGameOption_25487363647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75421 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75421, term75421.getClass(), "userData", null);
        setField(term75421, term75421.getClass(), "userGameOption", null);
        setField(term75421, term75421.getClass(), "userGameOptionEx", null);
        setField(term75421, term75421.getClass(), "userMapList", null);
        setField(term75421, term75421.getClass(), "userCharacterList", null);
        setField(term75421, term75421.getClass(), "userItemList", null);
        setField(term75421, term75421.getClass(), "userMusicDetailList", null);
        setField(term75421, term75421.getClass(), "userActivityList", null);
        setField(term75421, term75421.getClass(), "userRecentRatingList", null);
        setField(term75421, term75421.getClass(), "userChargeList", null);
        setField(term75421, term75421.getClass(), "userPlaylogList", null);
        setField(term75421, term75421.getClass(), "userCourseList", null);
        setField(term75421, term75421.getClass(), "userDataEx", null);
        setField(term75421, term75421.getClass(), "userDuelList", null);
        setField(term75421, term75421.getClass(), "isNewMapList", null);
        setField(term75421, term75421.getClass(), "isNewCharacterList", null);
        setField(term75421, term75421.getClass(), "isNewMusicDetailList", null);
        setField(term75421, term75421.getClass(), "isNewItemList", null);
        setField(term75421, term75421.getClass(), "isNewCourseList", null);
        setField(term75421, term75421.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOption", argTypes, term75421, args);
    }

};


