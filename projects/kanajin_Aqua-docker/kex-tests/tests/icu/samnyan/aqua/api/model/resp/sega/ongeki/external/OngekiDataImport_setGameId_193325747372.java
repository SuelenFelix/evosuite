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

public class OngekiDataImport_setGameId_193325747372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245624;

    public OngekiDataImport_setGameId_193325747372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245624 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245624, term245624.getClass(), "gameId", null);
        setField(term245624, term245624.getClass(), "userData", null);
        setField(term245624, term245624.getClass(), "userActivityList", null);
        setField(term245624, term245624.getClass(), "userCardList", null);
        setField(term245624, term245624.getClass(), "userChapterList", null);
        setField(term245624, term245624.getClass(), "userCharacterList", null);
        setField(term245624, term245624.getClass(), "userDeckList", null);
        setField(term245624, term245624.getClass(), "userEventPointList", null);
        setField(term245624, term245624.getClass(), "userGeneralDataList", null);
        setField(term245624, term245624.getClass(), "userItemList", null);
        setField(term245624, term245624.getClass(), "userLoginBonusList", null);
        setField(term245624, term245624.getClass(), "userMissionPointList", null);
        setField(term245624, term245624.getClass(), "userMusicDetailList", null);
        setField(term245624, term245624.getClass(), "userMusicItemList", null);
        setField(term245624, term245624.getClass(), "userOption", null);
        setField(term245624, term245624.getClass(), "userPlaylogList", null);
        setField(term245624, term245624.getClass(), "userStoryList", null);
        setField(term245624, term245624.getClass(), "userTrainingRoomList", null);
        setField(term245624, term245624.getClass(), "userTradeItemList", null);
        setField(term245624, term245624.getClass(), "userEventMusicList", null);
        setField(term245624, term245624.getClass(), "userTechEventList", null);
        setField(term245624, term245624.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameId", argTypes, term245624, args);
    }

};


