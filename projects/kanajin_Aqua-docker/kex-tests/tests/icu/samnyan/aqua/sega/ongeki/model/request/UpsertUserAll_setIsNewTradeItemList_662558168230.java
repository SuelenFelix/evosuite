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

public class UpsertUserAll_setIsNewTradeItemList_662558168230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289785;

    public UpsertUserAll_setIsNewTradeItemList_662558168230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289785 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289785, term289785.getClass(), "userData", null);
        setField(term289785, term289785.getClass(), "userOption", null);
        setField(term289785, term289785.getClass(), "userPlaylogList", null);
        setField(term289785, term289785.getClass(), "userJewelboostlogList", null);
        setField(term289785, term289785.getClass(), "userSessionlogList", null);
        setField(term289785, term289785.getClass(), "userActivityList", null);
        setField(term289785, term289785.getClass(), "userRecentRatingList", null);
        setField(term289785, term289785.getClass(), "userBpBaseList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseBestNewList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseBestList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseHotList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseNextNewList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseNextList", null);
        setField(term289785, term289785.getClass(), "userRatingBaseHotNextList", null);
        setField(term289785, term289785.getClass(), "userMusicDetailList", null);
        setField(term289785, term289785.getClass(), "userCharacterList", null);
        setField(term289785, term289785.getClass(), "userCardList", null);
        setField(term289785, term289785.getClass(), "userDeckList", null);
        setField(term289785, term289785.getClass(), "userTrainingRoomList", null);
        setField(term289785, term289785.getClass(), "userStoryList", null);
        setField(term289785, term289785.getClass(), "userChapterList", null);
        setField(term289785, term289785.getClass(), "userMemoryChapterList", null);
        setField(term289785, term289785.getClass(), "userItemList", null);
        setField(term289785, term289785.getClass(), "userMusicItemList", null);
        setField(term289785, term289785.getClass(), "userLoginBonusList", null);
        setField(term289785, term289785.getClass(), "userEventPointList", null);
        setField(term289785, term289785.getClass(), "userMissionPointList", null);
        setField(term289785, term289785.getClass(), "userRatinglogList", null);
        setField(term289785, term289785.getClass(), "userBossList", null);
        setField(term289785, term289785.getClass(), "userTechCountList", null);
        setField(term289785, term289785.getClass(), "userScenarioList", null);
        setField(term289785, term289785.getClass(), "userTradeItemList", null);
        setField(term289785, term289785.getClass(), "userEventMusicList", null);
        setField(term289785, term289785.getClass(), "userTechEventList", null);
        setField(term289785, term289785.getClass(), "userKopList", null);
        setField(term289785, term289785.getClass(), "clientSystemInfo", null);
        setField(term289785, term289785.getClass(), "isNewMusicDetailList", null);
        setField(term289785, term289785.getClass(), "isNewCharacterList", null);
        setField(term289785, term289785.getClass(), "isNewCardList", null);
        setField(term289785, term289785.getClass(), "isNewDeckList", null);
        setField(term289785, term289785.getClass(), "isNewTrainingRoomList", null);
        setField(term289785, term289785.getClass(), "isNewStoryList", null);
        setField(term289785, term289785.getClass(), "isNewChapterList", null);
        setField(term289785, term289785.getClass(), "isNewMemoryChapterList", null);
        setField(term289785, term289785.getClass(), "isNewItemList", null);
        setField(term289785, term289785.getClass(), "isNewMusicItemList", null);
        setField(term289785, term289785.getClass(), "isNewLoginBonusList", null);
        setField(term289785, term289785.getClass(), "isNewEventPointList", null);
        setField(term289785, term289785.getClass(), "isNewMissionPointList", null);
        setField(term289785, term289785.getClass(), "isNewRatinglogList", null);
        setField(term289785, term289785.getClass(), "isNewBossList", null);
        setField(term289785, term289785.getClass(), "isNewTechCountList", null);
        setField(term289785, term289785.getClass(), "isNewScenarioList", null);
        setField(term289785, term289785.getClass(), "isNewTradeItemList", null);
        setField(term289785, term289785.getClass(), "isNewEventMusicList", null);
        setField(term289785, term289785.getClass(), "isNewTechEventList", null);
        setField(term289785, term289785.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewTradeItemList", argTypes, term289785, args);
    }

};


