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

public class OngekiDataExport_setUserEventMusicList_147848291483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83088;

    public OngekiDataExport_setUserEventMusicList_147848291483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83088 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term83088, term83088.getClass(), "gameId", null);
        setField(term83088, term83088.getClass(), "userData", null);
        setField(term83088, term83088.getClass(), "userActivityList", null);
        setField(term83088, term83088.getClass(), "userCardList", null);
        setField(term83088, term83088.getClass(), "userChapterList", null);
        setField(term83088, term83088.getClass(), "userCharacterList", null);
        setField(term83088, term83088.getClass(), "userDeckList", null);
        setField(term83088, term83088.getClass(), "userEventPointList", null);
        setField(term83088, term83088.getClass(), "userGeneralDataList", null);
        setField(term83088, term83088.getClass(), "userItemList", null);
        setField(term83088, term83088.getClass(), "userLoginBonusList", null);
        setField(term83088, term83088.getClass(), "userMissionPointList", null);
        setField(term83088, term83088.getClass(), "userMusicDetailList", null);
        setField(term83088, term83088.getClass(), "userMusicItemList", null);
        setField(term83088, term83088.getClass(), "userOption", null);
        setField(term83088, term83088.getClass(), "userPlaylogList", null);
        setField(term83088, term83088.getClass(), "userStoryList", null);
        setField(term83088, term83088.getClass(), "userTrainingRoomList", null);
        setField(term83088, term83088.getClass(), "userTradeItemList", null);
        setField(term83088, term83088.getClass(), "userEventMusicList", null);
        setField(term83088, term83088.getClass(), "userTechEventList", null);
        setField(term83088, term83088.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserEventMusicList", argTypes, term83088, args);
    }

};


