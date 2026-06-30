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

public class UpsertUserAll_getIsNewItemList_925945804164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289719;

    public UpsertUserAll_getIsNewItemList_925945804164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289719 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289719, term289719.getClass(), "userData", null);
        setField(term289719, term289719.getClass(), "userOption", null);
        setField(term289719, term289719.getClass(), "userPlaylogList", null);
        setField(term289719, term289719.getClass(), "userJewelboostlogList", null);
        setField(term289719, term289719.getClass(), "userSessionlogList", null);
        setField(term289719, term289719.getClass(), "userActivityList", null);
        setField(term289719, term289719.getClass(), "userRecentRatingList", null);
        setField(term289719, term289719.getClass(), "userBpBaseList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseBestNewList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseBestList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseHotList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseNextNewList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseNextList", null);
        setField(term289719, term289719.getClass(), "userRatingBaseHotNextList", null);
        setField(term289719, term289719.getClass(), "userMusicDetailList", null);
        setField(term289719, term289719.getClass(), "userCharacterList", null);
        setField(term289719, term289719.getClass(), "userCardList", null);
        setField(term289719, term289719.getClass(), "userDeckList", null);
        setField(term289719, term289719.getClass(), "userTrainingRoomList", null);
        setField(term289719, term289719.getClass(), "userStoryList", null);
        setField(term289719, term289719.getClass(), "userChapterList", null);
        setField(term289719, term289719.getClass(), "userMemoryChapterList", null);
        setField(term289719, term289719.getClass(), "userItemList", null);
        setField(term289719, term289719.getClass(), "userMusicItemList", null);
        setField(term289719, term289719.getClass(), "userLoginBonusList", null);
        setField(term289719, term289719.getClass(), "userEventPointList", null);
        setField(term289719, term289719.getClass(), "userMissionPointList", null);
        setField(term289719, term289719.getClass(), "userRatinglogList", null);
        setField(term289719, term289719.getClass(), "userBossList", null);
        setField(term289719, term289719.getClass(), "userTechCountList", null);
        setField(term289719, term289719.getClass(), "userScenarioList", null);
        setField(term289719, term289719.getClass(), "userTradeItemList", null);
        setField(term289719, term289719.getClass(), "userEventMusicList", null);
        setField(term289719, term289719.getClass(), "userTechEventList", null);
        setField(term289719, term289719.getClass(), "userKopList", null);
        setField(term289719, term289719.getClass(), "clientSystemInfo", null);
        setField(term289719, term289719.getClass(), "isNewMusicDetailList", null);
        setField(term289719, term289719.getClass(), "isNewCharacterList", null);
        setField(term289719, term289719.getClass(), "isNewCardList", null);
        setField(term289719, term289719.getClass(), "isNewDeckList", null);
        setField(term289719, term289719.getClass(), "isNewTrainingRoomList", null);
        setField(term289719, term289719.getClass(), "isNewStoryList", null);
        setField(term289719, term289719.getClass(), "isNewChapterList", null);
        setField(term289719, term289719.getClass(), "isNewMemoryChapterList", null);
        setField(term289719, term289719.getClass(), "isNewItemList", null);
        setField(term289719, term289719.getClass(), "isNewMusicItemList", null);
        setField(term289719, term289719.getClass(), "isNewLoginBonusList", null);
        setField(term289719, term289719.getClass(), "isNewEventPointList", null);
        setField(term289719, term289719.getClass(), "isNewMissionPointList", null);
        setField(term289719, term289719.getClass(), "isNewRatinglogList", null);
        setField(term289719, term289719.getClass(), "isNewBossList", null);
        setField(term289719, term289719.getClass(), "isNewTechCountList", null);
        setField(term289719, term289719.getClass(), "isNewScenarioList", null);
        setField(term289719, term289719.getClass(), "isNewTradeItemList", null);
        setField(term289719, term289719.getClass(), "isNewEventMusicList", null);
        setField(term289719, term289719.getClass(), "isNewTechEventList", null);
        setField(term289719, term289719.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNewItemList", argTypes, term289719, args);
    }

};


