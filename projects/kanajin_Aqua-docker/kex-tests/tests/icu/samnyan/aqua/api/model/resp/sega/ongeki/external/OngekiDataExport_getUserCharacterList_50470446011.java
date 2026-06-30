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

public class OngekiDataExport_getUserCharacterList_50470446011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11234;

    public OngekiDataExport_getUserCharacterList_50470446011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11234 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term11234, term11234.getClass(), "gameId", null);
        setField(term11234, term11234.getClass(), "userData", null);
        setField(term11234, term11234.getClass(), "userActivityList", null);
        setField(term11234, term11234.getClass(), "userCardList", null);
        setField(term11234, term11234.getClass(), "userChapterList", null);
        setField(term11234, term11234.getClass(), "userCharacterList", null);
        setField(term11234, term11234.getClass(), "userDeckList", null);
        setField(term11234, term11234.getClass(), "userEventPointList", null);
        setField(term11234, term11234.getClass(), "userGeneralDataList", null);
        setField(term11234, term11234.getClass(), "userItemList", null);
        setField(term11234, term11234.getClass(), "userLoginBonusList", null);
        setField(term11234, term11234.getClass(), "userMissionPointList", null);
        setField(term11234, term11234.getClass(), "userMusicDetailList", null);
        setField(term11234, term11234.getClass(), "userMusicItemList", null);
        setField(term11234, term11234.getClass(), "userOption", null);
        setField(term11234, term11234.getClass(), "userPlaylogList", null);
        setField(term11234, term11234.getClass(), "userStoryList", null);
        setField(term11234, term11234.getClass(), "userTrainingRoomList", null);
        setField(term11234, term11234.getClass(), "userTradeItemList", null);
        setField(term11234, term11234.getClass(), "userEventMusicList", null);
        setField(term11234, term11234.getClass(), "userTechEventList", null);
        setField(term11234, term11234.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term11234, args);
    }

};


