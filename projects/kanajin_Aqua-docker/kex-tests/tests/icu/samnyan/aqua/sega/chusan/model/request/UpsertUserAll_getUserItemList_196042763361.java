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

public class UpsertUserAll_getUserItemList_196042763361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118673;

    public UpsertUserAll_getUserItemList_196042763361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118673 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118673, term118673.getClass(), "userData", null);
        setField(term118673, term118673.getClass(), "userGameOption", null);
        setField(term118673, term118673.getClass(), "userCharacterList", null);
        setField(term118673, term118673.getClass(), "userItemList", null);
        setField(term118673, term118673.getClass(), "userMusicDetailList", null);
        setField(term118673, term118673.getClass(), "userActivityList", null);
        setField(term118673, term118673.getClass(), "userRecentRatingList", null);
        setField(term118673, term118673.getClass(), "userPlaylogList", null);
        setField(term118673, term118673.getClass(), "userChargeList", null);
        setField(term118673, term118673.getClass(), "userCourseList", null);
        setField(term118673, term118673.getClass(), "userDuelList", null);
        setField(term118673, term118673.getClass(), "userTeamPoint", null);
        setField(term118673, term118673.getClass(), "userRatingBaseHotList", null);
        setField(term118673, term118673.getClass(), "userRatingBaseList", null);
        setField(term118673, term118673.getClass(), "userRatingBaseNextList", null);
        setField(term118673, term118673.getClass(), "userLoginBonusList", null);
        setField(term118673, term118673.getClass(), "userMapAreaList", null);
        setField(term118673, term118673.getClass(), "userOverPowerList", null);
        setField(term118673, term118673.getClass(), "userNetBattlelogList", null);
        setField(term118673, term118673.getClass(), "userEmoneyList", null);
        setField(term118673, term118673.getClass(), "isNewCharacterList", null);
        setField(term118673, term118673.getClass(), "isNewMusicDetailList", null);
        setField(term118673, term118673.getClass(), "isNewItemList", null);
        setField(term118673, term118673.getClass(), "isNewCourseList", null);
        setField(term118673, term118673.getClass(), "isNewDuelList", null);
        setField(term118673, term118673.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserItemList", argTypes, term118673, args);
    }

};


