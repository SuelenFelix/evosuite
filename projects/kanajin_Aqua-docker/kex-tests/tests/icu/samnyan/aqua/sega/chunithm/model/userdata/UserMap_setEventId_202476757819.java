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

public class UserMap_setEventId_202476757819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287129;
     Object term287416;

    public UserMap_setEventId_202476757819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term287135 = new Long(-7062466217011408314L);
        term287129 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term287131 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term287133 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term287149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287295 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287341 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term287129, term287129.getClass(), "id", -284959417941334238L);
        setLongField(term287131, term287131.getClass(), "id", -2642626234707592872L);
        setLongField(term287133, term287133.getClass(), "id", -7405060556842728806L);
        setField(term287133, term287133.getClass(), "extId", term287135);
        setField(term287133, term287133.getClass(), "luid", "oovEoPNoDL");
        setIntField(term287150, term287150.getClass(), "year", 2028);
        setShortField(term287150, term287150.getClass(), "month", (short) 10);
        setShortField(term287150, term287150.getClass(), "day", (short) 19);
        setField(term287149, term287149.getClass(), "date", term287150);
        setByteField(term287154, term287154.getClass(), "hour", (byte) 11);
        setByteField(term287154, term287154.getClass(), "minute", (byte) 39);
        setByteField(term287154, term287154.getClass(), "second", (byte) 54);
        setIntField(term287154, term287154.getClass(), "nano", 644339690);
        setField(term287149, term287149.getClass(), "time", term287154);
        setField(term287133, term287133.getClass(), "registerTime", term287149);
        setIntField(term287160, term287160.getClass(), "year", 2023);
        setShortField(term287160, term287160.getClass(), "month", (short) 2);
        setShortField(term287160, term287160.getClass(), "day", (short) 25);
        setField(term287159, term287159.getClass(), "date", term287160);
        setByteField(term287164, term287164.getClass(), "hour", (byte) 14);
        setByteField(term287164, term287164.getClass(), "minute", (byte) 43);
        setByteField(term287164, term287164.getClass(), "second", (byte) 7);
        setIntField(term287164, term287164.getClass(), "nano", 309077633);
        setField(term287159, term287159.getClass(), "time", term287164);
        setField(term287133, term287133.getClass(), "accessTime", term287159);
        setField(term287131, term287131.getClass(), "card", term287133);
        setField(term287131, term287131.getClass(), "userName", "oflVrdmLzV");
        setIntField(term287182, term287182.getClass(), "year", 2024);
        setShortField(term287182, term287182.getClass(), "month", (short) 9);
        setShortField(term287182, term287182.getClass(), "day", (short) 18);
        setField(term287181, term287181.getClass(), "date", term287182);
        setByteField(term287186, term287186.getClass(), "hour", (byte) 7);
        setByteField(term287186, term287186.getClass(), "minute", (byte) 11);
        setByteField(term287186, term287186.getClass(), "second", (byte) 1);
        setIntField(term287186, term287186.getClass(), "nano", 453796794);
        setField(term287181, term287181.getClass(), "time", term287186);
        setField(term287131, term287131.getClass(), "lastLoginDate", term287181);
        setBooleanField(term287131, term287131.getClass(), "isWebJoin", false);
        setField(term287131, term287131.getClass(), "webLimitDate", "RrqOknhAbQ");
        setIntField(term287131, term287131.getClass(), "level", 867687605);
        setIntField(term287131, term287131.getClass(), "reincarnationNum", 827594613);
        setField(term287131, term287131.getClass(), "exp", "JgwCJZKOrP");
        setLongField(term287131, term287131.getClass(), "point", -4527791479018516668L);
        setLongField(term287131, term287131.getClass(), "totalPoint", -2612967577904398834L);
        setIntField(term287131, term287131.getClass(), "playCount", -1402852908);
        setIntField(term287131, term287131.getClass(), "multiPlayCount", -221528448);
        setIntField(term287131, term287131.getClass(), "multiWinCount", 231614322);
        setIntField(term287131, term287131.getClass(), "requestResCount", 1911982519);
        setIntField(term287131, term287131.getClass(), "acceptResCount", -246377509);
        setIntField(term287131, term287131.getClass(), "successResCount", 173988221);
        setIntField(term287131, term287131.getClass(), "playerRating", -1062462809);
        setIntField(term287131, term287131.getClass(), "highestRating", 263324057);
        setIntField(term287131, term287131.getClass(), "nameplateId", -1978777233);
        setIntField(term287131, term287131.getClass(), "frameId", -1727096369);
        setIntField(term287131, term287131.getClass(), "characterId", -715689449);
        setIntField(term287131, term287131.getClass(), "trophyId", -928679856);
        setIntField(term287131, term287131.getClass(), "playedTutorialBit", 1866091658);
        setIntField(term287131, term287131.getClass(), "firstTutorialCancelNum", -1857761236);
        setIntField(term287131, term287131.getClass(), "masterTutorialCancelNum", 1011954389);
        setIntField(term287131, term287131.getClass(), "totalRepertoireCount", 2058624555);
        setIntField(term287131, term287131.getClass(), "totalMapNum", 2069499390);
        setLongField(term287131, term287131.getClass(), "totalHiScore", -6151359199860064110L);
        setLongField(term287131, term287131.getClass(), "totalBasicHighScore", 7248988630031261484L);
        setLongField(term287131, term287131.getClass(), "totalAdvancedHighScore", 3319565167580239453L);
        setLongField(term287131, term287131.getClass(), "totalExpertHighScore", 7665122090516509718L);
        setLongField(term287131, term287131.getClass(), "totalMasterHighScore", -8965803539495697005L);
        setIntField(term287243, term287243.getClass(), "year", 2029);
        setShortField(term287243, term287243.getClass(), "month", (short) 8);
        setShortField(term287243, term287243.getClass(), "day", (short) 5);
        setField(term287242, term287242.getClass(), "date", term287243);
        setByteField(term287247, term287247.getClass(), "hour", (byte) 20);
        setByteField(term287247, term287247.getClass(), "minute", (byte) 21);
        setByteField(term287247, term287247.getClass(), "second", (byte) 40);
        setIntField(term287247, term287247.getClass(), "nano", 151605141);
        setField(term287242, term287242.getClass(), "time", term287247);
        setField(term287131, term287131.getClass(), "eventWatchedDate", term287242);
        setIntField(term287131, term287131.getClass(), "friendCount", 1294260412);
        setBooleanField(term287131, term287131.getClass(), "isMaimai", false);
        setField(term287131, term287131.getClass(), "firstGameId", "HrQeKGmoKp");
        setField(term287131, term287131.getClass(), "firstRomVersion", "xEsTyydekp");
        setField(term287131, term287131.getClass(), "firstDataVersion", "ZjkBEbQCcc");
        setIntField(term287291, term287291.getClass(), "year", 2029);
        setShortField(term287291, term287291.getClass(), "month", (short) 7);
        setShortField(term287291, term287291.getClass(), "day", (short) 14);
        setField(term287290, term287290.getClass(), "date", term287291);
        setByteField(term287295, term287295.getClass(), "hour", (byte) 11);
        setByteField(term287295, term287295.getClass(), "minute", (byte) 2);
        setByteField(term287295, term287295.getClass(), "second", (byte) 30);
        setIntField(term287295, term287295.getClass(), "nano", 246705357);
        setField(term287290, term287290.getClass(), "time", term287295);
        setField(term287131, term287131.getClass(), "firstPlayDate", term287290);
        setField(term287131, term287131.getClass(), "lastGameId", "oiGazRusBr");
        setField(term287131, term287131.getClass(), "lastRomVersion", "OPiUmYGtvL");
        setField(term287131, term287131.getClass(), "lastDataVersion", "PYXQFMpHgr");
        setIntField(term287337, term287337.getClass(), "year", 2021);
        setShortField(term287337, term287337.getClass(), "month", (short) 2);
        setShortField(term287337, term287337.getClass(), "day", (short) 8);
        setField(term287336, term287336.getClass(), "date", term287337);
        setByteField(term287341, term287341.getClass(), "hour", (byte) 7);
        setByteField(term287341, term287341.getClass(), "minute", (byte) 18);
        setByteField(term287341, term287341.getClass(), "second", (byte) 23);
        setIntField(term287341, term287341.getClass(), "nano", 742044355);
        setField(term287336, term287336.getClass(), "time", term287341);
        setField(term287131, term287131.getClass(), "lastPlayDate", term287336);
        setIntField(term287131, term287131.getClass(), "lastPlaceId", -1539938534);
        setField(term287131, term287131.getClass(), "lastPlaceName", "PxRBsVnNDB");
        setField(term287131, term287131.getClass(), "lastRegionId", "wUGJdObirh");
        setField(term287131, term287131.getClass(), "lastRegionName", "fwRConrHOE");
        setField(term287131, term287131.getClass(), "lastAllNetId", "AXuVUkyDUa");
        setField(term287131, term287131.getClass(), "lastClientId", "OqUCbfAuLF");
        setField(term287129, term287129.getClass(), "user", term287131);
        setIntField(term287129, term287129.getClass(), "mapId", 1847970773);
        setIntField(term287129, term287129.getClass(), "position", -1180930206);
        setBooleanField(term287129, term287129.getClass(), "isClear", false);
        setIntField(term287129, term287129.getClass(), "areaId", -1203324932);
        setIntField(term287129, term287129.getClass(), "routeNumber", -1265613992);
        setIntField(term287129, term287129.getClass(), "eventId", -402209834);
        setIntField(term287129, term287129.getClass(), "rate", -1641289658);
        setIntField(term287129, term287129.getClass(), "statusCount", 2014093797);
        setBooleanField(term287129, term287129.getClass(), "isValid", false);
        term287416 = new Integer(-556201841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term287416;
        callMethod(klass, "setEventId", argTypes, term287129, args);
    }

};


