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

public class UpsertUserAll_getUserCourseList_137750240767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118679;

    public UpsertUserAll_getUserCourseList_137750240767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118679 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118679, term118679.getClass(), "userData", null);
        setField(term118679, term118679.getClass(), "userGameOption", null);
        setField(term118679, term118679.getClass(), "userCharacterList", null);
        setField(term118679, term118679.getClass(), "userItemList", null);
        setField(term118679, term118679.getClass(), "userMusicDetailList", null);
        setField(term118679, term118679.getClass(), "userActivityList", null);
        setField(term118679, term118679.getClass(), "userRecentRatingList", null);
        setField(term118679, term118679.getClass(), "userPlaylogList", null);
        setField(term118679, term118679.getClass(), "userChargeList", null);
        setField(term118679, term118679.getClass(), "userCourseList", null);
        setField(term118679, term118679.getClass(), "userDuelList", null);
        setField(term118679, term118679.getClass(), "userTeamPoint", null);
        setField(term118679, term118679.getClass(), "userRatingBaseHotList", null);
        setField(term118679, term118679.getClass(), "userRatingBaseList", null);
        setField(term118679, term118679.getClass(), "userRatingBaseNextList", null);
        setField(term118679, term118679.getClass(), "userLoginBonusList", null);
        setField(term118679, term118679.getClass(), "userMapAreaList", null);
        setField(term118679, term118679.getClass(), "userOverPowerList", null);
        setField(term118679, term118679.getClass(), "userNetBattlelogList", null);
        setField(term118679, term118679.getClass(), "userEmoneyList", null);
        setField(term118679, term118679.getClass(), "isNewCharacterList", null);
        setField(term118679, term118679.getClass(), "isNewMusicDetailList", null);
        setField(term118679, term118679.getClass(), "isNewItemList", null);
        setField(term118679, term118679.getClass(), "isNewCourseList", null);
        setField(term118679, term118679.getClass(), "isNewDuelList", null);
        setField(term118679, term118679.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCourseList", argTypes, term118679, args);
    }

};


