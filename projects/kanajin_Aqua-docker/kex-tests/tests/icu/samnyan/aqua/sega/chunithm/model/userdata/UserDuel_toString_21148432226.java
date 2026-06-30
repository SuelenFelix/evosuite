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

public class UserDuel_toString_21148432226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86889;

    public UserDuel_toString_21148432226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86895 = new Long(-2783999800714825789L);
        term86889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term86891 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term86893 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86924 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87007 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87176 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86889, term86889.getClass(), "id", -177713589369472164L);
        setLongField(term86891, term86891.getClass(), "id", 792816556387097064L);
        setLongField(term86893, term86893.getClass(), "id", 5391287373597316604L);
        setField(term86893, term86893.getClass(), "extId", term86895);
        setField(term86893, term86893.getClass(), "luid", "XRhNVGJlMP");
        setIntField(term86910, term86910.getClass(), "year", 2026);
        setShortField(term86910, term86910.getClass(), "month", (short) 3);
        setShortField(term86910, term86910.getClass(), "day", (short) 11);
        setField(term86909, term86909.getClass(), "date", term86910);
        setByteField(term86914, term86914.getClass(), "hour", (byte) 5);
        setByteField(term86914, term86914.getClass(), "minute", (byte) 28);
        setByteField(term86914, term86914.getClass(), "second", (byte) 38);
        setIntField(term86914, term86914.getClass(), "nano", 951846633);
        setField(term86909, term86909.getClass(), "time", term86914);
        setField(term86893, term86893.getClass(), "registerTime", term86909);
        setIntField(term86920, term86920.getClass(), "year", 2025);
        setShortField(term86920, term86920.getClass(), "month", (short) 3);
        setShortField(term86920, term86920.getClass(), "day", (short) 12);
        setField(term86919, term86919.getClass(), "date", term86920);
        setByteField(term86924, term86924.getClass(), "hour", (byte) 2);
        setByteField(term86924, term86924.getClass(), "minute", (byte) 17);
        setByteField(term86924, term86924.getClass(), "second", (byte) 13);
        setIntField(term86924, term86924.getClass(), "nano", 667967879);
        setField(term86919, term86919.getClass(), "time", term86924);
        setField(term86893, term86893.getClass(), "accessTime", term86919);
        setField(term86891, term86891.getClass(), "card", term86893);
        setField(term86891, term86891.getClass(), "userName", "OGvydrXtac");
        setIntField(term86942, term86942.getClass(), "year", 2017);
        setShortField(term86942, term86942.getClass(), "month", (short) 2);
        setShortField(term86942, term86942.getClass(), "day", (short) 5);
        setField(term86941, term86941.getClass(), "date", term86942);
        setByteField(term86946, term86946.getClass(), "hour", (byte) 21);
        setByteField(term86946, term86946.getClass(), "minute", (byte) 39);
        setByteField(term86946, term86946.getClass(), "second", (byte) 40);
        setIntField(term86946, term86946.getClass(), "nano", 124450071);
        setField(term86941, term86941.getClass(), "time", term86946);
        setField(term86891, term86891.getClass(), "lastLoginDate", term86941);
        setBooleanField(term86891, term86891.getClass(), "isWebJoin", true);
        setField(term86891, term86891.getClass(), "webLimitDate", "SaPfgULGFp");
        setIntField(term86891, term86891.getClass(), "level", -131983803);
        setIntField(term86891, term86891.getClass(), "reincarnationNum", -939562832);
        setField(term86891, term86891.getClass(), "exp", "olLmzJWshP");
        setLongField(term86891, term86891.getClass(), "point", 6929574138600777534L);
        setLongField(term86891, term86891.getClass(), "totalPoint", 7306228148506563384L);
        setIntField(term86891, term86891.getClass(), "playCount", 885547834);
        setIntField(term86891, term86891.getClass(), "multiPlayCount", 950260961);
        setIntField(term86891, term86891.getClass(), "multiWinCount", 1260887150);
        setIntField(term86891, term86891.getClass(), "requestResCount", -1320147216);
        setIntField(term86891, term86891.getClass(), "acceptResCount", -2003639421);
        setIntField(term86891, term86891.getClass(), "successResCount", -1986137013);
        setIntField(term86891, term86891.getClass(), "playerRating", 1067010136);
        setIntField(term86891, term86891.getClass(), "highestRating", 1093205391);
        setIntField(term86891, term86891.getClass(), "nameplateId", 712406676);
        setIntField(term86891, term86891.getClass(), "frameId", -689175370);
        setIntField(term86891, term86891.getClass(), "characterId", 1928157231);
        setIntField(term86891, term86891.getClass(), "trophyId", -2074171560);
        setIntField(term86891, term86891.getClass(), "playedTutorialBit", -1484133359);
        setIntField(term86891, term86891.getClass(), "firstTutorialCancelNum", -221900568);
        setIntField(term86891, term86891.getClass(), "masterTutorialCancelNum", -660551612);
        setIntField(term86891, term86891.getClass(), "totalRepertoireCount", -1263481774);
        setIntField(term86891, term86891.getClass(), "totalMapNum", 304959828);
        setLongField(term86891, term86891.getClass(), "totalHiScore", -3759875741196067125L);
        setLongField(term86891, term86891.getClass(), "totalBasicHighScore", 3301022507846192876L);
        setLongField(term86891, term86891.getClass(), "totalAdvancedHighScore", -436006713622235897L);
        setLongField(term86891, term86891.getClass(), "totalExpertHighScore", -5888397861122761293L);
        setLongField(term86891, term86891.getClass(), "totalMasterHighScore", -2860770035477349220L);
        setIntField(term87003, term87003.getClass(), "year", 2017);
        setShortField(term87003, term87003.getClass(), "month", (short) 12);
        setShortField(term87003, term87003.getClass(), "day", (short) 4);
        setField(term87002, term87002.getClass(), "date", term87003);
        setByteField(term87007, term87007.getClass(), "hour", (byte) 17);
        setByteField(term87007, term87007.getClass(), "minute", (byte) 31);
        setByteField(term87007, term87007.getClass(), "second", (byte) 26);
        setIntField(term87007, term87007.getClass(), "nano", 462103828);
        setField(term87002, term87002.getClass(), "time", term87007);
        setField(term86891, term86891.getClass(), "eventWatchedDate", term87002);
        setIntField(term86891, term86891.getClass(), "friendCount", -398737037);
        setBooleanField(term86891, term86891.getClass(), "isMaimai", false);
        setField(term86891, term86891.getClass(), "firstGameId", "VbgHjUqRYR");
        setField(term86891, term86891.getClass(), "firstRomVersion", "qZzSujRYqy");
        setField(term86891, term86891.getClass(), "firstDataVersion", "IJXeeXjhgd");
        setIntField(term87051, term87051.getClass(), "year", 2023);
        setShortField(term87051, term87051.getClass(), "month", (short) 8);
        setShortField(term87051, term87051.getClass(), "day", (short) 23);
        setField(term87050, term87050.getClass(), "date", term87051);
        setByteField(term87055, term87055.getClass(), "hour", (byte) 23);
        setByteField(term87055, term87055.getClass(), "minute", (byte) 38);
        setByteField(term87055, term87055.getClass(), "second", (byte) 9);
        setIntField(term87055, term87055.getClass(), "nano", 356476969);
        setField(term87050, term87050.getClass(), "time", term87055);
        setField(term86891, term86891.getClass(), "firstPlayDate", term87050);
        setField(term86891, term86891.getClass(), "lastGameId", "QTDAUOmsVV");
        setField(term86891, term86891.getClass(), "lastRomVersion", "ODrpsXzKlX");
        setField(term86891, term86891.getClass(), "lastDataVersion", "xxswizwuwy");
        setIntField(term87097, term87097.getClass(), "year", 2014);
        setShortField(term87097, term87097.getClass(), "month", (short) 4);
        setShortField(term87097, term87097.getClass(), "day", (short) 23);
        setField(term87096, term87096.getClass(), "date", term87097);
        setByteField(term87101, term87101.getClass(), "hour", (byte) 21);
        setByteField(term87101, term87101.getClass(), "minute", (byte) 18);
        setByteField(term87101, term87101.getClass(), "second", (byte) 52);
        setIntField(term87101, term87101.getClass(), "nano", 192261366);
        setField(term87096, term87096.getClass(), "time", term87101);
        setField(term86891, term86891.getClass(), "lastPlayDate", term87096);
        setIntField(term86891, term86891.getClass(), "lastPlaceId", 108801223);
        setField(term86891, term86891.getClass(), "lastPlaceName", "QbkfeBvHco");
        setField(term86891, term86891.getClass(), "lastRegionId", "lLaCGEQqCV");
        setField(term86891, term86891.getClass(), "lastRegionName", "bYFQVigzOV");
        setField(term86891, term86891.getClass(), "lastAllNetId", "TXKwwgcTVt");
        setField(term86891, term86891.getClass(), "lastClientId", "FgaHDSytdu");
        setField(term86889, term86889.getClass(), "user", term86891);
        setIntField(term86889, term86889.getClass(), "duelId", 1181798962);
        setIntField(term86889, term86889.getClass(), "progress", 1950935768);
        setIntField(term86889, term86889.getClass(), "point", -733715380);
        setBooleanField(term86889, term86889.getClass(), "isClear", true);
        setIntField(term87172, term87172.getClass(), "year", 2027);
        setShortField(term87172, term87172.getClass(), "month", (short) 2);
        setShortField(term87172, term87172.getClass(), "day", (short) 9);
        setField(term87171, term87171.getClass(), "date", term87172);
        setByteField(term87176, term87176.getClass(), "hour", (byte) 9);
        setByteField(term87176, term87176.getClass(), "minute", (byte) 1);
        setByteField(term87176, term87176.getClass(), "second", (byte) 14);
        setIntField(term87176, term87176.getClass(), "nano", 990366124);
        setField(term87171, term87171.getClass(), "time", term87176);
        setField(term86889, term86889.getClass(), "lastPlayDate", term87171);
        setIntField(term86889, term86889.getClass(), "param1", 1537598422);
        setIntField(term86889, term86889.getClass(), "param2", 2011217936);
        setIntField(term86889, term86889.getClass(), "param3", 490201050);
        setIntField(term86889, term86889.getClass(), "param4", 1544509853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term86889, args);
    }

};


