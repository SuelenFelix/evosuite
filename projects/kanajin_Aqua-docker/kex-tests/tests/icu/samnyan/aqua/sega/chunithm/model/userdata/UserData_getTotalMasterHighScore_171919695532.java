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

public class UserData_getTotalMasterHighScore_171919695532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143013;

    public UserData_getTotalMasterHighScore_171919695532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143017 = new Long(-1526729287349763895L);
        term143013 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term143015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143013, term143013.getClass(), "id", -8374850050587369525L);
        setLongField(term143015, term143015.getClass(), "id", -836756629676792866L);
        setField(term143015, term143015.getClass(), "extId", term143017);
        setField(term143015, term143015.getClass(), "luid", "PVcjWjrzGf");
        setIntField(term143032, term143032.getClass(), "year", 2022);
        setShortField(term143032, term143032.getClass(), "month", (short) 8);
        setShortField(term143032, term143032.getClass(), "day", (short) 12);
        setField(term143031, term143031.getClass(), "date", term143032);
        setByteField(term143036, term143036.getClass(), "hour", (byte) 9);
        setByteField(term143036, term143036.getClass(), "minute", (byte) 43);
        setByteField(term143036, term143036.getClass(), "second", (byte) 41);
        setIntField(term143036, term143036.getClass(), "nano", 995486858);
        setField(term143031, term143031.getClass(), "time", term143036);
        setField(term143015, term143015.getClass(), "registerTime", term143031);
        setIntField(term143042, term143042.getClass(), "year", 2012);
        setShortField(term143042, term143042.getClass(), "month", (short) 12);
        setShortField(term143042, term143042.getClass(), "day", (short) 6);
        setField(term143041, term143041.getClass(), "date", term143042);
        setByteField(term143046, term143046.getClass(), "hour", (byte) 16);
        setByteField(term143046, term143046.getClass(), "minute", (byte) 26);
        setByteField(term143046, term143046.getClass(), "second", (byte) 56);
        setIntField(term143046, term143046.getClass(), "nano", 804030555);
        setField(term143041, term143041.getClass(), "time", term143046);
        setField(term143015, term143015.getClass(), "accessTime", term143041);
        setField(term143013, term143013.getClass(), "card", term143015);
        setField(term143013, term143013.getClass(), "userName", "EsauoauZcZ");
        setIntField(term143064, term143064.getClass(), "year", 2010);
        setShortField(term143064, term143064.getClass(), "month", (short) 6);
        setShortField(term143064, term143064.getClass(), "day", (short) 27);
        setField(term143063, term143063.getClass(), "date", term143064);
        setByteField(term143068, term143068.getClass(), "hour", (byte) 13);
        setByteField(term143068, term143068.getClass(), "minute", (byte) 22);
        setByteField(term143068, term143068.getClass(), "second", (byte) 45);
        setIntField(term143068, term143068.getClass(), "nano", 361347351);
        setField(term143063, term143063.getClass(), "time", term143068);
        setField(term143013, term143013.getClass(), "lastLoginDate", term143063);
        setBooleanField(term143013, term143013.getClass(), "isWebJoin", true);
        setField(term143013, term143013.getClass(), "webLimitDate", "qiDNqUNRHY");
        setIntField(term143013, term143013.getClass(), "level", 1635397327);
        setIntField(term143013, term143013.getClass(), "reincarnationNum", -1407747575);
        setField(term143013, term143013.getClass(), "exp", "WjRIILfuQl");
        setLongField(term143013, term143013.getClass(), "point", 4672991654432888841L);
        setLongField(term143013, term143013.getClass(), "totalPoint", 3076752280520665463L);
        setIntField(term143013, term143013.getClass(), "playCount", -129952888);
        setIntField(term143013, term143013.getClass(), "multiPlayCount", 1093590118);
        setIntField(term143013, term143013.getClass(), "multiWinCount", -610005848);
        setIntField(term143013, term143013.getClass(), "requestResCount", 1856644657);
        setIntField(term143013, term143013.getClass(), "acceptResCount", -1777396332);
        setIntField(term143013, term143013.getClass(), "successResCount", 1949483184);
        setIntField(term143013, term143013.getClass(), "playerRating", -116853826);
        setIntField(term143013, term143013.getClass(), "highestRating", 720273368);
        setIntField(term143013, term143013.getClass(), "nameplateId", 439433705);
        setIntField(term143013, term143013.getClass(), "frameId", 651646147);
        setIntField(term143013, term143013.getClass(), "characterId", -182685183);
        setIntField(term143013, term143013.getClass(), "trophyId", 1900550190);
        setIntField(term143013, term143013.getClass(), "playedTutorialBit", -223373115);
        setIntField(term143013, term143013.getClass(), "firstTutorialCancelNum", -2069853525);
        setIntField(term143013, term143013.getClass(), "masterTutorialCancelNum", -20546610);
        setIntField(term143013, term143013.getClass(), "totalRepertoireCount", 2028422247);
        setIntField(term143013, term143013.getClass(), "totalMapNum", 776507834);
        setLongField(term143013, term143013.getClass(), "totalHiScore", 2416212527872886191L);
        setLongField(term143013, term143013.getClass(), "totalBasicHighScore", -167485056215007058L);
        setLongField(term143013, term143013.getClass(), "totalAdvancedHighScore", 8799846684737844264L);
        setLongField(term143013, term143013.getClass(), "totalExpertHighScore", 6561793945762759671L);
        setLongField(term143013, term143013.getClass(), "totalMasterHighScore", 7570535625157096519L);
        setIntField(term143125, term143125.getClass(), "year", 2021);
        setShortField(term143125, term143125.getClass(), "month", (short) 7);
        setShortField(term143125, term143125.getClass(), "day", (short) 18);
        setField(term143124, term143124.getClass(), "date", term143125);
        setByteField(term143129, term143129.getClass(), "hour", (byte) 7);
        setByteField(term143129, term143129.getClass(), "minute", (byte) 43);
        setByteField(term143129, term143129.getClass(), "second", (byte) 56);
        setIntField(term143129, term143129.getClass(), "nano", 808758976);
        setField(term143124, term143124.getClass(), "time", term143129);
        setField(term143013, term143013.getClass(), "eventWatchedDate", term143124);
        setIntField(term143013, term143013.getClass(), "friendCount", -1588665163);
        setBooleanField(term143013, term143013.getClass(), "isMaimai", false);
        setField(term143013, term143013.getClass(), "firstGameId", "FqgiIhfmCu");
        setField(term143013, term143013.getClass(), "firstRomVersion", "oENXVcVJUC");
        setField(term143013, term143013.getClass(), "firstDataVersion", "ytIVCXPyNV");
        setIntField(term143173, term143173.getClass(), "year", 2018);
        setShortField(term143173, term143173.getClass(), "month", (short) 2);
        setShortField(term143173, term143173.getClass(), "day", (short) 7);
        setField(term143172, term143172.getClass(), "date", term143173);
        setByteField(term143177, term143177.getClass(), "hour", (byte) 5);
        setByteField(term143177, term143177.getClass(), "minute", (byte) 0);
        setByteField(term143177, term143177.getClass(), "second", (byte) 50);
        setIntField(term143177, term143177.getClass(), "nano", 985070724);
        setField(term143172, term143172.getClass(), "time", term143177);
        setField(term143013, term143013.getClass(), "firstPlayDate", term143172);
        setField(term143013, term143013.getClass(), "lastGameId", "LmUSMvJtpQ");
        setField(term143013, term143013.getClass(), "lastRomVersion", "eoDQvGDMGx");
        setField(term143013, term143013.getClass(), "lastDataVersion", "OtuSXazGGk");
        setIntField(term143219, term143219.getClass(), "year", 2021);
        setShortField(term143219, term143219.getClass(), "month", (short) 4);
        setShortField(term143219, term143219.getClass(), "day", (short) 5);
        setField(term143218, term143218.getClass(), "date", term143219);
        setByteField(term143223, term143223.getClass(), "hour", (byte) 20);
        setByteField(term143223, term143223.getClass(), "minute", (byte) 24);
        setByteField(term143223, term143223.getClass(), "second", (byte) 23);
        setIntField(term143223, term143223.getClass(), "nano", 231428214);
        setField(term143218, term143218.getClass(), "time", term143223);
        setField(term143013, term143013.getClass(), "lastPlayDate", term143218);
        setIntField(term143013, term143013.getClass(), "lastPlaceId", -986489468);
        setField(term143013, term143013.getClass(), "lastPlaceName", "tBhjvegtdH");
        setField(term143013, term143013.getClass(), "lastRegionId", "OpHteeKkID");
        setField(term143013, term143013.getClass(), "lastRegionName", "EPqrGqPuGp");
        setField(term143013, term143013.getClass(), "lastAllNetId", "fevqUofURr");
        setField(term143013, term143013.getClass(), "lastClientId", "jvawePHFow");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term143013, args);
    }

};


