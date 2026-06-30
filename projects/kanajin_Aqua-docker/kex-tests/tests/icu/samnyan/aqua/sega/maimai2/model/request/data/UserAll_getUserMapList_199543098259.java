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

public class UserAll_getUserMapList_199543098259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98953;

    public UserAll_getUserMapList_199543098259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98953, term98953.getClass(), "userData", null);
        setField(term98953, term98953.getClass(), "userExtend", null);
        setField(term98953, term98953.getClass(), "userOption", null);
        setField(term98953, term98953.getClass(), "userCharacterList", null);
        setField(term98953, term98953.getClass(), "userGhost", null);
        setField(term98953, term98953.getClass(), "userMapList", null);
        setField(term98953, term98953.getClass(), "userLoginBonusList", null);
        setField(term98953, term98953.getClass(), "userRatingList", null);
        setField(term98953, term98953.getClass(), "userItemList", null);
        setField(term98953, term98953.getClass(), "userMusicDetailList", null);
        setField(term98953, term98953.getClass(), "userCourseList", null);
        setField(term98953, term98953.getClass(), "userFriendSeasonRankingList", null);
        setField(term98953, term98953.getClass(), "userChargeList", null);
        setField(term98953, term98953.getClass(), "userFavoriteList", null);
        setField(term98953, term98953.getClass(), "userActivityList", null);
        setField(term98953, term98953.getClass(), "userGamePlaylogList", null);
        setField(term98953, term98953.getClass(), "isNewCharacterList", null);
        setField(term98953, term98953.getClass(), "isNewMapList", null);
        setField(term98953, term98953.getClass(), "isNewLoginBonusList", null);
        setField(term98953, term98953.getClass(), "isNewItemList", null);
        setField(term98953, term98953.getClass(), "isNewMusicDetailList", null);
        setField(term98953, term98953.getClass(), "isNewCourseList", null);
        setField(term98953, term98953.getClass(), "isNewFavoriteList", null);
        setField(term98953, term98953.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMapList", argTypes, term98953, args);
    }

};


