package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setCard_80259732051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13467;
     Object term13641;

    public UserData_setCard_80259732051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13471 = new Long(2936323121573284007L);
        term13467 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term13469 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13495 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13496 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13500 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13467, term13467.getClass(), "id", -9040825890007374809L);
        setLongField(term13469, term13469.getClass(), "id", 1368340889161782793L);
        setField(term13469, term13469.getClass(), "extId", term13471);
        setField(term13469, term13469.getClass(), "luid", "jqrVEUvYEz");
        setIntField(term13486, term13486.getClass(), "year", 2013);
        setShortField(term13486, term13486.getClass(), "month", (short) 11);
        setShortField(term13486, term13486.getClass(), "day", (short) 19);
        setField(term13485, term13485.getClass(), "date", term13486);
        setByteField(term13490, term13490.getClass(), "hour", (byte) 6);
        setByteField(term13490, term13490.getClass(), "minute", (byte) 45);
        setByteField(term13490, term13490.getClass(), "second", (byte) 10);
        setIntField(term13490, term13490.getClass(), "nano", 288981190);
        setField(term13485, term13485.getClass(), "time", term13490);
        setField(term13469, term13469.getClass(), "registerTime", term13485);
        setIntField(term13496, term13496.getClass(), "year", 2025);
        setShortField(term13496, term13496.getClass(), "month", (short) 9);
        setShortField(term13496, term13496.getClass(), "day", (short) 18);
        setField(term13495, term13495.getClass(), "date", term13496);
        setByteField(term13500, term13500.getClass(), "hour", (byte) 16);
        setByteField(term13500, term13500.getClass(), "minute", (byte) 1);
        setByteField(term13500, term13500.getClass(), "second", (byte) 23);
        setIntField(term13500, term13500.getClass(), "nano", 178285726);
        setField(term13495, term13495.getClass(), "time", term13500);
        setField(term13469, term13469.getClass(), "accessTime", term13495);
        setField(term13467, term13467.getClass(), "card", term13469);
        setIntField(term13467, term13467.getClass(), "lastDataVersion", 549278914);
        setField(term13467, term13467.getClass(), "userName", "QITgiBrmfj");
        setIntField(term13467, term13467.getClass(), "point", -1490125498);
        setIntField(term13467, term13467.getClass(), "totalPoint", -1443119347);
        setIntField(term13467, term13467.getClass(), "iconId", 1962181481);
        setIntField(term13467, term13467.getClass(), "nameplateId", 1798831879);
        setIntField(term13467, term13467.getClass(), "frameId", 1393855580);
        setIntField(term13467, term13467.getClass(), "trophyId", -849064032);
        setIntField(term13467, term13467.getClass(), "playCount", -184659375);
        setIntField(term13467, term13467.getClass(), "playVsCount", 629005618);
        setIntField(term13467, term13467.getClass(), "playSyncCount", -2006508013);
        setIntField(term13467, term13467.getClass(), "winCount", 974951631);
        setIntField(term13467, term13467.getClass(), "helpCount", -942202284);
        setIntField(term13467, term13467.getClass(), "comboCount", -2083254556);
        setIntField(term13467, term13467.getClass(), "feverCount", 1452346261);
        setIntField(term13467, term13467.getClass(), "totalHiScore", -548776693);
        setIntField(term13467, term13467.getClass(), "totalEasyHighScore", 99032275);
        setIntField(term13467, term13467.getClass(), "totalBasicHighScore", 794098686);
        setIntField(term13467, term13467.getClass(), "totalAdvancedHighScore", -1671524013);
        setIntField(term13467, term13467.getClass(), "totalExpertHighScore", -438794741);
        setIntField(term13467, term13467.getClass(), "totalMasterHighScore", -1400834481);
        setIntField(term13467, term13467.getClass(), "totalReMasterHighScore", 957091706);
        setIntField(term13467, term13467.getClass(), "totalHighSync", -2011802805);
        setIntField(term13467, term13467.getClass(), "totalEasySync", -1683802689);
        setIntField(term13467, term13467.getClass(), "totalBasicSync", -1949346221);
        setIntField(term13467, term13467.getClass(), "totalAdvancedSync", 831638391);
        setIntField(term13467, term13467.getClass(), "totalExpertSync", -1184374392);
        setIntField(term13467, term13467.getClass(), "totalMasterSync", -758870402);
        setIntField(term13467, term13467.getClass(), "totalReMasterSync", 72767889);
        setIntField(term13467, term13467.getClass(), "playerRating", 1699515029);
        setIntField(term13467, term13467.getClass(), "highestRating", 673153263);
        setIntField(term13467, term13467.getClass(), "rankAuthTailId", -1355715967);
        setField(term13467, term13467.getClass(), "eventWatchedDate", "pXxkiXgQnq");
        setField(term13467, term13467.getClass(), "webLimitDate", "tKmrUDURku");
        setIntField(term13467, term13467.getClass(), "challengeTrackPhase", -972516789);
        setIntField(term13467, term13467.getClass(), "firstPlayBits", 720077443);
        setField(term13467, term13467.getClass(), "lastPlayDate", "JeZbrwZmsP");
        setIntField(term13467, term13467.getClass(), "lastPlaceId", -884523977);
        setField(term13467, term13467.getClass(), "lastPlaceName", "bxyfeicqrK");
        setIntField(term13467, term13467.getClass(), "lastRegionId", -1396233580);
        setField(term13467, term13467.getClass(), "lastRegionName", "vBnWPlsZMk");
        setField(term13467, term13467.getClass(), "lastClientId", "fIZsWucfXz");
        setField(term13467, term13467.getClass(), "lastCountryCode", "IApvtmfhnq");
        setIntField(term13467, term13467.getClass(), "eventPoint", -654234892);
        setIntField(term13467, term13467.getClass(), "totalLv", -50930731);
        setIntField(term13467, term13467.getClass(), "lastLoginBonusDay", -1067876039);
        setIntField(term13467, term13467.getClass(), "lastSurvivalBonusDay", -1143749623);
        setIntField(term13467, term13467.getClass(), "loginBonusLv", 1961561878);
        Long term13643 = new Long(-1154553077993834885L);
        term13641 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13662 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13672 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13641, term13641.getClass(), "id", -5786861555969446503L);
        setField(term13641, term13641.getClass(), "extId", term13643);
        setField(term13641, term13641.getClass(), "luid", "VSaNnhMpRc");
        setIntField(term13658, term13658.getClass(), "year", 2013);
        setShortField(term13658, term13658.getClass(), "month", (short) 7);
        setShortField(term13658, term13658.getClass(), "day", (short) 26);
        setField(term13657, term13657.getClass(), "date", term13658);
        setByteField(term13662, term13662.getClass(), "hour", (byte) 14);
        setByteField(term13662, term13662.getClass(), "minute", (byte) 45);
        setByteField(term13662, term13662.getClass(), "second", (byte) 33);
        setIntField(term13662, term13662.getClass(), "nano", 547995853);
        setField(term13657, term13657.getClass(), "time", term13662);
        setField(term13641, term13641.getClass(), "registerTime", term13657);
        setIntField(term13668, term13668.getClass(), "year", 2016);
        setShortField(term13668, term13668.getClass(), "month", (short) 12);
        setShortField(term13668, term13668.getClass(), "day", (short) 20);
        setField(term13667, term13667.getClass(), "date", term13668);
        setByteField(term13672, term13672.getClass(), "hour", (byte) 8);
        setByteField(term13672, term13672.getClass(), "minute", (byte) 46);
        setByteField(term13672, term13672.getClass(), "second", (byte) 16);
        setIntField(term13672, term13672.getClass(), "nano", 10071864);
        setField(term13667, term13667.getClass(), "time", term13672);
        setField(term13641, term13641.getClass(), "accessTime", term13667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term13641;
        callMethod(klass, "setCard", argTypes, term13467, args);
    }

};


