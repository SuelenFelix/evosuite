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

public class UpsertUserAll_getUserMusicItemList_1755197751143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289698;

    public UpsertUserAll_getUserMusicItemList_1755197751143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289698 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289698, term289698.getClass(), "userData", null);
        setField(term289698, term289698.getClass(), "userOption", null);
        setField(term289698, term289698.getClass(), "userPlaylogList", null);
        setField(term289698, term289698.getClass(), "userJewelboostlogList", null);
        setField(term289698, term289698.getClass(), "userSessionlogList", null);
        setField(term289698, term289698.getClass(), "userActivityList", null);
        setField(term289698, term289698.getClass(), "userRecentRatingList", null);
        setField(term289698, term289698.getClass(), "userBpBaseList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseBestNewList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseBestList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseHotList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseNextNewList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseNextList", null);
        setField(term289698, term289698.getClass(), "userRatingBaseHotNextList", null);
        setField(term289698, term289698.getClass(), "userMusicDetailList", null);
        setField(term289698, term289698.getClass(), "userCharacterList", null);
        setField(term289698, term289698.getClass(), "userCardList", null);
        setField(term289698, term289698.getClass(), "userDeckList", null);
        setField(term289698, term289698.getClass(), "userTrainingRoomList", null);
        setField(term289698, term289698.getClass(), "userStoryList", null);
        setField(term289698, term289698.getClass(), "userChapterList", null);
        setField(term289698, term289698.getClass(), "userMemoryChapterList", null);
        setField(term289698, term289698.getClass(), "userItemList", null);
        setField(term289698, term289698.getClass(), "userMusicItemList", null);
        setField(term289698, term289698.getClass(), "userLoginBonusList", null);
        setField(term289698, term289698.getClass(), "userEventPointList", null);
        setField(term289698, term289698.getClass(), "userMissionPointList", null);
        setField(term289698, term289698.getClass(), "userRatinglogList", null);
        setField(term289698, term289698.getClass(), "userBossList", null);
        setField(term289698, term289698.getClass(), "userTechCountList", null);
        setField(term289698, term289698.getClass(), "userScenarioList", null);
        setField(term289698, term289698.getClass(), "userTradeItemList", null);
        setField(term289698, term289698.getClass(), "userEventMusicList", null);
        setField(term289698, term289698.getClass(), "userTechEventList", null);
        setField(term289698, term289698.getClass(), "userKopList", null);
        setField(term289698, term289698.getClass(), "clientSystemInfo", null);
        setField(term289698, term289698.getClass(), "isNewMusicDetailList", null);
        setField(term289698, term289698.getClass(), "isNewCharacterList", null);
        setField(term289698, term289698.getClass(), "isNewCardList", null);
        setField(term289698, term289698.getClass(), "isNewDeckList", null);
        setField(term289698, term289698.getClass(), "isNewTrainingRoomList", null);
        setField(term289698, term289698.getClass(), "isNewStoryList", null);
        setField(term289698, term289698.getClass(), "isNewChapterList", null);
        setField(term289698, term289698.getClass(), "isNewMemoryChapterList", null);
        setField(term289698, term289698.getClass(), "isNewItemList", null);
        setField(term289698, term289698.getClass(), "isNewMusicItemList", null);
        setField(term289698, term289698.getClass(), "isNewLoginBonusList", null);
        setField(term289698, term289698.getClass(), "isNewEventPointList", null);
        setField(term289698, term289698.getClass(), "isNewMissionPointList", null);
        setField(term289698, term289698.getClass(), "isNewRatinglogList", null);
        setField(term289698, term289698.getClass(), "isNewBossList", null);
        setField(term289698, term289698.getClass(), "isNewTechCountList", null);
        setField(term289698, term289698.getClass(), "isNewScenarioList", null);
        setField(term289698, term289698.getClass(), "isNewTradeItemList", null);
        setField(term289698, term289698.getClass(), "isNewEventMusicList", null);
        setField(term289698, term289698.getClass(), "isNewTechEventList", null);
        setField(term289698, term289698.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicItemList", argTypes, term289698, args);
    }

};


