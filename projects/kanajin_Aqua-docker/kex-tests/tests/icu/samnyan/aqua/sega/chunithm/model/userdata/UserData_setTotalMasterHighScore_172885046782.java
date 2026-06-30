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

public class UserData_setTotalMasterHighScore_172885046782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164489;
     Object term164765;

    public UserData_setTotalMasterHighScore_172885046782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164493 = new Long(-1279670138064751276L);
        term164489 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term164491 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164699 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164489, term164489.getClass(), "id", -6611343048483242997L);
        setLongField(term164491, term164491.getClass(), "id", 3182987509782180187L);
        setField(term164491, term164491.getClass(), "extId", term164493);
        setField(term164491, term164491.getClass(), "luid", "JFwtRLPoHH");
        setIntField(term164508, term164508.getClass(), "year", 2025);
        setShortField(term164508, term164508.getClass(), "month", (short) 5);
        setShortField(term164508, term164508.getClass(), "day", (short) 14);
        setField(term164507, term164507.getClass(), "date", term164508);
        setByteField(term164512, term164512.getClass(), "hour", (byte) 13);
        setByteField(term164512, term164512.getClass(), "minute", (byte) 6);
        setByteField(term164512, term164512.getClass(), "second", (byte) 2);
        setIntField(term164512, term164512.getClass(), "nano", 770638968);
        setField(term164507, term164507.getClass(), "time", term164512);
        setField(term164491, term164491.getClass(), "registerTime", term164507);
        setIntField(term164518, term164518.getClass(), "year", 2011);
        setShortField(term164518, term164518.getClass(), "month", (short) 2);
        setShortField(term164518, term164518.getClass(), "day", (short) 1);
        setField(term164517, term164517.getClass(), "date", term164518);
        setByteField(term164522, term164522.getClass(), "hour", (byte) 10);
        setByteField(term164522, term164522.getClass(), "minute", (byte) 54);
        setByteField(term164522, term164522.getClass(), "second", (byte) 41);
        setIntField(term164522, term164522.getClass(), "nano", 997281375);
        setField(term164517, term164517.getClass(), "time", term164522);
        setField(term164491, term164491.getClass(), "accessTime", term164517);
        setField(term164489, term164489.getClass(), "card", term164491);
        setField(term164489, term164489.getClass(), "userName", "PkFqFUDNRB");
        setIntField(term164540, term164540.getClass(), "year", 2022);
        setShortField(term164540, term164540.getClass(), "month", (short) 11);
        setShortField(term164540, term164540.getClass(), "day", (short) 2);
        setField(term164539, term164539.getClass(), "date", term164540);
        setByteField(term164544, term164544.getClass(), "hour", (byte) 11);
        setByteField(term164544, term164544.getClass(), "minute", (byte) 3);
        setByteField(term164544, term164544.getClass(), "second", (byte) 43);
        setIntField(term164544, term164544.getClass(), "nano", 40622204);
        setField(term164539, term164539.getClass(), "time", term164544);
        setField(term164489, term164489.getClass(), "lastLoginDate", term164539);
        setBooleanField(term164489, term164489.getClass(), "isWebJoin", false);
        setField(term164489, term164489.getClass(), "webLimitDate", "JTaFYFigKc");
        setIntField(term164489, term164489.getClass(), "level", 697622913);
        setIntField(term164489, term164489.getClass(), "reincarnationNum", -1907956934);
        setField(term164489, term164489.getClass(), "exp", "UkkxEeaUAd");
        setLongField(term164489, term164489.getClass(), "point", -4883788836369956506L);
        setLongField(term164489, term164489.getClass(), "totalPoint", 1828579945139352205L);
        setIntField(term164489, term164489.getClass(), "playCount", -1932506949);
        setIntField(term164489, term164489.getClass(), "multiPlayCount", -1191178740);
        setIntField(term164489, term164489.getClass(), "multiWinCount", -1072911681);
        setIntField(term164489, term164489.getClass(), "requestResCount", 237096319);
        setIntField(term164489, term164489.getClass(), "acceptResCount", -129239539);
        setIntField(term164489, term164489.getClass(), "successResCount", 1898041134);
        setIntField(term164489, term164489.getClass(), "playerRating", -849607758);
        setIntField(term164489, term164489.getClass(), "highestRating", 2104460972);
        setIntField(term164489, term164489.getClass(), "nameplateId", -8337895);
        setIntField(term164489, term164489.getClass(), "frameId", 1708375901);
        setIntField(term164489, term164489.getClass(), "characterId", -1947090409);
        setIntField(term164489, term164489.getClass(), "trophyId", 318897815);
        setIntField(term164489, term164489.getClass(), "playedTutorialBit", 1078408023);
        setIntField(term164489, term164489.getClass(), "firstTutorialCancelNum", -1113914353);
        setIntField(term164489, term164489.getClass(), "masterTutorialCancelNum", 860243352);
        setIntField(term164489, term164489.getClass(), "totalRepertoireCount", 363051486);
        setIntField(term164489, term164489.getClass(), "totalMapNum", 668773961);
        setLongField(term164489, term164489.getClass(), "totalHiScore", 7974624276262964833L);
        setLongField(term164489, term164489.getClass(), "totalBasicHighScore", 7593569489480297611L);
        setLongField(term164489, term164489.getClass(), "totalAdvancedHighScore", -6771193908629784176L);
        setLongField(term164489, term164489.getClass(), "totalExpertHighScore", -6018822049134958029L);
        setLongField(term164489, term164489.getClass(), "totalMasterHighScore", -641768322605539260L);
        setIntField(term164601, term164601.getClass(), "year", 2021);
        setShortField(term164601, term164601.getClass(), "month", (short) 9);
        setShortField(term164601, term164601.getClass(), "day", (short) 25);
        setField(term164600, term164600.getClass(), "date", term164601);
        setByteField(term164605, term164605.getClass(), "hour", (byte) 14);
        setByteField(term164605, term164605.getClass(), "minute", (byte) 32);
        setByteField(term164605, term164605.getClass(), "second", (byte) 43);
        setIntField(term164605, term164605.getClass(), "nano", 188383381);
        setField(term164600, term164600.getClass(), "time", term164605);
        setField(term164489, term164489.getClass(), "eventWatchedDate", term164600);
        setIntField(term164489, term164489.getClass(), "friendCount", -1762018663);
        setBooleanField(term164489, term164489.getClass(), "isMaimai", true);
        setField(term164489, term164489.getClass(), "firstGameId", "YuCzAoZaux");
        setField(term164489, term164489.getClass(), "firstRomVersion", "ovBBNANJnh");
        setField(term164489, term164489.getClass(), "firstDataVersion", "TXVFqDUypQ");
        setIntField(term164649, term164649.getClass(), "year", 2021);
        setShortField(term164649, term164649.getClass(), "month", (short) 9);
        setShortField(term164649, term164649.getClass(), "day", (short) 21);
        setField(term164648, term164648.getClass(), "date", term164649);
        setByteField(term164653, term164653.getClass(), "hour", (byte) 23);
        setByteField(term164653, term164653.getClass(), "minute", (byte) 46);
        setByteField(term164653, term164653.getClass(), "second", (byte) 0);
        setIntField(term164653, term164653.getClass(), "nano", 788415059);
        setField(term164648, term164648.getClass(), "time", term164653);
        setField(term164489, term164489.getClass(), "firstPlayDate", term164648);
        setField(term164489, term164489.getClass(), "lastGameId", "bAuMZKiuMg");
        setField(term164489, term164489.getClass(), "lastRomVersion", "sOlEVEhJBz");
        setField(term164489, term164489.getClass(), "lastDataVersion", "PKUBbcvbbv");
        setIntField(term164695, term164695.getClass(), "year", 2020);
        setShortField(term164695, term164695.getClass(), "month", (short) 2);
        setShortField(term164695, term164695.getClass(), "day", (short) 27);
        setField(term164694, term164694.getClass(), "date", term164695);
        setByteField(term164699, term164699.getClass(), "hour", (byte) 23);
        setByteField(term164699, term164699.getClass(), "minute", (byte) 37);
        setByteField(term164699, term164699.getClass(), "second", (byte) 23);
        setIntField(term164699, term164699.getClass(), "nano", 748886652);
        setField(term164694, term164694.getClass(), "time", term164699);
        setField(term164489, term164489.getClass(), "lastPlayDate", term164694);
        setIntField(term164489, term164489.getClass(), "lastPlaceId", 1974419093);
        setField(term164489, term164489.getClass(), "lastPlaceName", "jrRihiCPvt");
        setField(term164489, term164489.getClass(), "lastRegionId", "qlCPJWygtB");
        setField(term164489, term164489.getClass(), "lastRegionName", "nuqtGxTogL");
        setField(term164489, term164489.getClass(), "lastAllNetId", "jaTZlmEwYn");
        setField(term164489, term164489.getClass(), "lastClientId", "YLEdXlSrOR");
        term164765 = new Long(7489532448652137497L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term164765;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term164489, args);
    }

};


