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
import java.lang.Long;

public class PlayerPvRecord_setId_36638029713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601420;
     Object term602071;

    public PlayerPvRecord_setId_36638029713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term602080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term602079 = ((Class) term602080).getDeclaredField((String) "MISS");
        ((Field) term602079).setAccessible(true);
        Object enum1317 = ((Field) term602079).get((Object) null);
        Class<? extends Object> term602457 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term602456 = ((Class) term602457).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term602456).setAccessible(true);
        Object enum1318 = ((Field) term602456).get((Object) null);
        Class<? extends Object> term602740 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term602739 = ((Class) term602740).getDeclaredField((String) "NORMAL");
        ((Field) term602739).setAccessible(true);
        Object enum1319 = ((Field) term602739).get((Object) null);
        Class<? extends Object> term603015 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term603014 = ((Class) term603015).getDeclaredField((String) "ORIGINAL");
        ((Field) term603014).setAccessible(true);
        Object enum1320 = ((Field) term603014).get((Object) null);
        Class<? extends Object> term603281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term603280 = ((Class) term603281).getDeclaredField((String) "NONE");
        ((Field) term603280).setAccessible(true);
        Object enum1321 = ((Field) term603280).get((Object) null);
        Class<? extends Object> term603922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term603921 = ((Class) term603922).getDeclaredField((String) "NO_CLEAR");
        ((Field) term603921).setAccessible(true);
        Object enum1322 = ((Field) term603921).get((Object) null);
        Class<? extends Object> term604208 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term604207 = ((Class) term604208).getDeclaredField((String) "UNDEFINED");
        ((Field) term604207).setAccessible(true);
        Object enum1323 = ((Field) term604207).get((Object) null);
        term601420 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term601422 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term601545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term601546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term601550 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term601420, term601420.getClass(), "id", 8073378116544724166L);
        setLongField(term601422, term601422.getClass(), "id", -8303973304709662279L);
        setIntField(term601422, term601422.getClass(), "pdId", -1917689550);
        setField(term601422, term601422.getClass(), "playerName", "xxx");
        setIntField(term601422, term601422.getClass(), "vocaloidPoints", 300);
        setIntField(term601422, term601422.getClass(), "level", 1);
        setIntField(term601422, term601422.getClass(), "levelExp", 1829428325);
        setField(term601422, term601422.getClass(), "levelTitle", "xxx");
        setIntField(term601422, term601422.getClass(), "plateId", -1);
        setIntField(term601422, term601422.getClass(), "plateEffectId", -1);
        setField(term601422, term601422.getClass(), "passwordStatus", enum1317);
        setField(term601422, term601422.getClass(), "password", "**********");
        setBooleanField(term601422, term601422.getClass(), "preferPerPvModule", true);
        setBooleanField(term601422, term601422.getClass(), "preferCommonModule", true);
        setBooleanField(term601422, term601422.getClass(), "usePerPvSkin", false);
        setBooleanField(term601422, term601422.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term601422, term601422.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term601422, term601422.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term601422, term601422.getClass(), "usePerPvTouchSliderSe", true);
        setField(term601422, term601422.getClass(), "commonModule", "-999,-999,-999");
        setField(term601422, term601422.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term601546, term601546.getClass(), "year", 2026);
        setShortField(term601546, term601546.getClass(), "month", (short) 8);
        setShortField(term601546, term601546.getClass(), "day", (short) 12);
        setField(term601545, term601545.getClass(), "date", term601546);
        setByteField(term601550, term601550.getClass(), "hour", (byte) 2);
        setByteField(term601550, term601550.getClass(), "minute", (byte) 4);
        setByteField(term601550, term601550.getClass(), "second", (byte) 4);
        setIntField(term601550, term601550.getClass(), "nano", 688476000);
        setField(term601545, term601545.getClass(), "time", term601550);
        setField(term601422, term601422.getClass(), "commonModuleSetTime", term601545);
        setField(term601422, term601422.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term601422, term601422.getClass(), "commonSkin", -1);
        setIntField(term601422, term601422.getClass(), "headphoneVolume", 100);
        setBooleanField(term601422, term601422.getClass(), "buttonSeOn", true);
        setIntField(term601422, term601422.getClass(), "buttonSeVolume", 100);
        setIntField(term601422, term601422.getClass(), "sliderSeVolume", 100);
        setIntField(term601422, term601422.getClass(), "buttonSe", -1);
        setIntField(term601422, term601422.getClass(), "chainSlideSe", -1);
        setIntField(term601422, term601422.getClass(), "slideSe", -1);
        setIntField(term601422, term601422.getClass(), "sliderTouchSe", -1);
        setField(term601422, term601422.getClass(), "sortMode", enum1318);
        setIntField(term601422, term601422.getClass(), "nextPvId", -1);
        setField(term601422, term601422.getClass(), "nextDifficulty", enum1319);
        setField(term601422, term601422.getClass(), "nextEdition", enum1320);
        setBooleanField(term601422, term601422.getClass(), "showInterimRanking", true);
        setBooleanField(term601422, term601422.getClass(), "showClearStatus", true);
        setBooleanField(term601422, term601422.getClass(), "showGreatBorder", true);
        setBooleanField(term601422, term601422.getClass(), "showExcellentBorder", true);
        setBooleanField(term601422, term601422.getClass(), "showRivalBorder", true);
        setBooleanField(term601422, term601422.getClass(), "showRgoSetting", true);
        setBooleanField(term601422, term601422.getClass(), "contestNowPlayingEnable", false);
        setIntField(term601422, term601422.getClass(), "contestNowPlayingId", -1);
        setIntField(term601422, term601422.getClass(), "contestNowPlayingValue", -1);
        setField(term601422, term601422.getClass(), "contestNowPlayingResultRank", enum1321);
        setField(term601422, term601422.getClass(), "contestNowPlayingSpecifier", "");
        setField(term601422, term601422.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term601422, term601422.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term601422, term601422.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term601422, term601422.getClass(), "rivalPdId", -1);
        setField(term601420, term601420.getClass(), "pdId", term601422);
        setIntField(term601420, term601420.getClass(), "pvId", -1);
        setField(term601420, term601420.getClass(), "edition", enum1320);
        setField(term601420, term601420.getClass(), "difficulty", enum1319);
        setField(term601420, term601420.getClass(), "result", enum1322);
        setIntField(term601420, term601420.getClass(), "maxScore", -1);
        setIntField(term601420, term601420.getClass(), "maxAttain", -1);
        setField(term601420, term601420.getClass(), "challengeKind", enum1323);
        setField(term601420, term601420.getClass(), "rgoPurchased", "0,0,0");
        setField(term601420, term601420.getClass(), "rgoPlayed", "0,0,0");
        term602071 = new Long(6853972830905120647L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term602071;
        callMethod(klass, "setId", argTypes, term601420, args);
    }

};


