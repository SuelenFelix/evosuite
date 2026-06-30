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
import java.lang.Integer;

public class PlayerProfile_setLevel_13753792055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816100;
     Object term816705;

    public PlayerProfile_setLevel_13753792055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term816714 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term816713 = ((Class) term816714).getDeclaredField((String) "MISS");
        ((Field) term816713).setAccessible(true);
        Object enum1762 = ((Field) term816713).get((Object) null);
        Class<? extends Object> term817091 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term817090 = ((Class) term817091).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term817090).setAccessible(true);
        Object enum1763 = ((Field) term817090).get((Object) null);
        Class<? extends Object> term817374 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term817373 = ((Class) term817374).getDeclaredField((String) "NORMAL");
        ((Field) term817373).setAccessible(true);
        Object enum1764 = ((Field) term817373).get((Object) null);
        Class<? extends Object> term817649 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term817648 = ((Class) term817649).getDeclaredField((String) "ORIGINAL");
        ((Field) term817648).setAccessible(true);
        Object enum1765 = ((Field) term817648).get((Object) null);
        Class<? extends Object> term817915 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term817914 = ((Class) term817915).getDeclaredField((String) "NONE");
        ((Field) term817914).setAccessible(true);
        Object enum1766 = ((Field) term817914).get((Object) null);
        term816100 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term816223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term816224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term816228 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term816100, term816100.getClass(), "id", -8705953038984862378L);
        setIntField(term816100, term816100.getClass(), "pdId", -2094311816);
        setField(term816100, term816100.getClass(), "playerName", "xxx");
        setIntField(term816100, term816100.getClass(), "vocaloidPoints", 300);
        setIntField(term816100, term816100.getClass(), "level", 1);
        setIntField(term816100, term816100.getClass(), "levelExp", 419332770);
        setField(term816100, term816100.getClass(), "levelTitle", "xxx");
        setIntField(term816100, term816100.getClass(), "plateId", -1);
        setIntField(term816100, term816100.getClass(), "plateEffectId", -1);
        setField(term816100, term816100.getClass(), "passwordStatus", enum1762);
        setField(term816100, term816100.getClass(), "password", "**********");
        setBooleanField(term816100, term816100.getClass(), "preferPerPvModule", true);
        setBooleanField(term816100, term816100.getClass(), "preferCommonModule", true);
        setBooleanField(term816100, term816100.getClass(), "usePerPvSkin", true);
        setBooleanField(term816100, term816100.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term816100, term816100.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term816100, term816100.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term816100, term816100.getClass(), "usePerPvTouchSliderSe", true);
        setField(term816100, term816100.getClass(), "commonModule", "-999,-999,-999");
        setField(term816100, term816100.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term816224, term816224.getClass(), "year", 2026);
        setShortField(term816224, term816224.getClass(), "month", (short) 6);
        setShortField(term816224, term816224.getClass(), "day", (short) 29);
        setField(term816223, term816223.getClass(), "date", term816224);
        setByteField(term816228, term816228.getClass(), "hour", (byte) 4);
        setByteField(term816228, term816228.getClass(), "minute", (byte) 29);
        setByteField(term816228, term816228.getClass(), "second", (byte) 23);
        setIntField(term816228, term816228.getClass(), "nano", 382379000);
        setField(term816223, term816223.getClass(), "time", term816228);
        setField(term816100, term816100.getClass(), "commonModuleSetTime", term816223);
        setField(term816100, term816100.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term816100, term816100.getClass(), "commonSkin", -1);
        setIntField(term816100, term816100.getClass(), "headphoneVolume", 100);
        setBooleanField(term816100, term816100.getClass(), "buttonSeOn", true);
        setIntField(term816100, term816100.getClass(), "buttonSeVolume", 100);
        setIntField(term816100, term816100.getClass(), "sliderSeVolume", 100);
        setIntField(term816100, term816100.getClass(), "buttonSe", -1);
        setIntField(term816100, term816100.getClass(), "chainSlideSe", -1);
        setIntField(term816100, term816100.getClass(), "slideSe", -1);
        setIntField(term816100, term816100.getClass(), "sliderTouchSe", -1);
        setField(term816100, term816100.getClass(), "sortMode", enum1763);
        setIntField(term816100, term816100.getClass(), "nextPvId", -1);
        setField(term816100, term816100.getClass(), "nextDifficulty", enum1764);
        setField(term816100, term816100.getClass(), "nextEdition", enum1765);
        setBooleanField(term816100, term816100.getClass(), "showInterimRanking", true);
        setBooleanField(term816100, term816100.getClass(), "showClearStatus", true);
        setBooleanField(term816100, term816100.getClass(), "showGreatBorder", true);
        setBooleanField(term816100, term816100.getClass(), "showExcellentBorder", true);
        setBooleanField(term816100, term816100.getClass(), "showRivalBorder", true);
        setBooleanField(term816100, term816100.getClass(), "showRgoSetting", true);
        setBooleanField(term816100, term816100.getClass(), "contestNowPlayingEnable", true);
        setIntField(term816100, term816100.getClass(), "contestNowPlayingId", -1);
        setIntField(term816100, term816100.getClass(), "contestNowPlayingValue", -1);
        setField(term816100, term816100.getClass(), "contestNowPlayingResultRank", enum1766);
        setField(term816100, term816100.getClass(), "contestNowPlayingSpecifier", "");
        setField(term816100, term816100.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term816100, term816100.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term816100, term816100.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term816100, term816100.getClass(), "rivalPdId", -1);
        term816705 = new Integer(1742733401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term816705;
        callMethod(klass, "setLevel", argTypes, term816100, args);
    }

};


