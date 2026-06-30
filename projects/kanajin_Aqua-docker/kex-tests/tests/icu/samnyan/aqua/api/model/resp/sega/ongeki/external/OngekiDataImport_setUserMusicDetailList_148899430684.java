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

public class OngekiDataImport_setUserMusicDetailList_148899430684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245636;

    public OngekiDataImport_setUserMusicDetailList_148899430684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245636 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245636, term245636.getClass(), "gameId", null);
        setField(term245636, term245636.getClass(), "userData", null);
        setField(term245636, term245636.getClass(), "userActivityList", null);
        setField(term245636, term245636.getClass(), "userCardList", null);
        setField(term245636, term245636.getClass(), "userChapterList", null);
        setField(term245636, term245636.getClass(), "userCharacterList", null);
        setField(term245636, term245636.getClass(), "userDeckList", null);
        setField(term245636, term245636.getClass(), "userEventPointList", null);
        setField(term245636, term245636.getClass(), "userGeneralDataList", null);
        setField(term245636, term245636.getClass(), "userItemList", null);
        setField(term245636, term245636.getClass(), "userLoginBonusList", null);
        setField(term245636, term245636.getClass(), "userMissionPointList", null);
        setField(term245636, term245636.getClass(), "userMusicDetailList", null);
        setField(term245636, term245636.getClass(), "userMusicItemList", null);
        setField(term245636, term245636.getClass(), "userOption", null);
        setField(term245636, term245636.getClass(), "userPlaylogList", null);
        setField(term245636, term245636.getClass(), "userStoryList", null);
        setField(term245636, term245636.getClass(), "userTrainingRoomList", null);
        setField(term245636, term245636.getClass(), "userTradeItemList", null);
        setField(term245636, term245636.getClass(), "userEventMusicList", null);
        setField(term245636, term245636.getClass(), "userTechEventList", null);
        setField(term245636, term245636.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMusicDetailList", argTypes, term245636, args);
    }

};


