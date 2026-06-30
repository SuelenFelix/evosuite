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

public class OngekiDataExport_getUserOption_88567059429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28464;

    public OngekiDataExport_getUserOption_88567059429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28464 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term28464, term28464.getClass(), "gameId", null);
        setField(term28464, term28464.getClass(), "userData", null);
        setField(term28464, term28464.getClass(), "userActivityList", null);
        setField(term28464, term28464.getClass(), "userCardList", null);
        setField(term28464, term28464.getClass(), "userChapterList", null);
        setField(term28464, term28464.getClass(), "userCharacterList", null);
        setField(term28464, term28464.getClass(), "userDeckList", null);
        setField(term28464, term28464.getClass(), "userEventPointList", null);
        setField(term28464, term28464.getClass(), "userGeneralDataList", null);
        setField(term28464, term28464.getClass(), "userItemList", null);
        setField(term28464, term28464.getClass(), "userLoginBonusList", null);
        setField(term28464, term28464.getClass(), "userMissionPointList", null);
        setField(term28464, term28464.getClass(), "userMusicDetailList", null);
        setField(term28464, term28464.getClass(), "userMusicItemList", null);
        setField(term28464, term28464.getClass(), "userOption", null);
        setField(term28464, term28464.getClass(), "userPlaylogList", null);
        setField(term28464, term28464.getClass(), "userStoryList", null);
        setField(term28464, term28464.getClass(), "userTrainingRoomList", null);
        setField(term28464, term28464.getClass(), "userTradeItemList", null);
        setField(term28464, term28464.getClass(), "userEventMusicList", null);
        setField(term28464, term28464.getClass(), "userTechEventList", null);
        setField(term28464, term28464.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserOption", argTypes, term28464, args);
    }

};


