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

public class GameSession_setStartTime_97840140619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411572;
     Object term412225;

    public GameSession_setStartTime_97840140619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term412242 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term412241 = ((Class) term412242).getDeclaredField((String) "MISS");
        ((Field) term412241).setAccessible(true);
        Object enum927 = ((Field) term412241).get((Object) null);
        Class<? extends Object> term412619 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term412618 = ((Class) term412619).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term412618).setAccessible(true);
        Object enum928 = ((Field) term412618).get((Object) null);
        Class<? extends Object> term412902 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term412901 = ((Class) term412902).getDeclaredField((String) "NORMAL");
        ((Field) term412901).setAccessible(true);
        Object enum929 = ((Field) term412901).get((Object) null);
        Class<? extends Object> term413177 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term413176 = ((Class) term413177).getDeclaredField((String) "ORIGINAL");
        ((Field) term413176).setAccessible(true);
        Object enum930 = ((Field) term413176).get((Object) null);
        Class<? extends Object> term413443 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term413442 = ((Class) term413443).getDeclaredField((String) "NONE");
        ((Field) term413442).setAccessible(true);
        Object enum931 = ((Field) term413442).get((Object) null);
        Class<? extends Object> term414084 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term414083 = ((Class) term414084).getDeclaredField((String) "START");
        ((Field) term414083).setAccessible(true);
        Object enum932 = ((Field) term414083).get((Object) null);
        Integer term412209 = new Integer(-1388471422);
        Integer term412211 = new Integer(-1498296052);
        Integer term412213 = new Integer(2098647989);
        Integer term412215 = new Integer(1598895173);
        Integer term412217 = new Integer(1830648570);
        Integer term412219 = new Integer(-227365013);
        Integer term412221 = new Integer(11724947);
        Integer term412223 = new Integer(1953277050);
        term411572 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term411575 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term411698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term411703 = newInstance(Class.forName("java.time.LocalTime"));
        Object term412189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term412194 = newInstance(Class.forName("java.time.LocalTime"));
        Object term412199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term412204 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term411572, term411572.getClass(), "id", -9204303423581447271L);
        setIntField(term411572, term411572.getClass(), "acceptId", 1636228804);
        setLongField(term411575, term411575.getClass(), "id", 6248239231585852341L);
        setIntField(term411575, term411575.getClass(), "pdId", -1650533427);
        setField(term411575, term411575.getClass(), "playerName", "xxx");
        setIntField(term411575, term411575.getClass(), "vocaloidPoints", 300);
        setIntField(term411575, term411575.getClass(), "level", 1);
        setIntField(term411575, term411575.getClass(), "levelExp", -1076430316);
        setField(term411575, term411575.getClass(), "levelTitle", "xxx");
        setIntField(term411575, term411575.getClass(), "plateId", -1);
        setIntField(term411575, term411575.getClass(), "plateEffectId", -1);
        setField(term411575, term411575.getClass(), "passwordStatus", enum927);
        setField(term411575, term411575.getClass(), "password", "**********");
        setBooleanField(term411575, term411575.getClass(), "preferPerPvModule", true);
        setBooleanField(term411575, term411575.getClass(), "preferCommonModule", false);
        setBooleanField(term411575, term411575.getClass(), "usePerPvSkin", false);
        setBooleanField(term411575, term411575.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term411575, term411575.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term411575, term411575.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term411575, term411575.getClass(), "usePerPvTouchSliderSe", false);
        setField(term411575, term411575.getClass(), "commonModule", "-999,-999,-999");
        setField(term411575, term411575.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term411699, term411699.getClass(), "year", 2026);
        setShortField(term411699, term411699.getClass(), "month", (short) 8);
        setShortField(term411699, term411699.getClass(), "day", (short) 12);
        setField(term411698, term411698.getClass(), "date", term411699);
        setByteField(term411703, term411703.getClass(), "hour", (byte) 2);
        setByteField(term411703, term411703.getClass(), "minute", (byte) 3);
        setByteField(term411703, term411703.getClass(), "second", (byte) 26);
        setIntField(term411703, term411703.getClass(), "nano", 512874000);
        setField(term411698, term411698.getClass(), "time", term411703);
        setField(term411575, term411575.getClass(), "commonModuleSetTime", term411698);
        setField(term411575, term411575.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term411575, term411575.getClass(), "commonSkin", -1);
        setIntField(term411575, term411575.getClass(), "headphoneVolume", 100);
        setBooleanField(term411575, term411575.getClass(), "buttonSeOn", true);
        setIntField(term411575, term411575.getClass(), "buttonSeVolume", 100);
        setIntField(term411575, term411575.getClass(), "sliderSeVolume", 100);
        setIntField(term411575, term411575.getClass(), "buttonSe", -1);
        setIntField(term411575, term411575.getClass(), "chainSlideSe", -1);
        setIntField(term411575, term411575.getClass(), "slideSe", -1);
        setIntField(term411575, term411575.getClass(), "sliderTouchSe", -1);
        setField(term411575, term411575.getClass(), "sortMode", enum928);
        setIntField(term411575, term411575.getClass(), "nextPvId", -1);
        setField(term411575, term411575.getClass(), "nextDifficulty", enum929);
        setField(term411575, term411575.getClass(), "nextEdition", enum930);
        setBooleanField(term411575, term411575.getClass(), "showInterimRanking", true);
        setBooleanField(term411575, term411575.getClass(), "showClearStatus", true);
        setBooleanField(term411575, term411575.getClass(), "showGreatBorder", true);
        setBooleanField(term411575, term411575.getClass(), "showExcellentBorder", true);
        setBooleanField(term411575, term411575.getClass(), "showRivalBorder", true);
        setBooleanField(term411575, term411575.getClass(), "showRgoSetting", true);
        setBooleanField(term411575, term411575.getClass(), "contestNowPlayingEnable", false);
        setIntField(term411575, term411575.getClass(), "contestNowPlayingId", -1);
        setIntField(term411575, term411575.getClass(), "contestNowPlayingValue", -1);
        setField(term411575, term411575.getClass(), "contestNowPlayingResultRank", enum931);
        setField(term411575, term411575.getClass(), "contestNowPlayingSpecifier", "");
        setField(term411575, term411575.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term411575, term411575.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term411575, term411575.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term411575, term411575.getClass(), "rivalPdId", -1);
        setField(term411572, term411572.getClass(), "pdId", term411575);
        setField(term411572, term411572.getClass(), "startMode", enum932);
        setIntField(term412190, term412190.getClass(), "year", 2028);
        setShortField(term412190, term412190.getClass(), "month", (short) 3);
        setShortField(term412190, term412190.getClass(), "day", (short) 25);
        setField(term412189, term412189.getClass(), "date", term412190);
        setByteField(term412194, term412194.getClass(), "hour", (byte) 6);
        setByteField(term412194, term412194.getClass(), "minute", (byte) 9);
        setByteField(term412194, term412194.getClass(), "second", (byte) 35);
        setIntField(term412194, term412194.getClass(), "nano", 744453524);
        setField(term412189, term412189.getClass(), "time", term412194);
        setField(term411572, term411572.getClass(), "startTime", term412189);
        setIntField(term412200, term412200.getClass(), "year", 2017);
        setShortField(term412200, term412200.getClass(), "month", (short) 6);
        setShortField(term412200, term412200.getClass(), "day", (short) 28);
        setField(term412199, term412199.getClass(), "date", term412200);
        setByteField(term412204, term412204.getClass(), "hour", (byte) 8);
        setByteField(term412204, term412204.getClass(), "minute", (byte) 1);
        setByteField(term412204, term412204.getClass(), "second", (byte) 14);
        setIntField(term412204, term412204.getClass(), "nano", 501033715);
        setField(term412199, term412199.getClass(), "time", term412204);
        setField(term411572, term411572.getClass(), "lastUpdateTime", term412199);
        setField(term411572, term411572.getClass(), "stageIndex", term412209);
        setField(term411572, term411572.getClass(), "stageResultIndex", term412211);
        setField(term411572, term411572.getClass(), "lastPvId", term412213);
        setField(term411572, term411572.getClass(), "levelNumber", term412215);
        setField(term411572, term411572.getClass(), "levelExp", term412217);
        setField(term411572, term411572.getClass(), "oldLevelNumber", term412219);
        setField(term411572, term411572.getClass(), "oldLevelExp", term412221);
        setField(term411572, term411572.getClass(), "vp", term412223);
        term412225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term412230 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term412226, term412226.getClass(), "year", 2016);
        setShortField(term412226, term412226.getClass(), "month", (short) 10);
        setShortField(term412226, term412226.getClass(), "day", (short) 10);
        setField(term412225, term412225.getClass(), "date", term412226);
        setByteField(term412230, term412230.getClass(), "hour", (byte) 16);
        setByteField(term412230, term412230.getClass(), "minute", (byte) 7);
        setByteField(term412230, term412230.getClass(), "second", (byte) 16);
        setIntField(term412230, term412230.getClass(), "nano", 995200309);
        setField(term412225, term412225.getClass(), "time", term412230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term412225;
        callMethod(klass, "setStartTime", argTypes, term411572, args);
    }

};


