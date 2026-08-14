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

public class PlayerProfile_getCommonSkin_117317548223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737576;

    public PlayerProfile_getCommonSkin_117317548223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term738188 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term738187 = ((Class) term738188).getDeclaredField((String) "MISS");
        ((Field) term738187).setAccessible(true);
        Object enum1602 = ((Field) term738187).get((Object) null);
        Class<? extends Object> term738565 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term738564 = ((Class) term738565).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term738564).setAccessible(true);
        Object enum1603 = ((Field) term738564).get((Object) null);
        Class<? extends Object> term738848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term738847 = ((Class) term738848).getDeclaredField((String) "NORMAL");
        ((Field) term738847).setAccessible(true);
        Object enum1604 = ((Field) term738847).get((Object) null);
        Class<? extends Object> term739123 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term739122 = ((Class) term739123).getDeclaredField((String) "ORIGINAL");
        ((Field) term739122).setAccessible(true);
        Object enum1605 = ((Field) term739122).get((Object) null);
        Class<? extends Object> term739389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term739388 = ((Class) term739389).getDeclaredField((String) "NONE");
        ((Field) term739388).setAccessible(true);
        Object enum1606 = ((Field) term739388).get((Object) null);
        term737576 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term737699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term737700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term737704 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term737576, term737576.getClass(), "id", 77619432202128806L);
        setIntField(term737576, term737576.getClass(), "pdId", 455869012);
        setField(term737576, term737576.getClass(), "playerName", "xxx");
        setIntField(term737576, term737576.getClass(), "vocaloidPoints", 300);
        setIntField(term737576, term737576.getClass(), "level", 1);
        setIntField(term737576, term737576.getClass(), "levelExp", 782841747);
        setField(term737576, term737576.getClass(), "levelTitle", "xxx");
        setIntField(term737576, term737576.getClass(), "plateId", -1);
        setIntField(term737576, term737576.getClass(), "plateEffectId", -1);
        setField(term737576, term737576.getClass(), "passwordStatus", enum1602);
        setField(term737576, term737576.getClass(), "password", "**********");
        setBooleanField(term737576, term737576.getClass(), "preferPerPvModule", true);
        setBooleanField(term737576, term737576.getClass(), "preferCommonModule", true);
        setBooleanField(term737576, term737576.getClass(), "usePerPvSkin", true);
        setBooleanField(term737576, term737576.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term737576, term737576.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term737576, term737576.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term737576, term737576.getClass(), "usePerPvTouchSliderSe", true);
        setField(term737576, term737576.getClass(), "commonModule", "-999,-999,-999");
        setField(term737576, term737576.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term737700, term737700.getClass(), "year", 2026);
        setShortField(term737700, term737700.getClass(), "month", (short) 8);
        setShortField(term737700, term737700.getClass(), "day", (short) 12);
        setField(term737699, term737699.getClass(), "date", term737700);
        setByteField(term737704, term737704.getClass(), "hour", (byte) 2);
        setByteField(term737704, term737704.getClass(), "minute", (byte) 4);
        setByteField(term737704, term737704.getClass(), "second", (byte) 28);
        setIntField(term737704, term737704.getClass(), "nano", 363048000);
        setField(term737699, term737699.getClass(), "time", term737704);
        setField(term737576, term737576.getClass(), "commonModuleSetTime", term737699);
        setField(term737576, term737576.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term737576, term737576.getClass(), "commonSkin", -1);
        setIntField(term737576, term737576.getClass(), "headphoneVolume", 100);
        setBooleanField(term737576, term737576.getClass(), "buttonSeOn", true);
        setIntField(term737576, term737576.getClass(), "buttonSeVolume", 100);
        setIntField(term737576, term737576.getClass(), "sliderSeVolume", 100);
        setIntField(term737576, term737576.getClass(), "buttonSe", -1);
        setIntField(term737576, term737576.getClass(), "chainSlideSe", -1);
        setIntField(term737576, term737576.getClass(), "slideSe", -1);
        setIntField(term737576, term737576.getClass(), "sliderTouchSe", -1);
        setField(term737576, term737576.getClass(), "sortMode", enum1603);
        setIntField(term737576, term737576.getClass(), "nextPvId", -1);
        setField(term737576, term737576.getClass(), "nextDifficulty", enum1604);
        setField(term737576, term737576.getClass(), "nextEdition", enum1605);
        setBooleanField(term737576, term737576.getClass(), "showInterimRanking", true);
        setBooleanField(term737576, term737576.getClass(), "showClearStatus", true);
        setBooleanField(term737576, term737576.getClass(), "showGreatBorder", true);
        setBooleanField(term737576, term737576.getClass(), "showExcellentBorder", true);
        setBooleanField(term737576, term737576.getClass(), "showRivalBorder", true);
        setBooleanField(term737576, term737576.getClass(), "showRgoSetting", true);
        setBooleanField(term737576, term737576.getClass(), "contestNowPlayingEnable", false);
        setIntField(term737576, term737576.getClass(), "contestNowPlayingId", -1);
        setIntField(term737576, term737576.getClass(), "contestNowPlayingValue", -1);
        setField(term737576, term737576.getClass(), "contestNowPlayingResultRank", enum1606);
        setField(term737576, term737576.getClass(), "contestNowPlayingSpecifier", "");
        setField(term737576, term737576.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term737576, term737576.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term737576, term737576.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term737576, term737576.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommonSkin", argTypes, term737576, args);
    }

};


