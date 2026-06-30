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

public class PlayerScreenShot_hashCode_131304486215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522894;

    public PlayerScreenShot_hashCode_131304486215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term523545 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term523544 = ((Class) term523545).getDeclaredField((String) "MISS");
        ((Field) term523544).setAccessible(true);
        Object enum1152 = ((Field) term523544).get((Object) null);
        Class<? extends Object> term523922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term523921 = ((Class) term523922).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term523921).setAccessible(true);
        Object enum1153 = ((Field) term523921).get((Object) null);
        Class<? extends Object> term524205 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term524204 = ((Class) term524205).getDeclaredField((String) "NORMAL");
        ((Field) term524204).setAccessible(true);
        Object enum1154 = ((Field) term524204).get((Object) null);
        Class<? extends Object> term524480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term524479 = ((Class) term524480).getDeclaredField((String) "ORIGINAL");
        ((Field) term524479).setAccessible(true);
        Object enum1155 = ((Field) term524479).get((Object) null);
        Class<? extends Object> term524746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term524745 = ((Class) term524746).getDeclaredField((String) "NONE");
        ((Field) term524745).setAccessible(true);
        Object enum1156 = ((Field) term524745).get((Object) null);
        term522894 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term522896 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term523019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term523020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term523024 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term522894, term522894.getClass(), "id", -2136893352275781569L);
        setLongField(term522896, term522896.getClass(), "id", -9147545274054597570L);
        setIntField(term522896, term522896.getClass(), "pdId", 1161195592);
        setField(term522896, term522896.getClass(), "playerName", "xxx");
        setIntField(term522896, term522896.getClass(), "vocaloidPoints", 300);
        setIntField(term522896, term522896.getClass(), "level", 1);
        setIntField(term522896, term522896.getClass(), "levelExp", -1012640616);
        setField(term522896, term522896.getClass(), "levelTitle", "xxx");
        setIntField(term522896, term522896.getClass(), "plateId", -1);
        setIntField(term522896, term522896.getClass(), "plateEffectId", -1);
        setField(term522896, term522896.getClass(), "passwordStatus", enum1152);
        setField(term522896, term522896.getClass(), "password", "**********");
        setBooleanField(term522896, term522896.getClass(), "preferPerPvModule", true);
        setBooleanField(term522896, term522896.getClass(), "preferCommonModule", true);
        setBooleanField(term522896, term522896.getClass(), "usePerPvSkin", true);
        setBooleanField(term522896, term522896.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term522896, term522896.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term522896, term522896.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term522896, term522896.getClass(), "usePerPvTouchSliderSe", true);
        setField(term522896, term522896.getClass(), "commonModule", "-999,-999,-999");
        setField(term522896, term522896.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term523020, term523020.getClass(), "year", 2026);
        setShortField(term523020, term523020.getClass(), "month", (short) 6);
        setShortField(term523020, term523020.getClass(), "day", (short) 29);
        setField(term523019, term523019.getClass(), "date", term523020);
        setByteField(term523024, term523024.getClass(), "hour", (byte) 4);
        setByteField(term523024, term523024.getClass(), "minute", (byte) 28);
        setByteField(term523024, term523024.getClass(), "second", (byte) 34);
        setIntField(term523024, term523024.getClass(), "nano", 664574000);
        setField(term523019, term523019.getClass(), "time", term523024);
        setField(term522896, term522896.getClass(), "commonModuleSetTime", term523019);
        setField(term522896, term522896.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term522896, term522896.getClass(), "commonSkin", -1);
        setIntField(term522896, term522896.getClass(), "headphoneVolume", 100);
        setBooleanField(term522896, term522896.getClass(), "buttonSeOn", true);
        setIntField(term522896, term522896.getClass(), "buttonSeVolume", 100);
        setIntField(term522896, term522896.getClass(), "sliderSeVolume", 100);
        setIntField(term522896, term522896.getClass(), "buttonSe", -1);
        setIntField(term522896, term522896.getClass(), "chainSlideSe", -1);
        setIntField(term522896, term522896.getClass(), "slideSe", -1);
        setIntField(term522896, term522896.getClass(), "sliderTouchSe", -1);
        setField(term522896, term522896.getClass(), "sortMode", enum1153);
        setIntField(term522896, term522896.getClass(), "nextPvId", -1);
        setField(term522896, term522896.getClass(), "nextDifficulty", enum1154);
        setField(term522896, term522896.getClass(), "nextEdition", enum1155);
        setBooleanField(term522896, term522896.getClass(), "showInterimRanking", true);
        setBooleanField(term522896, term522896.getClass(), "showClearStatus", true);
        setBooleanField(term522896, term522896.getClass(), "showGreatBorder", true);
        setBooleanField(term522896, term522896.getClass(), "showExcellentBorder", true);
        setBooleanField(term522896, term522896.getClass(), "showRivalBorder", true);
        setBooleanField(term522896, term522896.getClass(), "showRgoSetting", true);
        setBooleanField(term522896, term522896.getClass(), "contestNowPlayingEnable", true);
        setIntField(term522896, term522896.getClass(), "contestNowPlayingId", -1);
        setIntField(term522896, term522896.getClass(), "contestNowPlayingValue", -1);
        setField(term522896, term522896.getClass(), "contestNowPlayingResultRank", enum1156);
        setField(term522896, term522896.getClass(), "contestNowPlayingSpecifier", "");
        setField(term522896, term522896.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term522896, term522896.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term522896, term522896.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term522896, term522896.getClass(), "rivalPdId", -1);
        setField(term522894, term522894.getClass(), "pdId", term522896);
        setIntField(term522894, term522894.getClass(), "pvId", -552664740);
        setField(term522894, term522894.getClass(), "fileName", "DzHVBMqWtE");
        setField(term522894, term522894.getClass(), "moduleList", "THZSpzBRYP");
        setField(term522894, term522894.getClass(), "customizeList", "ZfBIVGBQOE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term522894, args);
    }

};


