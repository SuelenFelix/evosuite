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

public class UserMap_toString_38792171026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290198;

    public UserMap_toString_38792171026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290204 = new Long(9160882370265093763L);
        term290198 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term290200 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term290202 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term290218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290223 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290410 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term290198, term290198.getClass(), "id", -6842571177438982724L);
        setLongField(term290200, term290200.getClass(), "id", 4190870724733110372L);
        setLongField(term290202, term290202.getClass(), "id", 5014808953079526280L);
        setField(term290202, term290202.getClass(), "extId", term290204);
        setField(term290202, term290202.getClass(), "luid", "jMaSLvIsta");
        setIntField(term290219, term290219.getClass(), "year", 2019);
        setShortField(term290219, term290219.getClass(), "month", (short) 11);
        setShortField(term290219, term290219.getClass(), "day", (short) 1);
        setField(term290218, term290218.getClass(), "date", term290219);
        setByteField(term290223, term290223.getClass(), "hour", (byte) 19);
        setByteField(term290223, term290223.getClass(), "minute", (byte) 39);
        setByteField(term290223, term290223.getClass(), "second", (byte) 56);
        setIntField(term290223, term290223.getClass(), "nano", 928119716);
        setField(term290218, term290218.getClass(), "time", term290223);
        setField(term290202, term290202.getClass(), "registerTime", term290218);
        setIntField(term290229, term290229.getClass(), "year", 2025);
        setShortField(term290229, term290229.getClass(), "month", (short) 7);
        setShortField(term290229, term290229.getClass(), "day", (short) 21);
        setField(term290228, term290228.getClass(), "date", term290229);
        setByteField(term290233, term290233.getClass(), "hour", (byte) 14);
        setByteField(term290233, term290233.getClass(), "minute", (byte) 42);
        setByteField(term290233, term290233.getClass(), "second", (byte) 43);
        setIntField(term290233, term290233.getClass(), "nano", 648922038);
        setField(term290228, term290228.getClass(), "time", term290233);
        setField(term290202, term290202.getClass(), "accessTime", term290228);
        setField(term290200, term290200.getClass(), "card", term290202);
        setField(term290200, term290200.getClass(), "userName", "sSyiKfZXEJ");
        setIntField(term290251, term290251.getClass(), "year", 2015);
        setShortField(term290251, term290251.getClass(), "month", (short) 4);
        setShortField(term290251, term290251.getClass(), "day", (short) 14);
        setField(term290250, term290250.getClass(), "date", term290251);
        setByteField(term290255, term290255.getClass(), "hour", (byte) 21);
        setByteField(term290255, term290255.getClass(), "minute", (byte) 0);
        setByteField(term290255, term290255.getClass(), "second", (byte) 29);
        setIntField(term290255, term290255.getClass(), "nano", 368569329);
        setField(term290250, term290250.getClass(), "time", term290255);
        setField(term290200, term290200.getClass(), "lastLoginDate", term290250);
        setBooleanField(term290200, term290200.getClass(), "isWebJoin", true);
        setField(term290200, term290200.getClass(), "webLimitDate", "ioALTdlErP");
        setIntField(term290200, term290200.getClass(), "level", -1429417338);
        setIntField(term290200, term290200.getClass(), "reincarnationNum", -1579206256);
        setField(term290200, term290200.getClass(), "exp", "STfCNGDtwG");
        setLongField(term290200, term290200.getClass(), "point", 5539013659578446033L);
        setLongField(term290200, term290200.getClass(), "totalPoint", 6844271349135839950L);
        setIntField(term290200, term290200.getClass(), "playCount", 1135921400);
        setIntField(term290200, term290200.getClass(), "multiPlayCount", -2009944790);
        setIntField(term290200, term290200.getClass(), "multiWinCount", -195124832);
        setIntField(term290200, term290200.getClass(), "requestResCount", 815849616);
        setIntField(term290200, term290200.getClass(), "acceptResCount", 1484825295);
        setIntField(term290200, term290200.getClass(), "successResCount", 913538580);
        setIntField(term290200, term290200.getClass(), "playerRating", -1563084929);
        setIntField(term290200, term290200.getClass(), "highestRating", 909134856);
        setIntField(term290200, term290200.getClass(), "nameplateId", 1535508240);
        setIntField(term290200, term290200.getClass(), "frameId", -2011428106);
        setIntField(term290200, term290200.getClass(), "characterId", -953251052);
        setIntField(term290200, term290200.getClass(), "trophyId", 1063368461);
        setIntField(term290200, term290200.getClass(), "playedTutorialBit", -1690162158);
        setIntField(term290200, term290200.getClass(), "firstTutorialCancelNum", -681123934);
        setIntField(term290200, term290200.getClass(), "masterTutorialCancelNum", 564331);
        setIntField(term290200, term290200.getClass(), "totalRepertoireCount", -631621459);
        setIntField(term290200, term290200.getClass(), "totalMapNum", -896986933);
        setLongField(term290200, term290200.getClass(), "totalHiScore", 8959077806809187885L);
        setLongField(term290200, term290200.getClass(), "totalBasicHighScore", -5776525253846609674L);
        setLongField(term290200, term290200.getClass(), "totalAdvancedHighScore", 1471693542970291582L);
        setLongField(term290200, term290200.getClass(), "totalExpertHighScore", 2653767185543930605L);
        setLongField(term290200, term290200.getClass(), "totalMasterHighScore", -1090117923701476471L);
        setIntField(term290312, term290312.getClass(), "year", 2028);
        setShortField(term290312, term290312.getClass(), "month", (short) 7);
        setShortField(term290312, term290312.getClass(), "day", (short) 12);
        setField(term290311, term290311.getClass(), "date", term290312);
        setByteField(term290316, term290316.getClass(), "hour", (byte) 12);
        setByteField(term290316, term290316.getClass(), "minute", (byte) 45);
        setByteField(term290316, term290316.getClass(), "second", (byte) 2);
        setIntField(term290316, term290316.getClass(), "nano", 883698881);
        setField(term290311, term290311.getClass(), "time", term290316);
        setField(term290200, term290200.getClass(), "eventWatchedDate", term290311);
        setIntField(term290200, term290200.getClass(), "friendCount", -272073305);
        setBooleanField(term290200, term290200.getClass(), "isMaimai", true);
        setField(term290200, term290200.getClass(), "firstGameId", "NobNtKSnxv");
        setField(term290200, term290200.getClass(), "firstRomVersion", "oTXsJGhPMO");
        setField(term290200, term290200.getClass(), "firstDataVersion", "VKSQjeEwka");
        setIntField(term290360, term290360.getClass(), "year", 2022);
        setShortField(term290360, term290360.getClass(), "month", (short) 8);
        setShortField(term290360, term290360.getClass(), "day", (short) 6);
        setField(term290359, term290359.getClass(), "date", term290360);
        setByteField(term290364, term290364.getClass(), "hour", (byte) 4);
        setByteField(term290364, term290364.getClass(), "minute", (byte) 37);
        setByteField(term290364, term290364.getClass(), "second", (byte) 17);
        setIntField(term290364, term290364.getClass(), "nano", 32714200);
        setField(term290359, term290359.getClass(), "time", term290364);
        setField(term290200, term290200.getClass(), "firstPlayDate", term290359);
        setField(term290200, term290200.getClass(), "lastGameId", "rvyeTnWWlf");
        setField(term290200, term290200.getClass(), "lastRomVersion", "qwmljKSBGF");
        setField(term290200, term290200.getClass(), "lastDataVersion", "ehfwuHuJCM");
        setIntField(term290406, term290406.getClass(), "year", 2016);
        setShortField(term290406, term290406.getClass(), "month", (short) 1);
        setShortField(term290406, term290406.getClass(), "day", (short) 13);
        setField(term290405, term290405.getClass(), "date", term290406);
        setByteField(term290410, term290410.getClass(), "hour", (byte) 13);
        setByteField(term290410, term290410.getClass(), "minute", (byte) 11);
        setByteField(term290410, term290410.getClass(), "second", (byte) 17);
        setIntField(term290410, term290410.getClass(), "nano", 630986370);
        setField(term290405, term290405.getClass(), "time", term290410);
        setField(term290200, term290200.getClass(), "lastPlayDate", term290405);
        setIntField(term290200, term290200.getClass(), "lastPlaceId", 1586776007);
        setField(term290200, term290200.getClass(), "lastPlaceName", "ohwhPbAzfO");
        setField(term290200, term290200.getClass(), "lastRegionId", "oaMSqXLhMk");
        setField(term290200, term290200.getClass(), "lastRegionName", "JOvcnvkLRz");
        setField(term290200, term290200.getClass(), "lastAllNetId", "pxPcAihzBr");
        setField(term290200, term290200.getClass(), "lastClientId", "GzKodkVNkA");
        setField(term290198, term290198.getClass(), "user", term290200);
        setIntField(term290198, term290198.getClass(), "mapId", 416678466);
        setIntField(term290198, term290198.getClass(), "position", -505598314);
        setBooleanField(term290198, term290198.getClass(), "isClear", true);
        setIntField(term290198, term290198.getClass(), "areaId", -1431423805);
        setIntField(term290198, term290198.getClass(), "routeNumber", -1119901942);
        setIntField(term290198, term290198.getClass(), "eventId", 174305035);
        setIntField(term290198, term290198.getClass(), "rate", 681540406);
        setIntField(term290198, term290198.getClass(), "statusCount", 1248693910);
        setBooleanField(term290198, term290198.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term290198, args);
    }

};


