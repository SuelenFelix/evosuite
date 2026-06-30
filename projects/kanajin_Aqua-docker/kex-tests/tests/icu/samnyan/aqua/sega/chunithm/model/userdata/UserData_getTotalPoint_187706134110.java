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

public class UserData_getTotalPoint_187706134110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133641;

    public UserData_getTotalPoint_187706134110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133645 = new Long(2209808079059619773L);
        term133641 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term133643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133851 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133641, term133641.getClass(), "id", -5299004755000484571L);
        setLongField(term133643, term133643.getClass(), "id", -1308506010473990942L);
        setField(term133643, term133643.getClass(), "extId", term133645);
        setField(term133643, term133643.getClass(), "luid", "fxACzuCTdG");
        setIntField(term133660, term133660.getClass(), "year", 2014);
        setShortField(term133660, term133660.getClass(), "month", (short) 8);
        setShortField(term133660, term133660.getClass(), "day", (short) 14);
        setField(term133659, term133659.getClass(), "date", term133660);
        setByteField(term133664, term133664.getClass(), "hour", (byte) 7);
        setByteField(term133664, term133664.getClass(), "minute", (byte) 13);
        setByteField(term133664, term133664.getClass(), "second", (byte) 55);
        setIntField(term133664, term133664.getClass(), "nano", 81566526);
        setField(term133659, term133659.getClass(), "time", term133664);
        setField(term133643, term133643.getClass(), "registerTime", term133659);
        setIntField(term133670, term133670.getClass(), "year", 2025);
        setShortField(term133670, term133670.getClass(), "month", (short) 7);
        setShortField(term133670, term133670.getClass(), "day", (short) 2);
        setField(term133669, term133669.getClass(), "date", term133670);
        setByteField(term133674, term133674.getClass(), "hour", (byte) 16);
        setByteField(term133674, term133674.getClass(), "minute", (byte) 12);
        setByteField(term133674, term133674.getClass(), "second", (byte) 51);
        setIntField(term133674, term133674.getClass(), "nano", 833941622);
        setField(term133669, term133669.getClass(), "time", term133674);
        setField(term133643, term133643.getClass(), "accessTime", term133669);
        setField(term133641, term133641.getClass(), "card", term133643);
        setField(term133641, term133641.getClass(), "userName", "ZbjykDvTqF");
        setIntField(term133692, term133692.getClass(), "year", 2017);
        setShortField(term133692, term133692.getClass(), "month", (short) 1);
        setShortField(term133692, term133692.getClass(), "day", (short) 15);
        setField(term133691, term133691.getClass(), "date", term133692);
        setByteField(term133696, term133696.getClass(), "hour", (byte) 8);
        setByteField(term133696, term133696.getClass(), "minute", (byte) 47);
        setByteField(term133696, term133696.getClass(), "second", (byte) 25);
        setIntField(term133696, term133696.getClass(), "nano", 337248129);
        setField(term133691, term133691.getClass(), "time", term133696);
        setField(term133641, term133641.getClass(), "lastLoginDate", term133691);
        setBooleanField(term133641, term133641.getClass(), "isWebJoin", true);
        setField(term133641, term133641.getClass(), "webLimitDate", "HmpRVfDNrn");
        setIntField(term133641, term133641.getClass(), "level", -1153409944);
        setIntField(term133641, term133641.getClass(), "reincarnationNum", 1063281217);
        setField(term133641, term133641.getClass(), "exp", "PdGPETcyXN");
        setLongField(term133641, term133641.getClass(), "point", -665107459568416177L);
        setLongField(term133641, term133641.getClass(), "totalPoint", 3591499275146847847L);
        setIntField(term133641, term133641.getClass(), "playCount", 981222791);
        setIntField(term133641, term133641.getClass(), "multiPlayCount", 1297362786);
        setIntField(term133641, term133641.getClass(), "multiWinCount", -1701558271);
        setIntField(term133641, term133641.getClass(), "requestResCount", 1777553175);
        setIntField(term133641, term133641.getClass(), "acceptResCount", 1321016655);
        setIntField(term133641, term133641.getClass(), "successResCount", -893412167);
        setIntField(term133641, term133641.getClass(), "playerRating", 985381114);
        setIntField(term133641, term133641.getClass(), "highestRating", 2091907097);
        setIntField(term133641, term133641.getClass(), "nameplateId", 589633036);
        setIntField(term133641, term133641.getClass(), "frameId", 608454583);
        setIntField(term133641, term133641.getClass(), "characterId", -117720047);
        setIntField(term133641, term133641.getClass(), "trophyId", -892566680);
        setIntField(term133641, term133641.getClass(), "playedTutorialBit", 1674142259);
        setIntField(term133641, term133641.getClass(), "firstTutorialCancelNum", -1303208102);
        setIntField(term133641, term133641.getClass(), "masterTutorialCancelNum", 1957563972);
        setIntField(term133641, term133641.getClass(), "totalRepertoireCount", -193596012);
        setIntField(term133641, term133641.getClass(), "totalMapNum", 919991978);
        setLongField(term133641, term133641.getClass(), "totalHiScore", -5231606455063875658L);
        setLongField(term133641, term133641.getClass(), "totalBasicHighScore", 5950326011535693672L);
        setLongField(term133641, term133641.getClass(), "totalAdvancedHighScore", -4168034609438407222L);
        setLongField(term133641, term133641.getClass(), "totalExpertHighScore", 7887665640871011024L);
        setLongField(term133641, term133641.getClass(), "totalMasterHighScore", 455038202248039323L);
        setIntField(term133753, term133753.getClass(), "year", 2028);
        setShortField(term133753, term133753.getClass(), "month", (short) 2);
        setShortField(term133753, term133753.getClass(), "day", (short) 27);
        setField(term133752, term133752.getClass(), "date", term133753);
        setByteField(term133757, term133757.getClass(), "hour", (byte) 2);
        setByteField(term133757, term133757.getClass(), "minute", (byte) 5);
        setByteField(term133757, term133757.getClass(), "second", (byte) 39);
        setIntField(term133757, term133757.getClass(), "nano", 353732819);
        setField(term133752, term133752.getClass(), "time", term133757);
        setField(term133641, term133641.getClass(), "eventWatchedDate", term133752);
        setIntField(term133641, term133641.getClass(), "friendCount", -240870307);
        setBooleanField(term133641, term133641.getClass(), "isMaimai", false);
        setField(term133641, term133641.getClass(), "firstGameId", "rWXLyvesHI");
        setField(term133641, term133641.getClass(), "firstRomVersion", "iRfJJNrMLZ");
        setField(term133641, term133641.getClass(), "firstDataVersion", "sYrnlJNHsq");
        setIntField(term133801, term133801.getClass(), "year", 2012);
        setShortField(term133801, term133801.getClass(), "month", (short) 7);
        setShortField(term133801, term133801.getClass(), "day", (short) 25);
        setField(term133800, term133800.getClass(), "date", term133801);
        setByteField(term133805, term133805.getClass(), "hour", (byte) 10);
        setByteField(term133805, term133805.getClass(), "minute", (byte) 47);
        setByteField(term133805, term133805.getClass(), "second", (byte) 40);
        setIntField(term133805, term133805.getClass(), "nano", 235079109);
        setField(term133800, term133800.getClass(), "time", term133805);
        setField(term133641, term133641.getClass(), "firstPlayDate", term133800);
        setField(term133641, term133641.getClass(), "lastGameId", "POHTKvZAAU");
        setField(term133641, term133641.getClass(), "lastRomVersion", "HSQaALDFNu");
        setField(term133641, term133641.getClass(), "lastDataVersion", "aOaXBQyJal");
        setIntField(term133847, term133847.getClass(), "year", 2014);
        setShortField(term133847, term133847.getClass(), "month", (short) 5);
        setShortField(term133847, term133847.getClass(), "day", (short) 7);
        setField(term133846, term133846.getClass(), "date", term133847);
        setByteField(term133851, term133851.getClass(), "hour", (byte) 3);
        setByteField(term133851, term133851.getClass(), "minute", (byte) 29);
        setByteField(term133851, term133851.getClass(), "second", (byte) 53);
        setIntField(term133851, term133851.getClass(), "nano", 601925853);
        setField(term133846, term133846.getClass(), "time", term133851);
        setField(term133641, term133641.getClass(), "lastPlayDate", term133846);
        setIntField(term133641, term133641.getClass(), "lastPlaceId", -812476026);
        setField(term133641, term133641.getClass(), "lastPlaceName", "vRbigVGnNS");
        setField(term133641, term133641.getClass(), "lastRegionId", "bVteGrLeFP");
        setField(term133641, term133641.getClass(), "lastRegionName", "LLVxzGZuym");
        setField(term133641, term133641.getClass(), "lastAllNetId", "FHWZKmPKlK");
        setField(term133641, term133641.getClass(), "lastClientId", "MqWvZIWxCr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term133641, args);
    }

};


