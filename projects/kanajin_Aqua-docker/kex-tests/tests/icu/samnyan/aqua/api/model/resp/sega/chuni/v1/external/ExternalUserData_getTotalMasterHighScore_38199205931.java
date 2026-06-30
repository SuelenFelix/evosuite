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

public class ExternalUserData_getTotalMasterHighScore_38199205931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12432;

    public ExternalUserData_getTotalMasterHighScore_38199205931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12432 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term12457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12617 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12432, term12432.getClass(), "accessCode", "vBnWPlsZMk");
        setField(term12432, term12432.getClass(), "userName", "fIZsWucfXz");
        setIntField(term12458, term12458.getClass(), "year", 2016);
        setShortField(term12458, term12458.getClass(), "month", (short) 4);
        setShortField(term12458, term12458.getClass(), "day", (short) 18);
        setField(term12457, term12457.getClass(), "date", term12458);
        setByteField(term12462, term12462.getClass(), "hour", (byte) 15);
        setByteField(term12462, term12462.getClass(), "minute", (byte) 56);
        setByteField(term12462, term12462.getClass(), "second", (byte) 45);
        setIntField(term12462, term12462.getClass(), "nano", 248103350);
        setField(term12457, term12457.getClass(), "time", term12462);
        setField(term12432, term12432.getClass(), "lastLoginDate", term12457);
        setBooleanField(term12432, term12432.getClass(), "isWebJoin", true);
        setField(term12432, term12432.getClass(), "webLimitDate", "IApvtmfhnq");
        setIntField(term12432, term12432.getClass(), "level", 2128383340);
        setIntField(term12432, term12432.getClass(), "reincarnationNum", 1238598518);
        setField(term12432, term12432.getClass(), "exp", "VSaNnhMpRc");
        setLongField(term12432, term12432.getClass(), "point", -1145146470850585022L);
        setLongField(term12432, term12432.getClass(), "totalPoint", 1993646237353405740L);
        setIntField(term12432, term12432.getClass(), "playCount", -558146961);
        setIntField(term12432, term12432.getClass(), "multiPlayCount", 1505480070);
        setIntField(term12432, term12432.getClass(), "multiWinCount", -829088844);
        setIntField(term12432, term12432.getClass(), "requestResCount", -31751777);
        setIntField(term12432, term12432.getClass(), "acceptResCount", -246967963);
        setIntField(term12432, term12432.getClass(), "successResCount", -1777140369);
        setIntField(term12432, term12432.getClass(), "playerRating", 993627098);
        setIntField(term12432, term12432.getClass(), "highestRating", 872295704);
        setIntField(term12432, term12432.getClass(), "nameplateId", 86041387);
        setIntField(term12432, term12432.getClass(), "frameId", 1010721666);
        setIntField(term12432, term12432.getClass(), "characterId", 27043781);
        setIntField(term12432, term12432.getClass(), "trophyId", -1367122405);
        setIntField(term12432, term12432.getClass(), "playedTutorialBit", -1703625118);
        setIntField(term12432, term12432.getClass(), "firstTutorialCancelNum", 1104108112);
        setIntField(term12432, term12432.getClass(), "masterTutorialCancelNum", 1648665618);
        setIntField(term12432, term12432.getClass(), "totalRepertoireCount", 633765954);
        setIntField(term12432, term12432.getClass(), "totalMapNum", 269110087);
        setLongField(term12432, term12432.getClass(), "totalHiScore", -4043093655001688454L);
        setLongField(term12432, term12432.getClass(), "totalBasicHighScore", -419800263764810394L);
        setLongField(term12432, term12432.getClass(), "totalAdvancedHighScore", 5904678961906211249L);
        setLongField(term12432, term12432.getClass(), "totalExpertHighScore", -1820639665251914495L);
        setLongField(term12432, term12432.getClass(), "totalMasterHighScore", 3238645206498300107L);
        setIntField(term12519, term12519.getClass(), "year", 2028);
        setShortField(term12519, term12519.getClass(), "month", (short) 3);
        setShortField(term12519, term12519.getClass(), "day", (short) 25);
        setField(term12518, term12518.getClass(), "date", term12519);
        setByteField(term12523, term12523.getClass(), "hour", (byte) 6);
        setByteField(term12523, term12523.getClass(), "minute", (byte) 9);
        setByteField(term12523, term12523.getClass(), "second", (byte) 35);
        setIntField(term12523, term12523.getClass(), "nano", 744453524);
        setField(term12518, term12518.getClass(), "time", term12523);
        setField(term12432, term12432.getClass(), "eventWatchedDate", term12518);
        setIntField(term12432, term12432.getClass(), "friendCount", 1545119095);
        setBooleanField(term12432, term12432.getClass(), "isMaimai", true);
        setField(term12432, term12432.getClass(), "firstGameId", "QNjNTLlUaV");
        setField(term12432, term12432.getClass(), "firstRomVersion", "hIYsRyOZxk");
        setField(term12432, term12432.getClass(), "firstDataVersion", "RjNoEywJbC");
        setIntField(term12567, term12567.getClass(), "year", 2017);
        setShortField(term12567, term12567.getClass(), "month", (short) 6);
        setShortField(term12567, term12567.getClass(), "day", (short) 28);
        setField(term12566, term12566.getClass(), "date", term12567);
        setByteField(term12571, term12571.getClass(), "hour", (byte) 8);
        setByteField(term12571, term12571.getClass(), "minute", (byte) 1);
        setByteField(term12571, term12571.getClass(), "second", (byte) 14);
        setIntField(term12571, term12571.getClass(), "nano", 501033715);
        setField(term12566, term12566.getClass(), "time", term12571);
        setField(term12432, term12432.getClass(), "firstPlayDate", term12566);
        setField(term12432, term12432.getClass(), "lastGameId", "RTTvrwwhou");
        setField(term12432, term12432.getClass(), "lastRomVersion", "lRORwXipuk");
        setField(term12432, term12432.getClass(), "lastDataVersion", "fVdTcjgHdw");
        setIntField(term12613, term12613.getClass(), "year", 2016);
        setShortField(term12613, term12613.getClass(), "month", (short) 10);
        setShortField(term12613, term12613.getClass(), "day", (short) 10);
        setField(term12612, term12612.getClass(), "date", term12613);
        setByteField(term12617, term12617.getClass(), "hour", (byte) 16);
        setByteField(term12617, term12617.getClass(), "minute", (byte) 7);
        setByteField(term12617, term12617.getClass(), "second", (byte) 16);
        setIntField(term12617, term12617.getClass(), "nano", 995200309);
        setField(term12612, term12612.getClass(), "time", term12617);
        setField(term12432, term12432.getClass(), "lastPlayDate", term12612);
        setIntField(term12432, term12432.getClass(), "lastPlaceId", 1671229683);
        setField(term12432, term12432.getClass(), "lastPlaceName", "wwAwLLcLPp");
        setField(term12432, term12432.getClass(), "lastRegionId", "nHpMKOmlpQ");
        setField(term12432, term12432.getClass(), "lastRegionName", "fKhrQsJToZ");
        setField(term12432, term12432.getClass(), "lastAllNetId", "wsysQLGFnl");
        setField(term12432, term12432.getClass(), "lastClientId", "ckQLZGFjMX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term12432, args);
    }

};


