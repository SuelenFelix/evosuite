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

public class UpsertUserAll_setUserTeamPoint_55158710395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118707;

    public UpsertUserAll_setUserTeamPoint_55158710395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118707 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118707, term118707.getClass(), "userData", null);
        setField(term118707, term118707.getClass(), "userGameOption", null);
        setField(term118707, term118707.getClass(), "userCharacterList", null);
        setField(term118707, term118707.getClass(), "userItemList", null);
        setField(term118707, term118707.getClass(), "userMusicDetailList", null);
        setField(term118707, term118707.getClass(), "userActivityList", null);
        setField(term118707, term118707.getClass(), "userRecentRatingList", null);
        setField(term118707, term118707.getClass(), "userPlaylogList", null);
        setField(term118707, term118707.getClass(), "userChargeList", null);
        setField(term118707, term118707.getClass(), "userCourseList", null);
        setField(term118707, term118707.getClass(), "userDuelList", null);
        setField(term118707, term118707.getClass(), "userTeamPoint", null);
        setField(term118707, term118707.getClass(), "userRatingBaseHotList", null);
        setField(term118707, term118707.getClass(), "userRatingBaseList", null);
        setField(term118707, term118707.getClass(), "userRatingBaseNextList", null);
        setField(term118707, term118707.getClass(), "userLoginBonusList", null);
        setField(term118707, term118707.getClass(), "userMapAreaList", null);
        setField(term118707, term118707.getClass(), "userOverPowerList", null);
        setField(term118707, term118707.getClass(), "userNetBattlelogList", null);
        setField(term118707, term118707.getClass(), "userEmoneyList", null);
        setField(term118707, term118707.getClass(), "isNewCharacterList", null);
        setField(term118707, term118707.getClass(), "isNewMusicDetailList", null);
        setField(term118707, term118707.getClass(), "isNewItemList", null);
        setField(term118707, term118707.getClass(), "isNewCourseList", null);
        setField(term118707, term118707.getClass(), "isNewDuelList", null);
        setField(term118707, term118707.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserTeamPoint", argTypes, term118707, args);
    }

};


