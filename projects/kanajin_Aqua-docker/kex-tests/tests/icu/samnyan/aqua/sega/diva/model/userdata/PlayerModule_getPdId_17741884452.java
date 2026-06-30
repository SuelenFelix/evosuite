package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PlayerModule_getPdId_17741884452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657952;

    public PlayerModule_getPdId_17741884452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term658567 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term658566 = ((Class) term658567).getDeclaredField((String) "MISS");
        ((Field) term658566).setAccessible(true);
        Object enum1442 = ((Field) term658566).get((Object) null);
        Class<? extends Object> term658944 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term658943 = ((Class) term658944).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term658943).setAccessible(true);
        Object enum1443 = ((Field) term658943).get((Object) null);
        Class<? extends Object> term659227 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term659226 = ((Class) term659227).getDeclaredField((String) "NORMAL");
        ((Field) term659226).setAccessible(true);
        Object enum1444 = ((Field) term659226).get((Object) null);
        Class<? extends Object> term659502 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term659501 = ((Class) term659502).getDeclaredField((String) "ORIGINAL");
        ((Field) term659501).setAccessible(true);
        Object enum1445 = ((Field) term659501).get((Object) null);
        Class<? extends Object> term659768 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term659767 = ((Class) term659768).getDeclaredField((String) "NONE");
        ((Field) term659767).setAccessible(true);
        Object enum1446 = ((Field) term659767).get((Object) null);
        term657952 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term657954 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term658077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term658078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term658082 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term657952, term657952.getClass(), "id", 3643973882575578879L);
        setLongField(term657954, term657954.getClass(), "id", -1750555031444556464L);
        setIntField(term657954, term657954.getClass(), "pdId", -240455247);
        setField(term657954, term657954.getClass(), "playerName", "xxx");
        setIntField(term657954, term657954.getClass(), "vocaloidPoints", 300);
        setIntField(term657954, term657954.getClass(), "level", 1);
        setIntField(term657954, term657954.getClass(), "levelExp", 412243891);
        setField(term657954, term657954.getClass(), "levelTitle", "xxx");
        setIntField(term657954, term657954.getClass(), "plateId", -1);
        setIntField(term657954, term657954.getClass(), "plateEffectId", -1);
        setField(term657954, term657954.getClass(), "passwordStatus", enum1442);
        setField(term657954, term657954.getClass(), "password", "**********");
        setBooleanField(term657954, term657954.getClass(), "preferPerPvModule", true);
        setBooleanField(term657954, term657954.getClass(), "preferCommonModule", false);
        setBooleanField(term657954, term657954.getClass(), "usePerPvSkin", false);
        setBooleanField(term657954, term657954.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term657954, term657954.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term657954, term657954.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term657954, term657954.getClass(), "usePerPvTouchSliderSe", false);
        setField(term657954, term657954.getClass(), "commonModule", "-999,-999,-999");
        setField(term657954, term657954.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term658078, term658078.getClass(), "year", 2026);
        setShortField(term658078, term658078.getClass(), "month", (short) 6);
        setShortField(term658078, term658078.getClass(), "day", (short) 29);
        setField(term658077, term658077.getClass(), "date", term658078);
        setByteField(term658082, term658082.getClass(), "hour", (byte) 4);
        setByteField(term658082, term658082.getClass(), "minute", (byte) 29);
        setByteField(term658082, term658082.getClass(), "second", (byte) 3);
        setIntField(term658082, term658082.getClass(), "nano", 147751000);
        setField(term658077, term658077.getClass(), "time", term658082);
        setField(term657954, term657954.getClass(), "commonModuleSetTime", term658077);
        setField(term657954, term657954.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term657954, term657954.getClass(), "commonSkin", -1);
        setIntField(term657954, term657954.getClass(), "headphoneVolume", 100);
        setBooleanField(term657954, term657954.getClass(), "buttonSeOn", true);
        setIntField(term657954, term657954.getClass(), "buttonSeVolume", 100);
        setIntField(term657954, term657954.getClass(), "sliderSeVolume", 100);
        setIntField(term657954, term657954.getClass(), "buttonSe", -1);
        setIntField(term657954, term657954.getClass(), "chainSlideSe", -1);
        setIntField(term657954, term657954.getClass(), "slideSe", -1);
        setIntField(term657954, term657954.getClass(), "sliderTouchSe", -1);
        setField(term657954, term657954.getClass(), "sortMode", enum1443);
        setIntField(term657954, term657954.getClass(), "nextPvId", -1);
        setField(term657954, term657954.getClass(), "nextDifficulty", enum1444);
        setField(term657954, term657954.getClass(), "nextEdition", enum1445);
        setBooleanField(term657954, term657954.getClass(), "showInterimRanking", true);
        setBooleanField(term657954, term657954.getClass(), "showClearStatus", true);
        setBooleanField(term657954, term657954.getClass(), "showGreatBorder", true);
        setBooleanField(term657954, term657954.getClass(), "showExcellentBorder", true);
        setBooleanField(term657954, term657954.getClass(), "showRivalBorder", true);
        setBooleanField(term657954, term657954.getClass(), "showRgoSetting", true);
        setBooleanField(term657954, term657954.getClass(), "contestNowPlayingEnable", false);
        setIntField(term657954, term657954.getClass(), "contestNowPlayingId", -1);
        setIntField(term657954, term657954.getClass(), "contestNowPlayingValue", -1);
        setField(term657954, term657954.getClass(), "contestNowPlayingResultRank", enum1446);
        setField(term657954, term657954.getClass(), "contestNowPlayingSpecifier", "");
        setField(term657954, term657954.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term657954, term657954.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term657954, term657954.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term657954, term657954.getClass(), "rivalPdId", -1);
        setField(term657952, term657952.getClass(), "pdId", term657954);
        setIntField(term657952, term657952.getClass(), "moduleId", -1517264869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term657952, args);
    }

};


