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
import java.lang.String;
import java.lang.Object;

public class PlayerProfile_setContestNowPlayingSpecifier_145980443596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917689;

    public PlayerProfile_setContestNowPlayingSpecifier_145980443596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term918313 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term918312 = ((Class) term918313).getDeclaredField((String) "MISS");
        ((Field) term918312).setAccessible(true);
        Object enum1970 = ((Field) term918312).get((Object) null);
        Class<? extends Object> term918690 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term918689 = ((Class) term918690).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term918689).setAccessible(true);
        Object enum1971 = ((Field) term918689).get((Object) null);
        Class<? extends Object> term918973 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term918972 = ((Class) term918973).getDeclaredField((String) "NORMAL");
        ((Field) term918972).setAccessible(true);
        Object enum1972 = ((Field) term918972).get((Object) null);
        Class<? extends Object> term919248 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term919247 = ((Class) term919248).getDeclaredField((String) "ORIGINAL");
        ((Field) term919247).setAccessible(true);
        Object enum1973 = ((Field) term919247).get((Object) null);
        Class<? extends Object> term919514 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term919513 = ((Class) term919514).getDeclaredField((String) "NONE");
        ((Field) term919513).setAccessible(true);
        Object enum1974 = ((Field) term919513).get((Object) null);
        term917689 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term917812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term917813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term917817 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term917689, term917689.getClass(), "id", -955253666696787757L);
        setIntField(term917689, term917689.getClass(), "pdId", -1191329679);
        setField(term917689, term917689.getClass(), "playerName", "xxx");
        setIntField(term917689, term917689.getClass(), "vocaloidPoints", 300);
        setIntField(term917689, term917689.getClass(), "level", 1);
        setIntField(term917689, term917689.getClass(), "levelExp", -937626498);
        setField(term917689, term917689.getClass(), "levelTitle", "xxx");
        setIntField(term917689, term917689.getClass(), "plateId", -1);
        setIntField(term917689, term917689.getClass(), "plateEffectId", -1);
        setField(term917689, term917689.getClass(), "passwordStatus", enum1970);
        setField(term917689, term917689.getClass(), "password", "**********");
        setBooleanField(term917689, term917689.getClass(), "preferPerPvModule", true);
        setBooleanField(term917689, term917689.getClass(), "preferCommonModule", true);
        setBooleanField(term917689, term917689.getClass(), "usePerPvSkin", false);
        setBooleanField(term917689, term917689.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term917689, term917689.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term917689, term917689.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term917689, term917689.getClass(), "usePerPvTouchSliderSe", true);
        setField(term917689, term917689.getClass(), "commonModule", "-999,-999,-999");
        setField(term917689, term917689.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term917813, term917813.getClass(), "year", 2026);
        setShortField(term917813, term917813.getClass(), "month", (short) 6);
        setShortField(term917813, term917813.getClass(), "day", (short) 29);
        setField(term917812, term917812.getClass(), "date", term917813);
        setByteField(term917817, term917817.getClass(), "hour", (byte) 4);
        setByteField(term917817, term917817.getClass(), "minute", (byte) 29);
        setByteField(term917817, term917817.getClass(), "second", (byte) 33);
        setIntField(term917817, term917817.getClass(), "nano", 941800000);
        setField(term917812, term917812.getClass(), "time", term917817);
        setField(term917689, term917689.getClass(), "commonModuleSetTime", term917812);
        setField(term917689, term917689.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term917689, term917689.getClass(), "commonSkin", -1);
        setIntField(term917689, term917689.getClass(), "headphoneVolume", 100);
        setBooleanField(term917689, term917689.getClass(), "buttonSeOn", true);
        setIntField(term917689, term917689.getClass(), "buttonSeVolume", 100);
        setIntField(term917689, term917689.getClass(), "sliderSeVolume", 100);
        setIntField(term917689, term917689.getClass(), "buttonSe", -1);
        setIntField(term917689, term917689.getClass(), "chainSlideSe", -1);
        setIntField(term917689, term917689.getClass(), "slideSe", -1);
        setIntField(term917689, term917689.getClass(), "sliderTouchSe", -1);
        setField(term917689, term917689.getClass(), "sortMode", enum1971);
        setIntField(term917689, term917689.getClass(), "nextPvId", -1);
        setField(term917689, term917689.getClass(), "nextDifficulty", enum1972);
        setField(term917689, term917689.getClass(), "nextEdition", enum1973);
        setBooleanField(term917689, term917689.getClass(), "showInterimRanking", true);
        setBooleanField(term917689, term917689.getClass(), "showClearStatus", true);
        setBooleanField(term917689, term917689.getClass(), "showGreatBorder", true);
        setBooleanField(term917689, term917689.getClass(), "showExcellentBorder", true);
        setBooleanField(term917689, term917689.getClass(), "showRivalBorder", true);
        setBooleanField(term917689, term917689.getClass(), "showRgoSetting", true);
        setBooleanField(term917689, term917689.getClass(), "contestNowPlayingEnable", true);
        setIntField(term917689, term917689.getClass(), "contestNowPlayingId", -1);
        setIntField(term917689, term917689.getClass(), "contestNowPlayingValue", -1);
        setField(term917689, term917689.getClass(), "contestNowPlayingResultRank", enum1974);
        setField(term917689, term917689.getClass(), "contestNowPlayingSpecifier", "");
        setField(term917689, term917689.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term917689, term917689.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term917689, term917689.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term917689, term917689.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zsWKWiTFuo";
        callMethod(klass, "setContestNowPlayingSpecifier", argTypes, term917689, args);
    }

};


