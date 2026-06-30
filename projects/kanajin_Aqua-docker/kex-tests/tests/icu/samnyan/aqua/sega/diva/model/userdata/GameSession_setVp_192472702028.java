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

public class GameSession_setVp_192472702028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436598;
     Object term437260;

    public GameSession_setVp_192472702028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term437269 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term437268 = ((Class) term437269).getDeclaredField((String) "MISS");
        ((Field) term437268).setAccessible(true);
        Object enum981 = ((Field) term437268).get((Object) null);
        Class<? extends Object> term437646 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term437645 = ((Class) term437646).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term437645).setAccessible(true);
        Object enum982 = ((Field) term437645).get((Object) null);
        Class<? extends Object> term437929 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term437928 = ((Class) term437929).getDeclaredField((String) "NORMAL");
        ((Field) term437928).setAccessible(true);
        Object enum983 = ((Field) term437928).get((Object) null);
        Class<? extends Object> term438204 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term438203 = ((Class) term438204).getDeclaredField((String) "ORIGINAL");
        ((Field) term438203).setAccessible(true);
        Object enum984 = ((Field) term438203).get((Object) null);
        Class<? extends Object> term438470 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term438469 = ((Class) term438470).getDeclaredField((String) "NONE");
        ((Field) term438469).setAccessible(true);
        Object enum985 = ((Field) term438469).get((Object) null);
        Class<? extends Object> term439111 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term439110 = ((Class) term439111).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term439110).setAccessible(true);
        Object enum986 = ((Field) term439110).get((Object) null);
        Integer term437244 = new Integer(-860131894);
        Integer term437246 = new Integer(-1022990421);
        Integer term437248 = new Integer(1045547089);
        Integer term437250 = new Integer(-1122880881);
        Integer term437252 = new Integer(-542712742);
        Integer term437254 = new Integer(-1254072822);
        Integer term437256 = new Integer(-1111249833);
        Integer term437258 = new Integer(-1692331299);
        term436598 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term436601 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term436724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term436725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term436729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term437224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term437225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term437229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term437234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term437235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term437239 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term436598, term436598.getClass(), "id", -6685235643232255177L);
        setIntField(term436598, term436598.getClass(), "acceptId", 36785954);
        setLongField(term436601, term436601.getClass(), "id", -5656664340499957324L);
        setIntField(term436601, term436601.getClass(), "pdId", -907057089);
        setField(term436601, term436601.getClass(), "playerName", "xxx");
        setIntField(term436601, term436601.getClass(), "vocaloidPoints", 300);
        setIntField(term436601, term436601.getClass(), "level", 1);
        setIntField(term436601, term436601.getClass(), "levelExp", -1740998635);
        setField(term436601, term436601.getClass(), "levelTitle", "xxx");
        setIntField(term436601, term436601.getClass(), "plateId", -1);
        setIntField(term436601, term436601.getClass(), "plateEffectId", -1);
        setField(term436601, term436601.getClass(), "passwordStatus", enum981);
        setField(term436601, term436601.getClass(), "password", "**********");
        setBooleanField(term436601, term436601.getClass(), "preferPerPvModule", true);
        setBooleanField(term436601, term436601.getClass(), "preferCommonModule", false);
        setBooleanField(term436601, term436601.getClass(), "usePerPvSkin", false);
        setBooleanField(term436601, term436601.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term436601, term436601.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term436601, term436601.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term436601, term436601.getClass(), "usePerPvTouchSliderSe", false);
        setField(term436601, term436601.getClass(), "commonModule", "-999,-999,-999");
        setField(term436601, term436601.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term436725, term436725.getClass(), "year", 2026);
        setShortField(term436725, term436725.getClass(), "month", (short) 6);
        setShortField(term436725, term436725.getClass(), "day", (short) 29);
        setField(term436724, term436724.getClass(), "date", term436725);
        setByteField(term436729, term436729.getClass(), "hour", (byte) 4);
        setByteField(term436729, term436729.getClass(), "minute", (byte) 28);
        setByteField(term436729, term436729.getClass(), "second", (byte) 13);
        setIntField(term436729, term436729.getClass(), "nano", 895502000);
        setField(term436724, term436724.getClass(), "time", term436729);
        setField(term436601, term436601.getClass(), "commonModuleSetTime", term436724);
        setField(term436601, term436601.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term436601, term436601.getClass(), "commonSkin", -1);
        setIntField(term436601, term436601.getClass(), "headphoneVolume", 100);
        setBooleanField(term436601, term436601.getClass(), "buttonSeOn", true);
        setIntField(term436601, term436601.getClass(), "buttonSeVolume", 100);
        setIntField(term436601, term436601.getClass(), "sliderSeVolume", 100);
        setIntField(term436601, term436601.getClass(), "buttonSe", -1);
        setIntField(term436601, term436601.getClass(), "chainSlideSe", -1);
        setIntField(term436601, term436601.getClass(), "slideSe", -1);
        setIntField(term436601, term436601.getClass(), "sliderTouchSe", -1);
        setField(term436601, term436601.getClass(), "sortMode", enum982);
        setIntField(term436601, term436601.getClass(), "nextPvId", -1);
        setField(term436601, term436601.getClass(), "nextDifficulty", enum983);
        setField(term436601, term436601.getClass(), "nextEdition", enum984);
        setBooleanField(term436601, term436601.getClass(), "showInterimRanking", true);
        setBooleanField(term436601, term436601.getClass(), "showClearStatus", true);
        setBooleanField(term436601, term436601.getClass(), "showGreatBorder", true);
        setBooleanField(term436601, term436601.getClass(), "showExcellentBorder", true);
        setBooleanField(term436601, term436601.getClass(), "showRivalBorder", true);
        setBooleanField(term436601, term436601.getClass(), "showRgoSetting", true);
        setBooleanField(term436601, term436601.getClass(), "contestNowPlayingEnable", false);
        setIntField(term436601, term436601.getClass(), "contestNowPlayingId", -1);
        setIntField(term436601, term436601.getClass(), "contestNowPlayingValue", -1);
        setField(term436601, term436601.getClass(), "contestNowPlayingResultRank", enum985);
        setField(term436601, term436601.getClass(), "contestNowPlayingSpecifier", "");
        setField(term436601, term436601.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term436601, term436601.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term436601, term436601.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term436601, term436601.getClass(), "rivalPdId", -1);
        setField(term436598, term436598.getClass(), "pdId", term436601);
        setField(term436598, term436598.getClass(), "startMode", enum986);
        setIntField(term437225, term437225.getClass(), "year", 2020);
        setShortField(term437225, term437225.getClass(), "month", (short) 10);
        setShortField(term437225, term437225.getClass(), "day", (short) 26);
        setField(term437224, term437224.getClass(), "date", term437225);
        setByteField(term437229, term437229.getClass(), "hour", (byte) 10);
        setByteField(term437229, term437229.getClass(), "minute", (byte) 50);
        setByteField(term437229, term437229.getClass(), "second", (byte) 16);
        setIntField(term437229, term437229.getClass(), "nano", 613429);
        setField(term437224, term437224.getClass(), "time", term437229);
        setField(term436598, term436598.getClass(), "startTime", term437224);
        setIntField(term437235, term437235.getClass(), "year", 2018);
        setShortField(term437235, term437235.getClass(), "month", (short) 5);
        setShortField(term437235, term437235.getClass(), "day", (short) 22);
        setField(term437234, term437234.getClass(), "date", term437235);
        setByteField(term437239, term437239.getClass(), "hour", (byte) 16);
        setByteField(term437239, term437239.getClass(), "minute", (byte) 46);
        setByteField(term437239, term437239.getClass(), "second", (byte) 48);
        setIntField(term437239, term437239.getClass(), "nano", 72983043);
        setField(term437234, term437234.getClass(), "time", term437239);
        setField(term436598, term436598.getClass(), "lastUpdateTime", term437234);
        setField(term436598, term436598.getClass(), "stageIndex", term437244);
        setField(term436598, term436598.getClass(), "stageResultIndex", term437246);
        setField(term436598, term436598.getClass(), "lastPvId", term437248);
        setField(term436598, term436598.getClass(), "levelNumber", term437250);
        setField(term436598, term436598.getClass(), "levelExp", term437252);
        setField(term436598, term436598.getClass(), "oldLevelNumber", term437254);
        setField(term436598, term436598.getClass(), "oldLevelExp", term437256);
        setField(term436598, term436598.getClass(), "vp", term437258);
        term437260 = new Integer(479531250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term437260;
        callMethod(klass, "setVp", argTypes, term436598, args);
    }

};


