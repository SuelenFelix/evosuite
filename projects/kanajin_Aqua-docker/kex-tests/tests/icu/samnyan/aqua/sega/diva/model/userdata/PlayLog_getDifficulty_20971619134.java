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

public class PlayLog_getDifficulty_20971619134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69726;

    public PlayLog_getDifficulty_20971619134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term70461 = ((Class) term70462).getDeclaredField((String) "MISS");
        ((Field) term70461).setAccessible(true);
        Object enum142 = ((Field) term70461).get((Object) null);
        Class<? extends Object> term70839 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term70838 = ((Class) term70839).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term70838).setAccessible(true);
        Object enum143 = ((Field) term70838).get((Object) null);
        Class<? extends Object> term71122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term71121 = ((Class) term71122).getDeclaredField((String) "NORMAL");
        ((Field) term71121).setAccessible(true);
        Object enum144 = ((Field) term71121).get((Object) null);
        Class<? extends Object> term71397 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term71396 = ((Class) term71397).getDeclaredField((String) "ORIGINAL");
        ((Field) term71396).setAccessible(true);
        Object enum145 = ((Field) term71396).get((Object) null);
        Class<? extends Object> term71663 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term71662 = ((Class) term71663).getDeclaredField((String) "NONE");
        ((Field) term71662).setAccessible(true);
        Object enum146 = ((Field) term71662).get((Object) null);
        Class<? extends Object> term72304 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term72303 = ((Class) term72304).getDeclaredField((String) "HARD");
        ((Field) term72303).setAccessible(true);
        Object enum147 = ((Field) term72303).get((Object) null);
        Class<? extends Object> term72573 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term72572 = ((Class) term72573).getDeclaredField((String) "EXTRA");
        ((Field) term72572).setAccessible(true);
        Object enum148 = ((Field) term72572).get((Object) null);
        Class<? extends Object> term72830 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term72829 = ((Class) term72830).getDeclaredField((String) "EXCELLENT");
        ((Field) term72829).setAccessible(true);
        Object enum149 = ((Field) term72829).get((Object) null);
        Class<? extends Object> term73129 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term73128 = ((Class) term73129).getDeclaredField((String) "EXCELLENT");
        ((Field) term73128).setAccessible(true);
        Object enum150 = ((Field) term73128).get((Object) null);
        term69726 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term69728 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term69851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70450 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69726, term69726.getClass(), "id", -1154553077993834885L);
        setLongField(term69728, term69728.getClass(), "id", -2850532706972744550L);
        setIntField(term69728, term69728.getClass(), "pdId", -916584829);
        setField(term69728, term69728.getClass(), "playerName", "xxx");
        setIntField(term69728, term69728.getClass(), "vocaloidPoints", 300);
        setIntField(term69728, term69728.getClass(), "level", 1);
        setIntField(term69728, term69728.getClass(), "levelExp", -2131181468);
        setField(term69728, term69728.getClass(), "levelTitle", "xxx");
        setIntField(term69728, term69728.getClass(), "plateId", -1);
        setIntField(term69728, term69728.getClass(), "plateEffectId", -1);
        setField(term69728, term69728.getClass(), "passwordStatus", enum142);
        setField(term69728, term69728.getClass(), "password", "**********");
        setBooleanField(term69728, term69728.getClass(), "preferPerPvModule", true);
        setBooleanField(term69728, term69728.getClass(), "preferCommonModule", false);
        setBooleanField(term69728, term69728.getClass(), "usePerPvSkin", false);
        setBooleanField(term69728, term69728.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term69728, term69728.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term69728, term69728.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term69728, term69728.getClass(), "usePerPvTouchSliderSe", true);
        setField(term69728, term69728.getClass(), "commonModule", "-999,-999,-999");
        setField(term69728, term69728.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term69852, term69852.getClass(), "year", 2026);
        setShortField(term69852, term69852.getClass(), "month", (short) 6);
        setShortField(term69852, term69852.getClass(), "day", (short) 29);
        setField(term69851, term69851.getClass(), "date", term69852);
        setByteField(term69856, term69856.getClass(), "hour", (byte) 4);
        setByteField(term69856, term69856.getClass(), "minute", (byte) 27);
        setByteField(term69856, term69856.getClass(), "second", (byte) 24);
        setIntField(term69856, term69856.getClass(), "nano", 568376000);
        setField(term69851, term69851.getClass(), "time", term69856);
        setField(term69728, term69728.getClass(), "commonModuleSetTime", term69851);
        setField(term69728, term69728.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term69728, term69728.getClass(), "commonSkin", -1);
        setIntField(term69728, term69728.getClass(), "headphoneVolume", 100);
        setBooleanField(term69728, term69728.getClass(), "buttonSeOn", true);
        setIntField(term69728, term69728.getClass(), "buttonSeVolume", 100);
        setIntField(term69728, term69728.getClass(), "sliderSeVolume", 100);
        setIntField(term69728, term69728.getClass(), "buttonSe", -1);
        setIntField(term69728, term69728.getClass(), "chainSlideSe", -1);
        setIntField(term69728, term69728.getClass(), "slideSe", -1);
        setIntField(term69728, term69728.getClass(), "sliderTouchSe", -1);
        setField(term69728, term69728.getClass(), "sortMode", enum143);
        setIntField(term69728, term69728.getClass(), "nextPvId", -1);
        setField(term69728, term69728.getClass(), "nextDifficulty", enum144);
        setField(term69728, term69728.getClass(), "nextEdition", enum145);
        setBooleanField(term69728, term69728.getClass(), "showInterimRanking", true);
        setBooleanField(term69728, term69728.getClass(), "showClearStatus", true);
        setBooleanField(term69728, term69728.getClass(), "showGreatBorder", true);
        setBooleanField(term69728, term69728.getClass(), "showExcellentBorder", true);
        setBooleanField(term69728, term69728.getClass(), "showRivalBorder", true);
        setBooleanField(term69728, term69728.getClass(), "showRgoSetting", true);
        setBooleanField(term69728, term69728.getClass(), "contestNowPlayingEnable", true);
        setIntField(term69728, term69728.getClass(), "contestNowPlayingId", -1);
        setIntField(term69728, term69728.getClass(), "contestNowPlayingValue", -1);
        setField(term69728, term69728.getClass(), "contestNowPlayingResultRank", enum146);
        setField(term69728, term69728.getClass(), "contestNowPlayingSpecifier", "");
        setField(term69728, term69728.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term69728, term69728.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term69728, term69728.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term69728, term69728.getClass(), "rivalPdId", -1);
        setField(term69726, term69726.getClass(), "pdId", term69728);
        setIntField(term69726, term69726.getClass(), "pvId", 282916351);
        setField(term69726, term69726.getClass(), "difficulty", enum147);
        setField(term69726, term69726.getClass(), "edition", enum148);
        setIntField(term69726, term69726.getClass(), "scriptVer", 880977281);
        setIntField(term69726, term69726.getClass(), "score", 371943306);
        setField(term69726, term69726.getClass(), "challengeKind", enum149);
        setIntField(term69726, term69726.getClass(), "challengeResult", 982388293);
        setField(term69726, term69726.getClass(), "clearResult", enum150);
        setIntField(term69726, term69726.getClass(), "vp", -159494544);
        setIntField(term69726, term69726.getClass(), "coolCount", -75206835);
        setIntField(term69726, term69726.getClass(), "coolPercent", -1618206977);
        setIntField(term69726, term69726.getClass(), "fineCount", -1747406163);
        setIntField(term69726, term69726.getClass(), "finePercent", 388157121);
        setIntField(term69726, term69726.getClass(), "safeCount", 1684998508);
        setIntField(term69726, term69726.getClass(), "safePercent", -1476644457);
        setIntField(term69726, term69726.getClass(), "sadCount", 1270666529);
        setIntField(term69726, term69726.getClass(), "sadPercent", -1146679443);
        setIntField(term69726, term69726.getClass(), "wrongCount", -860131894);
        setIntField(term69726, term69726.getClass(), "wrongPercent", -1022990421);
        setIntField(term69726, term69726.getClass(), "maxCombo", 1045547089);
        setIntField(term69726, term69726.getClass(), "chanceTime", -1122880881);
        setIntField(term69726, term69726.getClass(), "holdScore", -542712742);
        setIntField(term69726, term69726.getClass(), "attainPoint", -1254072822);
        setIntField(term69726, term69726.getClass(), "skinId", -1111249833);
        setIntField(term69726, term69726.getClass(), "buttonSe", -1692331299);
        setIntField(term69726, term69726.getClass(), "buttonSeVol", 479531250);
        setIntField(term69726, term69726.getClass(), "sliderSe", 1320570890);
        setIntField(term69726, term69726.getClass(), "ChainSlideSe", -130649791);
        setIntField(term69726, term69726.getClass(), "SliderTouchSe", 534834644);
        setField(term69726, term69726.getClass(), "modules", "MxlszYVzRf");
        setIntField(term69726, term69726.getClass(), "stageCompletion", 1959097203);
        setIntField(term69726, term69726.getClass(), "slideScore", -209654048);
        setIntField(term69726, term69726.getClass(), "isVocalChange", 477625804);
        setField(term69726, term69726.getClass(), "customizeItems", "LQFpaHEwXR");
        setField(term69726, term69726.getClass(), "rhythmGameOptions", "oVcInYnLWB");
        setIntField(term69726, term69726.getClass(), "screenShotCount", -1);
        setIntField(term70446, term70446.getClass(), "year", 2025);
        setShortField(term70446, term70446.getClass(), "month", (short) 4);
        setShortField(term70446, term70446.getClass(), "day", (short) 24);
        setField(term70445, term70445.getClass(), "date", term70446);
        setByteField(term70450, term70450.getClass(), "hour", (byte) 18);
        setByteField(term70450, term70450.getClass(), "minute", (byte) 11);
        setByteField(term70450, term70450.getClass(), "second", (byte) 40);
        setIntField(term70450, term70450.getClass(), "nano", 137454929);
        setField(term70445, term70445.getClass(), "time", term70450);
        setField(term69726, term69726.getClass(), "dateTime", term70445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term69726, args);
    }

};


