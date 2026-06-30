package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getTotalHiScore_142655514427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10828;

    public ExternalUserData_getTotalHiScore_142655514427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10828 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term10853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10858 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10967 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10828, term10828.getClass(), "accessCode", "vSeruUyNWX");
        setField(term10828, term10828.getClass(), "userName", "UkKvaeJfEC");
        setIntField(term10854, term10854.getClass(), "year", 2013);
        setShortField(term10854, term10854.getClass(), "month", (short) 7);
        setShortField(term10854, term10854.getClass(), "day", (short) 3);
        setField(term10853, term10853.getClass(), "date", term10854);
        setByteField(term10858, term10858.getClass(), "hour", (byte) 10);
        setByteField(term10858, term10858.getClass(), "minute", (byte) 59);
        setByteField(term10858, term10858.getClass(), "second", (byte) 22);
        setIntField(term10858, term10858.getClass(), "nano", 937921480);
        setField(term10853, term10853.getClass(), "time", term10858);
        setField(term10828, term10828.getClass(), "lastLoginDate", term10853);
        setBooleanField(term10828, term10828.getClass(), "isWebJoin", true);
        setField(term10828, term10828.getClass(), "webLimitDate", "WPxXsahPRq");
        setIntField(term10828, term10828.getClass(), "level", 1048451946);
        setIntField(term10828, term10828.getClass(), "reincarnationNum", 5603560);
        setField(term10828, term10828.getClass(), "exp", "IENRuqmwUU");
        setLongField(term10828, term10828.getClass(), "point", -433040798405298080L);
        setLongField(term10828, term10828.getClass(), "totalPoint", -1505191021111100819L);
        setIntField(term10828, term10828.getClass(), "playCount", -1079020032);
        setIntField(term10828, term10828.getClass(), "multiPlayCount", -1973791064);
        setIntField(term10828, term10828.getClass(), "multiWinCount", -2072158633);
        setIntField(term10828, term10828.getClass(), "requestResCount", -355469363);
        setIntField(term10828, term10828.getClass(), "acceptResCount", 1465188553);
        setIntField(term10828, term10828.getClass(), "successResCount", 1633913667);
        setIntField(term10828, term10828.getClass(), "playerRating", 1292332296);
        setIntField(term10828, term10828.getClass(), "highestRating", -1415256843);
        setIntField(term10828, term10828.getClass(), "nameplateId", 612177768);
        setIntField(term10828, term10828.getClass(), "frameId", -1626451656);
        setIntField(term10828, term10828.getClass(), "characterId", 173952451);
        setIntField(term10828, term10828.getClass(), "trophyId", -1972033388);
        setIntField(term10828, term10828.getClass(), "playedTutorialBit", -1005024758);
        setIntField(term10828, term10828.getClass(), "firstTutorialCancelNum", 2634669);
        setIntField(term10828, term10828.getClass(), "masterTutorialCancelNum", -1912429941);
        setIntField(term10828, term10828.getClass(), "totalRepertoireCount", 1801052257);
        setIntField(term10828, term10828.getClass(), "totalMapNum", -2110556060);
        setLongField(term10828, term10828.getClass(), "totalHiScore", -1000830646340880796L);
        setLongField(term10828, term10828.getClass(), "totalBasicHighScore", 5973526439563541711L);
        setLongField(term10828, term10828.getClass(), "totalAdvancedHighScore", 5246058710498845622L);
        setLongField(term10828, term10828.getClass(), "totalExpertHighScore", 4394651392080968777L);
        setLongField(term10828, term10828.getClass(), "totalMasterHighScore", -7310273014364148916L);
        setIntField(term10915, term10915.getClass(), "year", 2012);
        setShortField(term10915, term10915.getClass(), "month", (short) 2);
        setShortField(term10915, term10915.getClass(), "day", (short) 29);
        setField(term10914, term10914.getClass(), "date", term10915);
        setByteField(term10919, term10919.getClass(), "hour", (byte) 14);
        setByteField(term10919, term10919.getClass(), "minute", (byte) 26);
        setByteField(term10919, term10919.getClass(), "second", (byte) 20);
        setIntField(term10919, term10919.getClass(), "nano", 780823452);
        setField(term10914, term10914.getClass(), "time", term10919);
        setField(term10828, term10828.getClass(), "eventWatchedDate", term10914);
        setIntField(term10828, term10828.getClass(), "friendCount", 313459791);
        setBooleanField(term10828, term10828.getClass(), "isMaimai", false);
        setField(term10828, term10828.getClass(), "firstGameId", "GsWxOwXvSu");
        setField(term10828, term10828.getClass(), "firstRomVersion", "bKBSncrMEZ");
        setField(term10828, term10828.getClass(), "firstDataVersion", "yeSXGqQExb");
        setIntField(term10963, term10963.getClass(), "year", 2029);
        setShortField(term10963, term10963.getClass(), "month", (short) 7);
        setShortField(term10963, term10963.getClass(), "day", (short) 19);
        setField(term10962, term10962.getClass(), "date", term10963);
        setByteField(term10967, term10967.getClass(), "hour", (byte) 17);
        setByteField(term10967, term10967.getClass(), "minute", (byte) 37);
        setByteField(term10967, term10967.getClass(), "second", (byte) 21);
        setIntField(term10967, term10967.getClass(), "nano", 320093277);
        setField(term10962, term10962.getClass(), "time", term10967);
        setField(term10828, term10828.getClass(), "firstPlayDate", term10962);
        setField(term10828, term10828.getClass(), "lastGameId", "uXYcXVYJZM");
        setField(term10828, term10828.getClass(), "lastRomVersion", "BJhjdJUhkz");
        setField(term10828, term10828.getClass(), "lastDataVersion", "cdHYQDgUZR");
        setIntField(term11009, term11009.getClass(), "year", 2028);
        setShortField(term11009, term11009.getClass(), "month", (short) 1);
        setShortField(term11009, term11009.getClass(), "day", (short) 11);
        setField(term11008, term11008.getClass(), "date", term11009);
        setByteField(term11013, term11013.getClass(), "hour", (byte) 22);
        setByteField(term11013, term11013.getClass(), "minute", (byte) 3);
        setByteField(term11013, term11013.getClass(), "second", (byte) 39);
        setIntField(term11013, term11013.getClass(), "nano", 175567313);
        setField(term11008, term11008.getClass(), "time", term11013);
        setField(term10828, term10828.getClass(), "lastPlayDate", term11008);
        setIntField(term10828, term10828.getClass(), "lastPlaceId", 752615112);
        setField(term10828, term10828.getClass(), "lastPlaceName", "KAORSSPSeV");
        setField(term10828, term10828.getClass(), "lastRegionId", "UimMMORkzd");
        setField(term10828, term10828.getClass(), "lastRegionName", "huVIXUWLtI");
        setField(term10828, term10828.getClass(), "lastAllNetId", "vhKzFyKPOT");
        setField(term10828, term10828.getClass(), "lastClientId", "nQhIgWXdRc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term10828, args);
    }

};


