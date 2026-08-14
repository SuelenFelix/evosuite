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

public class PlayLog_getPvId_5297881373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66252;

    public PlayLog_getPvId_5297881373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term66982 = ((Class) term66983).getDeclaredField((String) "MISS");
        ((Field) term66982).setAccessible(true);
        Object enum134 = ((Field) term66982).get((Object) null);
        Class<? extends Object> term67360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term67359 = ((Class) term67360).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term67359).setAccessible(true);
        Object enum135 = ((Field) term67359).get((Object) null);
        Class<? extends Object> term67643 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term67642 = ((Class) term67643).getDeclaredField((String) "NORMAL");
        ((Field) term67642).setAccessible(true);
        Object enum136 = ((Field) term67642).get((Object) null);
        Class<? extends Object> term67918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term67917 = ((Class) term67918).getDeclaredField((String) "ORIGINAL");
        ((Field) term67917).setAccessible(true);
        Object enum137 = ((Field) term67917).get((Object) null);
        Class<? extends Object> term68184 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term68183 = ((Class) term68184).getDeclaredField((String) "NONE");
        ((Field) term68183).setAccessible(true);
        Object enum138 = ((Field) term68183).get((Object) null);
        Class<? extends Object> term68825 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term68824 = ((Class) term68825).getDeclaredField((String) "UNDEFINED");
        ((Field) term68824).setAccessible(true);
        Object enum139 = ((Field) term68824).get((Object) null);
        Class<? extends Object> term69109 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term69108 = ((Class) term69109).getDeclaredField((String) "COMPLETED");
        ((Field) term69108).setAccessible(true);
        Object enum140 = ((Field) term69108).get((Object) null);
        Class<? extends Object> term69408 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term69407 = ((Class) term69408).getDeclaredField((String) "EXCELLENT");
        ((Field) term69407).setAccessible(true);
        Object enum141 = ((Field) term69407).get((Object) null);
        term66252 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term66254 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term66377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66971 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66252, term66252.getClass(), "id", -5788180182343976541L);
        setLongField(term66254, term66254.getClass(), "id", 2936323121573284007L);
        setIntField(term66254, term66254.getClass(), "pdId", -1970452551);
        setField(term66254, term66254.getClass(), "playerName", "xxx");
        setIntField(term66254, term66254.getClass(), "vocaloidPoints", 300);
        setIntField(term66254, term66254.getClass(), "level", 1);
        setIntField(term66254, term66254.getClass(), "levelExp", -1896376975);
        setField(term66254, term66254.getClass(), "levelTitle", "xxx");
        setIntField(term66254, term66254.getClass(), "plateId", -1);
        setIntField(term66254, term66254.getClass(), "plateEffectId", -1);
        setField(term66254, term66254.getClass(), "passwordStatus", enum134);
        setField(term66254, term66254.getClass(), "password", "**********");
        setBooleanField(term66254, term66254.getClass(), "preferPerPvModule", true);
        setBooleanField(term66254, term66254.getClass(), "preferCommonModule", false);
        setBooleanField(term66254, term66254.getClass(), "usePerPvSkin", false);
        setBooleanField(term66254, term66254.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term66254, term66254.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term66254, term66254.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term66254, term66254.getClass(), "usePerPvTouchSliderSe", true);
        setField(term66254, term66254.getClass(), "commonModule", "-999,-999,-999");
        setField(term66254, term66254.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term66378, term66378.getClass(), "year", 2026);
        setShortField(term66378, term66378.getClass(), "month", (short) 8);
        setShortField(term66378, term66378.getClass(), "day", (short) 12);
        setField(term66377, term66377.getClass(), "date", term66378);
        setByteField(term66382, term66382.getClass(), "hour", (byte) 2);
        setByteField(term66382, term66382.getClass(), "minute", (byte) 2);
        setByteField(term66382, term66382.getClass(), "second", (byte) 40);
        setIntField(term66382, term66382.getClass(), "nano", 756412000);
        setField(term66377, term66377.getClass(), "time", term66382);
        setField(term66254, term66254.getClass(), "commonModuleSetTime", term66377);
        setField(term66254, term66254.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term66254, term66254.getClass(), "commonSkin", -1);
        setIntField(term66254, term66254.getClass(), "headphoneVolume", 100);
        setBooleanField(term66254, term66254.getClass(), "buttonSeOn", true);
        setIntField(term66254, term66254.getClass(), "buttonSeVolume", 100);
        setIntField(term66254, term66254.getClass(), "sliderSeVolume", 100);
        setIntField(term66254, term66254.getClass(), "buttonSe", -1);
        setIntField(term66254, term66254.getClass(), "chainSlideSe", -1);
        setIntField(term66254, term66254.getClass(), "slideSe", -1);
        setIntField(term66254, term66254.getClass(), "sliderTouchSe", -1);
        setField(term66254, term66254.getClass(), "sortMode", enum135);
        setIntField(term66254, term66254.getClass(), "nextPvId", -1);
        setField(term66254, term66254.getClass(), "nextDifficulty", enum136);
        setField(term66254, term66254.getClass(), "nextEdition", enum137);
        setBooleanField(term66254, term66254.getClass(), "showInterimRanking", true);
        setBooleanField(term66254, term66254.getClass(), "showClearStatus", true);
        setBooleanField(term66254, term66254.getClass(), "showGreatBorder", true);
        setBooleanField(term66254, term66254.getClass(), "showExcellentBorder", true);
        setBooleanField(term66254, term66254.getClass(), "showRivalBorder", true);
        setBooleanField(term66254, term66254.getClass(), "showRgoSetting", true);
        setBooleanField(term66254, term66254.getClass(), "contestNowPlayingEnable", false);
        setIntField(term66254, term66254.getClass(), "contestNowPlayingId", -1);
        setIntField(term66254, term66254.getClass(), "contestNowPlayingValue", -1);
        setField(term66254, term66254.getClass(), "contestNowPlayingResultRank", enum138);
        setField(term66254, term66254.getClass(), "contestNowPlayingSpecifier", "");
        setField(term66254, term66254.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term66254, term66254.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term66254, term66254.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term66254, term66254.getClass(), "rivalPdId", -1);
        setField(term66252, term66252.getClass(), "pdId", term66254);
        setIntField(term66252, term66252.getClass(), "pvId", 729658803);
        setField(term66252, term66252.getClass(), "difficulty", enum139);
        setField(term66252, term66252.getClass(), "edition", enum137);
        setIntField(term66252, term66252.getClass(), "scriptVer", 114754804);
        setIntField(term66252, term66252.getClass(), "score", 1687361082);
        setField(term66252, term66252.getClass(), "challengeKind", enum140);
        setIntField(term66252, term66252.getClass(), "challengeResult", 584893196);
        setField(term66252, term66252.getClass(), "clearResult", enum141);
        setIntField(term66252, term66252.getClass(), "vp", 497269071);
        setIntField(term66252, term66252.getClass(), "coolCount", -1899301124);
        setIntField(term66252, term66252.getClass(), "coolPercent", -1882480155);
        setIntField(term66252, term66252.getClass(), "fineCount", -1410220680);
        setIntField(term66252, term66252.getClass(), "finePercent", 389427431);
        setIntField(term66252, term66252.getClass(), "safeCount", -1945706126);
        setIntField(term66252, term66252.getClass(), "safePercent", 1152356969);
        setIntField(term66252, term66252.getClass(), "sadCount", -1667990367);
        setIntField(term66252, term66252.getClass(), "sadPercent", -1214628358);
        setIntField(term66252, term66252.getClass(), "wrongCount", 1102721075);
        setIntField(term66252, term66252.getClass(), "wrongPercent", -426764678);
        setIntField(term66252, term66252.getClass(), "maxCombo", -1222614956);
        setIntField(term66252, term66252.getClass(), "chanceTime", -1870495012);
        setIntField(term66252, term66252.getClass(), "holdScore", -1310015129);
        setIntField(term66252, term66252.getClass(), "attainPoint", -2104981311);
        setIntField(term66252, term66252.getClass(), "skinId", -571169753);
        setIntField(term66252, term66252.getClass(), "buttonSe", 318591690);
        setIntField(term66252, term66252.getClass(), "buttonSeVol", -165587447);
        setIntField(term66252, term66252.getClass(), "sliderSe", -1347358701);
        setIntField(term66252, term66252.getClass(), "ChainSlideSe", 806595993);
        setIntField(term66252, term66252.getClass(), "SliderTouchSe", 548228925);
        setField(term66252, term66252.getClass(), "modules", "RMFIsYGgne");
        setIntField(term66252, term66252.getClass(), "stageCompletion", -749861210);
        setIntField(term66252, term66252.getClass(), "slideScore", 1694224101);
        setIntField(term66252, term66252.getClass(), "isVocalChange", 937859191);
        setField(term66252, term66252.getClass(), "customizeItems", "NRdvgJlhkX");
        setField(term66252, term66252.getClass(), "rhythmGameOptions", "uuaPigETmJ");
        setIntField(term66252, term66252.getClass(), "screenShotCount", -1);
        setIntField(term66967, term66967.getClass(), "year", 2026);
        setShortField(term66967, term66967.getClass(), "month", (short) 12);
        setShortField(term66967, term66967.getClass(), "day", (short) 14);
        setField(term66966, term66966.getClass(), "date", term66967);
        setByteField(term66971, term66971.getClass(), "hour", (byte) 16);
        setByteField(term66971, term66971.getClass(), "minute", (byte) 34);
        setByteField(term66971, term66971.getClass(), "second", (byte) 9);
        setIntField(term66971, term66971.getClass(), "nano", 518326996);
        setField(term66966, term66966.getClass(), "time", term66971);
        setField(term66252, term66252.getClass(), "dateTime", term66966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term66252, args);
    }

};


