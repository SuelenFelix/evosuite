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

public class UpsertUserAll_getUserCardList_560703837136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289691;

    public UpsertUserAll_getUserCardList_560703837136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289691 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289691, term289691.getClass(), "userData", null);
        setField(term289691, term289691.getClass(), "userOption", null);
        setField(term289691, term289691.getClass(), "userPlaylogList", null);
        setField(term289691, term289691.getClass(), "userJewelboostlogList", null);
        setField(term289691, term289691.getClass(), "userSessionlogList", null);
        setField(term289691, term289691.getClass(), "userActivityList", null);
        setField(term289691, term289691.getClass(), "userRecentRatingList", null);
        setField(term289691, term289691.getClass(), "userBpBaseList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseBestNewList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseBestList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseHotList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseNextNewList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseNextList", null);
        setField(term289691, term289691.getClass(), "userRatingBaseHotNextList", null);
        setField(term289691, term289691.getClass(), "userMusicDetailList", null);
        setField(term289691, term289691.getClass(), "userCharacterList", null);
        setField(term289691, term289691.getClass(), "userCardList", null);
        setField(term289691, term289691.getClass(), "userDeckList", null);
        setField(term289691, term289691.getClass(), "userTrainingRoomList", null);
        setField(term289691, term289691.getClass(), "userStoryList", null);
        setField(term289691, term289691.getClass(), "userChapterList", null);
        setField(term289691, term289691.getClass(), "userMemoryChapterList", null);
        setField(term289691, term289691.getClass(), "userItemList", null);
        setField(term289691, term289691.getClass(), "userMusicItemList", null);
        setField(term289691, term289691.getClass(), "userLoginBonusList", null);
        setField(term289691, term289691.getClass(), "userEventPointList", null);
        setField(term289691, term289691.getClass(), "userMissionPointList", null);
        setField(term289691, term289691.getClass(), "userRatinglogList", null);
        setField(term289691, term289691.getClass(), "userBossList", null);
        setField(term289691, term289691.getClass(), "userTechCountList", null);
        setField(term289691, term289691.getClass(), "userScenarioList", null);
        setField(term289691, term289691.getClass(), "userTradeItemList", null);
        setField(term289691, term289691.getClass(), "userEventMusicList", null);
        setField(term289691, term289691.getClass(), "userTechEventList", null);
        setField(term289691, term289691.getClass(), "userKopList", null);
        setField(term289691, term289691.getClass(), "clientSystemInfo", null);
        setField(term289691, term289691.getClass(), "isNewMusicDetailList", null);
        setField(term289691, term289691.getClass(), "isNewCharacterList", null);
        setField(term289691, term289691.getClass(), "isNewCardList", null);
        setField(term289691, term289691.getClass(), "isNewDeckList", null);
        setField(term289691, term289691.getClass(), "isNewTrainingRoomList", null);
        setField(term289691, term289691.getClass(), "isNewStoryList", null);
        setField(term289691, term289691.getClass(), "isNewChapterList", null);
        setField(term289691, term289691.getClass(), "isNewMemoryChapterList", null);
        setField(term289691, term289691.getClass(), "isNewItemList", null);
        setField(term289691, term289691.getClass(), "isNewMusicItemList", null);
        setField(term289691, term289691.getClass(), "isNewLoginBonusList", null);
        setField(term289691, term289691.getClass(), "isNewEventPointList", null);
        setField(term289691, term289691.getClass(), "isNewMissionPointList", null);
        setField(term289691, term289691.getClass(), "isNewRatinglogList", null);
        setField(term289691, term289691.getClass(), "isNewBossList", null);
        setField(term289691, term289691.getClass(), "isNewTechCountList", null);
        setField(term289691, term289691.getClass(), "isNewScenarioList", null);
        setField(term289691, term289691.getClass(), "isNewTradeItemList", null);
        setField(term289691, term289691.getClass(), "isNewEventMusicList", null);
        setField(term289691, term289691.getClass(), "isNewTechEventList", null);
        setField(term289691, term289691.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCardList", argTypes, term289691, args);
    }

};


