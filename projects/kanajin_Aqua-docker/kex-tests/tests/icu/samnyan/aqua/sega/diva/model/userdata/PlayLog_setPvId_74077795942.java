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

public class PlayLog_setPvId_74077795942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206317;
     Object term207045;

    public PlayLog_setPvId_74077795942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207054 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term207053 = ((Class) term207054).getDeclaredField((String) "MISS");
        ((Field) term207053).setAccessible(true);
        Object enum463 = ((Field) term207053).get((Object) null);
        Class<? extends Object> term207431 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term207430 = ((Class) term207431).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term207430).setAccessible(true);
        Object enum464 = ((Field) term207430).get((Object) null);
        Class<? extends Object> term207714 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term207713 = ((Class) term207714).getDeclaredField((String) "NORMAL");
        ((Field) term207713).setAccessible(true);
        Object enum465 = ((Field) term207713).get((Object) null);
        Class<? extends Object> term207989 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term207988 = ((Class) term207989).getDeclaredField((String) "ORIGINAL");
        ((Field) term207988).setAccessible(true);
        Object enum466 = ((Field) term207988).get((Object) null);
        Class<? extends Object> term208255 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term208254 = ((Class) term208255).getDeclaredField((String) "NONE");
        ((Field) term208254).setAccessible(true);
        Object enum467 = ((Field) term208254).get((Object) null);
        Class<? extends Object> term208896 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term208895 = ((Class) term208896).getDeclaredField((String) "EXTREME");
        ((Field) term208895).setAccessible(true);
        Object enum468 = ((Field) term208895).get((Object) null);
        Class<? extends Object> term209174 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term209173 = ((Class) term209174).getDeclaredField((String) "EXTRA");
        ((Field) term209173).setAccessible(true);
        Object enum469 = ((Field) term209173).get((Object) null);
        Class<? extends Object> term209431 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term209430 = ((Class) term209431).getDeclaredField((String) "PERFECT");
        ((Field) term209430).setAccessible(true);
        Object enum470 = ((Field) term209430).get((Object) null);
        Class<? extends Object> term209724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term209723 = ((Class) term209724).getDeclaredField((String) "PERFECT");
        ((Field) term209723).setAccessible(true);
        Object enum471 = ((Field) term209723).get((Object) null);
        term206317 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term206319 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term206442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207040 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206317, term206317.getClass(), "id", -2255965562447970862L);
        setLongField(term206319, term206319.getClass(), "id", 148047808219672941L);
        setIntField(term206319, term206319.getClass(), "pdId", -1005498887);
        setField(term206319, term206319.getClass(), "playerName", "xxx");
        setIntField(term206319, term206319.getClass(), "vocaloidPoints", 300);
        setIntField(term206319, term206319.getClass(), "level", 1);
        setIntField(term206319, term206319.getClass(), "levelExp", 1329150584);
        setField(term206319, term206319.getClass(), "levelTitle", "xxx");
        setIntField(term206319, term206319.getClass(), "plateId", -1);
        setIntField(term206319, term206319.getClass(), "plateEffectId", -1);
        setField(term206319, term206319.getClass(), "passwordStatus", enum463);
        setField(term206319, term206319.getClass(), "password", "**********");
        setBooleanField(term206319, term206319.getClass(), "preferPerPvModule", true);
        setBooleanField(term206319, term206319.getClass(), "preferCommonModule", true);
        setBooleanField(term206319, term206319.getClass(), "usePerPvSkin", false);
        setBooleanField(term206319, term206319.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term206319, term206319.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term206319, term206319.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term206319, term206319.getClass(), "usePerPvTouchSliderSe", true);
        setField(term206319, term206319.getClass(), "commonModule", "-999,-999,-999");
        setField(term206319, term206319.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term206443, term206443.getClass(), "year", 2026);
        setShortField(term206443, term206443.getClass(), "month", (short) 6);
        setShortField(term206443, term206443.getClass(), "day", (short) 29);
        setField(term206442, term206442.getClass(), "date", term206443);
        setByteField(term206447, term206447.getClass(), "hour", (byte) 4);
        setByteField(term206447, term206447.getClass(), "minute", (byte) 27);
        setByteField(term206447, term206447.getClass(), "second", (byte) 34);
        setIntField(term206447, term206447.getClass(), "nano", 320738000);
        setField(term206442, term206442.getClass(), "time", term206447);
        setField(term206319, term206319.getClass(), "commonModuleSetTime", term206442);
        setField(term206319, term206319.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term206319, term206319.getClass(), "commonSkin", -1);
        setIntField(term206319, term206319.getClass(), "headphoneVolume", 100);
        setBooleanField(term206319, term206319.getClass(), "buttonSeOn", true);
        setIntField(term206319, term206319.getClass(), "buttonSeVolume", 100);
        setIntField(term206319, term206319.getClass(), "sliderSeVolume", 100);
        setIntField(term206319, term206319.getClass(), "buttonSe", -1);
        setIntField(term206319, term206319.getClass(), "chainSlideSe", -1);
        setIntField(term206319, term206319.getClass(), "slideSe", -1);
        setIntField(term206319, term206319.getClass(), "sliderTouchSe", -1);
        setField(term206319, term206319.getClass(), "sortMode", enum464);
        setIntField(term206319, term206319.getClass(), "nextPvId", -1);
        setField(term206319, term206319.getClass(), "nextDifficulty", enum465);
        setField(term206319, term206319.getClass(), "nextEdition", enum466);
        setBooleanField(term206319, term206319.getClass(), "showInterimRanking", true);
        setBooleanField(term206319, term206319.getClass(), "showClearStatus", true);
        setBooleanField(term206319, term206319.getClass(), "showGreatBorder", true);
        setBooleanField(term206319, term206319.getClass(), "showExcellentBorder", true);
        setBooleanField(term206319, term206319.getClass(), "showRivalBorder", true);
        setBooleanField(term206319, term206319.getClass(), "showRgoSetting", true);
        setBooleanField(term206319, term206319.getClass(), "contestNowPlayingEnable", true);
        setIntField(term206319, term206319.getClass(), "contestNowPlayingId", -1);
        setIntField(term206319, term206319.getClass(), "contestNowPlayingValue", -1);
        setField(term206319, term206319.getClass(), "contestNowPlayingResultRank", enum467);
        setField(term206319, term206319.getClass(), "contestNowPlayingSpecifier", "");
        setField(term206319, term206319.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term206319, term206319.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term206319, term206319.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term206319, term206319.getClass(), "rivalPdId", -1);
        setField(term206317, term206317.getClass(), "pdId", term206319);
        setIntField(term206317, term206317.getClass(), "pvId", -1825382367);
        setField(term206317, term206317.getClass(), "difficulty", enum468);
        setField(term206317, term206317.getClass(), "edition", enum469);
        setIntField(term206317, term206317.getClass(), "scriptVer", -1791371074);
        setIntField(term206317, term206317.getClass(), "score", -1151122332);
        setField(term206317, term206317.getClass(), "challengeKind", enum470);
        setIntField(term206317, term206317.getClass(), "challengeResult", 953387911);
        setField(term206317, term206317.getClass(), "clearResult", enum471);
        setIntField(term206317, term206317.getClass(), "vp", -1550025613);
        setIntField(term206317, term206317.getClass(), "coolCount", 814617314);
        setIntField(term206317, term206317.getClass(), "coolPercent", -159489307);
        setIntField(term206317, term206317.getClass(), "fineCount", 1317020952);
        setIntField(term206317, term206317.getClass(), "finePercent", -742710703);
        setIntField(term206317, term206317.getClass(), "safeCount", -355505521);
        setIntField(term206317, term206317.getClass(), "safePercent", 1227316523);
        setIntField(term206317, term206317.getClass(), "sadCount", -58633039);
        setIntField(term206317, term206317.getClass(), "sadPercent", 448061908);
        setIntField(term206317, term206317.getClass(), "wrongCount", -1268483887);
        setIntField(term206317, term206317.getClass(), "wrongPercent", -1929689681);
        setIntField(term206317, term206317.getClass(), "maxCombo", -91240911);
        setIntField(term206317, term206317.getClass(), "chanceTime", -321227954);
        setIntField(term206317, term206317.getClass(), "holdScore", 373810833);
        setIntField(term206317, term206317.getClass(), "attainPoint", -215979293);
        setIntField(term206317, term206317.getClass(), "skinId", -19567889);
        setIntField(term206317, term206317.getClass(), "buttonSe", 693500318);
        setIntField(term206317, term206317.getClass(), "buttonSeVol", 1702404702);
        setIntField(term206317, term206317.getClass(), "sliderSe", 1141592999);
        setIntField(term206317, term206317.getClass(), "ChainSlideSe", 848113442);
        setIntField(term206317, term206317.getClass(), "SliderTouchSe", 793974213);
        setField(term206317, term206317.getClass(), "modules", "JDaAnsVTGV");
        setIntField(term206317, term206317.getClass(), "stageCompletion", 722546287);
        setIntField(term206317, term206317.getClass(), "slideScore", -2060284160);
        setIntField(term206317, term206317.getClass(), "isVocalChange", -568450686);
        setField(term206317, term206317.getClass(), "customizeItems", "mLUZFTfjle");
        setField(term206317, term206317.getClass(), "rhythmGameOptions", "xIeFjkHkOe");
        setIntField(term206317, term206317.getClass(), "screenShotCount", -1);
        setIntField(term207036, term207036.getClass(), "year", 2020);
        setShortField(term207036, term207036.getClass(), "month", (short) 5);
        setShortField(term207036, term207036.getClass(), "day", (short) 18);
        setField(term207035, term207035.getClass(), "date", term207036);
        setByteField(term207040, term207040.getClass(), "hour", (byte) 5);
        setByteField(term207040, term207040.getClass(), "minute", (byte) 46);
        setByteField(term207040, term207040.getClass(), "second", (byte) 13);
        setIntField(term207040, term207040.getClass(), "nano", 45893173);
        setField(term207035, term207035.getClass(), "time", term207040);
        setField(term206317, term206317.getClass(), "dateTime", term207035);
        term207045 = new Integer(1314660281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term207045;
        callMethod(klass, "setPvId", argTypes, term206317, args);
    }

};


