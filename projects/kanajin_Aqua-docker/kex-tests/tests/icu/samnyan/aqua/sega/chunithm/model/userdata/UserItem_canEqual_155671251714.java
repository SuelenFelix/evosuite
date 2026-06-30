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

public class UserItem_canEqual_155671251714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127532;
     Object term127814;

    public UserItem_canEqual_155671251714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127538 = new Long(-1635471392209071620L);
        term127532 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term127534 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term127536 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127567 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127589 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127744 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127532, term127532.getClass(), "id", -1286201195708279888L);
        setLongField(term127534, term127534.getClass(), "id", -4497907374818723648L);
        setLongField(term127536, term127536.getClass(), "id", -8836354257007073767L);
        setField(term127536, term127536.getClass(), "extId", term127538);
        setField(term127536, term127536.getClass(), "luid", "BRqjZHWrDB");
        setIntField(term127553, term127553.getClass(), "year", 2016);
        setShortField(term127553, term127553.getClass(), "month", (short) 7);
        setShortField(term127553, term127553.getClass(), "day", (short) 17);
        setField(term127552, term127552.getClass(), "date", term127553);
        setByteField(term127557, term127557.getClass(), "hour", (byte) 5);
        setByteField(term127557, term127557.getClass(), "minute", (byte) 15);
        setByteField(term127557, term127557.getClass(), "second", (byte) 8);
        setIntField(term127557, term127557.getClass(), "nano", 213590460);
        setField(term127552, term127552.getClass(), "time", term127557);
        setField(term127536, term127536.getClass(), "registerTime", term127552);
        setIntField(term127563, term127563.getClass(), "year", 2029);
        setShortField(term127563, term127563.getClass(), "month", (short) 5);
        setShortField(term127563, term127563.getClass(), "day", (short) 11);
        setField(term127562, term127562.getClass(), "date", term127563);
        setByteField(term127567, term127567.getClass(), "hour", (byte) 5);
        setByteField(term127567, term127567.getClass(), "minute", (byte) 15);
        setByteField(term127567, term127567.getClass(), "second", (byte) 1);
        setIntField(term127567, term127567.getClass(), "nano", 333296491);
        setField(term127562, term127562.getClass(), "time", term127567);
        setField(term127536, term127536.getClass(), "accessTime", term127562);
        setField(term127534, term127534.getClass(), "card", term127536);
        setField(term127534, term127534.getClass(), "userName", "jOEgAmeXaq");
        setIntField(term127585, term127585.getClass(), "year", 2025);
        setShortField(term127585, term127585.getClass(), "month", (short) 11);
        setShortField(term127585, term127585.getClass(), "day", (short) 23);
        setField(term127584, term127584.getClass(), "date", term127585);
        setByteField(term127589, term127589.getClass(), "hour", (byte) 21);
        setByteField(term127589, term127589.getClass(), "minute", (byte) 5);
        setByteField(term127589, term127589.getClass(), "second", (byte) 32);
        setIntField(term127589, term127589.getClass(), "nano", 194920811);
        setField(term127584, term127584.getClass(), "time", term127589);
        setField(term127534, term127534.getClass(), "lastLoginDate", term127584);
        setBooleanField(term127534, term127534.getClass(), "isWebJoin", false);
        setField(term127534, term127534.getClass(), "webLimitDate", "EArfIBFidz");
        setIntField(term127534, term127534.getClass(), "level", 704588458);
        setIntField(term127534, term127534.getClass(), "reincarnationNum", 1666352978);
        setField(term127534, term127534.getClass(), "exp", "lIKlxUmvSr");
        setLongField(term127534, term127534.getClass(), "point", -1461657660894361614L);
        setLongField(term127534, term127534.getClass(), "totalPoint", 1715352043372419387L);
        setIntField(term127534, term127534.getClass(), "playCount", 439339997);
        setIntField(term127534, term127534.getClass(), "multiPlayCount", 1821861150);
        setIntField(term127534, term127534.getClass(), "multiWinCount", -787591747);
        setIntField(term127534, term127534.getClass(), "requestResCount", 426333384);
        setIntField(term127534, term127534.getClass(), "acceptResCount", -1659716094);
        setIntField(term127534, term127534.getClass(), "successResCount", -836318034);
        setIntField(term127534, term127534.getClass(), "playerRating", 2012369494);
        setIntField(term127534, term127534.getClass(), "highestRating", -380390171);
        setIntField(term127534, term127534.getClass(), "nameplateId", -733694118);
        setIntField(term127534, term127534.getClass(), "frameId", -1720693402);
        setIntField(term127534, term127534.getClass(), "characterId", 325282129);
        setIntField(term127534, term127534.getClass(), "trophyId", -446219627);
        setIntField(term127534, term127534.getClass(), "playedTutorialBit", 1440215146);
        setIntField(term127534, term127534.getClass(), "firstTutorialCancelNum", 593096680);
        setIntField(term127534, term127534.getClass(), "masterTutorialCancelNum", -223776565);
        setIntField(term127534, term127534.getClass(), "totalRepertoireCount", -1246811706);
        setIntField(term127534, term127534.getClass(), "totalMapNum", 904470208);
        setLongField(term127534, term127534.getClass(), "totalHiScore", 5275491898202461780L);
        setLongField(term127534, term127534.getClass(), "totalBasicHighScore", -2039714302053648737L);
        setLongField(term127534, term127534.getClass(), "totalAdvancedHighScore", -8013526278764187887L);
        setLongField(term127534, term127534.getClass(), "totalExpertHighScore", 697161019627941929L);
        setLongField(term127534, term127534.getClass(), "totalMasterHighScore", 5572685640122211331L);
        setIntField(term127646, term127646.getClass(), "year", 2023);
        setShortField(term127646, term127646.getClass(), "month", (short) 8);
        setShortField(term127646, term127646.getClass(), "day", (short) 14);
        setField(term127645, term127645.getClass(), "date", term127646);
        setByteField(term127650, term127650.getClass(), "hour", (byte) 0);
        setByteField(term127650, term127650.getClass(), "minute", (byte) 21);
        setByteField(term127650, term127650.getClass(), "second", (byte) 6);
        setIntField(term127650, term127650.getClass(), "nano", 18253801);
        setField(term127645, term127645.getClass(), "time", term127650);
        setField(term127534, term127534.getClass(), "eventWatchedDate", term127645);
        setIntField(term127534, term127534.getClass(), "friendCount", -2102304044);
        setBooleanField(term127534, term127534.getClass(), "isMaimai", false);
        setField(term127534, term127534.getClass(), "firstGameId", "maygNVZYRz");
        setField(term127534, term127534.getClass(), "firstRomVersion", "DSgAYHcbQe");
        setField(term127534, term127534.getClass(), "firstDataVersion", "zEXmuuorCI");
        setIntField(term127694, term127694.getClass(), "year", 2017);
        setShortField(term127694, term127694.getClass(), "month", (short) 2);
        setShortField(term127694, term127694.getClass(), "day", (short) 9);
        setField(term127693, term127693.getClass(), "date", term127694);
        setByteField(term127698, term127698.getClass(), "hour", (byte) 18);
        setByteField(term127698, term127698.getClass(), "minute", (byte) 29);
        setByteField(term127698, term127698.getClass(), "second", (byte) 21);
        setIntField(term127698, term127698.getClass(), "nano", 675008333);
        setField(term127693, term127693.getClass(), "time", term127698);
        setField(term127534, term127534.getClass(), "firstPlayDate", term127693);
        setField(term127534, term127534.getClass(), "lastGameId", "NEjergWRnM");
        setField(term127534, term127534.getClass(), "lastRomVersion", "hDGENUWiHc");
        setField(term127534, term127534.getClass(), "lastDataVersion", "PLPXyBztQB");
        setIntField(term127740, term127740.getClass(), "year", 2010);
        setShortField(term127740, term127740.getClass(), "month", (short) 2);
        setShortField(term127740, term127740.getClass(), "day", (short) 7);
        setField(term127739, term127739.getClass(), "date", term127740);
        setByteField(term127744, term127744.getClass(), "hour", (byte) 18);
        setByteField(term127744, term127744.getClass(), "minute", (byte) 12);
        setByteField(term127744, term127744.getClass(), "second", (byte) 57);
        setIntField(term127744, term127744.getClass(), "nano", 601841566);
        setField(term127739, term127739.getClass(), "time", term127744);
        setField(term127534, term127534.getClass(), "lastPlayDate", term127739);
        setIntField(term127534, term127534.getClass(), "lastPlaceId", 810803651);
        setField(term127534, term127534.getClass(), "lastPlaceName", "hESiinBBOz");
        setField(term127534, term127534.getClass(), "lastRegionId", "llUdMgKbEf");
        setField(term127534, term127534.getClass(), "lastRegionName", "BqtmlODLQw");
        setField(term127534, term127534.getClass(), "lastAllNetId", "MYesfpduIU");
        setField(term127534, term127534.getClass(), "lastClientId", "KHmFMOciUu");
        setField(term127532, term127532.getClass(), "user", term127534);
        setIntField(term127532, term127532.getClass(), "itemKind", 552468029);
        setIntField(term127532, term127532.getClass(), "itemId", -556247755);
        setIntField(term127532, term127532.getClass(), "stock", 1);
        setBooleanField(term127532, term127532.getClass(), "isValid", true);
        term127814 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127814;
        callMethod(klass, "canEqual", argTypes, term127532, args);
    }

};


