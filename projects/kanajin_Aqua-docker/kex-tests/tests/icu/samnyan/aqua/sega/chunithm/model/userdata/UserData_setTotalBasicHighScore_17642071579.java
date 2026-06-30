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

public class UserData_setTotalBasicHighScore_17642071579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163205;
     Object term163481;

    public UserData_setTotalBasicHighScore_17642071579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163209 = new Long(2722004046017350471L);
        term163205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term163207 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163205, term163205.getClass(), "id", -6914694737907908084L);
        setLongField(term163207, term163207.getClass(), "id", -6243455599728192585L);
        setField(term163207, term163207.getClass(), "extId", term163209);
        setField(term163207, term163207.getClass(), "luid", "LjyAsUkMpT");
        setIntField(term163224, term163224.getClass(), "year", 2029);
        setShortField(term163224, term163224.getClass(), "month", (short) 5);
        setShortField(term163224, term163224.getClass(), "day", (short) 7);
        setField(term163223, term163223.getClass(), "date", term163224);
        setByteField(term163228, term163228.getClass(), "hour", (byte) 23);
        setByteField(term163228, term163228.getClass(), "minute", (byte) 12);
        setByteField(term163228, term163228.getClass(), "second", (byte) 21);
        setIntField(term163228, term163228.getClass(), "nano", 194385232);
        setField(term163223, term163223.getClass(), "time", term163228);
        setField(term163207, term163207.getClass(), "registerTime", term163223);
        setIntField(term163234, term163234.getClass(), "year", 2027);
        setShortField(term163234, term163234.getClass(), "month", (short) 2);
        setShortField(term163234, term163234.getClass(), "day", (short) 2);
        setField(term163233, term163233.getClass(), "date", term163234);
        setByteField(term163238, term163238.getClass(), "hour", (byte) 4);
        setByteField(term163238, term163238.getClass(), "minute", (byte) 58);
        setByteField(term163238, term163238.getClass(), "second", (byte) 34);
        setIntField(term163238, term163238.getClass(), "nano", 986433037);
        setField(term163233, term163233.getClass(), "time", term163238);
        setField(term163207, term163207.getClass(), "accessTime", term163233);
        setField(term163205, term163205.getClass(), "card", term163207);
        setField(term163205, term163205.getClass(), "userName", "eVYbmAKfrT");
        setIntField(term163256, term163256.getClass(), "year", 2013);
        setShortField(term163256, term163256.getClass(), "month", (short) 2);
        setShortField(term163256, term163256.getClass(), "day", (short) 22);
        setField(term163255, term163255.getClass(), "date", term163256);
        setByteField(term163260, term163260.getClass(), "hour", (byte) 21);
        setByteField(term163260, term163260.getClass(), "minute", (byte) 51);
        setByteField(term163260, term163260.getClass(), "second", (byte) 50);
        setIntField(term163260, term163260.getClass(), "nano", 560033417);
        setField(term163255, term163255.getClass(), "time", term163260);
        setField(term163205, term163205.getClass(), "lastLoginDate", term163255);
        setBooleanField(term163205, term163205.getClass(), "isWebJoin", true);
        setField(term163205, term163205.getClass(), "webLimitDate", "OpDokNbkSu");
        setIntField(term163205, term163205.getClass(), "level", 1813360939);
        setIntField(term163205, term163205.getClass(), "reincarnationNum", 565044482);
        setField(term163205, term163205.getClass(), "exp", "yHeJtottbK");
        setLongField(term163205, term163205.getClass(), "point", 575531199587856686L);
        setLongField(term163205, term163205.getClass(), "totalPoint", 3807044363471281164L);
        setIntField(term163205, term163205.getClass(), "playCount", -1069288589);
        setIntField(term163205, term163205.getClass(), "multiPlayCount", -1297223247);
        setIntField(term163205, term163205.getClass(), "multiWinCount", -149276178);
        setIntField(term163205, term163205.getClass(), "requestResCount", -1938083024);
        setIntField(term163205, term163205.getClass(), "acceptResCount", -2147408216);
        setIntField(term163205, term163205.getClass(), "successResCount", 678386871);
        setIntField(term163205, term163205.getClass(), "playerRating", -1142230123);
        setIntField(term163205, term163205.getClass(), "highestRating", 247506012);
        setIntField(term163205, term163205.getClass(), "nameplateId", -2049735614);
        setIntField(term163205, term163205.getClass(), "frameId", 1127804536);
        setIntField(term163205, term163205.getClass(), "characterId", 1755642591);
        setIntField(term163205, term163205.getClass(), "trophyId", -1387996294);
        setIntField(term163205, term163205.getClass(), "playedTutorialBit", -1638476156);
        setIntField(term163205, term163205.getClass(), "firstTutorialCancelNum", 507935099);
        setIntField(term163205, term163205.getClass(), "masterTutorialCancelNum", -2108922856);
        setIntField(term163205, term163205.getClass(), "totalRepertoireCount", -1519649466);
        setIntField(term163205, term163205.getClass(), "totalMapNum", 2110120015);
        setLongField(term163205, term163205.getClass(), "totalHiScore", 1004540771182420963L);
        setLongField(term163205, term163205.getClass(), "totalBasicHighScore", 8812485782991578366L);
        setLongField(term163205, term163205.getClass(), "totalAdvancedHighScore", 2565913054502508437L);
        setLongField(term163205, term163205.getClass(), "totalExpertHighScore", -454342664626660706L);
        setLongField(term163205, term163205.getClass(), "totalMasterHighScore", -5121930167263789646L);
        setIntField(term163317, term163317.getClass(), "year", 2010);
        setShortField(term163317, term163317.getClass(), "month", (short) 12);
        setShortField(term163317, term163317.getClass(), "day", (short) 8);
        setField(term163316, term163316.getClass(), "date", term163317);
        setByteField(term163321, term163321.getClass(), "hour", (byte) 7);
        setByteField(term163321, term163321.getClass(), "minute", (byte) 37);
        setByteField(term163321, term163321.getClass(), "second", (byte) 17);
        setIntField(term163321, term163321.getClass(), "nano", 788417960);
        setField(term163316, term163316.getClass(), "time", term163321);
        setField(term163205, term163205.getClass(), "eventWatchedDate", term163316);
        setIntField(term163205, term163205.getClass(), "friendCount", 358085307);
        setBooleanField(term163205, term163205.getClass(), "isMaimai", false);
        setField(term163205, term163205.getClass(), "firstGameId", "EsebiMkeGU");
        setField(term163205, term163205.getClass(), "firstRomVersion", "ronKInFVff");
        setField(term163205, term163205.getClass(), "firstDataVersion", "OTWCnNUjew");
        setIntField(term163365, term163365.getClass(), "year", 2024);
        setShortField(term163365, term163365.getClass(), "month", (short) 7);
        setShortField(term163365, term163365.getClass(), "day", (short) 13);
        setField(term163364, term163364.getClass(), "date", term163365);
        setByteField(term163369, term163369.getClass(), "hour", (byte) 1);
        setByteField(term163369, term163369.getClass(), "minute", (byte) 18);
        setByteField(term163369, term163369.getClass(), "second", (byte) 46);
        setIntField(term163369, term163369.getClass(), "nano", 426679223);
        setField(term163364, term163364.getClass(), "time", term163369);
        setField(term163205, term163205.getClass(), "firstPlayDate", term163364);
        setField(term163205, term163205.getClass(), "lastGameId", "oUSILMxQiI");
        setField(term163205, term163205.getClass(), "lastRomVersion", "dohWFHGwwR");
        setField(term163205, term163205.getClass(), "lastDataVersion", "yXKOrgWdes");
        setIntField(term163411, term163411.getClass(), "year", 2027);
        setShortField(term163411, term163411.getClass(), "month", (short) 12);
        setShortField(term163411, term163411.getClass(), "day", (short) 21);
        setField(term163410, term163410.getClass(), "date", term163411);
        setByteField(term163415, term163415.getClass(), "hour", (byte) 4);
        setByteField(term163415, term163415.getClass(), "minute", (byte) 59);
        setByteField(term163415, term163415.getClass(), "second", (byte) 10);
        setIntField(term163415, term163415.getClass(), "nano", 910395692);
        setField(term163410, term163410.getClass(), "time", term163415);
        setField(term163205, term163205.getClass(), "lastPlayDate", term163410);
        setIntField(term163205, term163205.getClass(), "lastPlaceId", -1882759029);
        setField(term163205, term163205.getClass(), "lastPlaceName", "LIssGNIAFq");
        setField(term163205, term163205.getClass(), "lastRegionId", "MqkrVMSgoi");
        setField(term163205, term163205.getClass(), "lastRegionName", "mBvhIZezxE");
        setField(term163205, term163205.getClass(), "lastAllNetId", "sswCagQpqo");
        setField(term163205, term163205.getClass(), "lastClientId", "LrwYiZGGQg");
        term163481 = new Long(-5176212278898409578L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term163481;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term163205, args);
    }

};


