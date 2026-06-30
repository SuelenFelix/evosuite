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

public class OngekiDataExport_setUserData_68156693247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45758;

    public OngekiDataExport_setUserData_68156693247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45758 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term45758, term45758.getClass(), "gameId", null);
        setField(term45758, term45758.getClass(), "userData", null);
        setField(term45758, term45758.getClass(), "userActivityList", null);
        setField(term45758, term45758.getClass(), "userCardList", null);
        setField(term45758, term45758.getClass(), "userChapterList", null);
        setField(term45758, term45758.getClass(), "userCharacterList", null);
        setField(term45758, term45758.getClass(), "userDeckList", null);
        setField(term45758, term45758.getClass(), "userEventPointList", null);
        setField(term45758, term45758.getClass(), "userGeneralDataList", null);
        setField(term45758, term45758.getClass(), "userItemList", null);
        setField(term45758, term45758.getClass(), "userLoginBonusList", null);
        setField(term45758, term45758.getClass(), "userMissionPointList", null);
        setField(term45758, term45758.getClass(), "userMusicDetailList", null);
        setField(term45758, term45758.getClass(), "userMusicItemList", null);
        setField(term45758, term45758.getClass(), "userOption", null);
        setField(term45758, term45758.getClass(), "userPlaylogList", null);
        setField(term45758, term45758.getClass(), "userStoryList", null);
        setField(term45758, term45758.getClass(), "userTrainingRoomList", null);
        setField(term45758, term45758.getClass(), "userTradeItemList", null);
        setField(term45758, term45758.getClass(), "userEventMusicList", null);
        setField(term45758, term45758.getClass(), "userTechEventList", null);
        setField(term45758, term45758.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserData", argTypes, term45758, args);
    }

};


