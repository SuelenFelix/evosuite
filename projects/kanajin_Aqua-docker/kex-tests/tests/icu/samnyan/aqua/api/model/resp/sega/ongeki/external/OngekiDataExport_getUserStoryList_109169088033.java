package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OngekiDataExport_getUserStoryList_109169088033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31505;

    public OngekiDataExport_getUserStoryList_109169088033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31505 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term31505, term31505.getClass(), "gameId", null);
        setField(term31505, term31505.getClass(), "userData", null);
        setField(term31505, term31505.getClass(), "userActivityList", null);
        setField(term31505, term31505.getClass(), "userCardList", null);
        setField(term31505, term31505.getClass(), "userChapterList", null);
        setField(term31505, term31505.getClass(), "userCharacterList", null);
        setField(term31505, term31505.getClass(), "userDeckList", null);
        setField(term31505, term31505.getClass(), "userEventPointList", null);
        setField(term31505, term31505.getClass(), "userGeneralDataList", null);
        setField(term31505, term31505.getClass(), "userItemList", null);
        setField(term31505, term31505.getClass(), "userLoginBonusList", null);
        setField(term31505, term31505.getClass(), "userMissionPointList", null);
        setField(term31505, term31505.getClass(), "userMusicDetailList", null);
        setField(term31505, term31505.getClass(), "userMusicItemList", null);
        setField(term31505, term31505.getClass(), "userOption", null);
        setField(term31505, term31505.getClass(), "userPlaylogList", null);
        setField(term31505, term31505.getClass(), "userStoryList", null);
        setField(term31505, term31505.getClass(), "userTrainingRoomList", null);
        setField(term31505, term31505.getClass(), "userTradeItemList", null);
        setField(term31505, term31505.getClass(), "userEventMusicList", null);
        setField(term31505, term31505.getClass(), "userTechEventList", null);
        setField(term31505, term31505.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserStoryList", argTypes, term31505, args);
    }

};


