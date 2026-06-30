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
import java.lang.String;
import java.lang.Object;

public class PlayerProfile_isPreferPerPvModule_209889293112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710593;

    public PlayerProfile_isPreferPerPvModule_209889293112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term711205 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term711204 = ((Class) term711205).getDeclaredField((String) "MISS");
        ((Field) term711204).setAccessible(true);
        Object enum1547 = ((Field) term711204).get((Object) null);
        Class<? extends Object> term711582 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term711581 = ((Class) term711582).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term711581).setAccessible(true);
        Object enum1548 = ((Field) term711581).get((Object) null);
        Class<? extends Object> term711865 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term711864 = ((Class) term711865).getDeclaredField((String) "NORMAL");
        ((Field) term711864).setAccessible(true);
        Object enum1549 = ((Field) term711864).get((Object) null);
        Class<? extends Object> term712140 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term712139 = ((Class) term712140).getDeclaredField((String) "ORIGINAL");
        ((Field) term712139).setAccessible(true);
        Object enum1550 = ((Field) term712139).get((Object) null);
        Class<? extends Object> term712406 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term712405 = ((Class) term712406).getDeclaredField((String) "NONE");
        ((Field) term712405).setAccessible(true);
        Object enum1551 = ((Field) term712405).get((Object) null);
        term710593 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term710716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term710717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term710721 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term710593, term710593.getClass(), "id", -2195794659127490022L);
        setIntField(term710593, term710593.getClass(), "pdId", -929366947);
        setField(term710593, term710593.getClass(), "playerName", "xxx");
        setIntField(term710593, term710593.getClass(), "vocaloidPoints", 300);
        setIntField(term710593, term710593.getClass(), "level", 1);
        setIntField(term710593, term710593.getClass(), "levelExp", -10579292);
        setField(term710593, term710593.getClass(), "levelTitle", "xxx");
        setIntField(term710593, term710593.getClass(), "plateId", -1);
        setIntField(term710593, term710593.getClass(), "plateEffectId", -1);
        setField(term710593, term710593.getClass(), "passwordStatus", enum1547);
        setField(term710593, term710593.getClass(), "password", "**********");
        setBooleanField(term710593, term710593.getClass(), "preferPerPvModule", true);
        setBooleanField(term710593, term710593.getClass(), "preferCommonModule", false);
        setBooleanField(term710593, term710593.getClass(), "usePerPvSkin", false);
        setBooleanField(term710593, term710593.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term710593, term710593.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term710593, term710593.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term710593, term710593.getClass(), "usePerPvTouchSliderSe", true);
        setField(term710593, term710593.getClass(), "commonModule", "-999,-999,-999");
        setField(term710593, term710593.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term710717, term710717.getClass(), "year", 2026);
        setShortField(term710717, term710717.getClass(), "month", (short) 6);
        setShortField(term710717, term710717.getClass(), "day", (short) 29);
        setField(term710716, term710716.getClass(), "date", term710717);
        setByteField(term710721, term710721.getClass(), "hour", (byte) 4);
        setByteField(term710721, term710721.getClass(), "minute", (byte) 29);
        setByteField(term710721, term710721.getClass(), "second", (byte) 12);
        setIntField(term710721, term710721.getClass(), "nano", 333732000);
        setField(term710716, term710716.getClass(), "time", term710721);
        setField(term710593, term710593.getClass(), "commonModuleSetTime", term710716);
        setField(term710593, term710593.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term710593, term710593.getClass(), "commonSkin", -1);
        setIntField(term710593, term710593.getClass(), "headphoneVolume", 100);
        setBooleanField(term710593, term710593.getClass(), "buttonSeOn", true);
        setIntField(term710593, term710593.getClass(), "buttonSeVolume", 100);
        setIntField(term710593, term710593.getClass(), "sliderSeVolume", 100);
        setIntField(term710593, term710593.getClass(), "buttonSe", -1);
        setIntField(term710593, term710593.getClass(), "chainSlideSe", -1);
        setIntField(term710593, term710593.getClass(), "slideSe", -1);
        setIntField(term710593, term710593.getClass(), "sliderTouchSe", -1);
        setField(term710593, term710593.getClass(), "sortMode", enum1548);
        setIntField(term710593, term710593.getClass(), "nextPvId", -1);
        setField(term710593, term710593.getClass(), "nextDifficulty", enum1549);
        setField(term710593, term710593.getClass(), "nextEdition", enum1550);
        setBooleanField(term710593, term710593.getClass(), "showInterimRanking", true);
        setBooleanField(term710593, term710593.getClass(), "showClearStatus", true);
        setBooleanField(term710593, term710593.getClass(), "showGreatBorder", true);
        setBooleanField(term710593, term710593.getClass(), "showExcellentBorder", true);
        setBooleanField(term710593, term710593.getClass(), "showRivalBorder", true);
        setBooleanField(term710593, term710593.getClass(), "showRgoSetting", true);
        setBooleanField(term710593, term710593.getClass(), "contestNowPlayingEnable", false);
        setIntField(term710593, term710593.getClass(), "contestNowPlayingId", -1);
        setIntField(term710593, term710593.getClass(), "contestNowPlayingValue", -1);
        setField(term710593, term710593.getClass(), "contestNowPlayingResultRank", enum1551);
        setField(term710593, term710593.getClass(), "contestNowPlayingSpecifier", "");
        setField(term710593, term710593.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term710593, term710593.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term710593, term710593.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term710593, term710593.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPreferPerPvModule", argTypes, term710593, args);
    }

};


