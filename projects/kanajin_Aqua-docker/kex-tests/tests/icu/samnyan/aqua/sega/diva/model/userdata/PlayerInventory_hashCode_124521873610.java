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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_hashCode_124521873610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556594;

    public PlayerInventory_hashCode_124521873610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term556595 = new Long(-8885298608300233488L);
        Class<? extends Object> term557233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term557232 = ((Class) term557233).getDeclaredField((String) "MISS");
        ((Field) term557232).setAccessible(true);
        Object enum1217 = ((Field) term557232).get((Object) null);
        Class<? extends Object> term557610 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term557609 = ((Class) term557610).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term557609).setAccessible(true);
        Object enum1218 = ((Field) term557609).get((Object) null);
        Class<? extends Object> term557893 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term557892 = ((Class) term557893).getDeclaredField((String) "NORMAL");
        ((Field) term557892).setAccessible(true);
        Object enum1219 = ((Field) term557892).get((Object) null);
        Class<? extends Object> term558168 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term558167 = ((Class) term558168).getDeclaredField((String) "ORIGINAL");
        ((Field) term558167).setAccessible(true);
        Object enum1220 = ((Field) term558167).get((Object) null);
        Class<? extends Object> term558434 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term558433 = ((Class) term558434).getDeclaredField((String) "NONE");
        ((Field) term558433).setAccessible(true);
        Object enum1221 = ((Field) term558433).get((Object) null);
        term556594 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term556597 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term556720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term556721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term556725 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term556594, term556594.getClass(), "id", term556595);
        setLongField(term556597, term556597.getClass(), "id", 8765880103547975810L);
        setIntField(term556597, term556597.getClass(), "pdId", 1199950979);
        setField(term556597, term556597.getClass(), "playerName", "xxx");
        setIntField(term556597, term556597.getClass(), "vocaloidPoints", 300);
        setIntField(term556597, term556597.getClass(), "level", 1);
        setIntField(term556597, term556597.getClass(), "levelExp", 733812186);
        setField(term556597, term556597.getClass(), "levelTitle", "xxx");
        setIntField(term556597, term556597.getClass(), "plateId", -1);
        setIntField(term556597, term556597.getClass(), "plateEffectId", -1);
        setField(term556597, term556597.getClass(), "passwordStatus", enum1217);
        setField(term556597, term556597.getClass(), "password", "**********");
        setBooleanField(term556597, term556597.getClass(), "preferPerPvModule", true);
        setBooleanField(term556597, term556597.getClass(), "preferCommonModule", false);
        setBooleanField(term556597, term556597.getClass(), "usePerPvSkin", true);
        setBooleanField(term556597, term556597.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term556597, term556597.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term556597, term556597.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term556597, term556597.getClass(), "usePerPvTouchSliderSe", false);
        setField(term556597, term556597.getClass(), "commonModule", "-999,-999,-999");
        setField(term556597, term556597.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term556721, term556721.getClass(), "year", 2026);
        setShortField(term556721, term556721.getClass(), "month", (short) 6);
        setShortField(term556721, term556721.getClass(), "day", (short) 29);
        setField(term556720, term556720.getClass(), "date", term556721);
        setByteField(term556725, term556725.getClass(), "hour", (byte) 4);
        setByteField(term556725, term556725.getClass(), "minute", (byte) 28);
        setByteField(term556725, term556725.getClass(), "second", (byte) 42);
        setIntField(term556725, term556725.getClass(), "nano", 949993000);
        setField(term556720, term556720.getClass(), "time", term556725);
        setField(term556597, term556597.getClass(), "commonModuleSetTime", term556720);
        setField(term556597, term556597.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term556597, term556597.getClass(), "commonSkin", -1);
        setIntField(term556597, term556597.getClass(), "headphoneVolume", 100);
        setBooleanField(term556597, term556597.getClass(), "buttonSeOn", true);
        setIntField(term556597, term556597.getClass(), "buttonSeVolume", 100);
        setIntField(term556597, term556597.getClass(), "sliderSeVolume", 100);
        setIntField(term556597, term556597.getClass(), "buttonSe", -1);
        setIntField(term556597, term556597.getClass(), "chainSlideSe", -1);
        setIntField(term556597, term556597.getClass(), "slideSe", -1);
        setIntField(term556597, term556597.getClass(), "sliderTouchSe", -1);
        setField(term556597, term556597.getClass(), "sortMode", enum1218);
        setIntField(term556597, term556597.getClass(), "nextPvId", -1);
        setField(term556597, term556597.getClass(), "nextDifficulty", enum1219);
        setField(term556597, term556597.getClass(), "nextEdition", enum1220);
        setBooleanField(term556597, term556597.getClass(), "showInterimRanking", true);
        setBooleanField(term556597, term556597.getClass(), "showClearStatus", true);
        setBooleanField(term556597, term556597.getClass(), "showGreatBorder", true);
        setBooleanField(term556597, term556597.getClass(), "showExcellentBorder", true);
        setBooleanField(term556597, term556597.getClass(), "showRivalBorder", true);
        setBooleanField(term556597, term556597.getClass(), "showRgoSetting", true);
        setBooleanField(term556597, term556597.getClass(), "contestNowPlayingEnable", false);
        setIntField(term556597, term556597.getClass(), "contestNowPlayingId", -1);
        setIntField(term556597, term556597.getClass(), "contestNowPlayingValue", -1);
        setField(term556597, term556597.getClass(), "contestNowPlayingResultRank", enum1221);
        setField(term556597, term556597.getClass(), "contestNowPlayingSpecifier", "");
        setField(term556597, term556597.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term556597, term556597.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term556597, term556597.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term556597, term556597.getClass(), "rivalPdId", -1);
        setField(term556594, term556594.getClass(), "pdId", term556597);
        setField(term556594, term556594.getClass(), "value", "iuCxnHGMoW");
        setField(term556594, term556594.getClass(), "type", "GPSEWEDSTo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term556594, args);
    }

};


