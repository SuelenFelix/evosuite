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

public class UpsertUserAll_setUserRatingBaseBestList_1648181781186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289741;

    public UpsertUserAll_setUserRatingBaseBestList_1648181781186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289741 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289741, term289741.getClass(), "userData", null);
        setField(term289741, term289741.getClass(), "userOption", null);
        setField(term289741, term289741.getClass(), "userPlaylogList", null);
        setField(term289741, term289741.getClass(), "userJewelboostlogList", null);
        setField(term289741, term289741.getClass(), "userSessionlogList", null);
        setField(term289741, term289741.getClass(), "userActivityList", null);
        setField(term289741, term289741.getClass(), "userRecentRatingList", null);
        setField(term289741, term289741.getClass(), "userBpBaseList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseBestNewList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseBestList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseHotList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseNextNewList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseNextList", null);
        setField(term289741, term289741.getClass(), "userRatingBaseHotNextList", null);
        setField(term289741, term289741.getClass(), "userMusicDetailList", null);
        setField(term289741, term289741.getClass(), "userCharacterList", null);
        setField(term289741, term289741.getClass(), "userCardList", null);
        setField(term289741, term289741.getClass(), "userDeckList", null);
        setField(term289741, term289741.getClass(), "userTrainingRoomList", null);
        setField(term289741, term289741.getClass(), "userStoryList", null);
        setField(term289741, term289741.getClass(), "userChapterList", null);
        setField(term289741, term289741.getClass(), "userMemoryChapterList", null);
        setField(term289741, term289741.getClass(), "userItemList", null);
        setField(term289741, term289741.getClass(), "userMusicItemList", null);
        setField(term289741, term289741.getClass(), "userLoginBonusList", null);
        setField(term289741, term289741.getClass(), "userEventPointList", null);
        setField(term289741, term289741.getClass(), "userMissionPointList", null);
        setField(term289741, term289741.getClass(), "userRatinglogList", null);
        setField(term289741, term289741.getClass(), "userBossList", null);
        setField(term289741, term289741.getClass(), "userTechCountList", null);
        setField(term289741, term289741.getClass(), "userScenarioList", null);
        setField(term289741, term289741.getClass(), "userTradeItemList", null);
        setField(term289741, term289741.getClass(), "userEventMusicList", null);
        setField(term289741, term289741.getClass(), "userTechEventList", null);
        setField(term289741, term289741.getClass(), "userKopList", null);
        setField(term289741, term289741.getClass(), "clientSystemInfo", null);
        setField(term289741, term289741.getClass(), "isNewMusicDetailList", null);
        setField(term289741, term289741.getClass(), "isNewCharacterList", null);
        setField(term289741, term289741.getClass(), "isNewCardList", null);
        setField(term289741, term289741.getClass(), "isNewDeckList", null);
        setField(term289741, term289741.getClass(), "isNewTrainingRoomList", null);
        setField(term289741, term289741.getClass(), "isNewStoryList", null);
        setField(term289741, term289741.getClass(), "isNewChapterList", null);
        setField(term289741, term289741.getClass(), "isNewMemoryChapterList", null);
        setField(term289741, term289741.getClass(), "isNewItemList", null);
        setField(term289741, term289741.getClass(), "isNewMusicItemList", null);
        setField(term289741, term289741.getClass(), "isNewLoginBonusList", null);
        setField(term289741, term289741.getClass(), "isNewEventPointList", null);
        setField(term289741, term289741.getClass(), "isNewMissionPointList", null);
        setField(term289741, term289741.getClass(), "isNewRatinglogList", null);
        setField(term289741, term289741.getClass(), "isNewBossList", null);
        setField(term289741, term289741.getClass(), "isNewTechCountList", null);
        setField(term289741, term289741.getClass(), "isNewScenarioList", null);
        setField(term289741, term289741.getClass(), "isNewTradeItemList", null);
        setField(term289741, term289741.getClass(), "isNewEventMusicList", null);
        setField(term289741, term289741.getClass(), "isNewTechEventList", null);
        setField(term289741, term289741.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserRatingBaseBestList", argTypes, term289741, args);
    }

};


