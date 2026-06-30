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

public class PlayerContest_getFlag_20506403537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17510;

    public PlayerContest_getFlag_20506403537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term18137 = ((Class) term18138).getDeclaredField((String) "MISS");
        ((Field) term18137).setAccessible(true);
        Object enum35 = ((Field) term18137).get((Object) null);
        Class<? extends Object> term18515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term18514 = ((Class) term18515).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term18514).setAccessible(true);
        Object enum36 = ((Field) term18514).get((Object) null);
        Class<? extends Object> term18798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term18797 = ((Class) term18798).getDeclaredField((String) "NORMAL");
        ((Field) term18797).setAccessible(true);
        Object enum37 = ((Field) term18797).get((Object) null);
        Class<? extends Object> term19073 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term19072 = ((Class) term19073).getDeclaredField((String) "ORIGINAL");
        ((Field) term19072).setAccessible(true);
        Object enum38 = ((Field) term19072).get((Object) null);
        Class<? extends Object> term19339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term19338 = ((Class) term19339).getDeclaredField((String) "NONE");
        ((Field) term19338).setAccessible(true);
        Object enum39 = ((Field) term19338).get((Object) null);
        term17510 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term17512 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term17635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18126 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17510, term17510.getClass(), "id", 2535595959091595249L);
        setLongField(term17512, term17512.getClass(), "id", -5476826692763582090L);
        setIntField(term17512, term17512.getClass(), "pdId", 865208305);
        setField(term17512, term17512.getClass(), "playerName", "xxx");
        setIntField(term17512, term17512.getClass(), "vocaloidPoints", 300);
        setIntField(term17512, term17512.getClass(), "level", 1);
        setIntField(term17512, term17512.getClass(), "levelExp", -1275173084);
        setField(term17512, term17512.getClass(), "levelTitle", "xxx");
        setIntField(term17512, term17512.getClass(), "plateId", -1);
        setIntField(term17512, term17512.getClass(), "plateEffectId", -1);
        setField(term17512, term17512.getClass(), "passwordStatus", enum35);
        setField(term17512, term17512.getClass(), "password", "**********");
        setBooleanField(term17512, term17512.getClass(), "preferPerPvModule", true);
        setBooleanField(term17512, term17512.getClass(), "preferCommonModule", true);
        setBooleanField(term17512, term17512.getClass(), "usePerPvSkin", false);
        setBooleanField(term17512, term17512.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term17512, term17512.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term17512, term17512.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term17512, term17512.getClass(), "usePerPvTouchSliderSe", true);
        setField(term17512, term17512.getClass(), "commonModule", "-999,-999,-999");
        setField(term17512, term17512.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term17636, term17636.getClass(), "year", 2026);
        setShortField(term17636, term17636.getClass(), "month", (short) 6);
        setShortField(term17636, term17636.getClass(), "day", (short) 29);
        setField(term17635, term17635.getClass(), "date", term17636);
        setByteField(term17640, term17640.getClass(), "hour", (byte) 4);
        setByteField(term17640, term17640.getClass(), "minute", (byte) 27);
        setByteField(term17640, term17640.getClass(), "second", (byte) 13);
        setIntField(term17640, term17640.getClass(), "nano", 116923000);
        setField(term17635, term17635.getClass(), "time", term17640);
        setField(term17512, term17512.getClass(), "commonModuleSetTime", term17635);
        setField(term17512, term17512.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term17512, term17512.getClass(), "commonSkin", -1);
        setIntField(term17512, term17512.getClass(), "headphoneVolume", 100);
        setBooleanField(term17512, term17512.getClass(), "buttonSeOn", true);
        setIntField(term17512, term17512.getClass(), "buttonSeVolume", 100);
        setIntField(term17512, term17512.getClass(), "sliderSeVolume", 100);
        setIntField(term17512, term17512.getClass(), "buttonSe", -1);
        setIntField(term17512, term17512.getClass(), "chainSlideSe", -1);
        setIntField(term17512, term17512.getClass(), "slideSe", -1);
        setIntField(term17512, term17512.getClass(), "sliderTouchSe", -1);
        setField(term17512, term17512.getClass(), "sortMode", enum36);
        setIntField(term17512, term17512.getClass(), "nextPvId", -1);
        setField(term17512, term17512.getClass(), "nextDifficulty", enum37);
        setField(term17512, term17512.getClass(), "nextEdition", enum38);
        setBooleanField(term17512, term17512.getClass(), "showInterimRanking", true);
        setBooleanField(term17512, term17512.getClass(), "showClearStatus", true);
        setBooleanField(term17512, term17512.getClass(), "showGreatBorder", true);
        setBooleanField(term17512, term17512.getClass(), "showExcellentBorder", true);
        setBooleanField(term17512, term17512.getClass(), "showRivalBorder", true);
        setBooleanField(term17512, term17512.getClass(), "showRgoSetting", true);
        setBooleanField(term17512, term17512.getClass(), "contestNowPlayingEnable", false);
        setIntField(term17512, term17512.getClass(), "contestNowPlayingId", -1);
        setIntField(term17512, term17512.getClass(), "contestNowPlayingValue", -1);
        setField(term17512, term17512.getClass(), "contestNowPlayingResultRank", enum39);
        setField(term17512, term17512.getClass(), "contestNowPlayingSpecifier", "");
        setField(term17512, term17512.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term17512, term17512.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term17512, term17512.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term17512, term17512.getClass(), "rivalPdId", -1);
        setField(term17510, term17510.getClass(), "pdId", term17512);
        setIntField(term17510, term17510.getClass(), "contestId", -244121226);
        setIntField(term17510, term17510.getClass(), "startCount", -203030934);
        setField(term17510, term17510.getClass(), "resultRank", enum39);
        setIntField(term17510, term17510.getClass(), "bestValue", -1);
        setIntField(term17510, term17510.getClass(), "flag", -1);
        setIntField(term18122, term18122.getClass(), "year", 2026);
        setShortField(term18122, term18122.getClass(), "month", (short) 6);
        setShortField(term18122, term18122.getClass(), "day", (short) 29);
        setField(term18121, term18121.getClass(), "date", term18122);
        setByteField(term18126, term18126.getClass(), "hour", (byte) 4);
        setByteField(term18126, term18126.getClass(), "minute", (byte) 27);
        setByteField(term18126, term18126.getClass(), "second", (byte) 13);
        setIntField(term18126, term18126.getClass(), "nano", 116726000);
        setField(term18121, term18121.getClass(), "time", term18126);
        setField(term17510, term17510.getClass(), "lastUpdateTime", term18121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlag", argTypes, term17510, args);
    }

};


