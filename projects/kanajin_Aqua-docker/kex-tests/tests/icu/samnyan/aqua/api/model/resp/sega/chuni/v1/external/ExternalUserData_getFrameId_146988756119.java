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

public class ExternalUserData_getFrameId_146988756119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7620;

    public ExternalUserData_getFrameId_146988756119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7620 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term7645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7711 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7759 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7805 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7620, term7620.getClass(), "accessCode", "tsTGdgQYUL");
        setField(term7620, term7620.getClass(), "userName", "TtGbVmKcnX");
        setIntField(term7646, term7646.getClass(), "year", 2011);
        setShortField(term7646, term7646.getClass(), "month", (short) 8);
        setShortField(term7646, term7646.getClass(), "day", (short) 1);
        setField(term7645, term7645.getClass(), "date", term7646);
        setByteField(term7650, term7650.getClass(), "hour", (byte) 7);
        setByteField(term7650, term7650.getClass(), "minute", (byte) 2);
        setByteField(term7650, term7650.getClass(), "second", (byte) 46);
        setIntField(term7650, term7650.getClass(), "nano", 187178462);
        setField(term7645, term7645.getClass(), "time", term7650);
        setField(term7620, term7620.getClass(), "lastLoginDate", term7645);
        setBooleanField(term7620, term7620.getClass(), "isWebJoin", true);
        setField(term7620, term7620.getClass(), "webLimitDate", "GJVkUrCVdD");
        setIntField(term7620, term7620.getClass(), "level", 808203320);
        setIntField(term7620, term7620.getClass(), "reincarnationNum", -544382127);
        setField(term7620, term7620.getClass(), "exp", "zNdorvdUgu");
        setLongField(term7620, term7620.getClass(), "point", 6843866297465638866L);
        setLongField(term7620, term7620.getClass(), "totalPoint", -4023935540989049732L);
        setIntField(term7620, term7620.getClass(), "playCount", -1830198043);
        setIntField(term7620, term7620.getClass(), "multiPlayCount", -439048495);
        setIntField(term7620, term7620.getClass(), "multiWinCount", -1849105286);
        setIntField(term7620, term7620.getClass(), "requestResCount", 1334483645);
        setIntField(term7620, term7620.getClass(), "acceptResCount", 917513193);
        setIntField(term7620, term7620.getClass(), "successResCount", 787278105);
        setIntField(term7620, term7620.getClass(), "playerRating", -2063843486);
        setIntField(term7620, term7620.getClass(), "highestRating", 833762980);
        setIntField(term7620, term7620.getClass(), "nameplateId", 320711637);
        setIntField(term7620, term7620.getClass(), "frameId", 1241164745);
        setIntField(term7620, term7620.getClass(), "characterId", 1723148410);
        setIntField(term7620, term7620.getClass(), "trophyId", -920797484);
        setIntField(term7620, term7620.getClass(), "playedTutorialBit", -1631697577);
        setIntField(term7620, term7620.getClass(), "firstTutorialCancelNum", 765731371);
        setIntField(term7620, term7620.getClass(), "masterTutorialCancelNum", -1703035419);
        setIntField(term7620, term7620.getClass(), "totalRepertoireCount", 765766290);
        setIntField(term7620, term7620.getClass(), "totalMapNum", -1284825282);
        setLongField(term7620, term7620.getClass(), "totalHiScore", 855932984568615096L);
        setLongField(term7620, term7620.getClass(), "totalBasicHighScore", -1616722610139554082L);
        setLongField(term7620, term7620.getClass(), "totalAdvancedHighScore", 7495904023107549024L);
        setLongField(term7620, term7620.getClass(), "totalExpertHighScore", 8802866251294305945L);
        setLongField(term7620, term7620.getClass(), "totalMasterHighScore", 4513004407927379358L);
        setIntField(term7707, term7707.getClass(), "year", 2020);
        setShortField(term7707, term7707.getClass(), "month", (short) 9);
        setShortField(term7707, term7707.getClass(), "day", (short) 3);
        setField(term7706, term7706.getClass(), "date", term7707);
        setByteField(term7711, term7711.getClass(), "hour", (byte) 10);
        setByteField(term7711, term7711.getClass(), "minute", (byte) 44);
        setByteField(term7711, term7711.getClass(), "second", (byte) 5);
        setIntField(term7711, term7711.getClass(), "nano", 572560230);
        setField(term7706, term7706.getClass(), "time", term7711);
        setField(term7620, term7620.getClass(), "eventWatchedDate", term7706);
        setIntField(term7620, term7620.getClass(), "friendCount", -1941343035);
        setBooleanField(term7620, term7620.getClass(), "isMaimai", false);
        setField(term7620, term7620.getClass(), "firstGameId", "oPxuZbkYio");
        setField(term7620, term7620.getClass(), "firstRomVersion", "vKitydDVnM");
        setField(term7620, term7620.getClass(), "firstDataVersion", "urCiQnUFBM");
        setIntField(term7755, term7755.getClass(), "year", 2020);
        setShortField(term7755, term7755.getClass(), "month", (short) 8);
        setShortField(term7755, term7755.getClass(), "day", (short) 16);
        setField(term7754, term7754.getClass(), "date", term7755);
        setByteField(term7759, term7759.getClass(), "hour", (byte) 4);
        setByteField(term7759, term7759.getClass(), "minute", (byte) 37);
        setByteField(term7759, term7759.getClass(), "second", (byte) 19);
        setIntField(term7759, term7759.getClass(), "nano", 605410923);
        setField(term7754, term7754.getClass(), "time", term7759);
        setField(term7620, term7620.getClass(), "firstPlayDate", term7754);
        setField(term7620, term7620.getClass(), "lastGameId", "EKjQdtKxAM");
        setField(term7620, term7620.getClass(), "lastRomVersion", "TXZAIPQJHt");
        setField(term7620, term7620.getClass(), "lastDataVersion", "DIbeDHICho");
        setIntField(term7801, term7801.getClass(), "year", 2028);
        setShortField(term7801, term7801.getClass(), "month", (short) 5);
        setShortField(term7801, term7801.getClass(), "day", (short) 2);
        setField(term7800, term7800.getClass(), "date", term7801);
        setByteField(term7805, term7805.getClass(), "hour", (byte) 2);
        setByteField(term7805, term7805.getClass(), "minute", (byte) 59);
        setByteField(term7805, term7805.getClass(), "second", (byte) 30);
        setIntField(term7805, term7805.getClass(), "nano", 222274238);
        setField(term7800, term7800.getClass(), "time", term7805);
        setField(term7620, term7620.getClass(), "lastPlayDate", term7800);
        setIntField(term7620, term7620.getClass(), "lastPlaceId", 947897214);
        setField(term7620, term7620.getClass(), "lastPlaceName", "dJGPlmSRnz");
        setField(term7620, term7620.getClass(), "lastRegionId", "DPskuFUobI");
        setField(term7620, term7620.getClass(), "lastRegionName", "wBGfLpNNiZ");
        setField(term7620, term7620.getClass(), "lastAllNetId", "yUGCjlqgJE");
        setField(term7620, term7620.getClass(), "lastClientId", "PXdVZyoJyC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term7620, args);
    }

};


