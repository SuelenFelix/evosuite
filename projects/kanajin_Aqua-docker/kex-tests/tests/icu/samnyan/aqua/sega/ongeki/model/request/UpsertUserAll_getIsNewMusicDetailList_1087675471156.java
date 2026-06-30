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

public class UpsertUserAll_getIsNewMusicDetailList_1087675471156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289711;

    public UpsertUserAll_getIsNewMusicDetailList_1087675471156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289711 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289711, term289711.getClass(), "userData", null);
        setField(term289711, term289711.getClass(), "userOption", null);
        setField(term289711, term289711.getClass(), "userPlaylogList", null);
        setField(term289711, term289711.getClass(), "userJewelboostlogList", null);
        setField(term289711, term289711.getClass(), "userSessionlogList", null);
        setField(term289711, term289711.getClass(), "userActivityList", null);
        setField(term289711, term289711.getClass(), "userRecentRatingList", null);
        setField(term289711, term289711.getClass(), "userBpBaseList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseBestNewList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseBestList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseHotList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseNextNewList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseNextList", null);
        setField(term289711, term289711.getClass(), "userRatingBaseHotNextList", null);
        setField(term289711, term289711.getClass(), "userMusicDetailList", null);
        setField(term289711, term289711.getClass(), "userCharacterList", null);
        setField(term289711, term289711.getClass(), "userCardList", null);
        setField(term289711, term289711.getClass(), "userDeckList", null);
        setField(term289711, term289711.getClass(), "userTrainingRoomList", null);
        setField(term289711, term289711.getClass(), "userStoryList", null);
        setField(term289711, term289711.getClass(), "userChapterList", null);
        setField(term289711, term289711.getClass(), "userMemoryChapterList", null);
        setField(term289711, term289711.getClass(), "userItemList", null);
        setField(term289711, term289711.getClass(), "userMusicItemList", null);
        setField(term289711, term289711.getClass(), "userLoginBonusList", null);
        setField(term289711, term289711.getClass(), "userEventPointList", null);
        setField(term289711, term289711.getClass(), "userMissionPointList", null);
        setField(term289711, term289711.getClass(), "userRatinglogList", null);
        setField(term289711, term289711.getClass(), "userBossList", null);
        setField(term289711, term289711.getClass(), "userTechCountList", null);
        setField(term289711, term289711.getClass(), "userScenarioList", null);
        setField(term289711, term289711.getClass(), "userTradeItemList", null);
        setField(term289711, term289711.getClass(), "userEventMusicList", null);
        setField(term289711, term289711.getClass(), "userTechEventList", null);
        setField(term289711, term289711.getClass(), "userKopList", null);
        setField(term289711, term289711.getClass(), "clientSystemInfo", null);
        setField(term289711, term289711.getClass(), "isNewMusicDetailList", null);
        setField(term289711, term289711.getClass(), "isNewCharacterList", null);
        setField(term289711, term289711.getClass(), "isNewCardList", null);
        setField(term289711, term289711.getClass(), "isNewDeckList", null);
        setField(term289711, term289711.getClass(), "isNewTrainingRoomList", null);
        setField(term289711, term289711.getClass(), "isNewStoryList", null);
        setField(term289711, term289711.getClass(), "isNewChapterList", null);
        setField(term289711, term289711.getClass(), "isNewMemoryChapterList", null);
        setField(term289711, term289711.getClass(), "isNewItemList", null);
        setField(term289711, term289711.getClass(), "isNewMusicItemList", null);
        setField(term289711, term289711.getClass(), "isNewLoginBonusList", null);
        setField(term289711, term289711.getClass(), "isNewEventPointList", null);
        setField(term289711, term289711.getClass(), "isNewMissionPointList", null);
        setField(term289711, term289711.getClass(), "isNewRatinglogList", null);
        setField(term289711, term289711.getClass(), "isNewBossList", null);
        setField(term289711, term289711.getClass(), "isNewTechCountList", null);
        setField(term289711, term289711.getClass(), "isNewScenarioList", null);
        setField(term289711, term289711.getClass(), "isNewTradeItemList", null);
        setField(term289711, term289711.getClass(), "isNewEventMusicList", null);
        setField(term289711, term289711.getClass(), "isNewTechEventList", null);
        setField(term289711, term289711.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNewMusicDetailList", argTypes, term289711, args);
    }

};


