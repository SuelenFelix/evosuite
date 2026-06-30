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
import java.lang.Boolean;

public class UserMap_setClear_23520415816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285812;
     Object term286099;

    public UserMap_setClear_23520415816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term285818 = new Long(-4187265590402169996L);
        term285812 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term285814 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term285816 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286024 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term285812, term285812.getClass(), "id", 848612728392379464L);
        setLongField(term285814, term285814.getClass(), "id", -8328832119890386795L);
        setLongField(term285816, term285816.getClass(), "id", 2198934093484437202L);
        setField(term285816, term285816.getClass(), "extId", term285818);
        setField(term285816, term285816.getClass(), "luid", "MGvYGOoYyh");
        setIntField(term285833, term285833.getClass(), "year", 2028);
        setShortField(term285833, term285833.getClass(), "month", (short) 4);
        setShortField(term285833, term285833.getClass(), "day", (short) 8);
        setField(term285832, term285832.getClass(), "date", term285833);
        setByteField(term285837, term285837.getClass(), "hour", (byte) 11);
        setByteField(term285837, term285837.getClass(), "minute", (byte) 47);
        setByteField(term285837, term285837.getClass(), "second", (byte) 48);
        setIntField(term285837, term285837.getClass(), "nano", 447300029);
        setField(term285832, term285832.getClass(), "time", term285837);
        setField(term285816, term285816.getClass(), "registerTime", term285832);
        setIntField(term285843, term285843.getClass(), "year", 2019);
        setShortField(term285843, term285843.getClass(), "month", (short) 10);
        setShortField(term285843, term285843.getClass(), "day", (short) 1);
        setField(term285842, term285842.getClass(), "date", term285843);
        setByteField(term285847, term285847.getClass(), "hour", (byte) 4);
        setByteField(term285847, term285847.getClass(), "minute", (byte) 48);
        setByteField(term285847, term285847.getClass(), "second", (byte) 58);
        setIntField(term285847, term285847.getClass(), "nano", 517502106);
        setField(term285842, term285842.getClass(), "time", term285847);
        setField(term285816, term285816.getClass(), "accessTime", term285842);
        setField(term285814, term285814.getClass(), "card", term285816);
        setField(term285814, term285814.getClass(), "userName", "akolIywpGZ");
        setIntField(term285865, term285865.getClass(), "year", 2011);
        setShortField(term285865, term285865.getClass(), "month", (short) 2);
        setShortField(term285865, term285865.getClass(), "day", (short) 21);
        setField(term285864, term285864.getClass(), "date", term285865);
        setByteField(term285869, term285869.getClass(), "hour", (byte) 13);
        setByteField(term285869, term285869.getClass(), "minute", (byte) 49);
        setByteField(term285869, term285869.getClass(), "second", (byte) 55);
        setIntField(term285869, term285869.getClass(), "nano", 438151088);
        setField(term285864, term285864.getClass(), "time", term285869);
        setField(term285814, term285814.getClass(), "lastLoginDate", term285864);
        setBooleanField(term285814, term285814.getClass(), "isWebJoin", false);
        setField(term285814, term285814.getClass(), "webLimitDate", "GnPGHkkqXj");
        setIntField(term285814, term285814.getClass(), "level", -3714758);
        setIntField(term285814, term285814.getClass(), "reincarnationNum", -858513186);
        setField(term285814, term285814.getClass(), "exp", "yZrxnnzSIY");
        setLongField(term285814, term285814.getClass(), "point", -4524163752726588302L);
        setLongField(term285814, term285814.getClass(), "totalPoint", -3721456841949694712L);
        setIntField(term285814, term285814.getClass(), "playCount", 1203235853);
        setIntField(term285814, term285814.getClass(), "multiPlayCount", 1274844099);
        setIntField(term285814, term285814.getClass(), "multiWinCount", 601872271);
        setIntField(term285814, term285814.getClass(), "requestResCount", -450820124);
        setIntField(term285814, term285814.getClass(), "acceptResCount", 27602265);
        setIntField(term285814, term285814.getClass(), "successResCount", 1499859121);
        setIntField(term285814, term285814.getClass(), "playerRating", 1450681315);
        setIntField(term285814, term285814.getClass(), "highestRating", -1789757325);
        setIntField(term285814, term285814.getClass(), "nameplateId", 1038376802);
        setIntField(term285814, term285814.getClass(), "frameId", -200470581);
        setIntField(term285814, term285814.getClass(), "characterId", 495681073);
        setIntField(term285814, term285814.getClass(), "trophyId", 114045633);
        setIntField(term285814, term285814.getClass(), "playedTutorialBit", 1507770571);
        setIntField(term285814, term285814.getClass(), "firstTutorialCancelNum", -593285402);
        setIntField(term285814, term285814.getClass(), "masterTutorialCancelNum", 1095762061);
        setIntField(term285814, term285814.getClass(), "totalRepertoireCount", 1310320674);
        setIntField(term285814, term285814.getClass(), "totalMapNum", -45101595);
        setLongField(term285814, term285814.getClass(), "totalHiScore", -456836328448013051L);
        setLongField(term285814, term285814.getClass(), "totalBasicHighScore", -5921310990563765401L);
        setLongField(term285814, term285814.getClass(), "totalAdvancedHighScore", 3934914242875060981L);
        setLongField(term285814, term285814.getClass(), "totalExpertHighScore", -8399638382262003730L);
        setLongField(term285814, term285814.getClass(), "totalMasterHighScore", 1122416832206282085L);
        setIntField(term285926, term285926.getClass(), "year", 2028);
        setShortField(term285926, term285926.getClass(), "month", (short) 5);
        setShortField(term285926, term285926.getClass(), "day", (short) 9);
        setField(term285925, term285925.getClass(), "date", term285926);
        setByteField(term285930, term285930.getClass(), "hour", (byte) 6);
        setByteField(term285930, term285930.getClass(), "minute", (byte) 0);
        setByteField(term285930, term285930.getClass(), "second", (byte) 35);
        setIntField(term285930, term285930.getClass(), "nano", 23498161);
        setField(term285925, term285925.getClass(), "time", term285930);
        setField(term285814, term285814.getClass(), "eventWatchedDate", term285925);
        setIntField(term285814, term285814.getClass(), "friendCount", -1249978853);
        setBooleanField(term285814, term285814.getClass(), "isMaimai", false);
        setField(term285814, term285814.getClass(), "firstGameId", "EIuiJILbFJ");
        setField(term285814, term285814.getClass(), "firstRomVersion", "gmnZmbmANj");
        setField(term285814, term285814.getClass(), "firstDataVersion", "ugFTLYkUZt");
        setIntField(term285974, term285974.getClass(), "year", 2010);
        setShortField(term285974, term285974.getClass(), "month", (short) 12);
        setShortField(term285974, term285974.getClass(), "day", (short) 10);
        setField(term285973, term285973.getClass(), "date", term285974);
        setByteField(term285978, term285978.getClass(), "hour", (byte) 6);
        setByteField(term285978, term285978.getClass(), "minute", (byte) 25);
        setByteField(term285978, term285978.getClass(), "second", (byte) 4);
        setIntField(term285978, term285978.getClass(), "nano", 855396368);
        setField(term285973, term285973.getClass(), "time", term285978);
        setField(term285814, term285814.getClass(), "firstPlayDate", term285973);
        setField(term285814, term285814.getClass(), "lastGameId", "WHRCJzYcUs");
        setField(term285814, term285814.getClass(), "lastRomVersion", "eSqgLQrNqK");
        setField(term285814, term285814.getClass(), "lastDataVersion", "wOeEJTeZMX");
        setIntField(term286020, term286020.getClass(), "year", 2024);
        setShortField(term286020, term286020.getClass(), "month", (short) 2);
        setShortField(term286020, term286020.getClass(), "day", (short) 3);
        setField(term286019, term286019.getClass(), "date", term286020);
        setByteField(term286024, term286024.getClass(), "hour", (byte) 19);
        setByteField(term286024, term286024.getClass(), "minute", (byte) 58);
        setByteField(term286024, term286024.getClass(), "second", (byte) 34);
        setIntField(term286024, term286024.getClass(), "nano", 206896984);
        setField(term286019, term286019.getClass(), "time", term286024);
        setField(term285814, term285814.getClass(), "lastPlayDate", term286019);
        setIntField(term285814, term285814.getClass(), "lastPlaceId", 773182873);
        setField(term285814, term285814.getClass(), "lastPlaceName", "AcApCVcwZJ");
        setField(term285814, term285814.getClass(), "lastRegionId", "GAfAdudsTc");
        setField(term285814, term285814.getClass(), "lastRegionName", "vTQRVHEEmB");
        setField(term285814, term285814.getClass(), "lastAllNetId", "vJrTjupsCk");
        setField(term285814, term285814.getClass(), "lastClientId", "guXghgolSm");
        setField(term285812, term285812.getClass(), "user", term285814);
        setIntField(term285812, term285812.getClass(), "mapId", 1412041317);
        setIntField(term285812, term285812.getClass(), "position", 651388483);
        setBooleanField(term285812, term285812.getClass(), "isClear", false);
        setIntField(term285812, term285812.getClass(), "areaId", 223631307);
        setIntField(term285812, term285812.getClass(), "routeNumber", -812717507);
        setIntField(term285812, term285812.getClass(), "eventId", 1197190525);
        setIntField(term285812, term285812.getClass(), "rate", 45627277);
        setIntField(term285812, term285812.getClass(), "statusCount", 909630692);
        setBooleanField(term285812, term285812.getClass(), "isValid", true);
        term286099 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term286099;
        callMethod(klass, "setClear", argTypes, term285812, args);
    }

};


