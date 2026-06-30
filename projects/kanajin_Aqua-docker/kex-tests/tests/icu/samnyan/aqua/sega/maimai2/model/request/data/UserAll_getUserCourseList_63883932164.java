package icu.samnyan.aqua.sega.maimai2.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserAll_getUserCourseList_63883932164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98958;

    public UserAll_getUserCourseList_63883932164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98958 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98958, term98958.getClass(), "userData", null);
        setField(term98958, term98958.getClass(), "userExtend", null);
        setField(term98958, term98958.getClass(), "userOption", null);
        setField(term98958, term98958.getClass(), "userCharacterList", null);
        setField(term98958, term98958.getClass(), "userGhost", null);
        setField(term98958, term98958.getClass(), "userMapList", null);
        setField(term98958, term98958.getClass(), "userLoginBonusList", null);
        setField(term98958, term98958.getClass(), "userRatingList", null);
        setField(term98958, term98958.getClass(), "userItemList", null);
        setField(term98958, term98958.getClass(), "userMusicDetailList", null);
        setField(term98958, term98958.getClass(), "userCourseList", null);
        setField(term98958, term98958.getClass(), "userFriendSeasonRankingList", null);
        setField(term98958, term98958.getClass(), "userChargeList", null);
        setField(term98958, term98958.getClass(), "userFavoriteList", null);
        setField(term98958, term98958.getClass(), "userActivityList", null);
        setField(term98958, term98958.getClass(), "userGamePlaylogList", null);
        setField(term98958, term98958.getClass(), "isNewCharacterList", null);
        setField(term98958, term98958.getClass(), "isNewMapList", null);
        setField(term98958, term98958.getClass(), "isNewLoginBonusList", null);
        setField(term98958, term98958.getClass(), "isNewItemList", null);
        setField(term98958, term98958.getClass(), "isNewMusicDetailList", null);
        setField(term98958, term98958.getClass(), "isNewCourseList", null);
        setField(term98958, term98958.getClass(), "isNewFavoriteList", null);
        setField(term98958, term98958.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCourseList", argTypes, term98958, args);
    }

};


