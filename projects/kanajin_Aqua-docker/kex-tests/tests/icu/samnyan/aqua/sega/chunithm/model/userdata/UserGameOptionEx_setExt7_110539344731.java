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

public class UserGameOptionEx_setExt7_110539344731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323911;
     Object term324209;

    public UserGameOptionEx_setExt7_110539344731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323917 = new Long(-8698230272673009418L);
        term323911 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term323913 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term323915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term323931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324123 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323911, term323911.getClass(), "id", 4916750179173147465L);
        setLongField(term323913, term323913.getClass(), "id", 29705543197921155L);
        setLongField(term323915, term323915.getClass(), "id", 5948824767935044534L);
        setField(term323915, term323915.getClass(), "extId", term323917);
        setField(term323915, term323915.getClass(), "luid", "gWDuljoCTx");
        setIntField(term323932, term323932.getClass(), "year", 2017);
        setShortField(term323932, term323932.getClass(), "month", (short) 2);
        setShortField(term323932, term323932.getClass(), "day", (short) 2);
        setField(term323931, term323931.getClass(), "date", term323932);
        setByteField(term323936, term323936.getClass(), "hour", (byte) 1);
        setByteField(term323936, term323936.getClass(), "minute", (byte) 12);
        setByteField(term323936, term323936.getClass(), "second", (byte) 19);
        setIntField(term323936, term323936.getClass(), "nano", 48203106);
        setField(term323931, term323931.getClass(), "time", term323936);
        setField(term323915, term323915.getClass(), "registerTime", term323931);
        setIntField(term323942, term323942.getClass(), "year", 2028);
        setShortField(term323942, term323942.getClass(), "month", (short) 2);
        setShortField(term323942, term323942.getClass(), "day", (short) 9);
        setField(term323941, term323941.getClass(), "date", term323942);
        setByteField(term323946, term323946.getClass(), "hour", (byte) 7);
        setByteField(term323946, term323946.getClass(), "minute", (byte) 19);
        setByteField(term323946, term323946.getClass(), "second", (byte) 27);
        setIntField(term323946, term323946.getClass(), "nano", 542922252);
        setField(term323941, term323941.getClass(), "time", term323946);
        setField(term323915, term323915.getClass(), "accessTime", term323941);
        setField(term323913, term323913.getClass(), "card", term323915);
        setField(term323913, term323913.getClass(), "userName", "VWFCiHNcuV");
        setIntField(term323964, term323964.getClass(), "year", 2011);
        setShortField(term323964, term323964.getClass(), "month", (short) 5);
        setShortField(term323964, term323964.getClass(), "day", (short) 14);
        setField(term323963, term323963.getClass(), "date", term323964);
        setByteField(term323968, term323968.getClass(), "hour", (byte) 3);
        setByteField(term323968, term323968.getClass(), "minute", (byte) 36);
        setByteField(term323968, term323968.getClass(), "second", (byte) 26);
        setIntField(term323968, term323968.getClass(), "nano", 953741984);
        setField(term323963, term323963.getClass(), "time", term323968);
        setField(term323913, term323913.getClass(), "lastLoginDate", term323963);
        setBooleanField(term323913, term323913.getClass(), "isWebJoin", false);
        setField(term323913, term323913.getClass(), "webLimitDate", "oRdsFEiHOt");
        setIntField(term323913, term323913.getClass(), "level", 1178569956);
        setIntField(term323913, term323913.getClass(), "reincarnationNum", -547915411);
        setField(term323913, term323913.getClass(), "exp", "XLyilJzRkP");
        setLongField(term323913, term323913.getClass(), "point", 6498754760108919381L);
        setLongField(term323913, term323913.getClass(), "totalPoint", 5490377288658647689L);
        setIntField(term323913, term323913.getClass(), "playCount", 1768724009);
        setIntField(term323913, term323913.getClass(), "multiPlayCount", 249265496);
        setIntField(term323913, term323913.getClass(), "multiWinCount", 868477230);
        setIntField(term323913, term323913.getClass(), "requestResCount", 1229413667);
        setIntField(term323913, term323913.getClass(), "acceptResCount", 874120759);
        setIntField(term323913, term323913.getClass(), "successResCount", -552497235);
        setIntField(term323913, term323913.getClass(), "playerRating", -1081656668);
        setIntField(term323913, term323913.getClass(), "highestRating", 2146938733);
        setIntField(term323913, term323913.getClass(), "nameplateId", 345464224);
        setIntField(term323913, term323913.getClass(), "frameId", -1307803249);
        setIntField(term323913, term323913.getClass(), "characterId", 534335201);
        setIntField(term323913, term323913.getClass(), "trophyId", -1255427884);
        setIntField(term323913, term323913.getClass(), "playedTutorialBit", 1168729369);
        setIntField(term323913, term323913.getClass(), "firstTutorialCancelNum", 151690467);
        setIntField(term323913, term323913.getClass(), "masterTutorialCancelNum", -186313217);
        setIntField(term323913, term323913.getClass(), "totalRepertoireCount", -815651409);
        setIntField(term323913, term323913.getClass(), "totalMapNum", -353945578);
        setLongField(term323913, term323913.getClass(), "totalHiScore", -7225879757464875307L);
        setLongField(term323913, term323913.getClass(), "totalBasicHighScore", -437906661461805469L);
        setLongField(term323913, term323913.getClass(), "totalAdvancedHighScore", -3244543062859719956L);
        setLongField(term323913, term323913.getClass(), "totalExpertHighScore", 7759324234094611300L);
        setLongField(term323913, term323913.getClass(), "totalMasterHighScore", 3548274164116003787L);
        setIntField(term324025, term324025.getClass(), "year", 2026);
        setShortField(term324025, term324025.getClass(), "month", (short) 2);
        setShortField(term324025, term324025.getClass(), "day", (short) 25);
        setField(term324024, term324024.getClass(), "date", term324025);
        setByteField(term324029, term324029.getClass(), "hour", (byte) 22);
        setByteField(term324029, term324029.getClass(), "minute", (byte) 7);
        setByteField(term324029, term324029.getClass(), "second", (byte) 47);
        setIntField(term324029, term324029.getClass(), "nano", 756331246);
        setField(term324024, term324024.getClass(), "time", term324029);
        setField(term323913, term323913.getClass(), "eventWatchedDate", term324024);
        setIntField(term323913, term323913.getClass(), "friendCount", 1135633);
        setBooleanField(term323913, term323913.getClass(), "isMaimai", false);
        setField(term323913, term323913.getClass(), "firstGameId", "sYmdjjkiqc");
        setField(term323913, term323913.getClass(), "firstRomVersion", "DbPFJbunZe");
        setField(term323913, term323913.getClass(), "firstDataVersion", "rtoiCzynkp");
        setIntField(term324073, term324073.getClass(), "year", 2027);
        setShortField(term324073, term324073.getClass(), "month", (short) 3);
        setShortField(term324073, term324073.getClass(), "day", (short) 6);
        setField(term324072, term324072.getClass(), "date", term324073);
        setByteField(term324077, term324077.getClass(), "hour", (byte) 12);
        setByteField(term324077, term324077.getClass(), "minute", (byte) 44);
        setByteField(term324077, term324077.getClass(), "second", (byte) 50);
        setIntField(term324077, term324077.getClass(), "nano", 189626800);
        setField(term324072, term324072.getClass(), "time", term324077);
        setField(term323913, term323913.getClass(), "firstPlayDate", term324072);
        setField(term323913, term323913.getClass(), "lastGameId", "tqjEBbhLxB");
        setField(term323913, term323913.getClass(), "lastRomVersion", "uwRpAOBIsu");
        setField(term323913, term323913.getClass(), "lastDataVersion", "HqceiaTGDi");
        setIntField(term324119, term324119.getClass(), "year", 2024);
        setShortField(term324119, term324119.getClass(), "month", (short) 1);
        setShortField(term324119, term324119.getClass(), "day", (short) 28);
        setField(term324118, term324118.getClass(), "date", term324119);
        setByteField(term324123, term324123.getClass(), "hour", (byte) 5);
        setByteField(term324123, term324123.getClass(), "minute", (byte) 21);
        setByteField(term324123, term324123.getClass(), "second", (byte) 29);
        setIntField(term324123, term324123.getClass(), "nano", 196187145);
        setField(term324118, term324118.getClass(), "time", term324123);
        setField(term323913, term323913.getClass(), "lastPlayDate", term324118);
        setIntField(term323913, term323913.getClass(), "lastPlaceId", 1621941924);
        setField(term323913, term323913.getClass(), "lastPlaceName", "dDFpJDkWtW");
        setField(term323913, term323913.getClass(), "lastRegionId", "VBtTmYfmNa");
        setField(term323913, term323913.getClass(), "lastRegionName", "vCMPzUJdqC");
        setField(term323913, term323913.getClass(), "lastAllNetId", "INruiLFsfz");
        setField(term323913, term323913.getClass(), "lastClientId", "hDxoYRMfgy");
        setField(term323911, term323911.getClass(), "user", term323913);
        setIntField(term323911, term323911.getClass(), "ext1", 165051353);
        setIntField(term323911, term323911.getClass(), "ext2", 319228528);
        setIntField(term323911, term323911.getClass(), "ext3", -1386299179);
        setIntField(term323911, term323911.getClass(), "ext4", 1707068994);
        setIntField(term323911, term323911.getClass(), "ext5", 679614372);
        setIntField(term323911, term323911.getClass(), "ext6", -1870715839);
        setIntField(term323911, term323911.getClass(), "ext7", -294405038);
        setIntField(term323911, term323911.getClass(), "ext8", -795338343);
        setIntField(term323911, term323911.getClass(), "ext9", 229702668);
        setIntField(term323911, term323911.getClass(), "ext10", 1625307154);
        setIntField(term323911, term323911.getClass(), "ext11", 874439788);
        setIntField(term323911, term323911.getClass(), "ext12", -1064976000);
        setIntField(term323911, term323911.getClass(), "ext13", -398704081);
        setIntField(term323911, term323911.getClass(), "ext14", -1711507656);
        setIntField(term323911, term323911.getClass(), "ext15", 480387670);
        setIntField(term323911, term323911.getClass(), "ext16", 1761728485);
        setIntField(term323911, term323911.getClass(), "ext17", 1806701564);
        setIntField(term323911, term323911.getClass(), "ext18", -1488910214);
        setIntField(term323911, term323911.getClass(), "ext19", -1970174359);
        setIntField(term323911, term323911.getClass(), "ext20", -2021486318);
        term324209 = new Integer(1707744811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term324209;
        callMethod(klass, "setExt7", argTypes, term323911, args);
    }

};


