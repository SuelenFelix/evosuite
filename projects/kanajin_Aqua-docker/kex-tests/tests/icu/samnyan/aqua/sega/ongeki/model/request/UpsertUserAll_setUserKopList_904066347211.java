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

public class UpsertUserAll_setUserKopList_904066347211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289766;

    public UpsertUserAll_setUserKopList_904066347211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289766 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289766, term289766.getClass(), "userData", null);
        setField(term289766, term289766.getClass(), "userOption", null);
        setField(term289766, term289766.getClass(), "userPlaylogList", null);
        setField(term289766, term289766.getClass(), "userJewelboostlogList", null);
        setField(term289766, term289766.getClass(), "userSessionlogList", null);
        setField(term289766, term289766.getClass(), "userActivityList", null);
        setField(term289766, term289766.getClass(), "userRecentRatingList", null);
        setField(term289766, term289766.getClass(), "userBpBaseList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseBestNewList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseBestList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseHotList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseNextNewList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseNextList", null);
        setField(term289766, term289766.getClass(), "userRatingBaseHotNextList", null);
        setField(term289766, term289766.getClass(), "userMusicDetailList", null);
        setField(term289766, term289766.getClass(), "userCharacterList", null);
        setField(term289766, term289766.getClass(), "userCardList", null);
        setField(term289766, term289766.getClass(), "userDeckList", null);
        setField(term289766, term289766.getClass(), "userTrainingRoomList", null);
        setField(term289766, term289766.getClass(), "userStoryList", null);
        setField(term289766, term289766.getClass(), "userChapterList", null);
        setField(term289766, term289766.getClass(), "userMemoryChapterList", null);
        setField(term289766, term289766.getClass(), "userItemList", null);
        setField(term289766, term289766.getClass(), "userMusicItemList", null);
        setField(term289766, term289766.getClass(), "userLoginBonusList", null);
        setField(term289766, term289766.getClass(), "userEventPointList", null);
        setField(term289766, term289766.getClass(), "userMissionPointList", null);
        setField(term289766, term289766.getClass(), "userRatinglogList", null);
        setField(term289766, term289766.getClass(), "userBossList", null);
        setField(term289766, term289766.getClass(), "userTechCountList", null);
        setField(term289766, term289766.getClass(), "userScenarioList", null);
        setField(term289766, term289766.getClass(), "userTradeItemList", null);
        setField(term289766, term289766.getClass(), "userEventMusicList", null);
        setField(term289766, term289766.getClass(), "userTechEventList", null);
        setField(term289766, term289766.getClass(), "userKopList", null);
        setField(term289766, term289766.getClass(), "clientSystemInfo", null);
        setField(term289766, term289766.getClass(), "isNewMusicDetailList", null);
        setField(term289766, term289766.getClass(), "isNewCharacterList", null);
        setField(term289766, term289766.getClass(), "isNewCardList", null);
        setField(term289766, term289766.getClass(), "isNewDeckList", null);
        setField(term289766, term289766.getClass(), "isNewTrainingRoomList", null);
        setField(term289766, term289766.getClass(), "isNewStoryList", null);
        setField(term289766, term289766.getClass(), "isNewChapterList", null);
        setField(term289766, term289766.getClass(), "isNewMemoryChapterList", null);
        setField(term289766, term289766.getClass(), "isNewItemList", null);
        setField(term289766, term289766.getClass(), "isNewMusicItemList", null);
        setField(term289766, term289766.getClass(), "isNewLoginBonusList", null);
        setField(term289766, term289766.getClass(), "isNewEventPointList", null);
        setField(term289766, term289766.getClass(), "isNewMissionPointList", null);
        setField(term289766, term289766.getClass(), "isNewRatinglogList", null);
        setField(term289766, term289766.getClass(), "isNewBossList", null);
        setField(term289766, term289766.getClass(), "isNewTechCountList", null);
        setField(term289766, term289766.getClass(), "isNewScenarioList", null);
        setField(term289766, term289766.getClass(), "isNewTradeItemList", null);
        setField(term289766, term289766.getClass(), "isNewEventMusicList", null);
        setField(term289766, term289766.getClass(), "isNewTechEventList", null);
        setField(term289766, term289766.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserKopList", argTypes, term289766, args);
    }

};


