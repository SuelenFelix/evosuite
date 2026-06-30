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

public class UserData_getAcceptResCount_84719354415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135771;

    public UserData_getAcceptResCount_84719354415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135775 = new Long(5315236285592892506L);
        term135771 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term135773 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135794 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135935 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135981 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135771, term135771.getClass(), "id", 6148234968144914875L);
        setLongField(term135773, term135773.getClass(), "id", -3787619679141862761L);
        setField(term135773, term135773.getClass(), "extId", term135775);
        setField(term135773, term135773.getClass(), "luid", "INNyzaqXFS");
        setIntField(term135790, term135790.getClass(), "year", 2026);
        setShortField(term135790, term135790.getClass(), "month", (short) 8);
        setShortField(term135790, term135790.getClass(), "day", (short) 2);
        setField(term135789, term135789.getClass(), "date", term135790);
        setByteField(term135794, term135794.getClass(), "hour", (byte) 21);
        setByteField(term135794, term135794.getClass(), "minute", (byte) 44);
        setByteField(term135794, term135794.getClass(), "second", (byte) 5);
        setIntField(term135794, term135794.getClass(), "nano", 468273164);
        setField(term135789, term135789.getClass(), "time", term135794);
        setField(term135773, term135773.getClass(), "registerTime", term135789);
        setIntField(term135800, term135800.getClass(), "year", 2017);
        setShortField(term135800, term135800.getClass(), "month", (short) 3);
        setShortField(term135800, term135800.getClass(), "day", (short) 12);
        setField(term135799, term135799.getClass(), "date", term135800);
        setByteField(term135804, term135804.getClass(), "hour", (byte) 7);
        setByteField(term135804, term135804.getClass(), "minute", (byte) 19);
        setByteField(term135804, term135804.getClass(), "second", (byte) 13);
        setIntField(term135804, term135804.getClass(), "nano", 859133326);
        setField(term135799, term135799.getClass(), "time", term135804);
        setField(term135773, term135773.getClass(), "accessTime", term135799);
        setField(term135771, term135771.getClass(), "card", term135773);
        setField(term135771, term135771.getClass(), "userName", "GdZWpscDov");
        setIntField(term135822, term135822.getClass(), "year", 2022);
        setShortField(term135822, term135822.getClass(), "month", (short) 8);
        setShortField(term135822, term135822.getClass(), "day", (short) 5);
        setField(term135821, term135821.getClass(), "date", term135822);
        setByteField(term135826, term135826.getClass(), "hour", (byte) 21);
        setByteField(term135826, term135826.getClass(), "minute", (byte) 56);
        setByteField(term135826, term135826.getClass(), "second", (byte) 57);
        setIntField(term135826, term135826.getClass(), "nano", 476201299);
        setField(term135821, term135821.getClass(), "time", term135826);
        setField(term135771, term135771.getClass(), "lastLoginDate", term135821);
        setBooleanField(term135771, term135771.getClass(), "isWebJoin", true);
        setField(term135771, term135771.getClass(), "webLimitDate", "RzzlJFJcij");
        setIntField(term135771, term135771.getClass(), "level", 1310459040);
        setIntField(term135771, term135771.getClass(), "reincarnationNum", -1541373961);
        setField(term135771, term135771.getClass(), "exp", "eADknKlQVd");
        setLongField(term135771, term135771.getClass(), "point", 3595654468325902203L);
        setLongField(term135771, term135771.getClass(), "totalPoint", -5890498762874763812L);
        setIntField(term135771, term135771.getClass(), "playCount", 28333171);
        setIntField(term135771, term135771.getClass(), "multiPlayCount", 431237954);
        setIntField(term135771, term135771.getClass(), "multiWinCount", 346905618);
        setIntField(term135771, term135771.getClass(), "requestResCount", -1748246525);
        setIntField(term135771, term135771.getClass(), "acceptResCount", 827719881);
        setIntField(term135771, term135771.getClass(), "successResCount", 1244517645);
        setIntField(term135771, term135771.getClass(), "playerRating", 687325220);
        setIntField(term135771, term135771.getClass(), "highestRating", 1625459515);
        setIntField(term135771, term135771.getClass(), "nameplateId", -587695160);
        setIntField(term135771, term135771.getClass(), "frameId", 1418102078);
        setIntField(term135771, term135771.getClass(), "characterId", -1980653473);
        setIntField(term135771, term135771.getClass(), "trophyId", -1681323081);
        setIntField(term135771, term135771.getClass(), "playedTutorialBit", -365670276);
        setIntField(term135771, term135771.getClass(), "firstTutorialCancelNum", 163534924);
        setIntField(term135771, term135771.getClass(), "masterTutorialCancelNum", 1575479969);
        setIntField(term135771, term135771.getClass(), "totalRepertoireCount", -583257141);
        setIntField(term135771, term135771.getClass(), "totalMapNum", -949536306);
        setLongField(term135771, term135771.getClass(), "totalHiScore", 336723219273701338L);
        setLongField(term135771, term135771.getClass(), "totalBasicHighScore", 6556523216612833778L);
        setLongField(term135771, term135771.getClass(), "totalAdvancedHighScore", -5995037992334109399L);
        setLongField(term135771, term135771.getClass(), "totalExpertHighScore", 95336991964157322L);
        setLongField(term135771, term135771.getClass(), "totalMasterHighScore", -7344726906694816984L);
        setIntField(term135883, term135883.getClass(), "year", 2027);
        setShortField(term135883, term135883.getClass(), "month", (short) 3);
        setShortField(term135883, term135883.getClass(), "day", (short) 16);
        setField(term135882, term135882.getClass(), "date", term135883);
        setByteField(term135887, term135887.getClass(), "hour", (byte) 15);
        setByteField(term135887, term135887.getClass(), "minute", (byte) 24);
        setByteField(term135887, term135887.getClass(), "second", (byte) 44);
        setIntField(term135887, term135887.getClass(), "nano", 527222515);
        setField(term135882, term135882.getClass(), "time", term135887);
        setField(term135771, term135771.getClass(), "eventWatchedDate", term135882);
        setIntField(term135771, term135771.getClass(), "friendCount", -531020119);
        setBooleanField(term135771, term135771.getClass(), "isMaimai", true);
        setField(term135771, term135771.getClass(), "firstGameId", "hfwLnDHizJ");
        setField(term135771, term135771.getClass(), "firstRomVersion", "eZGPUdohTF");
        setField(term135771, term135771.getClass(), "firstDataVersion", "NyINyLwoLC");
        setIntField(term135931, term135931.getClass(), "year", 2020);
        setShortField(term135931, term135931.getClass(), "month", (short) 9);
        setShortField(term135931, term135931.getClass(), "day", (short) 8);
        setField(term135930, term135930.getClass(), "date", term135931);
        setByteField(term135935, term135935.getClass(), "hour", (byte) 12);
        setByteField(term135935, term135935.getClass(), "minute", (byte) 3);
        setByteField(term135935, term135935.getClass(), "second", (byte) 13);
        setIntField(term135935, term135935.getClass(), "nano", 221235660);
        setField(term135930, term135930.getClass(), "time", term135935);
        setField(term135771, term135771.getClass(), "firstPlayDate", term135930);
        setField(term135771, term135771.getClass(), "lastGameId", "VdHJiosxsv");
        setField(term135771, term135771.getClass(), "lastRomVersion", "wOuPdBQeOx");
        setField(term135771, term135771.getClass(), "lastDataVersion", "qKKlbLWTDU");
        setIntField(term135977, term135977.getClass(), "year", 2027);
        setShortField(term135977, term135977.getClass(), "month", (short) 8);
        setShortField(term135977, term135977.getClass(), "day", (short) 7);
        setField(term135976, term135976.getClass(), "date", term135977);
        setByteField(term135981, term135981.getClass(), "hour", (byte) 10);
        setByteField(term135981, term135981.getClass(), "minute", (byte) 15);
        setByteField(term135981, term135981.getClass(), "second", (byte) 10);
        setIntField(term135981, term135981.getClass(), "nano", 434062713);
        setField(term135976, term135976.getClass(), "time", term135981);
        setField(term135771, term135771.getClass(), "lastPlayDate", term135976);
        setIntField(term135771, term135771.getClass(), "lastPlaceId", 257618497);
        setField(term135771, term135771.getClass(), "lastPlaceName", "vtiTWIgEVa");
        setField(term135771, term135771.getClass(), "lastRegionId", "eLERRBMHza");
        setField(term135771, term135771.getClass(), "lastRegionName", "nNDwdMSbzC");
        setField(term135771, term135771.getClass(), "lastAllNetId", "cIeVoTDYCV");
        setField(term135771, term135771.getClass(), "lastClientId", "zHjWGfGucL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAcceptResCount", argTypes, term135771, args);
    }

};


