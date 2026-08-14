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

public class PlayerPvRecord_setDifficulty_81183402917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614827;
     Object enum1352;

    public PlayerPvRecord_setDifficulty_81183402917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term615497 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term615496 = ((Class) term615497).getDeclaredField((String) "MISS");
        ((Field) term615496).setAccessible(true);
        Object enum1345 = ((Field) term615496).get((Object) null);
        Class<? extends Object> term615874 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term615873 = ((Class) term615874).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term615873).setAccessible(true);
        Object enum1346 = ((Field) term615873).get((Object) null);
        Class<? extends Object> term616157 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term616156 = ((Class) term616157).getDeclaredField((String) "NORMAL");
        ((Field) term616156).setAccessible(true);
        Object enum1347 = ((Field) term616156).get((Object) null);
        Class<? extends Object> term616432 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term616431 = ((Class) term616432).getDeclaredField((String) "ORIGINAL");
        ((Field) term616431).setAccessible(true);
        Object enum1348 = ((Field) term616431).get((Object) null);
        Class<? extends Object> term616698 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term616697 = ((Class) term616698).getDeclaredField((String) "NONE");
        ((Field) term616697).setAccessible(true);
        Object enum1349 = ((Field) term616697).get((Object) null);
        Class<? extends Object> term617339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term617338 = ((Class) term617339).getDeclaredField((String) "NO_CLEAR");
        ((Field) term617338).setAccessible(true);
        Object enum1350 = ((Field) term617338).get((Object) null);
        Class<? extends Object> term617625 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term617624 = ((Class) term617625).getDeclaredField((String) "UNDEFINED");
        ((Field) term617624).setAccessible(true);
        Object enum1351 = ((Field) term617624).get((Object) null);
        term614827 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term614829 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term614952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term614953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term614957 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term614827, term614827.getClass(), "id", 6351887424140565471L);
        setLongField(term614829, term614829.getClass(), "id", 6273670659288205855L);
        setIntField(term614829, term614829.getClass(), "pdId", 425132480);
        setField(term614829, term614829.getClass(), "playerName", "xxx");
        setIntField(term614829, term614829.getClass(), "vocaloidPoints", 300);
        setIntField(term614829, term614829.getClass(), "level", 1);
        setIntField(term614829, term614829.getClass(), "levelExp", 1968674006);
        setField(term614829, term614829.getClass(), "levelTitle", "xxx");
        setIntField(term614829, term614829.getClass(), "plateId", -1);
        setIntField(term614829, term614829.getClass(), "plateEffectId", -1);
        setField(term614829, term614829.getClass(), "passwordStatus", enum1345);
        setField(term614829, term614829.getClass(), "password", "**********");
        setBooleanField(term614829, term614829.getClass(), "preferPerPvModule", true);
        setBooleanField(term614829, term614829.getClass(), "preferCommonModule", false);
        setBooleanField(term614829, term614829.getClass(), "usePerPvSkin", true);
        setBooleanField(term614829, term614829.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term614829, term614829.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term614829, term614829.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term614829, term614829.getClass(), "usePerPvTouchSliderSe", false);
        setField(term614829, term614829.getClass(), "commonModule", "-999,-999,-999");
        setField(term614829, term614829.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term614953, term614953.getClass(), "year", 2026);
        setShortField(term614953, term614953.getClass(), "month", (short) 8);
        setShortField(term614953, term614953.getClass(), "day", (short) 12);
        setField(term614952, term614952.getClass(), "date", term614953);
        setByteField(term614957, term614957.getClass(), "hour", (byte) 2);
        setByteField(term614957, term614957.getClass(), "minute", (byte) 4);
        setByteField(term614957, term614957.getClass(), "second", (byte) 5);
        setIntField(term614957, term614957.getClass(), "nano", 687207000);
        setField(term614952, term614952.getClass(), "time", term614957);
        setField(term614829, term614829.getClass(), "commonModuleSetTime", term614952);
        setField(term614829, term614829.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term614829, term614829.getClass(), "commonSkin", -1);
        setIntField(term614829, term614829.getClass(), "headphoneVolume", 100);
        setBooleanField(term614829, term614829.getClass(), "buttonSeOn", true);
        setIntField(term614829, term614829.getClass(), "buttonSeVolume", 100);
        setIntField(term614829, term614829.getClass(), "sliderSeVolume", 100);
        setIntField(term614829, term614829.getClass(), "buttonSe", -1);
        setIntField(term614829, term614829.getClass(), "chainSlideSe", -1);
        setIntField(term614829, term614829.getClass(), "slideSe", -1);
        setIntField(term614829, term614829.getClass(), "sliderTouchSe", -1);
        setField(term614829, term614829.getClass(), "sortMode", enum1346);
        setIntField(term614829, term614829.getClass(), "nextPvId", -1);
        setField(term614829, term614829.getClass(), "nextDifficulty", enum1347);
        setField(term614829, term614829.getClass(), "nextEdition", enum1348);
        setBooleanField(term614829, term614829.getClass(), "showInterimRanking", true);
        setBooleanField(term614829, term614829.getClass(), "showClearStatus", true);
        setBooleanField(term614829, term614829.getClass(), "showGreatBorder", true);
        setBooleanField(term614829, term614829.getClass(), "showExcellentBorder", true);
        setBooleanField(term614829, term614829.getClass(), "showRivalBorder", true);
        setBooleanField(term614829, term614829.getClass(), "showRgoSetting", true);
        setBooleanField(term614829, term614829.getClass(), "contestNowPlayingEnable", true);
        setIntField(term614829, term614829.getClass(), "contestNowPlayingId", -1);
        setIntField(term614829, term614829.getClass(), "contestNowPlayingValue", -1);
        setField(term614829, term614829.getClass(), "contestNowPlayingResultRank", enum1349);
        setField(term614829, term614829.getClass(), "contestNowPlayingSpecifier", "");
        setField(term614829, term614829.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term614829, term614829.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term614829, term614829.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term614829, term614829.getClass(), "rivalPdId", -1);
        setField(term614827, term614827.getClass(), "pdId", term614829);
        setIntField(term614827, term614827.getClass(), "pvId", -1);
        setField(term614827, term614827.getClass(), "edition", enum1348);
        setField(term614827, term614827.getClass(), "difficulty", enum1347);
        setField(term614827, term614827.getClass(), "result", enum1350);
        setIntField(term614827, term614827.getClass(), "maxScore", -1);
        setIntField(term614827, term614827.getClass(), "maxAttain", -1);
        setField(term614827, term614827.getClass(), "challengeKind", enum1351);
        setField(term614827, term614827.getClass(), "rgoPurchased", "0,0,0");
        setField(term614827, term614827.getClass(), "rgoPlayed", "0,0,0");
        Class<? extends Object> term617934 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term617933 = ((Class) term617934).getDeclaredField((String) "EXTREME");
        ((Field) term617933).setAccessible(true);
        enum1352 = ((Field) term617933).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum1352;
        callMethod(klass, "setDifficulty", argTypes, term614827, args);
    }

};


