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

public class PlayerScreenShot_getPdId_10458888292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489009;

    public PlayerScreenShot_getPdId_10458888292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term489660 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term489659 = ((Class) term489660).getDeclaredField((String) "MISS");
        ((Field) term489659).setAccessible(true);
        Object enum1087 = ((Field) term489659).get((Object) null);
        Class<? extends Object> term490037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term490036 = ((Class) term490037).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term490036).setAccessible(true);
        Object enum1088 = ((Field) term490036).get((Object) null);
        Class<? extends Object> term490320 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term490319 = ((Class) term490320).getDeclaredField((String) "NORMAL");
        ((Field) term490319).setAccessible(true);
        Object enum1089 = ((Field) term490319).get((Object) null);
        Class<? extends Object> term490595 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term490594 = ((Class) term490595).getDeclaredField((String) "ORIGINAL");
        ((Field) term490594).setAccessible(true);
        Object enum1090 = ((Field) term490594).get((Object) null);
        Class<? extends Object> term490861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term490860 = ((Class) term490861).getDeclaredField((String) "NONE");
        ((Field) term490860).setAccessible(true);
        Object enum1091 = ((Field) term490860).get((Object) null);
        term489009 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term489011 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term489134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term489135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term489139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term489009, term489009.getClass(), "id", -7296330380944173376L);
        setLongField(term489011, term489011.getClass(), "id", -8890284990655172580L);
        setIntField(term489011, term489011.getClass(), "pdId", 1813573586);
        setField(term489011, term489011.getClass(), "playerName", "xxx");
        setIntField(term489011, term489011.getClass(), "vocaloidPoints", 300);
        setIntField(term489011, term489011.getClass(), "level", 1);
        setIntField(term489011, term489011.getClass(), "levelExp", -1950105121);
        setField(term489011, term489011.getClass(), "levelTitle", "xxx");
        setIntField(term489011, term489011.getClass(), "plateId", -1);
        setIntField(term489011, term489011.getClass(), "plateEffectId", -1);
        setField(term489011, term489011.getClass(), "passwordStatus", enum1087);
        setField(term489011, term489011.getClass(), "password", "**********");
        setBooleanField(term489011, term489011.getClass(), "preferPerPvModule", true);
        setBooleanField(term489011, term489011.getClass(), "preferCommonModule", false);
        setBooleanField(term489011, term489011.getClass(), "usePerPvSkin", false);
        setBooleanField(term489011, term489011.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term489011, term489011.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term489011, term489011.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term489011, term489011.getClass(), "usePerPvTouchSliderSe", true);
        setField(term489011, term489011.getClass(), "commonModule", "-999,-999,-999");
        setField(term489011, term489011.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term489135, term489135.getClass(), "year", 2026);
        setShortField(term489135, term489135.getClass(), "month", (short) 8);
        setShortField(term489135, term489135.getClass(), "day", (short) 12);
        setField(term489134, term489134.getClass(), "date", term489135);
        setByteField(term489139, term489139.getClass(), "hour", (byte) 2);
        setByteField(term489139, term489139.getClass(), "minute", (byte) 3);
        setByteField(term489139, term489139.getClass(), "second", (byte) 45);
        setIntField(term489139, term489139.getClass(), "nano", 783270000);
        setField(term489134, term489134.getClass(), "time", term489139);
        setField(term489011, term489011.getClass(), "commonModuleSetTime", term489134);
        setField(term489011, term489011.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term489011, term489011.getClass(), "commonSkin", -1);
        setIntField(term489011, term489011.getClass(), "headphoneVolume", 100);
        setBooleanField(term489011, term489011.getClass(), "buttonSeOn", true);
        setIntField(term489011, term489011.getClass(), "buttonSeVolume", 100);
        setIntField(term489011, term489011.getClass(), "sliderSeVolume", 100);
        setIntField(term489011, term489011.getClass(), "buttonSe", -1);
        setIntField(term489011, term489011.getClass(), "chainSlideSe", -1);
        setIntField(term489011, term489011.getClass(), "slideSe", -1);
        setIntField(term489011, term489011.getClass(), "sliderTouchSe", -1);
        setField(term489011, term489011.getClass(), "sortMode", enum1088);
        setIntField(term489011, term489011.getClass(), "nextPvId", -1);
        setField(term489011, term489011.getClass(), "nextDifficulty", enum1089);
        setField(term489011, term489011.getClass(), "nextEdition", enum1090);
        setBooleanField(term489011, term489011.getClass(), "showInterimRanking", true);
        setBooleanField(term489011, term489011.getClass(), "showClearStatus", true);
        setBooleanField(term489011, term489011.getClass(), "showGreatBorder", true);
        setBooleanField(term489011, term489011.getClass(), "showExcellentBorder", true);
        setBooleanField(term489011, term489011.getClass(), "showRivalBorder", true);
        setBooleanField(term489011, term489011.getClass(), "showRgoSetting", true);
        setBooleanField(term489011, term489011.getClass(), "contestNowPlayingEnable", false);
        setIntField(term489011, term489011.getClass(), "contestNowPlayingId", -1);
        setIntField(term489011, term489011.getClass(), "contestNowPlayingValue", -1);
        setField(term489011, term489011.getClass(), "contestNowPlayingResultRank", enum1091);
        setField(term489011, term489011.getClass(), "contestNowPlayingSpecifier", "");
        setField(term489011, term489011.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term489011, term489011.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term489011, term489011.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term489011, term489011.getClass(), "rivalPdId", -1);
        setField(term489009, term489009.getClass(), "pdId", term489011);
        setIntField(term489009, term489009.getClass(), "pvId", 1664370474);
        setField(term489009, term489009.getClass(), "fileName", "WVbxuoDBcn");
        setField(term489009, term489009.getClass(), "moduleList", "pvDEABOxLt");
        setField(term489009, term489009.getClass(), "customizeList", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term489009, args);
    }

};


