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

public class OngekiDataExport_setUserTradeItemList_57871809681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80722;

    public OngekiDataExport_setUserTradeItemList_57871809681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80722 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term80722, term80722.getClass(), "gameId", null);
        setField(term80722, term80722.getClass(), "userData", null);
        setField(term80722, term80722.getClass(), "userActivityList", null);
        setField(term80722, term80722.getClass(), "userCardList", null);
        setField(term80722, term80722.getClass(), "userChapterList", null);
        setField(term80722, term80722.getClass(), "userCharacterList", null);
        setField(term80722, term80722.getClass(), "userDeckList", null);
        setField(term80722, term80722.getClass(), "userEventPointList", null);
        setField(term80722, term80722.getClass(), "userGeneralDataList", null);
        setField(term80722, term80722.getClass(), "userItemList", null);
        setField(term80722, term80722.getClass(), "userLoginBonusList", null);
        setField(term80722, term80722.getClass(), "userMissionPointList", null);
        setField(term80722, term80722.getClass(), "userMusicDetailList", null);
        setField(term80722, term80722.getClass(), "userMusicItemList", null);
        setField(term80722, term80722.getClass(), "userOption", null);
        setField(term80722, term80722.getClass(), "userPlaylogList", null);
        setField(term80722, term80722.getClass(), "userStoryList", null);
        setField(term80722, term80722.getClass(), "userTrainingRoomList", null);
        setField(term80722, term80722.getClass(), "userTradeItemList", null);
        setField(term80722, term80722.getClass(), "userEventMusicList", null);
        setField(term80722, term80722.getClass(), "userTechEventList", null);
        setField(term80722, term80722.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserTradeItemList", argTypes, term80722, args);
    }

};


