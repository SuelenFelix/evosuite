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
import java.lang.Long;
import java.lang.Object;

public class UserGeneralData_init_9436292114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309105;
     Object term309107;

    public UserGeneralData_init_9436292114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309105 = new Long(2360637695125275815L);
        Long term309111 = new Long(-3188913050877092148L);
        term309107 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term309109 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term309125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309223 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309317 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term309107, term309107.getClass(), "id", 4067141811082925813L);
        setLongField(term309109, term309109.getClass(), "id", -2948442217672242951L);
        setField(term309109, term309109.getClass(), "extId", term309111);
        setField(term309109, term309109.getClass(), "luid", "LVDexpaQJR");
        setIntField(term309126, term309126.getClass(), "year", 2015);
        setShortField(term309126, term309126.getClass(), "month", (short) 2);
        setShortField(term309126, term309126.getClass(), "day", (short) 28);
        setField(term309125, term309125.getClass(), "date", term309126);
        setByteField(term309130, term309130.getClass(), "hour", (byte) 9);
        setByteField(term309130, term309130.getClass(), "minute", (byte) 38);
        setByteField(term309130, term309130.getClass(), "second", (byte) 11);
        setIntField(term309130, term309130.getClass(), "nano", 10839960);
        setField(term309125, term309125.getClass(), "time", term309130);
        setField(term309109, term309109.getClass(), "registerTime", term309125);
        setIntField(term309136, term309136.getClass(), "year", 2027);
        setShortField(term309136, term309136.getClass(), "month", (short) 11);
        setShortField(term309136, term309136.getClass(), "day", (short) 29);
        setField(term309135, term309135.getClass(), "date", term309136);
        setByteField(term309140, term309140.getClass(), "hour", (byte) 10);
        setByteField(term309140, term309140.getClass(), "minute", (byte) 17);
        setByteField(term309140, term309140.getClass(), "second", (byte) 51);
        setIntField(term309140, term309140.getClass(), "nano", 643748665);
        setField(term309135, term309135.getClass(), "time", term309140);
        setField(term309109, term309109.getClass(), "accessTime", term309135);
        setField(term309107, term309107.getClass(), "card", term309109);
        setField(term309107, term309107.getClass(), "userName", "vlzfUznWJR");
        setIntField(term309158, term309158.getClass(), "year", 2028);
        setShortField(term309158, term309158.getClass(), "month", (short) 8);
        setShortField(term309158, term309158.getClass(), "day", (short) 18);
        setField(term309157, term309157.getClass(), "date", term309158);
        setByteField(term309162, term309162.getClass(), "hour", (byte) 4);
        setByteField(term309162, term309162.getClass(), "minute", (byte) 53);
        setByteField(term309162, term309162.getClass(), "second", (byte) 49);
        setIntField(term309162, term309162.getClass(), "nano", 691820110);
        setField(term309157, term309157.getClass(), "time", term309162);
        setField(term309107, term309107.getClass(), "lastLoginDate", term309157);
        setBooleanField(term309107, term309107.getClass(), "isWebJoin", false);
        setField(term309107, term309107.getClass(), "webLimitDate", "FdzDmAbJCC");
        setIntField(term309107, term309107.getClass(), "level", -1269993796);
        setIntField(term309107, term309107.getClass(), "reincarnationNum", -288156643);
        setField(term309107, term309107.getClass(), "exp", "OSXAuRuAau");
        setLongField(term309107, term309107.getClass(), "point", 5797750485291180901L);
        setLongField(term309107, term309107.getClass(), "totalPoint", 4303446906012330238L);
        setIntField(term309107, term309107.getClass(), "playCount", 1906783253);
        setIntField(term309107, term309107.getClass(), "multiPlayCount", 1204018336);
        setIntField(term309107, term309107.getClass(), "multiWinCount", -954637871);
        setIntField(term309107, term309107.getClass(), "requestResCount", 1135537153);
        setIntField(term309107, term309107.getClass(), "acceptResCount", 762525337);
        setIntField(term309107, term309107.getClass(), "successResCount", 1446372730);
        setIntField(term309107, term309107.getClass(), "playerRating", -1728367118);
        setIntField(term309107, term309107.getClass(), "highestRating", -904895307);
        setIntField(term309107, term309107.getClass(), "nameplateId", -1874907467);
        setIntField(term309107, term309107.getClass(), "frameId", -1129128196);
        setIntField(term309107, term309107.getClass(), "characterId", -1470909739);
        setIntField(term309107, term309107.getClass(), "trophyId", -1412907836);
        setIntField(term309107, term309107.getClass(), "playedTutorialBit", -199903643);
        setIntField(term309107, term309107.getClass(), "firstTutorialCancelNum", 1793350918);
        setIntField(term309107, term309107.getClass(), "masterTutorialCancelNum", 364334911);
        setIntField(term309107, term309107.getClass(), "totalRepertoireCount", -238168572);
        setIntField(term309107, term309107.getClass(), "totalMapNum", -868047935);
        setLongField(term309107, term309107.getClass(), "totalHiScore", 3830648831449737036L);
        setLongField(term309107, term309107.getClass(), "totalBasicHighScore", -8881687333773912565L);
        setLongField(term309107, term309107.getClass(), "totalAdvancedHighScore", 5798023326474789142L);
        setLongField(term309107, term309107.getClass(), "totalExpertHighScore", -3421826060398099290L);
        setLongField(term309107, term309107.getClass(), "totalMasterHighScore", -6532658972813252072L);
        setIntField(term309219, term309219.getClass(), "year", 2012);
        setShortField(term309219, term309219.getClass(), "month", (short) 10);
        setShortField(term309219, term309219.getClass(), "day", (short) 18);
        setField(term309218, term309218.getClass(), "date", term309219);
        setByteField(term309223, term309223.getClass(), "hour", (byte) 5);
        setByteField(term309223, term309223.getClass(), "minute", (byte) 45);
        setByteField(term309223, term309223.getClass(), "second", (byte) 38);
        setIntField(term309223, term309223.getClass(), "nano", 841406264);
        setField(term309218, term309218.getClass(), "time", term309223);
        setField(term309107, term309107.getClass(), "eventWatchedDate", term309218);
        setIntField(term309107, term309107.getClass(), "friendCount", -1246506132);
        setBooleanField(term309107, term309107.getClass(), "isMaimai", true);
        setField(term309107, term309107.getClass(), "firstGameId", "azsnWqwRkF");
        setField(term309107, term309107.getClass(), "firstRomVersion", "VytBIaPeoV");
        setField(term309107, term309107.getClass(), "firstDataVersion", "eVeQiooIie");
        setIntField(term309267, term309267.getClass(), "year", 2028);
        setShortField(term309267, term309267.getClass(), "month", (short) 8);
        setShortField(term309267, term309267.getClass(), "day", (short) 10);
        setField(term309266, term309266.getClass(), "date", term309267);
        setByteField(term309271, term309271.getClass(), "hour", (byte) 22);
        setByteField(term309271, term309271.getClass(), "minute", (byte) 25);
        setByteField(term309271, term309271.getClass(), "second", (byte) 25);
        setIntField(term309271, term309271.getClass(), "nano", 274830068);
        setField(term309266, term309266.getClass(), "time", term309271);
        setField(term309107, term309107.getClass(), "firstPlayDate", term309266);
        setField(term309107, term309107.getClass(), "lastGameId", "tBvyiKlvwt");
        setField(term309107, term309107.getClass(), "lastRomVersion", "cbrJBcmzzA");
        setField(term309107, term309107.getClass(), "lastDataVersion", "MQEpjCONzM");
        setIntField(term309313, term309313.getClass(), "year", 2013);
        setShortField(term309313, term309313.getClass(), "month", (short) 9);
        setShortField(term309313, term309313.getClass(), "day", (short) 29);
        setField(term309312, term309312.getClass(), "date", term309313);
        setByteField(term309317, term309317.getClass(), "hour", (byte) 1);
        setByteField(term309317, term309317.getClass(), "minute", (byte) 26);
        setByteField(term309317, term309317.getClass(), "second", (byte) 20);
        setIntField(term309317, term309317.getClass(), "nano", 890209791);
        setField(term309312, term309312.getClass(), "time", term309317);
        setField(term309107, term309107.getClass(), "lastPlayDate", term309312);
        setIntField(term309107, term309107.getClass(), "lastPlaceId", 97341042);
        setField(term309107, term309107.getClass(), "lastPlaceName", "NYzdiIdifj");
        setField(term309107, term309107.getClass(), "lastRegionId", "QShAEmzTpm");
        setField(term309107, term309107.getClass(), "lastRegionName", "WfIDYpqgan");
        setField(term309107, term309107.getClass(), "lastAllNetId", "jkqkgaaQOn");
        setField(term309107, term309107.getClass(), "lastClientId", "VxoGAcPGVp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term309105;
        args[1] = term309107;
        args[2] = "ltoRvwhmcS";
        args[3] = "iSXUZmUzsG";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


