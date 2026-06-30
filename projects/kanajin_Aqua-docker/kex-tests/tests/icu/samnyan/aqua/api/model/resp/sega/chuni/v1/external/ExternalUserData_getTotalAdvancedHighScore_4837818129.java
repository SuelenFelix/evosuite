package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getTotalAdvancedHighScore_4837818129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11630;

    public ExternalUserData_getTotalAdvancedHighScore_4837818129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11630 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term11655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11815 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11630, term11630.getClass(), "accessCode", "JisaWUxcNb");
        setField(term11630, term11630.getClass(), "userName", "NxgmYPzWCI");
        setIntField(term11656, term11656.getClass(), "year", 2022);
        setShortField(term11656, term11656.getClass(), "month", (short) 11);
        setShortField(term11656, term11656.getClass(), "day", (short) 5);
        setField(term11655, term11655.getClass(), "date", term11656);
        setByteField(term11660, term11660.getClass(), "hour", (byte) 0);
        setByteField(term11660, term11660.getClass(), "minute", (byte) 51);
        setByteField(term11660, term11660.getClass(), "second", (byte) 23);
        setIntField(term11660, term11660.getClass(), "nano", 1140962);
        setField(term11655, term11655.getClass(), "time", term11660);
        setField(term11630, term11630.getClass(), "lastLoginDate", term11655);
        setBooleanField(term11630, term11630.getClass(), "isWebJoin", false);
        setField(term11630, term11630.getClass(), "webLimitDate", "SqjyKmayBx");
        setIntField(term11630, term11630.getClass(), "level", -1341439819);
        setIntField(term11630, term11630.getClass(), "reincarnationNum", -728760750);
        setField(term11630, term11630.getClass(), "exp", "XjDhvToxJy");
        setLongField(term11630, term11630.getClass(), "point", 3381333711768010594L);
        setLongField(term11630, term11630.getClass(), "totalPoint", 3580984732036213717L);
        setIntField(term11630, term11630.getClass(), "playCount", -1617383807);
        setIntField(term11630, term11630.getClass(), "multiPlayCount", -1244386281);
        setIntField(term11630, term11630.getClass(), "multiWinCount", -885788574);
        setIntField(term11630, term11630.getClass(), "requestResCount", -865722613);
        setIntField(term11630, term11630.getClass(), "acceptResCount", -1551355284);
        setIntField(term11630, term11630.getClass(), "successResCount", -1381970335);
        setIntField(term11630, term11630.getClass(), "playerRating", 1213549815);
        setIntField(term11630, term11630.getClass(), "highestRating", -1518419301);
        setIntField(term11630, term11630.getClass(), "nameplateId", 674879025);
        setIntField(term11630, term11630.getClass(), "frameId", -1538936030);
        setIntField(term11630, term11630.getClass(), "characterId", -752870423);
        setIntField(term11630, term11630.getClass(), "trophyId", -1698809299);
        setIntField(term11630, term11630.getClass(), "playedTutorialBit", 401512128);
        setIntField(term11630, term11630.getClass(), "firstTutorialCancelNum", -2069930777);
        setIntField(term11630, term11630.getClass(), "masterTutorialCancelNum", 1543696412);
        setIntField(term11630, term11630.getClass(), "totalRepertoireCount", -1385748168);
        setIntField(term11630, term11630.getClass(), "totalMapNum", -270592367);
        setLongField(term11630, term11630.getClass(), "totalHiScore", 5330761990446327930L);
        setLongField(term11630, term11630.getClass(), "totalBasicHighScore", -3954795081650780841L);
        setLongField(term11630, term11630.getClass(), "totalAdvancedHighScore", 3288791194263207397L);
        setLongField(term11630, term11630.getClass(), "totalExpertHighScore", 3288941170644426558L);
        setLongField(term11630, term11630.getClass(), "totalMasterHighScore", -8338004844694486146L);
        setIntField(term11717, term11717.getClass(), "year", 2020);
        setShortField(term11717, term11717.getClass(), "month", (short) 5);
        setShortField(term11717, term11717.getClass(), "day", (short) 24);
        setField(term11716, term11716.getClass(), "date", term11717);
        setByteField(term11721, term11721.getClass(), "hour", (byte) 2);
        setByteField(term11721, term11721.getClass(), "minute", (byte) 9);
        setByteField(term11721, term11721.getClass(), "second", (byte) 52);
        setIntField(term11721, term11721.getClass(), "nano", 653329393);
        setField(term11716, term11716.getClass(), "time", term11721);
        setField(term11630, term11630.getClass(), "eventWatchedDate", term11716);
        setIntField(term11630, term11630.getClass(), "friendCount", 178847646);
        setBooleanField(term11630, term11630.getClass(), "isMaimai", false);
        setField(term11630, term11630.getClass(), "firstGameId", "nxSTJflLQy");
        setField(term11630, term11630.getClass(), "firstRomVersion", "FlHzxEfFzI");
        setField(term11630, term11630.getClass(), "firstDataVersion", "aSATgQUpoe");
        setIntField(term11765, term11765.getClass(), "year", 2024);
        setShortField(term11765, term11765.getClass(), "month", (short) 9);
        setShortField(term11765, term11765.getClass(), "day", (short) 22);
        setField(term11764, term11764.getClass(), "date", term11765);
        setByteField(term11769, term11769.getClass(), "hour", (byte) 0);
        setByteField(term11769, term11769.getClass(), "minute", (byte) 11);
        setByteField(term11769, term11769.getClass(), "second", (byte) 7);
        setIntField(term11769, term11769.getClass(), "nano", 56643259);
        setField(term11764, term11764.getClass(), "time", term11769);
        setField(term11630, term11630.getClass(), "firstPlayDate", term11764);
        setField(term11630, term11630.getClass(), "lastGameId", "VkPSXewZfB");
        setField(term11630, term11630.getClass(), "lastRomVersion", "ubodzJoMGW");
        setField(term11630, term11630.getClass(), "lastDataVersion", "weddIktxOA");
        setIntField(term11811, term11811.getClass(), "year", 2021);
        setShortField(term11811, term11811.getClass(), "month", (short) 12);
        setShortField(term11811, term11811.getClass(), "day", (short) 21);
        setField(term11810, term11810.getClass(), "date", term11811);
        setByteField(term11815, term11815.getClass(), "hour", (byte) 12);
        setByteField(term11815, term11815.getClass(), "minute", (byte) 59);
        setByteField(term11815, term11815.getClass(), "second", (byte) 52);
        setIntField(term11815, term11815.getClass(), "nano", 47081639);
        setField(term11810, term11810.getClass(), "time", term11815);
        setField(term11630, term11630.getClass(), "lastPlayDate", term11810);
        setIntField(term11630, term11630.getClass(), "lastPlaceId", 273590437);
        setField(term11630, term11630.getClass(), "lastPlaceName", "uSlMeISsDD");
        setField(term11630, term11630.getClass(), "lastRegionId", "WdCiTDUKqn");
        setField(term11630, term11630.getClass(), "lastRegionName", "PSizQDoxxe");
        setField(term11630, term11630.getClass(), "lastAllNetId", "mKaHyMybrK");
        setField(term11630, term11630.getClass(), "lastClientId", "AyrEXuGrEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term11630, args);
    }

};


