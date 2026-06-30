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

public class UserData_setFirstRomVersion_189932063887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166657;

    public UserData_setFirstRomVersion_189932063887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166661 = new Long(-2195061939206930224L);
        term166657 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term166659 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166867 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166657, term166657.getClass(), "id", -2046751618441507359L);
        setLongField(term166659, term166659.getClass(), "id", -256653518357663585L);
        setField(term166659, term166659.getClass(), "extId", term166661);
        setField(term166659, term166659.getClass(), "luid", "uILgJuNCYC");
        setIntField(term166676, term166676.getClass(), "year", 2014);
        setShortField(term166676, term166676.getClass(), "month", (short) 7);
        setShortField(term166676, term166676.getClass(), "day", (short) 24);
        setField(term166675, term166675.getClass(), "date", term166676);
        setByteField(term166680, term166680.getClass(), "hour", (byte) 21);
        setByteField(term166680, term166680.getClass(), "minute", (byte) 45);
        setByteField(term166680, term166680.getClass(), "second", (byte) 49);
        setIntField(term166680, term166680.getClass(), "nano", 183616052);
        setField(term166675, term166675.getClass(), "time", term166680);
        setField(term166659, term166659.getClass(), "registerTime", term166675);
        setIntField(term166686, term166686.getClass(), "year", 2027);
        setShortField(term166686, term166686.getClass(), "month", (short) 12);
        setShortField(term166686, term166686.getClass(), "day", (short) 17);
        setField(term166685, term166685.getClass(), "date", term166686);
        setByteField(term166690, term166690.getClass(), "hour", (byte) 18);
        setByteField(term166690, term166690.getClass(), "minute", (byte) 50);
        setByteField(term166690, term166690.getClass(), "second", (byte) 59);
        setIntField(term166690, term166690.getClass(), "nano", 871347822);
        setField(term166685, term166685.getClass(), "time", term166690);
        setField(term166659, term166659.getClass(), "accessTime", term166685);
        setField(term166657, term166657.getClass(), "card", term166659);
        setField(term166657, term166657.getClass(), "userName", "gUkbWFfDwB");
        setIntField(term166708, term166708.getClass(), "year", 2013);
        setShortField(term166708, term166708.getClass(), "month", (short) 6);
        setShortField(term166708, term166708.getClass(), "day", (short) 8);
        setField(term166707, term166707.getClass(), "date", term166708);
        setByteField(term166712, term166712.getClass(), "hour", (byte) 16);
        setByteField(term166712, term166712.getClass(), "minute", (byte) 27);
        setByteField(term166712, term166712.getClass(), "second", (byte) 8);
        setIntField(term166712, term166712.getClass(), "nano", 97313704);
        setField(term166707, term166707.getClass(), "time", term166712);
        setField(term166657, term166657.getClass(), "lastLoginDate", term166707);
        setBooleanField(term166657, term166657.getClass(), "isWebJoin", true);
        setField(term166657, term166657.getClass(), "webLimitDate", "kTamONbRjQ");
        setIntField(term166657, term166657.getClass(), "level", 69514589);
        setIntField(term166657, term166657.getClass(), "reincarnationNum", 1016576703);
        setField(term166657, term166657.getClass(), "exp", "hGULbvEJOJ");
        setLongField(term166657, term166657.getClass(), "point", 6001930553633799759L);
        setLongField(term166657, term166657.getClass(), "totalPoint", 256887861773960063L);
        setIntField(term166657, term166657.getClass(), "playCount", -1816990337);
        setIntField(term166657, term166657.getClass(), "multiPlayCount", -729317472);
        setIntField(term166657, term166657.getClass(), "multiWinCount", 518527887);
        setIntField(term166657, term166657.getClass(), "requestResCount", 1621425751);
        setIntField(term166657, term166657.getClass(), "acceptResCount", 1649760237);
        setIntField(term166657, term166657.getClass(), "successResCount", 1188626740);
        setIntField(term166657, term166657.getClass(), "playerRating", -114111309);
        setIntField(term166657, term166657.getClass(), "highestRating", -2138943082);
        setIntField(term166657, term166657.getClass(), "nameplateId", -186268116);
        setIntField(term166657, term166657.getClass(), "frameId", -2082248803);
        setIntField(term166657, term166657.getClass(), "characterId", -1705126082);
        setIntField(term166657, term166657.getClass(), "trophyId", -720862130);
        setIntField(term166657, term166657.getClass(), "playedTutorialBit", 1070677067);
        setIntField(term166657, term166657.getClass(), "firstTutorialCancelNum", -2011581334);
        setIntField(term166657, term166657.getClass(), "masterTutorialCancelNum", 1700393240);
        setIntField(term166657, term166657.getClass(), "totalRepertoireCount", -2014947462);
        setIntField(term166657, term166657.getClass(), "totalMapNum", -719658316);
        setLongField(term166657, term166657.getClass(), "totalHiScore", 3134594715337882016L);
        setLongField(term166657, term166657.getClass(), "totalBasicHighScore", 844984809649867261L);
        setLongField(term166657, term166657.getClass(), "totalAdvancedHighScore", -5005897600184422009L);
        setLongField(term166657, term166657.getClass(), "totalExpertHighScore", -6725278387251669076L);
        setLongField(term166657, term166657.getClass(), "totalMasterHighScore", -7749915504733119858L);
        setIntField(term166769, term166769.getClass(), "year", 2015);
        setShortField(term166769, term166769.getClass(), "month", (short) 2);
        setShortField(term166769, term166769.getClass(), "day", (short) 3);
        setField(term166768, term166768.getClass(), "date", term166769);
        setByteField(term166773, term166773.getClass(), "hour", (byte) 17);
        setByteField(term166773, term166773.getClass(), "minute", (byte) 5);
        setByteField(term166773, term166773.getClass(), "second", (byte) 41);
        setIntField(term166773, term166773.getClass(), "nano", 281032591);
        setField(term166768, term166768.getClass(), "time", term166773);
        setField(term166657, term166657.getClass(), "eventWatchedDate", term166768);
        setIntField(term166657, term166657.getClass(), "friendCount", 303187441);
        setBooleanField(term166657, term166657.getClass(), "isMaimai", true);
        setField(term166657, term166657.getClass(), "firstGameId", "mHRhpRdJAm");
        setField(term166657, term166657.getClass(), "firstRomVersion", "JPPiPXJaoa");
        setField(term166657, term166657.getClass(), "firstDataVersion", "fGLEhwmSAi");
        setIntField(term166817, term166817.getClass(), "year", 2022);
        setShortField(term166817, term166817.getClass(), "month", (short) 8);
        setShortField(term166817, term166817.getClass(), "day", (short) 25);
        setField(term166816, term166816.getClass(), "date", term166817);
        setByteField(term166821, term166821.getClass(), "hour", (byte) 22);
        setByteField(term166821, term166821.getClass(), "minute", (byte) 7);
        setByteField(term166821, term166821.getClass(), "second", (byte) 45);
        setIntField(term166821, term166821.getClass(), "nano", 471182430);
        setField(term166816, term166816.getClass(), "time", term166821);
        setField(term166657, term166657.getClass(), "firstPlayDate", term166816);
        setField(term166657, term166657.getClass(), "lastGameId", "oBoeDHJtuf");
        setField(term166657, term166657.getClass(), "lastRomVersion", "NVbdJpwYOX");
        setField(term166657, term166657.getClass(), "lastDataVersion", "zDqikHgSHj");
        setIntField(term166863, term166863.getClass(), "year", 2018);
        setShortField(term166863, term166863.getClass(), "month", (short) 12);
        setShortField(term166863, term166863.getClass(), "day", (short) 5);
        setField(term166862, term166862.getClass(), "date", term166863);
        setByteField(term166867, term166867.getClass(), "hour", (byte) 14);
        setByteField(term166867, term166867.getClass(), "minute", (byte) 51);
        setByteField(term166867, term166867.getClass(), "second", (byte) 2);
        setIntField(term166867, term166867.getClass(), "nano", 124646423);
        setField(term166862, term166862.getClass(), "time", term166867);
        setField(term166657, term166657.getClass(), "lastPlayDate", term166862);
        setIntField(term166657, term166657.getClass(), "lastPlaceId", -1129294722);
        setField(term166657, term166657.getClass(), "lastPlaceName", "JwEjJzczOl");
        setField(term166657, term166657.getClass(), "lastRegionId", "FsIwpRCskv");
        setField(term166657, term166657.getClass(), "lastRegionName", "tuIzCHeOzK");
        setField(term166657, term166657.getClass(), "lastAllNetId", "czPFpmmjeR");
        setField(term166657, term166657.getClass(), "lastClientId", "iwjGXKxveT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nShYXXfNhZ";
        callMethod(klass, "setFirstRomVersion", argTypes, term166657, args);
    }

};


