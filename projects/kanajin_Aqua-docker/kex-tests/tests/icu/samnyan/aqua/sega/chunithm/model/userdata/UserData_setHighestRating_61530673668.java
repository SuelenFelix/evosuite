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
import java.lang.Integer;

public class UserData_setHighestRating_61530673668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158497;
     Object term158773;

    public UserData_setHighestRating_61530673668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158501 = new Long(468487103823886117L);
        term158497 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term158499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158661 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158707 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158497, term158497.getClass(), "id", 7535903882054995964L);
        setLongField(term158499, term158499.getClass(), "id", 7098896161393358891L);
        setField(term158499, term158499.getClass(), "extId", term158501);
        setField(term158499, term158499.getClass(), "luid", "wghzZSjyPl");
        setIntField(term158516, term158516.getClass(), "year", 2010);
        setShortField(term158516, term158516.getClass(), "month", (short) 8);
        setShortField(term158516, term158516.getClass(), "day", (short) 16);
        setField(term158515, term158515.getClass(), "date", term158516);
        setByteField(term158520, term158520.getClass(), "hour", (byte) 5);
        setByteField(term158520, term158520.getClass(), "minute", (byte) 31);
        setByteField(term158520, term158520.getClass(), "second", (byte) 31);
        setIntField(term158520, term158520.getClass(), "nano", 554050159);
        setField(term158515, term158515.getClass(), "time", term158520);
        setField(term158499, term158499.getClass(), "registerTime", term158515);
        setIntField(term158526, term158526.getClass(), "year", 2024);
        setShortField(term158526, term158526.getClass(), "month", (short) 4);
        setShortField(term158526, term158526.getClass(), "day", (short) 11);
        setField(term158525, term158525.getClass(), "date", term158526);
        setByteField(term158530, term158530.getClass(), "hour", (byte) 8);
        setByteField(term158530, term158530.getClass(), "minute", (byte) 35);
        setByteField(term158530, term158530.getClass(), "second", (byte) 16);
        setIntField(term158530, term158530.getClass(), "nano", 76721107);
        setField(term158525, term158525.getClass(), "time", term158530);
        setField(term158499, term158499.getClass(), "accessTime", term158525);
        setField(term158497, term158497.getClass(), "card", term158499);
        setField(term158497, term158497.getClass(), "userName", "CPkpKPIQrd");
        setIntField(term158548, term158548.getClass(), "year", 2010);
        setShortField(term158548, term158548.getClass(), "month", (short) 3);
        setShortField(term158548, term158548.getClass(), "day", (short) 13);
        setField(term158547, term158547.getClass(), "date", term158548);
        setByteField(term158552, term158552.getClass(), "hour", (byte) 7);
        setByteField(term158552, term158552.getClass(), "minute", (byte) 0);
        setByteField(term158552, term158552.getClass(), "second", (byte) 7);
        setIntField(term158552, term158552.getClass(), "nano", 568354805);
        setField(term158547, term158547.getClass(), "time", term158552);
        setField(term158497, term158497.getClass(), "lastLoginDate", term158547);
        setBooleanField(term158497, term158497.getClass(), "isWebJoin", false);
        setField(term158497, term158497.getClass(), "webLimitDate", "KTqaReORfO");
        setIntField(term158497, term158497.getClass(), "level", 1084454865);
        setIntField(term158497, term158497.getClass(), "reincarnationNum", -1444485060);
        setField(term158497, term158497.getClass(), "exp", "AfaIIRjDxi");
        setLongField(term158497, term158497.getClass(), "point", 956005912516954859L);
        setLongField(term158497, term158497.getClass(), "totalPoint", -3807584648232803070L);
        setIntField(term158497, term158497.getClass(), "playCount", -1355001013);
        setIntField(term158497, term158497.getClass(), "multiPlayCount", -1335912879);
        setIntField(term158497, term158497.getClass(), "multiWinCount", 1371866185);
        setIntField(term158497, term158497.getClass(), "requestResCount", 1556888444);
        setIntField(term158497, term158497.getClass(), "acceptResCount", 1393504869);
        setIntField(term158497, term158497.getClass(), "successResCount", 728799986);
        setIntField(term158497, term158497.getClass(), "playerRating", -444430231);
        setIntField(term158497, term158497.getClass(), "highestRating", -623445473);
        setIntField(term158497, term158497.getClass(), "nameplateId", 565663783);
        setIntField(term158497, term158497.getClass(), "frameId", -971589912);
        setIntField(term158497, term158497.getClass(), "characterId", 1025926099);
        setIntField(term158497, term158497.getClass(), "trophyId", 961710200);
        setIntField(term158497, term158497.getClass(), "playedTutorialBit", -698630156);
        setIntField(term158497, term158497.getClass(), "firstTutorialCancelNum", 160752273);
        setIntField(term158497, term158497.getClass(), "masterTutorialCancelNum", -1555752602);
        setIntField(term158497, term158497.getClass(), "totalRepertoireCount", -1803417927);
        setIntField(term158497, term158497.getClass(), "totalMapNum", 1174691081);
        setLongField(term158497, term158497.getClass(), "totalHiScore", -4029489396713416331L);
        setLongField(term158497, term158497.getClass(), "totalBasicHighScore", -3218047049129179895L);
        setLongField(term158497, term158497.getClass(), "totalAdvancedHighScore", 7259331600733986087L);
        setLongField(term158497, term158497.getClass(), "totalExpertHighScore", -6438807154292944837L);
        setLongField(term158497, term158497.getClass(), "totalMasterHighScore", -6248422485077615101L);
        setIntField(term158609, term158609.getClass(), "year", 2024);
        setShortField(term158609, term158609.getClass(), "month", (short) 7);
        setShortField(term158609, term158609.getClass(), "day", (short) 18);
        setField(term158608, term158608.getClass(), "date", term158609);
        setByteField(term158613, term158613.getClass(), "hour", (byte) 0);
        setByteField(term158613, term158613.getClass(), "minute", (byte) 51);
        setByteField(term158613, term158613.getClass(), "second", (byte) 57);
        setIntField(term158613, term158613.getClass(), "nano", 124371055);
        setField(term158608, term158608.getClass(), "time", term158613);
        setField(term158497, term158497.getClass(), "eventWatchedDate", term158608);
        setIntField(term158497, term158497.getClass(), "friendCount", -1554467908);
        setBooleanField(term158497, term158497.getClass(), "isMaimai", true);
        setField(term158497, term158497.getClass(), "firstGameId", "oeadlojIQZ");
        setField(term158497, term158497.getClass(), "firstRomVersion", "DqbGwXvmSC");
        setField(term158497, term158497.getClass(), "firstDataVersion", "aIIGYUOaLR");
        setIntField(term158657, term158657.getClass(), "year", 2025);
        setShortField(term158657, term158657.getClass(), "month", (short) 3);
        setShortField(term158657, term158657.getClass(), "day", (short) 15);
        setField(term158656, term158656.getClass(), "date", term158657);
        setByteField(term158661, term158661.getClass(), "hour", (byte) 2);
        setByteField(term158661, term158661.getClass(), "minute", (byte) 8);
        setByteField(term158661, term158661.getClass(), "second", (byte) 40);
        setIntField(term158661, term158661.getClass(), "nano", 13617883);
        setField(term158656, term158656.getClass(), "time", term158661);
        setField(term158497, term158497.getClass(), "firstPlayDate", term158656);
        setField(term158497, term158497.getClass(), "lastGameId", "saqdcGiRfC");
        setField(term158497, term158497.getClass(), "lastRomVersion", "xhQojgWfiF");
        setField(term158497, term158497.getClass(), "lastDataVersion", "hFxhVQNBry");
        setIntField(term158703, term158703.getClass(), "year", 2018);
        setShortField(term158703, term158703.getClass(), "month", (short) 2);
        setShortField(term158703, term158703.getClass(), "day", (short) 16);
        setField(term158702, term158702.getClass(), "date", term158703);
        setByteField(term158707, term158707.getClass(), "hour", (byte) 7);
        setByteField(term158707, term158707.getClass(), "minute", (byte) 27);
        setByteField(term158707, term158707.getClass(), "second", (byte) 43);
        setIntField(term158707, term158707.getClass(), "nano", 380285909);
        setField(term158702, term158702.getClass(), "time", term158707);
        setField(term158497, term158497.getClass(), "lastPlayDate", term158702);
        setIntField(term158497, term158497.getClass(), "lastPlaceId", 809458440);
        setField(term158497, term158497.getClass(), "lastPlaceName", "JrFOkJdQNH");
        setField(term158497, term158497.getClass(), "lastRegionId", "SgjnbEXsMB");
        setField(term158497, term158497.getClass(), "lastRegionName", "vvGvdVbopl");
        setField(term158497, term158497.getClass(), "lastAllNetId", "oWsWBayari");
        setField(term158497, term158497.getClass(), "lastClientId", "zHAsiDDJCb");
        term158773 = new Integer(1648454496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term158773;
        callMethod(klass, "setHighestRating", argTypes, term158497, args);
    }

};


