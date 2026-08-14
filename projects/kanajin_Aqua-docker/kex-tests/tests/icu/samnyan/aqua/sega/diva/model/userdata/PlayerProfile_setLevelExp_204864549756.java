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

public class PlayerProfile_setLevelExp_204864549756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818555;
     Object term819160;

    public PlayerProfile_setLevelExp_204864549756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term819169 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term819168 = ((Class) term819169).getDeclaredField((String) "MISS");
        ((Field) term819168).setAccessible(true);
        Object enum1767 = ((Field) term819168).get((Object) null);
        Class<? extends Object> term819546 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term819545 = ((Class) term819546).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term819545).setAccessible(true);
        Object enum1768 = ((Field) term819545).get((Object) null);
        Class<? extends Object> term819829 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term819828 = ((Class) term819829).getDeclaredField((String) "NORMAL");
        ((Field) term819828).setAccessible(true);
        Object enum1769 = ((Field) term819828).get((Object) null);
        Class<? extends Object> term820104 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term820103 = ((Class) term820104).getDeclaredField((String) "ORIGINAL");
        ((Field) term820103).setAccessible(true);
        Object enum1770 = ((Field) term820103).get((Object) null);
        Class<? extends Object> term820370 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term820369 = ((Class) term820370).getDeclaredField((String) "NONE");
        ((Field) term820369).setAccessible(true);
        Object enum1771 = ((Field) term820369).get((Object) null);
        term818555 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term818678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term818679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term818683 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term818555, term818555.getClass(), "id", -7589547201844161961L);
        setIntField(term818555, term818555.getClass(), "pdId", 1634939612);
        setField(term818555, term818555.getClass(), "playerName", "xxx");
        setIntField(term818555, term818555.getClass(), "vocaloidPoints", 300);
        setIntField(term818555, term818555.getClass(), "level", 1);
        setIntField(term818555, term818555.getClass(), "levelExp", -590256406);
        setField(term818555, term818555.getClass(), "levelTitle", "xxx");
        setIntField(term818555, term818555.getClass(), "plateId", -1);
        setIntField(term818555, term818555.getClass(), "plateEffectId", -1);
        setField(term818555, term818555.getClass(), "passwordStatus", enum1767);
        setField(term818555, term818555.getClass(), "password", "**********");
        setBooleanField(term818555, term818555.getClass(), "preferPerPvModule", true);
        setBooleanField(term818555, term818555.getClass(), "preferCommonModule", false);
        setBooleanField(term818555, term818555.getClass(), "usePerPvSkin", true);
        setBooleanField(term818555, term818555.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term818555, term818555.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term818555, term818555.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term818555, term818555.getClass(), "usePerPvTouchSliderSe", false);
        setField(term818555, term818555.getClass(), "commonModule", "-999,-999,-999");
        setField(term818555, term818555.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term818679, term818679.getClass(), "year", 2026);
        setShortField(term818679, term818679.getClass(), "month", (short) 8);
        setShortField(term818679, term818679.getClass(), "day", (short) 12);
        setField(term818678, term818678.getClass(), "date", term818679);
        setByteField(term818683, term818683.getClass(), "hour", (byte) 2);
        setByteField(term818683, term818683.getClass(), "minute", (byte) 4);
        setByteField(term818683, term818683.getClass(), "second", (byte) 37);
        setIntField(term818683, term818683.getClass(), "nano", 104317000);
        setField(term818678, term818678.getClass(), "time", term818683);
        setField(term818555, term818555.getClass(), "commonModuleSetTime", term818678);
        setField(term818555, term818555.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term818555, term818555.getClass(), "commonSkin", -1);
        setIntField(term818555, term818555.getClass(), "headphoneVolume", 100);
        setBooleanField(term818555, term818555.getClass(), "buttonSeOn", true);
        setIntField(term818555, term818555.getClass(), "buttonSeVolume", 100);
        setIntField(term818555, term818555.getClass(), "sliderSeVolume", 100);
        setIntField(term818555, term818555.getClass(), "buttonSe", -1);
        setIntField(term818555, term818555.getClass(), "chainSlideSe", -1);
        setIntField(term818555, term818555.getClass(), "slideSe", -1);
        setIntField(term818555, term818555.getClass(), "sliderTouchSe", -1);
        setField(term818555, term818555.getClass(), "sortMode", enum1768);
        setIntField(term818555, term818555.getClass(), "nextPvId", -1);
        setField(term818555, term818555.getClass(), "nextDifficulty", enum1769);
        setField(term818555, term818555.getClass(), "nextEdition", enum1770);
        setBooleanField(term818555, term818555.getClass(), "showInterimRanking", true);
        setBooleanField(term818555, term818555.getClass(), "showClearStatus", true);
        setBooleanField(term818555, term818555.getClass(), "showGreatBorder", true);
        setBooleanField(term818555, term818555.getClass(), "showExcellentBorder", true);
        setBooleanField(term818555, term818555.getClass(), "showRivalBorder", true);
        setBooleanField(term818555, term818555.getClass(), "showRgoSetting", true);
        setBooleanField(term818555, term818555.getClass(), "contestNowPlayingEnable", false);
        setIntField(term818555, term818555.getClass(), "contestNowPlayingId", -1);
        setIntField(term818555, term818555.getClass(), "contestNowPlayingValue", -1);
        setField(term818555, term818555.getClass(), "contestNowPlayingResultRank", enum1771);
        setField(term818555, term818555.getClass(), "contestNowPlayingSpecifier", "");
        setField(term818555, term818555.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term818555, term818555.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term818555, term818555.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term818555, term818555.getClass(), "rivalPdId", -1);
        term819160 = new Integer(-1319797966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term819160;
        callMethod(klass, "setLevelExp", argTypes, term818555, args);
    }

};


