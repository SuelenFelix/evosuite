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

public class UserDuel_getParam4_94899301411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79743;

    public UserDuel_getParam4_94899301411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79749 = new Long(-6301101997917060727L);
        term79743 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term79745 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term79747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term79763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79955 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80025 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80026 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80030 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term79743, term79743.getClass(), "id", 342373123317498636L);
        setLongField(term79745, term79745.getClass(), "id", -6848455207927551525L);
        setLongField(term79747, term79747.getClass(), "id", -7429834768466188126L);
        setField(term79747, term79747.getClass(), "extId", term79749);
        setField(term79747, term79747.getClass(), "luid", "nhByIXwUpO");
        setIntField(term79764, term79764.getClass(), "year", 2023);
        setShortField(term79764, term79764.getClass(), "month", (short) 5);
        setShortField(term79764, term79764.getClass(), "day", (short) 31);
        setField(term79763, term79763.getClass(), "date", term79764);
        setByteField(term79768, term79768.getClass(), "hour", (byte) 3);
        setByteField(term79768, term79768.getClass(), "minute", (byte) 15);
        setByteField(term79768, term79768.getClass(), "second", (byte) 34);
        setIntField(term79768, term79768.getClass(), "nano", 794699238);
        setField(term79763, term79763.getClass(), "time", term79768);
        setField(term79747, term79747.getClass(), "registerTime", term79763);
        setIntField(term79774, term79774.getClass(), "year", 2013);
        setShortField(term79774, term79774.getClass(), "month", (short) 10);
        setShortField(term79774, term79774.getClass(), "day", (short) 1);
        setField(term79773, term79773.getClass(), "date", term79774);
        setByteField(term79778, term79778.getClass(), "hour", (byte) 21);
        setByteField(term79778, term79778.getClass(), "minute", (byte) 9);
        setByteField(term79778, term79778.getClass(), "second", (byte) 5);
        setIntField(term79778, term79778.getClass(), "nano", 986326309);
        setField(term79773, term79773.getClass(), "time", term79778);
        setField(term79747, term79747.getClass(), "accessTime", term79773);
        setField(term79745, term79745.getClass(), "card", term79747);
        setField(term79745, term79745.getClass(), "userName", "vVySvQZVok");
        setIntField(term79796, term79796.getClass(), "year", 2025);
        setShortField(term79796, term79796.getClass(), "month", (short) 5);
        setShortField(term79796, term79796.getClass(), "day", (short) 29);
        setField(term79795, term79795.getClass(), "date", term79796);
        setByteField(term79800, term79800.getClass(), "hour", (byte) 14);
        setByteField(term79800, term79800.getClass(), "minute", (byte) 31);
        setByteField(term79800, term79800.getClass(), "second", (byte) 17);
        setIntField(term79800, term79800.getClass(), "nano", 808113660);
        setField(term79795, term79795.getClass(), "time", term79800);
        setField(term79745, term79745.getClass(), "lastLoginDate", term79795);
        setBooleanField(term79745, term79745.getClass(), "isWebJoin", true);
        setField(term79745, term79745.getClass(), "webLimitDate", "fDVzkGiHev");
        setIntField(term79745, term79745.getClass(), "level", -175208201);
        setIntField(term79745, term79745.getClass(), "reincarnationNum", -129568329);
        setField(term79745, term79745.getClass(), "exp", "CanAbWJNgt");
        setLongField(term79745, term79745.getClass(), "point", 2537051314451371644L);
        setLongField(term79745, term79745.getClass(), "totalPoint", 1503652575237136976L);
        setIntField(term79745, term79745.getClass(), "playCount", -1439138016);
        setIntField(term79745, term79745.getClass(), "multiPlayCount", 299991969);
        setIntField(term79745, term79745.getClass(), "multiWinCount", -314712088);
        setIntField(term79745, term79745.getClass(), "requestResCount", 673401830);
        setIntField(term79745, term79745.getClass(), "acceptResCount", 274393548);
        setIntField(term79745, term79745.getClass(), "successResCount", 2009167871);
        setIntField(term79745, term79745.getClass(), "playerRating", -1001649335);
        setIntField(term79745, term79745.getClass(), "highestRating", -1983284991);
        setIntField(term79745, term79745.getClass(), "nameplateId", 386592778);
        setIntField(term79745, term79745.getClass(), "frameId", 1718374650);
        setIntField(term79745, term79745.getClass(), "characterId", -1170695156);
        setIntField(term79745, term79745.getClass(), "trophyId", -854423228);
        setIntField(term79745, term79745.getClass(), "playedTutorialBit", -135398430);
        setIntField(term79745, term79745.getClass(), "firstTutorialCancelNum", 1404546541);
        setIntField(term79745, term79745.getClass(), "masterTutorialCancelNum", 1350945157);
        setIntField(term79745, term79745.getClass(), "totalRepertoireCount", 917364076);
        setIntField(term79745, term79745.getClass(), "totalMapNum", 727152467);
        setLongField(term79745, term79745.getClass(), "totalHiScore", -1765527138913795029L);
        setLongField(term79745, term79745.getClass(), "totalBasicHighScore", -1702769190313660197L);
        setLongField(term79745, term79745.getClass(), "totalAdvancedHighScore", 4850987747626140720L);
        setLongField(term79745, term79745.getClass(), "totalExpertHighScore", 1805176718113697933L);
        setLongField(term79745, term79745.getClass(), "totalMasterHighScore", 8453512367875425981L);
        setIntField(term79857, term79857.getClass(), "year", 2029);
        setShortField(term79857, term79857.getClass(), "month", (short) 9);
        setShortField(term79857, term79857.getClass(), "day", (short) 22);
        setField(term79856, term79856.getClass(), "date", term79857);
        setByteField(term79861, term79861.getClass(), "hour", (byte) 9);
        setByteField(term79861, term79861.getClass(), "minute", (byte) 11);
        setByteField(term79861, term79861.getClass(), "second", (byte) 48);
        setIntField(term79861, term79861.getClass(), "nano", 904292704);
        setField(term79856, term79856.getClass(), "time", term79861);
        setField(term79745, term79745.getClass(), "eventWatchedDate", term79856);
        setIntField(term79745, term79745.getClass(), "friendCount", -138608321);
        setBooleanField(term79745, term79745.getClass(), "isMaimai", true);
        setField(term79745, term79745.getClass(), "firstGameId", "tFRLUuSeUt");
        setField(term79745, term79745.getClass(), "firstRomVersion", "KcKxvbBAHa");
        setField(term79745, term79745.getClass(), "firstDataVersion", "NbFVXCPmxn");
        setIntField(term79905, term79905.getClass(), "year", 2029);
        setShortField(term79905, term79905.getClass(), "month", (short) 8);
        setShortField(term79905, term79905.getClass(), "day", (short) 27);
        setField(term79904, term79904.getClass(), "date", term79905);
        setByteField(term79909, term79909.getClass(), "hour", (byte) 10);
        setByteField(term79909, term79909.getClass(), "minute", (byte) 54);
        setByteField(term79909, term79909.getClass(), "second", (byte) 17);
        setIntField(term79909, term79909.getClass(), "nano", 953558700);
        setField(term79904, term79904.getClass(), "time", term79909);
        setField(term79745, term79745.getClass(), "firstPlayDate", term79904);
        setField(term79745, term79745.getClass(), "lastGameId", "ovYlGvhKKO");
        setField(term79745, term79745.getClass(), "lastRomVersion", "JvoSiMCDAb");
        setField(term79745, term79745.getClass(), "lastDataVersion", "JANJXHGMsv");
        setIntField(term79951, term79951.getClass(), "year", 2012);
        setShortField(term79951, term79951.getClass(), "month", (short) 1);
        setShortField(term79951, term79951.getClass(), "day", (short) 12);
        setField(term79950, term79950.getClass(), "date", term79951);
        setByteField(term79955, term79955.getClass(), "hour", (byte) 16);
        setByteField(term79955, term79955.getClass(), "minute", (byte) 4);
        setByteField(term79955, term79955.getClass(), "second", (byte) 10);
        setIntField(term79955, term79955.getClass(), "nano", 245911854);
        setField(term79950, term79950.getClass(), "time", term79955);
        setField(term79745, term79745.getClass(), "lastPlayDate", term79950);
        setIntField(term79745, term79745.getClass(), "lastPlaceId", 2095812393);
        setField(term79745, term79745.getClass(), "lastPlaceName", "WVQqsFGJMw");
        setField(term79745, term79745.getClass(), "lastRegionId", "TIPSlmidwP");
        setField(term79745, term79745.getClass(), "lastRegionName", "SRYeqWJJkR");
        setField(term79745, term79745.getClass(), "lastAllNetId", "vUVScKcyFY");
        setField(term79745, term79745.getClass(), "lastClientId", "DCSMbuGiaM");
        setField(term79743, term79743.getClass(), "user", term79745);
        setIntField(term79743, term79743.getClass(), "duelId", 1431497505);
        setIntField(term79743, term79743.getClass(), "progress", -135681605);
        setIntField(term79743, term79743.getClass(), "point", -881873928);
        setBooleanField(term79743, term79743.getClass(), "isClear", true);
        setIntField(term80026, term80026.getClass(), "year", 2020);
        setShortField(term80026, term80026.getClass(), "month", (short) 5);
        setShortField(term80026, term80026.getClass(), "day", (short) 18);
        setField(term80025, term80025.getClass(), "date", term80026);
        setByteField(term80030, term80030.getClass(), "hour", (byte) 0);
        setByteField(term80030, term80030.getClass(), "minute", (byte) 6);
        setByteField(term80030, term80030.getClass(), "second", (byte) 7);
        setIntField(term80030, term80030.getClass(), "nano", 597786302);
        setField(term80025, term80025.getClass(), "time", term80030);
        setField(term79743, term79743.getClass(), "lastPlayDate", term80025);
        setIntField(term79743, term79743.getClass(), "param1", 813195927);
        setIntField(term79743, term79743.getClass(), "param2", 837178544);
        setIntField(term79743, term79743.getClass(), "param3", 933005179);
        setIntField(term79743, term79743.getClass(), "param4", -1371488618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term79743, args);
    }

};


