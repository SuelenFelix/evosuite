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

public class UserAll_getUserOption_122643264356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98950;

    public UserAll_getUserOption_122643264356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98950 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98950, term98950.getClass(), "userData", null);
        setField(term98950, term98950.getClass(), "userExtend", null);
        setField(term98950, term98950.getClass(), "userOption", null);
        setField(term98950, term98950.getClass(), "userCharacterList", null);
        setField(term98950, term98950.getClass(), "userGhost", null);
        setField(term98950, term98950.getClass(), "userMapList", null);
        setField(term98950, term98950.getClass(), "userLoginBonusList", null);
        setField(term98950, term98950.getClass(), "userRatingList", null);
        setField(term98950, term98950.getClass(), "userItemList", null);
        setField(term98950, term98950.getClass(), "userMusicDetailList", null);
        setField(term98950, term98950.getClass(), "userCourseList", null);
        setField(term98950, term98950.getClass(), "userFriendSeasonRankingList", null);
        setField(term98950, term98950.getClass(), "userChargeList", null);
        setField(term98950, term98950.getClass(), "userFavoriteList", null);
        setField(term98950, term98950.getClass(), "userActivityList", null);
        setField(term98950, term98950.getClass(), "userGamePlaylogList", null);
        setField(term98950, term98950.getClass(), "isNewCharacterList", null);
        setField(term98950, term98950.getClass(), "isNewMapList", null);
        setField(term98950, term98950.getClass(), "isNewLoginBonusList", null);
        setField(term98950, term98950.getClass(), "isNewItemList", null);
        setField(term98950, term98950.getClass(), "isNewMusicDetailList", null);
        setField(term98950, term98950.getClass(), "isNewCourseList", null);
        setField(term98950, term98950.getClass(), "isNewFavoriteList", null);
        setField(term98950, term98950.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserOption", argTypes, term98950, args);
    }

};


