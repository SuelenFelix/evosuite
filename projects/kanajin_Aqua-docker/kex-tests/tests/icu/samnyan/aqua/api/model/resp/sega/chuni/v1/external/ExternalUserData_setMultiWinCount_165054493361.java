package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ExternalUserData_setMultiWinCount_165054493361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24574;
     Object term24825;

    public ExternalUserData_setMultiWinCount_165054493361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24574 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term24599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24759 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24574, term24574.getClass(), "accessCode", "XJbkXbljvz");
        setField(term24574, term24574.getClass(), "userName", "fuvdkDwBeH");
        setIntField(term24600, term24600.getClass(), "year", 2014);
        setShortField(term24600, term24600.getClass(), "month", (short) 2);
        setShortField(term24600, term24600.getClass(), "day", (short) 26);
        setField(term24599, term24599.getClass(), "date", term24600);
        setByteField(term24604, term24604.getClass(), "hour", (byte) 16);
        setByteField(term24604, term24604.getClass(), "minute", (byte) 42);
        setByteField(term24604, term24604.getClass(), "second", (byte) 39);
        setIntField(term24604, term24604.getClass(), "nano", 690212071);
        setField(term24599, term24599.getClass(), "time", term24604);
        setField(term24574, term24574.getClass(), "lastLoginDate", term24599);
        setBooleanField(term24574, term24574.getClass(), "isWebJoin", false);
        setField(term24574, term24574.getClass(), "webLimitDate", "NTefzwLPhx");
        setIntField(term24574, term24574.getClass(), "level", 910269225);
        setIntField(term24574, term24574.getClass(), "reincarnationNum", -298852874);
        setField(term24574, term24574.getClass(), "exp", "dirFuhqyNu");
        setLongField(term24574, term24574.getClass(), "point", -1223573843683081410L);
        setLongField(term24574, term24574.getClass(), "totalPoint", 3453457027014743006L);
        setIntField(term24574, term24574.getClass(), "playCount", 1094297953);
        setIntField(term24574, term24574.getClass(), "multiPlayCount", -329141819);
        setIntField(term24574, term24574.getClass(), "multiWinCount", -963204620);
        setIntField(term24574, term24574.getClass(), "requestResCount", 172898580);
        setIntField(term24574, term24574.getClass(), "acceptResCount", -777833461);
        setIntField(term24574, term24574.getClass(), "successResCount", 1583691829);
        setIntField(term24574, term24574.getClass(), "playerRating", -1468541076);
        setIntField(term24574, term24574.getClass(), "highestRating", -1796760393);
        setIntField(term24574, term24574.getClass(), "nameplateId", -2099267271);
        setIntField(term24574, term24574.getClass(), "frameId", 1134565344);
        setIntField(term24574, term24574.getClass(), "characterId", -1747434000);
        setIntField(term24574, term24574.getClass(), "trophyId", 1611620166);
        setIntField(term24574, term24574.getClass(), "playedTutorialBit", 249657454);
        setIntField(term24574, term24574.getClass(), "firstTutorialCancelNum", 1734630901);
        setIntField(term24574, term24574.getClass(), "masterTutorialCancelNum", -703815246);
        setIntField(term24574, term24574.getClass(), "totalRepertoireCount", 157300746);
        setIntField(term24574, term24574.getClass(), "totalMapNum", -1600748613);
        setLongField(term24574, term24574.getClass(), "totalHiScore", 3931473624300151730L);
        setLongField(term24574, term24574.getClass(), "totalBasicHighScore", 661905373566913125L);
        setLongField(term24574, term24574.getClass(), "totalAdvancedHighScore", -3753621038448351550L);
        setLongField(term24574, term24574.getClass(), "totalExpertHighScore", 5304481534735378567L);
        setLongField(term24574, term24574.getClass(), "totalMasterHighScore", 3423155413133381764L);
        setIntField(term24661, term24661.getClass(), "year", 2019);
        setShortField(term24661, term24661.getClass(), "month", (short) 9);
        setShortField(term24661, term24661.getClass(), "day", (short) 3);
        setField(term24660, term24660.getClass(), "date", term24661);
        setByteField(term24665, term24665.getClass(), "hour", (byte) 2);
        setByteField(term24665, term24665.getClass(), "minute", (byte) 32);
        setByteField(term24665, term24665.getClass(), "second", (byte) 30);
        setIntField(term24665, term24665.getClass(), "nano", 339846128);
        setField(term24660, term24660.getClass(), "time", term24665);
        setField(term24574, term24574.getClass(), "eventWatchedDate", term24660);
        setIntField(term24574, term24574.getClass(), "friendCount", -1509192782);
        setBooleanField(term24574, term24574.getClass(), "isMaimai", false);
        setField(term24574, term24574.getClass(), "firstGameId", "YVLRenzuoR");
        setField(term24574, term24574.getClass(), "firstRomVersion", "JukEMhPWql");
        setField(term24574, term24574.getClass(), "firstDataVersion", "ZdNcodHERG");
        setIntField(term24709, term24709.getClass(), "year", 2029);
        setShortField(term24709, term24709.getClass(), "month", (short) 11);
        setShortField(term24709, term24709.getClass(), "day", (short) 6);
        setField(term24708, term24708.getClass(), "date", term24709);
        setByteField(term24713, term24713.getClass(), "hour", (byte) 2);
        setByteField(term24713, term24713.getClass(), "minute", (byte) 55);
        setByteField(term24713, term24713.getClass(), "second", (byte) 43);
        setIntField(term24713, term24713.getClass(), "nano", 109400580);
        setField(term24708, term24708.getClass(), "time", term24713);
        setField(term24574, term24574.getClass(), "firstPlayDate", term24708);
        setField(term24574, term24574.getClass(), "lastGameId", "CLHomjAqIM");
        setField(term24574, term24574.getClass(), "lastRomVersion", "mzCFLzFuSj");
        setField(term24574, term24574.getClass(), "lastDataVersion", "WQnMpDlSfA");
        setIntField(term24755, term24755.getClass(), "year", 2020);
        setShortField(term24755, term24755.getClass(), "month", (short) 7);
        setShortField(term24755, term24755.getClass(), "day", (short) 24);
        setField(term24754, term24754.getClass(), "date", term24755);
        setByteField(term24759, term24759.getClass(), "hour", (byte) 22);
        setByteField(term24759, term24759.getClass(), "minute", (byte) 16);
        setByteField(term24759, term24759.getClass(), "second", (byte) 59);
        setIntField(term24759, term24759.getClass(), "nano", 588569833);
        setField(term24754, term24754.getClass(), "time", term24759);
        setField(term24574, term24574.getClass(), "lastPlayDate", term24754);
        setIntField(term24574, term24574.getClass(), "lastPlaceId", -867925573);
        setField(term24574, term24574.getClass(), "lastPlaceName", "aOIvTQtXiv");
        setField(term24574, term24574.getClass(), "lastRegionId", "IyjDiknqhA");
        setField(term24574, term24574.getClass(), "lastRegionName", "IHsXSAFYKi");
        setField(term24574, term24574.getClass(), "lastAllNetId", "KyGbLglqbW");
        setField(term24574, term24574.getClass(), "lastClientId", "ZKVeStsSNT");
        term24825 = new Integer(478422495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24825;
        callMethod(klass, "setMultiWinCount", argTypes, term24574, args);
    }

};


