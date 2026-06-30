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

public class OngekiDataExport_canEqual_51084291591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90553;

    public OngekiDataExport_canEqual_51084291591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90553 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term90553, term90553.getClass(), "gameId", null);
        setField(term90553, term90553.getClass(), "userData", null);
        setField(term90553, term90553.getClass(), "userActivityList", null);
        setField(term90553, term90553.getClass(), "userCardList", null);
        setField(term90553, term90553.getClass(), "userChapterList", null);
        setField(term90553, term90553.getClass(), "userCharacterList", null);
        setField(term90553, term90553.getClass(), "userDeckList", null);
        setField(term90553, term90553.getClass(), "userEventPointList", null);
        setField(term90553, term90553.getClass(), "userGeneralDataList", null);
        setField(term90553, term90553.getClass(), "userItemList", null);
        setField(term90553, term90553.getClass(), "userLoginBonusList", null);
        setField(term90553, term90553.getClass(), "userMissionPointList", null);
        setField(term90553, term90553.getClass(), "userMusicDetailList", null);
        setField(term90553, term90553.getClass(), "userMusicItemList", null);
        setField(term90553, term90553.getClass(), "userOption", null);
        setField(term90553, term90553.getClass(), "userPlaylogList", null);
        setField(term90553, term90553.getClass(), "userStoryList", null);
        setField(term90553, term90553.getClass(), "userTrainingRoomList", null);
        setField(term90553, term90553.getClass(), "userTradeItemList", null);
        setField(term90553, term90553.getClass(), "userEventMusicList", null);
        setField(term90553, term90553.getClass(), "userTechEventList", null);
        setField(term90553, term90553.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term90553, args);
    }

};


