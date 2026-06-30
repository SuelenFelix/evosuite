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

public class PlayLog_setSafePercent_147175022056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257047;
     Object term257775;

    public PlayLog_setSafePercent_147175022056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257784 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term257783 = ((Class) term257784).getDeclaredField((String) "MISS");
        ((Field) term257783).setAccessible(true);
        Object enum584 = ((Field) term257783).get((Object) null);
        Class<? extends Object> term258161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term258160 = ((Class) term258161).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term258160).setAccessible(true);
        Object enum585 = ((Field) term258160).get((Object) null);
        Class<? extends Object> term258444 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term258443 = ((Class) term258444).getDeclaredField((String) "NORMAL");
        ((Field) term258443).setAccessible(true);
        Object enum586 = ((Field) term258443).get((Object) null);
        Class<? extends Object> term258719 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term258718 = ((Class) term258719).getDeclaredField((String) "ORIGINAL");
        ((Field) term258718).setAccessible(true);
        Object enum587 = ((Field) term258718).get((Object) null);
        Class<? extends Object> term258985 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term258984 = ((Class) term258985).getDeclaredField((String) "NONE");
        ((Field) term258984).setAccessible(true);
        Object enum588 = ((Field) term258984).get((Object) null);
        Class<? extends Object> term259626 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term259625 = ((Class) term259626).getDeclaredField((String) "HARD");
        ((Field) term259625).setAccessible(true);
        Object enum589 = ((Field) term259625).get((Object) null);
        Class<? extends Object> term259895 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term259894 = ((Class) term259895).getDeclaredField((String) "EXTRA");
        ((Field) term259894).setAccessible(true);
        Object enum590 = ((Field) term259894).get((Object) null);
        Class<? extends Object> term260152 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term260151 = ((Class) term260152).getDeclaredField((String) "UNDEFINED");
        ((Field) term260151).setAccessible(true);
        Object enum591 = ((Field) term260151).get((Object) null);
        Class<? extends Object> term260451 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term260450 = ((Class) term260451).getDeclaredField((String) "NO_CLEAR");
        ((Field) term260450).setAccessible(true);
        Object enum592 = ((Field) term260450).get((Object) null);
        term257047 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term257049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term257172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257770 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term257047, term257047.getClass(), "id", -1539859611880912454L);
        setLongField(term257049, term257049.getClass(), "id", 4100236067313034103L);
        setIntField(term257049, term257049.getClass(), "pdId", 1121247998);
        setField(term257049, term257049.getClass(), "playerName", "xxx");
        setIntField(term257049, term257049.getClass(), "vocaloidPoints", 300);
        setIntField(term257049, term257049.getClass(), "level", 1);
        setIntField(term257049, term257049.getClass(), "levelExp", -710001354);
        setField(term257049, term257049.getClass(), "levelTitle", "xxx");
        setIntField(term257049, term257049.getClass(), "plateId", -1);
        setIntField(term257049, term257049.getClass(), "plateEffectId", -1);
        setField(term257049, term257049.getClass(), "passwordStatus", enum584);
        setField(term257049, term257049.getClass(), "password", "**********");
        setBooleanField(term257049, term257049.getClass(), "preferPerPvModule", true);
        setBooleanField(term257049, term257049.getClass(), "preferCommonModule", true);
        setBooleanField(term257049, term257049.getClass(), "usePerPvSkin", false);
        setBooleanField(term257049, term257049.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term257049, term257049.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term257049, term257049.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term257049, term257049.getClass(), "usePerPvTouchSliderSe", true);
        setField(term257049, term257049.getClass(), "commonModule", "-999,-999,-999");
        setField(term257049, term257049.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term257173, term257173.getClass(), "year", 2026);
        setShortField(term257173, term257173.getClass(), "month", (short) 6);
        setShortField(term257173, term257173.getClass(), "day", (short) 29);
        setField(term257172, term257172.getClass(), "date", term257173);
        setByteField(term257177, term257177.getClass(), "hour", (byte) 4);
        setByteField(term257177, term257177.getClass(), "minute", (byte) 27);
        setByteField(term257177, term257177.getClass(), "second", (byte) 37);
        setIntField(term257177, term257177.getClass(), "nano", 901609000);
        setField(term257172, term257172.getClass(), "time", term257177);
        setField(term257049, term257049.getClass(), "commonModuleSetTime", term257172);
        setField(term257049, term257049.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term257049, term257049.getClass(), "commonSkin", -1);
        setIntField(term257049, term257049.getClass(), "headphoneVolume", 100);
        setBooleanField(term257049, term257049.getClass(), "buttonSeOn", true);
        setIntField(term257049, term257049.getClass(), "buttonSeVolume", 100);
        setIntField(term257049, term257049.getClass(), "sliderSeVolume", 100);
        setIntField(term257049, term257049.getClass(), "buttonSe", -1);
        setIntField(term257049, term257049.getClass(), "chainSlideSe", -1);
        setIntField(term257049, term257049.getClass(), "slideSe", -1);
        setIntField(term257049, term257049.getClass(), "sliderTouchSe", -1);
        setField(term257049, term257049.getClass(), "sortMode", enum585);
        setIntField(term257049, term257049.getClass(), "nextPvId", -1);
        setField(term257049, term257049.getClass(), "nextDifficulty", enum586);
        setField(term257049, term257049.getClass(), "nextEdition", enum587);
        setBooleanField(term257049, term257049.getClass(), "showInterimRanking", true);
        setBooleanField(term257049, term257049.getClass(), "showClearStatus", true);
        setBooleanField(term257049, term257049.getClass(), "showGreatBorder", true);
        setBooleanField(term257049, term257049.getClass(), "showExcellentBorder", true);
        setBooleanField(term257049, term257049.getClass(), "showRivalBorder", true);
        setBooleanField(term257049, term257049.getClass(), "showRgoSetting", true);
        setBooleanField(term257049, term257049.getClass(), "contestNowPlayingEnable", true);
        setIntField(term257049, term257049.getClass(), "contestNowPlayingId", -1);
        setIntField(term257049, term257049.getClass(), "contestNowPlayingValue", -1);
        setField(term257049, term257049.getClass(), "contestNowPlayingResultRank", enum588);
        setField(term257049, term257049.getClass(), "contestNowPlayingSpecifier", "");
        setField(term257049, term257049.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term257049, term257049.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term257049, term257049.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term257049, term257049.getClass(), "rivalPdId", -1);
        setField(term257047, term257047.getClass(), "pdId", term257049);
        setIntField(term257047, term257047.getClass(), "pvId", 2007404429);
        setField(term257047, term257047.getClass(), "difficulty", enum589);
        setField(term257047, term257047.getClass(), "edition", enum590);
        setIntField(term257047, term257047.getClass(), "scriptVer", 472580433);
        setIntField(term257047, term257047.getClass(), "score", 1189049164);
        setField(term257047, term257047.getClass(), "challengeKind", enum591);
        setIntField(term257047, term257047.getClass(), "challengeResult", -673413879);
        setField(term257047, term257047.getClass(), "clearResult", enum592);
        setIntField(term257047, term257047.getClass(), "vp", 1609778442);
        setIntField(term257047, term257047.getClass(), "coolCount", 524850421);
        setIntField(term257047, term257047.getClass(), "coolPercent", -1833121756);
        setIntField(term257047, term257047.getClass(), "fineCount", -1493632787);
        setIntField(term257047, term257047.getClass(), "finePercent", -1056969264);
        setIntField(term257047, term257047.getClass(), "safeCount", -709130701);
        setIntField(term257047, term257047.getClass(), "safePercent", 86144663);
        setIntField(term257047, term257047.getClass(), "sadCount", -1480903995);
        setIntField(term257047, term257047.getClass(), "sadPercent", -2111772603);
        setIntField(term257047, term257047.getClass(), "wrongCount", 637942911);
        setIntField(term257047, term257047.getClass(), "wrongPercent", -395396657);
        setIntField(term257047, term257047.getClass(), "maxCombo", 1677171453);
        setIntField(term257047, term257047.getClass(), "chanceTime", -2108979704);
        setIntField(term257047, term257047.getClass(), "holdScore", 1629835601);
        setIntField(term257047, term257047.getClass(), "attainPoint", 1866184476);
        setIntField(term257047, term257047.getClass(), "skinId", -17998574);
        setIntField(term257047, term257047.getClass(), "buttonSe", 145080354);
        setIntField(term257047, term257047.getClass(), "buttonSeVol", -2087321012);
        setIntField(term257047, term257047.getClass(), "sliderSe", -1613074612);
        setIntField(term257047, term257047.getClass(), "ChainSlideSe", 1054908502);
        setIntField(term257047, term257047.getClass(), "SliderTouchSe", -1226802566);
        setField(term257047, term257047.getClass(), "modules", "OYbzXylRWW");
        setIntField(term257047, term257047.getClass(), "stageCompletion", 1162813858);
        setIntField(term257047, term257047.getClass(), "slideScore", 494596414);
        setIntField(term257047, term257047.getClass(), "isVocalChange", 1226377461);
        setField(term257047, term257047.getClass(), "customizeItems", "DSNsTGYXDF");
        setField(term257047, term257047.getClass(), "rhythmGameOptions", "sQvGcVjdEx");
        setIntField(term257047, term257047.getClass(), "screenShotCount", -1);
        setIntField(term257766, term257766.getClass(), "year", 2025);
        setShortField(term257766, term257766.getClass(), "month", (short) 3);
        setShortField(term257766, term257766.getClass(), "day", (short) 28);
        setField(term257765, term257765.getClass(), "date", term257766);
        setByteField(term257770, term257770.getClass(), "hour", (byte) 19);
        setByteField(term257770, term257770.getClass(), "minute", (byte) 56);
        setByteField(term257770, term257770.getClass(), "second", (byte) 52);
        setIntField(term257770, term257770.getClass(), "nano", 738558930);
        setField(term257765, term257765.getClass(), "time", term257770);
        setField(term257047, term257047.getClass(), "dateTime", term257765);
        term257775 = new Integer(-1540486514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257775;
        callMethod(klass, "setSafePercent", argTypes, term257047, args);
    }

};


