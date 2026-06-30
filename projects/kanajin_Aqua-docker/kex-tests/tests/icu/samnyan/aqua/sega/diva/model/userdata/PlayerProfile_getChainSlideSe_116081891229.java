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

public class PlayerProfile_getChainSlideSe_116081891229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752294;

    public PlayerProfile_getChainSlideSe_116081891229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term752906 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term752905 = ((Class) term752906).getDeclaredField((String) "MISS");
        ((Field) term752905).setAccessible(true);
        Object enum1632 = ((Field) term752905).get((Object) null);
        Class<? extends Object> term753283 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term753282 = ((Class) term753283).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term753282).setAccessible(true);
        Object enum1633 = ((Field) term753282).get((Object) null);
        Class<? extends Object> term753566 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term753565 = ((Class) term753566).getDeclaredField((String) "NORMAL");
        ((Field) term753565).setAccessible(true);
        Object enum1634 = ((Field) term753565).get((Object) null);
        Class<? extends Object> term753841 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term753840 = ((Class) term753841).getDeclaredField((String) "ORIGINAL");
        ((Field) term753840).setAccessible(true);
        Object enum1635 = ((Field) term753840).get((Object) null);
        Class<? extends Object> term754107 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term754106 = ((Class) term754107).getDeclaredField((String) "NONE");
        ((Field) term754106).setAccessible(true);
        Object enum1636 = ((Field) term754106).get((Object) null);
        term752294 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term752417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term752418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term752422 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term752294, term752294.getClass(), "id", 370847120687610747L);
        setIntField(term752294, term752294.getClass(), "pdId", 1072685856);
        setField(term752294, term752294.getClass(), "playerName", "xxx");
        setIntField(term752294, term752294.getClass(), "vocaloidPoints", 300);
        setIntField(term752294, term752294.getClass(), "level", 1);
        setIntField(term752294, term752294.getClass(), "levelExp", 1560132742);
        setField(term752294, term752294.getClass(), "levelTitle", "xxx");
        setIntField(term752294, term752294.getClass(), "plateId", -1);
        setIntField(term752294, term752294.getClass(), "plateEffectId", -1);
        setField(term752294, term752294.getClass(), "passwordStatus", enum1632);
        setField(term752294, term752294.getClass(), "password", "**********");
        setBooleanField(term752294, term752294.getClass(), "preferPerPvModule", true);
        setBooleanField(term752294, term752294.getClass(), "preferCommonModule", false);
        setBooleanField(term752294, term752294.getClass(), "usePerPvSkin", true);
        setBooleanField(term752294, term752294.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term752294, term752294.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term752294, term752294.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term752294, term752294.getClass(), "usePerPvTouchSliderSe", true);
        setField(term752294, term752294.getClass(), "commonModule", "-999,-999,-999");
        setField(term752294, term752294.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term752418, term752418.getClass(), "year", 2026);
        setShortField(term752418, term752418.getClass(), "month", (short) 6);
        setShortField(term752418, term752418.getClass(), "day", (short) 29);
        setField(term752417, term752417.getClass(), "date", term752418);
        setByteField(term752422, term752422.getClass(), "hour", (byte) 4);
        setByteField(term752422, term752422.getClass(), "minute", (byte) 29);
        setByteField(term752422, term752422.getClass(), "second", (byte) 16);
        setIntField(term752422, term752422.getClass(), "nano", 698548000);
        setField(term752417, term752417.getClass(), "time", term752422);
        setField(term752294, term752294.getClass(), "commonModuleSetTime", term752417);
        setField(term752294, term752294.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term752294, term752294.getClass(), "commonSkin", -1);
        setIntField(term752294, term752294.getClass(), "headphoneVolume", 100);
        setBooleanField(term752294, term752294.getClass(), "buttonSeOn", true);
        setIntField(term752294, term752294.getClass(), "buttonSeVolume", 100);
        setIntField(term752294, term752294.getClass(), "sliderSeVolume", 100);
        setIntField(term752294, term752294.getClass(), "buttonSe", -1);
        setIntField(term752294, term752294.getClass(), "chainSlideSe", -1);
        setIntField(term752294, term752294.getClass(), "slideSe", -1);
        setIntField(term752294, term752294.getClass(), "sliderTouchSe", -1);
        setField(term752294, term752294.getClass(), "sortMode", enum1633);
        setIntField(term752294, term752294.getClass(), "nextPvId", -1);
        setField(term752294, term752294.getClass(), "nextDifficulty", enum1634);
        setField(term752294, term752294.getClass(), "nextEdition", enum1635);
        setBooleanField(term752294, term752294.getClass(), "showInterimRanking", true);
        setBooleanField(term752294, term752294.getClass(), "showClearStatus", true);
        setBooleanField(term752294, term752294.getClass(), "showGreatBorder", true);
        setBooleanField(term752294, term752294.getClass(), "showExcellentBorder", true);
        setBooleanField(term752294, term752294.getClass(), "showRivalBorder", true);
        setBooleanField(term752294, term752294.getClass(), "showRgoSetting", true);
        setBooleanField(term752294, term752294.getClass(), "contestNowPlayingEnable", false);
        setIntField(term752294, term752294.getClass(), "contestNowPlayingId", -1);
        setIntField(term752294, term752294.getClass(), "contestNowPlayingValue", -1);
        setField(term752294, term752294.getClass(), "contestNowPlayingResultRank", enum1636);
        setField(term752294, term752294.getClass(), "contestNowPlayingSpecifier", "");
        setField(term752294, term752294.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term752294, term752294.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term752294, term752294.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term752294, term752294.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChainSlideSe", argTypes, term752294, args);
    }

};


