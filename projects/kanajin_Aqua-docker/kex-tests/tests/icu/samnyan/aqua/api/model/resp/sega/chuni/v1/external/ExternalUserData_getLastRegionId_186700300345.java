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

public class ExternalUserData_getLastRegionId_186700300345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18046;

    public ExternalUserData_getLastRegionId_186700300345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18046 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term18071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18231 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18046, term18046.getClass(), "accessCode", "IOddzvEWcl");
        setField(term18046, term18046.getClass(), "userName", "bIrtpkYJWT");
        setIntField(term18072, term18072.getClass(), "year", 2013);
        setShortField(term18072, term18072.getClass(), "month", (short) 10);
        setShortField(term18072, term18072.getClass(), "day", (short) 7);
        setField(term18071, term18071.getClass(), "date", term18072);
        setByteField(term18076, term18076.getClass(), "hour", (byte) 12);
        setByteField(term18076, term18076.getClass(), "minute", (byte) 2);
        setByteField(term18076, term18076.getClass(), "second", (byte) 42);
        setIntField(term18076, term18076.getClass(), "nano", 202308437);
        setField(term18071, term18071.getClass(), "time", term18076);
        setField(term18046, term18046.getClass(), "lastLoginDate", term18071);
        setBooleanField(term18046, term18046.getClass(), "isWebJoin", true);
        setField(term18046, term18046.getClass(), "webLimitDate", "VuLLXpvPpZ");
        setIntField(term18046, term18046.getClass(), "level", -1735276919);
        setIntField(term18046, term18046.getClass(), "reincarnationNum", -712023865);
        setField(term18046, term18046.getClass(), "exp", "UEdzEKEEEV");
        setLongField(term18046, term18046.getClass(), "point", -1497280900081695731L);
        setLongField(term18046, term18046.getClass(), "totalPoint", -3602825674339018793L);
        setIntField(term18046, term18046.getClass(), "playCount", 613256157);
        setIntField(term18046, term18046.getClass(), "multiPlayCount", 454242689);
        setIntField(term18046, term18046.getClass(), "multiWinCount", 1798354517);
        setIntField(term18046, term18046.getClass(), "requestResCount", -1495693617);
        setIntField(term18046, term18046.getClass(), "acceptResCount", -890538258);
        setIntField(term18046, term18046.getClass(), "successResCount", -1085899912);
        setIntField(term18046, term18046.getClass(), "playerRating", -1458980236);
        setIntField(term18046, term18046.getClass(), "highestRating", 890505372);
        setIntField(term18046, term18046.getClass(), "nameplateId", 2044137055);
        setIntField(term18046, term18046.getClass(), "frameId", -1452324619);
        setIntField(term18046, term18046.getClass(), "characterId", -1121709274);
        setIntField(term18046, term18046.getClass(), "trophyId", -532304223);
        setIntField(term18046, term18046.getClass(), "playedTutorialBit", 666218293);
        setIntField(term18046, term18046.getClass(), "firstTutorialCancelNum", 1737876343);
        setIntField(term18046, term18046.getClass(), "masterTutorialCancelNum", -897937940);
        setIntField(term18046, term18046.getClass(), "totalRepertoireCount", 1523261232);
        setIntField(term18046, term18046.getClass(), "totalMapNum", -428988337);
        setLongField(term18046, term18046.getClass(), "totalHiScore", 3086974592680165932L);
        setLongField(term18046, term18046.getClass(), "totalBasicHighScore", -532956263280568707L);
        setLongField(term18046, term18046.getClass(), "totalAdvancedHighScore", 6073193746616629086L);
        setLongField(term18046, term18046.getClass(), "totalExpertHighScore", -2463629530824341661L);
        setLongField(term18046, term18046.getClass(), "totalMasterHighScore", 7800835025296877231L);
        setIntField(term18133, term18133.getClass(), "year", 2019);
        setShortField(term18133, term18133.getClass(), "month", (short) 12);
        setShortField(term18133, term18133.getClass(), "day", (short) 29);
        setField(term18132, term18132.getClass(), "date", term18133);
        setByteField(term18137, term18137.getClass(), "hour", (byte) 16);
        setByteField(term18137, term18137.getClass(), "minute", (byte) 10);
        setByteField(term18137, term18137.getClass(), "second", (byte) 1);
        setIntField(term18137, term18137.getClass(), "nano", 198559584);
        setField(term18132, term18132.getClass(), "time", term18137);
        setField(term18046, term18046.getClass(), "eventWatchedDate", term18132);
        setIntField(term18046, term18046.getClass(), "friendCount", 48047085);
        setBooleanField(term18046, term18046.getClass(), "isMaimai", true);
        setField(term18046, term18046.getClass(), "firstGameId", "BcENaQFYSd");
        setField(term18046, term18046.getClass(), "firstRomVersion", "POPYycoDBy");
        setField(term18046, term18046.getClass(), "firstDataVersion", "LuWMOXdAPA");
        setIntField(term18181, term18181.getClass(), "year", 2022);
        setShortField(term18181, term18181.getClass(), "month", (short) 5);
        setShortField(term18181, term18181.getClass(), "day", (short) 29);
        setField(term18180, term18180.getClass(), "date", term18181);
        setByteField(term18185, term18185.getClass(), "hour", (byte) 11);
        setByteField(term18185, term18185.getClass(), "minute", (byte) 41);
        setByteField(term18185, term18185.getClass(), "second", (byte) 43);
        setIntField(term18185, term18185.getClass(), "nano", 984890757);
        setField(term18180, term18180.getClass(), "time", term18185);
        setField(term18046, term18046.getClass(), "firstPlayDate", term18180);
        setField(term18046, term18046.getClass(), "lastGameId", "blSffTnsOv");
        setField(term18046, term18046.getClass(), "lastRomVersion", "qbUMcIvEXH");
        setField(term18046, term18046.getClass(), "lastDataVersion", "TVxGTjeDcu");
        setIntField(term18227, term18227.getClass(), "year", 2029);
        setShortField(term18227, term18227.getClass(), "month", (short) 4);
        setShortField(term18227, term18227.getClass(), "day", (short) 27);
        setField(term18226, term18226.getClass(), "date", term18227);
        setByteField(term18231, term18231.getClass(), "hour", (byte) 16);
        setByteField(term18231, term18231.getClass(), "minute", (byte) 25);
        setByteField(term18231, term18231.getClass(), "second", (byte) 10);
        setIntField(term18231, term18231.getClass(), "nano", 699018782);
        setField(term18226, term18226.getClass(), "time", term18231);
        setField(term18046, term18046.getClass(), "lastPlayDate", term18226);
        setIntField(term18046, term18046.getClass(), "lastPlaceId", 1902784843);
        setField(term18046, term18046.getClass(), "lastPlaceName", "ABPtcyCzkR");
        setField(term18046, term18046.getClass(), "lastRegionId", "QgHhxMyKvr");
        setField(term18046, term18046.getClass(), "lastRegionName", "VGiXZZTWRO");
        setField(term18046, term18046.getClass(), "lastAllNetId", "MlPtwXnJOJ");
        setField(term18046, term18046.getClass(), "lastClientId", "DbfiyFeaTe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term18046, args);
    }

};


