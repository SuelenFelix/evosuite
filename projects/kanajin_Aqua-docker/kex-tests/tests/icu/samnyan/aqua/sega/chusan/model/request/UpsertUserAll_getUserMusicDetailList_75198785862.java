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

public class UpsertUserAll_getUserMusicDetailList_75198785862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118674;

    public UpsertUserAll_getUserMusicDetailList_75198785862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118674 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118674, term118674.getClass(), "userData", null);
        setField(term118674, term118674.getClass(), "userGameOption", null);
        setField(term118674, term118674.getClass(), "userCharacterList", null);
        setField(term118674, term118674.getClass(), "userItemList", null);
        setField(term118674, term118674.getClass(), "userMusicDetailList", null);
        setField(term118674, term118674.getClass(), "userActivityList", null);
        setField(term118674, term118674.getClass(), "userRecentRatingList", null);
        setField(term118674, term118674.getClass(), "userPlaylogList", null);
        setField(term118674, term118674.getClass(), "userChargeList", null);
        setField(term118674, term118674.getClass(), "userCourseList", null);
        setField(term118674, term118674.getClass(), "userDuelList", null);
        setField(term118674, term118674.getClass(), "userTeamPoint", null);
        setField(term118674, term118674.getClass(), "userRatingBaseHotList", null);
        setField(term118674, term118674.getClass(), "userRatingBaseList", null);
        setField(term118674, term118674.getClass(), "userRatingBaseNextList", null);
        setField(term118674, term118674.getClass(), "userLoginBonusList", null);
        setField(term118674, term118674.getClass(), "userMapAreaList", null);
        setField(term118674, term118674.getClass(), "userOverPowerList", null);
        setField(term118674, term118674.getClass(), "userNetBattlelogList", null);
        setField(term118674, term118674.getClass(), "userEmoneyList", null);
        setField(term118674, term118674.getClass(), "isNewCharacterList", null);
        setField(term118674, term118674.getClass(), "isNewMusicDetailList", null);
        setField(term118674, term118674.getClass(), "isNewItemList", null);
        setField(term118674, term118674.getClass(), "isNewCourseList", null);
        setField(term118674, term118674.getClass(), "isNewDuelList", null);
        setField(term118674, term118674.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicDetailList", argTypes, term118674, args);
    }

};


