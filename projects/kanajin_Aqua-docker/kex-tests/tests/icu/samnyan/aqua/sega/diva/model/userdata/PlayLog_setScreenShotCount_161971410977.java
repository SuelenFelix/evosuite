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

public class PlayLog_setScreenShotCount_161971410977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330200;
     Object term330919;

    public PlayLog_setScreenShotCount_161971410977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term330928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term330927 = ((Class) term330928).getDeclaredField((String) "MISS");
        ((Field) term330927).setAccessible(true);
        Object enum755 = ((Field) term330927).get((Object) null);
        Class<? extends Object> term331305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term331304 = ((Class) term331305).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term331304).setAccessible(true);
        Object enum756 = ((Field) term331304).get((Object) null);
        Class<? extends Object> term331588 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term331587 = ((Class) term331588).getDeclaredField((String) "NORMAL");
        ((Field) term331587).setAccessible(true);
        Object enum757 = ((Field) term331587).get((Object) null);
        Class<? extends Object> term331863 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term331862 = ((Class) term331863).getDeclaredField((String) "ORIGINAL");
        ((Field) term331862).setAccessible(true);
        Object enum758 = ((Field) term331862).get((Object) null);
        Class<? extends Object> term332129 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term332128 = ((Class) term332129).getDeclaredField((String) "NONE");
        ((Field) term332128).setAccessible(true);
        Object enum759 = ((Field) term332128).get((Object) null);
        Class<? extends Object> term332770 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term332769 = ((Class) term332770).getDeclaredField((String) "UNDEFINED");
        ((Field) term332769).setAccessible(true);
        Object enum760 = ((Field) term332769).get((Object) null);
        Class<? extends Object> term333054 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term333053 = ((Class) term333054).getDeclaredField((String) "CLEAR");
        ((Field) term333053).setAccessible(true);
        Object enum761 = ((Field) term333053).get((Object) null);
        Class<? extends Object> term333341 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term333340 = ((Class) term333341).getDeclaredField((String) "STANDARD");
        ((Field) term333340).setAccessible(true);
        Object enum762 = ((Field) term333340).get((Object) null);
        term330200 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term330202 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term330325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term330200, term330200.getClass(), "id", -2338103433822116635L);
        setLongField(term330202, term330202.getClass(), "id", -1885698929232124806L);
        setIntField(term330202, term330202.getClass(), "pdId", 1440683242);
        setField(term330202, term330202.getClass(), "playerName", "xxx");
        setIntField(term330202, term330202.getClass(), "vocaloidPoints", 300);
        setIntField(term330202, term330202.getClass(), "level", 1);
        setIntField(term330202, term330202.getClass(), "levelExp", -1746192055);
        setField(term330202, term330202.getClass(), "levelTitle", "xxx");
        setIntField(term330202, term330202.getClass(), "plateId", -1);
        setIntField(term330202, term330202.getClass(), "plateEffectId", -1);
        setField(term330202, term330202.getClass(), "passwordStatus", enum755);
        setField(term330202, term330202.getClass(), "password", "**********");
        setBooleanField(term330202, term330202.getClass(), "preferPerPvModule", true);
        setBooleanField(term330202, term330202.getClass(), "preferCommonModule", true);
        setBooleanField(term330202, term330202.getClass(), "usePerPvSkin", true);
        setBooleanField(term330202, term330202.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term330202, term330202.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term330202, term330202.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term330202, term330202.getClass(), "usePerPvTouchSliderSe", false);
        setField(term330202, term330202.getClass(), "commonModule", "-999,-999,-999");
        setField(term330202, term330202.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term330326, term330326.getClass(), "year", 2026);
        setShortField(term330326, term330326.getClass(), "month", (short) 8);
        setShortField(term330326, term330326.getClass(), "day", (short) 12);
        setField(term330325, term330325.getClass(), "date", term330326);
        setByteField(term330330, term330330.getClass(), "hour", (byte) 2);
        setByteField(term330330, term330330.getClass(), "minute", (byte) 2);
        setByteField(term330330, term330330.getClass(), "second", (byte) 59);
        setIntField(term330330, term330330.getClass(), "nano", 498143000);
        setField(term330325, term330325.getClass(), "time", term330330);
        setField(term330202, term330202.getClass(), "commonModuleSetTime", term330325);
        setField(term330202, term330202.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term330202, term330202.getClass(), "commonSkin", -1);
        setIntField(term330202, term330202.getClass(), "headphoneVolume", 100);
        setBooleanField(term330202, term330202.getClass(), "buttonSeOn", true);
        setIntField(term330202, term330202.getClass(), "buttonSeVolume", 100);
        setIntField(term330202, term330202.getClass(), "sliderSeVolume", 100);
        setIntField(term330202, term330202.getClass(), "buttonSe", -1);
        setIntField(term330202, term330202.getClass(), "chainSlideSe", -1);
        setIntField(term330202, term330202.getClass(), "slideSe", -1);
        setIntField(term330202, term330202.getClass(), "sliderTouchSe", -1);
        setField(term330202, term330202.getClass(), "sortMode", enum756);
        setIntField(term330202, term330202.getClass(), "nextPvId", -1);
        setField(term330202, term330202.getClass(), "nextDifficulty", enum757);
        setField(term330202, term330202.getClass(), "nextEdition", enum758);
        setBooleanField(term330202, term330202.getClass(), "showInterimRanking", true);
        setBooleanField(term330202, term330202.getClass(), "showClearStatus", true);
        setBooleanField(term330202, term330202.getClass(), "showGreatBorder", true);
        setBooleanField(term330202, term330202.getClass(), "showExcellentBorder", true);
        setBooleanField(term330202, term330202.getClass(), "showRivalBorder", true);
        setBooleanField(term330202, term330202.getClass(), "showRgoSetting", true);
        setBooleanField(term330202, term330202.getClass(), "contestNowPlayingEnable", true);
        setIntField(term330202, term330202.getClass(), "contestNowPlayingId", -1);
        setIntField(term330202, term330202.getClass(), "contestNowPlayingValue", -1);
        setField(term330202, term330202.getClass(), "contestNowPlayingResultRank", enum759);
        setField(term330202, term330202.getClass(), "contestNowPlayingSpecifier", "");
        setField(term330202, term330202.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term330202, term330202.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term330202, term330202.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term330202, term330202.getClass(), "rivalPdId", -1);
        setField(term330200, term330200.getClass(), "pdId", term330202);
        setIntField(term330200, term330200.getClass(), "pvId", -996911099);
        setField(term330200, term330200.getClass(), "difficulty", enum760);
        setField(term330200, term330200.getClass(), "edition", enum758);
        setIntField(term330200, term330200.getClass(), "scriptVer", -610865659);
        setIntField(term330200, term330200.getClass(), "score", 2044119255);
        setField(term330200, term330200.getClass(), "challengeKind", enum761);
        setIntField(term330200, term330200.getClass(), "challengeResult", -1924668199);
        setField(term330200, term330200.getClass(), "clearResult", enum762);
        setIntField(term330200, term330200.getClass(), "vp", 903039854);
        setIntField(term330200, term330200.getClass(), "coolCount", -705528573);
        setIntField(term330200, term330200.getClass(), "coolPercent", -480070896);
        setIntField(term330200, term330200.getClass(), "fineCount", -1811732249);
        setIntField(term330200, term330200.getClass(), "finePercent", 1993504802);
        setIntField(term330200, term330200.getClass(), "safeCount", 526852618);
        setIntField(term330200, term330200.getClass(), "safePercent", 903788782);
        setIntField(term330200, term330200.getClass(), "sadCount", -608033702);
        setIntField(term330200, term330200.getClass(), "sadPercent", 1118825073);
        setIntField(term330200, term330200.getClass(), "wrongCount", 751108197);
        setIntField(term330200, term330200.getClass(), "wrongPercent", -1810066487);
        setIntField(term330200, term330200.getClass(), "maxCombo", 12697707);
        setIntField(term330200, term330200.getClass(), "chanceTime", -971143668);
        setIntField(term330200, term330200.getClass(), "holdScore", 127763053);
        setIntField(term330200, term330200.getClass(), "attainPoint", 968035207);
        setIntField(term330200, term330200.getClass(), "skinId", -643589717);
        setIntField(term330200, term330200.getClass(), "buttonSe", -1599482698);
        setIntField(term330200, term330200.getClass(), "buttonSeVol", -370600915);
        setIntField(term330200, term330200.getClass(), "sliderSe", -311572875);
        setIntField(term330200, term330200.getClass(), "ChainSlideSe", 355595594);
        setIntField(term330200, term330200.getClass(), "SliderTouchSe", 842697786);
        setField(term330200, term330200.getClass(), "modules", "OcJCIDNIXA");
        setIntField(term330200, term330200.getClass(), "stageCompletion", 1685808201);
        setIntField(term330200, term330200.getClass(), "slideScore", 1565114969);
        setIntField(term330200, term330200.getClass(), "isVocalChange", 806831765);
        setField(term330200, term330200.getClass(), "customizeItems", "XfRABIFVEp");
        setField(term330200, term330200.getClass(), "rhythmGameOptions", "MHGKyEnwKc");
        setIntField(term330200, term330200.getClass(), "screenShotCount", -1);
        setIntField(term330910, term330910.getClass(), "year", 2028);
        setShortField(term330910, term330910.getClass(), "month", (short) 5);
        setShortField(term330910, term330910.getClass(), "day", (short) 2);
        setField(term330909, term330909.getClass(), "date", term330910);
        setByteField(term330914, term330914.getClass(), "hour", (byte) 2);
        setByteField(term330914, term330914.getClass(), "minute", (byte) 59);
        setByteField(term330914, term330914.getClass(), "second", (byte) 30);
        setIntField(term330914, term330914.getClass(), "nano", 222274238);
        setField(term330909, term330909.getClass(), "time", term330914);
        setField(term330200, term330200.getClass(), "dateTime", term330909);
        term330919 = new Integer(-1445658721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term330919;
        callMethod(klass, "setScreenShotCount", argTypes, term330200, args);
    }

};


