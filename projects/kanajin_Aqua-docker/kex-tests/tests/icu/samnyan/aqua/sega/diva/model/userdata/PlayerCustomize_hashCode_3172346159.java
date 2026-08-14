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

public class PlayerCustomize_hashCode_3172346159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476557;

    public PlayerCustomize_hashCode_3172346159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477172 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term477171 = ((Class) term477172).getDeclaredField((String) "MISS");
        ((Field) term477171).setAccessible(true);
        Object enum1062 = ((Field) term477171).get((Object) null);
        Class<? extends Object> term477549 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term477548 = ((Class) term477549).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term477548).setAccessible(true);
        Object enum1063 = ((Field) term477548).get((Object) null);
        Class<? extends Object> term477832 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term477831 = ((Class) term477832).getDeclaredField((String) "NORMAL");
        ((Field) term477831).setAccessible(true);
        Object enum1064 = ((Field) term477831).get((Object) null);
        Class<? extends Object> term478107 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term478106 = ((Class) term478107).getDeclaredField((String) "ORIGINAL");
        ((Field) term478106).setAccessible(true);
        Object enum1065 = ((Field) term478106).get((Object) null);
        Class<? extends Object> term478373 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term478372 = ((Class) term478373).getDeclaredField((String) "NONE");
        ((Field) term478372).setAccessible(true);
        Object enum1066 = ((Field) term478372).get((Object) null);
        term476557 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term476559 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term476682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term476683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term476687 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term476557, term476557.getClass(), "id", 2022482096970820459L);
        setLongField(term476559, term476559.getClass(), "id", 6315101499811179240L);
        setIntField(term476559, term476559.getClass(), "pdId", -580180892);
        setField(term476559, term476559.getClass(), "playerName", "xxx");
        setIntField(term476559, term476559.getClass(), "vocaloidPoints", 300);
        setIntField(term476559, term476559.getClass(), "level", 1);
        setIntField(term476559, term476559.getClass(), "levelExp", 862135498);
        setField(term476559, term476559.getClass(), "levelTitle", "xxx");
        setIntField(term476559, term476559.getClass(), "plateId", -1);
        setIntField(term476559, term476559.getClass(), "plateEffectId", -1);
        setField(term476559, term476559.getClass(), "passwordStatus", enum1062);
        setField(term476559, term476559.getClass(), "password", "**********");
        setBooleanField(term476559, term476559.getClass(), "preferPerPvModule", true);
        setBooleanField(term476559, term476559.getClass(), "preferCommonModule", false);
        setBooleanField(term476559, term476559.getClass(), "usePerPvSkin", false);
        setBooleanField(term476559, term476559.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term476559, term476559.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term476559, term476559.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term476559, term476559.getClass(), "usePerPvTouchSliderSe", true);
        setField(term476559, term476559.getClass(), "commonModule", "-999,-999,-999");
        setField(term476559, term476559.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term476683, term476683.getClass(), "year", 2026);
        setShortField(term476683, term476683.getClass(), "month", (short) 8);
        setShortField(term476683, term476683.getClass(), "day", (short) 12);
        setField(term476682, term476682.getClass(), "date", term476683);
        setByteField(term476687, term476687.getClass(), "hour", (byte) 2);
        setByteField(term476687, term476687.getClass(), "minute", (byte) 3);
        setByteField(term476687, term476687.getClass(), "second", (byte) 41);
        setIntField(term476687, term476687.getClass(), "nano", 127945000);
        setField(term476682, term476682.getClass(), "time", term476687);
        setField(term476559, term476559.getClass(), "commonModuleSetTime", term476682);
        setField(term476559, term476559.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term476559, term476559.getClass(), "commonSkin", -1);
        setIntField(term476559, term476559.getClass(), "headphoneVolume", 100);
        setBooleanField(term476559, term476559.getClass(), "buttonSeOn", true);
        setIntField(term476559, term476559.getClass(), "buttonSeVolume", 100);
        setIntField(term476559, term476559.getClass(), "sliderSeVolume", 100);
        setIntField(term476559, term476559.getClass(), "buttonSe", -1);
        setIntField(term476559, term476559.getClass(), "chainSlideSe", -1);
        setIntField(term476559, term476559.getClass(), "slideSe", -1);
        setIntField(term476559, term476559.getClass(), "sliderTouchSe", -1);
        setField(term476559, term476559.getClass(), "sortMode", enum1063);
        setIntField(term476559, term476559.getClass(), "nextPvId", -1);
        setField(term476559, term476559.getClass(), "nextDifficulty", enum1064);
        setField(term476559, term476559.getClass(), "nextEdition", enum1065);
        setBooleanField(term476559, term476559.getClass(), "showInterimRanking", true);
        setBooleanField(term476559, term476559.getClass(), "showClearStatus", true);
        setBooleanField(term476559, term476559.getClass(), "showGreatBorder", true);
        setBooleanField(term476559, term476559.getClass(), "showExcellentBorder", true);
        setBooleanField(term476559, term476559.getClass(), "showRivalBorder", true);
        setBooleanField(term476559, term476559.getClass(), "showRgoSetting", true);
        setBooleanField(term476559, term476559.getClass(), "contestNowPlayingEnable", false);
        setIntField(term476559, term476559.getClass(), "contestNowPlayingId", -1);
        setIntField(term476559, term476559.getClass(), "contestNowPlayingValue", -1);
        setField(term476559, term476559.getClass(), "contestNowPlayingResultRank", enum1066);
        setField(term476559, term476559.getClass(), "contestNowPlayingSpecifier", "");
        setField(term476559, term476559.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term476559, term476559.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term476559, term476559.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term476559, term476559.getClass(), "rivalPdId", -1);
        setField(term476557, term476557.getClass(), "pdId", term476559);
        setIntField(term476557, term476557.getClass(), "customizeId", -1640521852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term476557, args);
    }

};


