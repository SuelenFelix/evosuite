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

public class PlayerCustomize_canEqual_9356146898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474100;
     Object term474708;

    public PlayerCustomize_canEqual_9356146898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term474716 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term474715 = ((Class) term474716).getDeclaredField((String) "MISS");
        ((Field) term474715).setAccessible(true);
        Object enum1057 = ((Field) term474715).get((Object) null);
        Class<? extends Object> term475093 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term475092 = ((Class) term475093).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term475092).setAccessible(true);
        Object enum1058 = ((Field) term475092).get((Object) null);
        Class<? extends Object> term475376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term475375 = ((Class) term475376).getDeclaredField((String) "NORMAL");
        ((Field) term475375).setAccessible(true);
        Object enum1059 = ((Field) term475375).get((Object) null);
        Class<? extends Object> term475651 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term475650 = ((Class) term475651).getDeclaredField((String) "ORIGINAL");
        ((Field) term475650).setAccessible(true);
        Object enum1060 = ((Field) term475650).get((Object) null);
        Class<? extends Object> term475917 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term475916 = ((Class) term475917).getDeclaredField((String) "NONE");
        ((Field) term475916).setAccessible(true);
        Object enum1061 = ((Field) term475916).get((Object) null);
        term474100 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term474102 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term474225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term474226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term474230 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term474100, term474100.getClass(), "id", 4689907154423223972L);
        setLongField(term474102, term474102.getClass(), "id", 8512025621149521819L);
        setIntField(term474102, term474102.getClass(), "pdId", 1013816325);
        setField(term474102, term474102.getClass(), "playerName", "xxx");
        setIntField(term474102, term474102.getClass(), "vocaloidPoints", 300);
        setIntField(term474102, term474102.getClass(), "level", 1);
        setIntField(term474102, term474102.getClass(), "levelExp", -756785345);
        setField(term474102, term474102.getClass(), "levelTitle", "xxx");
        setIntField(term474102, term474102.getClass(), "plateId", -1);
        setIntField(term474102, term474102.getClass(), "plateEffectId", -1);
        setField(term474102, term474102.getClass(), "passwordStatus", enum1057);
        setField(term474102, term474102.getClass(), "password", "**********");
        setBooleanField(term474102, term474102.getClass(), "preferPerPvModule", true);
        setBooleanField(term474102, term474102.getClass(), "preferCommonModule", false);
        setBooleanField(term474102, term474102.getClass(), "usePerPvSkin", false);
        setBooleanField(term474102, term474102.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term474102, term474102.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term474102, term474102.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term474102, term474102.getClass(), "usePerPvTouchSliderSe", false);
        setField(term474102, term474102.getClass(), "commonModule", "-999,-999,-999");
        setField(term474102, term474102.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term474226, term474226.getClass(), "year", 2026);
        setShortField(term474226, term474226.getClass(), "month", (short) 8);
        setShortField(term474226, term474226.getClass(), "day", (short) 12);
        setField(term474225, term474225.getClass(), "date", term474226);
        setByteField(term474230, term474230.getClass(), "hour", (byte) 2);
        setByteField(term474230, term474230.getClass(), "minute", (byte) 3);
        setByteField(term474230, term474230.getClass(), "second", (byte) 40);
        setIntField(term474230, term474230.getClass(), "nano", 880838000);
        setField(term474225, term474225.getClass(), "time", term474230);
        setField(term474102, term474102.getClass(), "commonModuleSetTime", term474225);
        setField(term474102, term474102.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term474102, term474102.getClass(), "commonSkin", -1);
        setIntField(term474102, term474102.getClass(), "headphoneVolume", 100);
        setBooleanField(term474102, term474102.getClass(), "buttonSeOn", true);
        setIntField(term474102, term474102.getClass(), "buttonSeVolume", 100);
        setIntField(term474102, term474102.getClass(), "sliderSeVolume", 100);
        setIntField(term474102, term474102.getClass(), "buttonSe", -1);
        setIntField(term474102, term474102.getClass(), "chainSlideSe", -1);
        setIntField(term474102, term474102.getClass(), "slideSe", -1);
        setIntField(term474102, term474102.getClass(), "sliderTouchSe", -1);
        setField(term474102, term474102.getClass(), "sortMode", enum1058);
        setIntField(term474102, term474102.getClass(), "nextPvId", -1);
        setField(term474102, term474102.getClass(), "nextDifficulty", enum1059);
        setField(term474102, term474102.getClass(), "nextEdition", enum1060);
        setBooleanField(term474102, term474102.getClass(), "showInterimRanking", true);
        setBooleanField(term474102, term474102.getClass(), "showClearStatus", true);
        setBooleanField(term474102, term474102.getClass(), "showGreatBorder", true);
        setBooleanField(term474102, term474102.getClass(), "showExcellentBorder", true);
        setBooleanField(term474102, term474102.getClass(), "showRivalBorder", true);
        setBooleanField(term474102, term474102.getClass(), "showRgoSetting", true);
        setBooleanField(term474102, term474102.getClass(), "contestNowPlayingEnable", false);
        setIntField(term474102, term474102.getClass(), "contestNowPlayingId", -1);
        setIntField(term474102, term474102.getClass(), "contestNowPlayingValue", -1);
        setField(term474102, term474102.getClass(), "contestNowPlayingResultRank", enum1061);
        setField(term474102, term474102.getClass(), "contestNowPlayingSpecifier", "");
        setField(term474102, term474102.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term474102, term474102.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term474102, term474102.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term474102, term474102.getClass(), "rivalPdId", -1);
        setField(term474100, term474100.getClass(), "pdId", term474102);
        setIntField(term474100, term474100.getClass(), "customizeId", -1077451707);
        term474708 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term474708;
        callMethod(klass, "canEqual", argTypes, term474100, args);
    }

};


