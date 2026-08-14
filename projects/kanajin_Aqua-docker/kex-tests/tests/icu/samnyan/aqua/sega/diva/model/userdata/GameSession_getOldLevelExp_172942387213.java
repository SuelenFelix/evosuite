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

public class GameSession_getOldLevelExp_172942387213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393573;

    public GameSession_getOldLevelExp_172942387213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term394237 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term394236 = ((Class) term394237).getDeclaredField((String) "MISS");
        ((Field) term394236).setAccessible(true);
        Object enum890 = ((Field) term394236).get((Object) null);
        Class<? extends Object> term394614 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term394613 = ((Class) term394614).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term394613).setAccessible(true);
        Object enum891 = ((Field) term394613).get((Object) null);
        Class<? extends Object> term394897 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term394896 = ((Class) term394897).getDeclaredField((String) "NORMAL");
        ((Field) term394896).setAccessible(true);
        Object enum892 = ((Field) term394896).get((Object) null);
        Class<? extends Object> term395172 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term395171 = ((Class) term395172).getDeclaredField((String) "ORIGINAL");
        ((Field) term395171).setAccessible(true);
        Object enum893 = ((Field) term395171).get((Object) null);
        Class<? extends Object> term395438 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term395437 = ((Class) term395438).getDeclaredField((String) "NONE");
        ((Field) term395437).setAccessible(true);
        Object enum894 = ((Field) term395437).get((Object) null);
        Class<? extends Object> term396079 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term396078 = ((Class) term396079).getDeclaredField((String) "PRE_START");
        ((Field) term396078).setAccessible(true);
        Object enum895 = ((Field) term396078).get((Object) null);
        Integer term394214 = new Integer(-268815336);
        Integer term394216 = new Integer(-1210583429);
        Integer term394218 = new Integer(-663691365);
        Integer term394220 = new Integer(339854490);
        Integer term394222 = new Integer(-615654495);
        Integer term394224 = new Integer(-1476117762);
        Integer term394226 = new Integer(-341962980);
        Integer term394228 = new Integer(1532716628);
        term393573 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term393576 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term393699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term393700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term393704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term394194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term394204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394209 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term393573, term393573.getClass(), "id", 868503089567085985L);
        setIntField(term393573, term393573.getClass(), "acceptId", -420769218);
        setLongField(term393576, term393576.getClass(), "id", -3277773415369003529L);
        setIntField(term393576, term393576.getClass(), "pdId", -1047476590);
        setField(term393576, term393576.getClass(), "playerName", "xxx");
        setIntField(term393576, term393576.getClass(), "vocaloidPoints", 300);
        setIntField(term393576, term393576.getClass(), "level", 1);
        setIntField(term393576, term393576.getClass(), "levelExp", -804745833);
        setField(term393576, term393576.getClass(), "levelTitle", "xxx");
        setIntField(term393576, term393576.getClass(), "plateId", -1);
        setIntField(term393576, term393576.getClass(), "plateEffectId", -1);
        setField(term393576, term393576.getClass(), "passwordStatus", enum890);
        setField(term393576, term393576.getClass(), "password", "**********");
        setBooleanField(term393576, term393576.getClass(), "preferPerPvModule", true);
        setBooleanField(term393576, term393576.getClass(), "preferCommonModule", false);
        setBooleanField(term393576, term393576.getClass(), "usePerPvSkin", true);
        setBooleanField(term393576, term393576.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term393576, term393576.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term393576, term393576.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term393576, term393576.getClass(), "usePerPvTouchSliderSe", true);
        setField(term393576, term393576.getClass(), "commonModule", "-999,-999,-999");
        setField(term393576, term393576.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term393700, term393700.getClass(), "year", 2026);
        setShortField(term393700, term393700.getClass(), "month", (short) 8);
        setShortField(term393700, term393700.getClass(), "day", (short) 12);
        setField(term393699, term393699.getClass(), "date", term393700);
        setByteField(term393704, term393704.getClass(), "hour", (byte) 2);
        setByteField(term393704, term393704.getClass(), "minute", (byte) 3);
        setByteField(term393704, term393704.getClass(), "second", (byte) 25);
        setIntField(term393704, term393704.getClass(), "nano", 37351000);
        setField(term393699, term393699.getClass(), "time", term393704);
        setField(term393576, term393576.getClass(), "commonModuleSetTime", term393699);
        setField(term393576, term393576.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term393576, term393576.getClass(), "commonSkin", -1);
        setIntField(term393576, term393576.getClass(), "headphoneVolume", 100);
        setBooleanField(term393576, term393576.getClass(), "buttonSeOn", true);
        setIntField(term393576, term393576.getClass(), "buttonSeVolume", 100);
        setIntField(term393576, term393576.getClass(), "sliderSeVolume", 100);
        setIntField(term393576, term393576.getClass(), "buttonSe", -1);
        setIntField(term393576, term393576.getClass(), "chainSlideSe", -1);
        setIntField(term393576, term393576.getClass(), "slideSe", -1);
        setIntField(term393576, term393576.getClass(), "sliderTouchSe", -1);
        setField(term393576, term393576.getClass(), "sortMode", enum891);
        setIntField(term393576, term393576.getClass(), "nextPvId", -1);
        setField(term393576, term393576.getClass(), "nextDifficulty", enum892);
        setField(term393576, term393576.getClass(), "nextEdition", enum893);
        setBooleanField(term393576, term393576.getClass(), "showInterimRanking", true);
        setBooleanField(term393576, term393576.getClass(), "showClearStatus", true);
        setBooleanField(term393576, term393576.getClass(), "showGreatBorder", true);
        setBooleanField(term393576, term393576.getClass(), "showExcellentBorder", true);
        setBooleanField(term393576, term393576.getClass(), "showRivalBorder", true);
        setBooleanField(term393576, term393576.getClass(), "showRgoSetting", true);
        setBooleanField(term393576, term393576.getClass(), "contestNowPlayingEnable", true);
        setIntField(term393576, term393576.getClass(), "contestNowPlayingId", -1);
        setIntField(term393576, term393576.getClass(), "contestNowPlayingValue", -1);
        setField(term393576, term393576.getClass(), "contestNowPlayingResultRank", enum894);
        setField(term393576, term393576.getClass(), "contestNowPlayingSpecifier", "");
        setField(term393576, term393576.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term393576, term393576.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term393576, term393576.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term393576, term393576.getClass(), "rivalPdId", -1);
        setField(term393573, term393573.getClass(), "pdId", term393576);
        setField(term393573, term393573.getClass(), "startMode", enum895);
        setIntField(term394195, term394195.getClass(), "year", 2021);
        setShortField(term394195, term394195.getClass(), "month", (short) 4);
        setShortField(term394195, term394195.getClass(), "day", (short) 22);
        setField(term394194, term394194.getClass(), "date", term394195);
        setByteField(term394199, term394199.getClass(), "hour", (byte) 17);
        setByteField(term394199, term394199.getClass(), "minute", (byte) 6);
        setByteField(term394199, term394199.getClass(), "second", (byte) 33);
        setIntField(term394199, term394199.getClass(), "nano", 21410850);
        setField(term394194, term394194.getClass(), "time", term394199);
        setField(term393573, term393573.getClass(), "startTime", term394194);
        setIntField(term394205, term394205.getClass(), "year", 2026);
        setShortField(term394205, term394205.getClass(), "month", (short) 10);
        setShortField(term394205, term394205.getClass(), "day", (short) 19);
        setField(term394204, term394204.getClass(), "date", term394205);
        setByteField(term394209, term394209.getClass(), "hour", (byte) 7);
        setByteField(term394209, term394209.getClass(), "minute", (byte) 22);
        setByteField(term394209, term394209.getClass(), "second", (byte) 11);
        setIntField(term394209, term394209.getClass(), "nano", 17846677);
        setField(term394204, term394204.getClass(), "time", term394209);
        setField(term393573, term393573.getClass(), "lastUpdateTime", term394204);
        setField(term393573, term393573.getClass(), "stageIndex", term394214);
        setField(term393573, term393573.getClass(), "stageResultIndex", term394216);
        setField(term393573, term393573.getClass(), "lastPvId", term394218);
        setField(term393573, term393573.getClass(), "levelNumber", term394220);
        setField(term393573, term393573.getClass(), "levelExp", term394222);
        setField(term393573, term393573.getClass(), "oldLevelNumber", term394224);
        setField(term393573, term393573.getClass(), "oldLevelExp", term394226);
        setField(term393573, term393573.getClass(), "vp", term394228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldLevelExp", argTypes, term393573, args);
    }

};


