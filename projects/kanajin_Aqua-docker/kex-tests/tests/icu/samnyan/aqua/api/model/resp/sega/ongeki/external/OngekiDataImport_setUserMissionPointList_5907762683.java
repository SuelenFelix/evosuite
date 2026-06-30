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

public class OngekiDataImport_setUserMissionPointList_5907762683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245635;

    public OngekiDataImport_setUserMissionPointList_5907762683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245635 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245635, term245635.getClass(), "gameId", null);
        setField(term245635, term245635.getClass(), "userData", null);
        setField(term245635, term245635.getClass(), "userActivityList", null);
        setField(term245635, term245635.getClass(), "userCardList", null);
        setField(term245635, term245635.getClass(), "userChapterList", null);
        setField(term245635, term245635.getClass(), "userCharacterList", null);
        setField(term245635, term245635.getClass(), "userDeckList", null);
        setField(term245635, term245635.getClass(), "userEventPointList", null);
        setField(term245635, term245635.getClass(), "userGeneralDataList", null);
        setField(term245635, term245635.getClass(), "userItemList", null);
        setField(term245635, term245635.getClass(), "userLoginBonusList", null);
        setField(term245635, term245635.getClass(), "userMissionPointList", null);
        setField(term245635, term245635.getClass(), "userMusicDetailList", null);
        setField(term245635, term245635.getClass(), "userMusicItemList", null);
        setField(term245635, term245635.getClass(), "userOption", null);
        setField(term245635, term245635.getClass(), "userPlaylogList", null);
        setField(term245635, term245635.getClass(), "userStoryList", null);
        setField(term245635, term245635.getClass(), "userTrainingRoomList", null);
        setField(term245635, term245635.getClass(), "userTradeItemList", null);
        setField(term245635, term245635.getClass(), "userEventMusicList", null);
        setField(term245635, term245635.getClass(), "userTechEventList", null);
        setField(term245635, term245635.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMissionPointList", argTypes, term245635, args);
    }

};


