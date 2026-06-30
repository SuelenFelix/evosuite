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

public class OngekiDataExport_setUserDeckList_200216687657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56186;

    public OngekiDataExport_setUserDeckList_200216687657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56186 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term56186, term56186.getClass(), "gameId", null);
        setField(term56186, term56186.getClass(), "userData", null);
        setField(term56186, term56186.getClass(), "userActivityList", null);
        setField(term56186, term56186.getClass(), "userCardList", null);
        setField(term56186, term56186.getClass(), "userChapterList", null);
        setField(term56186, term56186.getClass(), "userCharacterList", null);
        setField(term56186, term56186.getClass(), "userDeckList", null);
        setField(term56186, term56186.getClass(), "userEventPointList", null);
        setField(term56186, term56186.getClass(), "userGeneralDataList", null);
        setField(term56186, term56186.getClass(), "userItemList", null);
        setField(term56186, term56186.getClass(), "userLoginBonusList", null);
        setField(term56186, term56186.getClass(), "userMissionPointList", null);
        setField(term56186, term56186.getClass(), "userMusicDetailList", null);
        setField(term56186, term56186.getClass(), "userMusicItemList", null);
        setField(term56186, term56186.getClass(), "userOption", null);
        setField(term56186, term56186.getClass(), "userPlaylogList", null);
        setField(term56186, term56186.getClass(), "userStoryList", null);
        setField(term56186, term56186.getClass(), "userTrainingRoomList", null);
        setField(term56186, term56186.getClass(), "userTradeItemList", null);
        setField(term56186, term56186.getClass(), "userEventMusicList", null);
        setField(term56186, term56186.getClass(), "userTechEventList", null);
        setField(term56186, term56186.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserDeckList", argTypes, term56186, args);
    }

};


