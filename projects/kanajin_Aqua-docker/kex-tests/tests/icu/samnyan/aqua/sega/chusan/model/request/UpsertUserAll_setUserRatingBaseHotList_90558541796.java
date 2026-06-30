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

public class UpsertUserAll_setUserRatingBaseHotList_90558541796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118708;

    public UpsertUserAll_setUserRatingBaseHotList_90558541796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118708 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118708, term118708.getClass(), "userData", null);
        setField(term118708, term118708.getClass(), "userGameOption", null);
        setField(term118708, term118708.getClass(), "userCharacterList", null);
        setField(term118708, term118708.getClass(), "userItemList", null);
        setField(term118708, term118708.getClass(), "userMusicDetailList", null);
        setField(term118708, term118708.getClass(), "userActivityList", null);
        setField(term118708, term118708.getClass(), "userRecentRatingList", null);
        setField(term118708, term118708.getClass(), "userPlaylogList", null);
        setField(term118708, term118708.getClass(), "userChargeList", null);
        setField(term118708, term118708.getClass(), "userCourseList", null);
        setField(term118708, term118708.getClass(), "userDuelList", null);
        setField(term118708, term118708.getClass(), "userTeamPoint", null);
        setField(term118708, term118708.getClass(), "userRatingBaseHotList", null);
        setField(term118708, term118708.getClass(), "userRatingBaseList", null);
        setField(term118708, term118708.getClass(), "userRatingBaseNextList", null);
        setField(term118708, term118708.getClass(), "userLoginBonusList", null);
        setField(term118708, term118708.getClass(), "userMapAreaList", null);
        setField(term118708, term118708.getClass(), "userOverPowerList", null);
        setField(term118708, term118708.getClass(), "userNetBattlelogList", null);
        setField(term118708, term118708.getClass(), "userEmoneyList", null);
        setField(term118708, term118708.getClass(), "isNewCharacterList", null);
        setField(term118708, term118708.getClass(), "isNewMusicDetailList", null);
        setField(term118708, term118708.getClass(), "isNewItemList", null);
        setField(term118708, term118708.getClass(), "isNewCourseList", null);
        setField(term118708, term118708.getClass(), "isNewDuelList", null);
        setField(term118708, term118708.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserRatingBaseHotList", argTypes, term118708, args);
    }

};


