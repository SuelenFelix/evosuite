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

public class PlayerScreenShot_getId_15910788881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486487;

    public PlayerScreenShot_getId_15910788881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term487138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term487137 = ((Class) term487138).getDeclaredField((String) "MISS");
        ((Field) term487137).setAccessible(true);
        Object enum1082 = ((Field) term487137).get((Object) null);
        Class<? extends Object> term487515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term487514 = ((Class) term487515).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term487514).setAccessible(true);
        Object enum1083 = ((Field) term487514).get((Object) null);
        Class<? extends Object> term487798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term487797 = ((Class) term487798).getDeclaredField((String) "NORMAL");
        ((Field) term487797).setAccessible(true);
        Object enum1084 = ((Field) term487797).get((Object) null);
        Class<? extends Object> term488073 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term488072 = ((Class) term488073).getDeclaredField((String) "ORIGINAL");
        ((Field) term488072).setAccessible(true);
        Object enum1085 = ((Field) term488072).get((Object) null);
        Class<? extends Object> term488339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term488338 = ((Class) term488339).getDeclaredField((String) "NONE");
        ((Field) term488338).setAccessible(true);
        Object enum1086 = ((Field) term488338).get((Object) null);
        term486487 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term486489 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term486612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term486613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term486617 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term486487, term486487.getClass(), "id", -6521561238735301071L);
        setLongField(term486489, term486489.getClass(), "id", -6609679920238945303L);
        setIntField(term486489, term486489.getClass(), "pdId", 1328311779);
        setField(term486489, term486489.getClass(), "playerName", "xxx");
        setIntField(term486489, term486489.getClass(), "vocaloidPoints", 300);
        setIntField(term486489, term486489.getClass(), "level", 1);
        setIntField(term486489, term486489.getClass(), "levelExp", -1459351662);
        setField(term486489, term486489.getClass(), "levelTitle", "xxx");
        setIntField(term486489, term486489.getClass(), "plateId", -1);
        setIntField(term486489, term486489.getClass(), "plateEffectId", -1);
        setField(term486489, term486489.getClass(), "passwordStatus", enum1082);
        setField(term486489, term486489.getClass(), "password", "**********");
        setBooleanField(term486489, term486489.getClass(), "preferPerPvModule", true);
        setBooleanField(term486489, term486489.getClass(), "preferCommonModule", false);
        setBooleanField(term486489, term486489.getClass(), "usePerPvSkin", true);
        setBooleanField(term486489, term486489.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term486489, term486489.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term486489, term486489.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term486489, term486489.getClass(), "usePerPvTouchSliderSe", false);
        setField(term486489, term486489.getClass(), "commonModule", "-999,-999,-999");
        setField(term486489, term486489.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term486613, term486613.getClass(), "year", 2026);
        setShortField(term486613, term486613.getClass(), "month", (short) 8);
        setShortField(term486613, term486613.getClass(), "day", (short) 12);
        setField(term486612, term486612.getClass(), "date", term486613);
        setByteField(term486617, term486617.getClass(), "hour", (byte) 2);
        setByteField(term486617, term486617.getClass(), "minute", (byte) 3);
        setByteField(term486617, term486617.getClass(), "second", (byte) 45);
        setIntField(term486617, term486617.getClass(), "nano", 536489000);
        setField(term486612, term486612.getClass(), "time", term486617);
        setField(term486489, term486489.getClass(), "commonModuleSetTime", term486612);
        setField(term486489, term486489.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term486489, term486489.getClass(), "commonSkin", -1);
        setIntField(term486489, term486489.getClass(), "headphoneVolume", 100);
        setBooleanField(term486489, term486489.getClass(), "buttonSeOn", true);
        setIntField(term486489, term486489.getClass(), "buttonSeVolume", 100);
        setIntField(term486489, term486489.getClass(), "sliderSeVolume", 100);
        setIntField(term486489, term486489.getClass(), "buttonSe", -1);
        setIntField(term486489, term486489.getClass(), "chainSlideSe", -1);
        setIntField(term486489, term486489.getClass(), "slideSe", -1);
        setIntField(term486489, term486489.getClass(), "sliderTouchSe", -1);
        setField(term486489, term486489.getClass(), "sortMode", enum1083);
        setIntField(term486489, term486489.getClass(), "nextPvId", -1);
        setField(term486489, term486489.getClass(), "nextDifficulty", enum1084);
        setField(term486489, term486489.getClass(), "nextEdition", enum1085);
        setBooleanField(term486489, term486489.getClass(), "showInterimRanking", true);
        setBooleanField(term486489, term486489.getClass(), "showClearStatus", true);
        setBooleanField(term486489, term486489.getClass(), "showGreatBorder", true);
        setBooleanField(term486489, term486489.getClass(), "showExcellentBorder", true);
        setBooleanField(term486489, term486489.getClass(), "showRivalBorder", true);
        setBooleanField(term486489, term486489.getClass(), "showRgoSetting", true);
        setBooleanField(term486489, term486489.getClass(), "contestNowPlayingEnable", true);
        setIntField(term486489, term486489.getClass(), "contestNowPlayingId", -1);
        setIntField(term486489, term486489.getClass(), "contestNowPlayingValue", -1);
        setField(term486489, term486489.getClass(), "contestNowPlayingResultRank", enum1086);
        setField(term486489, term486489.getClass(), "contestNowPlayingSpecifier", "");
        setField(term486489, term486489.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term486489, term486489.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term486489, term486489.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term486489, term486489.getClass(), "rivalPdId", -1);
        setField(term486487, term486487.getClass(), "pdId", term486489);
        setIntField(term486487, term486487.getClass(), "pvId", -887392605);
        setField(term486487, term486487.getClass(), "fileName", "ypEdrstygY");
        setField(term486487, term486487.getClass(), "moduleList", "sNQFlATEeQ");
        setField(term486487, term486487.getClass(), "customizeList", "ZKMLioamsY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term486487, args);
    }

};


