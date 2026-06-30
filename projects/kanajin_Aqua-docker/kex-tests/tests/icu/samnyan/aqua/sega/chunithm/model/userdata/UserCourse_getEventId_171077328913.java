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

public class UserCourse_getEventId_171077328913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919424;

    public UserCourse_getEventId_171077328913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1919430 = new Long(9046663610727775978L);
        term1919424 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1919426 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1919428 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1919444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919590 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919716 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1919424, term1919424.getClass(), "id", -2412586121800182364L);
        setLongField(term1919426, term1919426.getClass(), "id", 7365446937185565662L);
        setLongField(term1919428, term1919428.getClass(), "id", 2319983964471625212L);
        setField(term1919428, term1919428.getClass(), "extId", term1919430);
        setField(term1919428, term1919428.getClass(), "luid", "tBPOULVssY");
        setIntField(term1919445, term1919445.getClass(), "year", 2026);
        setShortField(term1919445, term1919445.getClass(), "month", (short) 8);
        setShortField(term1919445, term1919445.getClass(), "day", (short) 18);
        setField(term1919444, term1919444.getClass(), "date", term1919445);
        setByteField(term1919449, term1919449.getClass(), "hour", (byte) 11);
        setByteField(term1919449, term1919449.getClass(), "minute", (byte) 16);
        setByteField(term1919449, term1919449.getClass(), "second", (byte) 43);
        setIntField(term1919449, term1919449.getClass(), "nano", 55047037);
        setField(term1919444, term1919444.getClass(), "time", term1919449);
        setField(term1919428, term1919428.getClass(), "registerTime", term1919444);
        setIntField(term1919455, term1919455.getClass(), "year", 2026);
        setShortField(term1919455, term1919455.getClass(), "month", (short) 5);
        setShortField(term1919455, term1919455.getClass(), "day", (short) 29);
        setField(term1919454, term1919454.getClass(), "date", term1919455);
        setByteField(term1919459, term1919459.getClass(), "hour", (byte) 8);
        setByteField(term1919459, term1919459.getClass(), "minute", (byte) 21);
        setByteField(term1919459, term1919459.getClass(), "second", (byte) 45);
        setIntField(term1919459, term1919459.getClass(), "nano", 824171270);
        setField(term1919454, term1919454.getClass(), "time", term1919459);
        setField(term1919428, term1919428.getClass(), "accessTime", term1919454);
        setField(term1919426, term1919426.getClass(), "card", term1919428);
        setField(term1919426, term1919426.getClass(), "userName", "UmVsfWPXkK");
        setIntField(term1919477, term1919477.getClass(), "year", 2028);
        setShortField(term1919477, term1919477.getClass(), "month", (short) 3);
        setShortField(term1919477, term1919477.getClass(), "day", (short) 8);
        setField(term1919476, term1919476.getClass(), "date", term1919477);
        setByteField(term1919481, term1919481.getClass(), "hour", (byte) 16);
        setByteField(term1919481, term1919481.getClass(), "minute", (byte) 12);
        setByteField(term1919481, term1919481.getClass(), "second", (byte) 16);
        setIntField(term1919481, term1919481.getClass(), "nano", 494033967);
        setField(term1919476, term1919476.getClass(), "time", term1919481);
        setField(term1919426, term1919426.getClass(), "lastLoginDate", term1919476);
        setBooleanField(term1919426, term1919426.getClass(), "isWebJoin", false);
        setField(term1919426, term1919426.getClass(), "webLimitDate", "umxepoLkLf");
        setIntField(term1919426, term1919426.getClass(), "level", 1676503989);
        setIntField(term1919426, term1919426.getClass(), "reincarnationNum", -1194058737);
        setField(term1919426, term1919426.getClass(), "exp", "BmNrAkjtiR");
        setLongField(term1919426, term1919426.getClass(), "point", -799874193187532720L);
        setLongField(term1919426, term1919426.getClass(), "totalPoint", 659509031251553792L);
        setIntField(term1919426, term1919426.getClass(), "playCount", -1844751993);
        setIntField(term1919426, term1919426.getClass(), "multiPlayCount", 567569157);
        setIntField(term1919426, term1919426.getClass(), "multiWinCount", -1508070893);
        setIntField(term1919426, term1919426.getClass(), "requestResCount", -699978989);
        setIntField(term1919426, term1919426.getClass(), "acceptResCount", 1112782958);
        setIntField(term1919426, term1919426.getClass(), "successResCount", 896839792);
        setIntField(term1919426, term1919426.getClass(), "playerRating", -1131263165);
        setIntField(term1919426, term1919426.getClass(), "highestRating", 1214404845);
        setIntField(term1919426, term1919426.getClass(), "nameplateId", 1925427861);
        setIntField(term1919426, term1919426.getClass(), "frameId", 782627359);
        setIntField(term1919426, term1919426.getClass(), "characterId", 588801361);
        setIntField(term1919426, term1919426.getClass(), "trophyId", 1512331963);
        setIntField(term1919426, term1919426.getClass(), "playedTutorialBit", 1225803513);
        setIntField(term1919426, term1919426.getClass(), "firstTutorialCancelNum", -1367659676);
        setIntField(term1919426, term1919426.getClass(), "masterTutorialCancelNum", 1759918124);
        setIntField(term1919426, term1919426.getClass(), "totalRepertoireCount", -1078263693);
        setIntField(term1919426, term1919426.getClass(), "totalMapNum", -265322269);
        setLongField(term1919426, term1919426.getClass(), "totalHiScore", -3980488481688564646L);
        setLongField(term1919426, term1919426.getClass(), "totalBasicHighScore", -4337735521321135592L);
        setLongField(term1919426, term1919426.getClass(), "totalAdvancedHighScore", -7435459539719612441L);
        setLongField(term1919426, term1919426.getClass(), "totalExpertHighScore", -2608433523049850407L);
        setLongField(term1919426, term1919426.getClass(), "totalMasterHighScore", -4912880698118115909L);
        setIntField(term1919538, term1919538.getClass(), "year", 2011);
        setShortField(term1919538, term1919538.getClass(), "month", (short) 6);
        setShortField(term1919538, term1919538.getClass(), "day", (short) 26);
        setField(term1919537, term1919537.getClass(), "date", term1919538);
        setByteField(term1919542, term1919542.getClass(), "hour", (byte) 4);
        setByteField(term1919542, term1919542.getClass(), "minute", (byte) 27);
        setByteField(term1919542, term1919542.getClass(), "second", (byte) 29);
        setIntField(term1919542, term1919542.getClass(), "nano", 701151059);
        setField(term1919537, term1919537.getClass(), "time", term1919542);
        setField(term1919426, term1919426.getClass(), "eventWatchedDate", term1919537);
        setIntField(term1919426, term1919426.getClass(), "friendCount", 1381870986);
        setBooleanField(term1919426, term1919426.getClass(), "isMaimai", false);
        setField(term1919426, term1919426.getClass(), "firstGameId", "VUiEKzLkCk");
        setField(term1919426, term1919426.getClass(), "firstRomVersion", "okBCAtbfGq");
        setField(term1919426, term1919426.getClass(), "firstDataVersion", "itlDXDnDKg");
        setIntField(term1919586, term1919586.getClass(), "year", 2022);
        setShortField(term1919586, term1919586.getClass(), "month", (short) 9);
        setShortField(term1919586, term1919586.getClass(), "day", (short) 26);
        setField(term1919585, term1919585.getClass(), "date", term1919586);
        setByteField(term1919590, term1919590.getClass(), "hour", (byte) 20);
        setByteField(term1919590, term1919590.getClass(), "minute", (byte) 40);
        setByteField(term1919590, term1919590.getClass(), "second", (byte) 11);
        setIntField(term1919590, term1919590.getClass(), "nano", 664343006);
        setField(term1919585, term1919585.getClass(), "time", term1919590);
        setField(term1919426, term1919426.getClass(), "firstPlayDate", term1919585);
        setField(term1919426, term1919426.getClass(), "lastGameId", "UcRbqwEGfh");
        setField(term1919426, term1919426.getClass(), "lastRomVersion", "LMbKpLhlCP");
        setField(term1919426, term1919426.getClass(), "lastDataVersion", "pNPakBFtLk");
        setIntField(term1919632, term1919632.getClass(), "year", 2020);
        setShortField(term1919632, term1919632.getClass(), "month", (short) 2);
        setShortField(term1919632, term1919632.getClass(), "day", (short) 21);
        setField(term1919631, term1919631.getClass(), "date", term1919632);
        setByteField(term1919636, term1919636.getClass(), "hour", (byte) 15);
        setByteField(term1919636, term1919636.getClass(), "minute", (byte) 57);
        setByteField(term1919636, term1919636.getClass(), "second", (byte) 20);
        setIntField(term1919636, term1919636.getClass(), "nano", 353611380);
        setField(term1919631, term1919631.getClass(), "time", term1919636);
        setField(term1919426, term1919426.getClass(), "lastPlayDate", term1919631);
        setIntField(term1919426, term1919426.getClass(), "lastPlaceId", 144753033);
        setField(term1919426, term1919426.getClass(), "lastPlaceName", "UbxUwRBqPl");
        setField(term1919426, term1919426.getClass(), "lastRegionId", "FIUluDTEUk");
        setField(term1919426, term1919426.getClass(), "lastRegionName", "tFFAMHJDJh");
        setField(term1919426, term1919426.getClass(), "lastAllNetId", "VCnDyzwOGj");
        setField(term1919426, term1919426.getClass(), "lastClientId", "anHrgZUfOK");
        setField(term1919424, term1919424.getClass(), "user", term1919426);
        setIntField(term1919424, term1919424.getClass(), "courseId", 567346416);
        setIntField(term1919424, term1919424.getClass(), "classId", -69468052);
        setIntField(term1919424, term1919424.getClass(), "playCount", -124239867);
        setIntField(term1919424, term1919424.getClass(), "scoreMax", 1584802568);
        setBooleanField(term1919424, term1919424.getClass(), "isFullCombo", false);
        setBooleanField(term1919424, term1919424.getClass(), "isAllJustice", true);
        setBooleanField(term1919424, term1919424.getClass(), "isSuccess", false);
        setIntField(term1919424, term1919424.getClass(), "scoreRank", 1298156365);
        setIntField(term1919424, term1919424.getClass(), "eventId", 161648450);
        setIntField(term1919712, term1919712.getClass(), "year", 2029);
        setShortField(term1919712, term1919712.getClass(), "month", (short) 6);
        setShortField(term1919712, term1919712.getClass(), "day", (short) 10);
        setField(term1919711, term1919711.getClass(), "date", term1919712);
        setByteField(term1919716, term1919716.getClass(), "hour", (byte) 5);
        setByteField(term1919716, term1919716.getClass(), "minute", (byte) 27);
        setByteField(term1919716, term1919716.getClass(), "second", (byte) 11);
        setIntField(term1919716, term1919716.getClass(), "nano", 441533289);
        setField(term1919711, term1919711.getClass(), "time", term1919716);
        setField(term1919424, term1919424.getClass(), "lastPlayDate", term1919711);
        setIntField(term1919424, term1919424.getClass(), "param1", -1552445462);
        setIntField(term1919424, term1919424.getClass(), "param2", -671123820);
        setIntField(term1919424, term1919424.getClass(), "param3", -69591690);
        setIntField(term1919424, term1919424.getClass(), "param4", 716029355);
        setBooleanField(term1919424, term1919424.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term1919424, args);
    }

};


