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

public class UpsertUserAll_setUserMusicItemList_36537033200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289755;

    public UpsertUserAll_setUserMusicItemList_36537033200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289755 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289755, term289755.getClass(), "userData", null);
        setField(term289755, term289755.getClass(), "userOption", null);
        setField(term289755, term289755.getClass(), "userPlaylogList", null);
        setField(term289755, term289755.getClass(), "userJewelboostlogList", null);
        setField(term289755, term289755.getClass(), "userSessionlogList", null);
        setField(term289755, term289755.getClass(), "userActivityList", null);
        setField(term289755, term289755.getClass(), "userRecentRatingList", null);
        setField(term289755, term289755.getClass(), "userBpBaseList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseBestNewList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseBestList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseHotList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseNextNewList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseNextList", null);
        setField(term289755, term289755.getClass(), "userRatingBaseHotNextList", null);
        setField(term289755, term289755.getClass(), "userMusicDetailList", null);
        setField(term289755, term289755.getClass(), "userCharacterList", null);
        setField(term289755, term289755.getClass(), "userCardList", null);
        setField(term289755, term289755.getClass(), "userDeckList", null);
        setField(term289755, term289755.getClass(), "userTrainingRoomList", null);
        setField(term289755, term289755.getClass(), "userStoryList", null);
        setField(term289755, term289755.getClass(), "userChapterList", null);
        setField(term289755, term289755.getClass(), "userMemoryChapterList", null);
        setField(term289755, term289755.getClass(), "userItemList", null);
        setField(term289755, term289755.getClass(), "userMusicItemList", null);
        setField(term289755, term289755.getClass(), "userLoginBonusList", null);
        setField(term289755, term289755.getClass(), "userEventPointList", null);
        setField(term289755, term289755.getClass(), "userMissionPointList", null);
        setField(term289755, term289755.getClass(), "userRatinglogList", null);
        setField(term289755, term289755.getClass(), "userBossList", null);
        setField(term289755, term289755.getClass(), "userTechCountList", null);
        setField(term289755, term289755.getClass(), "userScenarioList", null);
        setField(term289755, term289755.getClass(), "userTradeItemList", null);
        setField(term289755, term289755.getClass(), "userEventMusicList", null);
        setField(term289755, term289755.getClass(), "userTechEventList", null);
        setField(term289755, term289755.getClass(), "userKopList", null);
        setField(term289755, term289755.getClass(), "clientSystemInfo", null);
        setField(term289755, term289755.getClass(), "isNewMusicDetailList", null);
        setField(term289755, term289755.getClass(), "isNewCharacterList", null);
        setField(term289755, term289755.getClass(), "isNewCardList", null);
        setField(term289755, term289755.getClass(), "isNewDeckList", null);
        setField(term289755, term289755.getClass(), "isNewTrainingRoomList", null);
        setField(term289755, term289755.getClass(), "isNewStoryList", null);
        setField(term289755, term289755.getClass(), "isNewChapterList", null);
        setField(term289755, term289755.getClass(), "isNewMemoryChapterList", null);
        setField(term289755, term289755.getClass(), "isNewItemList", null);
        setField(term289755, term289755.getClass(), "isNewMusicItemList", null);
        setField(term289755, term289755.getClass(), "isNewLoginBonusList", null);
        setField(term289755, term289755.getClass(), "isNewEventPointList", null);
        setField(term289755, term289755.getClass(), "isNewMissionPointList", null);
        setField(term289755, term289755.getClass(), "isNewRatinglogList", null);
        setField(term289755, term289755.getClass(), "isNewBossList", null);
        setField(term289755, term289755.getClass(), "isNewTechCountList", null);
        setField(term289755, term289755.getClass(), "isNewScenarioList", null);
        setField(term289755, term289755.getClass(), "isNewTradeItemList", null);
        setField(term289755, term289755.getClass(), "isNewEventMusicList", null);
        setField(term289755, term289755.getClass(), "isNewTechEventList", null);
        setField(term289755, term289755.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMusicItemList", argTypes, term289755, args);
    }

};


