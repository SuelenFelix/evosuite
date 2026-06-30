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

public class UpsertUserAll_getIsNewTrainingRoomList_740621326160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289715;

    public UpsertUserAll_getIsNewTrainingRoomList_740621326160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289715 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289715, term289715.getClass(), "userData", null);
        setField(term289715, term289715.getClass(), "userOption", null);
        setField(term289715, term289715.getClass(), "userPlaylogList", null);
        setField(term289715, term289715.getClass(), "userJewelboostlogList", null);
        setField(term289715, term289715.getClass(), "userSessionlogList", null);
        setField(term289715, term289715.getClass(), "userActivityList", null);
        setField(term289715, term289715.getClass(), "userRecentRatingList", null);
        setField(term289715, term289715.getClass(), "userBpBaseList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseBestNewList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseBestList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseHotList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseNextNewList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseNextList", null);
        setField(term289715, term289715.getClass(), "userRatingBaseHotNextList", null);
        setField(term289715, term289715.getClass(), "userMusicDetailList", null);
        setField(term289715, term289715.getClass(), "userCharacterList", null);
        setField(term289715, term289715.getClass(), "userCardList", null);
        setField(term289715, term289715.getClass(), "userDeckList", null);
        setField(term289715, term289715.getClass(), "userTrainingRoomList", null);
        setField(term289715, term289715.getClass(), "userStoryList", null);
        setField(term289715, term289715.getClass(), "userChapterList", null);
        setField(term289715, term289715.getClass(), "userMemoryChapterList", null);
        setField(term289715, term289715.getClass(), "userItemList", null);
        setField(term289715, term289715.getClass(), "userMusicItemList", null);
        setField(term289715, term289715.getClass(), "userLoginBonusList", null);
        setField(term289715, term289715.getClass(), "userEventPointList", null);
        setField(term289715, term289715.getClass(), "userMissionPointList", null);
        setField(term289715, term289715.getClass(), "userRatinglogList", null);
        setField(term289715, term289715.getClass(), "userBossList", null);
        setField(term289715, term289715.getClass(), "userTechCountList", null);
        setField(term289715, term289715.getClass(), "userScenarioList", null);
        setField(term289715, term289715.getClass(), "userTradeItemList", null);
        setField(term289715, term289715.getClass(), "userEventMusicList", null);
        setField(term289715, term289715.getClass(), "userTechEventList", null);
        setField(term289715, term289715.getClass(), "userKopList", null);
        setField(term289715, term289715.getClass(), "clientSystemInfo", null);
        setField(term289715, term289715.getClass(), "isNewMusicDetailList", null);
        setField(term289715, term289715.getClass(), "isNewCharacterList", null);
        setField(term289715, term289715.getClass(), "isNewCardList", null);
        setField(term289715, term289715.getClass(), "isNewDeckList", null);
        setField(term289715, term289715.getClass(), "isNewTrainingRoomList", null);
        setField(term289715, term289715.getClass(), "isNewStoryList", null);
        setField(term289715, term289715.getClass(), "isNewChapterList", null);
        setField(term289715, term289715.getClass(), "isNewMemoryChapterList", null);
        setField(term289715, term289715.getClass(), "isNewItemList", null);
        setField(term289715, term289715.getClass(), "isNewMusicItemList", null);
        setField(term289715, term289715.getClass(), "isNewLoginBonusList", null);
        setField(term289715, term289715.getClass(), "isNewEventPointList", null);
        setField(term289715, term289715.getClass(), "isNewMissionPointList", null);
        setField(term289715, term289715.getClass(), "isNewRatinglogList", null);
        setField(term289715, term289715.getClass(), "isNewBossList", null);
        setField(term289715, term289715.getClass(), "isNewTechCountList", null);
        setField(term289715, term289715.getClass(), "isNewScenarioList", null);
        setField(term289715, term289715.getClass(), "isNewTradeItemList", null);
        setField(term289715, term289715.getClass(), "isNewEventMusicList", null);
        setField(term289715, term289715.getClass(), "isNewTechEventList", null);
        setField(term289715, term289715.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNewTrainingRoomList", argTypes, term289715, args);
    }

};


