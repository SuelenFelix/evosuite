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

public class UpsertUserAll_getUserGameOption_182654039159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118671;

    public UpsertUserAll_getUserGameOption_182654039159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118671 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118671, term118671.getClass(), "userData", null);
        setField(term118671, term118671.getClass(), "userGameOption", null);
        setField(term118671, term118671.getClass(), "userCharacterList", null);
        setField(term118671, term118671.getClass(), "userItemList", null);
        setField(term118671, term118671.getClass(), "userMusicDetailList", null);
        setField(term118671, term118671.getClass(), "userActivityList", null);
        setField(term118671, term118671.getClass(), "userRecentRatingList", null);
        setField(term118671, term118671.getClass(), "userPlaylogList", null);
        setField(term118671, term118671.getClass(), "userChargeList", null);
        setField(term118671, term118671.getClass(), "userCourseList", null);
        setField(term118671, term118671.getClass(), "userDuelList", null);
        setField(term118671, term118671.getClass(), "userTeamPoint", null);
        setField(term118671, term118671.getClass(), "userRatingBaseHotList", null);
        setField(term118671, term118671.getClass(), "userRatingBaseList", null);
        setField(term118671, term118671.getClass(), "userRatingBaseNextList", null);
        setField(term118671, term118671.getClass(), "userLoginBonusList", null);
        setField(term118671, term118671.getClass(), "userMapAreaList", null);
        setField(term118671, term118671.getClass(), "userOverPowerList", null);
        setField(term118671, term118671.getClass(), "userNetBattlelogList", null);
        setField(term118671, term118671.getClass(), "userEmoneyList", null);
        setField(term118671, term118671.getClass(), "isNewCharacterList", null);
        setField(term118671, term118671.getClass(), "isNewMusicDetailList", null);
        setField(term118671, term118671.getClass(), "isNewItemList", null);
        setField(term118671, term118671.getClass(), "isNewCourseList", null);
        setField(term118671, term118671.getClass(), "isNewDuelList", null);
        setField(term118671, term118671.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOption", argTypes, term118671, args);
    }

};


