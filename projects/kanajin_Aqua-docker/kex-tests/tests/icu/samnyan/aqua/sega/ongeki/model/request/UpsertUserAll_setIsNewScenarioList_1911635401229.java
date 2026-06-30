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

public class UpsertUserAll_setIsNewScenarioList_1911635401229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289784;

    public UpsertUserAll_setIsNewScenarioList_1911635401229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289784 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289784, term289784.getClass(), "userData", null);
        setField(term289784, term289784.getClass(), "userOption", null);
        setField(term289784, term289784.getClass(), "userPlaylogList", null);
        setField(term289784, term289784.getClass(), "userJewelboostlogList", null);
        setField(term289784, term289784.getClass(), "userSessionlogList", null);
        setField(term289784, term289784.getClass(), "userActivityList", null);
        setField(term289784, term289784.getClass(), "userRecentRatingList", null);
        setField(term289784, term289784.getClass(), "userBpBaseList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseBestNewList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseBestList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseHotList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseNextNewList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseNextList", null);
        setField(term289784, term289784.getClass(), "userRatingBaseHotNextList", null);
        setField(term289784, term289784.getClass(), "userMusicDetailList", null);
        setField(term289784, term289784.getClass(), "userCharacterList", null);
        setField(term289784, term289784.getClass(), "userCardList", null);
        setField(term289784, term289784.getClass(), "userDeckList", null);
        setField(term289784, term289784.getClass(), "userTrainingRoomList", null);
        setField(term289784, term289784.getClass(), "userStoryList", null);
        setField(term289784, term289784.getClass(), "userChapterList", null);
        setField(term289784, term289784.getClass(), "userMemoryChapterList", null);
        setField(term289784, term289784.getClass(), "userItemList", null);
        setField(term289784, term289784.getClass(), "userMusicItemList", null);
        setField(term289784, term289784.getClass(), "userLoginBonusList", null);
        setField(term289784, term289784.getClass(), "userEventPointList", null);
        setField(term289784, term289784.getClass(), "userMissionPointList", null);
        setField(term289784, term289784.getClass(), "userRatinglogList", null);
        setField(term289784, term289784.getClass(), "userBossList", null);
        setField(term289784, term289784.getClass(), "userTechCountList", null);
        setField(term289784, term289784.getClass(), "userScenarioList", null);
        setField(term289784, term289784.getClass(), "userTradeItemList", null);
        setField(term289784, term289784.getClass(), "userEventMusicList", null);
        setField(term289784, term289784.getClass(), "userTechEventList", null);
        setField(term289784, term289784.getClass(), "userKopList", null);
        setField(term289784, term289784.getClass(), "clientSystemInfo", null);
        setField(term289784, term289784.getClass(), "isNewMusicDetailList", null);
        setField(term289784, term289784.getClass(), "isNewCharacterList", null);
        setField(term289784, term289784.getClass(), "isNewCardList", null);
        setField(term289784, term289784.getClass(), "isNewDeckList", null);
        setField(term289784, term289784.getClass(), "isNewTrainingRoomList", null);
        setField(term289784, term289784.getClass(), "isNewStoryList", null);
        setField(term289784, term289784.getClass(), "isNewChapterList", null);
        setField(term289784, term289784.getClass(), "isNewMemoryChapterList", null);
        setField(term289784, term289784.getClass(), "isNewItemList", null);
        setField(term289784, term289784.getClass(), "isNewMusicItemList", null);
        setField(term289784, term289784.getClass(), "isNewLoginBonusList", null);
        setField(term289784, term289784.getClass(), "isNewEventPointList", null);
        setField(term289784, term289784.getClass(), "isNewMissionPointList", null);
        setField(term289784, term289784.getClass(), "isNewRatinglogList", null);
        setField(term289784, term289784.getClass(), "isNewBossList", null);
        setField(term289784, term289784.getClass(), "isNewTechCountList", null);
        setField(term289784, term289784.getClass(), "isNewScenarioList", null);
        setField(term289784, term289784.getClass(), "isNewTradeItemList", null);
        setField(term289784, term289784.getClass(), "isNewEventMusicList", null);
        setField(term289784, term289784.getClass(), "isNewTechEventList", null);
        setField(term289784, term289784.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewScenarioList", argTypes, term289784, args);
    }

};


