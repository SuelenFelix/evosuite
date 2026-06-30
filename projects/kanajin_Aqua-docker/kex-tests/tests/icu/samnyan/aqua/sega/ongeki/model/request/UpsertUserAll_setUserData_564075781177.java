package icu.samnyan.aqua.sega.ongeki.model.request;

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
import static icu.samnyan.aqua.sega.ongeki.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpsertUserAll_setUserData_564075781177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289732;

    public UpsertUserAll_setUserData_564075781177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289732 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289732, term289732.getClass(), "userData", null);
        setField(term289732, term289732.getClass(), "userOption", null);
        setField(term289732, term289732.getClass(), "userPlaylogList", null);
        setField(term289732, term289732.getClass(), "userJewelboostlogList", null);
        setField(term289732, term289732.getClass(), "userSessionlogList", null);
        setField(term289732, term289732.getClass(), "userActivityList", null);
        setField(term289732, term289732.getClass(), "userRecentRatingList", null);
        setField(term289732, term289732.getClass(), "userBpBaseList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseBestNewList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseBestList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseHotList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseNextNewList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseNextList", null);
        setField(term289732, term289732.getClass(), "userRatingBaseHotNextList", null);
        setField(term289732, term289732.getClass(), "userMusicDetailList", null);
        setField(term289732, term289732.getClass(), "userCharacterList", null);
        setField(term289732, term289732.getClass(), "userCardList", null);
        setField(term289732, term289732.getClass(), "userDeckList", null);
        setField(term289732, term289732.getClass(), "userTrainingRoomList", null);
        setField(term289732, term289732.getClass(), "userStoryList", null);
        setField(term289732, term289732.getClass(), "userChapterList", null);
        setField(term289732, term289732.getClass(), "userMemoryChapterList", null);
        setField(term289732, term289732.getClass(), "userItemList", null);
        setField(term289732, term289732.getClass(), "userMusicItemList", null);
        setField(term289732, term289732.getClass(), "userLoginBonusList", null);
        setField(term289732, term289732.getClass(), "userEventPointList", null);
        setField(term289732, term289732.getClass(), "userMissionPointList", null);
        setField(term289732, term289732.getClass(), "userRatinglogList", null);
        setField(term289732, term289732.getClass(), "userBossList", null);
        setField(term289732, term289732.getClass(), "userTechCountList", null);
        setField(term289732, term289732.getClass(), "userScenarioList", null);
        setField(term289732, term289732.getClass(), "userTradeItemList", null);
        setField(term289732, term289732.getClass(), "userEventMusicList", null);
        setField(term289732, term289732.getClass(), "userTechEventList", null);
        setField(term289732, term289732.getClass(), "userKopList", null);
        setField(term289732, term289732.getClass(), "clientSystemInfo", null);
        setField(term289732, term289732.getClass(), "isNewMusicDetailList", null);
        setField(term289732, term289732.getClass(), "isNewCharacterList", null);
        setField(term289732, term289732.getClass(), "isNewCardList", null);
        setField(term289732, term289732.getClass(), "isNewDeckList", null);
        setField(term289732, term289732.getClass(), "isNewTrainingRoomList", null);
        setField(term289732, term289732.getClass(), "isNewStoryList", null);
        setField(term289732, term289732.getClass(), "isNewChapterList", null);
        setField(term289732, term289732.getClass(), "isNewMemoryChapterList", null);
        setField(term289732, term289732.getClass(), "isNewItemList", null);
        setField(term289732, term289732.getClass(), "isNewMusicItemList", null);
        setField(term289732, term289732.getClass(), "isNewLoginBonusList", null);
        setField(term289732, term289732.getClass(), "isNewEventPointList", null);
        setField(term289732, term289732.getClass(), "isNewMissionPointList", null);
        setField(term289732, term289732.getClass(), "isNewRatinglogList", null);
        setField(term289732, term289732.getClass(), "isNewBossList", null);
        setField(term289732, term289732.getClass(), "isNewTechCountList", null);
        setField(term289732, term289732.getClass(), "isNewScenarioList", null);
        setField(term289732, term289732.getClass(), "isNewTradeItemList", null);
        setField(term289732, term289732.getClass(), "isNewEventMusicList", null);
        setField(term289732, term289732.getClass(), "isNewTechEventList", null);
        setField(term289732, term289732.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserData", argTypes, term289732, args);
    }

};


