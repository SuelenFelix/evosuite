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

public class UpsertUserAll_getUserRecentRatingList_46421594664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118676;

    public UpsertUserAll_getUserRecentRatingList_46421594664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118676 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118676, term118676.getClass(), "userData", null);
        setField(term118676, term118676.getClass(), "userGameOption", null);
        setField(term118676, term118676.getClass(), "userCharacterList", null);
        setField(term118676, term118676.getClass(), "userItemList", null);
        setField(term118676, term118676.getClass(), "userMusicDetailList", null);
        setField(term118676, term118676.getClass(), "userActivityList", null);
        setField(term118676, term118676.getClass(), "userRecentRatingList", null);
        setField(term118676, term118676.getClass(), "userPlaylogList", null);
        setField(term118676, term118676.getClass(), "userChargeList", null);
        setField(term118676, term118676.getClass(), "userCourseList", null);
        setField(term118676, term118676.getClass(), "userDuelList", null);
        setField(term118676, term118676.getClass(), "userTeamPoint", null);
        setField(term118676, term118676.getClass(), "userRatingBaseHotList", null);
        setField(term118676, term118676.getClass(), "userRatingBaseList", null);
        setField(term118676, term118676.getClass(), "userRatingBaseNextList", null);
        setField(term118676, term118676.getClass(), "userLoginBonusList", null);
        setField(term118676, term118676.getClass(), "userMapAreaList", null);
        setField(term118676, term118676.getClass(), "userOverPowerList", null);
        setField(term118676, term118676.getClass(), "userNetBattlelogList", null);
        setField(term118676, term118676.getClass(), "userEmoneyList", null);
        setField(term118676, term118676.getClass(), "isNewCharacterList", null);
        setField(term118676, term118676.getClass(), "isNewMusicDetailList", null);
        setField(term118676, term118676.getClass(), "isNewItemList", null);
        setField(term118676, term118676.getClass(), "isNewCourseList", null);
        setField(term118676, term118676.getClass(), "isNewDuelList", null);
        setField(term118676, term118676.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRecentRatingList", argTypes, term118676, args);
    }

};


