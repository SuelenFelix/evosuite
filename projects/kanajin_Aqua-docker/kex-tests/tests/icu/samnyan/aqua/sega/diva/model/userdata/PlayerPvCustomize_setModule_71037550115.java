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

public class PlayerPvCustomize_setModule_71037550115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986392;

    public PlayerPvCustomize_setModule_71037550115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term987138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term987137 = ((Class) term987138).getDeclaredField((String) "MISS");
        ((Field) term987137).setAccessible(true);
        Object enum2095 = ((Field) term987137).get((Object) null);
        Class<? extends Object> term987515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term987514 = ((Class) term987515).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term987514).setAccessible(true);
        Object enum2096 = ((Field) term987514).get((Object) null);
        Class<? extends Object> term987798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term987797 = ((Class) term987798).getDeclaredField((String) "NORMAL");
        ((Field) term987797).setAccessible(true);
        Object enum2097 = ((Field) term987797).get((Object) null);
        Class<? extends Object> term988073 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term988072 = ((Class) term988073).getDeclaredField((String) "ORIGINAL");
        ((Field) term988072).setAccessible(true);
        Object enum2098 = ((Field) term988072).get((Object) null);
        Class<? extends Object> term988339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term988338 = ((Class) term988339).getDeclaredField((String) "NONE");
        ((Field) term988338).setAccessible(true);
        Object enum2099 = ((Field) term988338).get((Object) null);
        term986392 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term986394 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term986517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term986518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term986522 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term986392, term986392.getClass(), "id", -1009485425289165749L);
        setLongField(term986394, term986394.getClass(), "id", -5044181804110715069L);
        setIntField(term986394, term986394.getClass(), "pdId", 835037846);
        setField(term986394, term986394.getClass(), "playerName", "xxx");
        setIntField(term986394, term986394.getClass(), "vocaloidPoints", 300);
        setIntField(term986394, term986394.getClass(), "level", 1);
        setIntField(term986394, term986394.getClass(), "levelExp", 1151852495);
        setField(term986394, term986394.getClass(), "levelTitle", "xxx");
        setIntField(term986394, term986394.getClass(), "plateId", -1);
        setIntField(term986394, term986394.getClass(), "plateEffectId", -1);
        setField(term986394, term986394.getClass(), "passwordStatus", enum2095);
        setField(term986394, term986394.getClass(), "password", "**********");
        setBooleanField(term986394, term986394.getClass(), "preferPerPvModule", true);
        setBooleanField(term986394, term986394.getClass(), "preferCommonModule", false);
        setBooleanField(term986394, term986394.getClass(), "usePerPvSkin", false);
        setBooleanField(term986394, term986394.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term986394, term986394.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term986394, term986394.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term986394, term986394.getClass(), "usePerPvTouchSliderSe", true);
        setField(term986394, term986394.getClass(), "commonModule", "-999,-999,-999");
        setField(term986394, term986394.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term986518, term986518.getClass(), "year", 2026);
        setShortField(term986518, term986518.getClass(), "month", (short) 6);
        setShortField(term986518, term986518.getClass(), "day", (short) 29);
        setField(term986517, term986517.getClass(), "date", term986518);
        setByteField(term986522, term986522.getClass(), "hour", (byte) 4);
        setByteField(term986522, term986522.getClass(), "minute", (byte) 30);
        setByteField(term986522, term986522.getClass(), "second", (byte) 7);
        setIntField(term986522, term986522.getClass(), "nano", 966328000);
        setField(term986517, term986517.getClass(), "time", term986522);
        setField(term986394, term986394.getClass(), "commonModuleSetTime", term986517);
        setField(term986394, term986394.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term986394, term986394.getClass(), "commonSkin", -1);
        setIntField(term986394, term986394.getClass(), "headphoneVolume", 100);
        setBooleanField(term986394, term986394.getClass(), "buttonSeOn", true);
        setIntField(term986394, term986394.getClass(), "buttonSeVolume", 100);
        setIntField(term986394, term986394.getClass(), "sliderSeVolume", 100);
        setIntField(term986394, term986394.getClass(), "buttonSe", -1);
        setIntField(term986394, term986394.getClass(), "chainSlideSe", -1);
        setIntField(term986394, term986394.getClass(), "slideSe", -1);
        setIntField(term986394, term986394.getClass(), "sliderTouchSe", -1);
        setField(term986394, term986394.getClass(), "sortMode", enum2096);
        setIntField(term986394, term986394.getClass(), "nextPvId", -1);
        setField(term986394, term986394.getClass(), "nextDifficulty", enum2097);
        setField(term986394, term986394.getClass(), "nextEdition", enum2098);
        setBooleanField(term986394, term986394.getClass(), "showInterimRanking", true);
        setBooleanField(term986394, term986394.getClass(), "showClearStatus", true);
        setBooleanField(term986394, term986394.getClass(), "showGreatBorder", true);
        setBooleanField(term986394, term986394.getClass(), "showExcellentBorder", true);
        setBooleanField(term986394, term986394.getClass(), "showRivalBorder", true);
        setBooleanField(term986394, term986394.getClass(), "showRgoSetting", true);
        setBooleanField(term986394, term986394.getClass(), "contestNowPlayingEnable", true);
        setIntField(term986394, term986394.getClass(), "contestNowPlayingId", -1);
        setIntField(term986394, term986394.getClass(), "contestNowPlayingValue", -1);
        setField(term986394, term986394.getClass(), "contestNowPlayingResultRank", enum2099);
        setField(term986394, term986394.getClass(), "contestNowPlayingSpecifier", "");
        setField(term986394, term986394.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term986394, term986394.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term986394, term986394.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term986394, term986394.getClass(), "rivalPdId", -1);
        setField(term986392, term986392.getClass(), "pdId", term986394);
        setIntField(term986392, term986392.getClass(), "pvId", -1);
        setField(term986392, term986392.getClass(), "module", "-999,-999,-999");
        setField(term986392, term986392.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term986392, term986392.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term986392, term986392.getClass(), "skin", -1);
        setIntField(term986392, term986392.getClass(), "buttonSe", -1);
        setIntField(term986392, term986392.getClass(), "slideSe", -1);
        setIntField(term986392, term986392.getClass(), "chainSlideSe", -1);
        setIntField(term986392, term986392.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "setModule", argTypes, term986392, args);
    }

};


