package icu.samnyan.aqua.sega.diva.service;

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
import static icu.samnyan.aqua.sega.diva.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerModuleService_buy_3774349610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8245;
     Object term8850;

    public PlayerModuleService_buy_3774349610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term8858 = ((Class) term8859).getDeclaredField((String) "MISS");
        ((Field) term8858).setAccessible(true);
        Object enum15 = ((Field) term8858).get((Object) null);
        Class<? extends Object> term9236 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term9235 = ((Class) term9236).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term9235).setAccessible(true);
        Object enum16 = ((Field) term9235).get((Object) null);
        Class<? extends Object> term9519 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term9518 = ((Class) term9519).getDeclaredField((String) "NORMAL");
        ((Field) term9518).setAccessible(true);
        Object enum17 = ((Field) term9518).get((Object) null);
        Class<? extends Object> term9794 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term9793 = ((Class) term9794).getDeclaredField((String) "ORIGINAL");
        ((Field) term9793).setAccessible(true);
        Object enum18 = ((Field) term9793).get((Object) null);
        Class<? extends Object> term10060 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term10059 = ((Class) term10060).getDeclaredField((String) "NONE");
        ((Field) term10059).setAccessible(true);
        Object enum19 = ((Field) term10059).get((Object) null);
        term8245 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term8368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8245, term8245.getClass(), "id", -8400487765614892086L);
        setIntField(term8245, term8245.getClass(), "pdId", -1339778481);
        setField(term8245, term8245.getClass(), "playerName", "xxx");
        setIntField(term8245, term8245.getClass(), "vocaloidPoints", 300);
        setIntField(term8245, term8245.getClass(), "level", 1);
        setIntField(term8245, term8245.getClass(), "levelExp", 1725571209);
        setField(term8245, term8245.getClass(), "levelTitle", "xxx");
        setIntField(term8245, term8245.getClass(), "plateId", -1);
        setIntField(term8245, term8245.getClass(), "plateEffectId", -1);
        setField(term8245, term8245.getClass(), "passwordStatus", enum15);
        setField(term8245, term8245.getClass(), "password", "**********");
        setBooleanField(term8245, term8245.getClass(), "preferPerPvModule", true);
        setBooleanField(term8245, term8245.getClass(), "preferCommonModule", true);
        setBooleanField(term8245, term8245.getClass(), "usePerPvSkin", true);
        setBooleanField(term8245, term8245.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term8245, term8245.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term8245, term8245.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term8245, term8245.getClass(), "usePerPvTouchSliderSe", false);
        setField(term8245, term8245.getClass(), "commonModule", "-999,-999,-999");
        setField(term8245, term8245.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term8369, term8369.getClass(), "year", 2026);
        setShortField(term8369, term8369.getClass(), "month", (short) 6);
        setShortField(term8369, term8369.getClass(), "day", (short) 29);
        setField(term8368, term8368.getClass(), "date", term8369);
        setByteField(term8373, term8373.getClass(), "hour", (byte) 4);
        setByteField(term8373, term8373.getClass(), "minute", (byte) 32);
        setByteField(term8373, term8373.getClass(), "second", (byte) 4);
        setIntField(term8373, term8373.getClass(), "nano", 215591000);
        setField(term8368, term8368.getClass(), "time", term8373);
        setField(term8245, term8245.getClass(), "commonModuleSetTime", term8368);
        setField(term8245, term8245.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term8245, term8245.getClass(), "commonSkin", -1);
        setIntField(term8245, term8245.getClass(), "headphoneVolume", 100);
        setBooleanField(term8245, term8245.getClass(), "buttonSeOn", true);
        setIntField(term8245, term8245.getClass(), "buttonSeVolume", 100);
        setIntField(term8245, term8245.getClass(), "sliderSeVolume", 100);
        setIntField(term8245, term8245.getClass(), "buttonSe", -1);
        setIntField(term8245, term8245.getClass(), "chainSlideSe", -1);
        setIntField(term8245, term8245.getClass(), "slideSe", -1);
        setIntField(term8245, term8245.getClass(), "sliderTouchSe", -1);
        setField(term8245, term8245.getClass(), "sortMode", enum16);
        setIntField(term8245, term8245.getClass(), "nextPvId", -1);
        setField(term8245, term8245.getClass(), "nextDifficulty", enum17);
        setField(term8245, term8245.getClass(), "nextEdition", enum18);
        setBooleanField(term8245, term8245.getClass(), "showInterimRanking", true);
        setBooleanField(term8245, term8245.getClass(), "showClearStatus", true);
        setBooleanField(term8245, term8245.getClass(), "showGreatBorder", true);
        setBooleanField(term8245, term8245.getClass(), "showExcellentBorder", true);
        setBooleanField(term8245, term8245.getClass(), "showRivalBorder", true);
        setBooleanField(term8245, term8245.getClass(), "showRgoSetting", true);
        setBooleanField(term8245, term8245.getClass(), "contestNowPlayingEnable", false);
        setIntField(term8245, term8245.getClass(), "contestNowPlayingId", -1);
        setIntField(term8245, term8245.getClass(), "contestNowPlayingValue", -1);
        setField(term8245, term8245.getClass(), "contestNowPlayingResultRank", enum19);
        setField(term8245, term8245.getClass(), "contestNowPlayingSpecifier", "");
        setField(term8245, term8245.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term8245, term8245.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term8245, term8245.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term8245, term8245.getClass(), "rivalPdId", -1);
        term8850 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerModuleService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8245;
        args[1] = term8850;
        callMethod(klass, "buy", argTypes, null, args);
    }

};


