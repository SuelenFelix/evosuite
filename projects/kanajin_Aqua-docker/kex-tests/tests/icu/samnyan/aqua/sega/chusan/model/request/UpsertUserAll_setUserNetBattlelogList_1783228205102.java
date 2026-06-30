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

public class UpsertUserAll_setUserNetBattlelogList_1783228205102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118714;

    public UpsertUserAll_setUserNetBattlelogList_1783228205102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118714 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118714, term118714.getClass(), "userData", null);
        setField(term118714, term118714.getClass(), "userGameOption", null);
        setField(term118714, term118714.getClass(), "userCharacterList", null);
        setField(term118714, term118714.getClass(), "userItemList", null);
        setField(term118714, term118714.getClass(), "userMusicDetailList", null);
        setField(term118714, term118714.getClass(), "userActivityList", null);
        setField(term118714, term118714.getClass(), "userRecentRatingList", null);
        setField(term118714, term118714.getClass(), "userPlaylogList", null);
        setField(term118714, term118714.getClass(), "userChargeList", null);
        setField(term118714, term118714.getClass(), "userCourseList", null);
        setField(term118714, term118714.getClass(), "userDuelList", null);
        setField(term118714, term118714.getClass(), "userTeamPoint", null);
        setField(term118714, term118714.getClass(), "userRatingBaseHotList", null);
        setField(term118714, term118714.getClass(), "userRatingBaseList", null);
        setField(term118714, term118714.getClass(), "userRatingBaseNextList", null);
        setField(term118714, term118714.getClass(), "userLoginBonusList", null);
        setField(term118714, term118714.getClass(), "userMapAreaList", null);
        setField(term118714, term118714.getClass(), "userOverPowerList", null);
        setField(term118714, term118714.getClass(), "userNetBattlelogList", null);
        setField(term118714, term118714.getClass(), "userEmoneyList", null);
        setField(term118714, term118714.getClass(), "isNewCharacterList", null);
        setField(term118714, term118714.getClass(), "isNewMusicDetailList", null);
        setField(term118714, term118714.getClass(), "isNewItemList", null);
        setField(term118714, term118714.getClass(), "isNewCourseList", null);
        setField(term118714, term118714.getClass(), "isNewDuelList", null);
        setField(term118714, term118714.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserNetBattlelogList", argTypes, term118714, args);
    }

};


