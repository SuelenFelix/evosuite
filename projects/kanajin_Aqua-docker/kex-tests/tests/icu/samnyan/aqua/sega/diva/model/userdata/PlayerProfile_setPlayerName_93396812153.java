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

public class PlayerProfile_setPlayerName_93396812153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811170;

    public PlayerProfile_setPlayerName_93396812153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term811794 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term811793 = ((Class) term811794).getDeclaredField((String) "MISS");
        ((Field) term811793).setAccessible(true);
        Object enum1752 = ((Field) term811793).get((Object) null);
        Class<? extends Object> term812171 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term812170 = ((Class) term812171).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term812170).setAccessible(true);
        Object enum1753 = ((Field) term812170).get((Object) null);
        Class<? extends Object> term812454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term812453 = ((Class) term812454).getDeclaredField((String) "NORMAL");
        ((Field) term812453).setAccessible(true);
        Object enum1754 = ((Field) term812453).get((Object) null);
        Class<? extends Object> term812729 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term812728 = ((Class) term812729).getDeclaredField((String) "ORIGINAL");
        ((Field) term812728).setAccessible(true);
        Object enum1755 = ((Field) term812728).get((Object) null);
        Class<? extends Object> term812995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term812994 = ((Class) term812995).getDeclaredField((String) "NONE");
        ((Field) term812994).setAccessible(true);
        Object enum1756 = ((Field) term812994).get((Object) null);
        term811170 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term811293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term811294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term811298 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term811170, term811170.getClass(), "id", -143609946830350439L);
        setIntField(term811170, term811170.getClass(), "pdId", 1016563502);
        setField(term811170, term811170.getClass(), "playerName", "xxx");
        setIntField(term811170, term811170.getClass(), "vocaloidPoints", 300);
        setIntField(term811170, term811170.getClass(), "level", 1);
        setIntField(term811170, term811170.getClass(), "levelExp", -1845173237);
        setField(term811170, term811170.getClass(), "levelTitle", "xxx");
        setIntField(term811170, term811170.getClass(), "plateId", -1);
        setIntField(term811170, term811170.getClass(), "plateEffectId", -1);
        setField(term811170, term811170.getClass(), "passwordStatus", enum1752);
        setField(term811170, term811170.getClass(), "password", "**********");
        setBooleanField(term811170, term811170.getClass(), "preferPerPvModule", true);
        setBooleanField(term811170, term811170.getClass(), "preferCommonModule", false);
        setBooleanField(term811170, term811170.getClass(), "usePerPvSkin", false);
        setBooleanField(term811170, term811170.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term811170, term811170.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term811170, term811170.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term811170, term811170.getClass(), "usePerPvTouchSliderSe", false);
        setField(term811170, term811170.getClass(), "commonModule", "-999,-999,-999");
        setField(term811170, term811170.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term811294, term811294.getClass(), "year", 2026);
        setShortField(term811294, term811294.getClass(), "month", (short) 8);
        setShortField(term811294, term811294.getClass(), "day", (short) 12);
        setField(term811293, term811293.getClass(), "date", term811294);
        setByteField(term811298, term811298.getClass(), "hour", (byte) 2);
        setByteField(term811298, term811298.getClass(), "minute", (byte) 4);
        setByteField(term811298, term811298.getClass(), "second", (byte) 36);
        setIntField(term811298, term811298.getClass(), "nano", 295654000);
        setField(term811293, term811293.getClass(), "time", term811298);
        setField(term811170, term811170.getClass(), "commonModuleSetTime", term811293);
        setField(term811170, term811170.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term811170, term811170.getClass(), "commonSkin", -1);
        setIntField(term811170, term811170.getClass(), "headphoneVolume", 100);
        setBooleanField(term811170, term811170.getClass(), "buttonSeOn", true);
        setIntField(term811170, term811170.getClass(), "buttonSeVolume", 100);
        setIntField(term811170, term811170.getClass(), "sliderSeVolume", 100);
        setIntField(term811170, term811170.getClass(), "buttonSe", -1);
        setIntField(term811170, term811170.getClass(), "chainSlideSe", -1);
        setIntField(term811170, term811170.getClass(), "slideSe", -1);
        setIntField(term811170, term811170.getClass(), "sliderTouchSe", -1);
        setField(term811170, term811170.getClass(), "sortMode", enum1753);
        setIntField(term811170, term811170.getClass(), "nextPvId", -1);
        setField(term811170, term811170.getClass(), "nextDifficulty", enum1754);
        setField(term811170, term811170.getClass(), "nextEdition", enum1755);
        setBooleanField(term811170, term811170.getClass(), "showInterimRanking", true);
        setBooleanField(term811170, term811170.getClass(), "showClearStatus", true);
        setBooleanField(term811170, term811170.getClass(), "showGreatBorder", true);
        setBooleanField(term811170, term811170.getClass(), "showExcellentBorder", true);
        setBooleanField(term811170, term811170.getClass(), "showRivalBorder", true);
        setBooleanField(term811170, term811170.getClass(), "showRgoSetting", true);
        setBooleanField(term811170, term811170.getClass(), "contestNowPlayingEnable", false);
        setIntField(term811170, term811170.getClass(), "contestNowPlayingId", -1);
        setIntField(term811170, term811170.getClass(), "contestNowPlayingValue", -1);
        setField(term811170, term811170.getClass(), "contestNowPlayingResultRank", enum1756);
        setField(term811170, term811170.getClass(), "contestNowPlayingSpecifier", "");
        setField(term811170, term811170.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term811170, term811170.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term811170, term811170.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term811170, term811170.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "avhRaGZaBF";
        callMethod(klass, "setPlayerName", argTypes, term811170, args);
    }

};


