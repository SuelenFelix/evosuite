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

public class ExternalUserData_setLastRegionId_112739872494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38037;

    public ExternalUserData_setLastRegionId_112739872494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38037 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term38062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38067 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38222 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38037, term38037.getClass(), "accessCode", "sZyAwmdGVS");
        setField(term38037, term38037.getClass(), "userName", "VoKhXiLAaW");
        setIntField(term38063, term38063.getClass(), "year", 2013);
        setShortField(term38063, term38063.getClass(), "month", (short) 7);
        setShortField(term38063, term38063.getClass(), "day", (short) 2);
        setField(term38062, term38062.getClass(), "date", term38063);
        setByteField(term38067, term38067.getClass(), "hour", (byte) 12);
        setByteField(term38067, term38067.getClass(), "minute", (byte) 16);
        setByteField(term38067, term38067.getClass(), "second", (byte) 13);
        setIntField(term38067, term38067.getClass(), "nano", 479538808);
        setField(term38062, term38062.getClass(), "time", term38067);
        setField(term38037, term38037.getClass(), "lastLoginDate", term38062);
        setBooleanField(term38037, term38037.getClass(), "isWebJoin", false);
        setField(term38037, term38037.getClass(), "webLimitDate", "CaalXzRXQI");
        setIntField(term38037, term38037.getClass(), "level", -1062022366);
        setIntField(term38037, term38037.getClass(), "reincarnationNum", -1347618079);
        setField(term38037, term38037.getClass(), "exp", "eRBnKPjyVg");
        setLongField(term38037, term38037.getClass(), "point", -1625372334693179543L);
        setLongField(term38037, term38037.getClass(), "totalPoint", 3778691000276335279L);
        setIntField(term38037, term38037.getClass(), "playCount", 1510246255);
        setIntField(term38037, term38037.getClass(), "multiPlayCount", -515631808);
        setIntField(term38037, term38037.getClass(), "multiWinCount", 1546701347);
        setIntField(term38037, term38037.getClass(), "requestResCount", -111931851);
        setIntField(term38037, term38037.getClass(), "acceptResCount", -251696516);
        setIntField(term38037, term38037.getClass(), "successResCount", 1075321384);
        setIntField(term38037, term38037.getClass(), "playerRating", -1726073541);
        setIntField(term38037, term38037.getClass(), "highestRating", 406945977);
        setIntField(term38037, term38037.getClass(), "nameplateId", 493657684);
        setIntField(term38037, term38037.getClass(), "frameId", 1882655922);
        setIntField(term38037, term38037.getClass(), "characterId", 1314996390);
        setIntField(term38037, term38037.getClass(), "trophyId", 1367703658);
        setIntField(term38037, term38037.getClass(), "playedTutorialBit", 1120153100);
        setIntField(term38037, term38037.getClass(), "firstTutorialCancelNum", 158801111);
        setIntField(term38037, term38037.getClass(), "masterTutorialCancelNum", 464966803);
        setIntField(term38037, term38037.getClass(), "totalRepertoireCount", -246618392);
        setIntField(term38037, term38037.getClass(), "totalMapNum", 1472246167);
        setLongField(term38037, term38037.getClass(), "totalHiScore", 8453730687540121475L);
        setLongField(term38037, term38037.getClass(), "totalBasicHighScore", 8505184530074334434L);
        setLongField(term38037, term38037.getClass(), "totalAdvancedHighScore", -1610129689783641208L);
        setLongField(term38037, term38037.getClass(), "totalExpertHighScore", -2613029888948149747L);
        setLongField(term38037, term38037.getClass(), "totalMasterHighScore", -6418282217428803693L);
        setIntField(term38124, term38124.getClass(), "year", 2012);
        setShortField(term38124, term38124.getClass(), "month", (short) 10);
        setShortField(term38124, term38124.getClass(), "day", (short) 26);
        setField(term38123, term38123.getClass(), "date", term38124);
        setByteField(term38128, term38128.getClass(), "hour", (byte) 13);
        setByteField(term38128, term38128.getClass(), "minute", (byte) 50);
        setByteField(term38128, term38128.getClass(), "second", (byte) 34);
        setIntField(term38128, term38128.getClass(), "nano", 738625041);
        setField(term38123, term38123.getClass(), "time", term38128);
        setField(term38037, term38037.getClass(), "eventWatchedDate", term38123);
        setIntField(term38037, term38037.getClass(), "friendCount", 1008555478);
        setBooleanField(term38037, term38037.getClass(), "isMaimai", false);
        setField(term38037, term38037.getClass(), "firstGameId", "svPqsHBvrm");
        setField(term38037, term38037.getClass(), "firstRomVersion", "sRzUJLYMmB");
        setField(term38037, term38037.getClass(), "firstDataVersion", "XxILklSDwz");
        setIntField(term38172, term38172.getClass(), "year", 2012);
        setShortField(term38172, term38172.getClass(), "month", (short) 7);
        setShortField(term38172, term38172.getClass(), "day", (short) 6);
        setField(term38171, term38171.getClass(), "date", term38172);
        setByteField(term38176, term38176.getClass(), "hour", (byte) 0);
        setByteField(term38176, term38176.getClass(), "minute", (byte) 48);
        setByteField(term38176, term38176.getClass(), "second", (byte) 16);
        setIntField(term38176, term38176.getClass(), "nano", 235139356);
        setField(term38171, term38171.getClass(), "time", term38176);
        setField(term38037, term38037.getClass(), "firstPlayDate", term38171);
        setField(term38037, term38037.getClass(), "lastGameId", "TLjhFZbwKO");
        setField(term38037, term38037.getClass(), "lastRomVersion", "nxEbLIApFc");
        setField(term38037, term38037.getClass(), "lastDataVersion", "zzsdNZhejE");
        setIntField(term38218, term38218.getClass(), "year", 2023);
        setShortField(term38218, term38218.getClass(), "month", (short) 2);
        setShortField(term38218, term38218.getClass(), "day", (short) 6);
        setField(term38217, term38217.getClass(), "date", term38218);
        setByteField(term38222, term38222.getClass(), "hour", (byte) 3);
        setByteField(term38222, term38222.getClass(), "minute", (byte) 1);
        setByteField(term38222, term38222.getClass(), "second", (byte) 52);
        setIntField(term38222, term38222.getClass(), "nano", 345404097);
        setField(term38217, term38217.getClass(), "time", term38222);
        setField(term38037, term38037.getClass(), "lastPlayDate", term38217);
        setIntField(term38037, term38037.getClass(), "lastPlaceId", 1346386442);
        setField(term38037, term38037.getClass(), "lastPlaceName", "ILoodMZrgR");
        setField(term38037, term38037.getClass(), "lastRegionId", "XQiKmsCacK");
        setField(term38037, term38037.getClass(), "lastRegionName", "cTCixEbHYT");
        setField(term38037, term38037.getClass(), "lastAllNetId", "bqKksqtAdT");
        setField(term38037, term38037.getClass(), "lastClientId", "jAIAdEmULK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EuAshkmbna";
        callMethod(klass, "setLastRegionId", argTypes, term38037, args);
    }

};


