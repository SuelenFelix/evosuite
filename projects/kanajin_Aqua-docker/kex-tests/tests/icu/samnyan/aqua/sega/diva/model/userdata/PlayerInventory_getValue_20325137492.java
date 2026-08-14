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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_getValue_20325137492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535519;

    public PlayerInventory_getValue_20325137492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term535520 = new Long(-8257434502486459194L);
        Class<? extends Object> term536158 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term536157 = ((Class) term536158).getDeclaredField((String) "MISS");
        ((Field) term536157).setAccessible(true);
        Object enum1177 = ((Field) term536157).get((Object) null);
        Class<? extends Object> term536535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term536534 = ((Class) term536535).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term536534).setAccessible(true);
        Object enum1178 = ((Field) term536534).get((Object) null);
        Class<? extends Object> term536818 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term536817 = ((Class) term536818).getDeclaredField((String) "NORMAL");
        ((Field) term536817).setAccessible(true);
        Object enum1179 = ((Field) term536817).get((Object) null);
        Class<? extends Object> term537093 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term537092 = ((Class) term537093).getDeclaredField((String) "ORIGINAL");
        ((Field) term537092).setAccessible(true);
        Object enum1180 = ((Field) term537092).get((Object) null);
        Class<? extends Object> term537359 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term537358 = ((Class) term537359).getDeclaredField((String) "NONE");
        ((Field) term537358).setAccessible(true);
        Object enum1181 = ((Field) term537358).get((Object) null);
        term535519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term535522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term535645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term535646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term535650 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term535519, term535519.getClass(), "id", term535520);
        setLongField(term535522, term535522.getClass(), "id", -3279534582096707294L);
        setIntField(term535522, term535522.getClass(), "pdId", 1963462917);
        setField(term535522, term535522.getClass(), "playerName", "xxx");
        setIntField(term535522, term535522.getClass(), "vocaloidPoints", 300);
        setIntField(term535522, term535522.getClass(), "level", 1);
        setIntField(term535522, term535522.getClass(), "levelExp", 552203554);
        setField(term535522, term535522.getClass(), "levelTitle", "xxx");
        setIntField(term535522, term535522.getClass(), "plateId", -1);
        setIntField(term535522, term535522.getClass(), "plateEffectId", -1);
        setField(term535522, term535522.getClass(), "passwordStatus", enum1177);
        setField(term535522, term535522.getClass(), "password", "**********");
        setBooleanField(term535522, term535522.getClass(), "preferPerPvModule", true);
        setBooleanField(term535522, term535522.getClass(), "preferCommonModule", false);
        setBooleanField(term535522, term535522.getClass(), "usePerPvSkin", false);
        setBooleanField(term535522, term535522.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term535522, term535522.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term535522, term535522.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term535522, term535522.getClass(), "usePerPvTouchSliderSe", true);
        setField(term535522, term535522.getClass(), "commonModule", "-999,-999,-999");
        setField(term535522, term535522.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term535646, term535646.getClass(), "year", 2026);
        setShortField(term535646, term535646.getClass(), "month", (short) 8);
        setShortField(term535646, term535646.getClass(), "day", (short) 12);
        setField(term535645, term535645.getClass(), "date", term535646);
        setByteField(term535650, term535650.getClass(), "hour", (byte) 2);
        setByteField(term535650, term535650.getClass(), "minute", (byte) 3);
        setByteField(term535650, term535650.getClass(), "second", (byte) 55);
        setIntField(term535650, term535650.getClass(), "nano", 93779000);
        setField(term535645, term535645.getClass(), "time", term535650);
        setField(term535522, term535522.getClass(), "commonModuleSetTime", term535645);
        setField(term535522, term535522.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term535522, term535522.getClass(), "commonSkin", -1);
        setIntField(term535522, term535522.getClass(), "headphoneVolume", 100);
        setBooleanField(term535522, term535522.getClass(), "buttonSeOn", true);
        setIntField(term535522, term535522.getClass(), "buttonSeVolume", 100);
        setIntField(term535522, term535522.getClass(), "sliderSeVolume", 100);
        setIntField(term535522, term535522.getClass(), "buttonSe", -1);
        setIntField(term535522, term535522.getClass(), "chainSlideSe", -1);
        setIntField(term535522, term535522.getClass(), "slideSe", -1);
        setIntField(term535522, term535522.getClass(), "sliderTouchSe", -1);
        setField(term535522, term535522.getClass(), "sortMode", enum1178);
        setIntField(term535522, term535522.getClass(), "nextPvId", -1);
        setField(term535522, term535522.getClass(), "nextDifficulty", enum1179);
        setField(term535522, term535522.getClass(), "nextEdition", enum1180);
        setBooleanField(term535522, term535522.getClass(), "showInterimRanking", true);
        setBooleanField(term535522, term535522.getClass(), "showClearStatus", true);
        setBooleanField(term535522, term535522.getClass(), "showGreatBorder", true);
        setBooleanField(term535522, term535522.getClass(), "showExcellentBorder", true);
        setBooleanField(term535522, term535522.getClass(), "showRivalBorder", true);
        setBooleanField(term535522, term535522.getClass(), "showRgoSetting", true);
        setBooleanField(term535522, term535522.getClass(), "contestNowPlayingEnable", false);
        setIntField(term535522, term535522.getClass(), "contestNowPlayingId", -1);
        setIntField(term535522, term535522.getClass(), "contestNowPlayingValue", -1);
        setField(term535522, term535522.getClass(), "contestNowPlayingResultRank", enum1181);
        setField(term535522, term535522.getClass(), "contestNowPlayingSpecifier", "");
        setField(term535522, term535522.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term535522, term535522.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term535522, term535522.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term535522, term535522.getClass(), "rivalPdId", -1);
        setField(term535519, term535519.getClass(), "pdId", term535522);
        setField(term535519, term535519.getClass(), "value", "HHQcYMSBVc");
        setField(term535519, term535519.getClass(), "type", "wdoqITnaAP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term535519, args);
    }

};


