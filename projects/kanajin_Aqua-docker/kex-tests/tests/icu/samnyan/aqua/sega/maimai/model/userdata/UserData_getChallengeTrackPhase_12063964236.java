package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getChallengeTrackPhase_12063964236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9505;

    public UserData_getChallengeTrackPhase_12063964236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9509 = new Long(6617340557564669657L);
        term9505 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term9507 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9528 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9538 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9505, term9505.getClass(), "id", 41775768178052008L);
        setLongField(term9507, term9507.getClass(), "id", 6682528376118987775L);
        setField(term9507, term9507.getClass(), "extId", term9509);
        setField(term9507, term9507.getClass(), "luid", "pumvwBWvpy");
        setIntField(term9524, term9524.getClass(), "year", 2022);
        setShortField(term9524, term9524.getClass(), "month", (short) 11);
        setShortField(term9524, term9524.getClass(), "day", (short) 10);
        setField(term9523, term9523.getClass(), "date", term9524);
        setByteField(term9528, term9528.getClass(), "hour", (byte) 20);
        setByteField(term9528, term9528.getClass(), "minute", (byte) 8);
        setByteField(term9528, term9528.getClass(), "second", (byte) 35);
        setIntField(term9528, term9528.getClass(), "nano", 658416570);
        setField(term9523, term9523.getClass(), "time", term9528);
        setField(term9507, term9507.getClass(), "registerTime", term9523);
        setIntField(term9534, term9534.getClass(), "year", 2018);
        setShortField(term9534, term9534.getClass(), "month", (short) 11);
        setShortField(term9534, term9534.getClass(), "day", (short) 9);
        setField(term9533, term9533.getClass(), "date", term9534);
        setByteField(term9538, term9538.getClass(), "hour", (byte) 6);
        setByteField(term9538, term9538.getClass(), "minute", (byte) 8);
        setByteField(term9538, term9538.getClass(), "second", (byte) 32);
        setIntField(term9538, term9538.getClass(), "nano", 750733310);
        setField(term9533, term9533.getClass(), "time", term9538);
        setField(term9507, term9507.getClass(), "accessTime", term9533);
        setField(term9505, term9505.getClass(), "card", term9507);
        setIntField(term9505, term9505.getClass(), "lastDataVersion", -206889003);
        setField(term9505, term9505.getClass(), "userName", "HwLHeGLyhe");
        setIntField(term9505, term9505.getClass(), "point", 638046409);
        setIntField(term9505, term9505.getClass(), "totalPoint", 427274898);
        setIntField(term9505, term9505.getClass(), "iconId", -1654552020);
        setIntField(term9505, term9505.getClass(), "nameplateId", -1049546692);
        setIntField(term9505, term9505.getClass(), "frameId", 1397781598);
        setIntField(term9505, term9505.getClass(), "trophyId", -44720365);
        setIntField(term9505, term9505.getClass(), "playCount", 1963632911);
        setIntField(term9505, term9505.getClass(), "playVsCount", -1100497683);
        setIntField(term9505, term9505.getClass(), "playSyncCount", 155423433);
        setIntField(term9505, term9505.getClass(), "winCount", -815471632);
        setIntField(term9505, term9505.getClass(), "helpCount", -1469668708);
        setIntField(term9505, term9505.getClass(), "comboCount", 1796950482);
        setIntField(term9505, term9505.getClass(), "feverCount", -945759470);
        setIntField(term9505, term9505.getClass(), "totalHiScore", 657342039);
        setIntField(term9505, term9505.getClass(), "totalEasyHighScore", 1483999606);
        setIntField(term9505, term9505.getClass(), "totalBasicHighScore", 1871761182);
        setIntField(term9505, term9505.getClass(), "totalAdvancedHighScore", 233983728);
        setIntField(term9505, term9505.getClass(), "totalExpertHighScore", -1650132476);
        setIntField(term9505, term9505.getClass(), "totalMasterHighScore", 1719680265);
        setIntField(term9505, term9505.getClass(), "totalReMasterHighScore", -1890898783);
        setIntField(term9505, term9505.getClass(), "totalHighSync", 1357632911);
        setIntField(term9505, term9505.getClass(), "totalEasySync", 1768195761);
        setIntField(term9505, term9505.getClass(), "totalBasicSync", -1382661134);
        setIntField(term9505, term9505.getClass(), "totalAdvancedSync", -1042022818);
        setIntField(term9505, term9505.getClass(), "totalExpertSync", 317372051);
        setIntField(term9505, term9505.getClass(), "totalMasterSync", 892170444);
        setIntField(term9505, term9505.getClass(), "totalReMasterSync", -82417507);
        setIntField(term9505, term9505.getClass(), "playerRating", -511400358);
        setIntField(term9505, term9505.getClass(), "highestRating", -742178468);
        setIntField(term9505, term9505.getClass(), "rankAuthTailId", 694989162);
        setField(term9505, term9505.getClass(), "eventWatchedDate", "RDnkgWkcbz");
        setField(term9505, term9505.getClass(), "webLimitDate", "IBpaxltauX");
        setIntField(term9505, term9505.getClass(), "challengeTrackPhase", -65504209);
        setIntField(term9505, term9505.getClass(), "firstPlayBits", 1745199030);
        setField(term9505, term9505.getClass(), "lastPlayDate", "hePqROaplw");
        setIntField(term9505, term9505.getClass(), "lastPlaceId", -1440013173);
        setField(term9505, term9505.getClass(), "lastPlaceName", "PJcSNDruWd");
        setIntField(term9505, term9505.getClass(), "lastRegionId", -288126597);
        setField(term9505, term9505.getClass(), "lastRegionName", "VVNNlAePXF");
        setField(term9505, term9505.getClass(), "lastClientId", "jnwVnmKAFv");
        setField(term9505, term9505.getClass(), "lastCountryCode", "TXyHhqeCjR");
        setIntField(term9505, term9505.getClass(), "eventPoint", -218831961);
        setIntField(term9505, term9505.getClass(), "totalLv", 826765055);
        setIntField(term9505, term9505.getClass(), "lastLoginBonusDay", 1358117317);
        setIntField(term9505, term9505.getClass(), "lastSurvivalBonusDay", 229989439);
        setIntField(term9505, term9505.getClass(), "loginBonusLv", -1620126913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeTrackPhase", argTypes, term9505, args);
    }

};


