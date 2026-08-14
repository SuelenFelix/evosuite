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

public class PlayLog_getIsVocalChange_181198250135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180070;

    public PlayLog_getIsVocalChange_181198250135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180806 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term180805 = ((Class) term180806).getDeclaredField((String) "MISS");
        ((Field) term180805).setAccessible(true);
        Object enum403 = ((Field) term180805).get((Object) null);
        Class<? extends Object> term181183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term181182 = ((Class) term181183).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term181182).setAccessible(true);
        Object enum404 = ((Field) term181182).get((Object) null);
        Class<? extends Object> term181466 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term181465 = ((Class) term181466).getDeclaredField((String) "NORMAL");
        ((Field) term181465).setAccessible(true);
        Object enum405 = ((Field) term181465).get((Object) null);
        Class<? extends Object> term181741 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term181740 = ((Class) term181741).getDeclaredField((String) "ORIGINAL");
        ((Field) term181740).setAccessible(true);
        Object enum406 = ((Field) term181740).get((Object) null);
        Class<? extends Object> term182007 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term182006 = ((Class) term182007).getDeclaredField((String) "NONE");
        ((Field) term182006).setAccessible(true);
        Object enum407 = ((Field) term182006).get((Object) null);
        Class<? extends Object> term182648 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term182647 = ((Class) term182648).getDeclaredField((String) "EXTREME");
        ((Field) term182647).setAccessible(true);
        Object enum408 = ((Field) term182647).get((Object) null);
        Class<? extends Object> term182926 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term182925 = ((Class) term182926).getDeclaredField((String) "EXTRA");
        ((Field) term182925).setAccessible(true);
        Object enum409 = ((Field) term182925).get((Object) null);
        Class<? extends Object> term183183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term183182 = ((Class) term183183).getDeclaredField((String) "PERFECT");
        ((Field) term183182).setAccessible(true);
        Object enum410 = ((Field) term183182).get((Object) null);
        Class<? extends Object> term183476 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term183475 = ((Class) term183476).getDeclaredField((String) "NO_CLEAR");
        ((Field) term183475).setAccessible(true);
        Object enum411 = ((Field) term183475).get((Object) null);
        term180070 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term180072 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term180195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180794 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180070, term180070.getClass(), "id", -6342139649364011743L);
        setLongField(term180072, term180072.getClass(), "id", -4924950707540628022L);
        setIntField(term180072, term180072.getClass(), "pdId", 1833713431);
        setField(term180072, term180072.getClass(), "playerName", "xxx");
        setIntField(term180072, term180072.getClass(), "vocaloidPoints", 300);
        setIntField(term180072, term180072.getClass(), "level", 1);
        setIntField(term180072, term180072.getClass(), "levelExp", -706222608);
        setField(term180072, term180072.getClass(), "levelTitle", "xxx");
        setIntField(term180072, term180072.getClass(), "plateId", -1);
        setIntField(term180072, term180072.getClass(), "plateEffectId", -1);
        setField(term180072, term180072.getClass(), "passwordStatus", enum403);
        setField(term180072, term180072.getClass(), "password", "**********");
        setBooleanField(term180072, term180072.getClass(), "preferPerPvModule", true);
        setBooleanField(term180072, term180072.getClass(), "preferCommonModule", false);
        setBooleanField(term180072, term180072.getClass(), "usePerPvSkin", true);
        setBooleanField(term180072, term180072.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term180072, term180072.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term180072, term180072.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term180072, term180072.getClass(), "usePerPvTouchSliderSe", false);
        setField(term180072, term180072.getClass(), "commonModule", "-999,-999,-999");
        setField(term180072, term180072.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term180196, term180196.getClass(), "year", 2026);
        setShortField(term180196, term180196.getClass(), "month", (short) 8);
        setShortField(term180196, term180196.getClass(), "day", (short) 12);
        setField(term180195, term180195.getClass(), "date", term180196);
        setByteField(term180200, term180200.getClass(), "hour", (byte) 2);
        setByteField(term180200, term180200.getClass(), "minute", (byte) 2);
        setByteField(term180200, term180200.getClass(), "second", (byte) 49);
        setIntField(term180200, term180200.getClass(), "nano", 49937000);
        setField(term180195, term180195.getClass(), "time", term180200);
        setField(term180072, term180072.getClass(), "commonModuleSetTime", term180195);
        setField(term180072, term180072.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term180072, term180072.getClass(), "commonSkin", -1);
        setIntField(term180072, term180072.getClass(), "headphoneVolume", 100);
        setBooleanField(term180072, term180072.getClass(), "buttonSeOn", true);
        setIntField(term180072, term180072.getClass(), "buttonSeVolume", 100);
        setIntField(term180072, term180072.getClass(), "sliderSeVolume", 100);
        setIntField(term180072, term180072.getClass(), "buttonSe", -1);
        setIntField(term180072, term180072.getClass(), "chainSlideSe", -1);
        setIntField(term180072, term180072.getClass(), "slideSe", -1);
        setIntField(term180072, term180072.getClass(), "sliderTouchSe", -1);
        setField(term180072, term180072.getClass(), "sortMode", enum404);
        setIntField(term180072, term180072.getClass(), "nextPvId", -1);
        setField(term180072, term180072.getClass(), "nextDifficulty", enum405);
        setField(term180072, term180072.getClass(), "nextEdition", enum406);
        setBooleanField(term180072, term180072.getClass(), "showInterimRanking", true);
        setBooleanField(term180072, term180072.getClass(), "showClearStatus", true);
        setBooleanField(term180072, term180072.getClass(), "showGreatBorder", true);
        setBooleanField(term180072, term180072.getClass(), "showExcellentBorder", true);
        setBooleanField(term180072, term180072.getClass(), "showRivalBorder", true);
        setBooleanField(term180072, term180072.getClass(), "showRgoSetting", true);
        setBooleanField(term180072, term180072.getClass(), "contestNowPlayingEnable", true);
        setIntField(term180072, term180072.getClass(), "contestNowPlayingId", -1);
        setIntField(term180072, term180072.getClass(), "contestNowPlayingValue", -1);
        setField(term180072, term180072.getClass(), "contestNowPlayingResultRank", enum407);
        setField(term180072, term180072.getClass(), "contestNowPlayingSpecifier", "");
        setField(term180072, term180072.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term180072, term180072.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term180072, term180072.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term180072, term180072.getClass(), "rivalPdId", -1);
        setField(term180070, term180070.getClass(), "pdId", term180072);
        setIntField(term180070, term180070.getClass(), "pvId", -2003607923);
        setField(term180070, term180070.getClass(), "difficulty", enum408);
        setField(term180070, term180070.getClass(), "edition", enum409);
        setIntField(term180070, term180070.getClass(), "scriptVer", 1378805929);
        setIntField(term180070, term180070.getClass(), "score", 695052304);
        setField(term180070, term180070.getClass(), "challengeKind", enum410);
        setIntField(term180070, term180070.getClass(), "challengeResult", -179937218);
        setField(term180070, term180070.getClass(), "clearResult", enum411);
        setIntField(term180070, term180070.getClass(), "vp", 940896043);
        setIntField(term180070, term180070.getClass(), "coolCount", -1156002984);
        setIntField(term180070, term180070.getClass(), "coolPercent", 1676254730);
        setIntField(term180070, term180070.getClass(), "fineCount", -1661200819);
        setIntField(term180070, term180070.getClass(), "finePercent", -235039141);
        setIntField(term180070, term180070.getClass(), "safeCount", -1414233013);
        setIntField(term180070, term180070.getClass(), "safePercent", -1174440096);
        setIntField(term180070, term180070.getClass(), "sadCount", -679614653);
        setIntField(term180070, term180070.getClass(), "sadPercent", -561851867);
        setIntField(term180070, term180070.getClass(), "wrongCount", -1809928454);
        setIntField(term180070, term180070.getClass(), "wrongPercent", -191639503);
        setIntField(term180070, term180070.getClass(), "maxCombo", -1563700756);
        setIntField(term180070, term180070.getClass(), "chanceTime", -208314837);
        setIntField(term180070, term180070.getClass(), "holdScore", 697841387);
        setIntField(term180070, term180070.getClass(), "attainPoint", -1749591213);
        setIntField(term180070, term180070.getClass(), "skinId", 1703093401);
        setIntField(term180070, term180070.getClass(), "buttonSe", 47607734);
        setIntField(term180070, term180070.getClass(), "buttonSeVol", 1717232691);
        setIntField(term180070, term180070.getClass(), "sliderSe", -938127737);
        setIntField(term180070, term180070.getClass(), "ChainSlideSe", -1408678076);
        setIntField(term180070, term180070.getClass(), "SliderTouchSe", 1201413899);
        setField(term180070, term180070.getClass(), "modules", "qxSDVejjiY");
        setIntField(term180070, term180070.getClass(), "stageCompletion", -376722373);
        setIntField(term180070, term180070.getClass(), "slideScore", 1180687854);
        setIntField(term180070, term180070.getClass(), "isVocalChange", 328631288);
        setField(term180070, term180070.getClass(), "customizeItems", "xBsXSDjXYK");
        setField(term180070, term180070.getClass(), "rhythmGameOptions", "sEnIVFtZuQ");
        setIntField(term180070, term180070.getClass(), "screenShotCount", -1);
        setIntField(term180790, term180790.getClass(), "year", 2010);
        setShortField(term180790, term180790.getClass(), "month", (short) 9);
        setShortField(term180790, term180790.getClass(), "day", (short) 28);
        setField(term180789, term180789.getClass(), "date", term180790);
        setByteField(term180794, term180794.getClass(), "hour", (byte) 6);
        setByteField(term180794, term180794.getClass(), "minute", (byte) 4);
        setByteField(term180794, term180794.getClass(), "second", (byte) 54);
        setIntField(term180794, term180794.getClass(), "nano", 604713782);
        setField(term180789, term180789.getClass(), "time", term180794);
        setField(term180070, term180070.getClass(), "dateTime", term180789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsVocalChange", argTypes, term180070, args);
    }

};


