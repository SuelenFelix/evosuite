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

public class PlayLog_setSadCount_31232251157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260766;
     Object term261473;

    public PlayLog_setSadCount_31232251157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term261482 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term261481 = ((Class) term261482).getDeclaredField((String) "MISS");
        ((Field) term261481).setAccessible(true);
        Object enum593 = ((Field) term261481).get((Object) null);
        Class<? extends Object> term261859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term261858 = ((Class) term261859).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term261858).setAccessible(true);
        Object enum594 = ((Field) term261858).get((Object) null);
        Class<? extends Object> term262142 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term262141 = ((Class) term262142).getDeclaredField((String) "NORMAL");
        ((Field) term262141).setAccessible(true);
        Object enum595 = ((Field) term262141).get((Object) null);
        Class<? extends Object> term262417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term262416 = ((Class) term262417).getDeclaredField((String) "ORIGINAL");
        ((Field) term262416).setAccessible(true);
        Object enum596 = ((Field) term262416).get((Object) null);
        Class<? extends Object> term262683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term262682 = ((Class) term262683).getDeclaredField((String) "NONE");
        ((Field) term262682).setAccessible(true);
        Object enum597 = ((Field) term262682).get((Object) null);
        Class<? extends Object> term263324 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term263323 = ((Class) term263324).getDeclaredField((String) "PERFECT");
        ((Field) term263323).setAccessible(true);
        Object enum598 = ((Field) term263323).get((Object) null);
        Class<? extends Object> term263617 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term263616 = ((Class) term263617).getDeclaredField((String) "STANDARD");
        ((Field) term263616).setAccessible(true);
        Object enum599 = ((Field) term263616).get((Object) null);
        term260766 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term260768 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term260891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term261463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261468 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260766, term260766.getClass(), "id", 1195529027276497124L);
        setLongField(term260768, term260768.getClass(), "id", -2783999800714825789L);
        setIntField(term260768, term260768.getClass(), "pdId", 1471031478);
        setField(term260768, term260768.getClass(), "playerName", "xxx");
        setIntField(term260768, term260768.getClass(), "vocaloidPoints", 300);
        setIntField(term260768, term260768.getClass(), "level", 1);
        setIntField(term260768, term260768.getClass(), "levelExp", -334716487);
        setField(term260768, term260768.getClass(), "levelTitle", "xxx");
        setIntField(term260768, term260768.getClass(), "plateId", -1);
        setIntField(term260768, term260768.getClass(), "plateEffectId", -1);
        setField(term260768, term260768.getClass(), "passwordStatus", enum593);
        setField(term260768, term260768.getClass(), "password", "**********");
        setBooleanField(term260768, term260768.getClass(), "preferPerPvModule", true);
        setBooleanField(term260768, term260768.getClass(), "preferCommonModule", false);
        setBooleanField(term260768, term260768.getClass(), "usePerPvSkin", false);
        setBooleanField(term260768, term260768.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term260768, term260768.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term260768, term260768.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term260768, term260768.getClass(), "usePerPvTouchSliderSe", true);
        setField(term260768, term260768.getClass(), "commonModule", "-999,-999,-999");
        setField(term260768, term260768.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term260892, term260892.getClass(), "year", 2026);
        setShortField(term260892, term260892.getClass(), "month", (short) 8);
        setShortField(term260892, term260892.getClass(), "day", (short) 12);
        setField(term260891, term260891.getClass(), "date", term260892);
        setByteField(term260896, term260896.getClass(), "hour", (byte) 2);
        setByteField(term260896, term260896.getClass(), "minute", (byte) 2);
        setByteField(term260896, term260896.getClass(), "second", (byte) 54);
        setIntField(term260896, term260896.getClass(), "nano", 558744000);
        setField(term260891, term260891.getClass(), "time", term260896);
        setField(term260768, term260768.getClass(), "commonModuleSetTime", term260891);
        setField(term260768, term260768.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term260768, term260768.getClass(), "commonSkin", -1);
        setIntField(term260768, term260768.getClass(), "headphoneVolume", 100);
        setBooleanField(term260768, term260768.getClass(), "buttonSeOn", true);
        setIntField(term260768, term260768.getClass(), "buttonSeVolume", 100);
        setIntField(term260768, term260768.getClass(), "sliderSeVolume", 100);
        setIntField(term260768, term260768.getClass(), "buttonSe", -1);
        setIntField(term260768, term260768.getClass(), "chainSlideSe", -1);
        setIntField(term260768, term260768.getClass(), "slideSe", -1);
        setIntField(term260768, term260768.getClass(), "sliderTouchSe", -1);
        setField(term260768, term260768.getClass(), "sortMode", enum594);
        setIntField(term260768, term260768.getClass(), "nextPvId", -1);
        setField(term260768, term260768.getClass(), "nextDifficulty", enum595);
        setField(term260768, term260768.getClass(), "nextEdition", enum596);
        setBooleanField(term260768, term260768.getClass(), "showInterimRanking", true);
        setBooleanField(term260768, term260768.getClass(), "showClearStatus", true);
        setBooleanField(term260768, term260768.getClass(), "showGreatBorder", true);
        setBooleanField(term260768, term260768.getClass(), "showExcellentBorder", true);
        setBooleanField(term260768, term260768.getClass(), "showRivalBorder", true);
        setBooleanField(term260768, term260768.getClass(), "showRgoSetting", true);
        setBooleanField(term260768, term260768.getClass(), "contestNowPlayingEnable", false);
        setIntField(term260768, term260768.getClass(), "contestNowPlayingId", -1);
        setIntField(term260768, term260768.getClass(), "contestNowPlayingValue", -1);
        setField(term260768, term260768.getClass(), "contestNowPlayingResultRank", enum597);
        setField(term260768, term260768.getClass(), "contestNowPlayingSpecifier", "");
        setField(term260768, term260768.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term260768, term260768.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term260768, term260768.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term260768, term260768.getClass(), "rivalPdId", -1);
        setField(term260766, term260766.getClass(), "pdId", term260768);
        setIntField(term260766, term260766.getClass(), "pvId", -1739012814);
        setField(term260766, term260766.getClass(), "difficulty", enum595);
        setField(term260766, term260766.getClass(), "edition", enum596);
        setIntField(term260766, term260766.getClass(), "scriptVer", 1989014880);
        setIntField(term260766, term260766.getClass(), "score", -330280702);
        setField(term260766, term260766.getClass(), "challengeKind", enum598);
        setIntField(term260766, term260766.getClass(), "challengeResult", -1858425735);
        setField(term260766, term260766.getClass(), "clearResult", enum599);
        setIntField(term260766, term260766.getClass(), "vp", 1818274550);
        setIntField(term260766, term260766.getClass(), "coolCount", 1044519085);
        setIntField(term260766, term260766.getClass(), "coolPercent", 2095699770);
        setIntField(term260766, term260766.getClass(), "fineCount", -1365904757);
        setIntField(term260766, term260766.getClass(), "finePercent", -1487263349);
        setIntField(term260766, term260766.getClass(), "safeCount", -1009732764);
        setIntField(term260766, term260766.getClass(), "safePercent", 950783153);
        setIntField(term260766, term260766.getClass(), "sadCount", -801175078);
        setIntField(term260766, term260766.getClass(), "sadPercent", 2085098404);
        setIntField(term260766, term260766.getClass(), "wrongCount", -684064427);
        setIntField(term260766, term260766.getClass(), "wrongPercent", -1981080836);
        setIntField(term260766, term260766.getClass(), "maxCombo", -176676344);
        setIntField(term260766, term260766.getClass(), "chanceTime", 1949009312);
        setIntField(term260766, term260766.getClass(), "holdScore", -432054743);
        setIntField(term260766, term260766.getClass(), "attainPoint", -859726380);
        setIntField(term260766, term260766.getClass(), "skinId", -1498422654);
        setIntField(term260766, term260766.getClass(), "buttonSe", -1499829233);
        setIntField(term260766, term260766.getClass(), "buttonSeVol", -888855662);
        setIntField(term260766, term260766.getClass(), "sliderSe", -1483966656);
        setIntField(term260766, term260766.getClass(), "ChainSlideSe", -334260786);
        setIntField(term260766, term260766.getClass(), "SliderTouchSe", -765890956);
        setField(term260766, term260766.getClass(), "modules", "rLHAoqXgPh");
        setIntField(term260766, term260766.getClass(), "stageCompletion", -214452542);
        setIntField(term260766, term260766.getClass(), "slideScore", -21429773);
        setIntField(term260766, term260766.getClass(), "isVocalChange", 1774728742);
        setField(term260766, term260766.getClass(), "customizeItems", "zUlRdimJtU");
        setField(term260766, term260766.getClass(), "rhythmGameOptions", "vwbEQQNQrx");
        setIntField(term260766, term260766.getClass(), "screenShotCount", -1);
        setIntField(term261464, term261464.getClass(), "year", 2024);
        setShortField(term261464, term261464.getClass(), "month", (short) 2);
        setShortField(term261464, term261464.getClass(), "day", (short) 29);
        setField(term261463, term261463.getClass(), "date", term261464);
        setByteField(term261468, term261468.getClass(), "hour", (byte) 17);
        setByteField(term261468, term261468.getClass(), "minute", (byte) 54);
        setByteField(term261468, term261468.getClass(), "second", (byte) 21);
        setIntField(term261468, term261468.getClass(), "nano", 605973408);
        setField(term261463, term261463.getClass(), "time", term261468);
        setField(term260766, term260766.getClass(), "dateTime", term261463);
        term261473 = new Integer(-1822211508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261473;
        callMethod(klass, "setSadCount", argTypes, term260766, args);
    }

};


