package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserDuelService_getByUserAndDuelId_16863683220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720;
     Object term4996;

    public UserDuelService_getByUserAndDuelId_16863683220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4724 = new Long(-316468845751588286L);
        term4720 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term4722 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4743 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4775 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4930 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4720, term4720.getClass(), "id", -6587807377747738663L);
        setLongField(term4722, term4722.getClass(), "id", -6301101997917060727L);
        setField(term4722, term4722.getClass(), "extId", term4724);
        setField(term4722, term4722.getClass(), "luid", "aSkmSwTnEw");
        setIntField(term4739, term4739.getClass(), "year", 2029);
        setShortField(term4739, term4739.getClass(), "month", (short) 7);
        setShortField(term4739, term4739.getClass(), "day", (short) 19);
        setField(term4738, term4738.getClass(), "date", term4739);
        setByteField(term4743, term4743.getClass(), "hour", (byte) 17);
        setByteField(term4743, term4743.getClass(), "minute", (byte) 37);
        setByteField(term4743, term4743.getClass(), "second", (byte) 21);
        setIntField(term4743, term4743.getClass(), "nano", 320093277);
        setField(term4738, term4738.getClass(), "time", term4743);
        setField(term4722, term4722.getClass(), "registerTime", term4738);
        setIntField(term4749, term4749.getClass(), "year", 2028);
        setShortField(term4749, term4749.getClass(), "month", (short) 1);
        setShortField(term4749, term4749.getClass(), "day", (short) 11);
        setField(term4748, term4748.getClass(), "date", term4749);
        setByteField(term4753, term4753.getClass(), "hour", (byte) 22);
        setByteField(term4753, term4753.getClass(), "minute", (byte) 3);
        setByteField(term4753, term4753.getClass(), "second", (byte) 39);
        setIntField(term4753, term4753.getClass(), "nano", 175567313);
        setField(term4748, term4748.getClass(), "time", term4753);
        setField(term4722, term4722.getClass(), "accessTime", term4748);
        setField(term4720, term4720.getClass(), "card", term4722);
        setField(term4720, term4720.getClass(), "userName", "xvkbvaEGYd");
        setIntField(term4771, term4771.getClass(), "year", 2028);
        setShortField(term4771, term4771.getClass(), "month", (short) 4);
        setShortField(term4771, term4771.getClass(), "day", (short) 11);
        setField(term4770, term4770.getClass(), "date", term4771);
        setByteField(term4775, term4775.getClass(), "hour", (byte) 4);
        setByteField(term4775, term4775.getClass(), "minute", (byte) 45);
        setByteField(term4775, term4775.getClass(), "second", (byte) 2);
        setIntField(term4775, term4775.getClass(), "nano", 374177968);
        setField(term4770, term4770.getClass(), "time", term4775);
        setField(term4720, term4720.getClass(), "lastLoginDate", term4770);
        setBooleanField(term4720, term4720.getClass(), "isWebJoin", true);
        setField(term4720, term4720.getClass(), "webLimitDate", "HBGNxdNURv");
        setIntField(term4720, term4720.getClass(), "level", -1865023308);
        setIntField(term4720, term4720.getClass(), "reincarnationNum", 1698510819);
        setField(term4720, term4720.getClass(), "exp", "mfCpTPPQQm");
        setLongField(term4720, term4720.getClass(), "point", 8166095254618543564L);
        setLongField(term4720, term4720.getClass(), "totalPoint", -4598158870068953328L);
        setIntField(term4720, term4720.getClass(), "playCount", -1553893255);
        setIntField(term4720, term4720.getClass(), "multiPlayCount", 1303442927);
        setIntField(term4720, term4720.getClass(), "multiWinCount", 794568325);
        setIntField(term4720, term4720.getClass(), "requestResCount", -434468428);
        setIntField(term4720, term4720.getClass(), "acceptResCount", 1559605714);
        setIntField(term4720, term4720.getClass(), "successResCount", 1146601902);
        setIntField(term4720, term4720.getClass(), "playerRating", -1938881385);
        setIntField(term4720, term4720.getClass(), "highestRating", -1629418973);
        setIntField(term4720, term4720.getClass(), "nameplateId", -100825168);
        setIntField(term4720, term4720.getClass(), "frameId", 768407648);
        setIntField(term4720, term4720.getClass(), "characterId", -350454594);
        setIntField(term4720, term4720.getClass(), "trophyId", -1148142995);
        setIntField(term4720, term4720.getClass(), "playedTutorialBit", -233024044);
        setIntField(term4720, term4720.getClass(), "firstTutorialCancelNum", 1820784228);
        setIntField(term4720, term4720.getClass(), "masterTutorialCancelNum", 1390820006);
        setIntField(term4720, term4720.getClass(), "totalRepertoireCount", -828982065);
        setIntField(term4720, term4720.getClass(), "totalMapNum", 1221443226);
        setLongField(term4720, term4720.getClass(), "totalHiScore", 138235087558060686L);
        setLongField(term4720, term4720.getClass(), "totalBasicHighScore", 5381386339318883012L);
        setLongField(term4720, term4720.getClass(), "totalAdvancedHighScore", -1333707622307134180L);
        setLongField(term4720, term4720.getClass(), "totalExpertHighScore", -4360569253593381888L);
        setLongField(term4720, term4720.getClass(), "totalMasterHighScore", 1457594663983990440L);
        setIntField(term4832, term4832.getClass(), "year", 2021);
        setShortField(term4832, term4832.getClass(), "month", (short) 4);
        setShortField(term4832, term4832.getClass(), "day", (short) 22);
        setField(term4831, term4831.getClass(), "date", term4832);
        setByteField(term4836, term4836.getClass(), "hour", (byte) 17);
        setByteField(term4836, term4836.getClass(), "minute", (byte) 6);
        setByteField(term4836, term4836.getClass(), "second", (byte) 33);
        setIntField(term4836, term4836.getClass(), "nano", 21410850);
        setField(term4831, term4831.getClass(), "time", term4836);
        setField(term4720, term4720.getClass(), "eventWatchedDate", term4831);
        setIntField(term4720, term4720.getClass(), "friendCount", 908108726);
        setBooleanField(term4720, term4720.getClass(), "isMaimai", true);
        setField(term4720, term4720.getClass(), "firstGameId", "OcJCIDNIXA");
        setField(term4720, term4720.getClass(), "firstRomVersion", "XfRABIFVEp");
        setField(term4720, term4720.getClass(), "firstDataVersion", "MHGKyEnwKc");
        setIntField(term4880, term4880.getClass(), "year", 2026);
        setShortField(term4880, term4880.getClass(), "month", (short) 10);
        setShortField(term4880, term4880.getClass(), "day", (short) 19);
        setField(term4879, term4879.getClass(), "date", term4880);
        setByteField(term4884, term4884.getClass(), "hour", (byte) 7);
        setByteField(term4884, term4884.getClass(), "minute", (byte) 22);
        setByteField(term4884, term4884.getClass(), "second", (byte) 11);
        setIntField(term4884, term4884.getClass(), "nano", 17846677);
        setField(term4879, term4879.getClass(), "time", term4884);
        setField(term4720, term4720.getClass(), "firstPlayDate", term4879);
        setField(term4720, term4720.getClass(), "lastGameId", "ShIELyuULw");
        setField(term4720, term4720.getClass(), "lastRomVersion", "IpQuOGMgmj");
        setField(term4720, term4720.getClass(), "lastDataVersion", "pJbnHTYrxn");
        setIntField(term4926, term4926.getClass(), "year", 2018);
        setShortField(term4926, term4926.getClass(), "month", (short) 10);
        setShortField(term4926, term4926.getClass(), "day", (short) 17);
        setField(term4925, term4925.getClass(), "date", term4926);
        setByteField(term4930, term4930.getClass(), "hour", (byte) 5);
        setByteField(term4930, term4930.getClass(), "minute", (byte) 10);
        setByteField(term4930, term4930.getClass(), "second", (byte) 23);
        setIntField(term4930, term4930.getClass(), "nano", 571520422);
        setField(term4925, term4925.getClass(), "time", term4930);
        setField(term4720, term4720.getClass(), "lastPlayDate", term4925);
        setIntField(term4720, term4720.getClass(), "lastPlaceId", 1023209512);
        setField(term4720, term4720.getClass(), "lastPlaceName", "iIRsCSYqXH");
        setField(term4720, term4720.getClass(), "lastRegionId", "nghfqDXyCG");
        setField(term4720, term4720.getClass(), "lastRegionName", "WBAOTqErtm");
        setField(term4720, term4720.getClass(), "lastAllNetId", "PqtVXXZMqK");
        setField(term4720, term4720.getClass(), "lastClientId", "rYbtIDVdnd");
        term4996 = new Integer(1084849225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDuelService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4720;
        args[1] = term4996;
        callMethod(klass, "getByUserAndDuelId", argTypes, null, args);
    }

};


