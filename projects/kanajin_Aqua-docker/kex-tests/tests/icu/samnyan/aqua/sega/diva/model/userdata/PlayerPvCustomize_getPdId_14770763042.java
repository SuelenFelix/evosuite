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

public class PlayerPvCustomize_getPdId_14770763042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term950482;

    public PlayerPvCustomize_getPdId_14770763042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term951216 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term951215 = ((Class) term951216).getDeclaredField((String) "MISS");
        ((Field) term951215).setAccessible(true);
        Object enum2030 = ((Field) term951215).get((Object) null);
        Class<? extends Object> term951593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term951592 = ((Class) term951593).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term951592).setAccessible(true);
        Object enum2031 = ((Field) term951592).get((Object) null);
        Class<? extends Object> term951876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term951875 = ((Class) term951876).getDeclaredField((String) "NORMAL");
        ((Field) term951875).setAccessible(true);
        Object enum2032 = ((Field) term951875).get((Object) null);
        Class<? extends Object> term952151 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term952150 = ((Class) term952151).getDeclaredField((String) "ORIGINAL");
        ((Field) term952150).setAccessible(true);
        Object enum2033 = ((Field) term952150).get((Object) null);
        Class<? extends Object> term952417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term952416 = ((Class) term952417).getDeclaredField((String) "NONE");
        ((Field) term952416).setAccessible(true);
        Object enum2034 = ((Field) term952416).get((Object) null);
        term950482 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term950484 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term950607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term950608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term950612 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term950482, term950482.getClass(), "id", -7830820957252387854L);
        setLongField(term950484, term950484.getClass(), "id", -8985577692063635272L);
        setIntField(term950484, term950484.getClass(), "pdId", -2002558482);
        setField(term950484, term950484.getClass(), "playerName", "xxx");
        setIntField(term950484, term950484.getClass(), "vocaloidPoints", 300);
        setIntField(term950484, term950484.getClass(), "level", 1);
        setIntField(term950484, term950484.getClass(), "levelExp", 794384312);
        setField(term950484, term950484.getClass(), "levelTitle", "xxx");
        setIntField(term950484, term950484.getClass(), "plateId", -1);
        setIntField(term950484, term950484.getClass(), "plateEffectId", -1);
        setField(term950484, term950484.getClass(), "passwordStatus", enum2030);
        setField(term950484, term950484.getClass(), "password", "**********");
        setBooleanField(term950484, term950484.getClass(), "preferPerPvModule", true);
        setBooleanField(term950484, term950484.getClass(), "preferCommonModule", true);
        setBooleanField(term950484, term950484.getClass(), "usePerPvSkin", true);
        setBooleanField(term950484, term950484.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term950484, term950484.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term950484, term950484.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term950484, term950484.getClass(), "usePerPvTouchSliderSe", false);
        setField(term950484, term950484.getClass(), "commonModule", "-999,-999,-999");
        setField(term950484, term950484.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term950608, term950608.getClass(), "year", 2026);
        setShortField(term950608, term950608.getClass(), "month", (short) 6);
        setShortField(term950608, term950608.getClass(), "day", (short) 29);
        setField(term950607, term950607.getClass(), "date", term950608);
        setByteField(term950612, term950612.getClass(), "hour", (byte) 4);
        setByteField(term950612, term950612.getClass(), "minute", (byte) 30);
        setByteField(term950612, term950612.getClass(), "second", (byte) 4);
        setIntField(term950612, term950612.getClass(), "nano", 620049000);
        setField(term950607, term950607.getClass(), "time", term950612);
        setField(term950484, term950484.getClass(), "commonModuleSetTime", term950607);
        setField(term950484, term950484.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term950484, term950484.getClass(), "commonSkin", -1);
        setIntField(term950484, term950484.getClass(), "headphoneVolume", 100);
        setBooleanField(term950484, term950484.getClass(), "buttonSeOn", true);
        setIntField(term950484, term950484.getClass(), "buttonSeVolume", 100);
        setIntField(term950484, term950484.getClass(), "sliderSeVolume", 100);
        setIntField(term950484, term950484.getClass(), "buttonSe", -1);
        setIntField(term950484, term950484.getClass(), "chainSlideSe", -1);
        setIntField(term950484, term950484.getClass(), "slideSe", -1);
        setIntField(term950484, term950484.getClass(), "sliderTouchSe", -1);
        setField(term950484, term950484.getClass(), "sortMode", enum2031);
        setIntField(term950484, term950484.getClass(), "nextPvId", -1);
        setField(term950484, term950484.getClass(), "nextDifficulty", enum2032);
        setField(term950484, term950484.getClass(), "nextEdition", enum2033);
        setBooleanField(term950484, term950484.getClass(), "showInterimRanking", true);
        setBooleanField(term950484, term950484.getClass(), "showClearStatus", true);
        setBooleanField(term950484, term950484.getClass(), "showGreatBorder", true);
        setBooleanField(term950484, term950484.getClass(), "showExcellentBorder", true);
        setBooleanField(term950484, term950484.getClass(), "showRivalBorder", true);
        setBooleanField(term950484, term950484.getClass(), "showRgoSetting", true);
        setBooleanField(term950484, term950484.getClass(), "contestNowPlayingEnable", true);
        setIntField(term950484, term950484.getClass(), "contestNowPlayingId", -1);
        setIntField(term950484, term950484.getClass(), "contestNowPlayingValue", -1);
        setField(term950484, term950484.getClass(), "contestNowPlayingResultRank", enum2034);
        setField(term950484, term950484.getClass(), "contestNowPlayingSpecifier", "");
        setField(term950484, term950484.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term950484, term950484.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term950484, term950484.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term950484, term950484.getClass(), "rivalPdId", -1);
        setField(term950482, term950482.getClass(), "pdId", term950484);
        setIntField(term950482, term950482.getClass(), "pvId", -1);
        setField(term950482, term950482.getClass(), "module", "-999,-999,-999");
        setField(term950482, term950482.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term950482, term950482.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term950482, term950482.getClass(), "skin", -1);
        setIntField(term950482, term950482.getClass(), "buttonSe", -1);
        setIntField(term950482, term950482.getClass(), "slideSe", -1);
        setIntField(term950482, term950482.getClass(), "chainSlideSe", -1);
        setIntField(term950482, term950482.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term950482, args);
    }

};


