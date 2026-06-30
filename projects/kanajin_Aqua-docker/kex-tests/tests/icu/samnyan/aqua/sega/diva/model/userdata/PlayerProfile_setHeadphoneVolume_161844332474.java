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

public class PlayerProfile_setHeadphoneVolume_161844332474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862851;
     Object term863456;

    public PlayerProfile_setHeadphoneVolume_161844332474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term863465 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term863464 = ((Class) term863465).getDeclaredField((String) "MISS");
        ((Field) term863464).setAccessible(true);
        Object enum1857 = ((Field) term863464).get((Object) null);
        Class<? extends Object> term863842 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term863841 = ((Class) term863842).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term863841).setAccessible(true);
        Object enum1858 = ((Field) term863841).get((Object) null);
        Class<? extends Object> term864125 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term864124 = ((Class) term864125).getDeclaredField((String) "NORMAL");
        ((Field) term864124).setAccessible(true);
        Object enum1859 = ((Field) term864124).get((Object) null);
        Class<? extends Object> term864400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term864399 = ((Class) term864400).getDeclaredField((String) "ORIGINAL");
        ((Field) term864399).setAccessible(true);
        Object enum1860 = ((Field) term864399).get((Object) null);
        Class<? extends Object> term864666 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term864665 = ((Class) term864666).getDeclaredField((String) "NONE");
        ((Field) term864665).setAccessible(true);
        Object enum1861 = ((Field) term864665).get((Object) null);
        term862851 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term862974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term862975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term862979 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term862851, term862851.getClass(), "id", -9133417318192430290L);
        setIntField(term862851, term862851.getClass(), "pdId", 878122723);
        setField(term862851, term862851.getClass(), "playerName", "xxx");
        setIntField(term862851, term862851.getClass(), "vocaloidPoints", 300);
        setIntField(term862851, term862851.getClass(), "level", 1);
        setIntField(term862851, term862851.getClass(), "levelExp", 1612267814);
        setField(term862851, term862851.getClass(), "levelTitle", "xxx");
        setIntField(term862851, term862851.getClass(), "plateId", -1);
        setIntField(term862851, term862851.getClass(), "plateEffectId", -1);
        setField(term862851, term862851.getClass(), "passwordStatus", enum1857);
        setField(term862851, term862851.getClass(), "password", "**********");
        setBooleanField(term862851, term862851.getClass(), "preferPerPvModule", true);
        setBooleanField(term862851, term862851.getClass(), "preferCommonModule", false);
        setBooleanField(term862851, term862851.getClass(), "usePerPvSkin", false);
        setBooleanField(term862851, term862851.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term862851, term862851.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term862851, term862851.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term862851, term862851.getClass(), "usePerPvTouchSliderSe", false);
        setField(term862851, term862851.getClass(), "commonModule", "-999,-999,-999");
        setField(term862851, term862851.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term862975, term862975.getClass(), "year", 2026);
        setShortField(term862975, term862975.getClass(), "month", (short) 6);
        setShortField(term862975, term862975.getClass(), "day", (short) 29);
        setField(term862974, term862974.getClass(), "date", term862975);
        setByteField(term862979, term862979.getClass(), "hour", (byte) 4);
        setByteField(term862979, term862979.getClass(), "minute", (byte) 29);
        setByteField(term862979, term862979.getClass(), "second", (byte) 28);
        setIntField(term862979, term862979.getClass(), "nano", 274013000);
        setField(term862974, term862974.getClass(), "time", term862979);
        setField(term862851, term862851.getClass(), "commonModuleSetTime", term862974);
        setField(term862851, term862851.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term862851, term862851.getClass(), "commonSkin", -1);
        setIntField(term862851, term862851.getClass(), "headphoneVolume", 100);
        setBooleanField(term862851, term862851.getClass(), "buttonSeOn", true);
        setIntField(term862851, term862851.getClass(), "buttonSeVolume", 100);
        setIntField(term862851, term862851.getClass(), "sliderSeVolume", 100);
        setIntField(term862851, term862851.getClass(), "buttonSe", -1);
        setIntField(term862851, term862851.getClass(), "chainSlideSe", -1);
        setIntField(term862851, term862851.getClass(), "slideSe", -1);
        setIntField(term862851, term862851.getClass(), "sliderTouchSe", -1);
        setField(term862851, term862851.getClass(), "sortMode", enum1858);
        setIntField(term862851, term862851.getClass(), "nextPvId", -1);
        setField(term862851, term862851.getClass(), "nextDifficulty", enum1859);
        setField(term862851, term862851.getClass(), "nextEdition", enum1860);
        setBooleanField(term862851, term862851.getClass(), "showInterimRanking", true);
        setBooleanField(term862851, term862851.getClass(), "showClearStatus", true);
        setBooleanField(term862851, term862851.getClass(), "showGreatBorder", true);
        setBooleanField(term862851, term862851.getClass(), "showExcellentBorder", true);
        setBooleanField(term862851, term862851.getClass(), "showRivalBorder", true);
        setBooleanField(term862851, term862851.getClass(), "showRgoSetting", true);
        setBooleanField(term862851, term862851.getClass(), "contestNowPlayingEnable", true);
        setIntField(term862851, term862851.getClass(), "contestNowPlayingId", -1);
        setIntField(term862851, term862851.getClass(), "contestNowPlayingValue", -1);
        setField(term862851, term862851.getClass(), "contestNowPlayingResultRank", enum1861);
        setField(term862851, term862851.getClass(), "contestNowPlayingSpecifier", "");
        setField(term862851, term862851.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term862851, term862851.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term862851, term862851.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term862851, term862851.getClass(), "rivalPdId", -1);
        term863456 = new Integer(634968709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term863456;
        callMethod(klass, "setHeadphoneVolume", argTypes, term862851, args);
    }

};


