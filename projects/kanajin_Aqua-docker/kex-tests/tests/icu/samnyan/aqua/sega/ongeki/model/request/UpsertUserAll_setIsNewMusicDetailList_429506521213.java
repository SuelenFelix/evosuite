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

public class UpsertUserAll_setIsNewMusicDetailList_429506521213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289768;

    public UpsertUserAll_setIsNewMusicDetailList_429506521213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289768 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289768, term289768.getClass(), "userData", null);
        setField(term289768, term289768.getClass(), "userOption", null);
        setField(term289768, term289768.getClass(), "userPlaylogList", null);
        setField(term289768, term289768.getClass(), "userJewelboostlogList", null);
        setField(term289768, term289768.getClass(), "userSessionlogList", null);
        setField(term289768, term289768.getClass(), "userActivityList", null);
        setField(term289768, term289768.getClass(), "userRecentRatingList", null);
        setField(term289768, term289768.getClass(), "userBpBaseList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseBestNewList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseBestList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseHotList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseNextNewList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseNextList", null);
        setField(term289768, term289768.getClass(), "userRatingBaseHotNextList", null);
        setField(term289768, term289768.getClass(), "userMusicDetailList", null);
        setField(term289768, term289768.getClass(), "userCharacterList", null);
        setField(term289768, term289768.getClass(), "userCardList", null);
        setField(term289768, term289768.getClass(), "userDeckList", null);
        setField(term289768, term289768.getClass(), "userTrainingRoomList", null);
        setField(term289768, term289768.getClass(), "userStoryList", null);
        setField(term289768, term289768.getClass(), "userChapterList", null);
        setField(term289768, term289768.getClass(), "userMemoryChapterList", null);
        setField(term289768, term289768.getClass(), "userItemList", null);
        setField(term289768, term289768.getClass(), "userMusicItemList", null);
        setField(term289768, term289768.getClass(), "userLoginBonusList", null);
        setField(term289768, term289768.getClass(), "userEventPointList", null);
        setField(term289768, term289768.getClass(), "userMissionPointList", null);
        setField(term289768, term289768.getClass(), "userRatinglogList", null);
        setField(term289768, term289768.getClass(), "userBossList", null);
        setField(term289768, term289768.getClass(), "userTechCountList", null);
        setField(term289768, term289768.getClass(), "userScenarioList", null);
        setField(term289768, term289768.getClass(), "userTradeItemList", null);
        setField(term289768, term289768.getClass(), "userEventMusicList", null);
        setField(term289768, term289768.getClass(), "userTechEventList", null);
        setField(term289768, term289768.getClass(), "userKopList", null);
        setField(term289768, term289768.getClass(), "clientSystemInfo", null);
        setField(term289768, term289768.getClass(), "isNewMusicDetailList", null);
        setField(term289768, term289768.getClass(), "isNewCharacterList", null);
        setField(term289768, term289768.getClass(), "isNewCardList", null);
        setField(term289768, term289768.getClass(), "isNewDeckList", null);
        setField(term289768, term289768.getClass(), "isNewTrainingRoomList", null);
        setField(term289768, term289768.getClass(), "isNewStoryList", null);
        setField(term289768, term289768.getClass(), "isNewChapterList", null);
        setField(term289768, term289768.getClass(), "isNewMemoryChapterList", null);
        setField(term289768, term289768.getClass(), "isNewItemList", null);
        setField(term289768, term289768.getClass(), "isNewMusicItemList", null);
        setField(term289768, term289768.getClass(), "isNewLoginBonusList", null);
        setField(term289768, term289768.getClass(), "isNewEventPointList", null);
        setField(term289768, term289768.getClass(), "isNewMissionPointList", null);
        setField(term289768, term289768.getClass(), "isNewRatinglogList", null);
        setField(term289768, term289768.getClass(), "isNewBossList", null);
        setField(term289768, term289768.getClass(), "isNewTechCountList", null);
        setField(term289768, term289768.getClass(), "isNewScenarioList", null);
        setField(term289768, term289768.getClass(), "isNewTradeItemList", null);
        setField(term289768, term289768.getClass(), "isNewEventMusicList", null);
        setField(term289768, term289768.getClass(), "isNewTechEventList", null);
        setField(term289768, term289768.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewMusicDetailList", argTypes, term289768, args);
    }

};


