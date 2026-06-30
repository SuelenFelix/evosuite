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

public class PlayerProfile_isUsePerPvButtonSe_86109067415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717952;

    public PlayerProfile_isUsePerPvButtonSe_86109067415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term718564 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term718563 = ((Class) term718564).getDeclaredField((String) "MISS");
        ((Field) term718563).setAccessible(true);
        Object enum1562 = ((Field) term718563).get((Object) null);
        Class<? extends Object> term718941 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term718940 = ((Class) term718941).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term718940).setAccessible(true);
        Object enum1563 = ((Field) term718940).get((Object) null);
        Class<? extends Object> term719224 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term719223 = ((Class) term719224).getDeclaredField((String) "NORMAL");
        ((Field) term719223).setAccessible(true);
        Object enum1564 = ((Field) term719223).get((Object) null);
        Class<? extends Object> term719499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term719498 = ((Class) term719499).getDeclaredField((String) "ORIGINAL");
        ((Field) term719498).setAccessible(true);
        Object enum1565 = ((Field) term719498).get((Object) null);
        Class<? extends Object> term719765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term719764 = ((Class) term719765).getDeclaredField((String) "NONE");
        ((Field) term719764).setAccessible(true);
        Object enum1566 = ((Field) term719764).get((Object) null);
        term717952 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term718075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term718076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term718080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term717952, term717952.getClass(), "id", -4693900822622913579L);
        setIntField(term717952, term717952.getClass(), "pdId", -590298353);
        setField(term717952, term717952.getClass(), "playerName", "xxx");
        setIntField(term717952, term717952.getClass(), "vocaloidPoints", 300);
        setIntField(term717952, term717952.getClass(), "level", 1);
        setIntField(term717952, term717952.getClass(), "levelExp", -917544425);
        setField(term717952, term717952.getClass(), "levelTitle", "xxx");
        setIntField(term717952, term717952.getClass(), "plateId", -1);
        setIntField(term717952, term717952.getClass(), "plateEffectId", -1);
        setField(term717952, term717952.getClass(), "passwordStatus", enum1562);
        setField(term717952, term717952.getClass(), "password", "**********");
        setBooleanField(term717952, term717952.getClass(), "preferPerPvModule", true);
        setBooleanField(term717952, term717952.getClass(), "preferCommonModule", true);
        setBooleanField(term717952, term717952.getClass(), "usePerPvSkin", true);
        setBooleanField(term717952, term717952.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term717952, term717952.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term717952, term717952.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term717952, term717952.getClass(), "usePerPvTouchSliderSe", false);
        setField(term717952, term717952.getClass(), "commonModule", "-999,-999,-999");
        setField(term717952, term717952.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term718076, term718076.getClass(), "year", 2026);
        setShortField(term718076, term718076.getClass(), "month", (short) 6);
        setShortField(term718076, term718076.getClass(), "day", (short) 29);
        setField(term718075, term718075.getClass(), "date", term718076);
        setByteField(term718080, term718080.getClass(), "hour", (byte) 4);
        setByteField(term718080, term718080.getClass(), "minute", (byte) 29);
        setByteField(term718080, term718080.getClass(), "second", (byte) 13);
        setIntField(term718080, term718080.getClass(), "nano", 105572000);
        setField(term718075, term718075.getClass(), "time", term718080);
        setField(term717952, term717952.getClass(), "commonModuleSetTime", term718075);
        setField(term717952, term717952.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term717952, term717952.getClass(), "commonSkin", -1);
        setIntField(term717952, term717952.getClass(), "headphoneVolume", 100);
        setBooleanField(term717952, term717952.getClass(), "buttonSeOn", true);
        setIntField(term717952, term717952.getClass(), "buttonSeVolume", 100);
        setIntField(term717952, term717952.getClass(), "sliderSeVolume", 100);
        setIntField(term717952, term717952.getClass(), "buttonSe", -1);
        setIntField(term717952, term717952.getClass(), "chainSlideSe", -1);
        setIntField(term717952, term717952.getClass(), "slideSe", -1);
        setIntField(term717952, term717952.getClass(), "sliderTouchSe", -1);
        setField(term717952, term717952.getClass(), "sortMode", enum1563);
        setIntField(term717952, term717952.getClass(), "nextPvId", -1);
        setField(term717952, term717952.getClass(), "nextDifficulty", enum1564);
        setField(term717952, term717952.getClass(), "nextEdition", enum1565);
        setBooleanField(term717952, term717952.getClass(), "showInterimRanking", true);
        setBooleanField(term717952, term717952.getClass(), "showClearStatus", true);
        setBooleanField(term717952, term717952.getClass(), "showGreatBorder", true);
        setBooleanField(term717952, term717952.getClass(), "showExcellentBorder", true);
        setBooleanField(term717952, term717952.getClass(), "showRivalBorder", true);
        setBooleanField(term717952, term717952.getClass(), "showRgoSetting", true);
        setBooleanField(term717952, term717952.getClass(), "contestNowPlayingEnable", true);
        setIntField(term717952, term717952.getClass(), "contestNowPlayingId", -1);
        setIntField(term717952, term717952.getClass(), "contestNowPlayingValue", -1);
        setField(term717952, term717952.getClass(), "contestNowPlayingResultRank", enum1566);
        setField(term717952, term717952.getClass(), "contestNowPlayingSpecifier", "");
        setField(term717952, term717952.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term717952, term717952.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term717952, term717952.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term717952, term717952.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsePerPvButtonSe", argTypes, term717952, args);
    }

};


