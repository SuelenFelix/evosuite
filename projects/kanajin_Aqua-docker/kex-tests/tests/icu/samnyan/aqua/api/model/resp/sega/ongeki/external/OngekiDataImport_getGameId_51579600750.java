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

public class OngekiDataImport_getGameId_51579600750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245602;

    public OngekiDataImport_getGameId_51579600750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245602 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245602, term245602.getClass(), "gameId", null);
        setField(term245602, term245602.getClass(), "userData", null);
        setField(term245602, term245602.getClass(), "userActivityList", null);
        setField(term245602, term245602.getClass(), "userCardList", null);
        setField(term245602, term245602.getClass(), "userChapterList", null);
        setField(term245602, term245602.getClass(), "userCharacterList", null);
        setField(term245602, term245602.getClass(), "userDeckList", null);
        setField(term245602, term245602.getClass(), "userEventPointList", null);
        setField(term245602, term245602.getClass(), "userGeneralDataList", null);
        setField(term245602, term245602.getClass(), "userItemList", null);
        setField(term245602, term245602.getClass(), "userLoginBonusList", null);
        setField(term245602, term245602.getClass(), "userMissionPointList", null);
        setField(term245602, term245602.getClass(), "userMusicDetailList", null);
        setField(term245602, term245602.getClass(), "userMusicItemList", null);
        setField(term245602, term245602.getClass(), "userOption", null);
        setField(term245602, term245602.getClass(), "userPlaylogList", null);
        setField(term245602, term245602.getClass(), "userStoryList", null);
        setField(term245602, term245602.getClass(), "userTrainingRoomList", null);
        setField(term245602, term245602.getClass(), "userTradeItemList", null);
        setField(term245602, term245602.getClass(), "userEventMusicList", null);
        setField(term245602, term245602.getClass(), "userTechEventList", null);
        setField(term245602, term245602.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameId", argTypes, term245602, args);
    }

};


