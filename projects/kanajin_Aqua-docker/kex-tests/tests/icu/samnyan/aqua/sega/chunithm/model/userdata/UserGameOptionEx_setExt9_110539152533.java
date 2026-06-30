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
import java.lang.Integer;

public class UserGameOptionEx_setExt9_110539152533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324811;
     Object term325109;

    public UserGameOptionEx_setExt9_110539152533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324817 = new Long(3810487266967550400L);
        term324811 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term324813 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term324815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term324831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325023 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term324811, term324811.getClass(), "id", 7978864878762652373L);
        setLongField(term324813, term324813.getClass(), "id", 7483951906157896993L);
        setLongField(term324815, term324815.getClass(), "id", 3362378115560931435L);
        setField(term324815, term324815.getClass(), "extId", term324817);
        setField(term324815, term324815.getClass(), "luid", "sRZQZFejMq");
        setIntField(term324832, term324832.getClass(), "year", 2018);
        setShortField(term324832, term324832.getClass(), "month", (short) 12);
        setShortField(term324832, term324832.getClass(), "day", (short) 30);
        setField(term324831, term324831.getClass(), "date", term324832);
        setByteField(term324836, term324836.getClass(), "hour", (byte) 16);
        setByteField(term324836, term324836.getClass(), "minute", (byte) 39);
        setByteField(term324836, term324836.getClass(), "second", (byte) 25);
        setIntField(term324836, term324836.getClass(), "nano", 410102349);
        setField(term324831, term324831.getClass(), "time", term324836);
        setField(term324815, term324815.getClass(), "registerTime", term324831);
        setIntField(term324842, term324842.getClass(), "year", 2014);
        setShortField(term324842, term324842.getClass(), "month", (short) 8);
        setShortField(term324842, term324842.getClass(), "day", (short) 2);
        setField(term324841, term324841.getClass(), "date", term324842);
        setByteField(term324846, term324846.getClass(), "hour", (byte) 22);
        setByteField(term324846, term324846.getClass(), "minute", (byte) 37);
        setByteField(term324846, term324846.getClass(), "second", (byte) 25);
        setIntField(term324846, term324846.getClass(), "nano", 736456632);
        setField(term324841, term324841.getClass(), "time", term324846);
        setField(term324815, term324815.getClass(), "accessTime", term324841);
        setField(term324813, term324813.getClass(), "card", term324815);
        setField(term324813, term324813.getClass(), "userName", "OHCMtEBKVg");
        setIntField(term324864, term324864.getClass(), "year", 2023);
        setShortField(term324864, term324864.getClass(), "month", (short) 5);
        setShortField(term324864, term324864.getClass(), "day", (short) 24);
        setField(term324863, term324863.getClass(), "date", term324864);
        setByteField(term324868, term324868.getClass(), "hour", (byte) 0);
        setByteField(term324868, term324868.getClass(), "minute", (byte) 58);
        setByteField(term324868, term324868.getClass(), "second", (byte) 36);
        setIntField(term324868, term324868.getClass(), "nano", 632830150);
        setField(term324863, term324863.getClass(), "time", term324868);
        setField(term324813, term324813.getClass(), "lastLoginDate", term324863);
        setBooleanField(term324813, term324813.getClass(), "isWebJoin", true);
        setField(term324813, term324813.getClass(), "webLimitDate", "HWIRsNWmQm");
        setIntField(term324813, term324813.getClass(), "level", 1837850084);
        setIntField(term324813, term324813.getClass(), "reincarnationNum", 1470450665);
        setField(term324813, term324813.getClass(), "exp", "HcmfXAxXeu");
        setLongField(term324813, term324813.getClass(), "point", -879107385219460272L);
        setLongField(term324813, term324813.getClass(), "totalPoint", -6128461892721278131L);
        setIntField(term324813, term324813.getClass(), "playCount", 1923583635);
        setIntField(term324813, term324813.getClass(), "multiPlayCount", 1371516661);
        setIntField(term324813, term324813.getClass(), "multiWinCount", 1190458831);
        setIntField(term324813, term324813.getClass(), "requestResCount", -504185930);
        setIntField(term324813, term324813.getClass(), "acceptResCount", -876397761);
        setIntField(term324813, term324813.getClass(), "successResCount", -2125188076);
        setIntField(term324813, term324813.getClass(), "playerRating", 1650623983);
        setIntField(term324813, term324813.getClass(), "highestRating", -1103828562);
        setIntField(term324813, term324813.getClass(), "nameplateId", -496314738);
        setIntField(term324813, term324813.getClass(), "frameId", -1147690688);
        setIntField(term324813, term324813.getClass(), "characterId", 1474442364);
        setIntField(term324813, term324813.getClass(), "trophyId", -1979534719);
        setIntField(term324813, term324813.getClass(), "playedTutorialBit", 358862811);
        setIntField(term324813, term324813.getClass(), "firstTutorialCancelNum", -607854753);
        setIntField(term324813, term324813.getClass(), "masterTutorialCancelNum", -660755702);
        setIntField(term324813, term324813.getClass(), "totalRepertoireCount", 679880948);
        setIntField(term324813, term324813.getClass(), "totalMapNum", 1895163953);
        setLongField(term324813, term324813.getClass(), "totalHiScore", -1543242469007824295L);
        setLongField(term324813, term324813.getClass(), "totalBasicHighScore", 1277903088423737567L);
        setLongField(term324813, term324813.getClass(), "totalAdvancedHighScore", -794318216184174871L);
        setLongField(term324813, term324813.getClass(), "totalExpertHighScore", -9193003593128428116L);
        setLongField(term324813, term324813.getClass(), "totalMasterHighScore", 3580621595897088737L);
        setIntField(term324925, term324925.getClass(), "year", 2026);
        setShortField(term324925, term324925.getClass(), "month", (short) 2);
        setShortField(term324925, term324925.getClass(), "day", (short) 19);
        setField(term324924, term324924.getClass(), "date", term324925);
        setByteField(term324929, term324929.getClass(), "hour", (byte) 21);
        setByteField(term324929, term324929.getClass(), "minute", (byte) 7);
        setByteField(term324929, term324929.getClass(), "second", (byte) 32);
        setIntField(term324929, term324929.getClass(), "nano", 247557347);
        setField(term324924, term324924.getClass(), "time", term324929);
        setField(term324813, term324813.getClass(), "eventWatchedDate", term324924);
        setIntField(term324813, term324813.getClass(), "friendCount", -691223106);
        setBooleanField(term324813, term324813.getClass(), "isMaimai", true);
        setField(term324813, term324813.getClass(), "firstGameId", "ENHMPCkJAF");
        setField(term324813, term324813.getClass(), "firstRomVersion", "ltsPzZddLV");
        setField(term324813, term324813.getClass(), "firstDataVersion", "dLPiVldLcA");
        setIntField(term324973, term324973.getClass(), "year", 2012);
        setShortField(term324973, term324973.getClass(), "month", (short) 12);
        setShortField(term324973, term324973.getClass(), "day", (short) 2);
        setField(term324972, term324972.getClass(), "date", term324973);
        setByteField(term324977, term324977.getClass(), "hour", (byte) 19);
        setByteField(term324977, term324977.getClass(), "minute", (byte) 33);
        setByteField(term324977, term324977.getClass(), "second", (byte) 46);
        setIntField(term324977, term324977.getClass(), "nano", 111662862);
        setField(term324972, term324972.getClass(), "time", term324977);
        setField(term324813, term324813.getClass(), "firstPlayDate", term324972);
        setField(term324813, term324813.getClass(), "lastGameId", "MNSfoGNbaW");
        setField(term324813, term324813.getClass(), "lastRomVersion", "XJpICVQclj");
        setField(term324813, term324813.getClass(), "lastDataVersion", "mLRSsQVYlf");
        setIntField(term325019, term325019.getClass(), "year", 2028);
        setShortField(term325019, term325019.getClass(), "month", (short) 7);
        setShortField(term325019, term325019.getClass(), "day", (short) 7);
        setField(term325018, term325018.getClass(), "date", term325019);
        setByteField(term325023, term325023.getClass(), "hour", (byte) 10);
        setByteField(term325023, term325023.getClass(), "minute", (byte) 14);
        setByteField(term325023, term325023.getClass(), "second", (byte) 43);
        setIntField(term325023, term325023.getClass(), "nano", 826976827);
        setField(term325018, term325018.getClass(), "time", term325023);
        setField(term324813, term324813.getClass(), "lastPlayDate", term325018);
        setIntField(term324813, term324813.getClass(), "lastPlaceId", -818213947);
        setField(term324813, term324813.getClass(), "lastPlaceName", "iBDUqVqJzF");
        setField(term324813, term324813.getClass(), "lastRegionId", "vuNCvBpVGd");
        setField(term324813, term324813.getClass(), "lastRegionName", "eqvYvwCahH");
        setField(term324813, term324813.getClass(), "lastAllNetId", "ZCDVAsozYB");
        setField(term324813, term324813.getClass(), "lastClientId", "izLOxsKUuC");
        setField(term324811, term324811.getClass(), "user", term324813);
        setIntField(term324811, term324811.getClass(), "ext1", -1160766511);
        setIntField(term324811, term324811.getClass(), "ext2", -1983614159);
        setIntField(term324811, term324811.getClass(), "ext3", -1538026717);
        setIntField(term324811, term324811.getClass(), "ext4", 1157723902);
        setIntField(term324811, term324811.getClass(), "ext5", -1911978209);
        setIntField(term324811, term324811.getClass(), "ext6", -947895752);
        setIntField(term324811, term324811.getClass(), "ext7", -488348638);
        setIntField(term324811, term324811.getClass(), "ext8", 1971447014);
        setIntField(term324811, term324811.getClass(), "ext9", -424778605);
        setIntField(term324811, term324811.getClass(), "ext10", -2027250240);
        setIntField(term324811, term324811.getClass(), "ext11", 984955567);
        setIntField(term324811, term324811.getClass(), "ext12", 1330468760);
        setIntField(term324811, term324811.getClass(), "ext13", 314609478);
        setIntField(term324811, term324811.getClass(), "ext14", -1790709498);
        setIntField(term324811, term324811.getClass(), "ext15", -991204620);
        setIntField(term324811, term324811.getClass(), "ext16", 290302300);
        setIntField(term324811, term324811.getClass(), "ext17", 1352183463);
        setIntField(term324811, term324811.getClass(), "ext18", 1489439725);
        setIntField(term324811, term324811.getClass(), "ext19", -1946582683);
        setIntField(term324811, term324811.getClass(), "ext20", -1041859799);
        term325109 = new Integer(2011585714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term325109;
        callMethod(klass, "setExt9", argTypes, term324811, args);
    }

};


