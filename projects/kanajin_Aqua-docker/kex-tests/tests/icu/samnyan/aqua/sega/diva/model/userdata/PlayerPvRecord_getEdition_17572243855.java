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

public class PlayerPvRecord_getEdition_17572243855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576668;

    public PlayerPvRecord_getEdition_17572243855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term577326 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term577325 = ((Class) term577326).getDeclaredField((String) "MISS");
        ((Field) term577325).setAccessible(true);
        Object enum1261 = ((Field) term577325).get((Object) null);
        Class<? extends Object> term577703 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term577702 = ((Class) term577703).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term577702).setAccessible(true);
        Object enum1262 = ((Field) term577702).get((Object) null);
        Class<? extends Object> term577986 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term577985 = ((Class) term577986).getDeclaredField((String) "NORMAL");
        ((Field) term577985).setAccessible(true);
        Object enum1263 = ((Field) term577985).get((Object) null);
        Class<? extends Object> term578261 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term578260 = ((Class) term578261).getDeclaredField((String) "ORIGINAL");
        ((Field) term578260).setAccessible(true);
        Object enum1264 = ((Field) term578260).get((Object) null);
        Class<? extends Object> term578527 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term578526 = ((Class) term578527).getDeclaredField((String) "NONE");
        ((Field) term578526).setAccessible(true);
        Object enum1265 = ((Field) term578526).get((Object) null);
        Class<? extends Object> term579168 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term579167 = ((Class) term579168).getDeclaredField((String) "NO_CLEAR");
        ((Field) term579167).setAccessible(true);
        Object enum1266 = ((Field) term579167).get((Object) null);
        Class<? extends Object> term579454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term579453 = ((Class) term579454).getDeclaredField((String) "UNDEFINED");
        ((Field) term579453).setAccessible(true);
        Object enum1267 = ((Field) term579453).get((Object) null);
        term576668 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term576670 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term576793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term576794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576798 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term576668, term576668.getClass(), "id", -629491722907628764L);
        setLongField(term576670, term576670.getClass(), "id", -5552123402871285352L);
        setIntField(term576670, term576670.getClass(), "pdId", 285368240);
        setField(term576670, term576670.getClass(), "playerName", "xxx");
        setIntField(term576670, term576670.getClass(), "vocaloidPoints", 300);
        setIntField(term576670, term576670.getClass(), "level", 1);
        setIntField(term576670, term576670.getClass(), "levelExp", 1526503433);
        setField(term576670, term576670.getClass(), "levelTitle", "xxx");
        setIntField(term576670, term576670.getClass(), "plateId", -1);
        setIntField(term576670, term576670.getClass(), "plateEffectId", -1);
        setField(term576670, term576670.getClass(), "passwordStatus", enum1261);
        setField(term576670, term576670.getClass(), "password", "**********");
        setBooleanField(term576670, term576670.getClass(), "preferPerPvModule", true);
        setBooleanField(term576670, term576670.getClass(), "preferCommonModule", false);
        setBooleanField(term576670, term576670.getClass(), "usePerPvSkin", false);
        setBooleanField(term576670, term576670.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term576670, term576670.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term576670, term576670.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term576670, term576670.getClass(), "usePerPvTouchSliderSe", false);
        setField(term576670, term576670.getClass(), "commonModule", "-999,-999,-999");
        setField(term576670, term576670.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term576794, term576794.getClass(), "year", 2026);
        setShortField(term576794, term576794.getClass(), "month", (short) 8);
        setShortField(term576794, term576794.getClass(), "day", (short) 12);
        setField(term576793, term576793.getClass(), "date", term576794);
        setByteField(term576798, term576798.getClass(), "hour", (byte) 2);
        setByteField(term576798, term576798.getClass(), "minute", (byte) 4);
        setByteField(term576798, term576798.getClass(), "second", (byte) 2);
        setIntField(term576798, term576798.getClass(), "nano", 683372000);
        setField(term576793, term576793.getClass(), "time", term576798);
        setField(term576670, term576670.getClass(), "commonModuleSetTime", term576793);
        setField(term576670, term576670.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term576670, term576670.getClass(), "commonSkin", -1);
        setIntField(term576670, term576670.getClass(), "headphoneVolume", 100);
        setBooleanField(term576670, term576670.getClass(), "buttonSeOn", true);
        setIntField(term576670, term576670.getClass(), "buttonSeVolume", 100);
        setIntField(term576670, term576670.getClass(), "sliderSeVolume", 100);
        setIntField(term576670, term576670.getClass(), "buttonSe", -1);
        setIntField(term576670, term576670.getClass(), "chainSlideSe", -1);
        setIntField(term576670, term576670.getClass(), "slideSe", -1);
        setIntField(term576670, term576670.getClass(), "sliderTouchSe", -1);
        setField(term576670, term576670.getClass(), "sortMode", enum1262);
        setIntField(term576670, term576670.getClass(), "nextPvId", -1);
        setField(term576670, term576670.getClass(), "nextDifficulty", enum1263);
        setField(term576670, term576670.getClass(), "nextEdition", enum1264);
        setBooleanField(term576670, term576670.getClass(), "showInterimRanking", true);
        setBooleanField(term576670, term576670.getClass(), "showClearStatus", true);
        setBooleanField(term576670, term576670.getClass(), "showGreatBorder", true);
        setBooleanField(term576670, term576670.getClass(), "showExcellentBorder", true);
        setBooleanField(term576670, term576670.getClass(), "showRivalBorder", true);
        setBooleanField(term576670, term576670.getClass(), "showRgoSetting", true);
        setBooleanField(term576670, term576670.getClass(), "contestNowPlayingEnable", true);
        setIntField(term576670, term576670.getClass(), "contestNowPlayingId", -1);
        setIntField(term576670, term576670.getClass(), "contestNowPlayingValue", -1);
        setField(term576670, term576670.getClass(), "contestNowPlayingResultRank", enum1265);
        setField(term576670, term576670.getClass(), "contestNowPlayingSpecifier", "");
        setField(term576670, term576670.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term576670, term576670.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term576670, term576670.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term576670, term576670.getClass(), "rivalPdId", -1);
        setField(term576668, term576668.getClass(), "pdId", term576670);
        setIntField(term576668, term576668.getClass(), "pvId", -1);
        setField(term576668, term576668.getClass(), "edition", enum1264);
        setField(term576668, term576668.getClass(), "difficulty", enum1263);
        setField(term576668, term576668.getClass(), "result", enum1266);
        setIntField(term576668, term576668.getClass(), "maxScore", -1);
        setIntField(term576668, term576668.getClass(), "maxAttain", -1);
        setField(term576668, term576668.getClass(), "challengeKind", enum1267);
        setField(term576668, term576668.getClass(), "rgoPurchased", "0,0,0");
        setField(term576668, term576668.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term576668, args);
    }

};


