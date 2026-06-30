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

public class UpsertUserAll_setIsNewCardList_1864384695215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289770;

    public UpsertUserAll_setIsNewCardList_1864384695215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289770 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289770, term289770.getClass(), "userData", null);
        setField(term289770, term289770.getClass(), "userOption", null);
        setField(term289770, term289770.getClass(), "userPlaylogList", null);
        setField(term289770, term289770.getClass(), "userJewelboostlogList", null);
        setField(term289770, term289770.getClass(), "userSessionlogList", null);
        setField(term289770, term289770.getClass(), "userActivityList", null);
        setField(term289770, term289770.getClass(), "userRecentRatingList", null);
        setField(term289770, term289770.getClass(), "userBpBaseList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseBestNewList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseBestList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseHotList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseNextNewList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseNextList", null);
        setField(term289770, term289770.getClass(), "userRatingBaseHotNextList", null);
        setField(term289770, term289770.getClass(), "userMusicDetailList", null);
        setField(term289770, term289770.getClass(), "userCharacterList", null);
        setField(term289770, term289770.getClass(), "userCardList", null);
        setField(term289770, term289770.getClass(), "userDeckList", null);
        setField(term289770, term289770.getClass(), "userTrainingRoomList", null);
        setField(term289770, term289770.getClass(), "userStoryList", null);
        setField(term289770, term289770.getClass(), "userChapterList", null);
        setField(term289770, term289770.getClass(), "userMemoryChapterList", null);
        setField(term289770, term289770.getClass(), "userItemList", null);
        setField(term289770, term289770.getClass(), "userMusicItemList", null);
        setField(term289770, term289770.getClass(), "userLoginBonusList", null);
        setField(term289770, term289770.getClass(), "userEventPointList", null);
        setField(term289770, term289770.getClass(), "userMissionPointList", null);
        setField(term289770, term289770.getClass(), "userRatinglogList", null);
        setField(term289770, term289770.getClass(), "userBossList", null);
        setField(term289770, term289770.getClass(), "userTechCountList", null);
        setField(term289770, term289770.getClass(), "userScenarioList", null);
        setField(term289770, term289770.getClass(), "userTradeItemList", null);
        setField(term289770, term289770.getClass(), "userEventMusicList", null);
        setField(term289770, term289770.getClass(), "userTechEventList", null);
        setField(term289770, term289770.getClass(), "userKopList", null);
        setField(term289770, term289770.getClass(), "clientSystemInfo", null);
        setField(term289770, term289770.getClass(), "isNewMusicDetailList", null);
        setField(term289770, term289770.getClass(), "isNewCharacterList", null);
        setField(term289770, term289770.getClass(), "isNewCardList", null);
        setField(term289770, term289770.getClass(), "isNewDeckList", null);
        setField(term289770, term289770.getClass(), "isNewTrainingRoomList", null);
        setField(term289770, term289770.getClass(), "isNewStoryList", null);
        setField(term289770, term289770.getClass(), "isNewChapterList", null);
        setField(term289770, term289770.getClass(), "isNewMemoryChapterList", null);
        setField(term289770, term289770.getClass(), "isNewItemList", null);
        setField(term289770, term289770.getClass(), "isNewMusicItemList", null);
        setField(term289770, term289770.getClass(), "isNewLoginBonusList", null);
        setField(term289770, term289770.getClass(), "isNewEventPointList", null);
        setField(term289770, term289770.getClass(), "isNewMissionPointList", null);
        setField(term289770, term289770.getClass(), "isNewRatinglogList", null);
        setField(term289770, term289770.getClass(), "isNewBossList", null);
        setField(term289770, term289770.getClass(), "isNewTechCountList", null);
        setField(term289770, term289770.getClass(), "isNewScenarioList", null);
        setField(term289770, term289770.getClass(), "isNewTradeItemList", null);
        setField(term289770, term289770.getClass(), "isNewEventMusicList", null);
        setField(term289770, term289770.getClass(), "isNewTechEventList", null);
        setField(term289770, term289770.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewCardList", argTypes, term289770, args);
    }

};


