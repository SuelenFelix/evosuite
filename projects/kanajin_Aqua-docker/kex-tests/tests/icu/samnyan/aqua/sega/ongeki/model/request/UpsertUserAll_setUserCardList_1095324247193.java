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

public class UpsertUserAll_setUserCardList_1095324247193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289748;

    public UpsertUserAll_setUserCardList_1095324247193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289748 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289748, term289748.getClass(), "userData", null);
        setField(term289748, term289748.getClass(), "userOption", null);
        setField(term289748, term289748.getClass(), "userPlaylogList", null);
        setField(term289748, term289748.getClass(), "userJewelboostlogList", null);
        setField(term289748, term289748.getClass(), "userSessionlogList", null);
        setField(term289748, term289748.getClass(), "userActivityList", null);
        setField(term289748, term289748.getClass(), "userRecentRatingList", null);
        setField(term289748, term289748.getClass(), "userBpBaseList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseBestNewList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseBestList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseHotList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseNextNewList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseNextList", null);
        setField(term289748, term289748.getClass(), "userRatingBaseHotNextList", null);
        setField(term289748, term289748.getClass(), "userMusicDetailList", null);
        setField(term289748, term289748.getClass(), "userCharacterList", null);
        setField(term289748, term289748.getClass(), "userCardList", null);
        setField(term289748, term289748.getClass(), "userDeckList", null);
        setField(term289748, term289748.getClass(), "userTrainingRoomList", null);
        setField(term289748, term289748.getClass(), "userStoryList", null);
        setField(term289748, term289748.getClass(), "userChapterList", null);
        setField(term289748, term289748.getClass(), "userMemoryChapterList", null);
        setField(term289748, term289748.getClass(), "userItemList", null);
        setField(term289748, term289748.getClass(), "userMusicItemList", null);
        setField(term289748, term289748.getClass(), "userLoginBonusList", null);
        setField(term289748, term289748.getClass(), "userEventPointList", null);
        setField(term289748, term289748.getClass(), "userMissionPointList", null);
        setField(term289748, term289748.getClass(), "userRatinglogList", null);
        setField(term289748, term289748.getClass(), "userBossList", null);
        setField(term289748, term289748.getClass(), "userTechCountList", null);
        setField(term289748, term289748.getClass(), "userScenarioList", null);
        setField(term289748, term289748.getClass(), "userTradeItemList", null);
        setField(term289748, term289748.getClass(), "userEventMusicList", null);
        setField(term289748, term289748.getClass(), "userTechEventList", null);
        setField(term289748, term289748.getClass(), "userKopList", null);
        setField(term289748, term289748.getClass(), "clientSystemInfo", null);
        setField(term289748, term289748.getClass(), "isNewMusicDetailList", null);
        setField(term289748, term289748.getClass(), "isNewCharacterList", null);
        setField(term289748, term289748.getClass(), "isNewCardList", null);
        setField(term289748, term289748.getClass(), "isNewDeckList", null);
        setField(term289748, term289748.getClass(), "isNewTrainingRoomList", null);
        setField(term289748, term289748.getClass(), "isNewStoryList", null);
        setField(term289748, term289748.getClass(), "isNewChapterList", null);
        setField(term289748, term289748.getClass(), "isNewMemoryChapterList", null);
        setField(term289748, term289748.getClass(), "isNewItemList", null);
        setField(term289748, term289748.getClass(), "isNewMusicItemList", null);
        setField(term289748, term289748.getClass(), "isNewLoginBonusList", null);
        setField(term289748, term289748.getClass(), "isNewEventPointList", null);
        setField(term289748, term289748.getClass(), "isNewMissionPointList", null);
        setField(term289748, term289748.getClass(), "isNewRatinglogList", null);
        setField(term289748, term289748.getClass(), "isNewBossList", null);
        setField(term289748, term289748.getClass(), "isNewTechCountList", null);
        setField(term289748, term289748.getClass(), "isNewScenarioList", null);
        setField(term289748, term289748.getClass(), "isNewTradeItemList", null);
        setField(term289748, term289748.getClass(), "isNewEventMusicList", null);
        setField(term289748, term289748.getClass(), "isNewTechEventList", null);
        setField(term289748, term289748.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserCardList", argTypes, term289748, args);
    }

};


