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

public class PlayerScreenShot_toString_182380455216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525416;

    public PlayerScreenShot_toString_182380455216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term526067 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term526066 = ((Class) term526067).getDeclaredField((String) "MISS");
        ((Field) term526066).setAccessible(true);
        Object enum1157 = ((Field) term526066).get((Object) null);
        Class<? extends Object> term526444 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term526443 = ((Class) term526444).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term526443).setAccessible(true);
        Object enum1158 = ((Field) term526443).get((Object) null);
        Class<? extends Object> term526727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term526726 = ((Class) term526727).getDeclaredField((String) "NORMAL");
        ((Field) term526726).setAccessible(true);
        Object enum1159 = ((Field) term526726).get((Object) null);
        Class<? extends Object> term527002 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term527001 = ((Class) term527002).getDeclaredField((String) "ORIGINAL");
        ((Field) term527001).setAccessible(true);
        Object enum1160 = ((Field) term527001).get((Object) null);
        Class<? extends Object> term527268 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term527267 = ((Class) term527268).getDeclaredField((String) "NONE");
        ((Field) term527267).setAccessible(true);
        Object enum1161 = ((Field) term527267).get((Object) null);
        term525416 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term525418 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term525541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term525542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term525546 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term525416, term525416.getClass(), "id", -8398381579707958144L);
        setLongField(term525418, term525418.getClass(), "id", -2195061939206930224L);
        setIntField(term525418, term525418.getClass(), "pdId", -1639838200);
        setField(term525418, term525418.getClass(), "playerName", "xxx");
        setIntField(term525418, term525418.getClass(), "vocaloidPoints", 300);
        setIntField(term525418, term525418.getClass(), "level", 1);
        setIntField(term525418, term525418.getClass(), "levelExp", -60462175);
        setField(term525418, term525418.getClass(), "levelTitle", "xxx");
        setIntField(term525418, term525418.getClass(), "plateId", -1);
        setIntField(term525418, term525418.getClass(), "plateEffectId", -1);
        setField(term525418, term525418.getClass(), "passwordStatus", enum1157);
        setField(term525418, term525418.getClass(), "password", "**********");
        setBooleanField(term525418, term525418.getClass(), "preferPerPvModule", true);
        setBooleanField(term525418, term525418.getClass(), "preferCommonModule", true);
        setBooleanField(term525418, term525418.getClass(), "usePerPvSkin", true);
        setBooleanField(term525418, term525418.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term525418, term525418.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term525418, term525418.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term525418, term525418.getClass(), "usePerPvTouchSliderSe", false);
        setField(term525418, term525418.getClass(), "commonModule", "-999,-999,-999");
        setField(term525418, term525418.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term525542, term525542.getClass(), "year", 2026);
        setShortField(term525542, term525542.getClass(), "month", (short) 8);
        setShortField(term525542, term525542.getClass(), "day", (short) 12);
        setField(term525541, term525541.getClass(), "date", term525542);
        setByteField(term525546, term525546.getClass(), "hour", (byte) 2);
        setByteField(term525546, term525546.getClass(), "minute", (byte) 3);
        setByteField(term525546, term525546.getClass(), "second", (byte) 49);
        setIntField(term525546, term525546.getClass(), "nano", 250102000);
        setField(term525541, term525541.getClass(), "time", term525546);
        setField(term525418, term525418.getClass(), "commonModuleSetTime", term525541);
        setField(term525418, term525418.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term525418, term525418.getClass(), "commonSkin", -1);
        setIntField(term525418, term525418.getClass(), "headphoneVolume", 100);
        setBooleanField(term525418, term525418.getClass(), "buttonSeOn", true);
        setIntField(term525418, term525418.getClass(), "buttonSeVolume", 100);
        setIntField(term525418, term525418.getClass(), "sliderSeVolume", 100);
        setIntField(term525418, term525418.getClass(), "buttonSe", -1);
        setIntField(term525418, term525418.getClass(), "chainSlideSe", -1);
        setIntField(term525418, term525418.getClass(), "slideSe", -1);
        setIntField(term525418, term525418.getClass(), "sliderTouchSe", -1);
        setField(term525418, term525418.getClass(), "sortMode", enum1158);
        setIntField(term525418, term525418.getClass(), "nextPvId", -1);
        setField(term525418, term525418.getClass(), "nextDifficulty", enum1159);
        setField(term525418, term525418.getClass(), "nextEdition", enum1160);
        setBooleanField(term525418, term525418.getClass(), "showInterimRanking", true);
        setBooleanField(term525418, term525418.getClass(), "showClearStatus", true);
        setBooleanField(term525418, term525418.getClass(), "showGreatBorder", true);
        setBooleanField(term525418, term525418.getClass(), "showExcellentBorder", true);
        setBooleanField(term525418, term525418.getClass(), "showRivalBorder", true);
        setBooleanField(term525418, term525418.getClass(), "showRgoSetting", true);
        setBooleanField(term525418, term525418.getClass(), "contestNowPlayingEnable", true);
        setIntField(term525418, term525418.getClass(), "contestNowPlayingId", -1);
        setIntField(term525418, term525418.getClass(), "contestNowPlayingValue", -1);
        setField(term525418, term525418.getClass(), "contestNowPlayingResultRank", enum1161);
        setField(term525418, term525418.getClass(), "contestNowPlayingSpecifier", "");
        setField(term525418, term525418.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term525418, term525418.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term525418, term525418.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term525418, term525418.getClass(), "rivalPdId", -1);
        setField(term525416, term525416.getClass(), "pdId", term525418);
        setIntField(term525416, term525416.getClass(), "pvId", 1315997028);
        setField(term525416, term525416.getClass(), "fileName", "QSrDQfEsTR");
        setField(term525416, term525416.getClass(), "moduleList", "PsqusYmejD");
        setField(term525416, term525416.getClass(), "customizeList", "NTWMiBEaDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term525416, args);
    }

};


