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

public class OngekiDataExport_setUserChapterList_150519591053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52110;

    public OngekiDataExport_setUserChapterList_150519591053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52110 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term52110, term52110.getClass(), "gameId", null);
        setField(term52110, term52110.getClass(), "userData", null);
        setField(term52110, term52110.getClass(), "userActivityList", null);
        setField(term52110, term52110.getClass(), "userCardList", null);
        setField(term52110, term52110.getClass(), "userChapterList", null);
        setField(term52110, term52110.getClass(), "userCharacterList", null);
        setField(term52110, term52110.getClass(), "userDeckList", null);
        setField(term52110, term52110.getClass(), "userEventPointList", null);
        setField(term52110, term52110.getClass(), "userGeneralDataList", null);
        setField(term52110, term52110.getClass(), "userItemList", null);
        setField(term52110, term52110.getClass(), "userLoginBonusList", null);
        setField(term52110, term52110.getClass(), "userMissionPointList", null);
        setField(term52110, term52110.getClass(), "userMusicDetailList", null);
        setField(term52110, term52110.getClass(), "userMusicItemList", null);
        setField(term52110, term52110.getClass(), "userOption", null);
        setField(term52110, term52110.getClass(), "userPlaylogList", null);
        setField(term52110, term52110.getClass(), "userStoryList", null);
        setField(term52110, term52110.getClass(), "userTrainingRoomList", null);
        setField(term52110, term52110.getClass(), "userTradeItemList", null);
        setField(term52110, term52110.getClass(), "userEventMusicList", null);
        setField(term52110, term52110.getClass(), "userTechEventList", null);
        setField(term52110, term52110.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChapterList", argTypes, term52110, args);
    }

};


