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

public class OngekiDataExport_getGameId_15756692401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843;

    public OngekiDataExport_getGameId_15756692401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term1843, term1843.getClass(), "gameId", null);
        setField(term1843, term1843.getClass(), "userData", null);
        setField(term1843, term1843.getClass(), "userActivityList", null);
        setField(term1843, term1843.getClass(), "userCardList", null);
        setField(term1843, term1843.getClass(), "userChapterList", null);
        setField(term1843, term1843.getClass(), "userCharacterList", null);
        setField(term1843, term1843.getClass(), "userDeckList", null);
        setField(term1843, term1843.getClass(), "userEventPointList", null);
        setField(term1843, term1843.getClass(), "userGeneralDataList", null);
        setField(term1843, term1843.getClass(), "userItemList", null);
        setField(term1843, term1843.getClass(), "userLoginBonusList", null);
        setField(term1843, term1843.getClass(), "userMissionPointList", null);
        setField(term1843, term1843.getClass(), "userMusicDetailList", null);
        setField(term1843, term1843.getClass(), "userMusicItemList", null);
        setField(term1843, term1843.getClass(), "userOption", null);
        setField(term1843, term1843.getClass(), "userPlaylogList", null);
        setField(term1843, term1843.getClass(), "userStoryList", null);
        setField(term1843, term1843.getClass(), "userTrainingRoomList", null);
        setField(term1843, term1843.getClass(), "userTradeItemList", null);
        setField(term1843, term1843.getClass(), "userEventMusicList", null);
        setField(term1843, term1843.getClass(), "userTechEventList", null);
        setField(term1843, term1843.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameId", argTypes, term1843, args);
    }

};


