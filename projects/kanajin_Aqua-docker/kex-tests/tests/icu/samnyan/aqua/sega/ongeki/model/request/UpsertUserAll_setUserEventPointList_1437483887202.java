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

public class UpsertUserAll_setUserEventPointList_1437483887202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289757;

    public UpsertUserAll_setUserEventPointList_1437483887202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289757 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289757, term289757.getClass(), "userData", null);
        setField(term289757, term289757.getClass(), "userOption", null);
        setField(term289757, term289757.getClass(), "userPlaylogList", null);
        setField(term289757, term289757.getClass(), "userJewelboostlogList", null);
        setField(term289757, term289757.getClass(), "userSessionlogList", null);
        setField(term289757, term289757.getClass(), "userActivityList", null);
        setField(term289757, term289757.getClass(), "userRecentRatingList", null);
        setField(term289757, term289757.getClass(), "userBpBaseList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseBestNewList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseBestList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseHotList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseNextNewList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseNextList", null);
        setField(term289757, term289757.getClass(), "userRatingBaseHotNextList", null);
        setField(term289757, term289757.getClass(), "userMusicDetailList", null);
        setField(term289757, term289757.getClass(), "userCharacterList", null);
        setField(term289757, term289757.getClass(), "userCardList", null);
        setField(term289757, term289757.getClass(), "userDeckList", null);
        setField(term289757, term289757.getClass(), "userTrainingRoomList", null);
        setField(term289757, term289757.getClass(), "userStoryList", null);
        setField(term289757, term289757.getClass(), "userChapterList", null);
        setField(term289757, term289757.getClass(), "userMemoryChapterList", null);
        setField(term289757, term289757.getClass(), "userItemList", null);
        setField(term289757, term289757.getClass(), "userMusicItemList", null);
        setField(term289757, term289757.getClass(), "userLoginBonusList", null);
        setField(term289757, term289757.getClass(), "userEventPointList", null);
        setField(term289757, term289757.getClass(), "userMissionPointList", null);
        setField(term289757, term289757.getClass(), "userRatinglogList", null);
        setField(term289757, term289757.getClass(), "userBossList", null);
        setField(term289757, term289757.getClass(), "userTechCountList", null);
        setField(term289757, term289757.getClass(), "userScenarioList", null);
        setField(term289757, term289757.getClass(), "userTradeItemList", null);
        setField(term289757, term289757.getClass(), "userEventMusicList", null);
        setField(term289757, term289757.getClass(), "userTechEventList", null);
        setField(term289757, term289757.getClass(), "userKopList", null);
        setField(term289757, term289757.getClass(), "clientSystemInfo", null);
        setField(term289757, term289757.getClass(), "isNewMusicDetailList", null);
        setField(term289757, term289757.getClass(), "isNewCharacterList", null);
        setField(term289757, term289757.getClass(), "isNewCardList", null);
        setField(term289757, term289757.getClass(), "isNewDeckList", null);
        setField(term289757, term289757.getClass(), "isNewTrainingRoomList", null);
        setField(term289757, term289757.getClass(), "isNewStoryList", null);
        setField(term289757, term289757.getClass(), "isNewChapterList", null);
        setField(term289757, term289757.getClass(), "isNewMemoryChapterList", null);
        setField(term289757, term289757.getClass(), "isNewItemList", null);
        setField(term289757, term289757.getClass(), "isNewMusicItemList", null);
        setField(term289757, term289757.getClass(), "isNewLoginBonusList", null);
        setField(term289757, term289757.getClass(), "isNewEventPointList", null);
        setField(term289757, term289757.getClass(), "isNewMissionPointList", null);
        setField(term289757, term289757.getClass(), "isNewRatinglogList", null);
        setField(term289757, term289757.getClass(), "isNewBossList", null);
        setField(term289757, term289757.getClass(), "isNewTechCountList", null);
        setField(term289757, term289757.getClass(), "isNewScenarioList", null);
        setField(term289757, term289757.getClass(), "isNewTradeItemList", null);
        setField(term289757, term289757.getClass(), "isNewEventMusicList", null);
        setField(term289757, term289757.getClass(), "isNewTechEventList", null);
        setField(term289757, term289757.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserEventPointList", argTypes, term289757, args);
    }

};


