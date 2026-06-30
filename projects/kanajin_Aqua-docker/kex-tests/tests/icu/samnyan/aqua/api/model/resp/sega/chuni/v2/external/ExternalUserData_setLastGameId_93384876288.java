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

public class ExternalUserData_setLastGameId_93384876288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35531;

    public ExternalUserData_setLastGameId_93384876288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35531 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term35556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35561 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35716 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35531, term35531.getClass(), "accessCode", "hrFtgdcZKS");
        setField(term35531, term35531.getClass(), "userName", "ZhZJvpPaTU");
        setIntField(term35557, term35557.getClass(), "year", 2015);
        setShortField(term35557, term35557.getClass(), "month", (short) 10);
        setShortField(term35557, term35557.getClass(), "day", (short) 3);
        setField(term35556, term35556.getClass(), "date", term35557);
        setByteField(term35561, term35561.getClass(), "hour", (byte) 10);
        setByteField(term35561, term35561.getClass(), "minute", (byte) 45);
        setByteField(term35561, term35561.getClass(), "second", (byte) 18);
        setIntField(term35561, term35561.getClass(), "nano", 333457081);
        setField(term35556, term35556.getClass(), "time", term35561);
        setField(term35531, term35531.getClass(), "lastLoginDate", term35556);
        setBooleanField(term35531, term35531.getClass(), "isWebJoin", false);
        setField(term35531, term35531.getClass(), "webLimitDate", "NZwUsJxDLI");
        setIntField(term35531, term35531.getClass(), "level", 2105146188);
        setIntField(term35531, term35531.getClass(), "reincarnationNum", -862415480);
        setField(term35531, term35531.getClass(), "exp", "wlusYBOfXW");
        setLongField(term35531, term35531.getClass(), "point", -8697239524885136781L);
        setLongField(term35531, term35531.getClass(), "totalPoint", 6465539339431559532L);
        setIntField(term35531, term35531.getClass(), "playCount", 312605349);
        setIntField(term35531, term35531.getClass(), "multiPlayCount", -402072606);
        setIntField(term35531, term35531.getClass(), "multiWinCount", -477355193);
        setIntField(term35531, term35531.getClass(), "requestResCount", 168425089);
        setIntField(term35531, term35531.getClass(), "acceptResCount", -571931590);
        setIntField(term35531, term35531.getClass(), "successResCount", 37757400);
        setIntField(term35531, term35531.getClass(), "playerRating", -1632221612);
        setIntField(term35531, term35531.getClass(), "highestRating", 1545314376);
        setIntField(term35531, term35531.getClass(), "nameplateId", 437959151);
        setIntField(term35531, term35531.getClass(), "frameId", 27780241);
        setIntField(term35531, term35531.getClass(), "characterId", -683868408);
        setIntField(term35531, term35531.getClass(), "trophyId", -381130069);
        setIntField(term35531, term35531.getClass(), "playedTutorialBit", 885769749);
        setIntField(term35531, term35531.getClass(), "firstTutorialCancelNum", -1021168716);
        setIntField(term35531, term35531.getClass(), "masterTutorialCancelNum", -1238055654);
        setIntField(term35531, term35531.getClass(), "totalRepertoireCount", 1561513428);
        setIntField(term35531, term35531.getClass(), "totalMapNum", 778959809);
        setLongField(term35531, term35531.getClass(), "totalHiScore", -5304831679802174866L);
        setLongField(term35531, term35531.getClass(), "totalBasicHighScore", 1909175111101717943L);
        setLongField(term35531, term35531.getClass(), "totalAdvancedHighScore", 8499930868919012909L);
        setLongField(term35531, term35531.getClass(), "totalExpertHighScore", 6252795312796363233L);
        setLongField(term35531, term35531.getClass(), "totalMasterHighScore", 3968143267572761057L);
        setIntField(term35618, term35618.getClass(), "year", 2013);
        setShortField(term35618, term35618.getClass(), "month", (short) 3);
        setShortField(term35618, term35618.getClass(), "day", (short) 3);
        setField(term35617, term35617.getClass(), "date", term35618);
        setByteField(term35622, term35622.getClass(), "hour", (byte) 22);
        setByteField(term35622, term35622.getClass(), "minute", (byte) 27);
        setByteField(term35622, term35622.getClass(), "second", (byte) 52);
        setIntField(term35622, term35622.getClass(), "nano", 968779154);
        setField(term35617, term35617.getClass(), "time", term35622);
        setField(term35531, term35531.getClass(), "eventWatchedDate", term35617);
        setIntField(term35531, term35531.getClass(), "friendCount", -7504064);
        setBooleanField(term35531, term35531.getClass(), "isMaimai", true);
        setField(term35531, term35531.getClass(), "firstGameId", "HEWWLhfKIa");
        setField(term35531, term35531.getClass(), "firstRomVersion", "mJJkYzNPob");
        setField(term35531, term35531.getClass(), "firstDataVersion", "mRDwekkZQg");
        setIntField(term35666, term35666.getClass(), "year", 2019);
        setShortField(term35666, term35666.getClass(), "month", (short) 8);
        setShortField(term35666, term35666.getClass(), "day", (short) 31);
        setField(term35665, term35665.getClass(), "date", term35666);
        setByteField(term35670, term35670.getClass(), "hour", (byte) 22);
        setByteField(term35670, term35670.getClass(), "minute", (byte) 31);
        setByteField(term35670, term35670.getClass(), "second", (byte) 36);
        setIntField(term35670, term35670.getClass(), "nano", 403358328);
        setField(term35665, term35665.getClass(), "time", term35670);
        setField(term35531, term35531.getClass(), "firstPlayDate", term35665);
        setField(term35531, term35531.getClass(), "lastGameId", "RIGChgqpTI");
        setField(term35531, term35531.getClass(), "lastRomVersion", "YCrgXnhgoK");
        setField(term35531, term35531.getClass(), "lastDataVersion", "nQodIeQekM");
        setIntField(term35712, term35712.getClass(), "year", 2021);
        setShortField(term35712, term35712.getClass(), "month", (short) 11);
        setShortField(term35712, term35712.getClass(), "day", (short) 19);
        setField(term35711, term35711.getClass(), "date", term35712);
        setByteField(term35716, term35716.getClass(), "hour", (byte) 4);
        setByteField(term35716, term35716.getClass(), "minute", (byte) 39);
        setByteField(term35716, term35716.getClass(), "second", (byte) 43);
        setIntField(term35716, term35716.getClass(), "nano", 638695514);
        setField(term35711, term35711.getClass(), "time", term35716);
        setField(term35531, term35531.getClass(), "lastPlayDate", term35711);
        setIntField(term35531, term35531.getClass(), "lastPlaceId", -1464364418);
        setField(term35531, term35531.getClass(), "lastPlaceName", "YXORpHCDcd");
        setField(term35531, term35531.getClass(), "lastRegionId", "XzZbAcRADD");
        setField(term35531, term35531.getClass(), "lastRegionName", "UqSNWSoTRy");
        setField(term35531, term35531.getClass(), "lastAllNetId", "VesRqDfjMa");
        setField(term35531, term35531.getClass(), "lastClientId", "AQTTebOiZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mgeIhswNtk";
        callMethod(klass, "setLastGameId", argTypes, term35531, args);
    }

};


