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

public class UserAll_setUserMapList_56952056483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98977;

    public UserAll_setUserMapList_56952056483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98977, term98977.getClass(), "userData", null);
        setField(term98977, term98977.getClass(), "userExtend", null);
        setField(term98977, term98977.getClass(), "userOption", null);
        setField(term98977, term98977.getClass(), "userCharacterList", null);
        setField(term98977, term98977.getClass(), "userGhost", null);
        setField(term98977, term98977.getClass(), "userMapList", null);
        setField(term98977, term98977.getClass(), "userLoginBonusList", null);
        setField(term98977, term98977.getClass(), "userRatingList", null);
        setField(term98977, term98977.getClass(), "userItemList", null);
        setField(term98977, term98977.getClass(), "userMusicDetailList", null);
        setField(term98977, term98977.getClass(), "userCourseList", null);
        setField(term98977, term98977.getClass(), "userFriendSeasonRankingList", null);
        setField(term98977, term98977.getClass(), "userChargeList", null);
        setField(term98977, term98977.getClass(), "userFavoriteList", null);
        setField(term98977, term98977.getClass(), "userActivityList", null);
        setField(term98977, term98977.getClass(), "userGamePlaylogList", null);
        setField(term98977, term98977.getClass(), "isNewCharacterList", null);
        setField(term98977, term98977.getClass(), "isNewMapList", null);
        setField(term98977, term98977.getClass(), "isNewLoginBonusList", null);
        setField(term98977, term98977.getClass(), "isNewItemList", null);
        setField(term98977, term98977.getClass(), "isNewMusicDetailList", null);
        setField(term98977, term98977.getClass(), "isNewCourseList", null);
        setField(term98977, term98977.getClass(), "isNewFavoriteList", null);
        setField(term98977, term98977.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMapList", argTypes, term98977, args);
    }

};


