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

public class PlayLog_getScreenShotCount_206795703738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191229;

    public PlayLog_getScreenShotCount_206795703738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191966 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term191965 = ((Class) term191966).getDeclaredField((String) "MISS");
        ((Field) term191965).setAccessible(true);
        Object enum430 = ((Field) term191965).get((Object) null);
        Class<? extends Object> term192343 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term192342 = ((Class) term192343).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term192342).setAccessible(true);
        Object enum431 = ((Field) term192342).get((Object) null);
        Class<? extends Object> term192626 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term192625 = ((Class) term192626).getDeclaredField((String) "NORMAL");
        ((Field) term192625).setAccessible(true);
        Object enum432 = ((Field) term192625).get((Object) null);
        Class<? extends Object> term192901 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term192900 = ((Class) term192901).getDeclaredField((String) "ORIGINAL");
        ((Field) term192900).setAccessible(true);
        Object enum433 = ((Field) term192900).get((Object) null);
        Class<? extends Object> term193167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term193166 = ((Class) term193167).getDeclaredField((String) "NONE");
        ((Field) term193166).setAccessible(true);
        Object enum434 = ((Field) term193166).get((Object) null);
        Class<? extends Object> term193808 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term193807 = ((Class) term193808).getDeclaredField((String) "UNDEFINED");
        ((Field) term193807).setAccessible(true);
        Object enum435 = ((Field) term193807).get((Object) null);
        Class<? extends Object> term194092 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term194091 = ((Class) term194092).getDeclaredField((String) "EXTRA");
        ((Field) term194091).setAccessible(true);
        Object enum436 = ((Field) term194091).get((Object) null);
        Class<? extends Object> term194349 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term194348 = ((Class) term194349).getDeclaredField((String) "EXCELLENT");
        ((Field) term194348).setAccessible(true);
        Object enum437 = ((Field) term194348).get((Object) null);
        Class<? extends Object> term194648 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term194647 = ((Class) term194648).getDeclaredField((String) "CHEAP");
        ((Field) term194647).setAccessible(true);
        Object enum438 = ((Field) term194647).get((Object) null);
        term191229 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term191231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term191354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191359 = newInstance(Class.forName("java.time.LocalTime"));
        Object term191949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191954 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term191229, term191229.getClass(), "id", 5671808784468963649L);
        setLongField(term191231, term191231.getClass(), "id", 2297097306706899827L);
        setIntField(term191231, term191231.getClass(), "pdId", -1911828505);
        setField(term191231, term191231.getClass(), "playerName", "xxx");
        setIntField(term191231, term191231.getClass(), "vocaloidPoints", 300);
        setIntField(term191231, term191231.getClass(), "level", 1);
        setIntField(term191231, term191231.getClass(), "levelExp", 241725499);
        setField(term191231, term191231.getClass(), "levelTitle", "xxx");
        setIntField(term191231, term191231.getClass(), "plateId", -1);
        setIntField(term191231, term191231.getClass(), "plateEffectId", -1);
        setField(term191231, term191231.getClass(), "passwordStatus", enum430);
        setField(term191231, term191231.getClass(), "password", "**********");
        setBooleanField(term191231, term191231.getClass(), "preferPerPvModule", true);
        setBooleanField(term191231, term191231.getClass(), "preferCommonModule", false);
        setBooleanField(term191231, term191231.getClass(), "usePerPvSkin", false);
        setBooleanField(term191231, term191231.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term191231, term191231.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term191231, term191231.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term191231, term191231.getClass(), "usePerPvTouchSliderSe", false);
        setField(term191231, term191231.getClass(), "commonModule", "-999,-999,-999");
        setField(term191231, term191231.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term191355, term191355.getClass(), "year", 2026);
        setShortField(term191355, term191355.getClass(), "month", (short) 6);
        setShortField(term191355, term191355.getClass(), "day", (short) 29);
        setField(term191354, term191354.getClass(), "date", term191355);
        setByteField(term191359, term191359.getClass(), "hour", (byte) 4);
        setByteField(term191359, term191359.getClass(), "minute", (byte) 27);
        setByteField(term191359, term191359.getClass(), "second", (byte) 33);
        setIntField(term191359, term191359.getClass(), "nano", 287242000);
        setField(term191354, term191354.getClass(), "time", term191359);
        setField(term191231, term191231.getClass(), "commonModuleSetTime", term191354);
        setField(term191231, term191231.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term191231, term191231.getClass(), "commonSkin", -1);
        setIntField(term191231, term191231.getClass(), "headphoneVolume", 100);
        setBooleanField(term191231, term191231.getClass(), "buttonSeOn", true);
        setIntField(term191231, term191231.getClass(), "buttonSeVolume", 100);
        setIntField(term191231, term191231.getClass(), "sliderSeVolume", 100);
        setIntField(term191231, term191231.getClass(), "buttonSe", -1);
        setIntField(term191231, term191231.getClass(), "chainSlideSe", -1);
        setIntField(term191231, term191231.getClass(), "slideSe", -1);
        setIntField(term191231, term191231.getClass(), "sliderTouchSe", -1);
        setField(term191231, term191231.getClass(), "sortMode", enum431);
        setIntField(term191231, term191231.getClass(), "nextPvId", -1);
        setField(term191231, term191231.getClass(), "nextDifficulty", enum432);
        setField(term191231, term191231.getClass(), "nextEdition", enum433);
        setBooleanField(term191231, term191231.getClass(), "showInterimRanking", true);
        setBooleanField(term191231, term191231.getClass(), "showClearStatus", true);
        setBooleanField(term191231, term191231.getClass(), "showGreatBorder", true);
        setBooleanField(term191231, term191231.getClass(), "showExcellentBorder", true);
        setBooleanField(term191231, term191231.getClass(), "showRivalBorder", true);
        setBooleanField(term191231, term191231.getClass(), "showRgoSetting", true);
        setBooleanField(term191231, term191231.getClass(), "contestNowPlayingEnable", true);
        setIntField(term191231, term191231.getClass(), "contestNowPlayingId", -1);
        setIntField(term191231, term191231.getClass(), "contestNowPlayingValue", -1);
        setField(term191231, term191231.getClass(), "contestNowPlayingResultRank", enum434);
        setField(term191231, term191231.getClass(), "contestNowPlayingSpecifier", "");
        setField(term191231, term191231.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term191231, term191231.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term191231, term191231.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term191231, term191231.getClass(), "rivalPdId", -1);
        setField(term191229, term191229.getClass(), "pdId", term191231);
        setIntField(term191229, term191229.getClass(), "pvId", 823179298);
        setField(term191229, term191229.getClass(), "difficulty", enum435);
        setField(term191229, term191229.getClass(), "edition", enum436);
        setIntField(term191229, term191229.getClass(), "scriptVer", 1174484848);
        setIntField(term191229, term191229.getClass(), "score", 939889496);
        setField(term191229, term191229.getClass(), "challengeKind", enum437);
        setIntField(term191229, term191229.getClass(), "challengeResult", -495242269);
        setField(term191229, term191229.getClass(), "clearResult", enum438);
        setIntField(term191229, term191229.getClass(), "vp", 932810106);
        setIntField(term191229, term191229.getClass(), "coolCount", -2138801137);
        setIntField(term191229, term191229.getClass(), "coolPercent", -1470115841);
        setIntField(term191229, term191229.getClass(), "fineCount", 480909331);
        setIntField(term191229, term191229.getClass(), "finePercent", -2024983877);
        setIntField(term191229, term191229.getClass(), "safeCount", 1757149811);
        setIntField(term191229, term191229.getClass(), "safePercent", 1505375686);
        setIntField(term191229, term191229.getClass(), "sadCount", -132005524);
        setIntField(term191229, term191229.getClass(), "sadPercent", -1235127374);
        setIntField(term191229, term191229.getClass(), "wrongCount", -2077814162);
        setIntField(term191229, term191229.getClass(), "wrongPercent", 444514470);
        setIntField(term191229, term191229.getClass(), "maxCombo", -147055177);
        setIntField(term191229, term191229.getClass(), "chanceTime", 1979044375);
        setIntField(term191229, term191229.getClass(), "holdScore", 961252909);
        setIntField(term191229, term191229.getClass(), "attainPoint", 1455842357);
        setIntField(term191229, term191229.getClass(), "skinId", 1349806561);
        setIntField(term191229, term191229.getClass(), "buttonSe", 923905351);
        setIntField(term191229, term191229.getClass(), "buttonSeVol", 428360161);
        setIntField(term191229, term191229.getClass(), "sliderSe", 631528579);
        setIntField(term191229, term191229.getClass(), "ChainSlideSe", -1652091834);
        setIntField(term191229, term191229.getClass(), "SliderTouchSe", -282021579);
        setField(term191229, term191229.getClass(), "modules", "yGtHPyvYiQ");
        setIntField(term191229, term191229.getClass(), "stageCompletion", -1652588127);
        setIntField(term191229, term191229.getClass(), "slideScore", -1902823385);
        setIntField(term191229, term191229.getClass(), "isVocalChange", -784924879);
        setField(term191229, term191229.getClass(), "customizeItems", "MvRIxilFMJ");
        setField(term191229, term191229.getClass(), "rhythmGameOptions", "iNwOJRBEjp");
        setIntField(term191229, term191229.getClass(), "screenShotCount", -1);
        setIntField(term191950, term191950.getClass(), "year", 2015);
        setShortField(term191950, term191950.getClass(), "month", (short) 12);
        setShortField(term191950, term191950.getClass(), "day", (short) 23);
        setField(term191949, term191949.getClass(), "date", term191950);
        setByteField(term191954, term191954.getClass(), "hour", (byte) 14);
        setByteField(term191954, term191954.getClass(), "minute", (byte) 17);
        setByteField(term191954, term191954.getClass(), "second", (byte) 50);
        setIntField(term191954, term191954.getClass(), "nano", 325544804);
        setField(term191949, term191949.getClass(), "time", term191954);
        setField(term191229, term191229.getClass(), "dateTime", term191949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScreenShotCount", argTypes, term191229, args);
    }

};


