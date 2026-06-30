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

public class UpsertUserAll_getIsNewMissionPointList_1599442781168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289723;

    public UpsertUserAll_getIsNewMissionPointList_1599442781168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289723 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289723, term289723.getClass(), "userData", null);
        setField(term289723, term289723.getClass(), "userOption", null);
        setField(term289723, term289723.getClass(), "userPlaylogList", null);
        setField(term289723, term289723.getClass(), "userJewelboostlogList", null);
        setField(term289723, term289723.getClass(), "userSessionlogList", null);
        setField(term289723, term289723.getClass(), "userActivityList", null);
        setField(term289723, term289723.getClass(), "userRecentRatingList", null);
        setField(term289723, term289723.getClass(), "userBpBaseList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseBestNewList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseBestList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseHotList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseNextNewList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseNextList", null);
        setField(term289723, term289723.getClass(), "userRatingBaseHotNextList", null);
        setField(term289723, term289723.getClass(), "userMusicDetailList", null);
        setField(term289723, term289723.getClass(), "userCharacterList", null);
        setField(term289723, term289723.getClass(), "userCardList", null);
        setField(term289723, term289723.getClass(), "userDeckList", null);
        setField(term289723, term289723.getClass(), "userTrainingRoomList", null);
        setField(term289723, term289723.getClass(), "userStoryList", null);
        setField(term289723, term289723.getClass(), "userChapterList", null);
        setField(term289723, term289723.getClass(), "userMemoryChapterList", null);
        setField(term289723, term289723.getClass(), "userItemList", null);
        setField(term289723, term289723.getClass(), "userMusicItemList", null);
        setField(term289723, term289723.getClass(), "userLoginBonusList", null);
        setField(term289723, term289723.getClass(), "userEventPointList", null);
        setField(term289723, term289723.getClass(), "userMissionPointList", null);
        setField(term289723, term289723.getClass(), "userRatinglogList", null);
        setField(term289723, term289723.getClass(), "userBossList", null);
        setField(term289723, term289723.getClass(), "userTechCountList", null);
        setField(term289723, term289723.getClass(), "userScenarioList", null);
        setField(term289723, term289723.getClass(), "userTradeItemList", null);
        setField(term289723, term289723.getClass(), "userEventMusicList", null);
        setField(term289723, term289723.getClass(), "userTechEventList", null);
        setField(term289723, term289723.getClass(), "userKopList", null);
        setField(term289723, term289723.getClass(), "clientSystemInfo", null);
        setField(term289723, term289723.getClass(), "isNewMusicDetailList", null);
        setField(term289723, term289723.getClass(), "isNewCharacterList", null);
        setField(term289723, term289723.getClass(), "isNewCardList", null);
        setField(term289723, term289723.getClass(), "isNewDeckList", null);
        setField(term289723, term289723.getClass(), "isNewTrainingRoomList", null);
        setField(term289723, term289723.getClass(), "isNewStoryList", null);
        setField(term289723, term289723.getClass(), "isNewChapterList", null);
        setField(term289723, term289723.getClass(), "isNewMemoryChapterList", null);
        setField(term289723, term289723.getClass(), "isNewItemList", null);
        setField(term289723, term289723.getClass(), "isNewMusicItemList", null);
        setField(term289723, term289723.getClass(), "isNewLoginBonusList", null);
        setField(term289723, term289723.getClass(), "isNewEventPointList", null);
        setField(term289723, term289723.getClass(), "isNewMissionPointList", null);
        setField(term289723, term289723.getClass(), "isNewRatinglogList", null);
        setField(term289723, term289723.getClass(), "isNewBossList", null);
        setField(term289723, term289723.getClass(), "isNewTechCountList", null);
        setField(term289723, term289723.getClass(), "isNewScenarioList", null);
        setField(term289723, term289723.getClass(), "isNewTradeItemList", null);
        setField(term289723, term289723.getClass(), "isNewEventMusicList", null);
        setField(term289723, term289723.getClass(), "isNewTechEventList", null);
        setField(term289723, term289723.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNewMissionPointList", argTypes, term289723, args);
    }

};


