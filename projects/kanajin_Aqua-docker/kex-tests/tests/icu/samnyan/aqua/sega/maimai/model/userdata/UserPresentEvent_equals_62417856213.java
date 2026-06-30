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

public class UserPresentEvent_equals_62417856213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100417;
     Object term100597;

    public UserPresentEvent_equals_62417856213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100423 = new Long(4139034517298316285L);
        term100417 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term100419 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term100421 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100452 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100417, term100417.getClass(), "id", -1013042203229198032L);
        setLongField(term100419, term100419.getClass(), "id", 576269924637193764L);
        setLongField(term100421, term100421.getClass(), "id", 489460221587679133L);
        setField(term100421, term100421.getClass(), "extId", term100423);
        setField(term100421, term100421.getClass(), "luid", "ChmRdUmCnQ");
        setIntField(term100438, term100438.getClass(), "year", 2022);
        setShortField(term100438, term100438.getClass(), "month", (short) 11);
        setShortField(term100438, term100438.getClass(), "day", (short) 16);
        setField(term100437, term100437.getClass(), "date", term100438);
        setByteField(term100442, term100442.getClass(), "hour", (byte) 12);
        setByteField(term100442, term100442.getClass(), "minute", (byte) 41);
        setByteField(term100442, term100442.getClass(), "second", (byte) 8);
        setIntField(term100442, term100442.getClass(), "nano", 873900846);
        setField(term100437, term100437.getClass(), "time", term100442);
        setField(term100421, term100421.getClass(), "registerTime", term100437);
        setIntField(term100448, term100448.getClass(), "year", 2016);
        setShortField(term100448, term100448.getClass(), "month", (short) 8);
        setShortField(term100448, term100448.getClass(), "day", (short) 9);
        setField(term100447, term100447.getClass(), "date", term100448);
        setByteField(term100452, term100452.getClass(), "hour", (byte) 11);
        setByteField(term100452, term100452.getClass(), "minute", (byte) 35);
        setByteField(term100452, term100452.getClass(), "second", (byte) 27);
        setIntField(term100452, term100452.getClass(), "nano", 440006638);
        setField(term100447, term100447.getClass(), "time", term100452);
        setField(term100421, term100421.getClass(), "accessTime", term100447);
        setField(term100419, term100419.getClass(), "card", term100421);
        setIntField(term100419, term100419.getClass(), "lastDataVersion", -912795408);
        setField(term100419, term100419.getClass(), "userName", "WbDSdFiKLp");
        setIntField(term100419, term100419.getClass(), "point", -2050437434);
        setIntField(term100419, term100419.getClass(), "totalPoint", -22408249);
        setIntField(term100419, term100419.getClass(), "iconId", 448698422);
        setIntField(term100419, term100419.getClass(), "nameplateId", -2016448879);
        setIntField(term100419, term100419.getClass(), "frameId", -433794574);
        setIntField(term100419, term100419.getClass(), "trophyId", -556957666);
        setIntField(term100419, term100419.getClass(), "playCount", 255448931);
        setIntField(term100419, term100419.getClass(), "playVsCount", 389248106);
        setIntField(term100419, term100419.getClass(), "playSyncCount", 1115142984);
        setIntField(term100419, term100419.getClass(), "winCount", 1661328229);
        setIntField(term100419, term100419.getClass(), "helpCount", 900564501);
        setIntField(term100419, term100419.getClass(), "comboCount", 691426483);
        setIntField(term100419, term100419.getClass(), "feverCount", -1874483545);
        setIntField(term100419, term100419.getClass(), "totalHiScore", -12947994);
        setIntField(term100419, term100419.getClass(), "totalEasyHighScore", -2140327885);
        setIntField(term100419, term100419.getClass(), "totalBasicHighScore", -716761090);
        setIntField(term100419, term100419.getClass(), "totalAdvancedHighScore", 164855440);
        setIntField(term100419, term100419.getClass(), "totalExpertHighScore", -1814635979);
        setIntField(term100419, term100419.getClass(), "totalMasterHighScore", 4956756);
        setIntField(term100419, term100419.getClass(), "totalReMasterHighScore", 1025289060);
        setIntField(term100419, term100419.getClass(), "totalHighSync", -1825138606);
        setIntField(term100419, term100419.getClass(), "totalEasySync", -1528237952);
        setIntField(term100419, term100419.getClass(), "totalBasicSync", -778347388);
        setIntField(term100419, term100419.getClass(), "totalAdvancedSync", -1582115328);
        setIntField(term100419, term100419.getClass(), "totalExpertSync", -847286682);
        setIntField(term100419, term100419.getClass(), "totalMasterSync", 1928848171);
        setIntField(term100419, term100419.getClass(), "totalReMasterSync", -646124218);
        setIntField(term100419, term100419.getClass(), "playerRating", -1021537887);
        setIntField(term100419, term100419.getClass(), "highestRating", -1125442276);
        setIntField(term100419, term100419.getClass(), "rankAuthTailId", 1396813980);
        setField(term100419, term100419.getClass(), "eventWatchedDate", "DNeKwjPiYD");
        setField(term100419, term100419.getClass(), "webLimitDate", "jxryzEuKJL");
        setIntField(term100419, term100419.getClass(), "challengeTrackPhase", -326534947);
        setIntField(term100419, term100419.getClass(), "firstPlayBits", 928430778);
        setField(term100419, term100419.getClass(), "lastPlayDate", "EPCordSkfF");
        setIntField(term100419, term100419.getClass(), "lastPlaceId", -677542538);
        setField(term100419, term100419.getClass(), "lastPlaceName", "TdSezgsZkW");
        setIntField(term100419, term100419.getClass(), "lastRegionId", 310695506);
        setField(term100419, term100419.getClass(), "lastRegionName", "aJlxWEbXVP");
        setField(term100419, term100419.getClass(), "lastClientId", "pxpYGruvWy");
        setField(term100419, term100419.getClass(), "lastCountryCode", "BMskFMPoeb");
        setIntField(term100419, term100419.getClass(), "eventPoint", -2079854393);
        setIntField(term100419, term100419.getClass(), "totalLv", 125914013);
        setIntField(term100419, term100419.getClass(), "lastLoginBonusDay", 236993107);
        setIntField(term100419, term100419.getClass(), "lastSurvivalBonusDay", 1900650812);
        setIntField(term100419, term100419.getClass(), "loginBonusLv", 1824505737);
        setField(term100417, term100417.getClass(), "user", term100419);
        setIntField(term100417, term100417.getClass(), "presentEventId", -1231776024);
        setIntField(term100417, term100417.getClass(), "point", -201286705);
        setIntField(term100417, term100417.getClass(), "presentCount", 1946136392);
        setIntField(term100417, term100417.getClass(), "rate", 845409458);
        term100597 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100597;
        callMethod(klass, "equals", argTypes, term100417, args);
    }

};


