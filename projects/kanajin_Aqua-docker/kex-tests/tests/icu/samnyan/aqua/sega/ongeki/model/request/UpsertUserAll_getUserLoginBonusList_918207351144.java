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

public class UpsertUserAll_getUserLoginBonusList_918207351144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289699;

    public UpsertUserAll_getUserLoginBonusList_918207351144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289699 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289699, term289699.getClass(), "userData", null);
        setField(term289699, term289699.getClass(), "userOption", null);
        setField(term289699, term289699.getClass(), "userPlaylogList", null);
        setField(term289699, term289699.getClass(), "userJewelboostlogList", null);
        setField(term289699, term289699.getClass(), "userSessionlogList", null);
        setField(term289699, term289699.getClass(), "userActivityList", null);
        setField(term289699, term289699.getClass(), "userRecentRatingList", null);
        setField(term289699, term289699.getClass(), "userBpBaseList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseBestNewList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseBestList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseHotList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseNextNewList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseNextList", null);
        setField(term289699, term289699.getClass(), "userRatingBaseHotNextList", null);
        setField(term289699, term289699.getClass(), "userMusicDetailList", null);
        setField(term289699, term289699.getClass(), "userCharacterList", null);
        setField(term289699, term289699.getClass(), "userCardList", null);
        setField(term289699, term289699.getClass(), "userDeckList", null);
        setField(term289699, term289699.getClass(), "userTrainingRoomList", null);
        setField(term289699, term289699.getClass(), "userStoryList", null);
        setField(term289699, term289699.getClass(), "userChapterList", null);
        setField(term289699, term289699.getClass(), "userMemoryChapterList", null);
        setField(term289699, term289699.getClass(), "userItemList", null);
        setField(term289699, term289699.getClass(), "userMusicItemList", null);
        setField(term289699, term289699.getClass(), "userLoginBonusList", null);
        setField(term289699, term289699.getClass(), "userEventPointList", null);
        setField(term289699, term289699.getClass(), "userMissionPointList", null);
        setField(term289699, term289699.getClass(), "userRatinglogList", null);
        setField(term289699, term289699.getClass(), "userBossList", null);
        setField(term289699, term289699.getClass(), "userTechCountList", null);
        setField(term289699, term289699.getClass(), "userScenarioList", null);
        setField(term289699, term289699.getClass(), "userTradeItemList", null);
        setField(term289699, term289699.getClass(), "userEventMusicList", null);
        setField(term289699, term289699.getClass(), "userTechEventList", null);
        setField(term289699, term289699.getClass(), "userKopList", null);
        setField(term289699, term289699.getClass(), "clientSystemInfo", null);
        setField(term289699, term289699.getClass(), "isNewMusicDetailList", null);
        setField(term289699, term289699.getClass(), "isNewCharacterList", null);
        setField(term289699, term289699.getClass(), "isNewCardList", null);
        setField(term289699, term289699.getClass(), "isNewDeckList", null);
        setField(term289699, term289699.getClass(), "isNewTrainingRoomList", null);
        setField(term289699, term289699.getClass(), "isNewStoryList", null);
        setField(term289699, term289699.getClass(), "isNewChapterList", null);
        setField(term289699, term289699.getClass(), "isNewMemoryChapterList", null);
        setField(term289699, term289699.getClass(), "isNewItemList", null);
        setField(term289699, term289699.getClass(), "isNewMusicItemList", null);
        setField(term289699, term289699.getClass(), "isNewLoginBonusList", null);
        setField(term289699, term289699.getClass(), "isNewEventPointList", null);
        setField(term289699, term289699.getClass(), "isNewMissionPointList", null);
        setField(term289699, term289699.getClass(), "isNewRatinglogList", null);
        setField(term289699, term289699.getClass(), "isNewBossList", null);
        setField(term289699, term289699.getClass(), "isNewTechCountList", null);
        setField(term289699, term289699.getClass(), "isNewScenarioList", null);
        setField(term289699, term289699.getClass(), "isNewTradeItemList", null);
        setField(term289699, term289699.getClass(), "isNewEventMusicList", null);
        setField(term289699, term289699.getClass(), "isNewTechEventList", null);
        setField(term289699, term289699.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserLoginBonusList", argTypes, term289699, args);
    }

};


