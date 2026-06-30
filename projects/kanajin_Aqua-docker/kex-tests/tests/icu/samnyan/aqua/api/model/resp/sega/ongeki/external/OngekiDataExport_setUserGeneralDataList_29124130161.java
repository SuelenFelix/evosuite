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

public class OngekiDataExport_setUserGeneralDataList_29124130161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60111;

    public OngekiDataExport_setUserGeneralDataList_29124130161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60111 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term60111, term60111.getClass(), "gameId", null);
        setField(term60111, term60111.getClass(), "userData", null);
        setField(term60111, term60111.getClass(), "userActivityList", null);
        setField(term60111, term60111.getClass(), "userCardList", null);
        setField(term60111, term60111.getClass(), "userChapterList", null);
        setField(term60111, term60111.getClass(), "userCharacterList", null);
        setField(term60111, term60111.getClass(), "userDeckList", null);
        setField(term60111, term60111.getClass(), "userEventPointList", null);
        setField(term60111, term60111.getClass(), "userGeneralDataList", null);
        setField(term60111, term60111.getClass(), "userItemList", null);
        setField(term60111, term60111.getClass(), "userLoginBonusList", null);
        setField(term60111, term60111.getClass(), "userMissionPointList", null);
        setField(term60111, term60111.getClass(), "userMusicDetailList", null);
        setField(term60111, term60111.getClass(), "userMusicItemList", null);
        setField(term60111, term60111.getClass(), "userOption", null);
        setField(term60111, term60111.getClass(), "userPlaylogList", null);
        setField(term60111, term60111.getClass(), "userStoryList", null);
        setField(term60111, term60111.getClass(), "userTrainingRoomList", null);
        setField(term60111, term60111.getClass(), "userTradeItemList", null);
        setField(term60111, term60111.getClass(), "userEventMusicList", null);
        setField(term60111, term60111.getClass(), "userTechEventList", null);
        setField(term60111, term60111.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGeneralDataList", argTypes, term60111, args);
    }

};


