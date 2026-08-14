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

public class PlayLog_getVp_132360619211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94647;

    public PlayLog_getVp_132360619211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95385 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term95384 = ((Class) term95385).getDeclaredField((String) "MISS");
        ((Field) term95384).setAccessible(true);
        Object enum201 = ((Field) term95384).get((Object) null);
        Class<? extends Object> term95762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term95761 = ((Class) term95762).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term95761).setAccessible(true);
        Object enum202 = ((Field) term95761).get((Object) null);
        Class<? extends Object> term96045 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term96044 = ((Class) term96045).getDeclaredField((String) "NORMAL");
        ((Field) term96044).setAccessible(true);
        Object enum203 = ((Field) term96044).get((Object) null);
        Class<? extends Object> term96320 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term96319 = ((Class) term96320).getDeclaredField((String) "ORIGINAL");
        ((Field) term96319).setAccessible(true);
        Object enum204 = ((Field) term96319).get((Object) null);
        Class<? extends Object> term96586 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term96585 = ((Class) term96586).getDeclaredField((String) "NONE");
        ((Field) term96585).setAccessible(true);
        Object enum205 = ((Field) term96585).get((Object) null);
        Class<? extends Object> term97227 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term97226 = ((Class) term97227).getDeclaredField((String) "EXTREME");
        ((Field) term97226).setAccessible(true);
        Object enum206 = ((Field) term97226).get((Object) null);
        Class<? extends Object> term97505 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term97504 = ((Class) term97505).getDeclaredField((String) "EXTRA");
        ((Field) term97504).setAccessible(true);
        Object enum207 = ((Field) term97504).get((Object) null);
        Class<? extends Object> term97762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term97761 = ((Class) term97762).getDeclaredField((String) "EXCELLENT");
        ((Field) term97761).setAccessible(true);
        Object enum208 = ((Field) term97761).get((Object) null);
        Class<? extends Object> term98061 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term98060 = ((Class) term98061).getDeclaredField((String) "STANDARD");
        ((Field) term98060).setAccessible(true);
        Object enum209 = ((Field) term98060).get((Object) null);
        term94647 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term94649 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term94772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94777 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94647, term94647.getClass(), "id", 414749984815662075L);
        setLongField(term94649, term94649.getClass(), "id", 463622836963501975L);
        setIntField(term94649, term94649.getClass(), "pdId", 499519708);
        setField(term94649, term94649.getClass(), "playerName", "xxx");
        setIntField(term94649, term94649.getClass(), "vocaloidPoints", 300);
        setIntField(term94649, term94649.getClass(), "level", 1);
        setIntField(term94649, term94649.getClass(), "levelExp", 1501165033);
        setField(term94649, term94649.getClass(), "levelTitle", "xxx");
        setIntField(term94649, term94649.getClass(), "plateId", -1);
        setIntField(term94649, term94649.getClass(), "plateEffectId", -1);
        setField(term94649, term94649.getClass(), "passwordStatus", enum201);
        setField(term94649, term94649.getClass(), "password", "**********");
        setBooleanField(term94649, term94649.getClass(), "preferPerPvModule", true);
        setBooleanField(term94649, term94649.getClass(), "preferCommonModule", true);
        setBooleanField(term94649, term94649.getClass(), "usePerPvSkin", false);
        setBooleanField(term94649, term94649.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term94649, term94649.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term94649, term94649.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term94649, term94649.getClass(), "usePerPvTouchSliderSe", false);
        setField(term94649, term94649.getClass(), "commonModule", "-999,-999,-999");
        setField(term94649, term94649.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term94773, term94773.getClass(), "year", 2026);
        setShortField(term94773, term94773.getClass(), "month", (short) 8);
        setShortField(term94773, term94773.getClass(), "day", (short) 12);
        setField(term94772, term94772.getClass(), "date", term94773);
        setByteField(term94777, term94777.getClass(), "hour", (byte) 2);
        setByteField(term94777, term94777.getClass(), "minute", (byte) 2);
        setByteField(term94777, term94777.getClass(), "second", (byte) 42);
        setIntField(term94777, term94777.getClass(), "nano", 836335000);
        setField(term94772, term94772.getClass(), "time", term94777);
        setField(term94649, term94649.getClass(), "commonModuleSetTime", term94772);
        setField(term94649, term94649.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term94649, term94649.getClass(), "commonSkin", -1);
        setIntField(term94649, term94649.getClass(), "headphoneVolume", 100);
        setBooleanField(term94649, term94649.getClass(), "buttonSeOn", true);
        setIntField(term94649, term94649.getClass(), "buttonSeVolume", 100);
        setIntField(term94649, term94649.getClass(), "sliderSeVolume", 100);
        setIntField(term94649, term94649.getClass(), "buttonSe", -1);
        setIntField(term94649, term94649.getClass(), "chainSlideSe", -1);
        setIntField(term94649, term94649.getClass(), "slideSe", -1);
        setIntField(term94649, term94649.getClass(), "sliderTouchSe", -1);
        setField(term94649, term94649.getClass(), "sortMode", enum202);
        setIntField(term94649, term94649.getClass(), "nextPvId", -1);
        setField(term94649, term94649.getClass(), "nextDifficulty", enum203);
        setField(term94649, term94649.getClass(), "nextEdition", enum204);
        setBooleanField(term94649, term94649.getClass(), "showInterimRanking", true);
        setBooleanField(term94649, term94649.getClass(), "showClearStatus", true);
        setBooleanField(term94649, term94649.getClass(), "showGreatBorder", true);
        setBooleanField(term94649, term94649.getClass(), "showExcellentBorder", true);
        setBooleanField(term94649, term94649.getClass(), "showRivalBorder", true);
        setBooleanField(term94649, term94649.getClass(), "showRgoSetting", true);
        setBooleanField(term94649, term94649.getClass(), "contestNowPlayingEnable", true);
        setIntField(term94649, term94649.getClass(), "contestNowPlayingId", -1);
        setIntField(term94649, term94649.getClass(), "contestNowPlayingValue", -1);
        setField(term94649, term94649.getClass(), "contestNowPlayingResultRank", enum205);
        setField(term94649, term94649.getClass(), "contestNowPlayingSpecifier", "");
        setField(term94649, term94649.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term94649, term94649.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term94649, term94649.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term94649, term94649.getClass(), "rivalPdId", -1);
        setField(term94647, term94647.getClass(), "pdId", term94649);
        setIntField(term94647, term94647.getClass(), "pvId", 510162332);
        setField(term94647, term94647.getClass(), "difficulty", enum206);
        setField(term94647, term94647.getClass(), "edition", enum207);
        setIntField(term94647, term94647.getClass(), "scriptVer", 888506903);
        setIntField(term94647, term94647.getClass(), "score", 200252898);
        setField(term94647, term94647.getClass(), "challengeKind", enum208);
        setIntField(term94647, term94647.getClass(), "challengeResult", -1831826725);
        setField(term94647, term94647.getClass(), "clearResult", enum209);
        setIntField(term94647, term94647.getClass(), "vp", 752152965);
        setIntField(term94647, term94647.getClass(), "coolCount", -1577069773);
        setIntField(term94647, term94647.getClass(), "coolPercent", -266625190);
        setIntField(term94647, term94647.getClass(), "fineCount", 489201218);
        setIntField(term94647, term94647.getClass(), "finePercent", 464181937);
        setIntField(term94647, term94647.getClass(), "safeCount", -1455526612);
        setIntField(term94647, term94647.getClass(), "safePercent", -941356098);
        setIntField(term94647, term94647.getClass(), "sadCount", -201517446);
        setIntField(term94647, term94647.getClass(), "sadPercent", -97742366);
        setIntField(term94647, term94647.getClass(), "wrongCount", 1638851942);
        setIntField(term94647, term94647.getClass(), "wrongPercent", 1374790203);
        setIntField(term94647, term94647.getClass(), "maxCombo", 1160010161);
        setIntField(term94647, term94647.getClass(), "chanceTime", -423900705);
        setIntField(term94647, term94647.getClass(), "holdScore", -525570815);
        setIntField(term94647, term94647.getClass(), "attainPoint", 754055848);
        setIntField(term94647, term94647.getClass(), "skinId", -19246901);
        setIntField(term94647, term94647.getClass(), "buttonSe", -370828664);
        setIntField(term94647, term94647.getClass(), "buttonSeVol", 1168633950);
        setIntField(term94647, term94647.getClass(), "sliderSe", 1607082164);
        setIntField(term94647, term94647.getClass(), "ChainSlideSe", 1890399366);
        setIntField(term94647, term94647.getClass(), "SliderTouchSe", -1867239125);
        setField(term94647, term94647.getClass(), "modules", "SbAoxhfrkn");
        setIntField(term94647, term94647.getClass(), "stageCompletion", 952869601);
        setIntField(term94647, term94647.getClass(), "slideScore", 91958879);
        setIntField(term94647, term94647.getClass(), "isVocalChange", -645429025);
        setField(term94647, term94647.getClass(), "customizeItems", "kuTXqwMtDB");
        setField(term94647, term94647.getClass(), "rhythmGameOptions", "Ghbwtircqb");
        setIntField(term94647, term94647.getClass(), "screenShotCount", -1);
        setIntField(term95369, term95369.getClass(), "year", 2021);
        setShortField(term95369, term95369.getClass(), "month", (short) 9);
        setShortField(term95369, term95369.getClass(), "day", (short) 7);
        setField(term95368, term95368.getClass(), "date", term95369);
        setByteField(term95373, term95373.getClass(), "hour", (byte) 5);
        setByteField(term95373, term95373.getClass(), "minute", (byte) 25);
        setByteField(term95373, term95373.getClass(), "second", (byte) 7);
        setIntField(term95373, term95373.getClass(), "nano", 755924076);
        setField(term95368, term95368.getClass(), "time", term95373);
        setField(term94647, term94647.getClass(), "dateTime", term95368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVp", argTypes, term94647, args);
    }

};


