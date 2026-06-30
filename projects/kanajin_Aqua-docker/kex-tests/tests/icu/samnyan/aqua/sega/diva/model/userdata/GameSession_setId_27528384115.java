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
import java.lang.Long;

public class GameSession_setId_27528384115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399161;
     Object term399814;

    public GameSession_setId_27528384115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399823 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term399822 = ((Class) term399823).getDeclaredField((String) "MISS");
        ((Field) term399822).setAccessible(true);
        Object enum902 = ((Field) term399822).get((Object) null);
        Class<? extends Object> term400200 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term400199 = ((Class) term400200).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term400199).setAccessible(true);
        Object enum903 = ((Field) term400199).get((Object) null);
        Class<? extends Object> term400483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term400482 = ((Class) term400483).getDeclaredField((String) "NORMAL");
        ((Field) term400482).setAccessible(true);
        Object enum904 = ((Field) term400482).get((Object) null);
        Class<? extends Object> term400758 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term400757 = ((Class) term400758).getDeclaredField((String) "ORIGINAL");
        ((Field) term400757).setAccessible(true);
        Object enum905 = ((Field) term400757).get((Object) null);
        Class<? extends Object> term401024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term401023 = ((Class) term401024).getDeclaredField((String) "NONE");
        ((Field) term401023).setAccessible(true);
        Object enum906 = ((Field) term401023).get((Object) null);
        Class<? extends Object> term401665 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term401664 = ((Class) term401665).getDeclaredField((String) "START");
        ((Field) term401664).setAccessible(true);
        Object enum907 = ((Field) term401664).get((Object) null);
        Integer term399798 = new Integer(1386130016);
        Integer term399800 = new Integer(1072005683);
        Integer term399802 = new Integer(1861318859);
        Integer term399804 = new Integer(1474524152);
        Integer term399806 = new Integer(568954359);
        Integer term399808 = new Integer(53410913);
        Integer term399810 = new Integer(-375014958);
        Integer term399812 = new Integer(1107176718);
        term399161 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term399164 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term399287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term399778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399783 = newInstance(Class.forName("java.time.LocalTime"));
        Object term399788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399793 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term399161, term399161.getClass(), "id", 3108750145697087661L);
        setIntField(term399161, term399161.getClass(), "acceptId", -968105925);
        setLongField(term399164, term399164.getClass(), "id", 3752337209837437327L);
        setIntField(term399164, term399164.getClass(), "pdId", -206020926);
        setField(term399164, term399164.getClass(), "playerName", "xxx");
        setIntField(term399164, term399164.getClass(), "vocaloidPoints", 300);
        setIntField(term399164, term399164.getClass(), "level", 1);
        setIntField(term399164, term399164.getClass(), "levelExp", -2054014210);
        setField(term399164, term399164.getClass(), "levelTitle", "xxx");
        setIntField(term399164, term399164.getClass(), "plateId", -1);
        setIntField(term399164, term399164.getClass(), "plateEffectId", -1);
        setField(term399164, term399164.getClass(), "passwordStatus", enum902);
        setField(term399164, term399164.getClass(), "password", "**********");
        setBooleanField(term399164, term399164.getClass(), "preferPerPvModule", true);
        setBooleanField(term399164, term399164.getClass(), "preferCommonModule", false);
        setBooleanField(term399164, term399164.getClass(), "usePerPvSkin", false);
        setBooleanField(term399164, term399164.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term399164, term399164.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term399164, term399164.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term399164, term399164.getClass(), "usePerPvTouchSliderSe", true);
        setField(term399164, term399164.getClass(), "commonModule", "-999,-999,-999");
        setField(term399164, term399164.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term399288, term399288.getClass(), "year", 2026);
        setShortField(term399288, term399288.getClass(), "month", (short) 6);
        setShortField(term399288, term399288.getClass(), "day", (short) 29);
        setField(term399287, term399287.getClass(), "date", term399288);
        setByteField(term399292, term399292.getClass(), "hour", (byte) 4);
        setByteField(term399292, term399292.getClass(), "minute", (byte) 28);
        setByteField(term399292, term399292.getClass(), "second", (byte) 10);
        setIntField(term399292, term399292.getClass(), "nano", 589304000);
        setField(term399287, term399287.getClass(), "time", term399292);
        setField(term399164, term399164.getClass(), "commonModuleSetTime", term399287);
        setField(term399164, term399164.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term399164, term399164.getClass(), "commonSkin", -1);
        setIntField(term399164, term399164.getClass(), "headphoneVolume", 100);
        setBooleanField(term399164, term399164.getClass(), "buttonSeOn", true);
        setIntField(term399164, term399164.getClass(), "buttonSeVolume", 100);
        setIntField(term399164, term399164.getClass(), "sliderSeVolume", 100);
        setIntField(term399164, term399164.getClass(), "buttonSe", -1);
        setIntField(term399164, term399164.getClass(), "chainSlideSe", -1);
        setIntField(term399164, term399164.getClass(), "slideSe", -1);
        setIntField(term399164, term399164.getClass(), "sliderTouchSe", -1);
        setField(term399164, term399164.getClass(), "sortMode", enum903);
        setIntField(term399164, term399164.getClass(), "nextPvId", -1);
        setField(term399164, term399164.getClass(), "nextDifficulty", enum904);
        setField(term399164, term399164.getClass(), "nextEdition", enum905);
        setBooleanField(term399164, term399164.getClass(), "showInterimRanking", true);
        setBooleanField(term399164, term399164.getClass(), "showClearStatus", true);
        setBooleanField(term399164, term399164.getClass(), "showGreatBorder", true);
        setBooleanField(term399164, term399164.getClass(), "showExcellentBorder", true);
        setBooleanField(term399164, term399164.getClass(), "showRivalBorder", true);
        setBooleanField(term399164, term399164.getClass(), "showRgoSetting", true);
        setBooleanField(term399164, term399164.getClass(), "contestNowPlayingEnable", true);
        setIntField(term399164, term399164.getClass(), "contestNowPlayingId", -1);
        setIntField(term399164, term399164.getClass(), "contestNowPlayingValue", -1);
        setField(term399164, term399164.getClass(), "contestNowPlayingResultRank", enum906);
        setField(term399164, term399164.getClass(), "contestNowPlayingSpecifier", "");
        setField(term399164, term399164.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term399164, term399164.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term399164, term399164.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term399164, term399164.getClass(), "rivalPdId", -1);
        setField(term399161, term399161.getClass(), "pdId", term399164);
        setField(term399161, term399161.getClass(), "startMode", enum907);
        setIntField(term399779, term399779.getClass(), "year", 2020);
        setShortField(term399779, term399779.getClass(), "month", (short) 5);
        setShortField(term399779, term399779.getClass(), "day", (short) 24);
        setField(term399778, term399778.getClass(), "date", term399779);
        setByteField(term399783, term399783.getClass(), "hour", (byte) 2);
        setByteField(term399783, term399783.getClass(), "minute", (byte) 9);
        setByteField(term399783, term399783.getClass(), "second", (byte) 52);
        setIntField(term399783, term399783.getClass(), "nano", 653329393);
        setField(term399778, term399778.getClass(), "time", term399783);
        setField(term399161, term399161.getClass(), "startTime", term399778);
        setIntField(term399789, term399789.getClass(), "year", 2024);
        setShortField(term399789, term399789.getClass(), "month", (short) 9);
        setShortField(term399789, term399789.getClass(), "day", (short) 22);
        setField(term399788, term399788.getClass(), "date", term399789);
        setByteField(term399793, term399793.getClass(), "hour", (byte) 0);
        setByteField(term399793, term399793.getClass(), "minute", (byte) 11);
        setByteField(term399793, term399793.getClass(), "second", (byte) 7);
        setIntField(term399793, term399793.getClass(), "nano", 56643259);
        setField(term399788, term399788.getClass(), "time", term399793);
        setField(term399161, term399161.getClass(), "lastUpdateTime", term399788);
        setField(term399161, term399161.getClass(), "stageIndex", term399798);
        setField(term399161, term399161.getClass(), "stageResultIndex", term399800);
        setField(term399161, term399161.getClass(), "lastPvId", term399802);
        setField(term399161, term399161.getClass(), "levelNumber", term399804);
        setField(term399161, term399161.getClass(), "levelExp", term399806);
        setField(term399161, term399161.getClass(), "oldLevelNumber", term399808);
        setField(term399161, term399161.getClass(), "oldLevelExp", term399810);
        setField(term399161, term399161.getClass(), "vp", term399812);
        term399814 = new Long(1860789353508856614L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term399814;
        callMethod(klass, "setId", argTypes, term399161, args);
    }

};


