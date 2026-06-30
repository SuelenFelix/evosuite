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

public class UserAll_getIsNewLoginBonusList_150527063272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98966;

    public UserAll_getIsNewLoginBonusList_150527063272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98966 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98966, term98966.getClass(), "userData", null);
        setField(term98966, term98966.getClass(), "userExtend", null);
        setField(term98966, term98966.getClass(), "userOption", null);
        setField(term98966, term98966.getClass(), "userCharacterList", null);
        setField(term98966, term98966.getClass(), "userGhost", null);
        setField(term98966, term98966.getClass(), "userMapList", null);
        setField(term98966, term98966.getClass(), "userLoginBonusList", null);
        setField(term98966, term98966.getClass(), "userRatingList", null);
        setField(term98966, term98966.getClass(), "userItemList", null);
        setField(term98966, term98966.getClass(), "userMusicDetailList", null);
        setField(term98966, term98966.getClass(), "userCourseList", null);
        setField(term98966, term98966.getClass(), "userFriendSeasonRankingList", null);
        setField(term98966, term98966.getClass(), "userChargeList", null);
        setField(term98966, term98966.getClass(), "userFavoriteList", null);
        setField(term98966, term98966.getClass(), "userActivityList", null);
        setField(term98966, term98966.getClass(), "userGamePlaylogList", null);
        setField(term98966, term98966.getClass(), "isNewCharacterList", null);
        setField(term98966, term98966.getClass(), "isNewMapList", null);
        setField(term98966, term98966.getClass(), "isNewLoginBonusList", null);
        setField(term98966, term98966.getClass(), "isNewItemList", null);
        setField(term98966, term98966.getClass(), "isNewMusicDetailList", null);
        setField(term98966, term98966.getClass(), "isNewCourseList", null);
        setField(term98966, term98966.getClass(), "isNewFavoriteList", null);
        setField(term98966, term98966.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNewLoginBonusList", argTypes, term98966, args);
    }

};


