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

public class UpsertUserAll_getUserCharacterList_893385126135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289690;

    public UpsertUserAll_getUserCharacterList_893385126135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289690 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289690, term289690.getClass(), "userData", null);
        setField(term289690, term289690.getClass(), "userOption", null);
        setField(term289690, term289690.getClass(), "userPlaylogList", null);
        setField(term289690, term289690.getClass(), "userJewelboostlogList", null);
        setField(term289690, term289690.getClass(), "userSessionlogList", null);
        setField(term289690, term289690.getClass(), "userActivityList", null);
        setField(term289690, term289690.getClass(), "userRecentRatingList", null);
        setField(term289690, term289690.getClass(), "userBpBaseList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseBestNewList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseBestList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseHotList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseNextNewList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseNextList", null);
        setField(term289690, term289690.getClass(), "userRatingBaseHotNextList", null);
        setField(term289690, term289690.getClass(), "userMusicDetailList", null);
        setField(term289690, term289690.getClass(), "userCharacterList", null);
        setField(term289690, term289690.getClass(), "userCardList", null);
        setField(term289690, term289690.getClass(), "userDeckList", null);
        setField(term289690, term289690.getClass(), "userTrainingRoomList", null);
        setField(term289690, term289690.getClass(), "userStoryList", null);
        setField(term289690, term289690.getClass(), "userChapterList", null);
        setField(term289690, term289690.getClass(), "userMemoryChapterList", null);
        setField(term289690, term289690.getClass(), "userItemList", null);
        setField(term289690, term289690.getClass(), "userMusicItemList", null);
        setField(term289690, term289690.getClass(), "userLoginBonusList", null);
        setField(term289690, term289690.getClass(), "userEventPointList", null);
        setField(term289690, term289690.getClass(), "userMissionPointList", null);
        setField(term289690, term289690.getClass(), "userRatinglogList", null);
        setField(term289690, term289690.getClass(), "userBossList", null);
        setField(term289690, term289690.getClass(), "userTechCountList", null);
        setField(term289690, term289690.getClass(), "userScenarioList", null);
        setField(term289690, term289690.getClass(), "userTradeItemList", null);
        setField(term289690, term289690.getClass(), "userEventMusicList", null);
        setField(term289690, term289690.getClass(), "userTechEventList", null);
        setField(term289690, term289690.getClass(), "userKopList", null);
        setField(term289690, term289690.getClass(), "clientSystemInfo", null);
        setField(term289690, term289690.getClass(), "isNewMusicDetailList", null);
        setField(term289690, term289690.getClass(), "isNewCharacterList", null);
        setField(term289690, term289690.getClass(), "isNewCardList", null);
        setField(term289690, term289690.getClass(), "isNewDeckList", null);
        setField(term289690, term289690.getClass(), "isNewTrainingRoomList", null);
        setField(term289690, term289690.getClass(), "isNewStoryList", null);
        setField(term289690, term289690.getClass(), "isNewChapterList", null);
        setField(term289690, term289690.getClass(), "isNewMemoryChapterList", null);
        setField(term289690, term289690.getClass(), "isNewItemList", null);
        setField(term289690, term289690.getClass(), "isNewMusicItemList", null);
        setField(term289690, term289690.getClass(), "isNewLoginBonusList", null);
        setField(term289690, term289690.getClass(), "isNewEventPointList", null);
        setField(term289690, term289690.getClass(), "isNewMissionPointList", null);
        setField(term289690, term289690.getClass(), "isNewRatinglogList", null);
        setField(term289690, term289690.getClass(), "isNewBossList", null);
        setField(term289690, term289690.getClass(), "isNewTechCountList", null);
        setField(term289690, term289690.getClass(), "isNewScenarioList", null);
        setField(term289690, term289690.getClass(), "isNewTradeItemList", null);
        setField(term289690, term289690.getClass(), "isNewEventMusicList", null);
        setField(term289690, term289690.getClass(), "isNewTechEventList", null);
        setField(term289690, term289690.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term289690, args);
    }

};


