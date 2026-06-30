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
import java.lang.Integer;

public class ExternalUserData_setRequestResCount_211672433062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24977;
     Object term25228;

    public ExternalUserData_setRequestResCount_211672433062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24977 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term25002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25007 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25162 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24977, term24977.getClass(), "accessCode", "cqCXYaAnFB");
        setField(term24977, term24977.getClass(), "userName", "UPLNFZHXjw");
        setIntField(term25003, term25003.getClass(), "year", 2019);
        setShortField(term25003, term25003.getClass(), "month", (short) 8);
        setShortField(term25003, term25003.getClass(), "day", (short) 6);
        setField(term25002, term25002.getClass(), "date", term25003);
        setByteField(term25007, term25007.getClass(), "hour", (byte) 5);
        setByteField(term25007, term25007.getClass(), "minute", (byte) 32);
        setByteField(term25007, term25007.getClass(), "second", (byte) 47);
        setIntField(term25007, term25007.getClass(), "nano", 73220317);
        setField(term25002, term25002.getClass(), "time", term25007);
        setField(term24977, term24977.getClass(), "lastLoginDate", term25002);
        setBooleanField(term24977, term24977.getClass(), "isWebJoin", false);
        setField(term24977, term24977.getClass(), "webLimitDate", "CwrrJlrGmg");
        setIntField(term24977, term24977.getClass(), "level", 1727771237);
        setIntField(term24977, term24977.getClass(), "reincarnationNum", 2033663549);
        setField(term24977, term24977.getClass(), "exp", "HejzvyejjG");
        setLongField(term24977, term24977.getClass(), "point", 7711054832353934171L);
        setLongField(term24977, term24977.getClass(), "totalPoint", 185544001230120339L);
        setIntField(term24977, term24977.getClass(), "playCount", 1766479154);
        setIntField(term24977, term24977.getClass(), "multiPlayCount", 533171496);
        setIntField(term24977, term24977.getClass(), "multiWinCount", 1369020869);
        setIntField(term24977, term24977.getClass(), "requestResCount", -1428947021);
        setIntField(term24977, term24977.getClass(), "acceptResCount", -134324004);
        setIntField(term24977, term24977.getClass(), "successResCount", -1813266173);
        setIntField(term24977, term24977.getClass(), "playerRating", -1201819537);
        setIntField(term24977, term24977.getClass(), "highestRating", 2135922049);
        setIntField(term24977, term24977.getClass(), "nameplateId", -263876378);
        setIntField(term24977, term24977.getClass(), "frameId", -755209283);
        setIntField(term24977, term24977.getClass(), "characterId", -616562794);
        setIntField(term24977, term24977.getClass(), "trophyId", 750084083);
        setIntField(term24977, term24977.getClass(), "playedTutorialBit", -1603460382);
        setIntField(term24977, term24977.getClass(), "firstTutorialCancelNum", -298939768);
        setIntField(term24977, term24977.getClass(), "masterTutorialCancelNum", -767031634);
        setIntField(term24977, term24977.getClass(), "totalRepertoireCount", -2072469750);
        setIntField(term24977, term24977.getClass(), "totalMapNum", 2106616847);
        setLongField(term24977, term24977.getClass(), "totalHiScore", 4096288569907305445L);
        setLongField(term24977, term24977.getClass(), "totalBasicHighScore", 6940486570215409900L);
        setLongField(term24977, term24977.getClass(), "totalAdvancedHighScore", -7370364068296402536L);
        setLongField(term24977, term24977.getClass(), "totalExpertHighScore", -1084263688306617320L);
        setLongField(term24977, term24977.getClass(), "totalMasterHighScore", 1193381106528373019L);
        setIntField(term25064, term25064.getClass(), "year", 2025);
        setShortField(term25064, term25064.getClass(), "month", (short) 2);
        setShortField(term25064, term25064.getClass(), "day", (short) 23);
        setField(term25063, term25063.getClass(), "date", term25064);
        setByteField(term25068, term25068.getClass(), "hour", (byte) 16);
        setByteField(term25068, term25068.getClass(), "minute", (byte) 39);
        setByteField(term25068, term25068.getClass(), "second", (byte) 42);
        setIntField(term25068, term25068.getClass(), "nano", 342777686);
        setField(term25063, term25063.getClass(), "time", term25068);
        setField(term24977, term24977.getClass(), "eventWatchedDate", term25063);
        setIntField(term24977, term24977.getClass(), "friendCount", 403107947);
        setBooleanField(term24977, term24977.getClass(), "isMaimai", true);
        setField(term24977, term24977.getClass(), "firstGameId", "pbqJjeooBM");
        setField(term24977, term24977.getClass(), "firstRomVersion", "ccnotFfPXt");
        setField(term24977, term24977.getClass(), "firstDataVersion", "plWlgdgIhn");
        setIntField(term25112, term25112.getClass(), "year", 2029);
        setShortField(term25112, term25112.getClass(), "month", (short) 8);
        setShortField(term25112, term25112.getClass(), "day", (short) 14);
        setField(term25111, term25111.getClass(), "date", term25112);
        setByteField(term25116, term25116.getClass(), "hour", (byte) 10);
        setByteField(term25116, term25116.getClass(), "minute", (byte) 28);
        setByteField(term25116, term25116.getClass(), "second", (byte) 23);
        setIntField(term25116, term25116.getClass(), "nano", 676524979);
        setField(term25111, term25111.getClass(), "time", term25116);
        setField(term24977, term24977.getClass(), "firstPlayDate", term25111);
        setField(term24977, term24977.getClass(), "lastGameId", "RZaKVKWtND");
        setField(term24977, term24977.getClass(), "lastRomVersion", "vXiaNiquft");
        setField(term24977, term24977.getClass(), "lastDataVersion", "lucCeiVnYe");
        setIntField(term25158, term25158.getClass(), "year", 2011);
        setShortField(term25158, term25158.getClass(), "month", (short) 9);
        setShortField(term25158, term25158.getClass(), "day", (short) 7);
        setField(term25157, term25157.getClass(), "date", term25158);
        setByteField(term25162, term25162.getClass(), "hour", (byte) 0);
        setByteField(term25162, term25162.getClass(), "minute", (byte) 51);
        setByteField(term25162, term25162.getClass(), "second", (byte) 44);
        setIntField(term25162, term25162.getClass(), "nano", 245610060);
        setField(term25157, term25157.getClass(), "time", term25162);
        setField(term24977, term24977.getClass(), "lastPlayDate", term25157);
        setIntField(term24977, term24977.getClass(), "lastPlaceId", -1433815725);
        setField(term24977, term24977.getClass(), "lastPlaceName", "iYwkCLMsbJ");
        setField(term24977, term24977.getClass(), "lastRegionId", "MXLsVQWrwc");
        setField(term24977, term24977.getClass(), "lastRegionName", "lRaSlqzqNY");
        setField(term24977, term24977.getClass(), "lastAllNetId", "TiEyxWXsra");
        setField(term24977, term24977.getClass(), "lastClientId", "TuLgwTZsPP");
        term25228 = new Integer(-1445089135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25228;
        callMethod(klass, "setRequestResCount", argTypes, term24977, args);
    }

};


