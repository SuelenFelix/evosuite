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

public class PlayerScreenShot_setPvId_10078518729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507692;
     Object term508336;

    public PlayerScreenShot_setPvId_10078518729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term508345 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term508344 = ((Class) term508345).getDeclaredField((String) "MISS");
        ((Field) term508344).setAccessible(true);
        Object enum1122 = ((Field) term508344).get((Object) null);
        Class<? extends Object> term508722 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term508721 = ((Class) term508722).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term508721).setAccessible(true);
        Object enum1123 = ((Field) term508721).get((Object) null);
        Class<? extends Object> term509005 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term509004 = ((Class) term509005).getDeclaredField((String) "NORMAL");
        ((Field) term509004).setAccessible(true);
        Object enum1124 = ((Field) term509004).get((Object) null);
        Class<? extends Object> term509280 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term509279 = ((Class) term509280).getDeclaredField((String) "ORIGINAL");
        ((Field) term509279).setAccessible(true);
        Object enum1125 = ((Field) term509279).get((Object) null);
        Class<? extends Object> term509546 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term509545 = ((Class) term509546).getDeclaredField((String) "NONE");
        ((Field) term509545).setAccessible(true);
        Object enum1126 = ((Field) term509545).get((Object) null);
        term507692 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term507694 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term507817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term507818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term507822 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term507692, term507692.getClass(), "id", 6465987664600701876L);
        setLongField(term507694, term507694.getClass(), "id", -136372844051852955L);
        setIntField(term507694, term507694.getClass(), "pdId", 724669093);
        setField(term507694, term507694.getClass(), "playerName", "xxx");
        setIntField(term507694, term507694.getClass(), "vocaloidPoints", 300);
        setIntField(term507694, term507694.getClass(), "level", 1);
        setIntField(term507694, term507694.getClass(), "levelExp", -2005743628);
        setField(term507694, term507694.getClass(), "levelTitle", "xxx");
        setIntField(term507694, term507694.getClass(), "plateId", -1);
        setIntField(term507694, term507694.getClass(), "plateEffectId", -1);
        setField(term507694, term507694.getClass(), "passwordStatus", enum1122);
        setField(term507694, term507694.getClass(), "password", "**********");
        setBooleanField(term507694, term507694.getClass(), "preferPerPvModule", true);
        setBooleanField(term507694, term507694.getClass(), "preferCommonModule", true);
        setBooleanField(term507694, term507694.getClass(), "usePerPvSkin", true);
        setBooleanField(term507694, term507694.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term507694, term507694.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term507694, term507694.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term507694, term507694.getClass(), "usePerPvTouchSliderSe", false);
        setField(term507694, term507694.getClass(), "commonModule", "-999,-999,-999");
        setField(term507694, term507694.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term507818, term507818.getClass(), "year", 2026);
        setShortField(term507818, term507818.getClass(), "month", (short) 6);
        setShortField(term507818, term507818.getClass(), "day", (short) 29);
        setField(term507817, term507817.getClass(), "date", term507818);
        setByteField(term507822, term507822.getClass(), "hour", (byte) 4);
        setByteField(term507822, term507822.getClass(), "minute", (byte) 28);
        setByteField(term507822, term507822.getClass(), "second", (byte) 33);
        setIntField(term507822, term507822.getClass(), "nano", 146843000);
        setField(term507817, term507817.getClass(), "time", term507822);
        setField(term507694, term507694.getClass(), "commonModuleSetTime", term507817);
        setField(term507694, term507694.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term507694, term507694.getClass(), "commonSkin", -1);
        setIntField(term507694, term507694.getClass(), "headphoneVolume", 100);
        setBooleanField(term507694, term507694.getClass(), "buttonSeOn", true);
        setIntField(term507694, term507694.getClass(), "buttonSeVolume", 100);
        setIntField(term507694, term507694.getClass(), "sliderSeVolume", 100);
        setIntField(term507694, term507694.getClass(), "buttonSe", -1);
        setIntField(term507694, term507694.getClass(), "chainSlideSe", -1);
        setIntField(term507694, term507694.getClass(), "slideSe", -1);
        setIntField(term507694, term507694.getClass(), "sliderTouchSe", -1);
        setField(term507694, term507694.getClass(), "sortMode", enum1123);
        setIntField(term507694, term507694.getClass(), "nextPvId", -1);
        setField(term507694, term507694.getClass(), "nextDifficulty", enum1124);
        setField(term507694, term507694.getClass(), "nextEdition", enum1125);
        setBooleanField(term507694, term507694.getClass(), "showInterimRanking", true);
        setBooleanField(term507694, term507694.getClass(), "showClearStatus", true);
        setBooleanField(term507694, term507694.getClass(), "showGreatBorder", true);
        setBooleanField(term507694, term507694.getClass(), "showExcellentBorder", true);
        setBooleanField(term507694, term507694.getClass(), "showRivalBorder", true);
        setBooleanField(term507694, term507694.getClass(), "showRgoSetting", true);
        setBooleanField(term507694, term507694.getClass(), "contestNowPlayingEnable", false);
        setIntField(term507694, term507694.getClass(), "contestNowPlayingId", -1);
        setIntField(term507694, term507694.getClass(), "contestNowPlayingValue", -1);
        setField(term507694, term507694.getClass(), "contestNowPlayingResultRank", enum1126);
        setField(term507694, term507694.getClass(), "contestNowPlayingSpecifier", "");
        setField(term507694, term507694.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term507694, term507694.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term507694, term507694.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term507694, term507694.getClass(), "rivalPdId", -1);
        setField(term507692, term507692.getClass(), "pdId", term507694);
        setIntField(term507692, term507692.getClass(), "pvId", -1204207224);
        setField(term507692, term507692.getClass(), "fileName", "iCCsaLHohG");
        setField(term507692, term507692.getClass(), "moduleList", "NJhGgctbdj");
        setField(term507692, term507692.getClass(), "customizeList", "MYWYUeLGOp");
        term508336 = new Integer(-77932500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term508336;
        callMethod(klass, "setPvId", argTypes, term507692, args);
    }

};


