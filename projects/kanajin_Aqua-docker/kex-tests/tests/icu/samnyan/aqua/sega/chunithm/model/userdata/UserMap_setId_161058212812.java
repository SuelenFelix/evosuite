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

public class UserMap_setId_161058212812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283632;
     Object term283919;

    public UserMap_setId_161058212812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283638 = new Long(-5367775625638780650L);
        term283632 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term283634 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term283636 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283667 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283798 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283844 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283632, term283632.getClass(), "id", 4064731275090128937L);
        setLongField(term283634, term283634.getClass(), "id", 4174829442572031490L);
        setLongField(term283636, term283636.getClass(), "id", 2367151330312860304L);
        setField(term283636, term283636.getClass(), "extId", term283638);
        setField(term283636, term283636.getClass(), "luid", "WNiXGNcYjm");
        setIntField(term283653, term283653.getClass(), "year", 2019);
        setShortField(term283653, term283653.getClass(), "month", (short) 1);
        setShortField(term283653, term283653.getClass(), "day", (short) 16);
        setField(term283652, term283652.getClass(), "date", term283653);
        setByteField(term283657, term283657.getClass(), "hour", (byte) 11);
        setByteField(term283657, term283657.getClass(), "minute", (byte) 40);
        setByteField(term283657, term283657.getClass(), "second", (byte) 42);
        setIntField(term283657, term283657.getClass(), "nano", 387829098);
        setField(term283652, term283652.getClass(), "time", term283657);
        setField(term283636, term283636.getClass(), "registerTime", term283652);
        setIntField(term283663, term283663.getClass(), "year", 2024);
        setShortField(term283663, term283663.getClass(), "month", (short) 5);
        setShortField(term283663, term283663.getClass(), "day", (short) 10);
        setField(term283662, term283662.getClass(), "date", term283663);
        setByteField(term283667, term283667.getClass(), "hour", (byte) 10);
        setByteField(term283667, term283667.getClass(), "minute", (byte) 20);
        setByteField(term283667, term283667.getClass(), "second", (byte) 43);
        setIntField(term283667, term283667.getClass(), "nano", 972302003);
        setField(term283662, term283662.getClass(), "time", term283667);
        setField(term283636, term283636.getClass(), "accessTime", term283662);
        setField(term283634, term283634.getClass(), "card", term283636);
        setField(term283634, term283634.getClass(), "userName", "nmtwfmagfX");
        setIntField(term283685, term283685.getClass(), "year", 2011);
        setShortField(term283685, term283685.getClass(), "month", (short) 4);
        setShortField(term283685, term283685.getClass(), "day", (short) 18);
        setField(term283684, term283684.getClass(), "date", term283685);
        setByteField(term283689, term283689.getClass(), "hour", (byte) 6);
        setByteField(term283689, term283689.getClass(), "minute", (byte) 19);
        setByteField(term283689, term283689.getClass(), "second", (byte) 52);
        setIntField(term283689, term283689.getClass(), "nano", 467615083);
        setField(term283684, term283684.getClass(), "time", term283689);
        setField(term283634, term283634.getClass(), "lastLoginDate", term283684);
        setBooleanField(term283634, term283634.getClass(), "isWebJoin", false);
        setField(term283634, term283634.getClass(), "webLimitDate", "kiIMTOKJXF");
        setIntField(term283634, term283634.getClass(), "level", -573536134);
        setIntField(term283634, term283634.getClass(), "reincarnationNum", 1508235726);
        setField(term283634, term283634.getClass(), "exp", "LVSwXfrvcg");
        setLongField(term283634, term283634.getClass(), "point", -1065508751068921341L);
        setLongField(term283634, term283634.getClass(), "totalPoint", 1995963122877236843L);
        setIntField(term283634, term283634.getClass(), "playCount", -1903521501);
        setIntField(term283634, term283634.getClass(), "multiPlayCount", 83577512);
        setIntField(term283634, term283634.getClass(), "multiWinCount", -190486139);
        setIntField(term283634, term283634.getClass(), "requestResCount", -1583452879);
        setIntField(term283634, term283634.getClass(), "acceptResCount", 1252497408);
        setIntField(term283634, term283634.getClass(), "successResCount", -1193659161);
        setIntField(term283634, term283634.getClass(), "playerRating", 611802335);
        setIntField(term283634, term283634.getClass(), "highestRating", -117170783);
        setIntField(term283634, term283634.getClass(), "nameplateId", 1396116256);
        setIntField(term283634, term283634.getClass(), "frameId", 782140754);
        setIntField(term283634, term283634.getClass(), "characterId", -1361513040);
        setIntField(term283634, term283634.getClass(), "trophyId", -1061345604);
        setIntField(term283634, term283634.getClass(), "playedTutorialBit", -1473491051);
        setIntField(term283634, term283634.getClass(), "firstTutorialCancelNum", 804411219);
        setIntField(term283634, term283634.getClass(), "masterTutorialCancelNum", -1184708689);
        setIntField(term283634, term283634.getClass(), "totalRepertoireCount", 1859413989);
        setIntField(term283634, term283634.getClass(), "totalMapNum", 399424745);
        setLongField(term283634, term283634.getClass(), "totalHiScore", 2344313633784181426L);
        setLongField(term283634, term283634.getClass(), "totalBasicHighScore", 3902294446119073387L);
        setLongField(term283634, term283634.getClass(), "totalAdvancedHighScore", 7287540206619376802L);
        setLongField(term283634, term283634.getClass(), "totalExpertHighScore", 2642016550674620442L);
        setLongField(term283634, term283634.getClass(), "totalMasterHighScore", 1700931216790135191L);
        setIntField(term283746, term283746.getClass(), "year", 2016);
        setShortField(term283746, term283746.getClass(), "month", (short) 8);
        setShortField(term283746, term283746.getClass(), "day", (short) 26);
        setField(term283745, term283745.getClass(), "date", term283746);
        setByteField(term283750, term283750.getClass(), "hour", (byte) 22);
        setByteField(term283750, term283750.getClass(), "minute", (byte) 39);
        setByteField(term283750, term283750.getClass(), "second", (byte) 46);
        setIntField(term283750, term283750.getClass(), "nano", 55893586);
        setField(term283745, term283745.getClass(), "time", term283750);
        setField(term283634, term283634.getClass(), "eventWatchedDate", term283745);
        setIntField(term283634, term283634.getClass(), "friendCount", 1445242555);
        setBooleanField(term283634, term283634.getClass(), "isMaimai", false);
        setField(term283634, term283634.getClass(), "firstGameId", "ewjLmrzsVO");
        setField(term283634, term283634.getClass(), "firstRomVersion", "ViYeKNhFKg");
        setField(term283634, term283634.getClass(), "firstDataVersion", "SXFyTzXeaj");
        setIntField(term283794, term283794.getClass(), "year", 2026);
        setShortField(term283794, term283794.getClass(), "month", (short) 1);
        setShortField(term283794, term283794.getClass(), "day", (short) 14);
        setField(term283793, term283793.getClass(), "date", term283794);
        setByteField(term283798, term283798.getClass(), "hour", (byte) 16);
        setByteField(term283798, term283798.getClass(), "minute", (byte) 25);
        setByteField(term283798, term283798.getClass(), "second", (byte) 26);
        setIntField(term283798, term283798.getClass(), "nano", 795889160);
        setField(term283793, term283793.getClass(), "time", term283798);
        setField(term283634, term283634.getClass(), "firstPlayDate", term283793);
        setField(term283634, term283634.getClass(), "lastGameId", "gRfwDGnUeI");
        setField(term283634, term283634.getClass(), "lastRomVersion", "AzIgoJKPKf");
        setField(term283634, term283634.getClass(), "lastDataVersion", "DoekyfIrat");
        setIntField(term283840, term283840.getClass(), "year", 2016);
        setShortField(term283840, term283840.getClass(), "month", (short) 8);
        setShortField(term283840, term283840.getClass(), "day", (short) 6);
        setField(term283839, term283839.getClass(), "date", term283840);
        setByteField(term283844, term283844.getClass(), "hour", (byte) 15);
        setByteField(term283844, term283844.getClass(), "minute", (byte) 46);
        setByteField(term283844, term283844.getClass(), "second", (byte) 49);
        setIntField(term283844, term283844.getClass(), "nano", 523229591);
        setField(term283839, term283839.getClass(), "time", term283844);
        setField(term283634, term283634.getClass(), "lastPlayDate", term283839);
        setIntField(term283634, term283634.getClass(), "lastPlaceId", -1658014193);
        setField(term283634, term283634.getClass(), "lastPlaceName", "hLGgJdPgBD");
        setField(term283634, term283634.getClass(), "lastRegionId", "PEgWPuGHaR");
        setField(term283634, term283634.getClass(), "lastRegionName", "eIRVRaUyle");
        setField(term283634, term283634.getClass(), "lastAllNetId", "biqUFWRvGE");
        setField(term283634, term283634.getClass(), "lastClientId", "iYCqUzLrAo");
        setField(term283632, term283632.getClass(), "user", term283634);
        setIntField(term283632, term283632.getClass(), "mapId", -730803369);
        setIntField(term283632, term283632.getClass(), "position", 2047860906);
        setBooleanField(term283632, term283632.getClass(), "isClear", false);
        setIntField(term283632, term283632.getClass(), "areaId", -2076399882);
        setIntField(term283632, term283632.getClass(), "routeNumber", -1118647144);
        setIntField(term283632, term283632.getClass(), "eventId", 883702396);
        setIntField(term283632, term283632.getClass(), "rate", -1694239191);
        setIntField(term283632, term283632.getClass(), "statusCount", 1485756799);
        setBooleanField(term283632, term283632.getClass(), "isValid", false);
        term283919 = new Long(6748102330891690272L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term283919;
        callMethod(klass, "setId", argTypes, term283632, args);
    }

};


