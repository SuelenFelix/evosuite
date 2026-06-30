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

public class UserCharacter_getCharacterId_19060148783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109345;

    public UserCharacter_getCharacterId_19060148783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109351 = new Long(-8338004844694486146L);
        term109345 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term109347 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term109349 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109402 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109506 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109507 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109511 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109557 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109345, term109345.getClass(), "id", 2959376493284774197L);
        setLongField(term109347, term109347.getClass(), "id", -7681690851462289504L);
        setLongField(term109349, term109349.getClass(), "id", -3504634368052196715L);
        setField(term109349, term109349.getClass(), "extId", term109351);
        setField(term109349, term109349.getClass(), "luid", "UUTpuViRuV");
        setIntField(term109366, term109366.getClass(), "year", 2019);
        setShortField(term109366, term109366.getClass(), "month", (short) 10);
        setShortField(term109366, term109366.getClass(), "day", (short) 9);
        setField(term109365, term109365.getClass(), "date", term109366);
        setByteField(term109370, term109370.getClass(), "hour", (byte) 20);
        setByteField(term109370, term109370.getClass(), "minute", (byte) 33);
        setByteField(term109370, term109370.getClass(), "second", (byte) 27);
        setIntField(term109370, term109370.getClass(), "nano", 496826929);
        setField(term109365, term109365.getClass(), "time", term109370);
        setField(term109349, term109349.getClass(), "registerTime", term109365);
        setIntField(term109376, term109376.getClass(), "year", 2026);
        setShortField(term109376, term109376.getClass(), "month", (short) 7);
        setShortField(term109376, term109376.getClass(), "day", (short) 23);
        setField(term109375, term109375.getClass(), "date", term109376);
        setByteField(term109380, term109380.getClass(), "hour", (byte) 1);
        setByteField(term109380, term109380.getClass(), "minute", (byte) 40);
        setByteField(term109380, term109380.getClass(), "second", (byte) 6);
        setIntField(term109380, term109380.getClass(), "nano", 967732489);
        setField(term109375, term109375.getClass(), "time", term109380);
        setField(term109349, term109349.getClass(), "accessTime", term109375);
        setField(term109347, term109347.getClass(), "card", term109349);
        setField(term109347, term109347.getClass(), "userName", "xNKBQkfPIU");
        setIntField(term109398, term109398.getClass(), "year", 2024);
        setShortField(term109398, term109398.getClass(), "month", (short) 2);
        setShortField(term109398, term109398.getClass(), "day", (short) 6);
        setField(term109397, term109397.getClass(), "date", term109398);
        setByteField(term109402, term109402.getClass(), "hour", (byte) 11);
        setByteField(term109402, term109402.getClass(), "minute", (byte) 18);
        setByteField(term109402, term109402.getClass(), "second", (byte) 18);
        setIntField(term109402, term109402.getClass(), "nano", 136294309);
        setField(term109397, term109397.getClass(), "time", term109402);
        setField(term109347, term109347.getClass(), "lastLoginDate", term109397);
        setBooleanField(term109347, term109347.getClass(), "isWebJoin", true);
        setField(term109347, term109347.getClass(), "webLimitDate", "IaRILCkXUB");
        setIntField(term109347, term109347.getClass(), "level", 473643844);
        setIntField(term109347, term109347.getClass(), "reincarnationNum", 1336551685);
        setField(term109347, term109347.getClass(), "exp", "XRaUSsHhJf");
        setLongField(term109347, term109347.getClass(), "point", -8918467228491530956L);
        setLongField(term109347, term109347.getClass(), "totalPoint", 610764674705321834L);
        setIntField(term109347, term109347.getClass(), "playCount", -171146643);
        setIntField(term109347, term109347.getClass(), "multiPlayCount", 1243420669);
        setIntField(term109347, term109347.getClass(), "multiWinCount", 1961265905);
        setIntField(term109347, term109347.getClass(), "requestResCount", -194331877);
        setIntField(term109347, term109347.getClass(), "acceptResCount", -948751278);
        setIntField(term109347, term109347.getClass(), "successResCount", -403239789);
        setIntField(term109347, term109347.getClass(), "playerRating", 1919856422);
        setIntField(term109347, term109347.getClass(), "highestRating", 1075667277);
        setIntField(term109347, term109347.getClass(), "nameplateId", 523284856);
        setIntField(term109347, term109347.getClass(), "frameId", -1189621083);
        setIntField(term109347, term109347.getClass(), "characterId", -1476735618);
        setIntField(term109347, term109347.getClass(), "trophyId", -1126757723);
        setIntField(term109347, term109347.getClass(), "playedTutorialBit", -1650915963);
        setIntField(term109347, term109347.getClass(), "firstTutorialCancelNum", 1043027844);
        setIntField(term109347, term109347.getClass(), "masterTutorialCancelNum", 893498941);
        setIntField(term109347, term109347.getClass(), "totalRepertoireCount", -1645433738);
        setIntField(term109347, term109347.getClass(), "totalMapNum", 170899666);
        setLongField(term109347, term109347.getClass(), "totalHiScore", -6291199733750478460L);
        setLongField(term109347, term109347.getClass(), "totalBasicHighScore", -2741343132217000981L);
        setLongField(term109347, term109347.getClass(), "totalAdvancedHighScore", 7025673372898881791L);
        setLongField(term109347, term109347.getClass(), "totalExpertHighScore", -485047365970365138L);
        setLongField(term109347, term109347.getClass(), "totalMasterHighScore", 15712350410058172L);
        setIntField(term109459, term109459.getClass(), "year", 2010);
        setShortField(term109459, term109459.getClass(), "month", (short) 1);
        setShortField(term109459, term109459.getClass(), "day", (short) 16);
        setField(term109458, term109458.getClass(), "date", term109459);
        setByteField(term109463, term109463.getClass(), "hour", (byte) 10);
        setByteField(term109463, term109463.getClass(), "minute", (byte) 30);
        setByteField(term109463, term109463.getClass(), "second", (byte) 2);
        setIntField(term109463, term109463.getClass(), "nano", 36476890);
        setField(term109458, term109458.getClass(), "time", term109463);
        setField(term109347, term109347.getClass(), "eventWatchedDate", term109458);
        setIntField(term109347, term109347.getClass(), "friendCount", -1076430581);
        setBooleanField(term109347, term109347.getClass(), "isMaimai", false);
        setField(term109347, term109347.getClass(), "firstGameId", "ndknwPavsb");
        setField(term109347, term109347.getClass(), "firstRomVersion", "XbwSBHmjuZ");
        setField(term109347, term109347.getClass(), "firstDataVersion", "vHdYsSmEmG");
        setIntField(term109507, term109507.getClass(), "year", 2023);
        setShortField(term109507, term109507.getClass(), "month", (short) 5);
        setShortField(term109507, term109507.getClass(), "day", (short) 9);
        setField(term109506, term109506.getClass(), "date", term109507);
        setByteField(term109511, term109511.getClass(), "hour", (byte) 21);
        setByteField(term109511, term109511.getClass(), "minute", (byte) 5);
        setByteField(term109511, term109511.getClass(), "second", (byte) 9);
        setIntField(term109511, term109511.getClass(), "nano", 765072941);
        setField(term109506, term109506.getClass(), "time", term109511);
        setField(term109347, term109347.getClass(), "firstPlayDate", term109506);
        setField(term109347, term109347.getClass(), "lastGameId", "UDIVCqBmxp");
        setField(term109347, term109347.getClass(), "lastRomVersion", "npyBQorcHP");
        setField(term109347, term109347.getClass(), "lastDataVersion", "pzvYCQwkoA");
        setIntField(term109553, term109553.getClass(), "year", 2021);
        setShortField(term109553, term109553.getClass(), "month", (short) 9);
        setShortField(term109553, term109553.getClass(), "day", (short) 29);
        setField(term109552, term109552.getClass(), "date", term109553);
        setByteField(term109557, term109557.getClass(), "hour", (byte) 3);
        setByteField(term109557, term109557.getClass(), "minute", (byte) 2);
        setByteField(term109557, term109557.getClass(), "second", (byte) 1);
        setIntField(term109557, term109557.getClass(), "nano", 110057399);
        setField(term109552, term109552.getClass(), "time", term109557);
        setField(term109347, term109347.getClass(), "lastPlayDate", term109552);
        setIntField(term109347, term109347.getClass(), "lastPlaceId", 1009467504);
        setField(term109347, term109347.getClass(), "lastPlaceName", "TGLDiqWTkO");
        setField(term109347, term109347.getClass(), "lastRegionId", "NwjEUxXUkk");
        setField(term109347, term109347.getClass(), "lastRegionName", "CFBoXISoRu");
        setField(term109347, term109347.getClass(), "lastAllNetId", "gRmiKAUyCW");
        setField(term109347, term109347.getClass(), "lastClientId", "rfXVAViErl");
        setField(term109345, term109345.getClass(), "user", term109347);
        setIntField(term109345, term109345.getClass(), "characterId", -140520015);
        setIntField(term109345, term109345.getClass(), "playCount", -1112538327);
        setIntField(term109345, term109345.getClass(), "level", 1);
        setIntField(term109345, term109345.getClass(), "skillId", 834878229);
        setIntField(term109345, term109345.getClass(), "friendshipExp", 602457171);
        setBooleanField(term109345, term109345.getClass(), "isValid", true);
        setBooleanField(term109345, term109345.getClass(), "isNewMark", true);
        setIntField(term109345, term109345.getClass(), "param1", -625958026);
        setIntField(term109345, term109345.getClass(), "param2", 1365173968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term109345, args);
    }

};


