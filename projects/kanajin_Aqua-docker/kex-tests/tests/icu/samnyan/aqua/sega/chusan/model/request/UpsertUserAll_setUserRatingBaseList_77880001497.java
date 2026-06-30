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

public class UpsertUserAll_setUserRatingBaseList_77880001497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118709;

    public UpsertUserAll_setUserRatingBaseList_77880001497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118709 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118709, term118709.getClass(), "userData", null);
        setField(term118709, term118709.getClass(), "userGameOption", null);
        setField(term118709, term118709.getClass(), "userCharacterList", null);
        setField(term118709, term118709.getClass(), "userItemList", null);
        setField(term118709, term118709.getClass(), "userMusicDetailList", null);
        setField(term118709, term118709.getClass(), "userActivityList", null);
        setField(term118709, term118709.getClass(), "userRecentRatingList", null);
        setField(term118709, term118709.getClass(), "userPlaylogList", null);
        setField(term118709, term118709.getClass(), "userChargeList", null);
        setField(term118709, term118709.getClass(), "userCourseList", null);
        setField(term118709, term118709.getClass(), "userDuelList", null);
        setField(term118709, term118709.getClass(), "userTeamPoint", null);
        setField(term118709, term118709.getClass(), "userRatingBaseHotList", null);
        setField(term118709, term118709.getClass(), "userRatingBaseList", null);
        setField(term118709, term118709.getClass(), "userRatingBaseNextList", null);
        setField(term118709, term118709.getClass(), "userLoginBonusList", null);
        setField(term118709, term118709.getClass(), "userMapAreaList", null);
        setField(term118709, term118709.getClass(), "userOverPowerList", null);
        setField(term118709, term118709.getClass(), "userNetBattlelogList", null);
        setField(term118709, term118709.getClass(), "userEmoneyList", null);
        setField(term118709, term118709.getClass(), "isNewCharacterList", null);
        setField(term118709, term118709.getClass(), "isNewMusicDetailList", null);
        setField(term118709, term118709.getClass(), "isNewItemList", null);
        setField(term118709, term118709.getClass(), "isNewCourseList", null);
        setField(term118709, term118709.getClass(), "isNewDuelList", null);
        setField(term118709, term118709.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserRatingBaseList", argTypes, term118709, args);
    }

};


