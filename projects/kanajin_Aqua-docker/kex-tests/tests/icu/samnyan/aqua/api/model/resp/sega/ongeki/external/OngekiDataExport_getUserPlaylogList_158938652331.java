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

public class OngekiDataExport_getUserPlaylogList_158938652331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29814;

    public OngekiDataExport_getUserPlaylogList_158938652331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29814 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term29814, term29814.getClass(), "gameId", null);
        setField(term29814, term29814.getClass(), "userData", null);
        setField(term29814, term29814.getClass(), "userActivityList", null);
        setField(term29814, term29814.getClass(), "userCardList", null);
        setField(term29814, term29814.getClass(), "userChapterList", null);
        setField(term29814, term29814.getClass(), "userCharacterList", null);
        setField(term29814, term29814.getClass(), "userDeckList", null);
        setField(term29814, term29814.getClass(), "userEventPointList", null);
        setField(term29814, term29814.getClass(), "userGeneralDataList", null);
        setField(term29814, term29814.getClass(), "userItemList", null);
        setField(term29814, term29814.getClass(), "userLoginBonusList", null);
        setField(term29814, term29814.getClass(), "userMissionPointList", null);
        setField(term29814, term29814.getClass(), "userMusicDetailList", null);
        setField(term29814, term29814.getClass(), "userMusicItemList", null);
        setField(term29814, term29814.getClass(), "userOption", null);
        setField(term29814, term29814.getClass(), "userPlaylogList", null);
        setField(term29814, term29814.getClass(), "userStoryList", null);
        setField(term29814, term29814.getClass(), "userTrainingRoomList", null);
        setField(term29814, term29814.getClass(), "userTradeItemList", null);
        setField(term29814, term29814.getClass(), "userEventMusicList", null);
        setField(term29814, term29814.getClass(), "userTechEventList", null);
        setField(term29814, term29814.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlaylogList", argTypes, term29814, args);
    }

};


