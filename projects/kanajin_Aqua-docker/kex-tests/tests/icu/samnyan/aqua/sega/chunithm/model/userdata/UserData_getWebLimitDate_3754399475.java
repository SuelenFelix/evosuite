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

public class UserData_getWebLimitDate_3754399475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131511;

    public UserData_getWebLimitDate_3754399475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131515 = new Long(-2187638136407967948L);
        term131511 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term131513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131721 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131511, term131511.getClass(), "id", -1732771393859471811L);
        setLongField(term131513, term131513.getClass(), "id", 376617836260009696L);
        setField(term131513, term131513.getClass(), "extId", term131515);
        setField(term131513, term131513.getClass(), "luid", "MxPRraPVdF");
        setIntField(term131530, term131530.getClass(), "year", 2024);
        setShortField(term131530, term131530.getClass(), "month", (short) 4);
        setShortField(term131530, term131530.getClass(), "day", (short) 28);
        setField(term131529, term131529.getClass(), "date", term131530);
        setByteField(term131534, term131534.getClass(), "hour", (byte) 13);
        setByteField(term131534, term131534.getClass(), "minute", (byte) 46);
        setByteField(term131534, term131534.getClass(), "second", (byte) 31);
        setIntField(term131534, term131534.getClass(), "nano", 344074294);
        setField(term131529, term131529.getClass(), "time", term131534);
        setField(term131513, term131513.getClass(), "registerTime", term131529);
        setIntField(term131540, term131540.getClass(), "year", 2022);
        setShortField(term131540, term131540.getClass(), "month", (short) 9);
        setShortField(term131540, term131540.getClass(), "day", (short) 30);
        setField(term131539, term131539.getClass(), "date", term131540);
        setByteField(term131544, term131544.getClass(), "hour", (byte) 1);
        setByteField(term131544, term131544.getClass(), "minute", (byte) 7);
        setByteField(term131544, term131544.getClass(), "second", (byte) 13);
        setIntField(term131544, term131544.getClass(), "nano", 662975228);
        setField(term131539, term131539.getClass(), "time", term131544);
        setField(term131513, term131513.getClass(), "accessTime", term131539);
        setField(term131511, term131511.getClass(), "card", term131513);
        setField(term131511, term131511.getClass(), "userName", "dnWHLTYWVU");
        setIntField(term131562, term131562.getClass(), "year", 2015);
        setShortField(term131562, term131562.getClass(), "month", (short) 3);
        setShortField(term131562, term131562.getClass(), "day", (short) 16);
        setField(term131561, term131561.getClass(), "date", term131562);
        setByteField(term131566, term131566.getClass(), "hour", (byte) 9);
        setByteField(term131566, term131566.getClass(), "minute", (byte) 40);
        setByteField(term131566, term131566.getClass(), "second", (byte) 0);
        setIntField(term131566, term131566.getClass(), "nano", 256646409);
        setField(term131561, term131561.getClass(), "time", term131566);
        setField(term131511, term131511.getClass(), "lastLoginDate", term131561);
        setBooleanField(term131511, term131511.getClass(), "isWebJoin", false);
        setField(term131511, term131511.getClass(), "webLimitDate", "AOSOeWGCwi");
        setIntField(term131511, term131511.getClass(), "level", 1003344868);
        setIntField(term131511, term131511.getClass(), "reincarnationNum", 699428605);
        setField(term131511, term131511.getClass(), "exp", "pBmevrFCmp");
        setLongField(term131511, term131511.getClass(), "point", 7959584504878946737L);
        setLongField(term131511, term131511.getClass(), "totalPoint", -46420887778055199L);
        setIntField(term131511, term131511.getClass(), "playCount", -984536386);
        setIntField(term131511, term131511.getClass(), "multiPlayCount", -394673031);
        setIntField(term131511, term131511.getClass(), "multiWinCount", -2114266331);
        setIntField(term131511, term131511.getClass(), "requestResCount", 1060512544);
        setIntField(term131511, term131511.getClass(), "acceptResCount", 733910191);
        setIntField(term131511, term131511.getClass(), "successResCount", -1299247390);
        setIntField(term131511, term131511.getClass(), "playerRating", 901132234);
        setIntField(term131511, term131511.getClass(), "highestRating", -205835456);
        setIntField(term131511, term131511.getClass(), "nameplateId", 889992615);
        setIntField(term131511, term131511.getClass(), "frameId", 1184212871);
        setIntField(term131511, term131511.getClass(), "characterId", 1318633291);
        setIntField(term131511, term131511.getClass(), "trophyId", 163521915);
        setIntField(term131511, term131511.getClass(), "playedTutorialBit", 208383602);
        setIntField(term131511, term131511.getClass(), "firstTutorialCancelNum", -936623097);
        setIntField(term131511, term131511.getClass(), "masterTutorialCancelNum", -1148000466);
        setIntField(term131511, term131511.getClass(), "totalRepertoireCount", 1299330727);
        setIntField(term131511, term131511.getClass(), "totalMapNum", 1541672801);
        setLongField(term131511, term131511.getClass(), "totalHiScore", 7667843194609869185L);
        setLongField(term131511, term131511.getClass(), "totalBasicHighScore", -6200837024273756516L);
        setLongField(term131511, term131511.getClass(), "totalAdvancedHighScore", 9046663610727775978L);
        setLongField(term131511, term131511.getClass(), "totalExpertHighScore", 6115702104023062411L);
        setLongField(term131511, term131511.getClass(), "totalMasterHighScore", -7393121202464432000L);
        setIntField(term131623, term131623.getClass(), "year", 2017);
        setShortField(term131623, term131623.getClass(), "month", (short) 7);
        setShortField(term131623, term131623.getClass(), "day", (short) 18);
        setField(term131622, term131622.getClass(), "date", term131623);
        setByteField(term131627, term131627.getClass(), "hour", (byte) 16);
        setByteField(term131627, term131627.getClass(), "minute", (byte) 39);
        setByteField(term131627, term131627.getClass(), "second", (byte) 12);
        setIntField(term131627, term131627.getClass(), "nano", 167635063);
        setField(term131622, term131622.getClass(), "time", term131627);
        setField(term131511, term131511.getClass(), "eventWatchedDate", term131622);
        setIntField(term131511, term131511.getClass(), "friendCount", -1723354196);
        setBooleanField(term131511, term131511.getClass(), "isMaimai", true);
        setField(term131511, term131511.getClass(), "firstGameId", "DOCvwqbYDn");
        setField(term131511, term131511.getClass(), "firstRomVersion", "mnqceiHjKv");
        setField(term131511, term131511.getClass(), "firstDataVersion", "AsVDXoZoBU");
        setIntField(term131671, term131671.getClass(), "year", 2028);
        setShortField(term131671, term131671.getClass(), "month", (short) 9);
        setShortField(term131671, term131671.getClass(), "day", (short) 25);
        setField(term131670, term131670.getClass(), "date", term131671);
        setByteField(term131675, term131675.getClass(), "hour", (byte) 14);
        setByteField(term131675, term131675.getClass(), "minute", (byte) 21);
        setByteField(term131675, term131675.getClass(), "second", (byte) 57);
        setIntField(term131675, term131675.getClass(), "nano", 769245395);
        setField(term131670, term131670.getClass(), "time", term131675);
        setField(term131511, term131511.getClass(), "firstPlayDate", term131670);
        setField(term131511, term131511.getClass(), "lastGameId", "cPxpxZMgIo");
        setField(term131511, term131511.getClass(), "lastRomVersion", "uWtOISrfeA");
        setField(term131511, term131511.getClass(), "lastDataVersion", "tYlSzqLqvb");
        setIntField(term131717, term131717.getClass(), "year", 2015);
        setShortField(term131717, term131717.getClass(), "month", (short) 5);
        setShortField(term131717, term131717.getClass(), "day", (short) 20);
        setField(term131716, term131716.getClass(), "date", term131717);
        setByteField(term131721, term131721.getClass(), "hour", (byte) 15);
        setByteField(term131721, term131721.getClass(), "minute", (byte) 23);
        setByteField(term131721, term131721.getClass(), "second", (byte) 59);
        setIntField(term131721, term131721.getClass(), "nano", 160941979);
        setField(term131716, term131716.getClass(), "time", term131721);
        setField(term131511, term131511.getClass(), "lastPlayDate", term131716);
        setIntField(term131511, term131511.getClass(), "lastPlaceId", -19725944);
        setField(term131511, term131511.getClass(), "lastPlaceName", "GzeLmNKDuY");
        setField(term131511, term131511.getClass(), "lastRegionId", "hPPpARaLPc");
        setField(term131511, term131511.getClass(), "lastRegionName", "DtBDapYLSe");
        setField(term131511, term131511.getClass(), "lastAllNetId", "PrJzEmEvlo");
        setField(term131511, term131511.getClass(), "lastClientId", "DWGWVuqpug");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebLimitDate", argTypes, term131511, args);
    }

};


