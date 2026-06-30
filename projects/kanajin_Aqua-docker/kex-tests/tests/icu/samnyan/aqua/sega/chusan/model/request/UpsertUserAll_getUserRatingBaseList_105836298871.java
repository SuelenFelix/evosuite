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

public class UpsertUserAll_getUserRatingBaseList_105836298871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118683;

    public UpsertUserAll_getUserRatingBaseList_105836298871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118683 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118683, term118683.getClass(), "userData", null);
        setField(term118683, term118683.getClass(), "userGameOption", null);
        setField(term118683, term118683.getClass(), "userCharacterList", null);
        setField(term118683, term118683.getClass(), "userItemList", null);
        setField(term118683, term118683.getClass(), "userMusicDetailList", null);
        setField(term118683, term118683.getClass(), "userActivityList", null);
        setField(term118683, term118683.getClass(), "userRecentRatingList", null);
        setField(term118683, term118683.getClass(), "userPlaylogList", null);
        setField(term118683, term118683.getClass(), "userChargeList", null);
        setField(term118683, term118683.getClass(), "userCourseList", null);
        setField(term118683, term118683.getClass(), "userDuelList", null);
        setField(term118683, term118683.getClass(), "userTeamPoint", null);
        setField(term118683, term118683.getClass(), "userRatingBaseHotList", null);
        setField(term118683, term118683.getClass(), "userRatingBaseList", null);
        setField(term118683, term118683.getClass(), "userRatingBaseNextList", null);
        setField(term118683, term118683.getClass(), "userLoginBonusList", null);
        setField(term118683, term118683.getClass(), "userMapAreaList", null);
        setField(term118683, term118683.getClass(), "userOverPowerList", null);
        setField(term118683, term118683.getClass(), "userNetBattlelogList", null);
        setField(term118683, term118683.getClass(), "userEmoneyList", null);
        setField(term118683, term118683.getClass(), "isNewCharacterList", null);
        setField(term118683, term118683.getClass(), "isNewMusicDetailList", null);
        setField(term118683, term118683.getClass(), "isNewItemList", null);
        setField(term118683, term118683.getClass(), "isNewCourseList", null);
        setField(term118683, term118683.getClass(), "isNewDuelList", null);
        setField(term118683, term118683.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRatingBaseList", argTypes, term118683, args);
    }

};


