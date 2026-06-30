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

public class UpsertUserAll_getUserRatingBaseNextList_1352741812132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289687;

    public UpsertUserAll_getUserRatingBaseNextList_1352741812132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289687 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289687, term289687.getClass(), "userData", null);
        setField(term289687, term289687.getClass(), "userOption", null);
        setField(term289687, term289687.getClass(), "userPlaylogList", null);
        setField(term289687, term289687.getClass(), "userJewelboostlogList", null);
        setField(term289687, term289687.getClass(), "userSessionlogList", null);
        setField(term289687, term289687.getClass(), "userActivityList", null);
        setField(term289687, term289687.getClass(), "userRecentRatingList", null);
        setField(term289687, term289687.getClass(), "userBpBaseList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseBestNewList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseBestList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseHotList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseNextNewList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseNextList", null);
        setField(term289687, term289687.getClass(), "userRatingBaseHotNextList", null);
        setField(term289687, term289687.getClass(), "userMusicDetailList", null);
        setField(term289687, term289687.getClass(), "userCharacterList", null);
        setField(term289687, term289687.getClass(), "userCardList", null);
        setField(term289687, term289687.getClass(), "userDeckList", null);
        setField(term289687, term289687.getClass(), "userTrainingRoomList", null);
        setField(term289687, term289687.getClass(), "userStoryList", null);
        setField(term289687, term289687.getClass(), "userChapterList", null);
        setField(term289687, term289687.getClass(), "userMemoryChapterList", null);
        setField(term289687, term289687.getClass(), "userItemList", null);
        setField(term289687, term289687.getClass(), "userMusicItemList", null);
        setField(term289687, term289687.getClass(), "userLoginBonusList", null);
        setField(term289687, term289687.getClass(), "userEventPointList", null);
        setField(term289687, term289687.getClass(), "userMissionPointList", null);
        setField(term289687, term289687.getClass(), "userRatinglogList", null);
        setField(term289687, term289687.getClass(), "userBossList", null);
        setField(term289687, term289687.getClass(), "userTechCountList", null);
        setField(term289687, term289687.getClass(), "userScenarioList", null);
        setField(term289687, term289687.getClass(), "userTradeItemList", null);
        setField(term289687, term289687.getClass(), "userEventMusicList", null);
        setField(term289687, term289687.getClass(), "userTechEventList", null);
        setField(term289687, term289687.getClass(), "userKopList", null);
        setField(term289687, term289687.getClass(), "clientSystemInfo", null);
        setField(term289687, term289687.getClass(), "isNewMusicDetailList", null);
        setField(term289687, term289687.getClass(), "isNewCharacterList", null);
        setField(term289687, term289687.getClass(), "isNewCardList", null);
        setField(term289687, term289687.getClass(), "isNewDeckList", null);
        setField(term289687, term289687.getClass(), "isNewTrainingRoomList", null);
        setField(term289687, term289687.getClass(), "isNewStoryList", null);
        setField(term289687, term289687.getClass(), "isNewChapterList", null);
        setField(term289687, term289687.getClass(), "isNewMemoryChapterList", null);
        setField(term289687, term289687.getClass(), "isNewItemList", null);
        setField(term289687, term289687.getClass(), "isNewMusicItemList", null);
        setField(term289687, term289687.getClass(), "isNewLoginBonusList", null);
        setField(term289687, term289687.getClass(), "isNewEventPointList", null);
        setField(term289687, term289687.getClass(), "isNewMissionPointList", null);
        setField(term289687, term289687.getClass(), "isNewRatinglogList", null);
        setField(term289687, term289687.getClass(), "isNewBossList", null);
        setField(term289687, term289687.getClass(), "isNewTechCountList", null);
        setField(term289687, term289687.getClass(), "isNewScenarioList", null);
        setField(term289687, term289687.getClass(), "isNewTradeItemList", null);
        setField(term289687, term289687.getClass(), "isNewEventMusicList", null);
        setField(term289687, term289687.getClass(), "isNewTechEventList", null);
        setField(term289687, term289687.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRatingBaseNextList", argTypes, term289687, args);
    }

};


