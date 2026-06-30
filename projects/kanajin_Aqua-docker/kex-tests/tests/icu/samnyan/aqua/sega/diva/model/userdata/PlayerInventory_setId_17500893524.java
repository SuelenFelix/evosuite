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

public class PlayerInventory_setId_17500893524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540519;
     Object term541151;

    public PlayerInventory_setId_17500893524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term540520 = new Long(5270370404989704783L);
        Class<? extends Object> term541160 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term541159 = ((Class) term541160).getDeclaredField((String) "MISS");
        ((Field) term541159).setAccessible(true);
        Object enum1187 = ((Field) term541159).get((Object) null);
        Class<? extends Object> term541537 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term541536 = ((Class) term541537).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term541536).setAccessible(true);
        Object enum1188 = ((Field) term541536).get((Object) null);
        Class<? extends Object> term541820 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term541819 = ((Class) term541820).getDeclaredField((String) "NORMAL");
        ((Field) term541819).setAccessible(true);
        Object enum1189 = ((Field) term541819).get((Object) null);
        Class<? extends Object> term542095 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term542094 = ((Class) term542095).getDeclaredField((String) "ORIGINAL");
        ((Field) term542094).setAccessible(true);
        Object enum1190 = ((Field) term542094).get((Object) null);
        Class<? extends Object> term542361 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term542360 = ((Class) term542361).getDeclaredField((String) "NONE");
        ((Field) term542360).setAccessible(true);
        Object enum1191 = ((Field) term542360).get((Object) null);
        term540519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term540522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term540645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term540646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term540650 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term540519, term540519.getClass(), "id", term540520);
        setLongField(term540522, term540522.getClass(), "id", -7001094993638840490L);
        setIntField(term540522, term540522.getClass(), "pdId", 1806294616);
        setField(term540522, term540522.getClass(), "playerName", "xxx");
        setIntField(term540522, term540522.getClass(), "vocaloidPoints", 300);
        setIntField(term540522, term540522.getClass(), "level", 1);
        setIntField(term540522, term540522.getClass(), "levelExp", 1766086753);
        setField(term540522, term540522.getClass(), "levelTitle", "xxx");
        setIntField(term540522, term540522.getClass(), "plateId", -1);
        setIntField(term540522, term540522.getClass(), "plateEffectId", -1);
        setField(term540522, term540522.getClass(), "passwordStatus", enum1187);
        setField(term540522, term540522.getClass(), "password", "**********");
        setBooleanField(term540522, term540522.getClass(), "preferPerPvModule", true);
        setBooleanField(term540522, term540522.getClass(), "preferCommonModule", true);
        setBooleanField(term540522, term540522.getClass(), "usePerPvSkin", false);
        setBooleanField(term540522, term540522.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term540522, term540522.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term540522, term540522.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term540522, term540522.getClass(), "usePerPvTouchSliderSe", false);
        setField(term540522, term540522.getClass(), "commonModule", "-999,-999,-999");
        setField(term540522, term540522.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term540646, term540646.getClass(), "year", 2026);
        setShortField(term540646, term540646.getClass(), "month", (short) 6);
        setShortField(term540646, term540646.getClass(), "day", (short) 29);
        setField(term540645, term540645.getClass(), "date", term540646);
        setByteField(term540650, term540650.getClass(), "hour", (byte) 4);
        setByteField(term540650, term540650.getClass(), "minute", (byte) 28);
        setByteField(term540650, term540650.getClass(), "second", (byte) 41);
        setIntField(term540650, term540650.getClass(), "nano", 419134000);
        setField(term540645, term540645.getClass(), "time", term540650);
        setField(term540522, term540522.getClass(), "commonModuleSetTime", term540645);
        setField(term540522, term540522.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term540522, term540522.getClass(), "commonSkin", -1);
        setIntField(term540522, term540522.getClass(), "headphoneVolume", 100);
        setBooleanField(term540522, term540522.getClass(), "buttonSeOn", true);
        setIntField(term540522, term540522.getClass(), "buttonSeVolume", 100);
        setIntField(term540522, term540522.getClass(), "sliderSeVolume", 100);
        setIntField(term540522, term540522.getClass(), "buttonSe", -1);
        setIntField(term540522, term540522.getClass(), "chainSlideSe", -1);
        setIntField(term540522, term540522.getClass(), "slideSe", -1);
        setIntField(term540522, term540522.getClass(), "sliderTouchSe", -1);
        setField(term540522, term540522.getClass(), "sortMode", enum1188);
        setIntField(term540522, term540522.getClass(), "nextPvId", -1);
        setField(term540522, term540522.getClass(), "nextDifficulty", enum1189);
        setField(term540522, term540522.getClass(), "nextEdition", enum1190);
        setBooleanField(term540522, term540522.getClass(), "showInterimRanking", true);
        setBooleanField(term540522, term540522.getClass(), "showClearStatus", true);
        setBooleanField(term540522, term540522.getClass(), "showGreatBorder", true);
        setBooleanField(term540522, term540522.getClass(), "showExcellentBorder", true);
        setBooleanField(term540522, term540522.getClass(), "showRivalBorder", true);
        setBooleanField(term540522, term540522.getClass(), "showRgoSetting", true);
        setBooleanField(term540522, term540522.getClass(), "contestNowPlayingEnable", false);
        setIntField(term540522, term540522.getClass(), "contestNowPlayingId", -1);
        setIntField(term540522, term540522.getClass(), "contestNowPlayingValue", -1);
        setField(term540522, term540522.getClass(), "contestNowPlayingResultRank", enum1191);
        setField(term540522, term540522.getClass(), "contestNowPlayingSpecifier", "");
        setField(term540522, term540522.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term540522, term540522.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term540522, term540522.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term540522, term540522.getClass(), "rivalPdId", -1);
        setField(term540519, term540519.getClass(), "pdId", term540522);
        setField(term540519, term540519.getClass(), "value", "nRvKihUSPj");
        setField(term540519, term540519.getClass(), "type", "BbNeQJpYPr");
        term541151 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term541151;
        callMethod(klass, "setId", argTypes, term540519, args);
    }

};


