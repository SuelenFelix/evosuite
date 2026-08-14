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

public class PlayerScreenShot_setPdId_3609539118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504143;
     Object term504787;

    public PlayerScreenShot_setPdId_3609539118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term505340 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term505339 = ((Class) term505340).getDeclaredField((String) "MISS");
        ((Field) term505339).setAccessible(true);
        Object enum1117 = ((Field) term505339).get((Object) null);
        Class<? extends Object> term505717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term505716 = ((Class) term505717).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term505716).setAccessible(true);
        Object enum1118 = ((Field) term505716).get((Object) null);
        Class<? extends Object> term506000 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term505999 = ((Class) term506000).getDeclaredField((String) "NORMAL");
        ((Field) term505999).setAccessible(true);
        Object enum1119 = ((Field) term505999).get((Object) null);
        Class<? extends Object> term506275 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term506274 = ((Class) term506275).getDeclaredField((String) "ORIGINAL");
        ((Field) term506274).setAccessible(true);
        Object enum1120 = ((Field) term506274).get((Object) null);
        Class<? extends Object> term506541 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term506540 = ((Class) term506541).getDeclaredField((String) "NONE");
        ((Field) term506540).setAccessible(true);
        Object enum1121 = ((Field) term506540).get((Object) null);
        term504143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term504145 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term504268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term504269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term504273 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term504143, term504143.getClass(), "id", 4139034517298316285L);
        setLongField(term504145, term504145.getClass(), "id", 5797412846146719084L);
        setIntField(term504145, term504145.getClass(), "pdId", -33243170);
        setField(term504145, term504145.getClass(), "playerName", "xxx");
        setIntField(term504145, term504145.getClass(), "vocaloidPoints", 300);
        setIntField(term504145, term504145.getClass(), "level", 1);
        setIntField(term504145, term504145.getClass(), "levelExp", -906823990);
        setField(term504145, term504145.getClass(), "levelTitle", "xxx");
        setIntField(term504145, term504145.getClass(), "plateId", -1);
        setIntField(term504145, term504145.getClass(), "plateEffectId", -1);
        setField(term504145, term504145.getClass(), "passwordStatus", enum1117);
        setField(term504145, term504145.getClass(), "password", "**********");
        setBooleanField(term504145, term504145.getClass(), "preferPerPvModule", true);
        setBooleanField(term504145, term504145.getClass(), "preferCommonModule", true);
        setBooleanField(term504145, term504145.getClass(), "usePerPvSkin", false);
        setBooleanField(term504145, term504145.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term504145, term504145.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term504145, term504145.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term504145, term504145.getClass(), "usePerPvTouchSliderSe", true);
        setField(term504145, term504145.getClass(), "commonModule", "-999,-999,-999");
        setField(term504145, term504145.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term504269, term504269.getClass(), "year", 2026);
        setShortField(term504269, term504269.getClass(), "month", (short) 8);
        setShortField(term504269, term504269.getClass(), "day", (short) 12);
        setField(term504268, term504268.getClass(), "date", term504269);
        setByteField(term504273, term504273.getClass(), "hour", (byte) 2);
        setByteField(term504273, term504273.getClass(), "minute", (byte) 3);
        setByteField(term504273, term504273.getClass(), "second", (byte) 47);
        setIntField(term504273, term504273.getClass(), "nano", 263374000);
        setField(term504268, term504268.getClass(), "time", term504273);
        setField(term504145, term504145.getClass(), "commonModuleSetTime", term504268);
        setField(term504145, term504145.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term504145, term504145.getClass(), "commonSkin", -1);
        setIntField(term504145, term504145.getClass(), "headphoneVolume", 100);
        setBooleanField(term504145, term504145.getClass(), "buttonSeOn", true);
        setIntField(term504145, term504145.getClass(), "buttonSeVolume", 100);
        setIntField(term504145, term504145.getClass(), "sliderSeVolume", 100);
        setIntField(term504145, term504145.getClass(), "buttonSe", -1);
        setIntField(term504145, term504145.getClass(), "chainSlideSe", -1);
        setIntField(term504145, term504145.getClass(), "slideSe", -1);
        setIntField(term504145, term504145.getClass(), "sliderTouchSe", -1);
        setField(term504145, term504145.getClass(), "sortMode", enum1118);
        setIntField(term504145, term504145.getClass(), "nextPvId", -1);
        setField(term504145, term504145.getClass(), "nextDifficulty", enum1119);
        setField(term504145, term504145.getClass(), "nextEdition", enum1120);
        setBooleanField(term504145, term504145.getClass(), "showInterimRanking", true);
        setBooleanField(term504145, term504145.getClass(), "showClearStatus", true);
        setBooleanField(term504145, term504145.getClass(), "showGreatBorder", true);
        setBooleanField(term504145, term504145.getClass(), "showExcellentBorder", true);
        setBooleanField(term504145, term504145.getClass(), "showRivalBorder", true);
        setBooleanField(term504145, term504145.getClass(), "showRgoSetting", true);
        setBooleanField(term504145, term504145.getClass(), "contestNowPlayingEnable", false);
        setIntField(term504145, term504145.getClass(), "contestNowPlayingId", -1);
        setIntField(term504145, term504145.getClass(), "contestNowPlayingValue", -1);
        setField(term504145, term504145.getClass(), "contestNowPlayingResultRank", enum1121);
        setField(term504145, term504145.getClass(), "contestNowPlayingSpecifier", "");
        setField(term504145, term504145.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term504145, term504145.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term504145, term504145.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term504145, term504145.getClass(), "rivalPdId", -1);
        setField(term504143, term504143.getClass(), "pdId", term504145);
        setIntField(term504143, term504143.getClass(), "pvId", -1670324779);
        setField(term504143, term504143.getClass(), "fileName", "TweMFhxNdj");
        setField(term504143, term504143.getClass(), "moduleList", "NBrvVzvQHe");
        setField(term504143, term504143.getClass(), "customizeList", "FjOiNAfBOc");
        term504787 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term504901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term504902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term504906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term504787, term504787.getClass(), "id", 5319740127125920367L);
        setIntField(term504787, term504787.getClass(), "pdId", -1696838199);
        setField(term504787, term504787.getClass(), "playerName", "xxx");
        setIntField(term504787, term504787.getClass(), "vocaloidPoints", 300);
        setIntField(term504787, term504787.getClass(), "level", 1);
        setIntField(term504787, term504787.getClass(), "levelExp", -1286086755);
        setField(term504787, term504787.getClass(), "levelTitle", "xxx");
        setIntField(term504787, term504787.getClass(), "plateId", -1);
        setIntField(term504787, term504787.getClass(), "plateEffectId", -1);
        setField(term504787, term504787.getClass(), "passwordStatus", enum1117);
        setField(term504787, term504787.getClass(), "password", "**********");
        setBooleanField(term504787, term504787.getClass(), "preferPerPvModule", true);
        setBooleanField(term504787, term504787.getClass(), "preferCommonModule", true);
        setBooleanField(term504787, term504787.getClass(), "usePerPvSkin", true);
        setBooleanField(term504787, term504787.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term504787, term504787.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term504787, term504787.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term504787, term504787.getClass(), "usePerPvTouchSliderSe", true);
        setField(term504787, term504787.getClass(), "commonModule", "-999,-999,-999");
        setField(term504787, term504787.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term504902, term504902.getClass(), "year", 2026);
        setShortField(term504902, term504902.getClass(), "month", (short) 8);
        setShortField(term504902, term504902.getClass(), "day", (short) 12);
        setField(term504901, term504901.getClass(), "date", term504902);
        setByteField(term504906, term504906.getClass(), "hour", (byte) 2);
        setByteField(term504906, term504906.getClass(), "minute", (byte) 3);
        setByteField(term504906, term504906.getClass(), "second", (byte) 47);
        setIntField(term504906, term504906.getClass(), "nano", 263863000);
        setField(term504901, term504901.getClass(), "time", term504906);
        setField(term504787, term504787.getClass(), "commonModuleSetTime", term504901);
        setField(term504787, term504787.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term504787, term504787.getClass(), "commonSkin", -1);
        setIntField(term504787, term504787.getClass(), "headphoneVolume", 100);
        setBooleanField(term504787, term504787.getClass(), "buttonSeOn", true);
        setIntField(term504787, term504787.getClass(), "buttonSeVolume", 100);
        setIntField(term504787, term504787.getClass(), "sliderSeVolume", 100);
        setIntField(term504787, term504787.getClass(), "buttonSe", -1);
        setIntField(term504787, term504787.getClass(), "chainSlideSe", -1);
        setIntField(term504787, term504787.getClass(), "slideSe", -1);
        setIntField(term504787, term504787.getClass(), "sliderTouchSe", -1);
        setField(term504787, term504787.getClass(), "sortMode", enum1118);
        setIntField(term504787, term504787.getClass(), "nextPvId", -1);
        setField(term504787, term504787.getClass(), "nextDifficulty", enum1119);
        setField(term504787, term504787.getClass(), "nextEdition", enum1120);
        setBooleanField(term504787, term504787.getClass(), "showInterimRanking", true);
        setBooleanField(term504787, term504787.getClass(), "showClearStatus", true);
        setBooleanField(term504787, term504787.getClass(), "showGreatBorder", true);
        setBooleanField(term504787, term504787.getClass(), "showExcellentBorder", true);
        setBooleanField(term504787, term504787.getClass(), "showRivalBorder", true);
        setBooleanField(term504787, term504787.getClass(), "showRgoSetting", true);
        setBooleanField(term504787, term504787.getClass(), "contestNowPlayingEnable", true);
        setIntField(term504787, term504787.getClass(), "contestNowPlayingId", -1);
        setIntField(term504787, term504787.getClass(), "contestNowPlayingValue", -1);
        setField(term504787, term504787.getClass(), "contestNowPlayingResultRank", enum1121);
        setField(term504787, term504787.getClass(), "contestNowPlayingSpecifier", "");
        setField(term504787, term504787.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term504787, term504787.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term504787, term504787.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term504787, term504787.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term504787;
        callMethod(klass, "setPdId", argTypes, term504143, args);
    }

};


