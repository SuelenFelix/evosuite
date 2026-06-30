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
import java.lang.Integer;

public class GameSession_setLastPvId_157892478323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422700;
     Object term423353;

    public GameSession_setLastPvId_157892478323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term423362 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term423361 = ((Class) term423362).getDeclaredField((String) "MISS");
        ((Field) term423361).setAccessible(true);
        Object enum951 = ((Field) term423361).get((Object) null);
        Class<? extends Object> term423739 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term423738 = ((Class) term423739).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term423738).setAccessible(true);
        Object enum952 = ((Field) term423738).get((Object) null);
        Class<? extends Object> term424022 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term424021 = ((Class) term424022).getDeclaredField((String) "NORMAL");
        ((Field) term424021).setAccessible(true);
        Object enum953 = ((Field) term424021).get((Object) null);
        Class<? extends Object> term424297 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term424296 = ((Class) term424297).getDeclaredField((String) "ORIGINAL");
        ((Field) term424296).setAccessible(true);
        Object enum954 = ((Field) term424296).get((Object) null);
        Class<? extends Object> term424563 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term424562 = ((Class) term424563).getDeclaredField((String) "NONE");
        ((Field) term424562).setAccessible(true);
        Object enum955 = ((Field) term424562).get((Object) null);
        Class<? extends Object> term425204 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term425203 = ((Class) term425204).getDeclaredField((String) "START");
        ((Field) term425203).setAccessible(true);
        Object enum956 = ((Field) term425203).get((Object) null);
        Integer term423337 = new Integer(-1970452551);
        Integer term423339 = new Integer(-1896376975);
        Integer term423341 = new Integer(729658803);
        Integer term423343 = new Integer(114754804);
        Integer term423345 = new Integer(1687361082);
        Integer term423347 = new Integer(584893196);
        Integer term423349 = new Integer(497269071);
        Integer term423351 = new Integer(-1899301124);
        term422700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term422703 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term422826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term422827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term422831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term423317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term423318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term423322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term423327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term423328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term423332 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term422700, term422700.getClass(), "id", -2986201902216133814L);
        setIntField(term422700, term422700.getClass(), "acceptId", -1578513908);
        setLongField(term422703, term422703.getClass(), "id", 4255811647459029682L);
        setIntField(term422703, term422703.getClass(), "pdId", 312330930);
        setField(term422703, term422703.getClass(), "playerName", "xxx");
        setIntField(term422703, term422703.getClass(), "vocaloidPoints", 300);
        setIntField(term422703, term422703.getClass(), "level", 1);
        setIntField(term422703, term422703.getClass(), "levelExp", 1635910980);
        setField(term422703, term422703.getClass(), "levelTitle", "xxx");
        setIntField(term422703, term422703.getClass(), "plateId", -1);
        setIntField(term422703, term422703.getClass(), "plateEffectId", -1);
        setField(term422703, term422703.getClass(), "passwordStatus", enum951);
        setField(term422703, term422703.getClass(), "password", "**********");
        setBooleanField(term422703, term422703.getClass(), "preferPerPvModule", true);
        setBooleanField(term422703, term422703.getClass(), "preferCommonModule", false);
        setBooleanField(term422703, term422703.getClass(), "usePerPvSkin", false);
        setBooleanField(term422703, term422703.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term422703, term422703.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term422703, term422703.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term422703, term422703.getClass(), "usePerPvTouchSliderSe", true);
        setField(term422703, term422703.getClass(), "commonModule", "-999,-999,-999");
        setField(term422703, term422703.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term422827, term422827.getClass(), "year", 2026);
        setShortField(term422827, term422827.getClass(), "month", (short) 6);
        setShortField(term422827, term422827.getClass(), "day", (short) 29);
        setField(term422826, term422826.getClass(), "date", term422827);
        setByteField(term422831, term422831.getClass(), "hour", (byte) 4);
        setByteField(term422831, term422831.getClass(), "minute", (byte) 28);
        setByteField(term422831, term422831.getClass(), "second", (byte) 12);
        setIntField(term422831, term422831.getClass(), "nano", 620572000);
        setField(term422826, term422826.getClass(), "time", term422831);
        setField(term422703, term422703.getClass(), "commonModuleSetTime", term422826);
        setField(term422703, term422703.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term422703, term422703.getClass(), "commonSkin", -1);
        setIntField(term422703, term422703.getClass(), "headphoneVolume", 100);
        setBooleanField(term422703, term422703.getClass(), "buttonSeOn", true);
        setIntField(term422703, term422703.getClass(), "buttonSeVolume", 100);
        setIntField(term422703, term422703.getClass(), "sliderSeVolume", 100);
        setIntField(term422703, term422703.getClass(), "buttonSe", -1);
        setIntField(term422703, term422703.getClass(), "chainSlideSe", -1);
        setIntField(term422703, term422703.getClass(), "slideSe", -1);
        setIntField(term422703, term422703.getClass(), "sliderTouchSe", -1);
        setField(term422703, term422703.getClass(), "sortMode", enum952);
        setIntField(term422703, term422703.getClass(), "nextPvId", -1);
        setField(term422703, term422703.getClass(), "nextDifficulty", enum953);
        setField(term422703, term422703.getClass(), "nextEdition", enum954);
        setBooleanField(term422703, term422703.getClass(), "showInterimRanking", true);
        setBooleanField(term422703, term422703.getClass(), "showClearStatus", true);
        setBooleanField(term422703, term422703.getClass(), "showGreatBorder", true);
        setBooleanField(term422703, term422703.getClass(), "showExcellentBorder", true);
        setBooleanField(term422703, term422703.getClass(), "showRivalBorder", true);
        setBooleanField(term422703, term422703.getClass(), "showRgoSetting", true);
        setBooleanField(term422703, term422703.getClass(), "contestNowPlayingEnable", false);
        setIntField(term422703, term422703.getClass(), "contestNowPlayingId", -1);
        setIntField(term422703, term422703.getClass(), "contestNowPlayingValue", -1);
        setField(term422703, term422703.getClass(), "contestNowPlayingResultRank", enum955);
        setField(term422703, term422703.getClass(), "contestNowPlayingSpecifier", "");
        setField(term422703, term422703.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term422703, term422703.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term422703, term422703.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term422703, term422703.getClass(), "rivalPdId", -1);
        setField(term422700, term422700.getClass(), "pdId", term422703);
        setField(term422700, term422700.getClass(), "startMode", enum956);
        setIntField(term423318, term423318.getClass(), "year", 2022);
        setShortField(term423318, term423318.getClass(), "month", (short) 6);
        setShortField(term423318, term423318.getClass(), "day", (short) 12);
        setField(term423317, term423317.getClass(), "date", term423318);
        setByteField(term423322, term423322.getClass(), "hour", (byte) 14);
        setByteField(term423322, term423322.getClass(), "minute", (byte) 3);
        setByteField(term423322, term423322.getClass(), "second", (byte) 7);
        setIntField(term423322, term423322.getClass(), "nano", 637592645);
        setField(term423317, term423317.getClass(), "time", term423322);
        setField(term422700, term422700.getClass(), "startTime", term423317);
        setIntField(term423328, term423328.getClass(), "year", 2023);
        setShortField(term423328, term423328.getClass(), "month", (short) 11);
        setShortField(term423328, term423328.getClass(), "day", (short) 14);
        setField(term423327, term423327.getClass(), "date", term423328);
        setByteField(term423332, term423332.getClass(), "hour", (byte) 15);
        setByteField(term423332, term423332.getClass(), "minute", (byte) 2);
        setByteField(term423332, term423332.getClass(), "second", (byte) 47);
        setIntField(term423332, term423332.getClass(), "nano", 703984770);
        setField(term423327, term423327.getClass(), "time", term423332);
        setField(term422700, term422700.getClass(), "lastUpdateTime", term423327);
        setField(term422700, term422700.getClass(), "stageIndex", term423337);
        setField(term422700, term422700.getClass(), "stageResultIndex", term423339);
        setField(term422700, term422700.getClass(), "lastPvId", term423341);
        setField(term422700, term422700.getClass(), "levelNumber", term423343);
        setField(term422700, term422700.getClass(), "levelExp", term423345);
        setField(term422700, term422700.getClass(), "oldLevelNumber", term423347);
        setField(term422700, term422700.getClass(), "oldLevelExp", term423349);
        setField(term422700, term422700.getClass(), "vp", term423351);
        term423353 = new Integer(-1882480155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term423353;
        callMethod(klass, "setLastPvId", argTypes, term422700, args);
    }

};


