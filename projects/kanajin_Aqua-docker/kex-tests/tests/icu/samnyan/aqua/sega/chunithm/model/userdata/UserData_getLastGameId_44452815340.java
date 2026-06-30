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

public class UserData_getLastGameId_44452815340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146421;

    public UserData_getLastGameId_44452815340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146425 = new Long(-7191625829563442696L);
        term146421 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term146423 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146631 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146421, term146421.getClass(), "id", -3151283560134614058L);
        setLongField(term146423, term146423.getClass(), "id", 8638115260738822106L);
        setField(term146423, term146423.getClass(), "extId", term146425);
        setField(term146423, term146423.getClass(), "luid", "IoPixEbkAS");
        setIntField(term146440, term146440.getClass(), "year", 2020);
        setShortField(term146440, term146440.getClass(), "month", (short) 4);
        setShortField(term146440, term146440.getClass(), "day", (short) 1);
        setField(term146439, term146439.getClass(), "date", term146440);
        setByteField(term146444, term146444.getClass(), "hour", (byte) 19);
        setByteField(term146444, term146444.getClass(), "minute", (byte) 24);
        setByteField(term146444, term146444.getClass(), "second", (byte) 11);
        setIntField(term146444, term146444.getClass(), "nano", 10237952);
        setField(term146439, term146439.getClass(), "time", term146444);
        setField(term146423, term146423.getClass(), "registerTime", term146439);
        setIntField(term146450, term146450.getClass(), "year", 2019);
        setShortField(term146450, term146450.getClass(), "month", (short) 9);
        setShortField(term146450, term146450.getClass(), "day", (short) 28);
        setField(term146449, term146449.getClass(), "date", term146450);
        setByteField(term146454, term146454.getClass(), "hour", (byte) 8);
        setByteField(term146454, term146454.getClass(), "minute", (byte) 19);
        setByteField(term146454, term146454.getClass(), "second", (byte) 44);
        setIntField(term146454, term146454.getClass(), "nano", 387445710);
        setField(term146449, term146449.getClass(), "time", term146454);
        setField(term146423, term146423.getClass(), "accessTime", term146449);
        setField(term146421, term146421.getClass(), "card", term146423);
        setField(term146421, term146421.getClass(), "userName", "aUBGFyjAFZ");
        setIntField(term146472, term146472.getClass(), "year", 2021);
        setShortField(term146472, term146472.getClass(), "month", (short) 1);
        setShortField(term146472, term146472.getClass(), "day", (short) 19);
        setField(term146471, term146471.getClass(), "date", term146472);
        setByteField(term146476, term146476.getClass(), "hour", (byte) 13);
        setByteField(term146476, term146476.getClass(), "minute", (byte) 37);
        setByteField(term146476, term146476.getClass(), "second", (byte) 59);
        setIntField(term146476, term146476.getClass(), "nano", 963781035);
        setField(term146471, term146471.getClass(), "time", term146476);
        setField(term146421, term146421.getClass(), "lastLoginDate", term146471);
        setBooleanField(term146421, term146421.getClass(), "isWebJoin", false);
        setField(term146421, term146421.getClass(), "webLimitDate", "hLGRczvgrI");
        setIntField(term146421, term146421.getClass(), "level", -910208002);
        setIntField(term146421, term146421.getClass(), "reincarnationNum", 1779017343);
        setField(term146421, term146421.getClass(), "exp", "ENiUwgffeV");
        setLongField(term146421, term146421.getClass(), "point", 6633619306147406774L);
        setLongField(term146421, term146421.getClass(), "totalPoint", -2598531502895563715L);
        setIntField(term146421, term146421.getClass(), "playCount", 1035172702);
        setIntField(term146421, term146421.getClass(), "multiPlayCount", -2014376784);
        setIntField(term146421, term146421.getClass(), "multiWinCount", -1636759557);
        setIntField(term146421, term146421.getClass(), "requestResCount", -558790646);
        setIntField(term146421, term146421.getClass(), "acceptResCount", -1501041458);
        setIntField(term146421, term146421.getClass(), "successResCount", 704257790);
        setIntField(term146421, term146421.getClass(), "playerRating", 84488553);
        setIntField(term146421, term146421.getClass(), "highestRating", 112186676);
        setIntField(term146421, term146421.getClass(), "nameplateId", 1529668856);
        setIntField(term146421, term146421.getClass(), "frameId", 1327244707);
        setIntField(term146421, term146421.getClass(), "characterId", 636264680);
        setIntField(term146421, term146421.getClass(), "trophyId", 549590868);
        setIntField(term146421, term146421.getClass(), "playedTutorialBit", -2123777150);
        setIntField(term146421, term146421.getClass(), "firstTutorialCancelNum", 1239505784);
        setIntField(term146421, term146421.getClass(), "masterTutorialCancelNum", 1973303309);
        setIntField(term146421, term146421.getClass(), "totalRepertoireCount", 1732667310);
        setIntField(term146421, term146421.getClass(), "totalMapNum", 1895584040);
        setLongField(term146421, term146421.getClass(), "totalHiScore", -6832530349389010593L);
        setLongField(term146421, term146421.getClass(), "totalBasicHighScore", 8784363523617467565L);
        setLongField(term146421, term146421.getClass(), "totalAdvancedHighScore", -2581326673349768387L);
        setLongField(term146421, term146421.getClass(), "totalExpertHighScore", -8721205078422480633L);
        setLongField(term146421, term146421.getClass(), "totalMasterHighScore", -8590885095512673228L);
        setIntField(term146533, term146533.getClass(), "year", 2017);
        setShortField(term146533, term146533.getClass(), "month", (short) 8);
        setShortField(term146533, term146533.getClass(), "day", (short) 22);
        setField(term146532, term146532.getClass(), "date", term146533);
        setByteField(term146537, term146537.getClass(), "hour", (byte) 14);
        setByteField(term146537, term146537.getClass(), "minute", (byte) 49);
        setByteField(term146537, term146537.getClass(), "second", (byte) 6);
        setIntField(term146537, term146537.getClass(), "nano", 91497165);
        setField(term146532, term146532.getClass(), "time", term146537);
        setField(term146421, term146421.getClass(), "eventWatchedDate", term146532);
        setIntField(term146421, term146421.getClass(), "friendCount", -51888709);
        setBooleanField(term146421, term146421.getClass(), "isMaimai", true);
        setField(term146421, term146421.getClass(), "firstGameId", "KfyRZmwblA");
        setField(term146421, term146421.getClass(), "firstRomVersion", "uBFesOdlOQ");
        setField(term146421, term146421.getClass(), "firstDataVersion", "mhZDVyKkRQ");
        setIntField(term146581, term146581.getClass(), "year", 2012);
        setShortField(term146581, term146581.getClass(), "month", (short) 3);
        setShortField(term146581, term146581.getClass(), "day", (short) 1);
        setField(term146580, term146580.getClass(), "date", term146581);
        setByteField(term146585, term146585.getClass(), "hour", (byte) 12);
        setByteField(term146585, term146585.getClass(), "minute", (byte) 30);
        setByteField(term146585, term146585.getClass(), "second", (byte) 47);
        setIntField(term146585, term146585.getClass(), "nano", 620699635);
        setField(term146580, term146580.getClass(), "time", term146585);
        setField(term146421, term146421.getClass(), "firstPlayDate", term146580);
        setField(term146421, term146421.getClass(), "lastGameId", "gUjPlBJpBX");
        setField(term146421, term146421.getClass(), "lastRomVersion", "XsbZWCULaM");
        setField(term146421, term146421.getClass(), "lastDataVersion", "SVgzmJdpqR");
        setIntField(term146627, term146627.getClass(), "year", 2014);
        setShortField(term146627, term146627.getClass(), "month", (short) 2);
        setShortField(term146627, term146627.getClass(), "day", (short) 27);
        setField(term146626, term146626.getClass(), "date", term146627);
        setByteField(term146631, term146631.getClass(), "hour", (byte) 22);
        setByteField(term146631, term146631.getClass(), "minute", (byte) 8);
        setByteField(term146631, term146631.getClass(), "second", (byte) 8);
        setIntField(term146631, term146631.getClass(), "nano", 310644364);
        setField(term146626, term146626.getClass(), "time", term146631);
        setField(term146421, term146421.getClass(), "lastPlayDate", term146626);
        setIntField(term146421, term146421.getClass(), "lastPlaceId", 1238498169);
        setField(term146421, term146421.getClass(), "lastPlaceName", "iPeJOiWzhg");
        setField(term146421, term146421.getClass(), "lastRegionId", "munlTtNamQ");
        setField(term146421, term146421.getClass(), "lastRegionName", "DUpJkfRxDT");
        setField(term146421, term146421.getClass(), "lastAllNetId", "LcoJdPibmE");
        setField(term146421, term146421.getClass(), "lastClientId", "HCkvHZWbSX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term146421, args);
    }

};


