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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerProfile_setRivalPdId_702300011100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927589;
     Object term928194;

    public PlayerProfile_setRivalPdId_702300011100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term928203 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term928202 = ((Class) term928203).getDeclaredField((String) "MISS");
        ((Field) term928202).setAccessible(true);
        Object enum1990 = ((Field) term928202).get((Object) null);
        Class<? extends Object> term928580 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term928579 = ((Class) term928580).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term928579).setAccessible(true);
        Object enum1991 = ((Field) term928579).get((Object) null);
        Class<? extends Object> term928863 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term928862 = ((Class) term928863).getDeclaredField((String) "NORMAL");
        ((Field) term928862).setAccessible(true);
        Object enum1992 = ((Field) term928862).get((Object) null);
        Class<? extends Object> term929138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term929137 = ((Class) term929138).getDeclaredField((String) "ORIGINAL");
        ((Field) term929137).setAccessible(true);
        Object enum1993 = ((Field) term929137).get((Object) null);
        Class<? extends Object> term929404 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term929403 = ((Class) term929404).getDeclaredField((String) "NONE");
        ((Field) term929403).setAccessible(true);
        Object enum1994 = ((Field) term929403).get((Object) null);
        term927589 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term927712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term927713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term927717 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term927589, term927589.getClass(), "id", -3271370917942710167L);
        setIntField(term927589, term927589.getClass(), "pdId", 1882224203);
        setField(term927589, term927589.getClass(), "playerName", "xxx");
        setIntField(term927589, term927589.getClass(), "vocaloidPoints", 300);
        setIntField(term927589, term927589.getClass(), "level", 1);
        setIntField(term927589, term927589.getClass(), "levelExp", 1320826206);
        setField(term927589, term927589.getClass(), "levelTitle", "xxx");
        setIntField(term927589, term927589.getClass(), "plateId", -1);
        setIntField(term927589, term927589.getClass(), "plateEffectId", -1);
        setField(term927589, term927589.getClass(), "passwordStatus", enum1990);
        setField(term927589, term927589.getClass(), "password", "**********");
        setBooleanField(term927589, term927589.getClass(), "preferPerPvModule", true);
        setBooleanField(term927589, term927589.getClass(), "preferCommonModule", false);
        setBooleanField(term927589, term927589.getClass(), "usePerPvSkin", false);
        setBooleanField(term927589, term927589.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term927589, term927589.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term927589, term927589.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term927589, term927589.getClass(), "usePerPvTouchSliderSe", false);
        setField(term927589, term927589.getClass(), "commonModule", "-999,-999,-999");
        setField(term927589, term927589.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term927713, term927713.getClass(), "year", 2026);
        setShortField(term927713, term927713.getClass(), "month", (short) 6);
        setShortField(term927713, term927713.getClass(), "day", (short) 29);
        setField(term927712, term927712.getClass(), "date", term927713);
        setByteField(term927717, term927717.getClass(), "hour", (byte) 4);
        setByteField(term927717, term927717.getClass(), "minute", (byte) 29);
        setByteField(term927717, term927717.getClass(), "second", (byte) 35);
        setIntField(term927717, term927717.getClass(), "nano", 13565000);
        setField(term927712, term927712.getClass(), "time", term927717);
        setField(term927589, term927589.getClass(), "commonModuleSetTime", term927712);
        setField(term927589, term927589.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term927589, term927589.getClass(), "commonSkin", -1);
        setIntField(term927589, term927589.getClass(), "headphoneVolume", 100);
        setBooleanField(term927589, term927589.getClass(), "buttonSeOn", true);
        setIntField(term927589, term927589.getClass(), "buttonSeVolume", 100);
        setIntField(term927589, term927589.getClass(), "sliderSeVolume", 100);
        setIntField(term927589, term927589.getClass(), "buttonSe", -1);
        setIntField(term927589, term927589.getClass(), "chainSlideSe", -1);
        setIntField(term927589, term927589.getClass(), "slideSe", -1);
        setIntField(term927589, term927589.getClass(), "sliderTouchSe", -1);
        setField(term927589, term927589.getClass(), "sortMode", enum1991);
        setIntField(term927589, term927589.getClass(), "nextPvId", -1);
        setField(term927589, term927589.getClass(), "nextDifficulty", enum1992);
        setField(term927589, term927589.getClass(), "nextEdition", enum1993);
        setBooleanField(term927589, term927589.getClass(), "showInterimRanking", true);
        setBooleanField(term927589, term927589.getClass(), "showClearStatus", true);
        setBooleanField(term927589, term927589.getClass(), "showGreatBorder", true);
        setBooleanField(term927589, term927589.getClass(), "showExcellentBorder", true);
        setBooleanField(term927589, term927589.getClass(), "showRivalBorder", true);
        setBooleanField(term927589, term927589.getClass(), "showRgoSetting", true);
        setBooleanField(term927589, term927589.getClass(), "contestNowPlayingEnable", true);
        setIntField(term927589, term927589.getClass(), "contestNowPlayingId", -1);
        setIntField(term927589, term927589.getClass(), "contestNowPlayingValue", -1);
        setField(term927589, term927589.getClass(), "contestNowPlayingResultRank", enum1994);
        setField(term927589, term927589.getClass(), "contestNowPlayingSpecifier", "");
        setField(term927589, term927589.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term927589, term927589.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term927589, term927589.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term927589, term927589.getClass(), "rivalPdId", -1);
        term928194 = new Integer(-933702401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term928194;
        callMethod(klass, "setRivalPdId", argTypes, term927589, args);
    }

};


