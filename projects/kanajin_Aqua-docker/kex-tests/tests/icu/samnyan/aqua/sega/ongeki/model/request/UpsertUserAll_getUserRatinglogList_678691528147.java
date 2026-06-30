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

public class UpsertUserAll_getUserRatinglogList_678691528147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289702;

    public UpsertUserAll_getUserRatinglogList_678691528147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289702 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll"));
        setField(term289702, term289702.getClass(), "userData", null);
        setField(term289702, term289702.getClass(), "userOption", null);
        setField(term289702, term289702.getClass(), "userPlaylogList", null);
        setField(term289702, term289702.getClass(), "userJewelboostlogList", null);
        setField(term289702, term289702.getClass(), "userSessionlogList", null);
        setField(term289702, term289702.getClass(), "userActivityList", null);
        setField(term289702, term289702.getClass(), "userRecentRatingList", null);
        setField(term289702, term289702.getClass(), "userBpBaseList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseBestNewList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseBestList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseHotList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseNextNewList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseNextList", null);
        setField(term289702, term289702.getClass(), "userRatingBaseHotNextList", null);
        setField(term289702, term289702.getClass(), "userMusicDetailList", null);
        setField(term289702, term289702.getClass(), "userCharacterList", null);
        setField(term289702, term289702.getClass(), "userCardList", null);
        setField(term289702, term289702.getClass(), "userDeckList", null);
        setField(term289702, term289702.getClass(), "userTrainingRoomList", null);
        setField(term289702, term289702.getClass(), "userStoryList", null);
        setField(term289702, term289702.getClass(), "userChapterList", null);
        setField(term289702, term289702.getClass(), "userMemoryChapterList", null);
        setField(term289702, term289702.getClass(), "userItemList", null);
        setField(term289702, term289702.getClass(), "userMusicItemList", null);
        setField(term289702, term289702.getClass(), "userLoginBonusList", null);
        setField(term289702, term289702.getClass(), "userEventPointList", null);
        setField(term289702, term289702.getClass(), "userMissionPointList", null);
        setField(term289702, term289702.getClass(), "userRatinglogList", null);
        setField(term289702, term289702.getClass(), "userBossList", null);
        setField(term289702, term289702.getClass(), "userTechCountList", null);
        setField(term289702, term289702.getClass(), "userScenarioList", null);
        setField(term289702, term289702.getClass(), "userTradeItemList", null);
        setField(term289702, term289702.getClass(), "userEventMusicList", null);
        setField(term289702, term289702.getClass(), "userTechEventList", null);
        setField(term289702, term289702.getClass(), "userKopList", null);
        setField(term289702, term289702.getClass(), "clientSystemInfo", null);
        setField(term289702, term289702.getClass(), "isNewMusicDetailList", null);
        setField(term289702, term289702.getClass(), "isNewCharacterList", null);
        setField(term289702, term289702.getClass(), "isNewCardList", null);
        setField(term289702, term289702.getClass(), "isNewDeckList", null);
        setField(term289702, term289702.getClass(), "isNewTrainingRoomList", null);
        setField(term289702, term289702.getClass(), "isNewStoryList", null);
        setField(term289702, term289702.getClass(), "isNewChapterList", null);
        setField(term289702, term289702.getClass(), "isNewMemoryChapterList", null);
        setField(term289702, term289702.getClass(), "isNewItemList", null);
        setField(term289702, term289702.getClass(), "isNewMusicItemList", null);
        setField(term289702, term289702.getClass(), "isNewLoginBonusList", null);
        setField(term289702, term289702.getClass(), "isNewEventPointList", null);
        setField(term289702, term289702.getClass(), "isNewMissionPointList", null);
        setField(term289702, term289702.getClass(), "isNewRatinglogList", null);
        setField(term289702, term289702.getClass(), "isNewBossList", null);
        setField(term289702, term289702.getClass(), "isNewTechCountList", null);
        setField(term289702, term289702.getClass(), "isNewScenarioList", null);
        setField(term289702, term289702.getClass(), "isNewTradeItemList", null);
        setField(term289702, term289702.getClass(), "isNewEventMusicList", null);
        setField(term289702, term289702.getClass(), "isNewTechEventList", null);
        setField(term289702, term289702.getClass(), "isNewKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRatinglogList", argTypes, term289702, args);
    }

};


