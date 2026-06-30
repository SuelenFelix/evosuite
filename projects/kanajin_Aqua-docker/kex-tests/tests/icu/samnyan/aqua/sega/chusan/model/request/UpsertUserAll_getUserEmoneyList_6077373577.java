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

public class UpsertUserAll_getUserEmoneyList_6077373577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118689;

    public UpsertUserAll_getUserEmoneyList_6077373577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118689 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll"));
        setField(term118689, term118689.getClass(), "userData", null);
        setField(term118689, term118689.getClass(), "userGameOption", null);
        setField(term118689, term118689.getClass(), "userCharacterList", null);
        setField(term118689, term118689.getClass(), "userItemList", null);
        setField(term118689, term118689.getClass(), "userMusicDetailList", null);
        setField(term118689, term118689.getClass(), "userActivityList", null);
        setField(term118689, term118689.getClass(), "userRecentRatingList", null);
        setField(term118689, term118689.getClass(), "userPlaylogList", null);
        setField(term118689, term118689.getClass(), "userChargeList", null);
        setField(term118689, term118689.getClass(), "userCourseList", null);
        setField(term118689, term118689.getClass(), "userDuelList", null);
        setField(term118689, term118689.getClass(), "userTeamPoint", null);
        setField(term118689, term118689.getClass(), "userRatingBaseHotList", null);
        setField(term118689, term118689.getClass(), "userRatingBaseList", null);
        setField(term118689, term118689.getClass(), "userRatingBaseNextList", null);
        setField(term118689, term118689.getClass(), "userLoginBonusList", null);
        setField(term118689, term118689.getClass(), "userMapAreaList", null);
        setField(term118689, term118689.getClass(), "userOverPowerList", null);
        setField(term118689, term118689.getClass(), "userNetBattlelogList", null);
        setField(term118689, term118689.getClass(), "userEmoneyList", null);
        setField(term118689, term118689.getClass(), "isNewCharacterList", null);
        setField(term118689, term118689.getClass(), "isNewMusicDetailList", null);
        setField(term118689, term118689.getClass(), "isNewItemList", null);
        setField(term118689, term118689.getClass(), "isNewCourseList", null);
        setField(term118689, term118689.getClass(), "isNewDuelList", null);
        setField(term118689, term118689.getClass(), "isNewMapAreaList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserEmoneyList", argTypes, term118689, args);
    }

};


