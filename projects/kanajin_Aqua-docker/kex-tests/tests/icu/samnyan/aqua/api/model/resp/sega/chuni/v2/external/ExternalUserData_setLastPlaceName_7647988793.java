package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setLastPlaceName_7647988793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37614;

    public ExternalUserData_setLastPlaceName_7647988793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37614 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term37639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37799 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term37614, term37614.getClass(), "accessCode", "mRoEmuCJhW");
        setField(term37614, term37614.getClass(), "userName", "JJUWbMXpyM");
        setIntField(term37640, term37640.getClass(), "year", 2029);
        setShortField(term37640, term37640.getClass(), "month", (short) 2);
        setShortField(term37640, term37640.getClass(), "day", (short) 4);
        setField(term37639, term37639.getClass(), "date", term37640);
        setByteField(term37644, term37644.getClass(), "hour", (byte) 18);
        setByteField(term37644, term37644.getClass(), "minute", (byte) 31);
        setByteField(term37644, term37644.getClass(), "second", (byte) 27);
        setIntField(term37644, term37644.getClass(), "nano", 737016275);
        setField(term37639, term37639.getClass(), "time", term37644);
        setField(term37614, term37614.getClass(), "lastLoginDate", term37639);
        setBooleanField(term37614, term37614.getClass(), "isWebJoin", false);
        setField(term37614, term37614.getClass(), "webLimitDate", "KDrRQWVXok");
        setIntField(term37614, term37614.getClass(), "level", 1359973218);
        setIntField(term37614, term37614.getClass(), "reincarnationNum", -218759803);
        setField(term37614, term37614.getClass(), "exp", "oOOwvWgxtf");
        setLongField(term37614, term37614.getClass(), "point", 9173715346996433126L);
        setLongField(term37614, term37614.getClass(), "totalPoint", -3243599172737171562L);
        setIntField(term37614, term37614.getClass(), "playCount", 1288936083);
        setIntField(term37614, term37614.getClass(), "multiPlayCount", 4086209);
        setIntField(term37614, term37614.getClass(), "multiWinCount", 300964556);
        setIntField(term37614, term37614.getClass(), "requestResCount", -958207893);
        setIntField(term37614, term37614.getClass(), "acceptResCount", 674390543);
        setIntField(term37614, term37614.getClass(), "successResCount", 1472100258);
        setIntField(term37614, term37614.getClass(), "playerRating", 12681987);
        setIntField(term37614, term37614.getClass(), "highestRating", -1987364934);
        setIntField(term37614, term37614.getClass(), "nameplateId", 1364414277);
        setIntField(term37614, term37614.getClass(), "frameId", -961137606);
        setIntField(term37614, term37614.getClass(), "characterId", 795205527);
        setIntField(term37614, term37614.getClass(), "trophyId", 600958607);
        setIntField(term37614, term37614.getClass(), "playedTutorialBit", 897159778);
        setIntField(term37614, term37614.getClass(), "firstTutorialCancelNum", -1934934961);
        setIntField(term37614, term37614.getClass(), "masterTutorialCancelNum", 2120054887);
        setIntField(term37614, term37614.getClass(), "totalRepertoireCount", 2145648967);
        setIntField(term37614, term37614.getClass(), "totalMapNum", 2060624021);
        setLongField(term37614, term37614.getClass(), "totalHiScore", 3221586604131689186L);
        setLongField(term37614, term37614.getClass(), "totalBasicHighScore", -1283936527800858962L);
        setLongField(term37614, term37614.getClass(), "totalAdvancedHighScore", -8901189796092679153L);
        setLongField(term37614, term37614.getClass(), "totalExpertHighScore", 1731335447688885587L);
        setLongField(term37614, term37614.getClass(), "totalMasterHighScore", -6206610574921547811L);
        setIntField(term37701, term37701.getClass(), "year", 2022);
        setShortField(term37701, term37701.getClass(), "month", (short) 3);
        setShortField(term37701, term37701.getClass(), "day", (short) 27);
        setField(term37700, term37700.getClass(), "date", term37701);
        setByteField(term37705, term37705.getClass(), "hour", (byte) 18);
        setByteField(term37705, term37705.getClass(), "minute", (byte) 52);
        setByteField(term37705, term37705.getClass(), "second", (byte) 30);
        setIntField(term37705, term37705.getClass(), "nano", 610437590);
        setField(term37700, term37700.getClass(), "time", term37705);
        setField(term37614, term37614.getClass(), "eventWatchedDate", term37700);
        setIntField(term37614, term37614.getClass(), "friendCount", -1853309523);
        setBooleanField(term37614, term37614.getClass(), "isMaimai", false);
        setField(term37614, term37614.getClass(), "firstGameId", "ywoADeiUfF");
        setField(term37614, term37614.getClass(), "firstRomVersion", "loHiudJxbt");
        setField(term37614, term37614.getClass(), "firstDataVersion", "lRbxbybNew");
        setIntField(term37749, term37749.getClass(), "year", 2020);
        setShortField(term37749, term37749.getClass(), "month", (short) 10);
        setShortField(term37749, term37749.getClass(), "day", (short) 10);
        setField(term37748, term37748.getClass(), "date", term37749);
        setByteField(term37753, term37753.getClass(), "hour", (byte) 8);
        setByteField(term37753, term37753.getClass(), "minute", (byte) 35);
        setByteField(term37753, term37753.getClass(), "second", (byte) 54);
        setIntField(term37753, term37753.getClass(), "nano", 115111505);
        setField(term37748, term37748.getClass(), "time", term37753);
        setField(term37614, term37614.getClass(), "firstPlayDate", term37748);
        setField(term37614, term37614.getClass(), "lastGameId", "WzGudiEARD");
        setField(term37614, term37614.getClass(), "lastRomVersion", "IoefPqGtaj");
        setField(term37614, term37614.getClass(), "lastDataVersion", "YMmtjELJuB");
        setIntField(term37795, term37795.getClass(), "year", 2017);
        setShortField(term37795, term37795.getClass(), "month", (short) 10);
        setShortField(term37795, term37795.getClass(), "day", (short) 24);
        setField(term37794, term37794.getClass(), "date", term37795);
        setByteField(term37799, term37799.getClass(), "hour", (byte) 21);
        setByteField(term37799, term37799.getClass(), "minute", (byte) 10);
        setByteField(term37799, term37799.getClass(), "second", (byte) 20);
        setIntField(term37799, term37799.getClass(), "nano", 736076804);
        setField(term37794, term37794.getClass(), "time", term37799);
        setField(term37614, term37614.getClass(), "lastPlayDate", term37794);
        setIntField(term37614, term37614.getClass(), "lastPlaceId", 241741655);
        setField(term37614, term37614.getClass(), "lastPlaceName", "FzyIShiOmb");
        setField(term37614, term37614.getClass(), "lastRegionId", "PEUfeJaZTk");
        setField(term37614, term37614.getClass(), "lastRegionName", "AIvyeIdskz");
        setField(term37614, term37614.getClass(), "lastAllNetId", "iSQqMWMRlU");
        setField(term37614, term37614.getClass(), "lastClientId", "djWEnlbOXu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvDMzQBWME";
        callMethod(klass, "setLastPlaceName", argTypes, term37614, args);
    }

};


