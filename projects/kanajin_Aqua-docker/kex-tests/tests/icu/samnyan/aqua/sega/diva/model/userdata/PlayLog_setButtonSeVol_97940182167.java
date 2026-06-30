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
import java.lang.Integer;

public class PlayLog_setButtonSeVol_97940182167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295416;
     Object term296144;

    public PlayLog_setButtonSeVol_97940182167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296153 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term296152 = ((Class) term296153).getDeclaredField((String) "MISS");
        ((Field) term296152).setAccessible(true);
        Object enum674 = ((Field) term296152).get((Object) null);
        Class<? extends Object> term296530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term296529 = ((Class) term296530).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term296529).setAccessible(true);
        Object enum675 = ((Field) term296529).get((Object) null);
        Class<? extends Object> term296813 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term296812 = ((Class) term296813).getDeclaredField((String) "NORMAL");
        ((Field) term296812).setAccessible(true);
        Object enum676 = ((Field) term296812).get((Object) null);
        Class<? extends Object> term297088 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term297087 = ((Class) term297088).getDeclaredField((String) "ORIGINAL");
        ((Field) term297087).setAccessible(true);
        Object enum677 = ((Field) term297087).get((Object) null);
        Class<? extends Object> term297354 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term297353 = ((Class) term297354).getDeclaredField((String) "NONE");
        ((Field) term297353).setAccessible(true);
        Object enum678 = ((Field) term297353).get((Object) null);
        Class<? extends Object> term297995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term297994 = ((Class) term297995).getDeclaredField((String) "EXTREME");
        ((Field) term297994).setAccessible(true);
        Object enum679 = ((Field) term297994).get((Object) null);
        Class<? extends Object> term298273 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term298272 = ((Class) term298273).getDeclaredField((String) "EXTRA");
        ((Field) term298272).setAccessible(true);
        Object enum680 = ((Field) term298272).get((Object) null);
        Class<? extends Object> term298530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term298529 = ((Class) term298530).getDeclaredField((String) "UNDEFINED");
        ((Field) term298529).setAccessible(true);
        Object enum681 = ((Field) term298529).get((Object) null);
        Class<? extends Object> term298829 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term298828 = ((Class) term298829).getDeclaredField((String) "GREAT");
        ((Field) term298828).setAccessible(true);
        Object enum682 = ((Field) term298828).get((Object) null);
        term295416 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term295418 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term295541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term296134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term296135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term296139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term295416, term295416.getClass(), "id", 3090901538358721367L);
        setLongField(term295418, term295418.getClass(), "id", -1677189124507026637L);
        setIntField(term295418, term295418.getClass(), "pdId", 28070985);
        setField(term295418, term295418.getClass(), "playerName", "xxx");
        setIntField(term295418, term295418.getClass(), "vocaloidPoints", 300);
        setIntField(term295418, term295418.getClass(), "level", 1);
        setIntField(term295418, term295418.getClass(), "levelExp", 334110739);
        setField(term295418, term295418.getClass(), "levelTitle", "xxx");
        setIntField(term295418, term295418.getClass(), "plateId", -1);
        setIntField(term295418, term295418.getClass(), "plateEffectId", -1);
        setField(term295418, term295418.getClass(), "passwordStatus", enum674);
        setField(term295418, term295418.getClass(), "password", "**********");
        setBooleanField(term295418, term295418.getClass(), "preferPerPvModule", true);
        setBooleanField(term295418, term295418.getClass(), "preferCommonModule", false);
        setBooleanField(term295418, term295418.getClass(), "usePerPvSkin", false);
        setBooleanField(term295418, term295418.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term295418, term295418.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term295418, term295418.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term295418, term295418.getClass(), "usePerPvTouchSliderSe", false);
        setField(term295418, term295418.getClass(), "commonModule", "-999,-999,-999");
        setField(term295418, term295418.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term295542, term295542.getClass(), "year", 2026);
        setShortField(term295542, term295542.getClass(), "month", (short) 6);
        setShortField(term295542, term295542.getClass(), "day", (short) 29);
        setField(term295541, term295541.getClass(), "date", term295542);
        setByteField(term295546, term295546.getClass(), "hour", (byte) 4);
        setByteField(term295546, term295546.getClass(), "minute", (byte) 27);
        setByteField(term295546, term295546.getClass(), "second", (byte) 40);
        setIntField(term295546, term295546.getClass(), "nano", 703738000);
        setField(term295541, term295541.getClass(), "time", term295546);
        setField(term295418, term295418.getClass(), "commonModuleSetTime", term295541);
        setField(term295418, term295418.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term295418, term295418.getClass(), "commonSkin", -1);
        setIntField(term295418, term295418.getClass(), "headphoneVolume", 100);
        setBooleanField(term295418, term295418.getClass(), "buttonSeOn", true);
        setIntField(term295418, term295418.getClass(), "buttonSeVolume", 100);
        setIntField(term295418, term295418.getClass(), "sliderSeVolume", 100);
        setIntField(term295418, term295418.getClass(), "buttonSe", -1);
        setIntField(term295418, term295418.getClass(), "chainSlideSe", -1);
        setIntField(term295418, term295418.getClass(), "slideSe", -1);
        setIntField(term295418, term295418.getClass(), "sliderTouchSe", -1);
        setField(term295418, term295418.getClass(), "sortMode", enum675);
        setIntField(term295418, term295418.getClass(), "nextPvId", -1);
        setField(term295418, term295418.getClass(), "nextDifficulty", enum676);
        setField(term295418, term295418.getClass(), "nextEdition", enum677);
        setBooleanField(term295418, term295418.getClass(), "showInterimRanking", true);
        setBooleanField(term295418, term295418.getClass(), "showClearStatus", true);
        setBooleanField(term295418, term295418.getClass(), "showGreatBorder", true);
        setBooleanField(term295418, term295418.getClass(), "showExcellentBorder", true);
        setBooleanField(term295418, term295418.getClass(), "showRivalBorder", true);
        setBooleanField(term295418, term295418.getClass(), "showRgoSetting", true);
        setBooleanField(term295418, term295418.getClass(), "contestNowPlayingEnable", true);
        setIntField(term295418, term295418.getClass(), "contestNowPlayingId", -1);
        setIntField(term295418, term295418.getClass(), "contestNowPlayingValue", -1);
        setField(term295418, term295418.getClass(), "contestNowPlayingResultRank", enum678);
        setField(term295418, term295418.getClass(), "contestNowPlayingSpecifier", "");
        setField(term295418, term295418.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term295418, term295418.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term295418, term295418.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term295418, term295418.getClass(), "rivalPdId", -1);
        setField(term295416, term295416.getClass(), "pdId", term295418);
        setIntField(term295416, term295416.getClass(), "pvId", -1724529322);
        setField(term295416, term295416.getClass(), "difficulty", enum679);
        setField(term295416, term295416.getClass(), "edition", enum680);
        setIntField(term295416, term295416.getClass(), "scriptVer", 1843465187);
        setIntField(term295416, term295416.getClass(), "score", 529595969);
        setField(term295416, term295416.getClass(), "challengeKind", enum681);
        setIntField(term295416, term295416.getClass(), "challengeResult", -1548733886);
        setField(term295416, term295416.getClass(), "clearResult", enum682);
        setIntField(term295416, term295416.getClass(), "vp", 1543539715);
        setIntField(term295416, term295416.getClass(), "coolCount", 1744599521);
        setIntField(term295416, term295416.getClass(), "coolPercent", -985141153);
        setIntField(term295416, term295416.getClass(), "fineCount", -1983740361);
        setIntField(term295416, term295416.getClass(), "finePercent", -1494716341);
        setIntField(term295416, term295416.getClass(), "safeCount", 816237851);
        setIntField(term295416, term295416.getClass(), "safePercent", -604114341);
        setIntField(term295416, term295416.getClass(), "sadCount", 1146236760);
        setIntField(term295416, term295416.getClass(), "sadPercent", 985801789);
        setIntField(term295416, term295416.getClass(), "wrongCount", -1628536749);
        setIntField(term295416, term295416.getClass(), "wrongPercent", -748022064);
        setIntField(term295416, term295416.getClass(), "maxCombo", -1745708025);
        setIntField(term295416, term295416.getClass(), "chanceTime", 790614624);
        setIntField(term295416, term295416.getClass(), "holdScore", 117387225);
        setIntField(term295416, term295416.getClass(), "attainPoint", 948347134);
        setIntField(term295416, term295416.getClass(), "skinId", -1552842218);
        setIntField(term295416, term295416.getClass(), "buttonSe", -157220068);
        setIntField(term295416, term295416.getClass(), "buttonSeVol", 141434141);
        setIntField(term295416, term295416.getClass(), "sliderSe", -288619829);
        setIntField(term295416, term295416.getClass(), "ChainSlideSe", -505635206);
        setIntField(term295416, term295416.getClass(), "SliderTouchSe", 932246615);
        setField(term295416, term295416.getClass(), "modules", "nhoHrZfnIN");
        setIntField(term295416, term295416.getClass(), "stageCompletion", 261281668);
        setIntField(term295416, term295416.getClass(), "slideScore", 1712273163);
        setIntField(term295416, term295416.getClass(), "isVocalChange", 234306621);
        setField(term295416, term295416.getClass(), "customizeItems", "ZkMALXpEAZ");
        setField(term295416, term295416.getClass(), "rhythmGameOptions", "tXfQjSqDzN");
        setIntField(term295416, term295416.getClass(), "screenShotCount", -1);
        setIntField(term296135, term296135.getClass(), "year", 2019);
        setShortField(term296135, term296135.getClass(), "month", (short) 7);
        setShortField(term296135, term296135.getClass(), "day", (short) 19);
        setField(term296134, term296134.getClass(), "date", term296135);
        setByteField(term296139, term296139.getClass(), "hour", (byte) 10);
        setByteField(term296139, term296139.getClass(), "minute", (byte) 54);
        setByteField(term296139, term296139.getClass(), "second", (byte) 55);
        setIntField(term296139, term296139.getClass(), "nano", 244650454);
        setField(term296134, term296134.getClass(), "time", term296139);
        setField(term295416, term295416.getClass(), "dateTime", term296134);
        term296144 = new Integer(1025525602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term296144;
        callMethod(klass, "setButtonSeVol", argTypes, term295416, args);
    }

};


