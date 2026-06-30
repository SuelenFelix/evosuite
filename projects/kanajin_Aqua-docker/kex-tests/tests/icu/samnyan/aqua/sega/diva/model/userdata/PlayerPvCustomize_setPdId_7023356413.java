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

public class PlayerPvCustomize_setPdId_7023356413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979997;
     Object term980724;

    public PlayerPvCustomize_setPdId_7023356413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term981277 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term981276 = ((Class) term981277).getDeclaredField((String) "MISS");
        ((Field) term981276).setAccessible(true);
        Object enum2085 = ((Field) term981276).get((Object) null);
        Class<? extends Object> term981654 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term981653 = ((Class) term981654).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term981653).setAccessible(true);
        Object enum2086 = ((Field) term981653).get((Object) null);
        Class<? extends Object> term981937 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term981936 = ((Class) term981937).getDeclaredField((String) "NORMAL");
        ((Field) term981936).setAccessible(true);
        Object enum2087 = ((Field) term981936).get((Object) null);
        Class<? extends Object> term982212 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term982211 = ((Class) term982212).getDeclaredField((String) "ORIGINAL");
        ((Field) term982211).setAccessible(true);
        Object enum2088 = ((Field) term982211).get((Object) null);
        Class<? extends Object> term982478 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term982477 = ((Class) term982478).getDeclaredField((String) "NONE");
        ((Field) term982477).setAccessible(true);
        Object enum2089 = ((Field) term982477).get((Object) null);
        term979997 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term979999 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term980122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term980123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term980127 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term979997, term979997.getClass(), "id", 7875739215674729968L);
        setLongField(term979999, term979999.getClass(), "id", -8605430501912680279L);
        setIntField(term979999, term979999.getClass(), "pdId", -1283714004);
        setField(term979999, term979999.getClass(), "playerName", "xxx");
        setIntField(term979999, term979999.getClass(), "vocaloidPoints", 300);
        setIntField(term979999, term979999.getClass(), "level", 1);
        setIntField(term979999, term979999.getClass(), "levelExp", -1085038483);
        setField(term979999, term979999.getClass(), "levelTitle", "xxx");
        setIntField(term979999, term979999.getClass(), "plateId", -1);
        setIntField(term979999, term979999.getClass(), "plateEffectId", -1);
        setField(term979999, term979999.getClass(), "passwordStatus", enum2085);
        setField(term979999, term979999.getClass(), "password", "**********");
        setBooleanField(term979999, term979999.getClass(), "preferPerPvModule", true);
        setBooleanField(term979999, term979999.getClass(), "preferCommonModule", true);
        setBooleanField(term979999, term979999.getClass(), "usePerPvSkin", false);
        setBooleanField(term979999, term979999.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term979999, term979999.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term979999, term979999.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term979999, term979999.getClass(), "usePerPvTouchSliderSe", false);
        setField(term979999, term979999.getClass(), "commonModule", "-999,-999,-999");
        setField(term979999, term979999.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term980123, term980123.getClass(), "year", 2026);
        setShortField(term980123, term980123.getClass(), "month", (short) 6);
        setShortField(term980123, term980123.getClass(), "day", (short) 29);
        setField(term980122, term980122.getClass(), "date", term980123);
        setByteField(term980127, term980127.getClass(), "hour", (byte) 4);
        setByteField(term980127, term980127.getClass(), "minute", (byte) 30);
        setByteField(term980127, term980127.getClass(), "second", (byte) 7);
        setIntField(term980127, term980127.getClass(), "nano", 449324000);
        setField(term980122, term980122.getClass(), "time", term980127);
        setField(term979999, term979999.getClass(), "commonModuleSetTime", term980122);
        setField(term979999, term979999.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term979999, term979999.getClass(), "commonSkin", -1);
        setIntField(term979999, term979999.getClass(), "headphoneVolume", 100);
        setBooleanField(term979999, term979999.getClass(), "buttonSeOn", true);
        setIntField(term979999, term979999.getClass(), "buttonSeVolume", 100);
        setIntField(term979999, term979999.getClass(), "sliderSeVolume", 100);
        setIntField(term979999, term979999.getClass(), "buttonSe", -1);
        setIntField(term979999, term979999.getClass(), "chainSlideSe", -1);
        setIntField(term979999, term979999.getClass(), "slideSe", -1);
        setIntField(term979999, term979999.getClass(), "sliderTouchSe", -1);
        setField(term979999, term979999.getClass(), "sortMode", enum2086);
        setIntField(term979999, term979999.getClass(), "nextPvId", -1);
        setField(term979999, term979999.getClass(), "nextDifficulty", enum2087);
        setField(term979999, term979999.getClass(), "nextEdition", enum2088);
        setBooleanField(term979999, term979999.getClass(), "showInterimRanking", true);
        setBooleanField(term979999, term979999.getClass(), "showClearStatus", true);
        setBooleanField(term979999, term979999.getClass(), "showGreatBorder", true);
        setBooleanField(term979999, term979999.getClass(), "showExcellentBorder", true);
        setBooleanField(term979999, term979999.getClass(), "showRivalBorder", true);
        setBooleanField(term979999, term979999.getClass(), "showRgoSetting", true);
        setBooleanField(term979999, term979999.getClass(), "contestNowPlayingEnable", true);
        setIntField(term979999, term979999.getClass(), "contestNowPlayingId", -1);
        setIntField(term979999, term979999.getClass(), "contestNowPlayingValue", -1);
        setField(term979999, term979999.getClass(), "contestNowPlayingResultRank", enum2089);
        setField(term979999, term979999.getClass(), "contestNowPlayingSpecifier", "");
        setField(term979999, term979999.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term979999, term979999.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term979999, term979999.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term979999, term979999.getClass(), "rivalPdId", -1);
        setField(term979997, term979997.getClass(), "pdId", term979999);
        setIntField(term979997, term979997.getClass(), "pvId", -1);
        setField(term979997, term979997.getClass(), "module", "-999,-999,-999");
        setField(term979997, term979997.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term979997, term979997.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term979997, term979997.getClass(), "skin", -1);
        setIntField(term979997, term979997.getClass(), "buttonSe", -1);
        setIntField(term979997, term979997.getClass(), "slideSe", -1);
        setIntField(term979997, term979997.getClass(), "chainSlideSe", -1);
        setIntField(term979997, term979997.getClass(), "sliderTouchSe", -1);
        term980724 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term980838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term980839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term980843 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term980724, term980724.getClass(), "id", 2985226914509512766L);
        setIntField(term980724, term980724.getClass(), "pdId", 1089796055);
        setField(term980724, term980724.getClass(), "playerName", "xxx");
        setIntField(term980724, term980724.getClass(), "vocaloidPoints", 300);
        setIntField(term980724, term980724.getClass(), "level", 1);
        setIntField(term980724, term980724.getClass(), "levelExp", -456321892);
        setField(term980724, term980724.getClass(), "levelTitle", "xxx");
        setIntField(term980724, term980724.getClass(), "plateId", -1);
        setIntField(term980724, term980724.getClass(), "plateEffectId", -1);
        setField(term980724, term980724.getClass(), "passwordStatus", enum2085);
        setField(term980724, term980724.getClass(), "password", "**********");
        setBooleanField(term980724, term980724.getClass(), "preferPerPvModule", true);
        setBooleanField(term980724, term980724.getClass(), "preferCommonModule", true);
        setBooleanField(term980724, term980724.getClass(), "usePerPvSkin", false);
        setBooleanField(term980724, term980724.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term980724, term980724.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term980724, term980724.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term980724, term980724.getClass(), "usePerPvTouchSliderSe", false);
        setField(term980724, term980724.getClass(), "commonModule", "-999,-999,-999");
        setField(term980724, term980724.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term980839, term980839.getClass(), "year", 2026);
        setShortField(term980839, term980839.getClass(), "month", (short) 6);
        setShortField(term980839, term980839.getClass(), "day", (short) 29);
        setField(term980838, term980838.getClass(), "date", term980839);
        setByteField(term980843, term980843.getClass(), "hour", (byte) 4);
        setByteField(term980843, term980843.getClass(), "minute", (byte) 30);
        setByteField(term980843, term980843.getClass(), "second", (byte) 7);
        setIntField(term980843, term980843.getClass(), "nano", 449767000);
        setField(term980838, term980838.getClass(), "time", term980843);
        setField(term980724, term980724.getClass(), "commonModuleSetTime", term980838);
        setField(term980724, term980724.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term980724, term980724.getClass(), "commonSkin", -1);
        setIntField(term980724, term980724.getClass(), "headphoneVolume", 100);
        setBooleanField(term980724, term980724.getClass(), "buttonSeOn", true);
        setIntField(term980724, term980724.getClass(), "buttonSeVolume", 100);
        setIntField(term980724, term980724.getClass(), "sliderSeVolume", 100);
        setIntField(term980724, term980724.getClass(), "buttonSe", -1);
        setIntField(term980724, term980724.getClass(), "chainSlideSe", -1);
        setIntField(term980724, term980724.getClass(), "slideSe", -1);
        setIntField(term980724, term980724.getClass(), "sliderTouchSe", -1);
        setField(term980724, term980724.getClass(), "sortMode", enum2086);
        setIntField(term980724, term980724.getClass(), "nextPvId", -1);
        setField(term980724, term980724.getClass(), "nextDifficulty", enum2087);
        setField(term980724, term980724.getClass(), "nextEdition", enum2088);
        setBooleanField(term980724, term980724.getClass(), "showInterimRanking", true);
        setBooleanField(term980724, term980724.getClass(), "showClearStatus", true);
        setBooleanField(term980724, term980724.getClass(), "showGreatBorder", true);
        setBooleanField(term980724, term980724.getClass(), "showExcellentBorder", true);
        setBooleanField(term980724, term980724.getClass(), "showRivalBorder", true);
        setBooleanField(term980724, term980724.getClass(), "showRgoSetting", true);
        setBooleanField(term980724, term980724.getClass(), "contestNowPlayingEnable", true);
        setIntField(term980724, term980724.getClass(), "contestNowPlayingId", -1);
        setIntField(term980724, term980724.getClass(), "contestNowPlayingValue", -1);
        setField(term980724, term980724.getClass(), "contestNowPlayingResultRank", enum2089);
        setField(term980724, term980724.getClass(), "contestNowPlayingSpecifier", "");
        setField(term980724, term980724.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term980724, term980724.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term980724, term980724.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term980724, term980724.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term980724;
        callMethod(klass, "setPdId", argTypes, term979997, args);
    }

};


