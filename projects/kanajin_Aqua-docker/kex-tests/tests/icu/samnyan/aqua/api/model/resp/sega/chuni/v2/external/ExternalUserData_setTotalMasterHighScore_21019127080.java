package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class ExternalUserData_setTotalMasterHighScore_21019127080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32231;
     Object term32482;

    public ExternalUserData_setTotalMasterHighScore_21019127080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32231 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term32256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32416 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32231, term32231.getClass(), "accessCode", "sJNXNshRLe");
        setField(term32231, term32231.getClass(), "userName", "AYnbmgRCKr");
        setIntField(term32257, term32257.getClass(), "year", 2024);
        setShortField(term32257, term32257.getClass(), "month", (short) 10);
        setShortField(term32257, term32257.getClass(), "day", (short) 8);
        setField(term32256, term32256.getClass(), "date", term32257);
        setByteField(term32261, term32261.getClass(), "hour", (byte) 19);
        setByteField(term32261, term32261.getClass(), "minute", (byte) 31);
        setByteField(term32261, term32261.getClass(), "second", (byte) 10);
        setIntField(term32261, term32261.getClass(), "nano", 930417883);
        setField(term32256, term32256.getClass(), "time", term32261);
        setField(term32231, term32231.getClass(), "lastLoginDate", term32256);
        setBooleanField(term32231, term32231.getClass(), "isWebJoin", true);
        setField(term32231, term32231.getClass(), "webLimitDate", "iQRfDlaoYD");
        setIntField(term32231, term32231.getClass(), "level", -355574894);
        setIntField(term32231, term32231.getClass(), "reincarnationNum", 1866941633);
        setField(term32231, term32231.getClass(), "exp", "kpcyrjDQzN");
        setLongField(term32231, term32231.getClass(), "point", -5338413783740215067L);
        setLongField(term32231, term32231.getClass(), "totalPoint", -814922776357887557L);
        setIntField(term32231, term32231.getClass(), "playCount", 1697296048);
        setIntField(term32231, term32231.getClass(), "multiPlayCount", 1302075623);
        setIntField(term32231, term32231.getClass(), "multiWinCount", 1238707613);
        setIntField(term32231, term32231.getClass(), "requestResCount", 1961351136);
        setIntField(term32231, term32231.getClass(), "acceptResCount", -1546528470);
        setIntField(term32231, term32231.getClass(), "successResCount", -1518971561);
        setIntField(term32231, term32231.getClass(), "playerRating", 1513663171);
        setIntField(term32231, term32231.getClass(), "highestRating", 1527034193);
        setIntField(term32231, term32231.getClass(), "nameplateId", 1309545946);
        setIntField(term32231, term32231.getClass(), "frameId", -1457812682);
        setIntField(term32231, term32231.getClass(), "characterId", -161850441);
        setIntField(term32231, term32231.getClass(), "trophyId", 1486351894);
        setIntField(term32231, term32231.getClass(), "playedTutorialBit", 1352463113);
        setIntField(term32231, term32231.getClass(), "firstTutorialCancelNum", 897269648);
        setIntField(term32231, term32231.getClass(), "masterTutorialCancelNum", -1020664075);
        setIntField(term32231, term32231.getClass(), "totalRepertoireCount", -1412100145);
        setIntField(term32231, term32231.getClass(), "totalMapNum", -1702355599);
        setLongField(term32231, term32231.getClass(), "totalHiScore", 800893933628130392L);
        setLongField(term32231, term32231.getClass(), "totalBasicHighScore", -6983938899150831997L);
        setLongField(term32231, term32231.getClass(), "totalAdvancedHighScore", -2720964670491002091L);
        setLongField(term32231, term32231.getClass(), "totalExpertHighScore", -723697646775816649L);
        setLongField(term32231, term32231.getClass(), "totalMasterHighScore", -5671086125367688052L);
        setIntField(term32318, term32318.getClass(), "year", 2028);
        setShortField(term32318, term32318.getClass(), "month", (short) 6);
        setShortField(term32318, term32318.getClass(), "day", (short) 21);
        setField(term32317, term32317.getClass(), "date", term32318);
        setByteField(term32322, term32322.getClass(), "hour", (byte) 2);
        setByteField(term32322, term32322.getClass(), "minute", (byte) 38);
        setByteField(term32322, term32322.getClass(), "second", (byte) 11);
        setIntField(term32322, term32322.getClass(), "nano", 40256095);
        setField(term32317, term32317.getClass(), "time", term32322);
        setField(term32231, term32231.getClass(), "eventWatchedDate", term32317);
        setIntField(term32231, term32231.getClass(), "friendCount", -1477091217);
        setBooleanField(term32231, term32231.getClass(), "isMaimai", false);
        setField(term32231, term32231.getClass(), "firstGameId", "IyukykAHLQ");
        setField(term32231, term32231.getClass(), "firstRomVersion", "CwZcgFJqMh");
        setField(term32231, term32231.getClass(), "firstDataVersion", "RldCZqgRbO");
        setIntField(term32366, term32366.getClass(), "year", 2017);
        setShortField(term32366, term32366.getClass(), "month", (short) 5);
        setShortField(term32366, term32366.getClass(), "day", (short) 17);
        setField(term32365, term32365.getClass(), "date", term32366);
        setByteField(term32370, term32370.getClass(), "hour", (byte) 22);
        setByteField(term32370, term32370.getClass(), "minute", (byte) 56);
        setByteField(term32370, term32370.getClass(), "second", (byte) 28);
        setIntField(term32370, term32370.getClass(), "nano", 581659115);
        setField(term32365, term32365.getClass(), "time", term32370);
        setField(term32231, term32231.getClass(), "firstPlayDate", term32365);
        setField(term32231, term32231.getClass(), "lastGameId", "LOVugCAgJs");
        setField(term32231, term32231.getClass(), "lastRomVersion", "SNmHXwCiFY");
        setField(term32231, term32231.getClass(), "lastDataVersion", "HZfkWoqyUW");
        setIntField(term32412, term32412.getClass(), "year", 2015);
        setShortField(term32412, term32412.getClass(), "month", (short) 4);
        setShortField(term32412, term32412.getClass(), "day", (short) 14);
        setField(term32411, term32411.getClass(), "date", term32412);
        setByteField(term32416, term32416.getClass(), "hour", (byte) 23);
        setByteField(term32416, term32416.getClass(), "minute", (byte) 8);
        setByteField(term32416, term32416.getClass(), "second", (byte) 53);
        setIntField(term32416, term32416.getClass(), "nano", 375234559);
        setField(term32411, term32411.getClass(), "time", term32416);
        setField(term32231, term32231.getClass(), "lastPlayDate", term32411);
        setIntField(term32231, term32231.getClass(), "lastPlaceId", 2023226154);
        setField(term32231, term32231.getClass(), "lastPlaceName", "QRwANPSyfT");
        setField(term32231, term32231.getClass(), "lastRegionId", "DbZKLwYBgy");
        setField(term32231, term32231.getClass(), "lastRegionName", "LnNRVsjmxw");
        setField(term32231, term32231.getClass(), "lastAllNetId", "PlOnDkNrvX");
        setField(term32231, term32231.getClass(), "lastClientId", "MltgFGldop");
        term32482 = new Long(7875739215674729968L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term32482;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term32231, args);
    }

};


