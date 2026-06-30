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

public class OngekiDataExport_setUserEventPointList_182616455359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58039;

    public OngekiDataExport_setUserEventPointList_182616455359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58039 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term58039, term58039.getClass(), "gameId", null);
        setField(term58039, term58039.getClass(), "userData", null);
        setField(term58039, term58039.getClass(), "userActivityList", null);
        setField(term58039, term58039.getClass(), "userCardList", null);
        setField(term58039, term58039.getClass(), "userChapterList", null);
        setField(term58039, term58039.getClass(), "userCharacterList", null);
        setField(term58039, term58039.getClass(), "userDeckList", null);
        setField(term58039, term58039.getClass(), "userEventPointList", null);
        setField(term58039, term58039.getClass(), "userGeneralDataList", null);
        setField(term58039, term58039.getClass(), "userItemList", null);
        setField(term58039, term58039.getClass(), "userLoginBonusList", null);
        setField(term58039, term58039.getClass(), "userMissionPointList", null);
        setField(term58039, term58039.getClass(), "userMusicDetailList", null);
        setField(term58039, term58039.getClass(), "userMusicItemList", null);
        setField(term58039, term58039.getClass(), "userOption", null);
        setField(term58039, term58039.getClass(), "userPlaylogList", null);
        setField(term58039, term58039.getClass(), "userStoryList", null);
        setField(term58039, term58039.getClass(), "userTrainingRoomList", null);
        setField(term58039, term58039.getClass(), "userTradeItemList", null);
        setField(term58039, term58039.getClass(), "userEventMusicList", null);
        setField(term58039, term58039.getClass(), "userTechEventList", null);
        setField(term58039, term58039.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserEventPointList", argTypes, term58039, args);
    }

};


