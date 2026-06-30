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

public class OngekiDataImport_getUserTrainingRoomList_212824414567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245619;

    public OngekiDataImport_getUserTrainingRoomList_212824414567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245619 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245619, term245619.getClass(), "gameId", null);
        setField(term245619, term245619.getClass(), "userData", null);
        setField(term245619, term245619.getClass(), "userActivityList", null);
        setField(term245619, term245619.getClass(), "userCardList", null);
        setField(term245619, term245619.getClass(), "userChapterList", null);
        setField(term245619, term245619.getClass(), "userCharacterList", null);
        setField(term245619, term245619.getClass(), "userDeckList", null);
        setField(term245619, term245619.getClass(), "userEventPointList", null);
        setField(term245619, term245619.getClass(), "userGeneralDataList", null);
        setField(term245619, term245619.getClass(), "userItemList", null);
        setField(term245619, term245619.getClass(), "userLoginBonusList", null);
        setField(term245619, term245619.getClass(), "userMissionPointList", null);
        setField(term245619, term245619.getClass(), "userMusicDetailList", null);
        setField(term245619, term245619.getClass(), "userMusicItemList", null);
        setField(term245619, term245619.getClass(), "userOption", null);
        setField(term245619, term245619.getClass(), "userPlaylogList", null);
        setField(term245619, term245619.getClass(), "userStoryList", null);
        setField(term245619, term245619.getClass(), "userTrainingRoomList", null);
        setField(term245619, term245619.getClass(), "userTradeItemList", null);
        setField(term245619, term245619.getClass(), "userEventMusicList", null);
        setField(term245619, term245619.getClass(), "userTechEventList", null);
        setField(term245619, term245619.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserTrainingRoomList", argTypes, term245619, args);
    }

};


