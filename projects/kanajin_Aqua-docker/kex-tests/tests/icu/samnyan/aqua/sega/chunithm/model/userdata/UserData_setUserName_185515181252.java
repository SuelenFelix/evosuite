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

public class UserData_setUserName_185515181252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151581;

    public UserData_setUserName_185515181252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151585 = new Long(-3718250311794019732L);
        term151581 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term151583 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151791 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151581, term151581.getClass(), "id", 7281428481290626426L);
        setLongField(term151583, term151583.getClass(), "id", 5565875410088779184L);
        setField(term151583, term151583.getClass(), "extId", term151585);
        setField(term151583, term151583.getClass(), "luid", "ffLERohsXA");
        setIntField(term151600, term151600.getClass(), "year", 2021);
        setShortField(term151600, term151600.getClass(), "month", (short) 9);
        setShortField(term151600, term151600.getClass(), "day", (short) 3);
        setField(term151599, term151599.getClass(), "date", term151600);
        setByteField(term151604, term151604.getClass(), "hour", (byte) 7);
        setByteField(term151604, term151604.getClass(), "minute", (byte) 47);
        setByteField(term151604, term151604.getClass(), "second", (byte) 7);
        setIntField(term151604, term151604.getClass(), "nano", 101351494);
        setField(term151599, term151599.getClass(), "time", term151604);
        setField(term151583, term151583.getClass(), "registerTime", term151599);
        setIntField(term151610, term151610.getClass(), "year", 2017);
        setShortField(term151610, term151610.getClass(), "month", (short) 6);
        setShortField(term151610, term151610.getClass(), "day", (short) 29);
        setField(term151609, term151609.getClass(), "date", term151610);
        setByteField(term151614, term151614.getClass(), "hour", (byte) 2);
        setByteField(term151614, term151614.getClass(), "minute", (byte) 49);
        setByteField(term151614, term151614.getClass(), "second", (byte) 59);
        setIntField(term151614, term151614.getClass(), "nano", 565727167);
        setField(term151609, term151609.getClass(), "time", term151614);
        setField(term151583, term151583.getClass(), "accessTime", term151609);
        setField(term151581, term151581.getClass(), "card", term151583);
        setField(term151581, term151581.getClass(), "userName", "zMTUAmZToL");
        setIntField(term151632, term151632.getClass(), "year", 2024);
        setShortField(term151632, term151632.getClass(), "month", (short) 5);
        setShortField(term151632, term151632.getClass(), "day", (short) 18);
        setField(term151631, term151631.getClass(), "date", term151632);
        setByteField(term151636, term151636.getClass(), "hour", (byte) 11);
        setByteField(term151636, term151636.getClass(), "minute", (byte) 27);
        setByteField(term151636, term151636.getClass(), "second", (byte) 53);
        setIntField(term151636, term151636.getClass(), "nano", 330770332);
        setField(term151631, term151631.getClass(), "time", term151636);
        setField(term151581, term151581.getClass(), "lastLoginDate", term151631);
        setBooleanField(term151581, term151581.getClass(), "isWebJoin", true);
        setField(term151581, term151581.getClass(), "webLimitDate", "lnDYutrxeh");
        setIntField(term151581, term151581.getClass(), "level", -2088107446);
        setIntField(term151581, term151581.getClass(), "reincarnationNum", 590965528);
        setField(term151581, term151581.getClass(), "exp", "cTHQspxtSw");
        setLongField(term151581, term151581.getClass(), "point", -551041417190456838L);
        setLongField(term151581, term151581.getClass(), "totalPoint", -8928602881850680688L);
        setIntField(term151581, term151581.getClass(), "playCount", -901801526);
        setIntField(term151581, term151581.getClass(), "multiPlayCount", -844430982);
        setIntField(term151581, term151581.getClass(), "multiWinCount", -164393345);
        setIntField(term151581, term151581.getClass(), "requestResCount", 994265990);
        setIntField(term151581, term151581.getClass(), "acceptResCount", 1551328629);
        setIntField(term151581, term151581.getClass(), "successResCount", -967088595);
        setIntField(term151581, term151581.getClass(), "playerRating", 1703596113);
        setIntField(term151581, term151581.getClass(), "highestRating", -1570405490);
        setIntField(term151581, term151581.getClass(), "nameplateId", 2093699918);
        setIntField(term151581, term151581.getClass(), "frameId", -1477783757);
        setIntField(term151581, term151581.getClass(), "characterId", -1106829807);
        setIntField(term151581, term151581.getClass(), "trophyId", 1056213101);
        setIntField(term151581, term151581.getClass(), "playedTutorialBit", 1985766183);
        setIntField(term151581, term151581.getClass(), "firstTutorialCancelNum", -789887248);
        setIntField(term151581, term151581.getClass(), "masterTutorialCancelNum", -833940690);
        setIntField(term151581, term151581.getClass(), "totalRepertoireCount", -202105331);
        setIntField(term151581, term151581.getClass(), "totalMapNum", 1446394868);
        setLongField(term151581, term151581.getClass(), "totalHiScore", -5639249342644786079L);
        setLongField(term151581, term151581.getClass(), "totalBasicHighScore", 6504971121454149515L);
        setLongField(term151581, term151581.getClass(), "totalAdvancedHighScore", -572188774076591835L);
        setLongField(term151581, term151581.getClass(), "totalExpertHighScore", -8345559137009717255L);
        setLongField(term151581, term151581.getClass(), "totalMasterHighScore", -4064620590537281520L);
        setIntField(term151693, term151693.getClass(), "year", 2020);
        setShortField(term151693, term151693.getClass(), "month", (short) 9);
        setShortField(term151693, term151693.getClass(), "day", (short) 13);
        setField(term151692, term151692.getClass(), "date", term151693);
        setByteField(term151697, term151697.getClass(), "hour", (byte) 5);
        setByteField(term151697, term151697.getClass(), "minute", (byte) 31);
        setByteField(term151697, term151697.getClass(), "second", (byte) 18);
        setIntField(term151697, term151697.getClass(), "nano", 54336955);
        setField(term151692, term151692.getClass(), "time", term151697);
        setField(term151581, term151581.getClass(), "eventWatchedDate", term151692);
        setIntField(term151581, term151581.getClass(), "friendCount", -385831603);
        setBooleanField(term151581, term151581.getClass(), "isMaimai", true);
        setField(term151581, term151581.getClass(), "firstGameId", "RkPKoKjNWD");
        setField(term151581, term151581.getClass(), "firstRomVersion", "WWCtVebkwF");
        setField(term151581, term151581.getClass(), "firstDataVersion", "hEqFqciiYC");
        setIntField(term151741, term151741.getClass(), "year", 2020);
        setShortField(term151741, term151741.getClass(), "month", (short) 3);
        setShortField(term151741, term151741.getClass(), "day", (short) 22);
        setField(term151740, term151740.getClass(), "date", term151741);
        setByteField(term151745, term151745.getClass(), "hour", (byte) 15);
        setByteField(term151745, term151745.getClass(), "minute", (byte) 40);
        setByteField(term151745, term151745.getClass(), "second", (byte) 52);
        setIntField(term151745, term151745.getClass(), "nano", 52284588);
        setField(term151740, term151740.getClass(), "time", term151745);
        setField(term151581, term151581.getClass(), "firstPlayDate", term151740);
        setField(term151581, term151581.getClass(), "lastGameId", "kMXoOfTYML");
        setField(term151581, term151581.getClass(), "lastRomVersion", "MXZXoFMvzy");
        setField(term151581, term151581.getClass(), "lastDataVersion", "OKprzLoTRc");
        setIntField(term151787, term151787.getClass(), "year", 2025);
        setShortField(term151787, term151787.getClass(), "month", (short) 5);
        setShortField(term151787, term151787.getClass(), "day", (short) 24);
        setField(term151786, term151786.getClass(), "date", term151787);
        setByteField(term151791, term151791.getClass(), "hour", (byte) 12);
        setByteField(term151791, term151791.getClass(), "minute", (byte) 58);
        setByteField(term151791, term151791.getClass(), "second", (byte) 40);
        setIntField(term151791, term151791.getClass(), "nano", 750691804);
        setField(term151786, term151786.getClass(), "time", term151791);
        setField(term151581, term151581.getClass(), "lastPlayDate", term151786);
        setIntField(term151581, term151581.getClass(), "lastPlaceId", -1896400624);
        setField(term151581, term151581.getClass(), "lastPlaceName", "gnyquIPoBE");
        setField(term151581, term151581.getClass(), "lastRegionId", "Teoezfwsmm");
        setField(term151581, term151581.getClass(), "lastRegionName", "KmAyeYnpeZ");
        setField(term151581, term151581.getClass(), "lastAllNetId", "jPXLhQFRXw");
        setField(term151581, term151581.getClass(), "lastClientId", "awecmBkpdf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JpqRemAQer";
        callMethod(klass, "setUserName", argTypes, term151581, args);
    }

};


