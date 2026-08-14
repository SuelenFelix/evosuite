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

public class PlayLog_setSliderTouchSe_163315011670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306015;
     Object term306729;

    public PlayLog_setSliderTouchSe_163315011670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term306738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term306737 = ((Class) term306738).getDeclaredField((String) "MISS");
        ((Field) term306737).setAccessible(true);
        Object enum699 = ((Field) term306737).get((Object) null);
        Class<? extends Object> term307115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term307114 = ((Class) term307115).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term307114).setAccessible(true);
        Object enum700 = ((Field) term307114).get((Object) null);
        Class<? extends Object> term307398 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term307397 = ((Class) term307398).getDeclaredField((String) "NORMAL");
        ((Field) term307397).setAccessible(true);
        Object enum701 = ((Field) term307397).get((Object) null);
        Class<? extends Object> term307673 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term307672 = ((Class) term307673).getDeclaredField((String) "ORIGINAL");
        ((Field) term307672).setAccessible(true);
        Object enum702 = ((Field) term307672).get((Object) null);
        Class<? extends Object> term307939 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term307938 = ((Class) term307939).getDeclaredField((String) "NONE");
        ((Field) term307938).setAccessible(true);
        Object enum703 = ((Field) term307938).get((Object) null);
        Class<? extends Object> term308580 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term308579 = ((Class) term308580).getDeclaredField((String) "EXTREME");
        ((Field) term308579).setAccessible(true);
        Object enum704 = ((Field) term308579).get((Object) null);
        Class<? extends Object> term308858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term308857 = ((Class) term308858).getDeclaredField((String) "CLEAR");
        ((Field) term308857).setAccessible(true);
        Object enum705 = ((Field) term308857).get((Object) null);
        Class<? extends Object> term309145 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term309144 = ((Class) term309145).getDeclaredField((String) "CHEAP");
        ((Field) term309144).setAccessible(true);
        Object enum706 = ((Field) term309144).get((Object) null);
        term306015 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term306017 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term306140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306724 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term306015, term306015.getClass(), "id", 3412644969878030772L);
        setLongField(term306017, term306017.getClass(), "id", 6698455537431331246L);
        setIntField(term306017, term306017.getClass(), "pdId", -1516863216);
        setField(term306017, term306017.getClass(), "playerName", "xxx");
        setIntField(term306017, term306017.getClass(), "vocaloidPoints", 300);
        setIntField(term306017, term306017.getClass(), "level", 1);
        setIntField(term306017, term306017.getClass(), "levelExp", 1392468004);
        setField(term306017, term306017.getClass(), "levelTitle", "xxx");
        setIntField(term306017, term306017.getClass(), "plateId", -1);
        setIntField(term306017, term306017.getClass(), "plateEffectId", -1);
        setField(term306017, term306017.getClass(), "passwordStatus", enum699);
        setField(term306017, term306017.getClass(), "password", "**********");
        setBooleanField(term306017, term306017.getClass(), "preferPerPvModule", true);
        setBooleanField(term306017, term306017.getClass(), "preferCommonModule", true);
        setBooleanField(term306017, term306017.getClass(), "usePerPvSkin", false);
        setBooleanField(term306017, term306017.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term306017, term306017.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term306017, term306017.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term306017, term306017.getClass(), "usePerPvTouchSliderSe", false);
        setField(term306017, term306017.getClass(), "commonModule", "-999,-999,-999");
        setField(term306017, term306017.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term306141, term306141.getClass(), "year", 2026);
        setShortField(term306141, term306141.getClass(), "month", (short) 8);
        setShortField(term306141, term306141.getClass(), "day", (short) 12);
        setField(term306140, term306140.getClass(), "date", term306141);
        setByteField(term306145, term306145.getClass(), "hour", (byte) 2);
        setByteField(term306145, term306145.getClass(), "minute", (byte) 2);
        setByteField(term306145, term306145.getClass(), "second", (byte) 57);
        setIntField(term306145, term306145.getClass(), "nano", 768963000);
        setField(term306140, term306140.getClass(), "time", term306145);
        setField(term306017, term306017.getClass(), "commonModuleSetTime", term306140);
        setField(term306017, term306017.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term306017, term306017.getClass(), "commonSkin", -1);
        setIntField(term306017, term306017.getClass(), "headphoneVolume", 100);
        setBooleanField(term306017, term306017.getClass(), "buttonSeOn", true);
        setIntField(term306017, term306017.getClass(), "buttonSeVolume", 100);
        setIntField(term306017, term306017.getClass(), "sliderSeVolume", 100);
        setIntField(term306017, term306017.getClass(), "buttonSe", -1);
        setIntField(term306017, term306017.getClass(), "chainSlideSe", -1);
        setIntField(term306017, term306017.getClass(), "slideSe", -1);
        setIntField(term306017, term306017.getClass(), "sliderTouchSe", -1);
        setField(term306017, term306017.getClass(), "sortMode", enum700);
        setIntField(term306017, term306017.getClass(), "nextPvId", -1);
        setField(term306017, term306017.getClass(), "nextDifficulty", enum701);
        setField(term306017, term306017.getClass(), "nextEdition", enum702);
        setBooleanField(term306017, term306017.getClass(), "showInterimRanking", true);
        setBooleanField(term306017, term306017.getClass(), "showClearStatus", true);
        setBooleanField(term306017, term306017.getClass(), "showGreatBorder", true);
        setBooleanField(term306017, term306017.getClass(), "showExcellentBorder", true);
        setBooleanField(term306017, term306017.getClass(), "showRivalBorder", true);
        setBooleanField(term306017, term306017.getClass(), "showRgoSetting", true);
        setBooleanField(term306017, term306017.getClass(), "contestNowPlayingEnable", true);
        setIntField(term306017, term306017.getClass(), "contestNowPlayingId", -1);
        setIntField(term306017, term306017.getClass(), "contestNowPlayingValue", -1);
        setField(term306017, term306017.getClass(), "contestNowPlayingResultRank", enum703);
        setField(term306017, term306017.getClass(), "contestNowPlayingSpecifier", "");
        setField(term306017, term306017.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term306017, term306017.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term306017, term306017.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term306017, term306017.getClass(), "rivalPdId", -1);
        setField(term306015, term306015.getClass(), "pdId", term306017);
        setIntField(term306015, term306015.getClass(), "pvId", -1568339070);
        setField(term306015, term306015.getClass(), "difficulty", enum704);
        setField(term306015, term306015.getClass(), "edition", enum702);
        setIntField(term306015, term306015.getClass(), "scriptVer", -1427059961);
        setIntField(term306015, term306015.getClass(), "score", 1120685189);
        setField(term306015, term306015.getClass(), "challengeKind", enum705);
        setIntField(term306015, term306015.getClass(), "challengeResult", 654585209);
        setField(term306015, term306015.getClass(), "clearResult", enum706);
        setIntField(term306015, term306015.getClass(), "vp", -1661685401);
        setIntField(term306015, term306015.getClass(), "coolCount", 1427434947);
        setIntField(term306015, term306015.getClass(), "coolPercent", 2130990985);
        setIntField(term306015, term306015.getClass(), "fineCount", 523197189);
        setIntField(term306015, term306015.getClass(), "finePercent", 658684460);
        setIntField(term306015, term306015.getClass(), "safeCount", 2073367039);
        setIntField(term306015, term306015.getClass(), "safePercent", -365877126);
        setIntField(term306015, term306015.getClass(), "sadCount", 251018856);
        setIntField(term306015, term306015.getClass(), "sadPercent", -1965331640);
        setIntField(term306015, term306015.getClass(), "wrongCount", -514392629);
        setIntField(term306015, term306015.getClass(), "wrongPercent", -166633123);
        setIntField(term306015, term306015.getClass(), "maxCombo", 373110517);
        setIntField(term306015, term306015.getClass(), "chanceTime", -1632703926);
        setIntField(term306015, term306015.getClass(), "holdScore", -1031499401);
        setIntField(term306015, term306015.getClass(), "attainPoint", 280202002);
        setIntField(term306015, term306015.getClass(), "skinId", -1074402599);
        setIntField(term306015, term306015.getClass(), "buttonSe", -1867539151);
        setIntField(term306015, term306015.getClass(), "buttonSeVol", -816430246);
        setIntField(term306015, term306015.getClass(), "sliderSe", 1754193865);
        setIntField(term306015, term306015.getClass(), "ChainSlideSe", 25277058);
        setIntField(term306015, term306015.getClass(), "SliderTouchSe", -949634053);
        setField(term306015, term306015.getClass(), "modules", "hOncybyCAH");
        setIntField(term306015, term306015.getClass(), "stageCompletion", 1495471055);
        setIntField(term306015, term306015.getClass(), "slideScore", -583415628);
        setIntField(term306015, term306015.getClass(), "isVocalChange", -1488660931);
        setField(term306015, term306015.getClass(), "customizeItems", "QduALnDSVo");
        setField(term306015, term306015.getClass(), "rhythmGameOptions", "izPpKDErnQ");
        setIntField(term306015, term306015.getClass(), "screenShotCount", -1);
        setIntField(term306720, term306720.getClass(), "year", 2022);
        setShortField(term306720, term306720.getClass(), "month", (short) 11);
        setShortField(term306720, term306720.getClass(), "day", (short) 10);
        setField(term306719, term306719.getClass(), "date", term306720);
        setByteField(term306724, term306724.getClass(), "hour", (byte) 20);
        setByteField(term306724, term306724.getClass(), "minute", (byte) 8);
        setByteField(term306724, term306724.getClass(), "second", (byte) 35);
        setIntField(term306724, term306724.getClass(), "nano", 658416570);
        setField(term306719, term306719.getClass(), "time", term306724);
        setField(term306015, term306015.getClass(), "dateTime", term306719);
        term306729 = new Integer(1899095931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term306729;
        callMethod(klass, "setSliderTouchSe", argTypes, term306015, args);
    }

};


