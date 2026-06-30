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
import java.lang.Integer;

public class UserGameOptionEx_setExt10_36868975934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325261;
     Object term325559;

    public UserGameOptionEx_setExt10_36868975934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325267 = new Long(8965244485590834147L);
        term325261 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term325263 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term325265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term325281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325473 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term325261, term325261.getClass(), "id", -5485319817298284150L);
        setLongField(term325263, term325263.getClass(), "id", 5062506679811364885L);
        setLongField(term325265, term325265.getClass(), "id", 72202288797284860L);
        setField(term325265, term325265.getClass(), "extId", term325267);
        setField(term325265, term325265.getClass(), "luid", "rtyYakLsIf");
        setIntField(term325282, term325282.getClass(), "year", 2021);
        setShortField(term325282, term325282.getClass(), "month", (short) 1);
        setShortField(term325282, term325282.getClass(), "day", (short) 16);
        setField(term325281, term325281.getClass(), "date", term325282);
        setByteField(term325286, term325286.getClass(), "hour", (byte) 5);
        setByteField(term325286, term325286.getClass(), "minute", (byte) 45);
        setByteField(term325286, term325286.getClass(), "second", (byte) 9);
        setIntField(term325286, term325286.getClass(), "nano", 340849955);
        setField(term325281, term325281.getClass(), "time", term325286);
        setField(term325265, term325265.getClass(), "registerTime", term325281);
        setIntField(term325292, term325292.getClass(), "year", 2020);
        setShortField(term325292, term325292.getClass(), "month", (short) 11);
        setShortField(term325292, term325292.getClass(), "day", (short) 3);
        setField(term325291, term325291.getClass(), "date", term325292);
        setByteField(term325296, term325296.getClass(), "hour", (byte) 4);
        setByteField(term325296, term325296.getClass(), "minute", (byte) 6);
        setByteField(term325296, term325296.getClass(), "second", (byte) 24);
        setIntField(term325296, term325296.getClass(), "nano", 102556996);
        setField(term325291, term325291.getClass(), "time", term325296);
        setField(term325265, term325265.getClass(), "accessTime", term325291);
        setField(term325263, term325263.getClass(), "card", term325265);
        setField(term325263, term325263.getClass(), "userName", "TEcCIAqJQZ");
        setIntField(term325314, term325314.getClass(), "year", 2027);
        setShortField(term325314, term325314.getClass(), "month", (short) 8);
        setShortField(term325314, term325314.getClass(), "day", (short) 24);
        setField(term325313, term325313.getClass(), "date", term325314);
        setByteField(term325318, term325318.getClass(), "hour", (byte) 6);
        setByteField(term325318, term325318.getClass(), "minute", (byte) 28);
        setByteField(term325318, term325318.getClass(), "second", (byte) 1);
        setIntField(term325318, term325318.getClass(), "nano", 620038225);
        setField(term325313, term325313.getClass(), "time", term325318);
        setField(term325263, term325263.getClass(), "lastLoginDate", term325313);
        setBooleanField(term325263, term325263.getClass(), "isWebJoin", false);
        setField(term325263, term325263.getClass(), "webLimitDate", "xmIiNFcOaN");
        setIntField(term325263, term325263.getClass(), "level", 981212962);
        setIntField(term325263, term325263.getClass(), "reincarnationNum", -1045629424);
        setField(term325263, term325263.getClass(), "exp", "wckDOvwjxa");
        setLongField(term325263, term325263.getClass(), "point", -4407620542485515440L);
        setLongField(term325263, term325263.getClass(), "totalPoint", 2919288170476234454L);
        setIntField(term325263, term325263.getClass(), "playCount", -1420294293);
        setIntField(term325263, term325263.getClass(), "multiPlayCount", -36701343);
        setIntField(term325263, term325263.getClass(), "multiWinCount", 1597822592);
        setIntField(term325263, term325263.getClass(), "requestResCount", 1242775865);
        setIntField(term325263, term325263.getClass(), "acceptResCount", -1607082745);
        setIntField(term325263, term325263.getClass(), "successResCount", -1489638045);
        setIntField(term325263, term325263.getClass(), "playerRating", 1366635956);
        setIntField(term325263, term325263.getClass(), "highestRating", 1287857445);
        setIntField(term325263, term325263.getClass(), "nameplateId", -1755330917);
        setIntField(term325263, term325263.getClass(), "frameId", -1138481653);
        setIntField(term325263, term325263.getClass(), "characterId", 1019419428);
        setIntField(term325263, term325263.getClass(), "trophyId", 1234190646);
        setIntField(term325263, term325263.getClass(), "playedTutorialBit", -1056218614);
        setIntField(term325263, term325263.getClass(), "firstTutorialCancelNum", -1061665653);
        setIntField(term325263, term325263.getClass(), "masterTutorialCancelNum", -1873769204);
        setIntField(term325263, term325263.getClass(), "totalRepertoireCount", -1350811081);
        setIntField(term325263, term325263.getClass(), "totalMapNum", -497996745);
        setLongField(term325263, term325263.getClass(), "totalHiScore", -8968540338845961317L);
        setLongField(term325263, term325263.getClass(), "totalBasicHighScore", 5563787097561840935L);
        setLongField(term325263, term325263.getClass(), "totalAdvancedHighScore", 998034108065079742L);
        setLongField(term325263, term325263.getClass(), "totalExpertHighScore", -9090646855744689070L);
        setLongField(term325263, term325263.getClass(), "totalMasterHighScore", -363939148082189305L);
        setIntField(term325375, term325375.getClass(), "year", 2020);
        setShortField(term325375, term325375.getClass(), "month", (short) 3);
        setShortField(term325375, term325375.getClass(), "day", (short) 9);
        setField(term325374, term325374.getClass(), "date", term325375);
        setByteField(term325379, term325379.getClass(), "hour", (byte) 12);
        setByteField(term325379, term325379.getClass(), "minute", (byte) 25);
        setByteField(term325379, term325379.getClass(), "second", (byte) 5);
        setIntField(term325379, term325379.getClass(), "nano", 723458430);
        setField(term325374, term325374.getClass(), "time", term325379);
        setField(term325263, term325263.getClass(), "eventWatchedDate", term325374);
        setIntField(term325263, term325263.getClass(), "friendCount", -109990303);
        setBooleanField(term325263, term325263.getClass(), "isMaimai", false);
        setField(term325263, term325263.getClass(), "firstGameId", "nURdupsOyS");
        setField(term325263, term325263.getClass(), "firstRomVersion", "VWjUkRBRfp");
        setField(term325263, term325263.getClass(), "firstDataVersion", "HgEbIAfQHC");
        setIntField(term325423, term325423.getClass(), "year", 2013);
        setShortField(term325423, term325423.getClass(), "month", (short) 7);
        setShortField(term325423, term325423.getClass(), "day", (short) 19);
        setField(term325422, term325422.getClass(), "date", term325423);
        setByteField(term325427, term325427.getClass(), "hour", (byte) 11);
        setByteField(term325427, term325427.getClass(), "minute", (byte) 46);
        setByteField(term325427, term325427.getClass(), "second", (byte) 54);
        setIntField(term325427, term325427.getClass(), "nano", 269358911);
        setField(term325422, term325422.getClass(), "time", term325427);
        setField(term325263, term325263.getClass(), "firstPlayDate", term325422);
        setField(term325263, term325263.getClass(), "lastGameId", "OOqAMsnNEY");
        setField(term325263, term325263.getClass(), "lastRomVersion", "EbBIyYIcdK");
        setField(term325263, term325263.getClass(), "lastDataVersion", "gtWJVwJMfO");
        setIntField(term325469, term325469.getClass(), "year", 2024);
        setShortField(term325469, term325469.getClass(), "month", (short) 6);
        setShortField(term325469, term325469.getClass(), "day", (short) 21);
        setField(term325468, term325468.getClass(), "date", term325469);
        setByteField(term325473, term325473.getClass(), "hour", (byte) 0);
        setByteField(term325473, term325473.getClass(), "minute", (byte) 24);
        setByteField(term325473, term325473.getClass(), "second", (byte) 55);
        setIntField(term325473, term325473.getClass(), "nano", 114259019);
        setField(term325468, term325468.getClass(), "time", term325473);
        setField(term325263, term325263.getClass(), "lastPlayDate", term325468);
        setIntField(term325263, term325263.getClass(), "lastPlaceId", 1201878250);
        setField(term325263, term325263.getClass(), "lastPlaceName", "dzaFbbcFgB");
        setField(term325263, term325263.getClass(), "lastRegionId", "XxkSKRIccb");
        setField(term325263, term325263.getClass(), "lastRegionName", "rVoqxsvuEO");
        setField(term325263, term325263.getClass(), "lastAllNetId", "fvlPYWsfNi");
        setField(term325263, term325263.getClass(), "lastClientId", "HguRJwSWml");
        setField(term325261, term325261.getClass(), "user", term325263);
        setIntField(term325261, term325261.getClass(), "ext1", -1105574919);
        setIntField(term325261, term325261.getClass(), "ext2", -493353713);
        setIntField(term325261, term325261.getClass(), "ext3", 1715756304);
        setIntField(term325261, term325261.getClass(), "ext4", 1885187356);
        setIntField(term325261, term325261.getClass(), "ext5", -271697890);
        setIntField(term325261, term325261.getClass(), "ext6", -1570345011);
        setIntField(term325261, term325261.getClass(), "ext7", 1881035539);
        setIntField(term325261, term325261.getClass(), "ext8", 1544914118);
        setIntField(term325261, term325261.getClass(), "ext9", -946117068);
        setIntField(term325261, term325261.getClass(), "ext10", -1915677831);
        setIntField(term325261, term325261.getClass(), "ext11", 2065361934);
        setIntField(term325261, term325261.getClass(), "ext12", 36380153);
        setIntField(term325261, term325261.getClass(), "ext13", 1825724677);
        setIntField(term325261, term325261.getClass(), "ext14", -902676559);
        setIntField(term325261, term325261.getClass(), "ext15", -1684112314);
        setIntField(term325261, term325261.getClass(), "ext16", -2067871215);
        setIntField(term325261, term325261.getClass(), "ext17", 1663028524);
        setIntField(term325261, term325261.getClass(), "ext18", 1196325291);
        setIntField(term325261, term325261.getClass(), "ext19", 826798931);
        setIntField(term325261, term325261.getClass(), "ext20", 1471203421);
        term325559 = new Integer(461599979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term325559;
        callMethod(klass, "setExt10", argTypes, term325261, args);
    }

};


