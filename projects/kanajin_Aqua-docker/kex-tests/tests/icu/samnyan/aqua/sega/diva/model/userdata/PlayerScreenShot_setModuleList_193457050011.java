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

public class PlayerScreenShot_setModuleList_193457050011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512760;

    public PlayerScreenShot_setModuleList_193457050011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term513423 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term513422 = ((Class) term513423).getDeclaredField((String) "MISS");
        ((Field) term513422).setAccessible(true);
        Object enum1132 = ((Field) term513422).get((Object) null);
        Class<? extends Object> term513800 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term513799 = ((Class) term513800).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term513799).setAccessible(true);
        Object enum1133 = ((Field) term513799).get((Object) null);
        Class<? extends Object> term514083 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term514082 = ((Class) term514083).getDeclaredField((String) "NORMAL");
        ((Field) term514082).setAccessible(true);
        Object enum1134 = ((Field) term514082).get((Object) null);
        Class<? extends Object> term514358 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term514357 = ((Class) term514358).getDeclaredField((String) "ORIGINAL");
        ((Field) term514357).setAccessible(true);
        Object enum1135 = ((Field) term514357).get((Object) null);
        Class<? extends Object> term514624 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term514623 = ((Class) term514624).getDeclaredField((String) "NONE");
        ((Field) term514623).setAccessible(true);
        Object enum1136 = ((Field) term514623).get((Object) null);
        term512760 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term512762 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term512885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term512886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term512890 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term512760, term512760.getClass(), "id", 4341016500855678917L);
        setLongField(term512762, term512762.getClass(), "id", -5871746020807491998L);
        setIntField(term512762, term512762.getClass(), "pdId", -1811405838);
        setField(term512762, term512762.getClass(), "playerName", "xxx");
        setIntField(term512762, term512762.getClass(), "vocaloidPoints", 300);
        setIntField(term512762, term512762.getClass(), "level", 1);
        setIntField(term512762, term512762.getClass(), "levelExp", 619484749);
        setField(term512762, term512762.getClass(), "levelTitle", "xxx");
        setIntField(term512762, term512762.getClass(), "plateId", -1);
        setIntField(term512762, term512762.getClass(), "plateEffectId", -1);
        setField(term512762, term512762.getClass(), "passwordStatus", enum1132);
        setField(term512762, term512762.getClass(), "password", "**********");
        setBooleanField(term512762, term512762.getClass(), "preferPerPvModule", true);
        setBooleanField(term512762, term512762.getClass(), "preferCommonModule", true);
        setBooleanField(term512762, term512762.getClass(), "usePerPvSkin", false);
        setBooleanField(term512762, term512762.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term512762, term512762.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term512762, term512762.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term512762, term512762.getClass(), "usePerPvTouchSliderSe", false);
        setField(term512762, term512762.getClass(), "commonModule", "-999,-999,-999");
        setField(term512762, term512762.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term512886, term512886.getClass(), "year", 2026);
        setShortField(term512886, term512886.getClass(), "month", (short) 8);
        setShortField(term512886, term512886.getClass(), "day", (short) 12);
        setField(term512885, term512885.getClass(), "date", term512886);
        setByteField(term512890, term512890.getClass(), "hour", (byte) 2);
        setByteField(term512890, term512890.getClass(), "minute", (byte) 3);
        setByteField(term512890, term512890.getClass(), "second", (byte) 48);
        setIntField(term512890, term512890.getClass(), "nano", 5562000);
        setField(term512885, term512885.getClass(), "time", term512890);
        setField(term512762, term512762.getClass(), "commonModuleSetTime", term512885);
        setField(term512762, term512762.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term512762, term512762.getClass(), "commonSkin", -1);
        setIntField(term512762, term512762.getClass(), "headphoneVolume", 100);
        setBooleanField(term512762, term512762.getClass(), "buttonSeOn", true);
        setIntField(term512762, term512762.getClass(), "buttonSeVolume", 100);
        setIntField(term512762, term512762.getClass(), "sliderSeVolume", 100);
        setIntField(term512762, term512762.getClass(), "buttonSe", -1);
        setIntField(term512762, term512762.getClass(), "chainSlideSe", -1);
        setIntField(term512762, term512762.getClass(), "slideSe", -1);
        setIntField(term512762, term512762.getClass(), "sliderTouchSe", -1);
        setField(term512762, term512762.getClass(), "sortMode", enum1133);
        setIntField(term512762, term512762.getClass(), "nextPvId", -1);
        setField(term512762, term512762.getClass(), "nextDifficulty", enum1134);
        setField(term512762, term512762.getClass(), "nextEdition", enum1135);
        setBooleanField(term512762, term512762.getClass(), "showInterimRanking", true);
        setBooleanField(term512762, term512762.getClass(), "showClearStatus", true);
        setBooleanField(term512762, term512762.getClass(), "showGreatBorder", true);
        setBooleanField(term512762, term512762.getClass(), "showExcellentBorder", true);
        setBooleanField(term512762, term512762.getClass(), "showRivalBorder", true);
        setBooleanField(term512762, term512762.getClass(), "showRgoSetting", true);
        setBooleanField(term512762, term512762.getClass(), "contestNowPlayingEnable", false);
        setIntField(term512762, term512762.getClass(), "contestNowPlayingId", -1);
        setIntField(term512762, term512762.getClass(), "contestNowPlayingValue", -1);
        setField(term512762, term512762.getClass(), "contestNowPlayingResultRank", enum1136);
        setField(term512762, term512762.getClass(), "contestNowPlayingSpecifier", "");
        setField(term512762, term512762.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term512762, term512762.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term512762, term512762.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term512762, term512762.getClass(), "rivalPdId", -1);
        setField(term512760, term512760.getClass(), "pdId", term512762);
        setIntField(term512760, term512760.getClass(), "pvId", 490271003);
        setField(term512760, term512760.getClass(), "fileName", "oPxuZbkYio");
        setField(term512760, term512760.getClass(), "moduleList", "vKitydDVnM");
        setField(term512760, term512760.getClass(), "customizeList", "urCiQnUFBM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EKjQdtKxAM";
        callMethod(klass, "setModuleList", argTypes, term512760, args);
    }

};


