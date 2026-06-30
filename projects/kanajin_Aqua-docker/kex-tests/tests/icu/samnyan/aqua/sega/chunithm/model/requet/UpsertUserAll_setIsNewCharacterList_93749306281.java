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

public class UpsertUserAll_setIsNewCharacterList_93749306281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75455;

    public UpsertUserAll_setIsNewCharacterList_93749306281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75455 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll"));
        setField(term75455, term75455.getClass(), "userData", null);
        setField(term75455, term75455.getClass(), "userGameOption", null);
        setField(term75455, term75455.getClass(), "userGameOptionEx", null);
        setField(term75455, term75455.getClass(), "userMapList", null);
        setField(term75455, term75455.getClass(), "userCharacterList", null);
        setField(term75455, term75455.getClass(), "userItemList", null);
        setField(term75455, term75455.getClass(), "userMusicDetailList", null);
        setField(term75455, term75455.getClass(), "userActivityList", null);
        setField(term75455, term75455.getClass(), "userRecentRatingList", null);
        setField(term75455, term75455.getClass(), "userChargeList", null);
        setField(term75455, term75455.getClass(), "userPlaylogList", null);
        setField(term75455, term75455.getClass(), "userCourseList", null);
        setField(term75455, term75455.getClass(), "userDataEx", null);
        setField(term75455, term75455.getClass(), "userDuelList", null);
        setField(term75455, term75455.getClass(), "isNewMapList", null);
        setField(term75455, term75455.getClass(), "isNewCharacterList", null);
        setField(term75455, term75455.getClass(), "isNewMusicDetailList", null);
        setField(term75455, term75455.getClass(), "isNewItemList", null);
        setField(term75455, term75455.getClass(), "isNewCourseList", null);
        setField(term75455, term75455.getClass(), "isNewDuelList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewCharacterList", argTypes, term75455, args);
    }

};


