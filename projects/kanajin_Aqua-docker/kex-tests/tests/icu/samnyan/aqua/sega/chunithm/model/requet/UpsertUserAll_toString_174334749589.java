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

public class UpsertUserAll_toString_174334749589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75463;

    public UpsertUserAll_toString_174334749589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75463 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75463, term75463.getClass(), "userData", null);
        setField(term75463, term75463.getClass(), "userGameOption", null);
        setField(term75463, term75463.getClass(), "userGameOptionEx", null);
        setField(term75463, term75463.getClass(), "userMapList", null);
        setField(term75463, term75463.getClass(), "userCharacterList", null);
        setField(term75463, term75463.getClass(), "userItemList", null);
        setField(term75463, term75463.getClass(), "userMusicDetailList", null);
        setField(term75463, term75463.getClass(), "userActivityList", null);
        setField(term75463, term75463.getClass(), "userRecentRatingList", null);
        setField(term75463, term75463.getClass(), "userChargeList", null);
        setField(term75463, term75463.getClass(), "userPlaylogList", null);
        setField(term75463, term75463.getClass(), "userCourseList", null);
        setField(term75463, term75463.getClass(), "userDataEx", null);
        setField(term75463, term75463.getClass(), "userDuelList", null);
        setField(term75463, term75463.getClass(), "isNewMapList", null);
        setField(term75463, term75463.getClass(), "isNewCharacterList", null);
        setField(term75463, term75463.getClass(), "isNewMusicDetailList", null);
        setField(term75463, term75463.getClass(), "isNewItemList", null);
        setField(term75463, term75463.getClass(), "isNewCourseList", null);
        setField(term75463, term75463.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term75463, args);
    }

};


