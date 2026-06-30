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

public class OngekiDataImport_setUserChapterList_44532267776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245628;

    public OngekiDataImport_setUserChapterList_44532267776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245628 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245628, term245628.getClass(), "gameId", null);
        setField(term245628, term245628.getClass(), "userData", null);
        setField(term245628, term245628.getClass(), "userActivityList", null);
        setField(term245628, term245628.getClass(), "userCardList", null);
        setField(term245628, term245628.getClass(), "userChapterList", null);
        setField(term245628, term245628.getClass(), "userCharacterList", null);
        setField(term245628, term245628.getClass(), "userDeckList", null);
        setField(term245628, term245628.getClass(), "userEventPointList", null);
        setField(term245628, term245628.getClass(), "userGeneralDataList", null);
        setField(term245628, term245628.getClass(), "userItemList", null);
        setField(term245628, term245628.getClass(), "userLoginBonusList", null);
        setField(term245628, term245628.getClass(), "userMissionPointList", null);
        setField(term245628, term245628.getClass(), "userMusicDetailList", null);
        setField(term245628, term245628.getClass(), "userMusicItemList", null);
        setField(term245628, term245628.getClass(), "userOption", null);
        setField(term245628, term245628.getClass(), "userPlaylogList", null);
        setField(term245628, term245628.getClass(), "userStoryList", null);
        setField(term245628, term245628.getClass(), "userTrainingRoomList", null);
        setField(term245628, term245628.getClass(), "userTradeItemList", null);
        setField(term245628, term245628.getClass(), "userEventMusicList", null);
        setField(term245628, term245628.getClass(), "userTechEventList", null);
        setField(term245628, term245628.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChapterList", argTypes, term245628, args);
    }

};


