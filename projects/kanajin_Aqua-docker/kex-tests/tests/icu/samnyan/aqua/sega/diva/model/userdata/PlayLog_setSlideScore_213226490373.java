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

public class PlayLog_setSlideScore_213226490373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316391;
     Object term317097;

    public PlayLog_setSlideScore_213226490373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317106 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term317105 = ((Class) term317106).getDeclaredField((String) "MISS");
        ((Field) term317105).setAccessible(true);
        Object enum723 = ((Field) term317105).get((Object) null);
        Class<? extends Object> term317483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term317482 = ((Class) term317483).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term317482).setAccessible(true);
        Object enum724 = ((Field) term317482).get((Object) null);
        Class<? extends Object> term317766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term317765 = ((Class) term317766).getDeclaredField((String) "NORMAL");
        ((Field) term317765).setAccessible(true);
        Object enum725 = ((Field) term317765).get((Object) null);
        Class<? extends Object> term318041 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term318040 = ((Class) term318041).getDeclaredField((String) "ORIGINAL");
        ((Field) term318040).setAccessible(true);
        Object enum726 = ((Field) term318040).get((Object) null);
        Class<? extends Object> term318307 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term318306 = ((Class) term318307).getDeclaredField((String) "NONE");
        ((Field) term318306).setAccessible(true);
        Object enum727 = ((Field) term318306).get((Object) null);
        Class<? extends Object> term318948 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term318947 = ((Class) term318948).getDeclaredField((String) "UNDEFINED");
        ((Field) term318947).setAccessible(true);
        Object enum728 = ((Field) term318947).get((Object) null);
        Class<? extends Object> term319247 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term319246 = ((Class) term319247).getDeclaredField((String) "CHEAP");
        ((Field) term319246).setAccessible(true);
        Object enum729 = ((Field) term319246).get((Object) null);
        term316391 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term316393 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term316516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316521 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317092 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term316391, term316391.getClass(), "id", 5973526439563541711L);
        setLongField(term316393, term316393.getClass(), "id", 5246058710498845622L);
        setIntField(term316393, term316393.getClass(), "pdId", 746372422);
        setField(term316393, term316393.getClass(), "playerName", "xxx");
        setIntField(term316393, term316393.getClass(), "vocaloidPoints", 300);
        setIntField(term316393, term316393.getClass(), "level", 1);
        setIntField(term316393, term316393.getClass(), "levelExp", 1921465988);
        setField(term316393, term316393.getClass(), "levelTitle", "xxx");
        setIntField(term316393, term316393.getClass(), "plateId", -1);
        setIntField(term316393, term316393.getClass(), "plateEffectId", -1);
        setField(term316393, term316393.getClass(), "passwordStatus", enum723);
        setField(term316393, term316393.getClass(), "password", "**********");
        setBooleanField(term316393, term316393.getClass(), "preferPerPvModule", true);
        setBooleanField(term316393, term316393.getClass(), "preferCommonModule", false);
        setBooleanField(term316393, term316393.getClass(), "usePerPvSkin", true);
        setBooleanField(term316393, term316393.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term316393, term316393.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term316393, term316393.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term316393, term316393.getClass(), "usePerPvTouchSliderSe", true);
        setField(term316393, term316393.getClass(), "commonModule", "-999,-999,-999");
        setField(term316393, term316393.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term316517, term316517.getClass(), "year", 2026);
        setShortField(term316517, term316517.getClass(), "month", (short) 8);
        setShortField(term316517, term316517.getClass(), "day", (short) 12);
        setField(term316516, term316516.getClass(), "date", term316517);
        setByteField(term316521, term316521.getClass(), "hour", (byte) 2);
        setByteField(term316521, term316521.getClass(), "minute", (byte) 2);
        setByteField(term316521, term316521.getClass(), "second", (byte) 58);
        setIntField(term316521, term316521.getClass(), "nano", 511475000);
        setField(term316516, term316516.getClass(), "time", term316521);
        setField(term316393, term316393.getClass(), "commonModuleSetTime", term316516);
        setField(term316393, term316393.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term316393, term316393.getClass(), "commonSkin", -1);
        setIntField(term316393, term316393.getClass(), "headphoneVolume", 100);
        setBooleanField(term316393, term316393.getClass(), "buttonSeOn", true);
        setIntField(term316393, term316393.getClass(), "buttonSeVolume", 100);
        setIntField(term316393, term316393.getClass(), "sliderSeVolume", 100);
        setIntField(term316393, term316393.getClass(), "buttonSe", -1);
        setIntField(term316393, term316393.getClass(), "chainSlideSe", -1);
        setIntField(term316393, term316393.getClass(), "slideSe", -1);
        setIntField(term316393, term316393.getClass(), "sliderTouchSe", -1);
        setField(term316393, term316393.getClass(), "sortMode", enum724);
        setIntField(term316393, term316393.getClass(), "nextPvId", -1);
        setField(term316393, term316393.getClass(), "nextDifficulty", enum725);
        setField(term316393, term316393.getClass(), "nextEdition", enum726);
        setBooleanField(term316393, term316393.getClass(), "showInterimRanking", true);
        setBooleanField(term316393, term316393.getClass(), "showClearStatus", true);
        setBooleanField(term316393, term316393.getClass(), "showGreatBorder", true);
        setBooleanField(term316393, term316393.getClass(), "showExcellentBorder", true);
        setBooleanField(term316393, term316393.getClass(), "showRivalBorder", true);
        setBooleanField(term316393, term316393.getClass(), "showRgoSetting", true);
        setBooleanField(term316393, term316393.getClass(), "contestNowPlayingEnable", true);
        setIntField(term316393, term316393.getClass(), "contestNowPlayingId", -1);
        setIntField(term316393, term316393.getClass(), "contestNowPlayingValue", -1);
        setField(term316393, term316393.getClass(), "contestNowPlayingResultRank", enum727);
        setField(term316393, term316393.getClass(), "contestNowPlayingSpecifier", "");
        setField(term316393, term316393.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term316393, term316393.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term316393, term316393.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term316393, term316393.getClass(), "rivalPdId", -1);
        setField(term316391, term316391.getClass(), "pdId", term316393);
        setIntField(term316391, term316391.getClass(), "pvId", -164438599);
        setField(term316391, term316391.getClass(), "difficulty", enum725);
        setField(term316391, term316391.getClass(), "edition", enum726);
        setIntField(term316391, term316391.getClass(), "scriptVer", -444441955);
        setIntField(term316391, term316391.getClass(), "score", -544005591);
        setField(term316391, term316391.getClass(), "challengeKind", enum728);
        setIntField(term316391, term316391.getClass(), "challengeResult", -1379603462);
        setField(term316391, term316391.getClass(), "clearResult", enum729);
        setIntField(term316391, term316391.getClass(), "vp", -1304965721);
        setIntField(term316391, term316391.getClass(), "coolCount", 1661411651);
        setIntField(term316391, term316391.getClass(), "coolPercent", 175517901);
        setIntField(term316391, term316391.getClass(), "fineCount", 335030203);
        setIntField(term316391, term316391.getClass(), "finePercent", -474014477);
        setIntField(term316391, term316391.getClass(), "safeCount", 1610419467);
        setIntField(term316391, term316391.getClass(), "safePercent", 1155135931);
        setIntField(term316391, term316391.getClass(), "sadCount", -636910567);
        setIntField(term316391, term316391.getClass(), "sadPercent", 1896114203);
        setIntField(term316391, term316391.getClass(), "wrongCount", 1045745470);
        setIntField(term316391, term316391.getClass(), "wrongPercent", 892741901);
        setIntField(term316391, term316391.getClass(), "maxCombo", -1724900201);
        setIntField(term316391, term316391.getClass(), "chanceTime", -758523003);
        setIntField(term316391, term316391.getClass(), "holdScore", 1567184195);
        setIntField(term316391, term316391.getClass(), "attainPoint", 63595623);
        setIntField(term316391, term316391.getClass(), "skinId", 1764150991);
        setIntField(term316391, term316391.getClass(), "buttonSe", 944653455);
        setIntField(term316391, term316391.getClass(), "buttonSeVol", -1819474400);
        setIntField(term316391, term316391.getClass(), "sliderSe", 783684648);
        setIntField(term316391, term316391.getClass(), "ChainSlideSe", 553754005);
        setIntField(term316391, term316391.getClass(), "SliderTouchSe", 1986699236);
        setField(term316391, term316391.getClass(), "modules", "GZdcJyZntS");
        setIntField(term316391, term316391.getClass(), "stageCompletion", -1729178560);
        setIntField(term316391, term316391.getClass(), "slideScore", 874974171);
        setIntField(term316391, term316391.getClass(), "isVocalChange", -1689017763);
        setField(term316391, term316391.getClass(), "customizeItems", "OIHoJeysUi");
        setField(term316391, term316391.getClass(), "rhythmGameOptions", "WXMWFDGcLB");
        setIntField(term316391, term316391.getClass(), "screenShotCount", -1);
        setIntField(term317088, term317088.getClass(), "year", 2028);
        setShortField(term317088, term317088.getClass(), "month", (short) 7);
        setShortField(term317088, term317088.getClass(), "day", (short) 22);
        setField(term317087, term317087.getClass(), "date", term317088);
        setByteField(term317092, term317092.getClass(), "hour", (byte) 18);
        setByteField(term317092, term317092.getClass(), "minute", (byte) 33);
        setByteField(term317092, term317092.getClass(), "second", (byte) 7);
        setIntField(term317092, term317092.getClass(), "nano", 763613074);
        setField(term317087, term317087.getClass(), "time", term317092);
        setField(term316391, term316391.getClass(), "dateTime", term317087);
        term317097 = new Integer(1657387281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term317097;
        callMethod(klass, "setSlideScore", argTypes, term316391, args);
    }

};


