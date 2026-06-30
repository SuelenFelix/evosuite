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

public class UserDuel_isClear_3736948326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77513;

    public UserDuel_isClear_3736948326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77519 = new Long(-7115418542247301000L);
        term77513 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term77515 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term77517 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77570 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77631 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77800 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77513, term77513.getClass(), "id", -4026624946106334837L);
        setLongField(term77515, term77515.getClass(), "id", 3465513040115241688L);
        setLongField(term77517, term77517.getClass(), "id", 5260379851065937225L);
        setField(term77517, term77517.getClass(), "extId", term77519);
        setField(term77517, term77517.getClass(), "luid", "XcJqDBnnMZ");
        setIntField(term77534, term77534.getClass(), "year", 2018);
        setShortField(term77534, term77534.getClass(), "month", (short) 6);
        setShortField(term77534, term77534.getClass(), "day", (short) 29);
        setField(term77533, term77533.getClass(), "date", term77534);
        setByteField(term77538, term77538.getClass(), "hour", (byte) 0);
        setByteField(term77538, term77538.getClass(), "minute", (byte) 24);
        setByteField(term77538, term77538.getClass(), "second", (byte) 5);
        setIntField(term77538, term77538.getClass(), "nano", 130907665);
        setField(term77533, term77533.getClass(), "time", term77538);
        setField(term77517, term77517.getClass(), "registerTime", term77533);
        setIntField(term77544, term77544.getClass(), "year", 2023);
        setShortField(term77544, term77544.getClass(), "month", (short) 4);
        setShortField(term77544, term77544.getClass(), "day", (short) 2);
        setField(term77543, term77543.getClass(), "date", term77544);
        setByteField(term77548, term77548.getClass(), "hour", (byte) 1);
        setByteField(term77548, term77548.getClass(), "minute", (byte) 39);
        setByteField(term77548, term77548.getClass(), "second", (byte) 47);
        setIntField(term77548, term77548.getClass(), "nano", 89556491);
        setField(term77543, term77543.getClass(), "time", term77548);
        setField(term77517, term77517.getClass(), "accessTime", term77543);
        setField(term77515, term77515.getClass(), "card", term77517);
        setField(term77515, term77515.getClass(), "userName", "SchXFoqYFy");
        setIntField(term77566, term77566.getClass(), "year", 2015);
        setShortField(term77566, term77566.getClass(), "month", (short) 1);
        setShortField(term77566, term77566.getClass(), "day", (short) 20);
        setField(term77565, term77565.getClass(), "date", term77566);
        setByteField(term77570, term77570.getClass(), "hour", (byte) 6);
        setByteField(term77570, term77570.getClass(), "minute", (byte) 8);
        setByteField(term77570, term77570.getClass(), "second", (byte) 2);
        setIntField(term77570, term77570.getClass(), "nano", 595295831);
        setField(term77565, term77565.getClass(), "time", term77570);
        setField(term77515, term77515.getClass(), "lastLoginDate", term77565);
        setBooleanField(term77515, term77515.getClass(), "isWebJoin", true);
        setField(term77515, term77515.getClass(), "webLimitDate", "MnHKbTZBTr");
        setIntField(term77515, term77515.getClass(), "level", -1517420629);
        setIntField(term77515, term77515.getClass(), "reincarnationNum", 910419690);
        setField(term77515, term77515.getClass(), "exp", "xCNDHQZBKx");
        setLongField(term77515, term77515.getClass(), "point", -358904349595052653L);
        setLongField(term77515, term77515.getClass(), "totalPoint", -6117082530291957563L);
        setIntField(term77515, term77515.getClass(), "playCount", 647300506);
        setIntField(term77515, term77515.getClass(), "multiPlayCount", -2110644158);
        setIntField(term77515, term77515.getClass(), "multiWinCount", -354120577);
        setIntField(term77515, term77515.getClass(), "requestResCount", 943350345);
        setIntField(term77515, term77515.getClass(), "acceptResCount", -1526651923);
        setIntField(term77515, term77515.getClass(), "successResCount", -1797724758);
        setIntField(term77515, term77515.getClass(), "playerRating", 2137942105);
        setIntField(term77515, term77515.getClass(), "highestRating", 925222207);
        setIntField(term77515, term77515.getClass(), "nameplateId", 63865718);
        setIntField(term77515, term77515.getClass(), "frameId", 2107786162);
        setIntField(term77515, term77515.getClass(), "characterId", 426605276);
        setIntField(term77515, term77515.getClass(), "trophyId", 814644265);
        setIntField(term77515, term77515.getClass(), "playedTutorialBit", -2072841059);
        setIntField(term77515, term77515.getClass(), "firstTutorialCancelNum", 960614556);
        setIntField(term77515, term77515.getClass(), "masterTutorialCancelNum", 1482016188);
        setIntField(term77515, term77515.getClass(), "totalRepertoireCount", 1240153987);
        setIntField(term77515, term77515.getClass(), "totalMapNum", 126731415);
        setLongField(term77515, term77515.getClass(), "totalHiScore", 8605580628003894246L);
        setLongField(term77515, term77515.getClass(), "totalBasicHighScore", 2742759719072632386L);
        setLongField(term77515, term77515.getClass(), "totalAdvancedHighScore", 8577592614427713625L);
        setLongField(term77515, term77515.getClass(), "totalExpertHighScore", 6370524950953117569L);
        setLongField(term77515, term77515.getClass(), "totalMasterHighScore", 3987997174812419775L);
        setIntField(term77627, term77627.getClass(), "year", 2020);
        setShortField(term77627, term77627.getClass(), "month", (short) 12);
        setShortField(term77627, term77627.getClass(), "day", (short) 3);
        setField(term77626, term77626.getClass(), "date", term77627);
        setByteField(term77631, term77631.getClass(), "hour", (byte) 21);
        setByteField(term77631, term77631.getClass(), "minute", (byte) 9);
        setByteField(term77631, term77631.getClass(), "second", (byte) 18);
        setIntField(term77631, term77631.getClass(), "nano", 913732377);
        setField(term77626, term77626.getClass(), "time", term77631);
        setField(term77515, term77515.getClass(), "eventWatchedDate", term77626);
        setIntField(term77515, term77515.getClass(), "friendCount", -119958532);
        setBooleanField(term77515, term77515.getClass(), "isMaimai", true);
        setField(term77515, term77515.getClass(), "firstGameId", "OfXdotjbuM");
        setField(term77515, term77515.getClass(), "firstRomVersion", "DNkENYBesD");
        setField(term77515, term77515.getClass(), "firstDataVersion", "TSogTVVlxc");
        setIntField(term77675, term77675.getClass(), "year", 2018);
        setShortField(term77675, term77675.getClass(), "month", (short) 12);
        setShortField(term77675, term77675.getClass(), "day", (short) 2);
        setField(term77674, term77674.getClass(), "date", term77675);
        setByteField(term77679, term77679.getClass(), "hour", (byte) 15);
        setByteField(term77679, term77679.getClass(), "minute", (byte) 7);
        setByteField(term77679, term77679.getClass(), "second", (byte) 32);
        setIntField(term77679, term77679.getClass(), "nano", 109301383);
        setField(term77674, term77674.getClass(), "time", term77679);
        setField(term77515, term77515.getClass(), "firstPlayDate", term77674);
        setField(term77515, term77515.getClass(), "lastGameId", "kWEJlReukq");
        setField(term77515, term77515.getClass(), "lastRomVersion", "jkCUxevJxb");
        setField(term77515, term77515.getClass(), "lastDataVersion", "WqobQIRpLc");
        setIntField(term77721, term77721.getClass(), "year", 2017);
        setShortField(term77721, term77721.getClass(), "month", (short) 9);
        setShortField(term77721, term77721.getClass(), "day", (short) 8);
        setField(term77720, term77720.getClass(), "date", term77721);
        setByteField(term77725, term77725.getClass(), "hour", (byte) 6);
        setByteField(term77725, term77725.getClass(), "minute", (byte) 20);
        setByteField(term77725, term77725.getClass(), "second", (byte) 45);
        setIntField(term77725, term77725.getClass(), "nano", 768981890);
        setField(term77720, term77720.getClass(), "time", term77725);
        setField(term77515, term77515.getClass(), "lastPlayDate", term77720);
        setIntField(term77515, term77515.getClass(), "lastPlaceId", -1797813817);
        setField(term77515, term77515.getClass(), "lastPlaceName", "jesZbitPYU");
        setField(term77515, term77515.getClass(), "lastRegionId", "oIbEvXxpda");
        setField(term77515, term77515.getClass(), "lastRegionName", "QyHVDeaOqb");
        setField(term77515, term77515.getClass(), "lastAllNetId", "ZwnEWySrcE");
        setField(term77515, term77515.getClass(), "lastClientId", "laQWfyDqCq");
        setField(term77513, term77513.getClass(), "user", term77515);
        setIntField(term77513, term77513.getClass(), "duelId", 434400926);
        setIntField(term77513, term77513.getClass(), "progress", 2013467659);
        setIntField(term77513, term77513.getClass(), "point", 1671774860);
        setBooleanField(term77513, term77513.getClass(), "isClear", true);
        setIntField(term77796, term77796.getClass(), "year", 2024);
        setShortField(term77796, term77796.getClass(), "month", (short) 7);
        setShortField(term77796, term77796.getClass(), "day", (short) 3);
        setField(term77795, term77795.getClass(), "date", term77796);
        setByteField(term77800, term77800.getClass(), "hour", (byte) 8);
        setByteField(term77800, term77800.getClass(), "minute", (byte) 6);
        setByteField(term77800, term77800.getClass(), "second", (byte) 33);
        setIntField(term77800, term77800.getClass(), "nano", 210450276);
        setField(term77795, term77795.getClass(), "time", term77800);
        setField(term77513, term77513.getClass(), "lastPlayDate", term77795);
        setIntField(term77513, term77513.getClass(), "param1", -1376241623);
        setIntField(term77513, term77513.getClass(), "param2", -949624433);
        setIntField(term77513, term77513.getClass(), "param3", 757298168);
        setIntField(term77513, term77513.getClass(), "param4", 1392304956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term77513, args);
    }

};


