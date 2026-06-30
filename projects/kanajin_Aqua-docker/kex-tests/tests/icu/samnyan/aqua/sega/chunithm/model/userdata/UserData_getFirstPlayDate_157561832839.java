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

public class UserData_getFirstPlayDate_157561832839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145995;

    public UserData_getFirstPlayDate_157561832839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145999 = new Long(1346299551708610248L);
        term145995 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term145997 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146111 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146159 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146205 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145995, term145995.getClass(), "id", -5669989120629087357L);
        setLongField(term145997, term145997.getClass(), "id", -8530393515143116712L);
        setField(term145997, term145997.getClass(), "extId", term145999);
        setField(term145997, term145997.getClass(), "luid", "kPOlNDAMrn");
        setIntField(term146014, term146014.getClass(), "year", 2027);
        setShortField(term146014, term146014.getClass(), "month", (short) 4);
        setShortField(term146014, term146014.getClass(), "day", (short) 9);
        setField(term146013, term146013.getClass(), "date", term146014);
        setByteField(term146018, term146018.getClass(), "hour", (byte) 14);
        setByteField(term146018, term146018.getClass(), "minute", (byte) 4);
        setByteField(term146018, term146018.getClass(), "second", (byte) 59);
        setIntField(term146018, term146018.getClass(), "nano", 149097272);
        setField(term146013, term146013.getClass(), "time", term146018);
        setField(term145997, term145997.getClass(), "registerTime", term146013);
        setIntField(term146024, term146024.getClass(), "year", 2027);
        setShortField(term146024, term146024.getClass(), "month", (short) 4);
        setShortField(term146024, term146024.getClass(), "day", (short) 20);
        setField(term146023, term146023.getClass(), "date", term146024);
        setByteField(term146028, term146028.getClass(), "hour", (byte) 16);
        setByteField(term146028, term146028.getClass(), "minute", (byte) 22);
        setByteField(term146028, term146028.getClass(), "second", (byte) 49);
        setIntField(term146028, term146028.getClass(), "nano", 895698494);
        setField(term146023, term146023.getClass(), "time", term146028);
        setField(term145997, term145997.getClass(), "accessTime", term146023);
        setField(term145995, term145995.getClass(), "card", term145997);
        setField(term145995, term145995.getClass(), "userName", "gXVfxiKYXy");
        setIntField(term146046, term146046.getClass(), "year", 2028);
        setShortField(term146046, term146046.getClass(), "month", (short) 4);
        setShortField(term146046, term146046.getClass(), "day", (short) 17);
        setField(term146045, term146045.getClass(), "date", term146046);
        setByteField(term146050, term146050.getClass(), "hour", (byte) 21);
        setByteField(term146050, term146050.getClass(), "minute", (byte) 57);
        setByteField(term146050, term146050.getClass(), "second", (byte) 36);
        setIntField(term146050, term146050.getClass(), "nano", 352090778);
        setField(term146045, term146045.getClass(), "time", term146050);
        setField(term145995, term145995.getClass(), "lastLoginDate", term146045);
        setBooleanField(term145995, term145995.getClass(), "isWebJoin", true);
        setField(term145995, term145995.getClass(), "webLimitDate", "wDXGaloUxi");
        setIntField(term145995, term145995.getClass(), "level", -1272435460);
        setIntField(term145995, term145995.getClass(), "reincarnationNum", -1484603549);
        setField(term145995, term145995.getClass(), "exp", "QZpJmHsqng");
        setLongField(term145995, term145995.getClass(), "point", 4695281402868299412L);
        setLongField(term145995, term145995.getClass(), "totalPoint", -2959985673430542289L);
        setIntField(term145995, term145995.getClass(), "playCount", 1942980695);
        setIntField(term145995, term145995.getClass(), "multiPlayCount", 1796271838);
        setIntField(term145995, term145995.getClass(), "multiWinCount", -1313938080);
        setIntField(term145995, term145995.getClass(), "requestResCount", -2070649848);
        setIntField(term145995, term145995.getClass(), "acceptResCount", -291029205);
        setIntField(term145995, term145995.getClass(), "successResCount", 929711065);
        setIntField(term145995, term145995.getClass(), "playerRating", -1034367222);
        setIntField(term145995, term145995.getClass(), "highestRating", 1086994460);
        setIntField(term145995, term145995.getClass(), "nameplateId", 434127670);
        setIntField(term145995, term145995.getClass(), "frameId", -1916016616);
        setIntField(term145995, term145995.getClass(), "characterId", -24073374);
        setIntField(term145995, term145995.getClass(), "trophyId", -1683460380);
        setIntField(term145995, term145995.getClass(), "playedTutorialBit", -1328582865);
        setIntField(term145995, term145995.getClass(), "firstTutorialCancelNum", -2124482280);
        setIntField(term145995, term145995.getClass(), "masterTutorialCancelNum", -559363939);
        setIntField(term145995, term145995.getClass(), "totalRepertoireCount", 477002993);
        setIntField(term145995, term145995.getClass(), "totalMapNum", -1566937884);
        setLongField(term145995, term145995.getClass(), "totalHiScore", -8908499017977435119L);
        setLongField(term145995, term145995.getClass(), "totalBasicHighScore", -953055683184375740L);
        setLongField(term145995, term145995.getClass(), "totalAdvancedHighScore", -5426612898117103276L);
        setLongField(term145995, term145995.getClass(), "totalExpertHighScore", -1712562533510140729L);
        setLongField(term145995, term145995.getClass(), "totalMasterHighScore", 5075787894187682520L);
        setIntField(term146107, term146107.getClass(), "year", 2026);
        setShortField(term146107, term146107.getClass(), "month", (short) 9);
        setShortField(term146107, term146107.getClass(), "day", (short) 29);
        setField(term146106, term146106.getClass(), "date", term146107);
        setByteField(term146111, term146111.getClass(), "hour", (byte) 22);
        setByteField(term146111, term146111.getClass(), "minute", (byte) 43);
        setByteField(term146111, term146111.getClass(), "second", (byte) 43);
        setIntField(term146111, term146111.getClass(), "nano", 972917191);
        setField(term146106, term146106.getClass(), "time", term146111);
        setField(term145995, term145995.getClass(), "eventWatchedDate", term146106);
        setIntField(term145995, term145995.getClass(), "friendCount", 18844455);
        setBooleanField(term145995, term145995.getClass(), "isMaimai", true);
        setField(term145995, term145995.getClass(), "firstGameId", "HrbrOZKvDm");
        setField(term145995, term145995.getClass(), "firstRomVersion", "UnnFJFliAk");
        setField(term145995, term145995.getClass(), "firstDataVersion", "PgCubdnsfU");
        setIntField(term146155, term146155.getClass(), "year", 2029);
        setShortField(term146155, term146155.getClass(), "month", (short) 9);
        setShortField(term146155, term146155.getClass(), "day", (short) 25);
        setField(term146154, term146154.getClass(), "date", term146155);
        setByteField(term146159, term146159.getClass(), "hour", (byte) 11);
        setByteField(term146159, term146159.getClass(), "minute", (byte) 50);
        setByteField(term146159, term146159.getClass(), "second", (byte) 0);
        setIntField(term146159, term146159.getClass(), "nano", 826909727);
        setField(term146154, term146154.getClass(), "time", term146159);
        setField(term145995, term145995.getClass(), "firstPlayDate", term146154);
        setField(term145995, term145995.getClass(), "lastGameId", "kwWeMEsLiI");
        setField(term145995, term145995.getClass(), "lastRomVersion", "kVRWVcbDmx");
        setField(term145995, term145995.getClass(), "lastDataVersion", "jTuotqEcZK");
        setIntField(term146201, term146201.getClass(), "year", 2015);
        setShortField(term146201, term146201.getClass(), "month", (short) 8);
        setShortField(term146201, term146201.getClass(), "day", (short) 12);
        setField(term146200, term146200.getClass(), "date", term146201);
        setByteField(term146205, term146205.getClass(), "hour", (byte) 13);
        setByteField(term146205, term146205.getClass(), "minute", (byte) 54);
        setByteField(term146205, term146205.getClass(), "second", (byte) 31);
        setIntField(term146205, term146205.getClass(), "nano", 131698784);
        setField(term146200, term146200.getClass(), "time", term146205);
        setField(term145995, term145995.getClass(), "lastPlayDate", term146200);
        setIntField(term145995, term145995.getClass(), "lastPlaceId", -104376222);
        setField(term145995, term145995.getClass(), "lastPlaceName", "wddQtFrWId");
        setField(term145995, term145995.getClass(), "lastRegionId", "aHuJsHVnrv");
        setField(term145995, term145995.getClass(), "lastRegionName", "kNaBBhwssd");
        setField(term145995, term145995.getClass(), "lastAllNetId", "zqGoMwjPjA");
        setField(term145995, term145995.getClass(), "lastClientId", "qvrLYIqpRM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term145995, args);
    }

};


