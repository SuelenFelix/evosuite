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

public class UserData_setFirstGameId_136525114386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166209;

    public UserData_setFirstGameId_136525114386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166213 = new Long(-8398381579707958144L);
        term166209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term166211 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166209, term166209.getClass(), "id", 1673521388331739069L);
        setLongField(term166211, term166211.getClass(), "id", -7531495309331019558L);
        setField(term166211, term166211.getClass(), "extId", term166213);
        setField(term166211, term166211.getClass(), "luid", "HOgLdEUbNT");
        setIntField(term166228, term166228.getClass(), "year", 2018);
        setShortField(term166228, term166228.getClass(), "month", (short) 5);
        setShortField(term166228, term166228.getClass(), "day", (short) 18);
        setField(term166227, term166227.getClass(), "date", term166228);
        setByteField(term166232, term166232.getClass(), "hour", (byte) 11);
        setByteField(term166232, term166232.getClass(), "minute", (byte) 54);
        setByteField(term166232, term166232.getClass(), "second", (byte) 37);
        setIntField(term166232, term166232.getClass(), "nano", 531132326);
        setField(term166227, term166227.getClass(), "time", term166232);
        setField(term166211, term166211.getClass(), "registerTime", term166227);
        setIntField(term166238, term166238.getClass(), "year", 2013);
        setShortField(term166238, term166238.getClass(), "month", (short) 6);
        setShortField(term166238, term166238.getClass(), "day", (short) 19);
        setField(term166237, term166237.getClass(), "date", term166238);
        setByteField(term166242, term166242.getClass(), "hour", (byte) 23);
        setByteField(term166242, term166242.getClass(), "minute", (byte) 40);
        setByteField(term166242, term166242.getClass(), "second", (byte) 55);
        setIntField(term166242, term166242.getClass(), "nano", 112344231);
        setField(term166237, term166237.getClass(), "time", term166242);
        setField(term166211, term166211.getClass(), "accessTime", term166237);
        setField(term166209, term166209.getClass(), "card", term166211);
        setField(term166209, term166209.getClass(), "userName", "eZTceUbJqy");
        setIntField(term166260, term166260.getClass(), "year", 2024);
        setShortField(term166260, term166260.getClass(), "month", (short) 4);
        setShortField(term166260, term166260.getClass(), "day", (short) 7);
        setField(term166259, term166259.getClass(), "date", term166260);
        setByteField(term166264, term166264.getClass(), "hour", (byte) 8);
        setByteField(term166264, term166264.getClass(), "minute", (byte) 48);
        setByteField(term166264, term166264.getClass(), "second", (byte) 54);
        setIntField(term166264, term166264.getClass(), "nano", 390915466);
        setField(term166259, term166259.getClass(), "time", term166264);
        setField(term166209, term166209.getClass(), "lastLoginDate", term166259);
        setBooleanField(term166209, term166209.getClass(), "isWebJoin", true);
        setField(term166209, term166209.getClass(), "webLimitDate", "yEnSWDaebl");
        setIntField(term166209, term166209.getClass(), "level", 822645894);
        setIntField(term166209, term166209.getClass(), "reincarnationNum", -1570295297);
        setField(term166209, term166209.getClass(), "exp", "FFHmFKyEmP");
        setLongField(term166209, term166209.getClass(), "point", -2699593118451160322L);
        setLongField(term166209, term166209.getClass(), "totalPoint", 8882961437534648338L);
        setIntField(term166209, term166209.getClass(), "playCount", 823152755);
        setIntField(term166209, term166209.getClass(), "multiPlayCount", 929229690);
        setIntField(term166209, term166209.getClass(), "multiWinCount", -454507797);
        setIntField(term166209, term166209.getClass(), "requestResCount", 304461972);
        setIntField(term166209, term166209.getClass(), "acceptResCount", 907796752);
        setIntField(term166209, term166209.getClass(), "successResCount", -1758084707);
        setIntField(term166209, term166209.getClass(), "playerRating", -1982548161);
        setIntField(term166209, term166209.getClass(), "highestRating", 1329279958);
        setIntField(term166209, term166209.getClass(), "nameplateId", 469543205);
        setIntField(term166209, term166209.getClass(), "frameId", -12516056);
        setIntField(term166209, term166209.getClass(), "characterId", 1697090986);
        setIntField(term166209, term166209.getClass(), "trophyId", -1830375526);
        setIntField(term166209, term166209.getClass(), "playedTutorialBit", 936265526);
        setIntField(term166209, term166209.getClass(), "firstTutorialCancelNum", -495686058);
        setIntField(term166209, term166209.getClass(), "masterTutorialCancelNum", 611713058);
        setIntField(term166209, term166209.getClass(), "totalRepertoireCount", -1354326923);
        setIntField(term166209, term166209.getClass(), "totalMapNum", -986698677);
        setLongField(term166209, term166209.getClass(), "totalHiScore", 4036743295367021645L);
        setLongField(term166209, term166209.getClass(), "totalBasicHighScore", 9002973165154424650L);
        setLongField(term166209, term166209.getClass(), "totalAdvancedHighScore", 4330983022024825820L);
        setLongField(term166209, term166209.getClass(), "totalExpertHighScore", 5824690013848082553L);
        setLongField(term166209, term166209.getClass(), "totalMasterHighScore", 5038298513906018396L);
        setIntField(term166321, term166321.getClass(), "year", 2014);
        setShortField(term166321, term166321.getClass(), "month", (short) 10);
        setShortField(term166321, term166321.getClass(), "day", (short) 5);
        setField(term166320, term166320.getClass(), "date", term166321);
        setByteField(term166325, term166325.getClass(), "hour", (byte) 14);
        setByteField(term166325, term166325.getClass(), "minute", (byte) 46);
        setByteField(term166325, term166325.getClass(), "second", (byte) 9);
        setIntField(term166325, term166325.getClass(), "nano", 375897501);
        setField(term166320, term166320.getClass(), "time", term166325);
        setField(term166209, term166209.getClass(), "eventWatchedDate", term166320);
        setIntField(term166209, term166209.getClass(), "friendCount", -1381534227);
        setBooleanField(term166209, term166209.getClass(), "isMaimai", true);
        setField(term166209, term166209.getClass(), "firstGameId", "tmsApOAQNP");
        setField(term166209, term166209.getClass(), "firstRomVersion", "vrdvjbZtaY");
        setField(term166209, term166209.getClass(), "firstDataVersion", "GDxmXDNVsL");
        setIntField(term166369, term166369.getClass(), "year", 2024);
        setShortField(term166369, term166369.getClass(), "month", (short) 8);
        setShortField(term166369, term166369.getClass(), "day", (short) 4);
        setField(term166368, term166368.getClass(), "date", term166369);
        setByteField(term166373, term166373.getClass(), "hour", (byte) 6);
        setByteField(term166373, term166373.getClass(), "minute", (byte) 6);
        setByteField(term166373, term166373.getClass(), "second", (byte) 57);
        setIntField(term166373, term166373.getClass(), "nano", 81454027);
        setField(term166368, term166368.getClass(), "time", term166373);
        setField(term166209, term166209.getClass(), "firstPlayDate", term166368);
        setField(term166209, term166209.getClass(), "lastGameId", "ipYdeymslj");
        setField(term166209, term166209.getClass(), "lastRomVersion", "QFMCLCOTms");
        setField(term166209, term166209.getClass(), "lastDataVersion", "jCtiggtCcS");
        setIntField(term166415, term166415.getClass(), "year", 2026);
        setShortField(term166415, term166415.getClass(), "month", (short) 4);
        setShortField(term166415, term166415.getClass(), "day", (short) 11);
        setField(term166414, term166414.getClass(), "date", term166415);
        setByteField(term166419, term166419.getClass(), "hour", (byte) 13);
        setByteField(term166419, term166419.getClass(), "minute", (byte) 36);
        setByteField(term166419, term166419.getClass(), "second", (byte) 25);
        setIntField(term166419, term166419.getClass(), "nano", 92098980);
        setField(term166414, term166414.getClass(), "time", term166419);
        setField(term166209, term166209.getClass(), "lastPlayDate", term166414);
        setIntField(term166209, term166209.getClass(), "lastPlaceId", -115921884);
        setField(term166209, term166209.getClass(), "lastPlaceName", "HTPoLdgdlc");
        setField(term166209, term166209.getClass(), "lastRegionId", "gQbWOQsNZq");
        setField(term166209, term166209.getClass(), "lastRegionName", "gwXrkdkdqW");
        setField(term166209, term166209.getClass(), "lastAllNetId", "ePMStkWVSW");
        setField(term166209, term166209.getClass(), "lastClientId", "lYCXiqdVVs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AwEMMAveFP";
        callMethod(klass, "setFirstGameId", argTypes, term166209, args);
    }

};


