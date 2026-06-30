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

public class UserMap_canEqual_214343659224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289323;
     Object term289610;

    public UserMap_canEqual_214343659224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term289329 = new Long(5614572229094721840L);
        term289323 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term289325 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term289327 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term289343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289535 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term289323, term289323.getClass(), "id", 1472742204877182326L);
        setLongField(term289325, term289325.getClass(), "id", 4220981015637651293L);
        setLongField(term289327, term289327.getClass(), "id", 3340166480123086586L);
        setField(term289327, term289327.getClass(), "extId", term289329);
        setField(term289327, term289327.getClass(), "luid", "ZKcDOgjedL");
        setIntField(term289344, term289344.getClass(), "year", 2014);
        setShortField(term289344, term289344.getClass(), "month", (short) 9);
        setShortField(term289344, term289344.getClass(), "day", (short) 25);
        setField(term289343, term289343.getClass(), "date", term289344);
        setByteField(term289348, term289348.getClass(), "hour", (byte) 13);
        setByteField(term289348, term289348.getClass(), "minute", (byte) 28);
        setByteField(term289348, term289348.getClass(), "second", (byte) 49);
        setIntField(term289348, term289348.getClass(), "nano", 732782156);
        setField(term289343, term289343.getClass(), "time", term289348);
        setField(term289327, term289327.getClass(), "registerTime", term289343);
        setIntField(term289354, term289354.getClass(), "year", 2020);
        setShortField(term289354, term289354.getClass(), "month", (short) 10);
        setShortField(term289354, term289354.getClass(), "day", (short) 31);
        setField(term289353, term289353.getClass(), "date", term289354);
        setByteField(term289358, term289358.getClass(), "hour", (byte) 8);
        setByteField(term289358, term289358.getClass(), "minute", (byte) 7);
        setByteField(term289358, term289358.getClass(), "second", (byte) 13);
        setIntField(term289358, term289358.getClass(), "nano", 135052115);
        setField(term289353, term289353.getClass(), "time", term289358);
        setField(term289327, term289327.getClass(), "accessTime", term289353);
        setField(term289325, term289325.getClass(), "card", term289327);
        setField(term289325, term289325.getClass(), "userName", "fbIyjOnFlU");
        setIntField(term289376, term289376.getClass(), "year", 2025);
        setShortField(term289376, term289376.getClass(), "month", (short) 6);
        setShortField(term289376, term289376.getClass(), "day", (short) 30);
        setField(term289375, term289375.getClass(), "date", term289376);
        setByteField(term289380, term289380.getClass(), "hour", (byte) 3);
        setByteField(term289380, term289380.getClass(), "minute", (byte) 39);
        setByteField(term289380, term289380.getClass(), "second", (byte) 14);
        setIntField(term289380, term289380.getClass(), "nano", 25160111);
        setField(term289375, term289375.getClass(), "time", term289380);
        setField(term289325, term289325.getClass(), "lastLoginDate", term289375);
        setBooleanField(term289325, term289325.getClass(), "isWebJoin", true);
        setField(term289325, term289325.getClass(), "webLimitDate", "mHJnsoOUVm");
        setIntField(term289325, term289325.getClass(), "level", 455488849);
        setIntField(term289325, term289325.getClass(), "reincarnationNum", -209063929);
        setField(term289325, term289325.getClass(), "exp", "SZTwFHuOlF");
        setLongField(term289325, term289325.getClass(), "point", 8645399904701489103L);
        setLongField(term289325, term289325.getClass(), "totalPoint", -1787167769341199205L);
        setIntField(term289325, term289325.getClass(), "playCount", 536230173);
        setIntField(term289325, term289325.getClass(), "multiPlayCount", 1592003857);
        setIntField(term289325, term289325.getClass(), "multiWinCount", -1887501397);
        setIntField(term289325, term289325.getClass(), "requestResCount", 154448312);
        setIntField(term289325, term289325.getClass(), "acceptResCount", 138276904);
        setIntField(term289325, term289325.getClass(), "successResCount", -2109036857);
        setIntField(term289325, term289325.getClass(), "playerRating", 135499222);
        setIntField(term289325, term289325.getClass(), "highestRating", 1653333305);
        setIntField(term289325, term289325.getClass(), "nameplateId", -627625760);
        setIntField(term289325, term289325.getClass(), "frameId", -1512097288);
        setIntField(term289325, term289325.getClass(), "characterId", 855730514);
        setIntField(term289325, term289325.getClass(), "trophyId", 1540516464);
        setIntField(term289325, term289325.getClass(), "playedTutorialBit", -765931973);
        setIntField(term289325, term289325.getClass(), "firstTutorialCancelNum", 1553464782);
        setIntField(term289325, term289325.getClass(), "masterTutorialCancelNum", -377732866);
        setIntField(term289325, term289325.getClass(), "totalRepertoireCount", 793253863);
        setIntField(term289325, term289325.getClass(), "totalMapNum", -65663655);
        setLongField(term289325, term289325.getClass(), "totalHiScore", 3803233753524357284L);
        setLongField(term289325, term289325.getClass(), "totalBasicHighScore", -3179090767436662155L);
        setLongField(term289325, term289325.getClass(), "totalAdvancedHighScore", 5386517547679128749L);
        setLongField(term289325, term289325.getClass(), "totalExpertHighScore", -5306698981173846594L);
        setLongField(term289325, term289325.getClass(), "totalMasterHighScore", -405219218622827050L);
        setIntField(term289437, term289437.getClass(), "year", 2025);
        setShortField(term289437, term289437.getClass(), "month", (short) 9);
        setShortField(term289437, term289437.getClass(), "day", (short) 16);
        setField(term289436, term289436.getClass(), "date", term289437);
        setByteField(term289441, term289441.getClass(), "hour", (byte) 22);
        setByteField(term289441, term289441.getClass(), "minute", (byte) 24);
        setByteField(term289441, term289441.getClass(), "second", (byte) 34);
        setIntField(term289441, term289441.getClass(), "nano", 513875629);
        setField(term289436, term289436.getClass(), "time", term289441);
        setField(term289325, term289325.getClass(), "eventWatchedDate", term289436);
        setIntField(term289325, term289325.getClass(), "friendCount", 55766550);
        setBooleanField(term289325, term289325.getClass(), "isMaimai", true);
        setField(term289325, term289325.getClass(), "firstGameId", "HuNcrtnuIr");
        setField(term289325, term289325.getClass(), "firstRomVersion", "UOgVwpVTwb");
        setField(term289325, term289325.getClass(), "firstDataVersion", "SNxxiwGooS");
        setIntField(term289485, term289485.getClass(), "year", 2015);
        setShortField(term289485, term289485.getClass(), "month", (short) 12);
        setShortField(term289485, term289485.getClass(), "day", (short) 22);
        setField(term289484, term289484.getClass(), "date", term289485);
        setByteField(term289489, term289489.getClass(), "hour", (byte) 6);
        setByteField(term289489, term289489.getClass(), "minute", (byte) 42);
        setByteField(term289489, term289489.getClass(), "second", (byte) 27);
        setIntField(term289489, term289489.getClass(), "nano", 634143788);
        setField(term289484, term289484.getClass(), "time", term289489);
        setField(term289325, term289325.getClass(), "firstPlayDate", term289484);
        setField(term289325, term289325.getClass(), "lastGameId", "uACfzGuzLf");
        setField(term289325, term289325.getClass(), "lastRomVersion", "GhNtnTcGqj");
        setField(term289325, term289325.getClass(), "lastDataVersion", "llQSWhVMIU");
        setIntField(term289531, term289531.getClass(), "year", 2013);
        setShortField(term289531, term289531.getClass(), "month", (short) 4);
        setShortField(term289531, term289531.getClass(), "day", (short) 22);
        setField(term289530, term289530.getClass(), "date", term289531);
        setByteField(term289535, term289535.getClass(), "hour", (byte) 15);
        setByteField(term289535, term289535.getClass(), "minute", (byte) 9);
        setByteField(term289535, term289535.getClass(), "second", (byte) 51);
        setIntField(term289535, term289535.getClass(), "nano", 57204082);
        setField(term289530, term289530.getClass(), "time", term289535);
        setField(term289325, term289325.getClass(), "lastPlayDate", term289530);
        setIntField(term289325, term289325.getClass(), "lastPlaceId", 1326458042);
        setField(term289325, term289325.getClass(), "lastPlaceName", "obVHSLzFkr");
        setField(term289325, term289325.getClass(), "lastRegionId", "qPqtpUGEBt");
        setField(term289325, term289325.getClass(), "lastRegionName", "LjpmgLxxAN");
        setField(term289325, term289325.getClass(), "lastAllNetId", "axbOsAnkgV");
        setField(term289325, term289325.getClass(), "lastClientId", "mNmYtNfYWV");
        setField(term289323, term289323.getClass(), "user", term289325);
        setIntField(term289323, term289323.getClass(), "mapId", 2065869723);
        setIntField(term289323, term289323.getClass(), "position", -865224762);
        setBooleanField(term289323, term289323.getClass(), "isClear", true);
        setIntField(term289323, term289323.getClass(), "areaId", -803624396);
        setIntField(term289323, term289323.getClass(), "routeNumber", 1824960332);
        setIntField(term289323, term289323.getClass(), "eventId", 1452928275);
        setIntField(term289323, term289323.getClass(), "rate", -1153331717);
        setIntField(term289323, term289323.getClass(), "statusCount", -1018179752);
        setBooleanField(term289323, term289323.getClass(), "isValid", false);
        term289610 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term289610;
        callMethod(klass, "canEqual", argTypes, term289323, args);
    }

};


