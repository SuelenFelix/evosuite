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

public class OngekiDataExport_setGameId_87338424045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43182;

    public OngekiDataExport_setGameId_87338424045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43182 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term43182, term43182.getClass(), "gameId", null);
        setField(term43182, term43182.getClass(), "userData", null);
        setField(term43182, term43182.getClass(), "userActivityList", null);
        setField(term43182, term43182.getClass(), "userCardList", null);
        setField(term43182, term43182.getClass(), "userChapterList", null);
        setField(term43182, term43182.getClass(), "userCharacterList", null);
        setField(term43182, term43182.getClass(), "userDeckList", null);
        setField(term43182, term43182.getClass(), "userEventPointList", null);
        setField(term43182, term43182.getClass(), "userGeneralDataList", null);
        setField(term43182, term43182.getClass(), "userItemList", null);
        setField(term43182, term43182.getClass(), "userLoginBonusList", null);
        setField(term43182, term43182.getClass(), "userMissionPointList", null);
        setField(term43182, term43182.getClass(), "userMusicDetailList", null);
        setField(term43182, term43182.getClass(), "userMusicItemList", null);
        setField(term43182, term43182.getClass(), "userOption", null);
        setField(term43182, term43182.getClass(), "userPlaylogList", null);
        setField(term43182, term43182.getClass(), "userStoryList", null);
        setField(term43182, term43182.getClass(), "userTrainingRoomList", null);
        setField(term43182, term43182.getClass(), "userTradeItemList", null);
        setField(term43182, term43182.getClass(), "userEventMusicList", null);
        setField(term43182, term43182.getClass(), "userTechEventList", null);
        setField(term43182, term43182.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameId", argTypes, term43182, args);
    }

};


