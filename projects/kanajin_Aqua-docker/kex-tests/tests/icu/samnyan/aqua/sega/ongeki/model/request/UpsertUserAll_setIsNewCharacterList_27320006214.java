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

public class UpsertUserAll_setIsNewCharacterList_27320006214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289769;

    public UpsertUserAll_setIsNewCharacterList_27320006214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289769 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289769, term289769.getClass(), "userData", null);
        setField(term289769, term289769.getClass(), "userOption", null);
        setField(term289769, term289769.getClass(), "userPlaylogList", null);
        setField(term289769, term289769.getClass(), "userJewelboostlogList", null);
        setField(term289769, term289769.getClass(), "userSessionlogList", null);
        setField(term289769, term289769.getClass(), "userActivityList", null);
        setField(term289769, term289769.getClass(), "userRecentRatingList", null);
        setField(term289769, term289769.getClass(), "userBpBaseList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseBestNewList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseBestList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseHotList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseNextNewList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseNextList", null);
        setField(term289769, term289769.getClass(), "userRatingBaseHotNextList", null);
        setField(term289769, term289769.getClass(), "userMusicDetailList", null);
        setField(term289769, term289769.getClass(), "userCharacterList", null);
        setField(term289769, term289769.getClass(), "userCardList", null);
        setField(term289769, term289769.getClass(), "userDeckList", null);
        setField(term289769, term289769.getClass(), "userTrainingRoomList", null);
        setField(term289769, term289769.getClass(), "userStoryList", null);
        setField(term289769, term289769.getClass(), "userChapterList", null);
        setField(term289769, term289769.getClass(), "userMemoryChapterList", null);
        setField(term289769, term289769.getClass(), "userItemList", null);
        setField(term289769, term289769.getClass(), "userMusicItemList", null);
        setField(term289769, term289769.getClass(), "userLoginBonusList", null);
        setField(term289769, term289769.getClass(), "userEventPointList", null);
        setField(term289769, term289769.getClass(), "userMissionPointList", null);
        setField(term289769, term289769.getClass(), "userRatinglogList", null);
        setField(term289769, term289769.getClass(), "userBossList", null);
        setField(term289769, term289769.getClass(), "userTechCountList", null);
        setField(term289769, term289769.getClass(), "userScenarioList", null);
        setField(term289769, term289769.getClass(), "userTradeItemList", null);
        setField(term289769, term289769.getClass(), "userEventMusicList", null);
        setField(term289769, term289769.getClass(), "userTechEventList", null);
        setField(term289769, term289769.getClass(), "userKopList", null);
        setField(term289769, term289769.getClass(), "clientSystemInfo", null);
        setField(term289769, term289769.getClass(), "isNewMusicDetailList", null);
        setField(term289769, term289769.getClass(), "isNewCharacterList", null);
        setField(term289769, term289769.getClass(), "isNewCardList", null);
        setField(term289769, term289769.getClass(), "isNewDeckList", null);
        setField(term289769, term289769.getClass(), "isNewTrainingRoomList", null);
        setField(term289769, term289769.getClass(), "isNewStoryList", null);
        setField(term289769, term289769.getClass(), "isNewChapterList", null);
        setField(term289769, term289769.getClass(), "isNewMemoryChapterList", null);
        setField(term289769, term289769.getClass(), "isNewItemList", null);
        setField(term289769, term289769.getClass(), "isNewMusicItemList", null);
        setField(term289769, term289769.getClass(), "isNewLoginBonusList", null);
        setField(term289769, term289769.getClass(), "isNewEventPointList", null);
        setField(term289769, term289769.getClass(), "isNewMissionPointList", null);
        setField(term289769, term289769.getClass(), "isNewRatinglogList", null);
        setField(term289769, term289769.getClass(), "isNewBossList", null);
        setField(term289769, term289769.getClass(), "isNewTechCountList", null);
        setField(term289769, term289769.getClass(), "isNewScenarioList", null);
        setField(term289769, term289769.getClass(), "isNewTradeItemList", null);
        setField(term289769, term289769.getClass(), "isNewEventMusicList", null);
        setField(term289769, term289769.getClass(), "isNewTechEventList", null);
        setField(term289769, term289769.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsNewCharacterList", argTypes, term289769, args);
    }

};


