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

public class UpsertUserAll_setUserChapterList_1116515244197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289752;

    public UpsertUserAll_setUserChapterList_1116515244197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289752 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289752, term289752.getClass(), "userData", null);
        setField(term289752, term289752.getClass(), "userOption", null);
        setField(term289752, term289752.getClass(), "userPlaylogList", null);
        setField(term289752, term289752.getClass(), "userJewelboostlogList", null);
        setField(term289752, term289752.getClass(), "userSessionlogList", null);
        setField(term289752, term289752.getClass(), "userActivityList", null);
        setField(term289752, term289752.getClass(), "userRecentRatingList", null);
        setField(term289752, term289752.getClass(), "userBpBaseList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseBestNewList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseBestList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseHotList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseNextNewList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseNextList", null);
        setField(term289752, term289752.getClass(), "userRatingBaseHotNextList", null);
        setField(term289752, term289752.getClass(), "userMusicDetailList", null);
        setField(term289752, term289752.getClass(), "userCharacterList", null);
        setField(term289752, term289752.getClass(), "userCardList", null);
        setField(term289752, term289752.getClass(), "userDeckList", null);
        setField(term289752, term289752.getClass(), "userTrainingRoomList", null);
        setField(term289752, term289752.getClass(), "userStoryList", null);
        setField(term289752, term289752.getClass(), "userChapterList", null);
        setField(term289752, term289752.getClass(), "userMemoryChapterList", null);
        setField(term289752, term289752.getClass(), "userItemList", null);
        setField(term289752, term289752.getClass(), "userMusicItemList", null);
        setField(term289752, term289752.getClass(), "userLoginBonusList", null);
        setField(term289752, term289752.getClass(), "userEventPointList", null);
        setField(term289752, term289752.getClass(), "userMissionPointList", null);
        setField(term289752, term289752.getClass(), "userRatinglogList", null);
        setField(term289752, term289752.getClass(), "userBossList", null);
        setField(term289752, term289752.getClass(), "userTechCountList", null);
        setField(term289752, term289752.getClass(), "userScenarioList", null);
        setField(term289752, term289752.getClass(), "userTradeItemList", null);
        setField(term289752, term289752.getClass(), "userEventMusicList", null);
        setField(term289752, term289752.getClass(), "userTechEventList", null);
        setField(term289752, term289752.getClass(), "userKopList", null);
        setField(term289752, term289752.getClass(), "clientSystemInfo", null);
        setField(term289752, term289752.getClass(), "isNewMusicDetailList", null);
        setField(term289752, term289752.getClass(), "isNewCharacterList", null);
        setField(term289752, term289752.getClass(), "isNewCardList", null);
        setField(term289752, term289752.getClass(), "isNewDeckList", null);
        setField(term289752, term289752.getClass(), "isNewTrainingRoomList", null);
        setField(term289752, term289752.getClass(), "isNewStoryList", null);
        setField(term289752, term289752.getClass(), "isNewChapterList", null);
        setField(term289752, term289752.getClass(), "isNewMemoryChapterList", null);
        setField(term289752, term289752.getClass(), "isNewItemList", null);
        setField(term289752, term289752.getClass(), "isNewMusicItemList", null);
        setField(term289752, term289752.getClass(), "isNewLoginBonusList", null);
        setField(term289752, term289752.getClass(), "isNewEventPointList", null);
        setField(term289752, term289752.getClass(), "isNewMissionPointList", null);
        setField(term289752, term289752.getClass(), "isNewRatinglogList", null);
        setField(term289752, term289752.getClass(), "isNewBossList", null);
        setField(term289752, term289752.getClass(), "isNewTechCountList", null);
        setField(term289752, term289752.getClass(), "isNewScenarioList", null);
        setField(term289752, term289752.getClass(), "isNewTradeItemList", null);
        setField(term289752, term289752.getClass(), "isNewEventMusicList", null);
        setField(term289752, term289752.getClass(), "isNewTechEventList", null);
        setField(term289752, term289752.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChapterList", argTypes, term289752, args);
    }

};


