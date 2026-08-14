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

public class PlayerProfile_isShowExcellentBorder_206938018939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776824;

    public PlayerProfile_isShowExcellentBorder_206938018939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term777436 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term777435 = ((Class) term777436).getDeclaredField((String) "MISS");
        ((Field) term777435).setAccessible(true);
        Object enum1682 = ((Field) term777435).get((Object) null);
        Class<? extends Object> term777813 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term777812 = ((Class) term777813).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term777812).setAccessible(true);
        Object enum1683 = ((Field) term777812).get((Object) null);
        Class<? extends Object> term778096 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term778095 = ((Class) term778096).getDeclaredField((String) "NORMAL");
        ((Field) term778095).setAccessible(true);
        Object enum1684 = ((Field) term778095).get((Object) null);
        Class<? extends Object> term778371 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term778370 = ((Class) term778371).getDeclaredField((String) "ORIGINAL");
        ((Field) term778370).setAccessible(true);
        Object enum1685 = ((Field) term778370).get((Object) null);
        Class<? extends Object> term778637 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term778636 = ((Class) term778637).getDeclaredField((String) "NONE");
        ((Field) term778636).setAccessible(true);
        Object enum1686 = ((Field) term778636).get((Object) null);
        term776824 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term776947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term776948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term776952 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term776824, term776824.getClass(), "id", -2286229228641472715L);
        setIntField(term776824, term776824.getClass(), "pdId", 1430629000);
        setField(term776824, term776824.getClass(), "playerName", "xxx");
        setIntField(term776824, term776824.getClass(), "vocaloidPoints", 300);
        setIntField(term776824, term776824.getClass(), "level", 1);
        setIntField(term776824, term776824.getClass(), "levelExp", -1684627375);
        setField(term776824, term776824.getClass(), "levelTitle", "xxx");
        setIntField(term776824, term776824.getClass(), "plateId", -1);
        setIntField(term776824, term776824.getClass(), "plateEffectId", -1);
        setField(term776824, term776824.getClass(), "passwordStatus", enum1682);
        setField(term776824, term776824.getClass(), "password", "**********");
        setBooleanField(term776824, term776824.getClass(), "preferPerPvModule", true);
        setBooleanField(term776824, term776824.getClass(), "preferCommonModule", true);
        setBooleanField(term776824, term776824.getClass(), "usePerPvSkin", true);
        setBooleanField(term776824, term776824.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term776824, term776824.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term776824, term776824.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term776824, term776824.getClass(), "usePerPvTouchSliderSe", true);
        setField(term776824, term776824.getClass(), "commonModule", "-999,-999,-999");
        setField(term776824, term776824.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term776948, term776948.getClass(), "year", 2026);
        setShortField(term776948, term776948.getClass(), "month", (short) 8);
        setShortField(term776948, term776948.getClass(), "day", (short) 12);
        setField(term776947, term776947.getClass(), "date", term776948);
        setByteField(term776952, term776952.getClass(), "hour", (byte) 2);
        setByteField(term776952, term776952.getClass(), "minute", (byte) 4);
        setByteField(term776952, term776952.getClass(), "second", (byte) 32);
        setIntField(term776952, term776952.getClass(), "nano", 575887000);
        setField(term776947, term776947.getClass(), "time", term776952);
        setField(term776824, term776824.getClass(), "commonModuleSetTime", term776947);
        setField(term776824, term776824.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term776824, term776824.getClass(), "commonSkin", -1);
        setIntField(term776824, term776824.getClass(), "headphoneVolume", 100);
        setBooleanField(term776824, term776824.getClass(), "buttonSeOn", true);
        setIntField(term776824, term776824.getClass(), "buttonSeVolume", 100);
        setIntField(term776824, term776824.getClass(), "sliderSeVolume", 100);
        setIntField(term776824, term776824.getClass(), "buttonSe", -1);
        setIntField(term776824, term776824.getClass(), "chainSlideSe", -1);
        setIntField(term776824, term776824.getClass(), "slideSe", -1);
        setIntField(term776824, term776824.getClass(), "sliderTouchSe", -1);
        setField(term776824, term776824.getClass(), "sortMode", enum1683);
        setIntField(term776824, term776824.getClass(), "nextPvId", -1);
        setField(term776824, term776824.getClass(), "nextDifficulty", enum1684);
        setField(term776824, term776824.getClass(), "nextEdition", enum1685);
        setBooleanField(term776824, term776824.getClass(), "showInterimRanking", true);
        setBooleanField(term776824, term776824.getClass(), "showClearStatus", true);
        setBooleanField(term776824, term776824.getClass(), "showGreatBorder", true);
        setBooleanField(term776824, term776824.getClass(), "showExcellentBorder", true);
        setBooleanField(term776824, term776824.getClass(), "showRivalBorder", true);
        setBooleanField(term776824, term776824.getClass(), "showRgoSetting", true);
        setBooleanField(term776824, term776824.getClass(), "contestNowPlayingEnable", false);
        setIntField(term776824, term776824.getClass(), "contestNowPlayingId", -1);
        setIntField(term776824, term776824.getClass(), "contestNowPlayingValue", -1);
        setField(term776824, term776824.getClass(), "contestNowPlayingResultRank", enum1686);
        setField(term776824, term776824.getClass(), "contestNowPlayingSpecifier", "");
        setField(term776824, term776824.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term776824, term776824.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term776824, term776824.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term776824, term776824.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowExcellentBorder", argTypes, term776824, args);
    }

};


