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

public class ExternalUserData_getLastClientId_97120159548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19249;

    public ExternalUserData_getLastClientId_97120159548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19249 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term19274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19388 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19434 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19249, term19249.getClass(), "accessCode", "aJQuCOCvZs");
        setField(term19249, term19249.getClass(), "userName", "lHYNCJRiOv");
        setIntField(term19275, term19275.getClass(), "year", 2017);
        setShortField(term19275, term19275.getClass(), "month", (short) 6);
        setShortField(term19275, term19275.getClass(), "day", (short) 7);
        setField(term19274, term19274.getClass(), "date", term19275);
        setByteField(term19279, term19279.getClass(), "hour", (byte) 13);
        setByteField(term19279, term19279.getClass(), "minute", (byte) 52);
        setByteField(term19279, term19279.getClass(), "second", (byte) 17);
        setIntField(term19279, term19279.getClass(), "nano", 78180039);
        setField(term19274, term19274.getClass(), "time", term19279);
        setField(term19249, term19249.getClass(), "lastLoginDate", term19274);
        setBooleanField(term19249, term19249.getClass(), "isWebJoin", true);
        setField(term19249, term19249.getClass(), "webLimitDate", "QVLresHoaP");
        setIntField(term19249, term19249.getClass(), "level", 360972386);
        setIntField(term19249, term19249.getClass(), "reincarnationNum", -2063884849);
        setField(term19249, term19249.getClass(), "exp", "IbxeAMwLVt");
        setLongField(term19249, term19249.getClass(), "point", 146749226579788091L);
        setLongField(term19249, term19249.getClass(), "totalPoint", -1279670138064751276L);
        setIntField(term19249, term19249.getClass(), "playCount", 1054887169);
        setIntField(term19249, term19249.getClass(), "multiPlayCount", 692873905);
        setIntField(term19249, term19249.getClass(), "multiWinCount", 1734759369);
        setIntField(term19249, term19249.getClass(), "requestResCount", 1841493736);
        setIntField(term19249, term19249.getClass(), "acceptResCount", 320739944);
        setIntField(term19249, term19249.getClass(), "successResCount", 760218111);
        setIntField(term19249, term19249.getClass(), "playerRating", -1986366126);
        setIntField(term19249, term19249.getClass(), "highestRating", -1963228619);
        setIntField(term19249, term19249.getClass(), "nameplateId", -709868952);
        setIntField(term19249, term19249.getClass(), "frameId", 847207929);
        setIntField(term19249, term19249.getClass(), "characterId", -1665928103);
        setIntField(term19249, term19249.getClass(), "trophyId", 1574458332);
        setIntField(term19249, term19249.getClass(), "playedTutorialBit", -975856245);
        setIntField(term19249, term19249.getClass(), "firstTutorialCancelNum", -1023366103);
        setIntField(term19249, term19249.getClass(), "masterTutorialCancelNum", 81427089);
        setIntField(term19249, term19249.getClass(), "totalRepertoireCount", 755951489);
        setIntField(term19249, term19249.getClass(), "totalMapNum", 1175146356);
        setLongField(term19249, term19249.getClass(), "totalHiScore", -7205236974351118210L);
        setLongField(term19249, term19249.getClass(), "totalBasicHighScore", -2136893352275781569L);
        setLongField(term19249, term19249.getClass(), "totalAdvancedHighScore", -9147545274054597570L);
        setLongField(term19249, term19249.getClass(), "totalExpertHighScore", -8398381579707958144L);
        setLongField(term19249, term19249.getClass(), "totalMasterHighScore", -2195061939206930224L);
        setIntField(term19336, term19336.getClass(), "year", 2017);
        setShortField(term19336, term19336.getClass(), "month", (short) 6);
        setShortField(term19336, term19336.getClass(), "day", (short) 23);
        setField(term19335, term19335.getClass(), "date", term19336);
        setByteField(term19340, term19340.getClass(), "hour", (byte) 23);
        setByteField(term19340, term19340.getClass(), "minute", (byte) 29);
        setByteField(term19340, term19340.getClass(), "second", (byte) 17);
        setIntField(term19340, term19340.getClass(), "nano", 491252353);
        setField(term19335, term19335.getClass(), "time", term19340);
        setField(term19249, term19249.getClass(), "eventWatchedDate", term19335);
        setIntField(term19249, term19249.getClass(), "friendCount", -2137419728);
        setBooleanField(term19249, term19249.getClass(), "isMaimai", true);
        setField(term19249, term19249.getClass(), "firstGameId", "bShlAqoTmZ");
        setField(term19249, term19249.getClass(), "firstRomVersion", "nOKlKlNhtU");
        setField(term19249, term19249.getClass(), "firstDataVersion", "gXFNBHJSey");
        setIntField(term19384, term19384.getClass(), "year", 2021);
        setShortField(term19384, term19384.getClass(), "month", (short) 12);
        setShortField(term19384, term19384.getClass(), "day", (short) 23);
        setField(term19383, term19383.getClass(), "date", term19384);
        setByteField(term19388, term19388.getClass(), "hour", (byte) 18);
        setByteField(term19388, term19388.getClass(), "minute", (byte) 52);
        setByteField(term19388, term19388.getClass(), "second", (byte) 27);
        setIntField(term19388, term19388.getClass(), "nano", 512484524);
        setField(term19383, term19383.getClass(), "time", term19388);
        setField(term19249, term19249.getClass(), "firstPlayDate", term19383);
        setField(term19249, term19249.getClass(), "lastGameId", "wUcSfItZgv");
        setField(term19249, term19249.getClass(), "lastRomVersion", "rOfPCPHmtJ");
        setField(term19249, term19249.getClass(), "lastDataVersion", "EnmiAvfpJv");
        setIntField(term19430, term19430.getClass(), "year", 2012);
        setShortField(term19430, term19430.getClass(), "month", (short) 6);
        setShortField(term19430, term19430.getClass(), "day", (short) 25);
        setField(term19429, term19429.getClass(), "date", term19430);
        setByteField(term19434, term19434.getClass(), "hour", (byte) 2);
        setByteField(term19434, term19434.getClass(), "minute", (byte) 21);
        setByteField(term19434, term19434.getClass(), "second", (byte) 28);
        setIntField(term19434, term19434.getClass(), "nano", 605177282);
        setField(term19429, term19429.getClass(), "time", term19434);
        setField(term19249, term19249.getClass(), "lastPlayDate", term19429);
        setIntField(term19249, term19249.getClass(), "lastPlaceId", 1558810715);
        setField(term19249, term19249.getClass(), "lastPlaceName", "AdYzLPMcwe");
        setField(term19249, term19249.getClass(), "lastRegionId", "FrTZLybkKk");
        setField(term19249, term19249.getClass(), "lastRegionName", "FlxVmiMYKP");
        setField(term19249, term19249.getClass(), "lastAllNetId", "fgOpAWlGYN");
        setField(term19249, term19249.getClass(), "lastClientId", "PNzNzzjSXM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term19249, args);
    }

};


