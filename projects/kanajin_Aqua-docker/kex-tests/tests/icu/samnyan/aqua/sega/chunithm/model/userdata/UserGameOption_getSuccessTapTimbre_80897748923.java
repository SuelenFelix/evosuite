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

public class UserGameOption_getSuccessTapTimbre_80897748923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59071;

    public UserGameOption_getSuccessTapTimbre_80897748923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59077 = new Long(-8033714905181142681L);
        term59071 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term59073 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term59075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59237 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59283 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59071, term59071.getClass(), "id", -142778328872192310L);
        setLongField(term59073, term59073.getClass(), "id", -7173990301200265783L);
        setLongField(term59075, term59075.getClass(), "id", -5523700551819095387L);
        setField(term59075, term59075.getClass(), "extId", term59077);
        setField(term59075, term59075.getClass(), "luid", "nkmiePLZgp");
        setIntField(term59092, term59092.getClass(), "year", 2014);
        setShortField(term59092, term59092.getClass(), "month", (short) 3);
        setShortField(term59092, term59092.getClass(), "day", (short) 18);
        setField(term59091, term59091.getClass(), "date", term59092);
        setByteField(term59096, term59096.getClass(), "hour", (byte) 9);
        setByteField(term59096, term59096.getClass(), "minute", (byte) 35);
        setByteField(term59096, term59096.getClass(), "second", (byte) 23);
        setIntField(term59096, term59096.getClass(), "nano", 260496752);
        setField(term59091, term59091.getClass(), "time", term59096);
        setField(term59075, term59075.getClass(), "registerTime", term59091);
        setIntField(term59102, term59102.getClass(), "year", 2021);
        setShortField(term59102, term59102.getClass(), "month", (short) 7);
        setShortField(term59102, term59102.getClass(), "day", (short) 28);
        setField(term59101, term59101.getClass(), "date", term59102);
        setByteField(term59106, term59106.getClass(), "hour", (byte) 23);
        setByteField(term59106, term59106.getClass(), "minute", (byte) 12);
        setByteField(term59106, term59106.getClass(), "second", (byte) 32);
        setIntField(term59106, term59106.getClass(), "nano", 773887991);
        setField(term59101, term59101.getClass(), "time", term59106);
        setField(term59075, term59075.getClass(), "accessTime", term59101);
        setField(term59073, term59073.getClass(), "card", term59075);
        setField(term59073, term59073.getClass(), "userName", "VoCvDpwwFr");
        setIntField(term59124, term59124.getClass(), "year", 2014);
        setShortField(term59124, term59124.getClass(), "month", (short) 7);
        setShortField(term59124, term59124.getClass(), "day", (short) 5);
        setField(term59123, term59123.getClass(), "date", term59124);
        setByteField(term59128, term59128.getClass(), "hour", (byte) 16);
        setByteField(term59128, term59128.getClass(), "minute", (byte) 28);
        setByteField(term59128, term59128.getClass(), "second", (byte) 51);
        setIntField(term59128, term59128.getClass(), "nano", 627591414);
        setField(term59123, term59123.getClass(), "time", term59128);
        setField(term59073, term59073.getClass(), "lastLoginDate", term59123);
        setBooleanField(term59073, term59073.getClass(), "isWebJoin", true);
        setField(term59073, term59073.getClass(), "webLimitDate", "zYOmoQqDOd");
        setIntField(term59073, term59073.getClass(), "level", -1635314310);
        setIntField(term59073, term59073.getClass(), "reincarnationNum", -1583672247);
        setField(term59073, term59073.getClass(), "exp", "kmgEVEqTGa");
        setLongField(term59073, term59073.getClass(), "point", -8614603287624597112L);
        setLongField(term59073, term59073.getClass(), "totalPoint", -334717540353714793L);
        setIntField(term59073, term59073.getClass(), "playCount", 1150713854);
        setIntField(term59073, term59073.getClass(), "multiPlayCount", 999843869);
        setIntField(term59073, term59073.getClass(), "multiWinCount", 1047162942);
        setIntField(term59073, term59073.getClass(), "requestResCount", 555668629);
        setIntField(term59073, term59073.getClass(), "acceptResCount", -704789127);
        setIntField(term59073, term59073.getClass(), "successResCount", 2018335018);
        setIntField(term59073, term59073.getClass(), "playerRating", 524629103);
        setIntField(term59073, term59073.getClass(), "highestRating", 601775827);
        setIntField(term59073, term59073.getClass(), "nameplateId", 1713144877);
        setIntField(term59073, term59073.getClass(), "frameId", -513074841);
        setIntField(term59073, term59073.getClass(), "characterId", -1384079183);
        setIntField(term59073, term59073.getClass(), "trophyId", -1401413822);
        setIntField(term59073, term59073.getClass(), "playedTutorialBit", -1735958377);
        setIntField(term59073, term59073.getClass(), "firstTutorialCancelNum", -477618469);
        setIntField(term59073, term59073.getClass(), "masterTutorialCancelNum", 117739625);
        setIntField(term59073, term59073.getClass(), "totalRepertoireCount", -314816968);
        setIntField(term59073, term59073.getClass(), "totalMapNum", -1478972076);
        setLongField(term59073, term59073.getClass(), "totalHiScore", -57359230242997736L);
        setLongField(term59073, term59073.getClass(), "totalBasicHighScore", -7779928833373989299L);
        setLongField(term59073, term59073.getClass(), "totalAdvancedHighScore", 2105697925603985714L);
        setLongField(term59073, term59073.getClass(), "totalExpertHighScore", -589167249491619196L);
        setLongField(term59073, term59073.getClass(), "totalMasterHighScore", 5990686118620195001L);
        setIntField(term59185, term59185.getClass(), "year", 2028);
        setShortField(term59185, term59185.getClass(), "month", (short) 7);
        setShortField(term59185, term59185.getClass(), "day", (short) 20);
        setField(term59184, term59184.getClass(), "date", term59185);
        setByteField(term59189, term59189.getClass(), "hour", (byte) 23);
        setByteField(term59189, term59189.getClass(), "minute", (byte) 53);
        setByteField(term59189, term59189.getClass(), "second", (byte) 34);
        setIntField(term59189, term59189.getClass(), "nano", 196205860);
        setField(term59184, term59184.getClass(), "time", term59189);
        setField(term59073, term59073.getClass(), "eventWatchedDate", term59184);
        setIntField(term59073, term59073.getClass(), "friendCount", 828708445);
        setBooleanField(term59073, term59073.getClass(), "isMaimai", true);
        setField(term59073, term59073.getClass(), "firstGameId", "qakIqInzyM");
        setField(term59073, term59073.getClass(), "firstRomVersion", "EOsBgwlmva");
        setField(term59073, term59073.getClass(), "firstDataVersion", "qcSJruZuJy");
        setIntField(term59233, term59233.getClass(), "year", 2017);
        setShortField(term59233, term59233.getClass(), "month", (short) 4);
        setShortField(term59233, term59233.getClass(), "day", (short) 16);
        setField(term59232, term59232.getClass(), "date", term59233);
        setByteField(term59237, term59237.getClass(), "hour", (byte) 8);
        setByteField(term59237, term59237.getClass(), "minute", (byte) 31);
        setByteField(term59237, term59237.getClass(), "second", (byte) 56);
        setIntField(term59237, term59237.getClass(), "nano", 663406344);
        setField(term59232, term59232.getClass(), "time", term59237);
        setField(term59073, term59073.getClass(), "firstPlayDate", term59232);
        setField(term59073, term59073.getClass(), "lastGameId", "NOSJtfgqAs");
        setField(term59073, term59073.getClass(), "lastRomVersion", "SUDRrjpChc");
        setField(term59073, term59073.getClass(), "lastDataVersion", "pmpprxfFwy");
        setIntField(term59279, term59279.getClass(), "year", 2010);
        setShortField(term59279, term59279.getClass(), "month", (short) 7);
        setShortField(term59279, term59279.getClass(), "day", (short) 8);
        setField(term59278, term59278.getClass(), "date", term59279);
        setByteField(term59283, term59283.getClass(), "hour", (byte) 3);
        setByteField(term59283, term59283.getClass(), "minute", (byte) 45);
        setByteField(term59283, term59283.getClass(), "second", (byte) 2);
        setIntField(term59283, term59283.getClass(), "nano", 15135741);
        setField(term59278, term59278.getClass(), "time", term59283);
        setField(term59073, term59073.getClass(), "lastPlayDate", term59278);
        setIntField(term59073, term59073.getClass(), "lastPlaceId", -1198357943);
        setField(term59073, term59073.getClass(), "lastPlaceName", "AQbnQoJwOO");
        setField(term59073, term59073.getClass(), "lastRegionId", "NnicBPzNzw");
        setField(term59073, term59073.getClass(), "lastRegionName", "WADNPbexnT");
        setField(term59073, term59073.getClass(), "lastAllNetId", "rMbsSfMKvX");
        setField(term59073, term59073.getClass(), "lastClientId", "oCsqRJXMBc");
        setField(term59071, term59071.getClass(), "user", term59073);
        setIntField(term59071, term59071.getClass(), "bgInfo", 407342373);
        setIntField(term59071, term59071.getClass(), "fieldColor", 633857490);
        setIntField(term59071, term59071.getClass(), "guideSound", -602285518);
        setIntField(term59071, term59071.getClass(), "soundEffect", 95548457);
        setIntField(term59071, term59071.getClass(), "guideLine", -652818479);
        setIntField(term59071, term59071.getClass(), "speed", 909221962);
        setIntField(term59071, term59071.getClass(), "optionSet", 1036562171);
        setIntField(term59071, term59071.getClass(), "matching", -1176098787);
        setIntField(term59071, term59071.getClass(), "judgePos", -1108621848);
        setIntField(term59071, term59071.getClass(), "rating", 1868049133);
        setIntField(term59071, term59071.getClass(), "judgeJustice", -2041713971);
        setIntField(term59071, term59071.getClass(), "judgeAttack", 752002755);
        setIntField(term59071, term59071.getClass(), "headphone", -975157064);
        setIntField(term59071, term59071.getClass(), "playerLevel", -378255267);
        setIntField(term59071, term59071.getClass(), "successTap", -1205835103);
        setIntField(term59071, term59071.getClass(), "successExTap", -2022370596);
        setIntField(term59071, term59071.getClass(), "successSlideHold", 856428856);
        setIntField(term59071, term59071.getClass(), "successAir", 1295040350);
        setIntField(term59071, term59071.getClass(), "successFlick", 1744402926);
        setIntField(term59071, term59071.getClass(), "successSkill", -68148707);
        setIntField(term59071, term59071.getClass(), "successTapTimbre", -487634357);
        setIntField(term59071, term59071.getClass(), "privacy", 52605389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessTapTimbre", argTypes, term59071, args);
    }

};


