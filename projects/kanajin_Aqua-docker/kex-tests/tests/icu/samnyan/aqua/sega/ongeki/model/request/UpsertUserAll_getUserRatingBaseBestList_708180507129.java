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

public class UpsertUserAll_getUserRatingBaseBestList_708180507129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289684;

    public UpsertUserAll_getUserRatingBaseBestList_708180507129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289684 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289684, term289684.getClass(), "userData", null);
        setField(term289684, term289684.getClass(), "userOption", null);
        setField(term289684, term289684.getClass(), "userPlaylogList", null);
        setField(term289684, term289684.getClass(), "userJewelboostlogList", null);
        setField(term289684, term289684.getClass(), "userSessionlogList", null);
        setField(term289684, term289684.getClass(), "userActivityList", null);
        setField(term289684, term289684.getClass(), "userRecentRatingList", null);
        setField(term289684, term289684.getClass(), "userBpBaseList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseBestNewList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseBestList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseHotList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseNextNewList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseNextList", null);
        setField(term289684, term289684.getClass(), "userRatingBaseHotNextList", null);
        setField(term289684, term289684.getClass(), "userMusicDetailList", null);
        setField(term289684, term289684.getClass(), "userCharacterList", null);
        setField(term289684, term289684.getClass(), "userCardList", null);
        setField(term289684, term289684.getClass(), "userDeckList", null);
        setField(term289684, term289684.getClass(), "userTrainingRoomList", null);
        setField(term289684, term289684.getClass(), "userStoryList", null);
        setField(term289684, term289684.getClass(), "userChapterList", null);
        setField(term289684, term289684.getClass(), "userMemoryChapterList", null);
        setField(term289684, term289684.getClass(), "userItemList", null);
        setField(term289684, term289684.getClass(), "userMusicItemList", null);
        setField(term289684, term289684.getClass(), "userLoginBonusList", null);
        setField(term289684, term289684.getClass(), "userEventPointList", null);
        setField(term289684, term289684.getClass(), "userMissionPointList", null);
        setField(term289684, term289684.getClass(), "userRatinglogList", null);
        setField(term289684, term289684.getClass(), "userBossList", null);
        setField(term289684, term289684.getClass(), "userTechCountList", null);
        setField(term289684, term289684.getClass(), "userScenarioList", null);
        setField(term289684, term289684.getClass(), "userTradeItemList", null);
        setField(term289684, term289684.getClass(), "userEventMusicList", null);
        setField(term289684, term289684.getClass(), "userTechEventList", null);
        setField(term289684, term289684.getClass(), "userKopList", null);
        setField(term289684, term289684.getClass(), "clientSystemInfo", null);
        setField(term289684, term289684.getClass(), "isNewMusicDetailList", null);
        setField(term289684, term289684.getClass(), "isNewCharacterList", null);
        setField(term289684, term289684.getClass(), "isNewCardList", null);
        setField(term289684, term289684.getClass(), "isNewDeckList", null);
        setField(term289684, term289684.getClass(), "isNewTrainingRoomList", null);
        setField(term289684, term289684.getClass(), "isNewStoryList", null);
        setField(term289684, term289684.getClass(), "isNewChapterList", null);
        setField(term289684, term289684.getClass(), "isNewMemoryChapterList", null);
        setField(term289684, term289684.getClass(), "isNewItemList", null);
        setField(term289684, term289684.getClass(), "isNewMusicItemList", null);
        setField(term289684, term289684.getClass(), "isNewLoginBonusList", null);
        setField(term289684, term289684.getClass(), "isNewEventPointList", null);
        setField(term289684, term289684.getClass(), "isNewMissionPointList", null);
        setField(term289684, term289684.getClass(), "isNewRatinglogList", null);
        setField(term289684, term289684.getClass(), "isNewBossList", null);
        setField(term289684, term289684.getClass(), "isNewTechCountList", null);
        setField(term289684, term289684.getClass(), "isNewScenarioList", null);
        setField(term289684, term289684.getClass(), "isNewTradeItemList", null);
        setField(term289684, term289684.getClass(), "isNewEventMusicList", null);
        setField(term289684, term289684.getClass(), "isNewTechEventList", null);
        setField(term289684, term289684.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRatingBaseBestList", argTypes, term289684, args);
    }

};


