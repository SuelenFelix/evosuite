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

public class PlayLog_getAttainPoint_34762078925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144492;

    public PlayLog_getAttainPoint_34762078925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term145214 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term145213 = ((Class) term145214).getDeclaredField((String) "MISS");
        ((Field) term145213).setAccessible(true);
        Object enum319 = ((Field) term145213).get((Object) null);
        Class<? extends Object> term145591 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term145590 = ((Class) term145591).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term145590).setAccessible(true);
        Object enum320 = ((Field) term145590).get((Object) null);
        Class<? extends Object> term145874 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term145873 = ((Class) term145874).getDeclaredField((String) "NORMAL");
        ((Field) term145873).setAccessible(true);
        Object enum321 = ((Field) term145873).get((Object) null);
        Class<? extends Object> term146149 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term146148 = ((Class) term146149).getDeclaredField((String) "ORIGINAL");
        ((Field) term146148).setAccessible(true);
        Object enum322 = ((Field) term146148).get((Object) null);
        Class<? extends Object> term146415 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term146414 = ((Class) term146415).getDeclaredField((String) "NONE");
        ((Field) term146414).setAccessible(true);
        Object enum323 = ((Field) term146414).get((Object) null);
        Class<? extends Object> term147056 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term147055 = ((Class) term147056).getDeclaredField((String) "HARD");
        ((Field) term147055).setAccessible(true);
        Object enum324 = ((Field) term147055).get((Object) null);
        Class<? extends Object> term147325 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term147324 = ((Class) term147325).getDeclaredField((String) "UNDEFINED");
        ((Field) term147324).setAccessible(true);
        Object enum325 = ((Field) term147324).get((Object) null);
        Class<? extends Object> term147624 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term147623 = ((Class) term147624).getDeclaredField((String) "CHEAP");
        ((Field) term147623).setAccessible(true);
        Object enum326 = ((Field) term147623).get((Object) null);
        term144492 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term144494 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term144617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145202 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144492, term144492.getClass(), "id", 3133860696238261492L);
        setLongField(term144494, term144494.getClass(), "id", 7247160664318067468L);
        setIntField(term144494, term144494.getClass(), "pdId", 1361126430);
        setField(term144494, term144494.getClass(), "playerName", "xxx");
        setIntField(term144494, term144494.getClass(), "vocaloidPoints", 300);
        setIntField(term144494, term144494.getClass(), "level", 1);
        setIntField(term144494, term144494.getClass(), "levelExp", 1728588701);
        setField(term144494, term144494.getClass(), "levelTitle", "xxx");
        setIntField(term144494, term144494.getClass(), "plateId", -1);
        setIntField(term144494, term144494.getClass(), "plateEffectId", -1);
        setField(term144494, term144494.getClass(), "passwordStatus", enum319);
        setField(term144494, term144494.getClass(), "password", "**********");
        setBooleanField(term144494, term144494.getClass(), "preferPerPvModule", true);
        setBooleanField(term144494, term144494.getClass(), "preferCommonModule", true);
        setBooleanField(term144494, term144494.getClass(), "usePerPvSkin", true);
        setBooleanField(term144494, term144494.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term144494, term144494.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term144494, term144494.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term144494, term144494.getClass(), "usePerPvTouchSliderSe", false);
        setField(term144494, term144494.getClass(), "commonModule", "-999,-999,-999");
        setField(term144494, term144494.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term144618, term144618.getClass(), "year", 2026);
        setShortField(term144618, term144618.getClass(), "month", (short) 8);
        setShortField(term144618, term144618.getClass(), "day", (short) 12);
        setField(term144617, term144617.getClass(), "date", term144618);
        setByteField(term144622, term144622.getClass(), "hour", (byte) 2);
        setByteField(term144622, term144622.getClass(), "minute", (byte) 2);
        setByteField(term144622, term144622.getClass(), "second", (byte) 46);
        setIntField(term144622, term144622.getClass(), "nano", 426098000);
        setField(term144617, term144617.getClass(), "time", term144622);
        setField(term144494, term144494.getClass(), "commonModuleSetTime", term144617);
        setField(term144494, term144494.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term144494, term144494.getClass(), "commonSkin", -1);
        setIntField(term144494, term144494.getClass(), "headphoneVolume", 100);
        setBooleanField(term144494, term144494.getClass(), "buttonSeOn", true);
        setIntField(term144494, term144494.getClass(), "buttonSeVolume", 100);
        setIntField(term144494, term144494.getClass(), "sliderSeVolume", 100);
        setIntField(term144494, term144494.getClass(), "buttonSe", -1);
        setIntField(term144494, term144494.getClass(), "chainSlideSe", -1);
        setIntField(term144494, term144494.getClass(), "slideSe", -1);
        setIntField(term144494, term144494.getClass(), "sliderTouchSe", -1);
        setField(term144494, term144494.getClass(), "sortMode", enum320);
        setIntField(term144494, term144494.getClass(), "nextPvId", -1);
        setField(term144494, term144494.getClass(), "nextDifficulty", enum321);
        setField(term144494, term144494.getClass(), "nextEdition", enum322);
        setBooleanField(term144494, term144494.getClass(), "showInterimRanking", true);
        setBooleanField(term144494, term144494.getClass(), "showClearStatus", true);
        setBooleanField(term144494, term144494.getClass(), "showGreatBorder", true);
        setBooleanField(term144494, term144494.getClass(), "showExcellentBorder", true);
        setBooleanField(term144494, term144494.getClass(), "showRivalBorder", true);
        setBooleanField(term144494, term144494.getClass(), "showRgoSetting", true);
        setBooleanField(term144494, term144494.getClass(), "contestNowPlayingEnable", false);
        setIntField(term144494, term144494.getClass(), "contestNowPlayingId", -1);
        setIntField(term144494, term144494.getClass(), "contestNowPlayingValue", -1);
        setField(term144494, term144494.getClass(), "contestNowPlayingResultRank", enum323);
        setField(term144494, term144494.getClass(), "contestNowPlayingSpecifier", "");
        setField(term144494, term144494.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term144494, term144494.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term144494, term144494.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term144494, term144494.getClass(), "rivalPdId", -1);
        setField(term144492, term144492.getClass(), "pdId", term144494);
        setIntField(term144492, term144492.getClass(), "pvId", -355769268);
        setField(term144492, term144492.getClass(), "difficulty", enum324);
        setField(term144492, term144492.getClass(), "edition", enum322);
        setIntField(term144492, term144492.getClass(), "scriptVer", -114460662);
        setIntField(term144492, term144492.getClass(), "score", -355376034);
        setField(term144492, term144492.getClass(), "challengeKind", enum325);
        setIntField(term144492, term144492.getClass(), "challengeResult", 588390599);
        setField(term144492, term144492.getClass(), "clearResult", enum326);
        setIntField(term144492, term144492.getClass(), "vp", -95969566);
        setIntField(term144492, term144492.getClass(), "coolCount", -68615285);
        setIntField(term144492, term144492.getClass(), "coolPercent", -337504086);
        setIntField(term144492, term144492.getClass(), "fineCount", 2074130991);
        setIntField(term144492, term144492.getClass(), "finePercent", 532588266);
        setIntField(term144492, term144492.getClass(), "safeCount", -1286686332);
        setIntField(term144492, term144492.getClass(), "safePercent", -284885486);
        setIntField(term144492, term144492.getClass(), "sadCount", 1791984446);
        setIntField(term144492, term144492.getClass(), "sadPercent", 804070622);
        setIntField(term144492, term144492.getClass(), "wrongCount", 1850364894);
        setIntField(term144492, term144492.getClass(), "wrongPercent", 915367534);
        setIntField(term144492, term144492.getClass(), "maxCombo", 1949983666);
        setIntField(term144492, term144492.getClass(), "chanceTime", 154111854);
        setIntField(term144492, term144492.getClass(), "holdScore", 710986341);
        setIntField(term144492, term144492.getClass(), "attainPoint", -873958002);
        setIntField(term144492, term144492.getClass(), "skinId", -1780848958);
        setIntField(term144492, term144492.getClass(), "buttonSe", 1235045850);
        setIntField(term144492, term144492.getClass(), "buttonSeVol", -75143033);
        setIntField(term144492, term144492.getClass(), "sliderSe", 797015478);
        setIntField(term144492, term144492.getClass(), "ChainSlideSe", 717574276);
        setIntField(term144492, term144492.getClass(), "SliderTouchSe", 1795369860);
        setField(term144492, term144492.getClass(), "modules", "MAcUBcBckh");
        setIntField(term144492, term144492.getClass(), "stageCompletion", -570164389);
        setIntField(term144492, term144492.getClass(), "slideScore", 43200329);
        setIntField(term144492, term144492.getClass(), "isVocalChange", 998679955);
        setField(term144492, term144492.getClass(), "customizeItems", "oVgzLbrsFr");
        setField(term144492, term144492.getClass(), "rhythmGameOptions", "vQVyKLdtaz");
        setIntField(term144492, term144492.getClass(), "screenShotCount", -1);
        setIntField(term145198, term145198.getClass(), "year", 2027);
        setShortField(term145198, term145198.getClass(), "month", (short) 2);
        setShortField(term145198, term145198.getClass(), "day", (short) 19);
        setField(term145197, term145197.getClass(), "date", term145198);
        setByteField(term145202, term145202.getClass(), "hour", (byte) 17);
        setByteField(term145202, term145202.getClass(), "minute", (byte) 37);
        setByteField(term145202, term145202.getClass(), "second", (byte) 27);
        setIntField(term145202, term145202.getClass(), "nano", 920380537);
        setField(term145197, term145197.getClass(), "time", term145202);
        setField(term144492, term144492.getClass(), "dateTime", term145197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttainPoint", argTypes, term144492, args);
    }

};


