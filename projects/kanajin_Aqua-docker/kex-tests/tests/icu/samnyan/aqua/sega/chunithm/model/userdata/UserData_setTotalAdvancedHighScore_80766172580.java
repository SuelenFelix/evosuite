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

public class UserData_setTotalAdvancedHighScore_80766172580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163633;
     Object term163909;

    public UserData_setTotalAdvancedHighScore_80766172580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163637 = new Long(6636235983121346803L);
        term163633 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term163635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163688 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163843 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163633, term163633.getClass(), "id", 1522191658838512490L);
        setLongField(term163635, term163635.getClass(), "id", 1573287649333712014L);
        setField(term163635, term163635.getClass(), "extId", term163637);
        setField(term163635, term163635.getClass(), "luid", "ugFOXAltBR");
        setIntField(term163652, term163652.getClass(), "year", 2025);
        setShortField(term163652, term163652.getClass(), "month", (short) 12);
        setShortField(term163652, term163652.getClass(), "day", (short) 27);
        setField(term163651, term163651.getClass(), "date", term163652);
        setByteField(term163656, term163656.getClass(), "hour", (byte) 8);
        setByteField(term163656, term163656.getClass(), "minute", (byte) 13);
        setByteField(term163656, term163656.getClass(), "second", (byte) 30);
        setIntField(term163656, term163656.getClass(), "nano", 15838685);
        setField(term163651, term163651.getClass(), "time", term163656);
        setField(term163635, term163635.getClass(), "registerTime", term163651);
        setIntField(term163662, term163662.getClass(), "year", 2011);
        setShortField(term163662, term163662.getClass(), "month", (short) 6);
        setShortField(term163662, term163662.getClass(), "day", (short) 13);
        setField(term163661, term163661.getClass(), "date", term163662);
        setByteField(term163666, term163666.getClass(), "hour", (byte) 23);
        setByteField(term163666, term163666.getClass(), "minute", (byte) 58);
        setByteField(term163666, term163666.getClass(), "second", (byte) 17);
        setIntField(term163666, term163666.getClass(), "nano", 343114432);
        setField(term163661, term163661.getClass(), "time", term163666);
        setField(term163635, term163635.getClass(), "accessTime", term163661);
        setField(term163633, term163633.getClass(), "card", term163635);
        setField(term163633, term163633.getClass(), "userName", "PviulmdPhA");
        setIntField(term163684, term163684.getClass(), "year", 2029);
        setShortField(term163684, term163684.getClass(), "month", (short) 8);
        setShortField(term163684, term163684.getClass(), "day", (short) 4);
        setField(term163683, term163683.getClass(), "date", term163684);
        setByteField(term163688, term163688.getClass(), "hour", (byte) 13);
        setByteField(term163688, term163688.getClass(), "minute", (byte) 49);
        setByteField(term163688, term163688.getClass(), "second", (byte) 48);
        setIntField(term163688, term163688.getClass(), "nano", 997644369);
        setField(term163683, term163683.getClass(), "time", term163688);
        setField(term163633, term163633.getClass(), "lastLoginDate", term163683);
        setBooleanField(term163633, term163633.getClass(), "isWebJoin", false);
        setField(term163633, term163633.getClass(), "webLimitDate", "NAUDTajaNN");
        setIntField(term163633, term163633.getClass(), "level", 2092751533);
        setIntField(term163633, term163633.getClass(), "reincarnationNum", -873250381);
        setField(term163633, term163633.getClass(), "exp", "BgJwVzSZYi");
        setLongField(term163633, term163633.getClass(), "point", -2264973412738223689L);
        setLongField(term163633, term163633.getClass(), "totalPoint", 798197790924820945L);
        setIntField(term163633, term163633.getClass(), "playCount", -1955087186);
        setIntField(term163633, term163633.getClass(), "multiPlayCount", -2090744011);
        setIntField(term163633, term163633.getClass(), "multiWinCount", 950263148);
        setIntField(term163633, term163633.getClass(), "requestResCount", 1645449673);
        setIntField(term163633, term163633.getClass(), "acceptResCount", 1957437059);
        setIntField(term163633, term163633.getClass(), "successResCount", -1221331782);
        setIntField(term163633, term163633.getClass(), "playerRating", 1348836087);
        setIntField(term163633, term163633.getClass(), "highestRating", 1630454207);
        setIntField(term163633, term163633.getClass(), "nameplateId", 1907518379);
        setIntField(term163633, term163633.getClass(), "frameId", -956090724);
        setIntField(term163633, term163633.getClass(), "characterId", -34786917);
        setIntField(term163633, term163633.getClass(), "trophyId", 383524147);
        setIntField(term163633, term163633.getClass(), "playedTutorialBit", 1103536027);
        setIntField(term163633, term163633.getClass(), "firstTutorialCancelNum", -387893846);
        setIntField(term163633, term163633.getClass(), "masterTutorialCancelNum", -297741338);
        setIntField(term163633, term163633.getClass(), "totalRepertoireCount", 206404549);
        setIntField(term163633, term163633.getClass(), "totalMapNum", 1164079567);
        setLongField(term163633, term163633.getClass(), "totalHiScore", 3817454964079565213L);
        setLongField(term163633, term163633.getClass(), "totalBasicHighScore", 204276416780080943L);
        setLongField(term163633, term163633.getClass(), "totalAdvancedHighScore", 2468873293569704115L);
        setLongField(term163633, term163633.getClass(), "totalExpertHighScore", -4627117639198460380L);
        setLongField(term163633, term163633.getClass(), "totalMasterHighScore", -7129102761188204063L);
        setIntField(term163745, term163745.getClass(), "year", 2028);
        setShortField(term163745, term163745.getClass(), "month", (short) 1);
        setShortField(term163745, term163745.getClass(), "day", (short) 23);
        setField(term163744, term163744.getClass(), "date", term163745);
        setByteField(term163749, term163749.getClass(), "hour", (byte) 11);
        setByteField(term163749, term163749.getClass(), "minute", (byte) 44);
        setByteField(term163749, term163749.getClass(), "second", (byte) 42);
        setIntField(term163749, term163749.getClass(), "nano", 605935255);
        setField(term163744, term163744.getClass(), "time", term163749);
        setField(term163633, term163633.getClass(), "eventWatchedDate", term163744);
        setIntField(term163633, term163633.getClass(), "friendCount", 808653750);
        setBooleanField(term163633, term163633.getClass(), "isMaimai", false);
        setField(term163633, term163633.getClass(), "firstGameId", "ecRYXrSwPc");
        setField(term163633, term163633.getClass(), "firstRomVersion", "EgUbHeKEEX");
        setField(term163633, term163633.getClass(), "firstDataVersion", "qdXkDdgkzv");
        setIntField(term163793, term163793.getClass(), "year", 2029);
        setShortField(term163793, term163793.getClass(), "month", (short) 1);
        setShortField(term163793, term163793.getClass(), "day", (short) 1);
        setField(term163792, term163792.getClass(), "date", term163793);
        setByteField(term163797, term163797.getClass(), "hour", (byte) 15);
        setByteField(term163797, term163797.getClass(), "minute", (byte) 14);
        setByteField(term163797, term163797.getClass(), "second", (byte) 12);
        setIntField(term163797, term163797.getClass(), "nano", 249454872);
        setField(term163792, term163792.getClass(), "time", term163797);
        setField(term163633, term163633.getClass(), "firstPlayDate", term163792);
        setField(term163633, term163633.getClass(), "lastGameId", "bwXWpCUaun");
        setField(term163633, term163633.getClass(), "lastRomVersion", "bNhvwOrXoC");
        setField(term163633, term163633.getClass(), "lastDataVersion", "QHwFfYSCNm");
        setIntField(term163839, term163839.getClass(), "year", 2010);
        setShortField(term163839, term163839.getClass(), "month", (short) 7);
        setShortField(term163839, term163839.getClass(), "day", (short) 10);
        setField(term163838, term163838.getClass(), "date", term163839);
        setByteField(term163843, term163843.getClass(), "hour", (byte) 2);
        setByteField(term163843, term163843.getClass(), "minute", (byte) 58);
        setByteField(term163843, term163843.getClass(), "second", (byte) 25);
        setIntField(term163843, term163843.getClass(), "nano", 579555856);
        setField(term163838, term163838.getClass(), "time", term163843);
        setField(term163633, term163633.getClass(), "lastPlayDate", term163838);
        setIntField(term163633, term163633.getClass(), "lastPlaceId", -1440143802);
        setField(term163633, term163633.getClass(), "lastPlaceName", "TDpWaJHRZc");
        setField(term163633, term163633.getClass(), "lastRegionId", "nsydNohggs");
        setField(term163633, term163633.getClass(), "lastRegionName", "NwQXMulIlF");
        setField(term163633, term163633.getClass(), "lastAllNetId", "lEtoSVazWN");
        setField(term163633, term163633.getClass(), "lastClientId", "ddDDOEjMuN");
        term163909 = new Long(7205023166504172089L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term163909;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term163633, args);
    }

};


