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

public class UpsertUserAll_setUserMissionPointList_612114941203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289758;

    public UpsertUserAll_setUserMissionPointList_612114941203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289758 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289758, term289758.getClass(), "userData", null);
        setField(term289758, term289758.getClass(), "userOption", null);
        setField(term289758, term289758.getClass(), "userPlaylogList", null);
        setField(term289758, term289758.getClass(), "userJewelboostlogList", null);
        setField(term289758, term289758.getClass(), "userSessionlogList", null);
        setField(term289758, term289758.getClass(), "userActivityList", null);
        setField(term289758, term289758.getClass(), "userRecentRatingList", null);
        setField(term289758, term289758.getClass(), "userBpBaseList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseBestNewList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseBestList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseHotList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseNextNewList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseNextList", null);
        setField(term289758, term289758.getClass(), "userRatingBaseHotNextList", null);
        setField(term289758, term289758.getClass(), "userMusicDetailList", null);
        setField(term289758, term289758.getClass(), "userCharacterList", null);
        setField(term289758, term289758.getClass(), "userCardList", null);
        setField(term289758, term289758.getClass(), "userDeckList", null);
        setField(term289758, term289758.getClass(), "userTrainingRoomList", null);
        setField(term289758, term289758.getClass(), "userStoryList", null);
        setField(term289758, term289758.getClass(), "userChapterList", null);
        setField(term289758, term289758.getClass(), "userMemoryChapterList", null);
        setField(term289758, term289758.getClass(), "userItemList", null);
        setField(term289758, term289758.getClass(), "userMusicItemList", null);
        setField(term289758, term289758.getClass(), "userLoginBonusList", null);
        setField(term289758, term289758.getClass(), "userEventPointList", null);
        setField(term289758, term289758.getClass(), "userMissionPointList", null);
        setField(term289758, term289758.getClass(), "userRatinglogList", null);
        setField(term289758, term289758.getClass(), "userBossList", null);
        setField(term289758, term289758.getClass(), "userTechCountList", null);
        setField(term289758, term289758.getClass(), "userScenarioList", null);
        setField(term289758, term289758.getClass(), "userTradeItemList", null);
        setField(term289758, term289758.getClass(), "userEventMusicList", null);
        setField(term289758, term289758.getClass(), "userTechEventList", null);
        setField(term289758, term289758.getClass(), "userKopList", null);
        setField(term289758, term289758.getClass(), "clientSystemInfo", null);
        setField(term289758, term289758.getClass(), "isNewMusicDetailList", null);
        setField(term289758, term289758.getClass(), "isNewCharacterList", null);
        setField(term289758, term289758.getClass(), "isNewCardList", null);
        setField(term289758, term289758.getClass(), "isNewDeckList", null);
        setField(term289758, term289758.getClass(), "isNewTrainingRoomList", null);
        setField(term289758, term289758.getClass(), "isNewStoryList", null);
        setField(term289758, term289758.getClass(), "isNewChapterList", null);
        setField(term289758, term289758.getClass(), "isNewMemoryChapterList", null);
        setField(term289758, term289758.getClass(), "isNewItemList", null);
        setField(term289758, term289758.getClass(), "isNewMusicItemList", null);
        setField(term289758, term289758.getClass(), "isNewLoginBonusList", null);
        setField(term289758, term289758.getClass(), "isNewEventPointList", null);
        setField(term289758, term289758.getClass(), "isNewMissionPointList", null);
        setField(term289758, term289758.getClass(), "isNewRatinglogList", null);
        setField(term289758, term289758.getClass(), "isNewBossList", null);
        setField(term289758, term289758.getClass(), "isNewTechCountList", null);
        setField(term289758, term289758.getClass(), "isNewScenarioList", null);
        setField(term289758, term289758.getClass(), "isNewTradeItemList", null);
        setField(term289758, term289758.getClass(), "isNewEventMusicList", null);
        setField(term289758, term289758.getClass(), "isNewTechEventList", null);
        setField(term289758, term289758.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMissionPointList", argTypes, term289758, args);
    }

};


