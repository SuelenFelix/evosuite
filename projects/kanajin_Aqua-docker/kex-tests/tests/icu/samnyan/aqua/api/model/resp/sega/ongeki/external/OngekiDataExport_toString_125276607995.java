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

public class OngekiDataExport_toString_125276607995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94385;

    public OngekiDataExport_toString_125276607995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94385 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term94385, term94385.getClass(), "gameId", null);
        setField(term94385, term94385.getClass(), "userData", null);
        setField(term94385, term94385.getClass(), "userActivityList", null);
        setField(term94385, term94385.getClass(), "userCardList", null);
        setField(term94385, term94385.getClass(), "userChapterList", null);
        setField(term94385, term94385.getClass(), "userCharacterList", null);
        setField(term94385, term94385.getClass(), "userDeckList", null);
        setField(term94385, term94385.getClass(), "userEventPointList", null);
        setField(term94385, term94385.getClass(), "userGeneralDataList", null);
        setField(term94385, term94385.getClass(), "userItemList", null);
        setField(term94385, term94385.getClass(), "userLoginBonusList", null);
        setField(term94385, term94385.getClass(), "userMissionPointList", null);
        setField(term94385, term94385.getClass(), "userMusicDetailList", null);
        setField(term94385, term94385.getClass(), "userMusicItemList", null);
        setField(term94385, term94385.getClass(), "userOption", null);
        setField(term94385, term94385.getClass(), "userPlaylogList", null);
        setField(term94385, term94385.getClass(), "userStoryList", null);
        setField(term94385, term94385.getClass(), "userTrainingRoomList", null);
        setField(term94385, term94385.getClass(), "userTradeItemList", null);
        setField(term94385, term94385.getClass(), "userEventMusicList", null);
        setField(term94385, term94385.getClass(), "userTechEventList", null);
        setField(term94385, term94385.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term94385, args);
    }

};


