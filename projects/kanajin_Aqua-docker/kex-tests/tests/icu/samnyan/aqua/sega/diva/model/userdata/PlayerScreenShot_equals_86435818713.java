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

public class PlayerScreenShot_equals_86435818713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517848;
     Object term518492;

    public PlayerScreenShot_equals_86435818713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term518500 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term518499 = ((Class) term518500).getDeclaredField((String) "MISS");
        ((Field) term518499).setAccessible(true);
        Object enum1142 = ((Field) term518499).get((Object) null);
        Class<? extends Object> term518877 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term518876 = ((Class) term518877).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term518876).setAccessible(true);
        Object enum1143 = ((Field) term518876).get((Object) null);
        Class<? extends Object> term519160 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term519159 = ((Class) term519160).getDeclaredField((String) "NORMAL");
        ((Field) term519159).setAccessible(true);
        Object enum1144 = ((Field) term519159).get((Object) null);
        Class<? extends Object> term519435 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term519434 = ((Class) term519435).getDeclaredField((String) "ORIGINAL");
        ((Field) term519434).setAccessible(true);
        Object enum1145 = ((Field) term519434).get((Object) null);
        Class<? extends Object> term519701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term519700 = ((Class) term519701).getDeclaredField((String) "NONE");
        ((Field) term519700).setAccessible(true);
        Object enum1146 = ((Field) term519700).get((Object) null);
        term517848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term517850 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term517973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term517974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term517978 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term517848, term517848.getClass(), "id", 6636235983121346803L);
        setLongField(term517850, term517850.getClass(), "id", 146749226579788091L);
        setIntField(term517850, term517850.getClass(), "pdId", 1394815305);
        setField(term517850, term517850.getClass(), "playerName", "xxx");
        setIntField(term517850, term517850.getClass(), "vocaloidPoints", 300);
        setIntField(term517850, term517850.getClass(), "level", 1);
        setIntField(term517850, term517850.getClass(), "levelExp", -315070279);
        setField(term517850, term517850.getClass(), "levelTitle", "xxx");
        setIntField(term517850, term517850.getClass(), "plateId", -1);
        setIntField(term517850, term517850.getClass(), "plateEffectId", -1);
        setField(term517850, term517850.getClass(), "passwordStatus", enum1142);
        setField(term517850, term517850.getClass(), "password", "**********");
        setBooleanField(term517850, term517850.getClass(), "preferPerPvModule", true);
        setBooleanField(term517850, term517850.getClass(), "preferCommonModule", false);
        setBooleanField(term517850, term517850.getClass(), "usePerPvSkin", true);
        setBooleanField(term517850, term517850.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term517850, term517850.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term517850, term517850.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term517850, term517850.getClass(), "usePerPvTouchSliderSe", false);
        setField(term517850, term517850.getClass(), "commonModule", "-999,-999,-999");
        setField(term517850, term517850.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term517974, term517974.getClass(), "year", 2026);
        setShortField(term517974, term517974.getClass(), "month", (short) 8);
        setShortField(term517974, term517974.getClass(), "day", (short) 12);
        setField(term517973, term517973.getClass(), "date", term517974);
        setByteField(term517978, term517978.getClass(), "hour", (byte) 2);
        setByteField(term517978, term517978.getClass(), "minute", (byte) 3);
        setByteField(term517978, term517978.getClass(), "second", (byte) 48);
        setIntField(term517978, term517978.getClass(), "nano", 509884000);
        setField(term517973, term517973.getClass(), "time", term517978);
        setField(term517850, term517850.getClass(), "commonModuleSetTime", term517973);
        setField(term517850, term517850.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term517850, term517850.getClass(), "commonSkin", -1);
        setIntField(term517850, term517850.getClass(), "headphoneVolume", 100);
        setBooleanField(term517850, term517850.getClass(), "buttonSeOn", true);
        setIntField(term517850, term517850.getClass(), "buttonSeVolume", 100);
        setIntField(term517850, term517850.getClass(), "sliderSeVolume", 100);
        setIntField(term517850, term517850.getClass(), "buttonSe", -1);
        setIntField(term517850, term517850.getClass(), "chainSlideSe", -1);
        setIntField(term517850, term517850.getClass(), "slideSe", -1);
        setIntField(term517850, term517850.getClass(), "sliderTouchSe", -1);
        setField(term517850, term517850.getClass(), "sortMode", enum1143);
        setIntField(term517850, term517850.getClass(), "nextPvId", -1);
        setField(term517850, term517850.getClass(), "nextDifficulty", enum1144);
        setField(term517850, term517850.getClass(), "nextEdition", enum1145);
        setBooleanField(term517850, term517850.getClass(), "showInterimRanking", true);
        setBooleanField(term517850, term517850.getClass(), "showClearStatus", true);
        setBooleanField(term517850, term517850.getClass(), "showGreatBorder", true);
        setBooleanField(term517850, term517850.getClass(), "showExcellentBorder", true);
        setBooleanField(term517850, term517850.getClass(), "showRivalBorder", true);
        setBooleanField(term517850, term517850.getClass(), "showRgoSetting", true);
        setBooleanField(term517850, term517850.getClass(), "contestNowPlayingEnable", false);
        setIntField(term517850, term517850.getClass(), "contestNowPlayingId", -1);
        setIntField(term517850, term517850.getClass(), "contestNowPlayingValue", -1);
        setField(term517850, term517850.getClass(), "contestNowPlayingResultRank", enum1146);
        setField(term517850, term517850.getClass(), "contestNowPlayingSpecifier", "");
        setField(term517850, term517850.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term517850, term517850.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term517850, term517850.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term517850, term517850.getClass(), "rivalPdId", -1);
        setField(term517848, term517848.getClass(), "pdId", term517850);
        setIntField(term517848, term517848.getClass(), "pvId", 62449386);
        setField(term517848, term517848.getClass(), "fileName", "wBGfLpNNiZ");
        setField(term517848, term517848.getClass(), "moduleList", "yUGCjlqgJE");
        setField(term517848, term517848.getClass(), "customizeList", "PXdVZyoJyC");
        term518492 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term518492;
        callMethod(klass, "equals", argTypes, term517848, args);
    }

};


