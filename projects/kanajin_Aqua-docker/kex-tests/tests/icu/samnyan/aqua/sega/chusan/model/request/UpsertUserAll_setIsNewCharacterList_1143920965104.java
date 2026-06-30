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

public class UpsertUserAll_setIsNewCharacterList_1143920965104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118716;

    public UpsertUserAll_setIsNewCharacterList_1143920965104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118716 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118716, term118716.getClass(), "userData", null);
        setField(term118716, term118716.getClass(), "userGameOption", null);
        setField(term118716, term118716.getClass(), "userCharacterList", null);
        setField(term118716, term118716.getClass(), "userItemList", null);
        setField(term118716, term118716.getClass(), "userMusicDetailList", null);
        setField(term118716, term118716.getClass(), "userActivityList", null);
        setField(term118716, term118716.getClass(), "userRecentRatingList", null);
        setField(term118716, term118716.getClass(), "userPlaylogList", null);
        setField(term118716, term118716.getClass(), "userChargeList", null);
        setField(term118716, term118716.getClass(), "userCourseList", null);
        setField(term118716, term118716.getClass(), "userDuelList", null);
        setField(term118716, term118716.getClass(), "userTeamPoint", null);
        setField(term118716, term118716.getClass(), "userRatingBaseHotList", null);
        setField(term118716, term118716.getClass(), "userRatingBaseList", null);
        setField(term118716, term118716.getClass(), "userRatingBaseNextList", null);
        setField(term118716, term118716.getClass(), "userLoginBonusList", null);
        setField(term118716, term118716.getClass(), "userMapAreaList", null);
        setField(term118716, term118716.getClass(), "userOverPowerList", null);
        setField(term118716, term118716.getClass(), "userNetBattlelogList", null);
        setField(term118716, term118716.getClass(), "userEmoneyList", null);
        setField(term118716, term118716.getClass(), "isNewCharacterList", null);
        setField(term118716, term118716.getClass(), "isNewMusicDetailList", null);
        setField(term118716, term118716.getClass(), "isNewItemList", null);
        setField(term118716, term118716.getClass(), "isNewCourseList", null);
        setField(term118716, term118716.getClass(), "isNewDuelList", null);
        setField(term118716, term118716.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewCharacterList", argTypes, term118716, args);
    }

};


