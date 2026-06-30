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

public class UserAll_setIsNewMusicDetailList_148039753698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98992;

    public UserAll_setIsNewMusicDetailList_148039753698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98992 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll"));
        setField(term98992, term98992.getClass(), "userData", null);
        setField(term98992, term98992.getClass(), "userExtend", null);
        setField(term98992, term98992.getClass(), "userOption", null);
        setField(term98992, term98992.getClass(), "userCharacterList", null);
        setField(term98992, term98992.getClass(), "userGhost", null);
        setField(term98992, term98992.getClass(), "userMapList", null);
        setField(term98992, term98992.getClass(), "userLoginBonusList", null);
        setField(term98992, term98992.getClass(), "userRatingList", null);
        setField(term98992, term98992.getClass(), "userItemList", null);
        setField(term98992, term98992.getClass(), "userMusicDetailList", null);
        setField(term98992, term98992.getClass(), "userCourseList", null);
        setField(term98992, term98992.getClass(), "userFriendSeasonRankingList", null);
        setField(term98992, term98992.getClass(), "userChargeList", null);
        setField(term98992, term98992.getClass(), "userFavoriteList", null);
        setField(term98992, term98992.getClass(), "userActivityList", null);
        setField(term98992, term98992.getClass(), "userGamePlaylogList", null);
        setField(term98992, term98992.getClass(), "isNewCharacterList", null);
        setField(term98992, term98992.getClass(), "isNewMapList", null);
        setField(term98992, term98992.getClass(), "isNewLoginBonusList", null);
        setField(term98992, term98992.getClass(), "isNewItemList", null);
        setField(term98992, term98992.getClass(), "isNewMusicDetailList", null);
        setField(term98992, term98992.getClass(), "isNewCourseList", null);
        setField(term98992, term98992.getClass(), "isNewFavoriteList", null);
        setField(term98992, term98992.getClass(), "isNewFriendSeasonRankingList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewMusicDetailList", argTypes, term98992, args);
    }

};


