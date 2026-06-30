package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_toString_104520381612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308633;

    public UserGeneralData_toString_104520381612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term308639 = new Long(6462632207326555041L);
        term308633 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term308635 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term308637 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term308653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308658 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308799 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308845 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term308633, term308633.getClass(), "id", 786157991151108343L);
        setLongField(term308635, term308635.getClass(), "id", 6961497905863738725L);
        setLongField(term308637, term308637.getClass(), "id", 4889943794113542688L);
        setField(term308637, term308637.getClass(), "extId", term308639);
        setField(term308637, term308637.getClass(), "luid", "qxYfLsDxVm");
        setIntField(term308654, term308654.getClass(), "year", 2012);
        setShortField(term308654, term308654.getClass(), "month", (short) 12);
        setShortField(term308654, term308654.getClass(), "day", (short) 2);
        setField(term308653, term308653.getClass(), "date", term308654);
        setByteField(term308658, term308658.getClass(), "hour", (byte) 13);
        setByteField(term308658, term308658.getClass(), "minute", (byte) 48);
        setByteField(term308658, term308658.getClass(), "second", (byte) 34);
        setIntField(term308658, term308658.getClass(), "nano", 397077000);
        setField(term308653, term308653.getClass(), "time", term308658);
        setField(term308637, term308637.getClass(), "registerTime", term308653);
        setIntField(term308664, term308664.getClass(), "year", 2018);
        setShortField(term308664, term308664.getClass(), "month", (short) 2);
        setShortField(term308664, term308664.getClass(), "day", (short) 3);
        setField(term308663, term308663.getClass(), "date", term308664);
        setByteField(term308668, term308668.getClass(), "hour", (byte) 22);
        setByteField(term308668, term308668.getClass(), "minute", (byte) 48);
        setByteField(term308668, term308668.getClass(), "second", (byte) 12);
        setIntField(term308668, term308668.getClass(), "nano", 639671989);
        setField(term308663, term308663.getClass(), "time", term308668);
        setField(term308637, term308637.getClass(), "accessTime", term308663);
        setField(term308635, term308635.getClass(), "card", term308637);
        setField(term308635, term308635.getClass(), "userName", "IyiMbCQwHK");
        setIntField(term308686, term308686.getClass(), "year", 2010);
        setShortField(term308686, term308686.getClass(), "month", (short) 3);
        setShortField(term308686, term308686.getClass(), "day", (short) 28);
        setField(term308685, term308685.getClass(), "date", term308686);
        setByteField(term308690, term308690.getClass(), "hour", (byte) 17);
        setByteField(term308690, term308690.getClass(), "minute", (byte) 32);
        setByteField(term308690, term308690.getClass(), "second", (byte) 7);
        setIntField(term308690, term308690.getClass(), "nano", 592214263);
        setField(term308685, term308685.getClass(), "time", term308690);
        setField(term308635, term308635.getClass(), "lastLoginDate", term308685);
        setBooleanField(term308635, term308635.getClass(), "isWebJoin", true);
        setField(term308635, term308635.getClass(), "webLimitDate", "qgMxuDOVlx");
        setIntField(term308635, term308635.getClass(), "level", 832113202);
        setIntField(term308635, term308635.getClass(), "reincarnationNum", -1583443632);
        setField(term308635, term308635.getClass(), "exp", "zjOGGlnQSZ");
        setLongField(term308635, term308635.getClass(), "point", -6999458605350230167L);
        setLongField(term308635, term308635.getClass(), "totalPoint", -3202506619411872674L);
        setIntField(term308635, term308635.getClass(), "playCount", -62265993);
        setIntField(term308635, term308635.getClass(), "multiPlayCount", 1053590471);
        setIntField(term308635, term308635.getClass(), "multiWinCount", -1544521733);
        setIntField(term308635, term308635.getClass(), "requestResCount", -176176990);
        setIntField(term308635, term308635.getClass(), "acceptResCount", -1107491810);
        setIntField(term308635, term308635.getClass(), "successResCount", 369101566);
        setIntField(term308635, term308635.getClass(), "playerRating", -1122407208);
        setIntField(term308635, term308635.getClass(), "highestRating", -1158696779);
        setIntField(term308635, term308635.getClass(), "nameplateId", 1628040716);
        setIntField(term308635, term308635.getClass(), "frameId", 630381282);
        setIntField(term308635, term308635.getClass(), "characterId", -467147197);
        setIntField(term308635, term308635.getClass(), "trophyId", 1528864276);
        setIntField(term308635, term308635.getClass(), "playedTutorialBit", 1293672054);
        setIntField(term308635, term308635.getClass(), "firstTutorialCancelNum", -126829114);
        setIntField(term308635, term308635.getClass(), "masterTutorialCancelNum", 1364504787);
        setIntField(term308635, term308635.getClass(), "totalRepertoireCount", 193942993);
        setIntField(term308635, term308635.getClass(), "totalMapNum", -1448731227);
        setLongField(term308635, term308635.getClass(), "totalHiScore", -1568734926667301919L);
        setLongField(term308635, term308635.getClass(), "totalBasicHighScore", 8404979198900872572L);
        setLongField(term308635, term308635.getClass(), "totalAdvancedHighScore", 3663186706641799531L);
        setLongField(term308635, term308635.getClass(), "totalExpertHighScore", 2516991685981339429L);
        setLongField(term308635, term308635.getClass(), "totalMasterHighScore", -7553534160311859168L);
        setIntField(term308747, term308747.getClass(), "year", 2023);
        setShortField(term308747, term308747.getClass(), "month", (short) 12);
        setShortField(term308747, term308747.getClass(), "day", (short) 10);
        setField(term308746, term308746.getClass(), "date", term308747);
        setByteField(term308751, term308751.getClass(), "hour", (byte) 18);
        setByteField(term308751, term308751.getClass(), "minute", (byte) 10);
        setByteField(term308751, term308751.getClass(), "second", (byte) 37);
        setIntField(term308751, term308751.getClass(), "nano", 684552973);
        setField(term308746, term308746.getClass(), "time", term308751);
        setField(term308635, term308635.getClass(), "eventWatchedDate", term308746);
        setIntField(term308635, term308635.getClass(), "friendCount", 427298296);
        setBooleanField(term308635, term308635.getClass(), "isMaimai", false);
        setField(term308635, term308635.getClass(), "firstGameId", "lqDEahPiir");
        setField(term308635, term308635.getClass(), "firstRomVersion", "GyYnoejQdg");
        setField(term308635, term308635.getClass(), "firstDataVersion", "NuDZzHrXrn");
        setIntField(term308795, term308795.getClass(), "year", 2016);
        setShortField(term308795, term308795.getClass(), "month", (short) 9);
        setShortField(term308795, term308795.getClass(), "day", (short) 28);
        setField(term308794, term308794.getClass(), "date", term308795);
        setByteField(term308799, term308799.getClass(), "hour", (byte) 3);
        setByteField(term308799, term308799.getClass(), "minute", (byte) 1);
        setByteField(term308799, term308799.getClass(), "second", (byte) 42);
        setIntField(term308799, term308799.getClass(), "nano", 277327665);
        setField(term308794, term308794.getClass(), "time", term308799);
        setField(term308635, term308635.getClass(), "firstPlayDate", term308794);
        setField(term308635, term308635.getClass(), "lastGameId", "OuLKyvvPWX");
        setField(term308635, term308635.getClass(), "lastRomVersion", "XCikiAMbLv");
        setField(term308635, term308635.getClass(), "lastDataVersion", "VnvZpXcWbJ");
        setIntField(term308841, term308841.getClass(), "year", 2023);
        setShortField(term308841, term308841.getClass(), "month", (short) 1);
        setShortField(term308841, term308841.getClass(), "day", (short) 14);
        setField(term308840, term308840.getClass(), "date", term308841);
        setByteField(term308845, term308845.getClass(), "hour", (byte) 19);
        setByteField(term308845, term308845.getClass(), "minute", (byte) 0);
        setByteField(term308845, term308845.getClass(), "second", (byte) 24);
        setIntField(term308845, term308845.getClass(), "nano", 49847150);
        setField(term308840, term308840.getClass(), "time", term308845);
        setField(term308635, term308635.getClass(), "lastPlayDate", term308840);
        setIntField(term308635, term308635.getClass(), "lastPlaceId", 1136711102);
        setField(term308635, term308635.getClass(), "lastPlaceName", "CqfTXppaYd");
        setField(term308635, term308635.getClass(), "lastRegionId", "vGKebDDKcW");
        setField(term308635, term308635.getClass(), "lastRegionName", "MkwJQnHQbf");
        setField(term308635, term308635.getClass(), "lastAllNetId", "yPMIDJRkkP");
        setField(term308635, term308635.getClass(), "lastClientId", "FYrHZjWNQJ");
        setField(term308633, term308633.getClass(), "user", term308635);
        setField(term308633, term308633.getClass(), "propertyKey", "kroCMCDLFI");
        setField(term308633, term308633.getClass(), "propertyValue", "KkIBmxvzcL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term308633, args);
    }

};


