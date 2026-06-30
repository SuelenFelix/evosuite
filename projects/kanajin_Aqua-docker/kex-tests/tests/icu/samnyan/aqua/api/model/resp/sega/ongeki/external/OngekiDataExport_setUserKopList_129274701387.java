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

public class OngekiDataExport_setUserKopList_129274701387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87343;

    public OngekiDataExport_setUserKopList_129274701387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87343 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term87343, term87343.getClass(), "gameId", null);
        setField(term87343, term87343.getClass(), "userData", null);
        setField(term87343, term87343.getClass(), "userActivityList", null);
        setField(term87343, term87343.getClass(), "userCardList", null);
        setField(term87343, term87343.getClass(), "userChapterList", null);
        setField(term87343, term87343.getClass(), "userCharacterList", null);
        setField(term87343, term87343.getClass(), "userDeckList", null);
        setField(term87343, term87343.getClass(), "userEventPointList", null);
        setField(term87343, term87343.getClass(), "userGeneralDataList", null);
        setField(term87343, term87343.getClass(), "userItemList", null);
        setField(term87343, term87343.getClass(), "userLoginBonusList", null);
        setField(term87343, term87343.getClass(), "userMissionPointList", null);
        setField(term87343, term87343.getClass(), "userMusicDetailList", null);
        setField(term87343, term87343.getClass(), "userMusicItemList", null);
        setField(term87343, term87343.getClass(), "userOption", null);
        setField(term87343, term87343.getClass(), "userPlaylogList", null);
        setField(term87343, term87343.getClass(), "userStoryList", null);
        setField(term87343, term87343.getClass(), "userTrainingRoomList", null);
        setField(term87343, term87343.getClass(), "userTradeItemList", null);
        setField(term87343, term87343.getClass(), "userEventMusicList", null);
        setField(term87343, term87343.getClass(), "userTechEventList", null);
        setField(term87343, term87343.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserKopList", argTypes, term87343, args);
    }

};


