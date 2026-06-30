package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getTotalBasicHighScore_173189345228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11229;

    public ExternalUserData_getTotalBasicHighScore_173189345228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11229 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term11254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11414 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11229, term11229.getClass(), "accessCode", "EusenEbIoF");
        setField(term11229, term11229.getClass(), "userName", "SScVQYSvWH");
        setIntField(term11255, term11255.getClass(), "year", 2028);
        setShortField(term11255, term11255.getClass(), "month", (short) 4);
        setShortField(term11255, term11255.getClass(), "day", (short) 11);
        setField(term11254, term11254.getClass(), "date", term11255);
        setByteField(term11259, term11259.getClass(), "hour", (byte) 4);
        setByteField(term11259, term11259.getClass(), "minute", (byte) 45);
        setByteField(term11259, term11259.getClass(), "second", (byte) 2);
        setIntField(term11259, term11259.getClass(), "nano", 374177968);
        setField(term11254, term11254.getClass(), "time", term11259);
        setField(term11229, term11229.getClass(), "lastLoginDate", term11254);
        setBooleanField(term11229, term11229.getClass(), "isWebJoin", false);
        setField(term11229, term11229.getClass(), "webLimitDate", "MnovcqFhCl");
        setIntField(term11229, term11229.getClass(), "level", -1674430871);
        setIntField(term11229, term11229.getClass(), "reincarnationNum", 794352120);
        setField(term11229, term11229.getClass(), "exp", "qYtAeLzOhW");
        setLongField(term11229, term11229.getClass(), "point", 8863790908271299748L);
        setLongField(term11229, term11229.getClass(), "totalPoint", 9205327385733285058L);
        setIntField(term11229, term11229.getClass(), "playCount", 340719678);
        setIntField(term11229, term11229.getClass(), "multiPlayCount", 299791142);
        setIntField(term11229, term11229.getClass(), "multiWinCount", 1862191391);
        setIntField(term11229, term11229.getClass(), "requestResCount", 1131398807);
        setIntField(term11229, term11229.getClass(), "acceptResCount", -344907703);
        setIntField(term11229, term11229.getClass(), "successResCount", 824341437);
        setIntField(term11229, term11229.getClass(), "playerRating", -1794965320);
        setIntField(term11229, term11229.getClass(), "highestRating", 520504102);
        setIntField(term11229, term11229.getClass(), "nameplateId", -457396133);
        setIntField(term11229, term11229.getClass(), "frameId", -1793950607);
        setIntField(term11229, term11229.getClass(), "characterId", 1091954101);
        setIntField(term11229, term11229.getClass(), "trophyId", 1895143076);
        setIntField(term11229, term11229.getClass(), "playedTutorialBit", 1981860404);
        setIntField(term11229, term11229.getClass(), "firstTutorialCancelNum", 732174235);
        setIntField(term11229, term11229.getClass(), "masterTutorialCancelNum", 470895808);
        setIntField(term11229, term11229.getClass(), "totalRepertoireCount", 1787325291);
        setIntField(term11229, term11229.getClass(), "totalMapNum", 1470349147);
        setLongField(term11229, term11229.getClass(), "totalHiScore", 4199886998224701110L);
        setLongField(term11229, term11229.getClass(), "totalBasicHighScore", 8540994973773607992L);
        setLongField(term11229, term11229.getClass(), "totalAdvancedHighScore", -2338103433822116635L);
        setLongField(term11229, term11229.getClass(), "totalExpertHighScore", -1885698929232124806L);
        setLongField(term11229, term11229.getClass(), "totalMasterHighScore", 5731563613239387113L);
        setIntField(term11316, term11316.getClass(), "year", 2021);
        setShortField(term11316, term11316.getClass(), "month", (short) 4);
        setShortField(term11316, term11316.getClass(), "day", (short) 22);
        setField(term11315, term11315.getClass(), "date", term11316);
        setByteField(term11320, term11320.getClass(), "hour", (byte) 17);
        setByteField(term11320, term11320.getClass(), "minute", (byte) 6);
        setByteField(term11320, term11320.getClass(), "second", (byte) 33);
        setIntField(term11320, term11320.getClass(), "nano", 21410850);
        setField(term11315, term11315.getClass(), "time", term11320);
        setField(term11229, term11229.getClass(), "eventWatchedDate", term11315);
        setIntField(term11229, term11229.getClass(), "friendCount", -255317272);
        setBooleanField(term11229, term11229.getClass(), "isMaimai", true);
        setField(term11229, term11229.getClass(), "firstGameId", "tJzmOfcUnY");
        setField(term11229, term11229.getClass(), "firstRomVersion", "TKlccZUpjz");
        setField(term11229, term11229.getClass(), "firstDataVersion", "GGzwMoHZXC");
        setIntField(term11364, term11364.getClass(), "year", 2026);
        setShortField(term11364, term11364.getClass(), "month", (short) 10);
        setShortField(term11364, term11364.getClass(), "day", (short) 19);
        setField(term11363, term11363.getClass(), "date", term11364);
        setByteField(term11368, term11368.getClass(), "hour", (byte) 7);
        setByteField(term11368, term11368.getClass(), "minute", (byte) 22);
        setByteField(term11368, term11368.getClass(), "second", (byte) 11);
        setIntField(term11368, term11368.getClass(), "nano", 17846677);
        setField(term11363, term11363.getClass(), "time", term11368);
        setField(term11229, term11229.getClass(), "firstPlayDate", term11363);
        setField(term11229, term11229.getClass(), "lastGameId", "IpmgwHTgnG");
        setField(term11229, term11229.getClass(), "lastRomVersion", "tIpkeYIezR");
        setField(term11229, term11229.getClass(), "lastDataVersion", "YkZtEtthvz");
        setIntField(term11410, term11410.getClass(), "year", 2018);
        setShortField(term11410, term11410.getClass(), "month", (short) 10);
        setShortField(term11410, term11410.getClass(), "day", (short) 17);
        setField(term11409, term11409.getClass(), "date", term11410);
        setByteField(term11414, term11414.getClass(), "hour", (byte) 5);
        setByteField(term11414, term11414.getClass(), "minute", (byte) 10);
        setByteField(term11414, term11414.getClass(), "second", (byte) 23);
        setIntField(term11414, term11414.getClass(), "nano", 571520422);
        setField(term11409, term11409.getClass(), "time", term11414);
        setField(term11229, term11229.getClass(), "lastPlayDate", term11409);
        setIntField(term11229, term11229.getClass(), "lastPlaceId", -706253892);
        setField(term11229, term11229.getClass(), "lastPlaceName", "dwlZSxlXOo");
        setField(term11229, term11229.getClass(), "lastRegionId", "lKrEAkypza");
        setField(term11229, term11229.getClass(), "lastRegionName", "KtuuNAqGCQ");
        setField(term11229, term11229.getClass(), "lastAllNetId", "OGQsfjmReM");
        setField(term11229, term11229.getClass(), "lastClientId", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term11229, args);
    }

};


