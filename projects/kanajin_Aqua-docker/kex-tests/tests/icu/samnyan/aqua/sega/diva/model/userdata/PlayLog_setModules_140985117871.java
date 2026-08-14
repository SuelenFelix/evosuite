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

public class PlayLog_setModules_140985117871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309451;

    public PlayLog_setModules_140985117871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term310189 = ((Class) term310190).getDeclaredField((String) "MISS");
        ((Field) term310189).setAccessible(true);
        Object enum707 = ((Field) term310189).get((Object) null);
        Class<? extends Object> term310567 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term310566 = ((Class) term310567).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term310566).setAccessible(true);
        Object enum708 = ((Field) term310566).get((Object) null);
        Class<? extends Object> term310850 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term310849 = ((Class) term310850).getDeclaredField((String) "NORMAL");
        ((Field) term310849).setAccessible(true);
        Object enum709 = ((Field) term310849).get((Object) null);
        Class<? extends Object> term311125 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term311124 = ((Class) term311125).getDeclaredField((String) "ORIGINAL");
        ((Field) term311124).setAccessible(true);
        Object enum710 = ((Field) term311124).get((Object) null);
        Class<? extends Object> term311391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term311390 = ((Class) term311391).getDeclaredField((String) "NONE");
        ((Field) term311390).setAccessible(true);
        Object enum711 = ((Field) term311390).get((Object) null);
        Class<? extends Object> term312032 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term312031 = ((Class) term312032).getDeclaredField((String) "UNDEFINED");
        ((Field) term312031).setAccessible(true);
        Object enum712 = ((Field) term312031).get((Object) null);
        Class<? extends Object> term312316 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term312315 = ((Class) term312316).getDeclaredField((String) "UNDEFINED");
        ((Field) term312315).setAccessible(true);
        Object enum713 = ((Field) term312315).get((Object) null);
        Class<? extends Object> term312615 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term312614 = ((Class) term312615).getDeclaredField((String) "CHEAP");
        ((Field) term312614).setAccessible(true);
        Object enum714 = ((Field) term312614).get((Object) null);
        term309451 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term309453 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term309576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term309451, term309451.getClass(), "id", -8327432141027603933L);
        setLongField(term309453, term309453.getClass(), "id", -433040798405298080L);
        setIntField(term309453, term309453.getClass(), "pdId", 145571200);
        setField(term309453, term309453.getClass(), "playerName", "xxx");
        setIntField(term309453, term309453.getClass(), "vocaloidPoints", 300);
        setIntField(term309453, term309453.getClass(), "level", 1);
        setIntField(term309453, term309453.getClass(), "levelExp", -81919234);
        setField(term309453, term309453.getClass(), "levelTitle", "xxx");
        setIntField(term309453, term309453.getClass(), "plateId", -1);
        setIntField(term309453, term309453.getClass(), "plateEffectId", -1);
        setField(term309453, term309453.getClass(), "passwordStatus", enum707);
        setField(term309453, term309453.getClass(), "password", "**********");
        setBooleanField(term309453, term309453.getClass(), "preferPerPvModule", true);
        setBooleanField(term309453, term309453.getClass(), "preferCommonModule", true);
        setBooleanField(term309453, term309453.getClass(), "usePerPvSkin", false);
        setBooleanField(term309453, term309453.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term309453, term309453.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term309453, term309453.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term309453, term309453.getClass(), "usePerPvTouchSliderSe", false);
        setField(term309453, term309453.getClass(), "commonModule", "-999,-999,-999");
        setField(term309453, term309453.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term309577, term309577.getClass(), "year", 2026);
        setShortField(term309577, term309577.getClass(), "month", (short) 8);
        setShortField(term309577, term309577.getClass(), "day", (short) 12);
        setField(term309576, term309576.getClass(), "date", term309577);
        setByteField(term309581, term309581.getClass(), "hour", (byte) 2);
        setByteField(term309581, term309581.getClass(), "minute", (byte) 2);
        setByteField(term309581, term309581.getClass(), "second", (byte) 58);
        setIntField(term309581, term309581.getClass(), "nano", 14851000);
        setField(term309576, term309576.getClass(), "time", term309581);
        setField(term309453, term309453.getClass(), "commonModuleSetTime", term309576);
        setField(term309453, term309453.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term309453, term309453.getClass(), "commonSkin", -1);
        setIntField(term309453, term309453.getClass(), "headphoneVolume", 100);
        setBooleanField(term309453, term309453.getClass(), "buttonSeOn", true);
        setIntField(term309453, term309453.getClass(), "buttonSeVolume", 100);
        setIntField(term309453, term309453.getClass(), "sliderSeVolume", 100);
        setIntField(term309453, term309453.getClass(), "buttonSe", -1);
        setIntField(term309453, term309453.getClass(), "chainSlideSe", -1);
        setIntField(term309453, term309453.getClass(), "slideSe", -1);
        setIntField(term309453, term309453.getClass(), "sliderTouchSe", -1);
        setField(term309453, term309453.getClass(), "sortMode", enum708);
        setIntField(term309453, term309453.getClass(), "nextPvId", -1);
        setField(term309453, term309453.getClass(), "nextDifficulty", enum709);
        setField(term309453, term309453.getClass(), "nextEdition", enum710);
        setBooleanField(term309453, term309453.getClass(), "showInterimRanking", true);
        setBooleanField(term309453, term309453.getClass(), "showClearStatus", true);
        setBooleanField(term309453, term309453.getClass(), "showGreatBorder", true);
        setBooleanField(term309453, term309453.getClass(), "showExcellentBorder", true);
        setBooleanField(term309453, term309453.getClass(), "showRivalBorder", true);
        setBooleanField(term309453, term309453.getClass(), "showRgoSetting", true);
        setBooleanField(term309453, term309453.getClass(), "contestNowPlayingEnable", false);
        setIntField(term309453, term309453.getClass(), "contestNowPlayingId", -1);
        setIntField(term309453, term309453.getClass(), "contestNowPlayingValue", -1);
        setField(term309453, term309453.getClass(), "contestNowPlayingResultRank", enum711);
        setField(term309453, term309453.getClass(), "contestNowPlayingSpecifier", "");
        setField(term309453, term309453.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term309453, term309453.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term309453, term309453.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term309453, term309453.getClass(), "rivalPdId", -1);
        setField(term309451, term309451.getClass(), "pdId", term309453);
        setIntField(term309451, term309451.getClass(), "pvId", 41779745);
        setField(term309451, term309451.getClass(), "difficulty", enum712);
        setField(term309451, term309451.getClass(), "edition", enum710);
        setIntField(term309451, term309451.getClass(), "scriptVer", 908188015);
        setIntField(term309451, term309451.getClass(), "score", 1448289766);
        setField(term309451, term309451.getClass(), "challengeKind", enum713);
        setIntField(term309451, term309451.getClass(), "challengeResult", 1377148923);
        setField(term309451, term309451.getClass(), "clearResult", enum714);
        setIntField(term309451, term309451.getClass(), "vp", 540775467);
        setIntField(term309451, term309451.getClass(), "coolCount", -2083028527);
        setIntField(term309451, term309451.getClass(), "coolPercent", 1631605263);
        setIntField(term309451, term309451.getClass(), "fineCount", -1378134881);
        setIntField(term309451, term309451.getClass(), "finePercent", -1887131478);
        setIntField(term309451, term309451.getClass(), "safeCount", 1916020077);
        setIntField(term309451, term309451.getClass(), "safePercent", -1842191454);
        setIntField(term309451, term309451.getClass(), "sadCount", 384551988);
        setIntField(term309451, term309451.getClass(), "sadPercent", -2021521187);
        setIntField(term309451, term309451.getClass(), "wrongCount", -2139205197);
        setIntField(term309451, term309451.getClass(), "wrongPercent", -584949216);
        setIntField(term309451, term309451.getClass(), "maxCombo", 1646064199);
        setIntField(term309451, term309451.getClass(), "chanceTime", -1135845415);
        setIntField(term309451, term309451.getClass(), "holdScore", -1361921586);
        setIntField(term309451, term309451.getClass(), "attainPoint", 593679468);
        setIntField(term309451, term309451.getClass(), "skinId", 747491);
        setIntField(term309451, term309451.getClass(), "buttonSe", 734222768);
        setIntField(term309451, term309451.getClass(), "buttonSeVol", 1545425140);
        setIntField(term309451, term309451.getClass(), "sliderSe", -1580765555);
        setIntField(term309451, term309451.getClass(), "ChainSlideSe", -1295149055);
        setIntField(term309451, term309451.getClass(), "SliderTouchSe", -769814321);
        setField(term309451, term309451.getClass(), "modules", "NnpwZBUTvx");
        setIntField(term309451, term309451.getClass(), "stageCompletion", 114898432);
        setIntField(term309451, term309451.getClass(), "slideScore", -193767503);
        setIntField(term309451, term309451.getClass(), "isVocalChange", -2090918082);
        setField(term309451, term309451.getClass(), "customizeItems", "tlQSNgTkQX");
        setField(term309451, term309451.getClass(), "rhythmGameOptions", "PCipZnmBOF");
        setIntField(term309451, term309451.getClass(), "screenShotCount", -1);
        setIntField(term310162, term310162.getClass(), "year", 2018);
        setShortField(term310162, term310162.getClass(), "month", (short) 11);
        setShortField(term310162, term310162.getClass(), "day", (short) 9);
        setField(term310161, term310161.getClass(), "date", term310162);
        setByteField(term310166, term310166.getClass(), "hour", (byte) 6);
        setByteField(term310166, term310166.getClass(), "minute", (byte) 8);
        setByteField(term310166, term310166.getClass(), "second", (byte) 32);
        setIntField(term310166, term310166.getClass(), "nano", 750733310);
        setField(term310161, term310161.getClass(), "time", term310166);
        setField(term309451, term309451.getClass(), "dateTime", term310161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zcorEihhLK";
        callMethod(klass, "setModules", argTypes, term309451, args);
    }

};


