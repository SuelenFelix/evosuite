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

public class UpsertUserAll_setIsNewKopList_224180131233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289788;

    public UpsertUserAll_setIsNewKopList_224180131233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289788 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289788, term289788.getClass(), "userData", null);
        setField(term289788, term289788.getClass(), "userOption", null);
        setField(term289788, term289788.getClass(), "userPlaylogList", null);
        setField(term289788, term289788.getClass(), "userJewelboostlogList", null);
        setField(term289788, term289788.getClass(), "userSessionlogList", null);
        setField(term289788, term289788.getClass(), "userActivityList", null);
        setField(term289788, term289788.getClass(), "userRecentRatingList", null);
        setField(term289788, term289788.getClass(), "userBpBaseList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseBestNewList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseBestList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseHotList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseNextNewList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseNextList", null);
        setField(term289788, term289788.getClass(), "userRatingBaseHotNextList", null);
        setField(term289788, term289788.getClass(), "userMusicDetailList", null);
        setField(term289788, term289788.getClass(), "userCharacterList", null);
        setField(term289788, term289788.getClass(), "userCardList", null);
        setField(term289788, term289788.getClass(), "userDeckList", null);
        setField(term289788, term289788.getClass(), "userTrainingRoomList", null);
        setField(term289788, term289788.getClass(), "userStoryList", null);
        setField(term289788, term289788.getClass(), "userChapterList", null);
        setField(term289788, term289788.getClass(), "userMemoryChapterList", null);
        setField(term289788, term289788.getClass(), "userItemList", null);
        setField(term289788, term289788.getClass(), "userMusicItemList", null);
        setField(term289788, term289788.getClass(), "userLoginBonusList", null);
        setField(term289788, term289788.getClass(), "userEventPointList", null);
        setField(term289788, term289788.getClass(), "userMissionPointList", null);
        setField(term289788, term289788.getClass(), "userRatinglogList", null);
        setField(term289788, term289788.getClass(), "userBossList", null);
        setField(term289788, term289788.getClass(), "userTechCountList", null);
        setField(term289788, term289788.getClass(), "userScenarioList", null);
        setField(term289788, term289788.getClass(), "userTradeItemList", null);
        setField(term289788, term289788.getClass(), "userEventMusicList", null);
        setField(term289788, term289788.getClass(), "userTechEventList", null);
        setField(term289788, term289788.getClass(), "userKopList", null);
        setField(term289788, term289788.getClass(), "clientSystemInfo", null);
        setField(term289788, term289788.getClass(), "isNewMusicDetailList", null);
        setField(term289788, term289788.getClass(), "isNewCharacterList", null);
        setField(term289788, term289788.getClass(), "isNewCardList", null);
        setField(term289788, term289788.getClass(), "isNewDeckList", null);
        setField(term289788, term289788.getClass(), "isNewTrainingRoomList", null);
        setField(term289788, term289788.getClass(), "isNewStoryList", null);
        setField(term289788, term289788.getClass(), "isNewChapterList", null);
        setField(term289788, term289788.getClass(), "isNewMemoryChapterList", null);
        setField(term289788, term289788.getClass(), "isNewItemList", null);
        setField(term289788, term289788.getClass(), "isNewMusicItemList", null);
        setField(term289788, term289788.getClass(), "isNewLoginBonusList", null);
        setField(term289788, term289788.getClass(), "isNewEventPointList", null);
        setField(term289788, term289788.getClass(), "isNewMissionPointList", null);
        setField(term289788, term289788.getClass(), "isNewRatinglogList", null);
        setField(term289788, term289788.getClass(), "isNewBossList", null);
        setField(term289788, term289788.getClass(), "isNewTechCountList", null);
        setField(term289788, term289788.getClass(), "isNewScenarioList", null);
        setField(term289788, term289788.getClass(), "isNewTradeItemList", null);
        setField(term289788, term289788.getClass(), "isNewEventMusicList", null);
        setField(term289788, term289788.getClass(), "isNewTechEventList", null);
        setField(term289788, term289788.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewKopList", argTypes, term289788, args);
    }

};


