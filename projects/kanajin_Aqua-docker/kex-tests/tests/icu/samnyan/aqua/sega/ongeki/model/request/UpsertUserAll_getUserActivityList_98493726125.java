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

public class UpsertUserAll_getUserActivityList_98493726125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289680;

    public UpsertUserAll_getUserActivityList_98493726125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289680 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289680, term289680.getClass(), "userData", null);
        setField(term289680, term289680.getClass(), "userOption", null);
        setField(term289680, term289680.getClass(), "userPlaylogList", null);
        setField(term289680, term289680.getClass(), "userJewelboostlogList", null);
        setField(term289680, term289680.getClass(), "userSessionlogList", null);
        setField(term289680, term289680.getClass(), "userActivityList", null);
        setField(term289680, term289680.getClass(), "userRecentRatingList", null);
        setField(term289680, term289680.getClass(), "userBpBaseList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseBestNewList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseBestList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseHotList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseNextNewList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseNextList", null);
        setField(term289680, term289680.getClass(), "userRatingBaseHotNextList", null);
        setField(term289680, term289680.getClass(), "userMusicDetailList", null);
        setField(term289680, term289680.getClass(), "userCharacterList", null);
        setField(term289680, term289680.getClass(), "userCardList", null);
        setField(term289680, term289680.getClass(), "userDeckList", null);
        setField(term289680, term289680.getClass(), "userTrainingRoomList", null);
        setField(term289680, term289680.getClass(), "userStoryList", null);
        setField(term289680, term289680.getClass(), "userChapterList", null);
        setField(term289680, term289680.getClass(), "userMemoryChapterList", null);
        setField(term289680, term289680.getClass(), "userItemList", null);
        setField(term289680, term289680.getClass(), "userMusicItemList", null);
        setField(term289680, term289680.getClass(), "userLoginBonusList", null);
        setField(term289680, term289680.getClass(), "userEventPointList", null);
        setField(term289680, term289680.getClass(), "userMissionPointList", null);
        setField(term289680, term289680.getClass(), "userRatinglogList", null);
        setField(term289680, term289680.getClass(), "userBossList", null);
        setField(term289680, term289680.getClass(), "userTechCountList", null);
        setField(term289680, term289680.getClass(), "userScenarioList", null);
        setField(term289680, term289680.getClass(), "userTradeItemList", null);
        setField(term289680, term289680.getClass(), "userEventMusicList", null);
        setField(term289680, term289680.getClass(), "userTechEventList", null);
        setField(term289680, term289680.getClass(), "userKopList", null);
        setField(term289680, term289680.getClass(), "clientSystemInfo", null);
        setField(term289680, term289680.getClass(), "isNewMusicDetailList", null);
        setField(term289680, term289680.getClass(), "isNewCharacterList", null);
        setField(term289680, term289680.getClass(), "isNewCardList", null);
        setField(term289680, term289680.getClass(), "isNewDeckList", null);
        setField(term289680, term289680.getClass(), "isNewTrainingRoomList", null);
        setField(term289680, term289680.getClass(), "isNewStoryList", null);
        setField(term289680, term289680.getClass(), "isNewChapterList", null);
        setField(term289680, term289680.getClass(), "isNewMemoryChapterList", null);
        setField(term289680, term289680.getClass(), "isNewItemList", null);
        setField(term289680, term289680.getClass(), "isNewMusicItemList", null);
        setField(term289680, term289680.getClass(), "isNewLoginBonusList", null);
        setField(term289680, term289680.getClass(), "isNewEventPointList", null);
        setField(term289680, term289680.getClass(), "isNewMissionPointList", null);
        setField(term289680, term289680.getClass(), "isNewRatinglogList", null);
        setField(term289680, term289680.getClass(), "isNewBossList", null);
        setField(term289680, term289680.getClass(), "isNewTechCountList", null);
        setField(term289680, term289680.getClass(), "isNewScenarioList", null);
        setField(term289680, term289680.getClass(), "isNewTradeItemList", null);
        setField(term289680, term289680.getClass(), "isNewEventMusicList", null);
        setField(term289680, term289680.getClass(), "isNewTechEventList", null);
        setField(term289680, term289680.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserActivityList", argTypes, term289680, args);
    }

};


