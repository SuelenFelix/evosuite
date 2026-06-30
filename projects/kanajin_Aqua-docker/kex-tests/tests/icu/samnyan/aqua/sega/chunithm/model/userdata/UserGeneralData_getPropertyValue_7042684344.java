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

public class UserGeneralData_getPropertyValue_7042684344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304383;

    public UserGeneralData_getPropertyValue_7042684344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term304389 = new Long(8699742215739444902L);
        term304383 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term304385 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term304387 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term304403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304501 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term304383, term304383.getClass(), "id", -4442651502268555941L);
        setLongField(term304385, term304385.getClass(), "id", -488792094823193838L);
        setLongField(term304387, term304387.getClass(), "id", 8303052489803253713L);
        setField(term304387, term304387.getClass(), "extId", term304389);
        setField(term304387, term304387.getClass(), "luid", "cDCGHIFISc");
        setIntField(term304404, term304404.getClass(), "year", 2020);
        setShortField(term304404, term304404.getClass(), "month", (short) 7);
        setShortField(term304404, term304404.getClass(), "day", (short) 7);
        setField(term304403, term304403.getClass(), "date", term304404);
        setByteField(term304408, term304408.getClass(), "hour", (byte) 4);
        setByteField(term304408, term304408.getClass(), "minute", (byte) 14);
        setByteField(term304408, term304408.getClass(), "second", (byte) 50);
        setIntField(term304408, term304408.getClass(), "nano", 325917169);
        setField(term304403, term304403.getClass(), "time", term304408);
        setField(term304387, term304387.getClass(), "registerTime", term304403);
        setIntField(term304414, term304414.getClass(), "year", 2022);
        setShortField(term304414, term304414.getClass(), "month", (short) 10);
        setShortField(term304414, term304414.getClass(), "day", (short) 28);
        setField(term304413, term304413.getClass(), "date", term304414);
        setByteField(term304418, term304418.getClass(), "hour", (byte) 22);
        setByteField(term304418, term304418.getClass(), "minute", (byte) 0);
        setByteField(term304418, term304418.getClass(), "second", (byte) 21);
        setIntField(term304418, term304418.getClass(), "nano", 466105268);
        setField(term304413, term304413.getClass(), "time", term304418);
        setField(term304387, term304387.getClass(), "accessTime", term304413);
        setField(term304385, term304385.getClass(), "card", term304387);
        setField(term304385, term304385.getClass(), "userName", "ZRaaeHguys");
        setIntField(term304436, term304436.getClass(), "year", 2024);
        setShortField(term304436, term304436.getClass(), "month", (short) 12);
        setShortField(term304436, term304436.getClass(), "day", (short) 14);
        setField(term304435, term304435.getClass(), "date", term304436);
        setByteField(term304440, term304440.getClass(), "hour", (byte) 3);
        setByteField(term304440, term304440.getClass(), "minute", (byte) 55);
        setByteField(term304440, term304440.getClass(), "second", (byte) 11);
        setIntField(term304440, term304440.getClass(), "nano", 453838724);
        setField(term304435, term304435.getClass(), "time", term304440);
        setField(term304385, term304385.getClass(), "lastLoginDate", term304435);
        setBooleanField(term304385, term304385.getClass(), "isWebJoin", true);
        setField(term304385, term304385.getClass(), "webLimitDate", "JyyGlEhItv");
        setIntField(term304385, term304385.getClass(), "level", 1472071010);
        setIntField(term304385, term304385.getClass(), "reincarnationNum", 1265410255);
        setField(term304385, term304385.getClass(), "exp", "NAeiHxWYxI");
        setLongField(term304385, term304385.getClass(), "point", -5700978725283773576L);
        setLongField(term304385, term304385.getClass(), "totalPoint", 5802374733902120404L);
        setIntField(term304385, term304385.getClass(), "playCount", 2511626);
        setIntField(term304385, term304385.getClass(), "multiPlayCount", 44009888);
        setIntField(term304385, term304385.getClass(), "multiWinCount", -513392311);
        setIntField(term304385, term304385.getClass(), "requestResCount", 1354727885);
        setIntField(term304385, term304385.getClass(), "acceptResCount", 1202764688);
        setIntField(term304385, term304385.getClass(), "successResCount", 1198986574);
        setIntField(term304385, term304385.getClass(), "playerRating", 1496477362);
        setIntField(term304385, term304385.getClass(), "highestRating", 694634515);
        setIntField(term304385, term304385.getClass(), "nameplateId", -1684684863);
        setIntField(term304385, term304385.getClass(), "frameId", -1337880590);
        setIntField(term304385, term304385.getClass(), "characterId", -40671465);
        setIntField(term304385, term304385.getClass(), "trophyId", 906922634);
        setIntField(term304385, term304385.getClass(), "playedTutorialBit", 50121333);
        setIntField(term304385, term304385.getClass(), "firstTutorialCancelNum", 1552254538);
        setIntField(term304385, term304385.getClass(), "masterTutorialCancelNum", -66330072);
        setIntField(term304385, term304385.getClass(), "totalRepertoireCount", 1911156222);
        setIntField(term304385, term304385.getClass(), "totalMapNum", -595089281);
        setLongField(term304385, term304385.getClass(), "totalHiScore", -2160213762472734251L);
        setLongField(term304385, term304385.getClass(), "totalBasicHighScore", 2053196274651523185L);
        setLongField(term304385, term304385.getClass(), "totalAdvancedHighScore", -8624949217735869992L);
        setLongField(term304385, term304385.getClass(), "totalExpertHighScore", 2930009653397034975L);
        setLongField(term304385, term304385.getClass(), "totalMasterHighScore", 7962633237038441170L);
        setIntField(term304497, term304497.getClass(), "year", 2015);
        setShortField(term304497, term304497.getClass(), "month", (short) 7);
        setShortField(term304497, term304497.getClass(), "day", (short) 29);
        setField(term304496, term304496.getClass(), "date", term304497);
        setByteField(term304501, term304501.getClass(), "hour", (byte) 17);
        setByteField(term304501, term304501.getClass(), "minute", (byte) 1);
        setByteField(term304501, term304501.getClass(), "second", (byte) 43);
        setIntField(term304501, term304501.getClass(), "nano", 521412812);
        setField(term304496, term304496.getClass(), "time", term304501);
        setField(term304385, term304385.getClass(), "eventWatchedDate", term304496);
        setIntField(term304385, term304385.getClass(), "friendCount", 336328847);
        setBooleanField(term304385, term304385.getClass(), "isMaimai", true);
        setField(term304385, term304385.getClass(), "firstGameId", "qSfOhoIMpr");
        setField(term304385, term304385.getClass(), "firstRomVersion", "bAowmWKEGP");
        setField(term304385, term304385.getClass(), "firstDataVersion", "GQZmnRhLyF");
        setIntField(term304545, term304545.getClass(), "year", 2014);
        setShortField(term304545, term304545.getClass(), "month", (short) 2);
        setShortField(term304545, term304545.getClass(), "day", (short) 25);
        setField(term304544, term304544.getClass(), "date", term304545);
        setByteField(term304549, term304549.getClass(), "hour", (byte) 12);
        setByteField(term304549, term304549.getClass(), "minute", (byte) 48);
        setByteField(term304549, term304549.getClass(), "second", (byte) 56);
        setIntField(term304549, term304549.getClass(), "nano", 774870552);
        setField(term304544, term304544.getClass(), "time", term304549);
        setField(term304385, term304385.getClass(), "firstPlayDate", term304544);
        setField(term304385, term304385.getClass(), "lastGameId", "CIJyIgGonf");
        setField(term304385, term304385.getClass(), "lastRomVersion", "uhIWNRNIgh");
        setField(term304385, term304385.getClass(), "lastDataVersion", "wFXoQDJRmN");
        setIntField(term304591, term304591.getClass(), "year", 2027);
        setShortField(term304591, term304591.getClass(), "month", (short) 6);
        setShortField(term304591, term304591.getClass(), "day", (short) 27);
        setField(term304590, term304590.getClass(), "date", term304591);
        setByteField(term304595, term304595.getClass(), "hour", (byte) 19);
        setByteField(term304595, term304595.getClass(), "minute", (byte) 16);
        setByteField(term304595, term304595.getClass(), "second", (byte) 16);
        setIntField(term304595, term304595.getClass(), "nano", 199034152);
        setField(term304590, term304590.getClass(), "time", term304595);
        setField(term304385, term304385.getClass(), "lastPlayDate", term304590);
        setIntField(term304385, term304385.getClass(), "lastPlaceId", -1839425499);
        setField(term304385, term304385.getClass(), "lastPlaceName", "JYcRvcwyES");
        setField(term304385, term304385.getClass(), "lastRegionId", "EIyXptwVyk");
        setField(term304385, term304385.getClass(), "lastRegionName", "fgnBfpvzBR");
        setField(term304385, term304385.getClass(), "lastAllNetId", "QGtfeKLTbS");
        setField(term304385, term304385.getClass(), "lastClientId", "mmeVnvqGFB");
        setField(term304383, term304383.getClass(), "user", term304385);
        setField(term304383, term304383.getClass(), "propertyKey", "uaCErguuKj");
        setField(term304383, term304383.getClass(), "propertyValue", "CWIkxfoXOn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyValue", argTypes, term304383, args);
    }

};


