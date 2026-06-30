package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_toString_97993850103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27499;

    public UserData_toString_97993850103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27503 = new Long(1368340889161782793L);
        term27499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term27501 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27532 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term27499, term27499.getClass(), "id", 3288941170644426558L);
        setLongField(term27501, term27501.getClass(), "id", -8338004844694486146L);
        setField(term27501, term27501.getClass(), "extId", term27503);
        setField(term27501, term27501.getClass(), "luid", "CwrrJlrGmg");
        setIntField(term27518, term27518.getClass(), "year", 2020);
        setShortField(term27518, term27518.getClass(), "month", (short) 4);
        setShortField(term27518, term27518.getClass(), "day", (short) 2);
        setField(term27517, term27517.getClass(), "date", term27518);
        setByteField(term27522, term27522.getClass(), "hour", (byte) 11);
        setByteField(term27522, term27522.getClass(), "minute", (byte) 26);
        setByteField(term27522, term27522.getClass(), "second", (byte) 22);
        setIntField(term27522, term27522.getClass(), "nano", 168224721);
        setField(term27517, term27517.getClass(), "time", term27522);
        setField(term27501, term27501.getClass(), "registerTime", term27517);
        setIntField(term27528, term27528.getClass(), "year", 2010);
        setShortField(term27528, term27528.getClass(), "month", (short) 10);
        setShortField(term27528, term27528.getClass(), "day", (short) 26);
        setField(term27527, term27527.getClass(), "date", term27528);
        setByteField(term27532, term27532.getClass(), "hour", (byte) 6);
        setByteField(term27532, term27532.getClass(), "minute", (byte) 28);
        setByteField(term27532, term27532.getClass(), "second", (byte) 52);
        setIntField(term27532, term27532.getClass(), "nano", 197540216);
        setField(term27527, term27527.getClass(), "time", term27532);
        setField(term27501, term27501.getClass(), "accessTime", term27527);
        setField(term27499, term27499.getClass(), "card", term27501);
        setIntField(term27499, term27499.getClass(), "lastDataVersion", 9043673);
        setField(term27499, term27499.getClass(), "userName", "HejzvyejjG");
        setIntField(term27499, term27499.getClass(), "point", 2059842684);
        setIntField(term27499, term27499.getClass(), "totalPoint", 578623316);
        setIntField(term27499, term27499.getClass(), "iconId", -676216760);
        setIntField(term27499, term27499.getClass(), "nameplateId", 1859109121);
        setIntField(term27499, term27499.getClass(), "frameId", 1727853532);
        setIntField(term27499, term27499.getClass(), "trophyId", -54706718);
        setIntField(term27499, term27499.getClass(), "playCount", 461863345);
        setIntField(term27499, term27499.getClass(), "playVsCount", 733174414);
        setIntField(term27499, term27499.getClass(), "playSyncCount", -1055100686);
        setIntField(term27499, term27499.getClass(), "winCount", 1994661826);
        setIntField(term27499, term27499.getClass(), "helpCount", -2050574403);
        setIntField(term27499, term27499.getClass(), "comboCount", 1891840747);
        setIntField(term27499, term27499.getClass(), "feverCount", -118389472);
        setIntField(term27499, term27499.getClass(), "totalHiScore", -706486666);
        setIntField(term27499, term27499.getClass(), "totalEasyHighScore", 1426550776);
        setIntField(term27499, term27499.getClass(), "totalBasicHighScore", 1793694701);
        setIntField(term27499, term27499.getClass(), "totalAdvancedHighScore", 1334634518);
        setIntField(term27499, term27499.getClass(), "totalExpertHighScore", -1358832342);
        setIntField(term27499, term27499.getClass(), "totalMasterHighScore", 330525017);
        setIntField(term27499, term27499.getClass(), "totalReMasterHighScore", -2097182938);
        setIntField(term27499, term27499.getClass(), "totalHighSync", -1911268197);
        setIntField(term27499, term27499.getClass(), "totalEasySync", 1989699628);
        setIntField(term27499, term27499.getClass(), "totalBasicSync", 1406976166);
        setIntField(term27499, term27499.getClass(), "totalAdvancedSync", -683361157);
        setIntField(term27499, term27499.getClass(), "totalExpertSync", 1735058829);
        setIntField(term27499, term27499.getClass(), "totalMasterSync", -1945706596);
        setIntField(term27499, term27499.getClass(), "totalReMasterSync", 13487895);
        setIntField(term27499, term27499.getClass(), "playerRating", 369911284);
        setIntField(term27499, term27499.getClass(), "highestRating", 1488504614);
        setIntField(term27499, term27499.getClass(), "rankAuthTailId", 661477727);
        setField(term27499, term27499.getClass(), "eventWatchedDate", "pbqJjeooBM");
        setField(term27499, term27499.getClass(), "webLimitDate", "ccnotFfPXt");
        setIntField(term27499, term27499.getClass(), "challengeTrackPhase", 274618169);
        setIntField(term27499, term27499.getClass(), "firstPlayBits", -1618606893);
        setField(term27499, term27499.getClass(), "lastPlayDate", "plWlgdgIhn");
        setIntField(term27499, term27499.getClass(), "lastPlaceId", -560211840);
        setField(term27499, term27499.getClass(), "lastPlaceName", "RZaKVKWtND");
        setIntField(term27499, term27499.getClass(), "lastRegionId", 103542361);
        setField(term27499, term27499.getClass(), "lastRegionName", "vXiaNiquft");
        setField(term27499, term27499.getClass(), "lastClientId", "lucCeiVnYe");
        setField(term27499, term27499.getClass(), "lastCountryCode", "iYwkCLMsbJ");
        setIntField(term27499, term27499.getClass(), "eventPoint", -1737221099);
        setIntField(term27499, term27499.getClass(), "totalLv", -1032313881);
        setIntField(term27499, term27499.getClass(), "lastLoginBonusDay", 1246554458);
        setIntField(term27499, term27499.getClass(), "lastSurvivalBonusDay", -1913837862);
        setIntField(term27499, term27499.getClass(), "loginBonusLv", -1428994415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27499, args);
    }

};


