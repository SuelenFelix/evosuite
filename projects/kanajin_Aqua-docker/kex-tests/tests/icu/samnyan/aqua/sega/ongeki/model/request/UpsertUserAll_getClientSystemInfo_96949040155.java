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

public class UpsertUserAll_getClientSystemInfo_96949040155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289710;

    public UpsertUserAll_getClientSystemInfo_96949040155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289710 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289710, term289710.getClass(), "userData", null);
        setField(term289710, term289710.getClass(), "userOption", null);
        setField(term289710, term289710.getClass(), "userPlaylogList", null);
        setField(term289710, term289710.getClass(), "userJewelboostlogList", null);
        setField(term289710, term289710.getClass(), "userSessionlogList", null);
        setField(term289710, term289710.getClass(), "userActivityList", null);
        setField(term289710, term289710.getClass(), "userRecentRatingList", null);
        setField(term289710, term289710.getClass(), "userBpBaseList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseBestNewList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseBestList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseHotList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseNextNewList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseNextList", null);
        setField(term289710, term289710.getClass(), "userRatingBaseHotNextList", null);
        setField(term289710, term289710.getClass(), "userMusicDetailList", null);
        setField(term289710, term289710.getClass(), "userCharacterList", null);
        setField(term289710, term289710.getClass(), "userCardList", null);
        setField(term289710, term289710.getClass(), "userDeckList", null);
        setField(term289710, term289710.getClass(), "userTrainingRoomList", null);
        setField(term289710, term289710.getClass(), "userStoryList", null);
        setField(term289710, term289710.getClass(), "userChapterList", null);
        setField(term289710, term289710.getClass(), "userMemoryChapterList", null);
        setField(term289710, term289710.getClass(), "userItemList", null);
        setField(term289710, term289710.getClass(), "userMusicItemList", null);
        setField(term289710, term289710.getClass(), "userLoginBonusList", null);
        setField(term289710, term289710.getClass(), "userEventPointList", null);
        setField(term289710, term289710.getClass(), "userMissionPointList", null);
        setField(term289710, term289710.getClass(), "userRatinglogList", null);
        setField(term289710, term289710.getClass(), "userBossList", null);
        setField(term289710, term289710.getClass(), "userTechCountList", null);
        setField(term289710, term289710.getClass(), "userScenarioList", null);
        setField(term289710, term289710.getClass(), "userTradeItemList", null);
        setField(term289710, term289710.getClass(), "userEventMusicList", null);
        setField(term289710, term289710.getClass(), "userTechEventList", null);
        setField(term289710, term289710.getClass(), "userKopList", null);
        setField(term289710, term289710.getClass(), "clientSystemInfo", null);
        setField(term289710, term289710.getClass(), "isNewMusicDetailList", null);
        setField(term289710, term289710.getClass(), "isNewCharacterList", null);
        setField(term289710, term289710.getClass(), "isNewCardList", null);
        setField(term289710, term289710.getClass(), "isNewDeckList", null);
        setField(term289710, term289710.getClass(), "isNewTrainingRoomList", null);
        setField(term289710, term289710.getClass(), "isNewStoryList", null);
        setField(term289710, term289710.getClass(), "isNewChapterList", null);
        setField(term289710, term289710.getClass(), "isNewMemoryChapterList", null);
        setField(term289710, term289710.getClass(), "isNewItemList", null);
        setField(term289710, term289710.getClass(), "isNewMusicItemList", null);
        setField(term289710, term289710.getClass(), "isNewLoginBonusList", null);
        setField(term289710, term289710.getClass(), "isNewEventPointList", null);
        setField(term289710, term289710.getClass(), "isNewMissionPointList", null);
        setField(term289710, term289710.getClass(), "isNewRatinglogList", null);
        setField(term289710, term289710.getClass(), "isNewBossList", null);
        setField(term289710, term289710.getClass(), "isNewTechCountList", null);
        setField(term289710, term289710.getClass(), "isNewScenarioList", null);
        setField(term289710, term289710.getClass(), "isNewTradeItemList", null);
        setField(term289710, term289710.getClass(), "isNewEventMusicList", null);
        setField(term289710, term289710.getClass(), "isNewTechEventList", null);
        setField(term289710, term289710.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientSystemInfo", argTypes, term289710, args);
    }

};


