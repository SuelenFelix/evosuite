package icu.samnyan.aqua.sega.chusan.model.request;

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
import static icu.samnyan.aqua.sega.chusan.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpsertUserAll_setUserMusicDetailList_35343923288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118700;

    public UpsertUserAll_setUserMusicDetailList_35343923288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118700 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118700, term118700.getClass(), "userData", null);
        setField(term118700, term118700.getClass(), "userGameOption", null);
        setField(term118700, term118700.getClass(), "userCharacterList", null);
        setField(term118700, term118700.getClass(), "userItemList", null);
        setField(term118700, term118700.getClass(), "userMusicDetailList", null);
        setField(term118700, term118700.getClass(), "userActivityList", null);
        setField(term118700, term118700.getClass(), "userRecentRatingList", null);
        setField(term118700, term118700.getClass(), "userPlaylogList", null);
        setField(term118700, term118700.getClass(), "userChargeList", null);
        setField(term118700, term118700.getClass(), "userCourseList", null);
        setField(term118700, term118700.getClass(), "userDuelList", null);
        setField(term118700, term118700.getClass(), "userTeamPoint", null);
        setField(term118700, term118700.getClass(), "userRatingBaseHotList", null);
        setField(term118700, term118700.getClass(), "userRatingBaseList", null);
        setField(term118700, term118700.getClass(), "userRatingBaseNextList", null);
        setField(term118700, term118700.getClass(), "userLoginBonusList", null);
        setField(term118700, term118700.getClass(), "userMapAreaList", null);
        setField(term118700, term118700.getClass(), "userOverPowerList", null);
        setField(term118700, term118700.getClass(), "userNetBattlelogList", null);
        setField(term118700, term118700.getClass(), "userEmoneyList", null);
        setField(term118700, term118700.getClass(), "isNewCharacterList", null);
        setField(term118700, term118700.getClass(), "isNewMusicDetailList", null);
        setField(term118700, term118700.getClass(), "isNewItemList", null);
        setField(term118700, term118700.getClass(), "isNewCourseList", null);
        setField(term118700, term118700.getClass(), "isNewDuelList", null);
        setField(term118700, term118700.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMusicDetailList", argTypes, term118700, args);
    }

};


