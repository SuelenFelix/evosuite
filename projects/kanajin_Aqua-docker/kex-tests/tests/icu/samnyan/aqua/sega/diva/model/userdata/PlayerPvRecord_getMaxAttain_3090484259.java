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

public class PlayerPvRecord_getMaxAttain_3090484259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589044;

    public PlayerPvRecord_getMaxAttain_3090484259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term589702 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term589701 = ((Class) term589702).getDeclaredField((String) "MISS");
        ((Field) term589701).setAccessible(true);
        Object enum1289 = ((Field) term589701).get((Object) null);
        Class<? extends Object> term590079 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term590078 = ((Class) term590079).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term590078).setAccessible(true);
        Object enum1290 = ((Field) term590078).get((Object) null);
        Class<? extends Object> term590362 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term590361 = ((Class) term590362).getDeclaredField((String) "NORMAL");
        ((Field) term590361).setAccessible(true);
        Object enum1291 = ((Field) term590361).get((Object) null);
        Class<? extends Object> term590637 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term590636 = ((Class) term590637).getDeclaredField((String) "ORIGINAL");
        ((Field) term590636).setAccessible(true);
        Object enum1292 = ((Field) term590636).get((Object) null);
        Class<? extends Object> term590903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term590902 = ((Class) term590903).getDeclaredField((String) "NONE");
        ((Field) term590902).setAccessible(true);
        Object enum1293 = ((Field) term590902).get((Object) null);
        Class<? extends Object> term591544 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term591543 = ((Class) term591544).getDeclaredField((String) "NO_CLEAR");
        ((Field) term591543).setAccessible(true);
        Object enum1294 = ((Field) term591543).get((Object) null);
        Class<? extends Object> term591830 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term591829 = ((Class) term591830).getDeclaredField((String) "UNDEFINED");
        ((Field) term591829).setAccessible(true);
        Object enum1295 = ((Field) term591829).get((Object) null);
        term589044 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term589046 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term589169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term589170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term589174 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term589044, term589044.getClass(), "id", 1353683663053784647L);
        setLongField(term589046, term589046.getClass(), "id", -1465819833800717311L);
        setIntField(term589046, term589046.getClass(), "pdId", -1104816537);
        setField(term589046, term589046.getClass(), "playerName", "xxx");
        setIntField(term589046, term589046.getClass(), "vocaloidPoints", 300);
        setIntField(term589046, term589046.getClass(), "level", 1);
        setIntField(term589046, term589046.getClass(), "levelExp", 1997406081);
        setField(term589046, term589046.getClass(), "levelTitle", "xxx");
        setIntField(term589046, term589046.getClass(), "plateId", -1);
        setIntField(term589046, term589046.getClass(), "plateEffectId", -1);
        setField(term589046, term589046.getClass(), "passwordStatus", enum1289);
        setField(term589046, term589046.getClass(), "password", "**********");
        setBooleanField(term589046, term589046.getClass(), "preferPerPvModule", true);
        setBooleanField(term589046, term589046.getClass(), "preferCommonModule", true);
        setBooleanField(term589046, term589046.getClass(), "usePerPvSkin", false);
        setBooleanField(term589046, term589046.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term589046, term589046.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term589046, term589046.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term589046, term589046.getClass(), "usePerPvTouchSliderSe", false);
        setField(term589046, term589046.getClass(), "commonModule", "-999,-999,-999");
        setField(term589046, term589046.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term589170, term589170.getClass(), "year", 2026);
        setShortField(term589170, term589170.getClass(), "month", (short) 8);
        setShortField(term589170, term589170.getClass(), "day", (short) 12);
        setField(term589169, term589169.getClass(), "date", term589170);
        setByteField(term589174, term589174.getClass(), "hour", (byte) 2);
        setByteField(term589174, term589174.getClass(), "minute", (byte) 4);
        setByteField(term589174, term589174.getClass(), "second", (byte) 3);
        setIntField(term589174, term589174.getClass(), "nano", 686832000);
        setField(term589169, term589169.getClass(), "time", term589174);
        setField(term589046, term589046.getClass(), "commonModuleSetTime", term589169);
        setField(term589046, term589046.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term589046, term589046.getClass(), "commonSkin", -1);
        setIntField(term589046, term589046.getClass(), "headphoneVolume", 100);
        setBooleanField(term589046, term589046.getClass(), "buttonSeOn", true);
        setIntField(term589046, term589046.getClass(), "buttonSeVolume", 100);
        setIntField(term589046, term589046.getClass(), "sliderSeVolume", 100);
        setIntField(term589046, term589046.getClass(), "buttonSe", -1);
        setIntField(term589046, term589046.getClass(), "chainSlideSe", -1);
        setIntField(term589046, term589046.getClass(), "slideSe", -1);
        setIntField(term589046, term589046.getClass(), "sliderTouchSe", -1);
        setField(term589046, term589046.getClass(), "sortMode", enum1290);
        setIntField(term589046, term589046.getClass(), "nextPvId", -1);
        setField(term589046, term589046.getClass(), "nextDifficulty", enum1291);
        setField(term589046, term589046.getClass(), "nextEdition", enum1292);
        setBooleanField(term589046, term589046.getClass(), "showInterimRanking", true);
        setBooleanField(term589046, term589046.getClass(), "showClearStatus", true);
        setBooleanField(term589046, term589046.getClass(), "showGreatBorder", true);
        setBooleanField(term589046, term589046.getClass(), "showExcellentBorder", true);
        setBooleanField(term589046, term589046.getClass(), "showRivalBorder", true);
        setBooleanField(term589046, term589046.getClass(), "showRgoSetting", true);
        setBooleanField(term589046, term589046.getClass(), "contestNowPlayingEnable", false);
        setIntField(term589046, term589046.getClass(), "contestNowPlayingId", -1);
        setIntField(term589046, term589046.getClass(), "contestNowPlayingValue", -1);
        setField(term589046, term589046.getClass(), "contestNowPlayingResultRank", enum1293);
        setField(term589046, term589046.getClass(), "contestNowPlayingSpecifier", "");
        setField(term589046, term589046.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term589046, term589046.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term589046, term589046.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term589046, term589046.getClass(), "rivalPdId", -1);
        setField(term589044, term589044.getClass(), "pdId", term589046);
        setIntField(term589044, term589044.getClass(), "pvId", -1);
        setField(term589044, term589044.getClass(), "edition", enum1292);
        setField(term589044, term589044.getClass(), "difficulty", enum1291);
        setField(term589044, term589044.getClass(), "result", enum1294);
        setIntField(term589044, term589044.getClass(), "maxScore", -1);
        setIntField(term589044, term589044.getClass(), "maxAttain", -1);
        setField(term589044, term589044.getClass(), "challengeKind", enum1295);
        setField(term589044, term589044.getClass(), "rgoPurchased", "0,0,0");
        setField(term589044, term589044.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxAttain", argTypes, term589044, args);
    }

};


