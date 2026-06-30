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

public class UpsertUserAll_getUserTrainingRoomList_1495530584138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289693;

    public UpsertUserAll_getUserTrainingRoomList_1495530584138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289693 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289693, term289693.getClass(), "userData", null);
        setField(term289693, term289693.getClass(), "userOption", null);
        setField(term289693, term289693.getClass(), "userPlaylogList", null);
        setField(term289693, term289693.getClass(), "userJewelboostlogList", null);
        setField(term289693, term289693.getClass(), "userSessionlogList", null);
        setField(term289693, term289693.getClass(), "userActivityList", null);
        setField(term289693, term289693.getClass(), "userRecentRatingList", null);
        setField(term289693, term289693.getClass(), "userBpBaseList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseBestNewList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseBestList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseHotList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseNextNewList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseNextList", null);
        setField(term289693, term289693.getClass(), "userRatingBaseHotNextList", null);
        setField(term289693, term289693.getClass(), "userMusicDetailList", null);
        setField(term289693, term289693.getClass(), "userCharacterList", null);
        setField(term289693, term289693.getClass(), "userCardList", null);
        setField(term289693, term289693.getClass(), "userDeckList", null);
        setField(term289693, term289693.getClass(), "userTrainingRoomList", null);
        setField(term289693, term289693.getClass(), "userStoryList", null);
        setField(term289693, term289693.getClass(), "userChapterList", null);
        setField(term289693, term289693.getClass(), "userMemoryChapterList", null);
        setField(term289693, term289693.getClass(), "userItemList", null);
        setField(term289693, term289693.getClass(), "userMusicItemList", null);
        setField(term289693, term289693.getClass(), "userLoginBonusList", null);
        setField(term289693, term289693.getClass(), "userEventPointList", null);
        setField(term289693, term289693.getClass(), "userMissionPointList", null);
        setField(term289693, term289693.getClass(), "userRatinglogList", null);
        setField(term289693, term289693.getClass(), "userBossList", null);
        setField(term289693, term289693.getClass(), "userTechCountList", null);
        setField(term289693, term289693.getClass(), "userScenarioList", null);
        setField(term289693, term289693.getClass(), "userTradeItemList", null);
        setField(term289693, term289693.getClass(), "userEventMusicList", null);
        setField(term289693, term289693.getClass(), "userTechEventList", null);
        setField(term289693, term289693.getClass(), "userKopList", null);
        setField(term289693, term289693.getClass(), "clientSystemInfo", null);
        setField(term289693, term289693.getClass(), "isNewMusicDetailList", null);
        setField(term289693, term289693.getClass(), "isNewCharacterList", null);
        setField(term289693, term289693.getClass(), "isNewCardList", null);
        setField(term289693, term289693.getClass(), "isNewDeckList", null);
        setField(term289693, term289693.getClass(), "isNewTrainingRoomList", null);
        setField(term289693, term289693.getClass(), "isNewStoryList", null);
        setField(term289693, term289693.getClass(), "isNewChapterList", null);
        setField(term289693, term289693.getClass(), "isNewMemoryChapterList", null);
        setField(term289693, term289693.getClass(), "isNewItemList", null);
        setField(term289693, term289693.getClass(), "isNewMusicItemList", null);
        setField(term289693, term289693.getClass(), "isNewLoginBonusList", null);
        setField(term289693, term289693.getClass(), "isNewEventPointList", null);
        setField(term289693, term289693.getClass(), "isNewMissionPointList", null);
        setField(term289693, term289693.getClass(), "isNewRatinglogList", null);
        setField(term289693, term289693.getClass(), "isNewBossList", null);
        setField(term289693, term289693.getClass(), "isNewTechCountList", null);
        setField(term289693, term289693.getClass(), "isNewScenarioList", null);
        setField(term289693, term289693.getClass(), "isNewTradeItemList", null);
        setField(term289693, term289693.getClass(), "isNewEventMusicList", null);
        setField(term289693, term289693.getClass(), "isNewTechEventList", null);
        setField(term289693, term289693.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserTrainingRoomList", argTypes, term289693, args);
    }

};


