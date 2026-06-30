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

public class UpsertUserAll_getUserEventMusicList_30000578152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289707;

    public UpsertUserAll_getUserEventMusicList_30000578152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289707 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289707, term289707.getClass(), "userData", null);
        setField(term289707, term289707.getClass(), "userOption", null);
        setField(term289707, term289707.getClass(), "userPlaylogList", null);
        setField(term289707, term289707.getClass(), "userJewelboostlogList", null);
        setField(term289707, term289707.getClass(), "userSessionlogList", null);
        setField(term289707, term289707.getClass(), "userActivityList", null);
        setField(term289707, term289707.getClass(), "userRecentRatingList", null);
        setField(term289707, term289707.getClass(), "userBpBaseList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseBestNewList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseBestList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseHotList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseNextNewList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseNextList", null);
        setField(term289707, term289707.getClass(), "userRatingBaseHotNextList", null);
        setField(term289707, term289707.getClass(), "userMusicDetailList", null);
        setField(term289707, term289707.getClass(), "userCharacterList", null);
        setField(term289707, term289707.getClass(), "userCardList", null);
        setField(term289707, term289707.getClass(), "userDeckList", null);
        setField(term289707, term289707.getClass(), "userTrainingRoomList", null);
        setField(term289707, term289707.getClass(), "userStoryList", null);
        setField(term289707, term289707.getClass(), "userChapterList", null);
        setField(term289707, term289707.getClass(), "userMemoryChapterList", null);
        setField(term289707, term289707.getClass(), "userItemList", null);
        setField(term289707, term289707.getClass(), "userMusicItemList", null);
        setField(term289707, term289707.getClass(), "userLoginBonusList", null);
        setField(term289707, term289707.getClass(), "userEventPointList", null);
        setField(term289707, term289707.getClass(), "userMissionPointList", null);
        setField(term289707, term289707.getClass(), "userRatinglogList", null);
        setField(term289707, term289707.getClass(), "userBossList", null);
        setField(term289707, term289707.getClass(), "userTechCountList", null);
        setField(term289707, term289707.getClass(), "userScenarioList", null);
        setField(term289707, term289707.getClass(), "userTradeItemList", null);
        setField(term289707, term289707.getClass(), "userEventMusicList", null);
        setField(term289707, term289707.getClass(), "userTechEventList", null);
        setField(term289707, term289707.getClass(), "userKopList", null);
        setField(term289707, term289707.getClass(), "clientSystemInfo", null);
        setField(term289707, term289707.getClass(), "isNewMusicDetailList", null);
        setField(term289707, term289707.getClass(), "isNewCharacterList", null);
        setField(term289707, term289707.getClass(), "isNewCardList", null);
        setField(term289707, term289707.getClass(), "isNewDeckList", null);
        setField(term289707, term289707.getClass(), "isNewTrainingRoomList", null);
        setField(term289707, term289707.getClass(), "isNewStoryList", null);
        setField(term289707, term289707.getClass(), "isNewChapterList", null);
        setField(term289707, term289707.getClass(), "isNewMemoryChapterList", null);
        setField(term289707, term289707.getClass(), "isNewItemList", null);
        setField(term289707, term289707.getClass(), "isNewMusicItemList", null);
        setField(term289707, term289707.getClass(), "isNewLoginBonusList", null);
        setField(term289707, term289707.getClass(), "isNewEventPointList", null);
        setField(term289707, term289707.getClass(), "isNewMissionPointList", null);
        setField(term289707, term289707.getClass(), "isNewRatinglogList", null);
        setField(term289707, term289707.getClass(), "isNewBossList", null);
        setField(term289707, term289707.getClass(), "isNewTechCountList", null);
        setField(term289707, term289707.getClass(), "isNewScenarioList", null);
        setField(term289707, term289707.getClass(), "isNewTradeItemList", null);
        setField(term289707, term289707.getClass(), "isNewEventMusicList", null);
        setField(term289707, term289707.getClass(), "isNewTechEventList", null);
        setField(term289707, term289707.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserEventMusicList", argTypes, term289707, args);
    }

};


