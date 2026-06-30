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

public class OngekiDataExport_setUserCardList_70664358151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50080;

    public OngekiDataExport_setUserCardList_70664358151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50080 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term50080, term50080.getClass(), "gameId", null);
        setField(term50080, term50080.getClass(), "userData", null);
        setField(term50080, term50080.getClass(), "userActivityList", null);
        setField(term50080, term50080.getClass(), "userCardList", null);
        setField(term50080, term50080.getClass(), "userChapterList", null);
        setField(term50080, term50080.getClass(), "userCharacterList", null);
        setField(term50080, term50080.getClass(), "userDeckList", null);
        setField(term50080, term50080.getClass(), "userEventPointList", null);
        setField(term50080, term50080.getClass(), "userGeneralDataList", null);
        setField(term50080, term50080.getClass(), "userItemList", null);
        setField(term50080, term50080.getClass(), "userLoginBonusList", null);
        setField(term50080, term50080.getClass(), "userMissionPointList", null);
        setField(term50080, term50080.getClass(), "userMusicDetailList", null);
        setField(term50080, term50080.getClass(), "userMusicItemList", null);
        setField(term50080, term50080.getClass(), "userOption", null);
        setField(term50080, term50080.getClass(), "userPlaylogList", null);
        setField(term50080, term50080.getClass(), "userStoryList", null);
        setField(term50080, term50080.getClass(), "userTrainingRoomList", null);
        setField(term50080, term50080.getClass(), "userTradeItemList", null);
        setField(term50080, term50080.getClass(), "userEventMusicList", null);
        setField(term50080, term50080.getClass(), "userTechEventList", null);
        setField(term50080, term50080.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserCardList", argTypes, term50080, args);
    }

};


