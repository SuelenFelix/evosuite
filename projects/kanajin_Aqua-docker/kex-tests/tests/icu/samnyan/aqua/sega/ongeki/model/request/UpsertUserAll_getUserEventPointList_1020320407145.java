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

public class UpsertUserAll_getUserEventPointList_1020320407145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289700;

    public UpsertUserAll_getUserEventPointList_1020320407145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289700 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289700, term289700.getClass(), "userData", null);
        setField(term289700, term289700.getClass(), "userOption", null);
        setField(term289700, term289700.getClass(), "userPlaylogList", null);
        setField(term289700, term289700.getClass(), "userJewelboostlogList", null);
        setField(term289700, term289700.getClass(), "userSessionlogList", null);
        setField(term289700, term289700.getClass(), "userActivityList", null);
        setField(term289700, term289700.getClass(), "userRecentRatingList", null);
        setField(term289700, term289700.getClass(), "userBpBaseList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseBestNewList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseBestList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseHotList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseNextNewList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseNextList", null);
        setField(term289700, term289700.getClass(), "userRatingBaseHotNextList", null);
        setField(term289700, term289700.getClass(), "userMusicDetailList", null);
        setField(term289700, term289700.getClass(), "userCharacterList", null);
        setField(term289700, term289700.getClass(), "userCardList", null);
        setField(term289700, term289700.getClass(), "userDeckList", null);
        setField(term289700, term289700.getClass(), "userTrainingRoomList", null);
        setField(term289700, term289700.getClass(), "userStoryList", null);
        setField(term289700, term289700.getClass(), "userChapterList", null);
        setField(term289700, term289700.getClass(), "userMemoryChapterList", null);
        setField(term289700, term289700.getClass(), "userItemList", null);
        setField(term289700, term289700.getClass(), "userMusicItemList", null);
        setField(term289700, term289700.getClass(), "userLoginBonusList", null);
        setField(term289700, term289700.getClass(), "userEventPointList", null);
        setField(term289700, term289700.getClass(), "userMissionPointList", null);
        setField(term289700, term289700.getClass(), "userRatinglogList", null);
        setField(term289700, term289700.getClass(), "userBossList", null);
        setField(term289700, term289700.getClass(), "userTechCountList", null);
        setField(term289700, term289700.getClass(), "userScenarioList", null);
        setField(term289700, term289700.getClass(), "userTradeItemList", null);
        setField(term289700, term289700.getClass(), "userEventMusicList", null);
        setField(term289700, term289700.getClass(), "userTechEventList", null);
        setField(term289700, term289700.getClass(), "userKopList", null);
        setField(term289700, term289700.getClass(), "clientSystemInfo", null);
        setField(term289700, term289700.getClass(), "isNewMusicDetailList", null);
        setField(term289700, term289700.getClass(), "isNewCharacterList", null);
        setField(term289700, term289700.getClass(), "isNewCardList", null);
        setField(term289700, term289700.getClass(), "isNewDeckList", null);
        setField(term289700, term289700.getClass(), "isNewTrainingRoomList", null);
        setField(term289700, term289700.getClass(), "isNewStoryList", null);
        setField(term289700, term289700.getClass(), "isNewChapterList", null);
        setField(term289700, term289700.getClass(), "isNewMemoryChapterList", null);
        setField(term289700, term289700.getClass(), "isNewItemList", null);
        setField(term289700, term289700.getClass(), "isNewMusicItemList", null);
        setField(term289700, term289700.getClass(), "isNewLoginBonusList", null);
        setField(term289700, term289700.getClass(), "isNewEventPointList", null);
        setField(term289700, term289700.getClass(), "isNewMissionPointList", null);
        setField(term289700, term289700.getClass(), "isNewRatinglogList", null);
        setField(term289700, term289700.getClass(), "isNewBossList", null);
        setField(term289700, term289700.getClass(), "isNewTechCountList", null);
        setField(term289700, term289700.getClass(), "isNewScenarioList", null);
        setField(term289700, term289700.getClass(), "isNewTradeItemList", null);
        setField(term289700, term289700.getClass(), "isNewEventMusicList", null);
        setField(term289700, term289700.getClass(), "isNewTechEventList", null);
        setField(term289700, term289700.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserEventPointList", argTypes, term289700, args);
    }

};


