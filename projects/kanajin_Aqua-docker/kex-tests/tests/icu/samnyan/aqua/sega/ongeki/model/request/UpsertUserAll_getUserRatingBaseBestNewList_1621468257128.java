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

public class UpsertUserAll_getUserRatingBaseBestNewList_1621468257128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289683;

    public UpsertUserAll_getUserRatingBaseBestNewList_1621468257128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289683, term289683.getClass(), "userData", null);
        setField(term289683, term289683.getClass(), "userOption", null);
        setField(term289683, term289683.getClass(), "userPlaylogList", null);
        setField(term289683, term289683.getClass(), "userJewelboostlogList", null);
        setField(term289683, term289683.getClass(), "userSessionlogList", null);
        setField(term289683, term289683.getClass(), "userActivityList", null);
        setField(term289683, term289683.getClass(), "userRecentRatingList", null);
        setField(term289683, term289683.getClass(), "userBpBaseList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseBestNewList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseBestList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseHotList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseNextNewList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseNextList", null);
        setField(term289683, term289683.getClass(), "userRatingBaseHotNextList", null);
        setField(term289683, term289683.getClass(), "userMusicDetailList", null);
        setField(term289683, term289683.getClass(), "userCharacterList", null);
        setField(term289683, term289683.getClass(), "userCardList", null);
        setField(term289683, term289683.getClass(), "userDeckList", null);
        setField(term289683, term289683.getClass(), "userTrainingRoomList", null);
        setField(term289683, term289683.getClass(), "userStoryList", null);
        setField(term289683, term289683.getClass(), "userChapterList", null);
        setField(term289683, term289683.getClass(), "userMemoryChapterList", null);
        setField(term289683, term289683.getClass(), "userItemList", null);
        setField(term289683, term289683.getClass(), "userMusicItemList", null);
        setField(term289683, term289683.getClass(), "userLoginBonusList", null);
        setField(term289683, term289683.getClass(), "userEventPointList", null);
        setField(term289683, term289683.getClass(), "userMissionPointList", null);
        setField(term289683, term289683.getClass(), "userRatinglogList", null);
        setField(term289683, term289683.getClass(), "userBossList", null);
        setField(term289683, term289683.getClass(), "userTechCountList", null);
        setField(term289683, term289683.getClass(), "userScenarioList", null);
        setField(term289683, term289683.getClass(), "userTradeItemList", null);
        setField(term289683, term289683.getClass(), "userEventMusicList", null);
        setField(term289683, term289683.getClass(), "userTechEventList", null);
        setField(term289683, term289683.getClass(), "userKopList", null);
        setField(term289683, term289683.getClass(), "clientSystemInfo", null);
        setField(term289683, term289683.getClass(), "isNewMusicDetailList", null);
        setField(term289683, term289683.getClass(), "isNewCharacterList", null);
        setField(term289683, term289683.getClass(), "isNewCardList", null);
        setField(term289683, term289683.getClass(), "isNewDeckList", null);
        setField(term289683, term289683.getClass(), "isNewTrainingRoomList", null);
        setField(term289683, term289683.getClass(), "isNewStoryList", null);
        setField(term289683, term289683.getClass(), "isNewChapterList", null);
        setField(term289683, term289683.getClass(), "isNewMemoryChapterList", null);
        setField(term289683, term289683.getClass(), "isNewItemList", null);
        setField(term289683, term289683.getClass(), "isNewMusicItemList", null);
        setField(term289683, term289683.getClass(), "isNewLoginBonusList", null);
        setField(term289683, term289683.getClass(), "isNewEventPointList", null);
        setField(term289683, term289683.getClass(), "isNewMissionPointList", null);
        setField(term289683, term289683.getClass(), "isNewRatinglogList", null);
        setField(term289683, term289683.getClass(), "isNewBossList", null);
        setField(term289683, term289683.getClass(), "isNewTechCountList", null);
        setField(term289683, term289683.getClass(), "isNewScenarioList", null);
        setField(term289683, term289683.getClass(), "isNewTradeItemList", null);
        setField(term289683, term289683.getClass(), "isNewEventMusicList", null);
        setField(term289683, term289683.getClass(), "isNewTechEventList", null);
        setField(term289683, term289683.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRatingBaseBestNewList", argTypes, term289683, args);
    }

};


