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

public class PlayerPvRecord_setRgoPlayed_153730773023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634006;

    public PlayerPvRecord_setRgoPlayed_153730773023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term634676 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term634675 = ((Class) term634676).getDeclaredField((String) "MISS");
        ((Field) term634675).setAccessible(true);
        Object enum1389 = ((Field) term634675).get((Object) null);
        Class<? extends Object> term635053 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term635052 = ((Class) term635053).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term635052).setAccessible(true);
        Object enum1390 = ((Field) term635052).get((Object) null);
        Class<? extends Object> term635336 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term635335 = ((Class) term635336).getDeclaredField((String) "NORMAL");
        ((Field) term635335).setAccessible(true);
        Object enum1391 = ((Field) term635335).get((Object) null);
        Class<? extends Object> term635611 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term635610 = ((Class) term635611).getDeclaredField((String) "ORIGINAL");
        ((Field) term635610).setAccessible(true);
        Object enum1392 = ((Field) term635610).get((Object) null);
        Class<? extends Object> term635877 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term635876 = ((Class) term635877).getDeclaredField((String) "NONE");
        ((Field) term635876).setAccessible(true);
        Object enum1393 = ((Field) term635876).get((Object) null);
        Class<? extends Object> term636518 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term636517 = ((Class) term636518).getDeclaredField((String) "NO_CLEAR");
        ((Field) term636517).setAccessible(true);
        Object enum1394 = ((Field) term636517).get((Object) null);
        Class<? extends Object> term636804 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term636803 = ((Class) term636804).getDeclaredField((String) "UNDEFINED");
        ((Field) term636803).setAccessible(true);
        Object enum1395 = ((Field) term636803).get((Object) null);
        term634006 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term634008 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term634131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term634132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term634136 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term634006, term634006.getClass(), "id", 2809748481176687920L);
        setLongField(term634008, term634008.getClass(), "id", 4012955251407483889L);
        setIntField(term634008, term634008.getClass(), "pdId", -1075257608);
        setField(term634008, term634008.getClass(), "playerName", "xxx");
        setIntField(term634008, term634008.getClass(), "vocaloidPoints", 300);
        setIntField(term634008, term634008.getClass(), "level", 1);
        setIntField(term634008, term634008.getClass(), "levelExp", -693529847);
        setField(term634008, term634008.getClass(), "levelTitle", "xxx");
        setIntField(term634008, term634008.getClass(), "plateId", -1);
        setIntField(term634008, term634008.getClass(), "plateEffectId", -1);
        setField(term634008, term634008.getClass(), "passwordStatus", enum1389);
        setField(term634008, term634008.getClass(), "password", "**********");
        setBooleanField(term634008, term634008.getClass(), "preferPerPvModule", true);
        setBooleanField(term634008, term634008.getClass(), "preferCommonModule", false);
        setBooleanField(term634008, term634008.getClass(), "usePerPvSkin", false);
        setBooleanField(term634008, term634008.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term634008, term634008.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term634008, term634008.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term634008, term634008.getClass(), "usePerPvTouchSliderSe", true);
        setField(term634008, term634008.getClass(), "commonModule", "-999,-999,-999");
        setField(term634008, term634008.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term634132, term634132.getClass(), "year", 2026);
        setShortField(term634132, term634132.getClass(), "month", (short) 8);
        setShortField(term634132, term634132.getClass(), "day", (short) 12);
        setField(term634131, term634131.getClass(), "date", term634132);
        setByteField(term634136, term634136.getClass(), "hour", (byte) 2);
        setByteField(term634136, term634136.getClass(), "minute", (byte) 4);
        setByteField(term634136, term634136.getClass(), "second", (byte) 7);
        setIntField(term634136, term634136.getClass(), "nano", 185948000);
        setField(term634131, term634131.getClass(), "time", term634136);
        setField(term634008, term634008.getClass(), "commonModuleSetTime", term634131);
        setField(term634008, term634008.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term634008, term634008.getClass(), "commonSkin", -1);
        setIntField(term634008, term634008.getClass(), "headphoneVolume", 100);
        setBooleanField(term634008, term634008.getClass(), "buttonSeOn", true);
        setIntField(term634008, term634008.getClass(), "buttonSeVolume", 100);
        setIntField(term634008, term634008.getClass(), "sliderSeVolume", 100);
        setIntField(term634008, term634008.getClass(), "buttonSe", -1);
        setIntField(term634008, term634008.getClass(), "chainSlideSe", -1);
        setIntField(term634008, term634008.getClass(), "slideSe", -1);
        setIntField(term634008, term634008.getClass(), "sliderTouchSe", -1);
        setField(term634008, term634008.getClass(), "sortMode", enum1390);
        setIntField(term634008, term634008.getClass(), "nextPvId", -1);
        setField(term634008, term634008.getClass(), "nextDifficulty", enum1391);
        setField(term634008, term634008.getClass(), "nextEdition", enum1392);
        setBooleanField(term634008, term634008.getClass(), "showInterimRanking", true);
        setBooleanField(term634008, term634008.getClass(), "showClearStatus", true);
        setBooleanField(term634008, term634008.getClass(), "showGreatBorder", true);
        setBooleanField(term634008, term634008.getClass(), "showExcellentBorder", true);
        setBooleanField(term634008, term634008.getClass(), "showRivalBorder", true);
        setBooleanField(term634008, term634008.getClass(), "showRgoSetting", true);
        setBooleanField(term634008, term634008.getClass(), "contestNowPlayingEnable", false);
        setIntField(term634008, term634008.getClass(), "contestNowPlayingId", -1);
        setIntField(term634008, term634008.getClass(), "contestNowPlayingValue", -1);
        setField(term634008, term634008.getClass(), "contestNowPlayingResultRank", enum1393);
        setField(term634008, term634008.getClass(), "contestNowPlayingSpecifier", "");
        setField(term634008, term634008.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term634008, term634008.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term634008, term634008.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term634008, term634008.getClass(), "rivalPdId", -1);
        setField(term634006, term634006.getClass(), "pdId", term634008);
        setIntField(term634006, term634006.getClass(), "pvId", -1);
        setField(term634006, term634006.getClass(), "edition", enum1392);
        setField(term634006, term634006.getClass(), "difficulty", enum1391);
        setField(term634006, term634006.getClass(), "result", enum1394);
        setIntField(term634006, term634006.getClass(), "maxScore", -1);
        setIntField(term634006, term634006.getClass(), "maxAttain", -1);
        setField(term634006, term634006.getClass(), "challengeKind", enum1395);
        setField(term634006, term634006.getClass(), "rgoPurchased", "0,0,0");
        setField(term634006, term634006.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RxbhrFBjkO";
        callMethod(klass, "setRgoPlayed", argTypes, term634006, args);
    }

};


