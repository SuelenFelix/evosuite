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

public class ExternalUserData_setExp_101676475256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22539;

    public ExternalUserData_setExp_101676475256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22539 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term22564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22569 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22630 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22724 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22539, term22539.getClass(), "accessCode", "NFkbBiPeiw");
        setField(term22539, term22539.getClass(), "userName", "tlRvilQyjJ");
        setIntField(term22565, term22565.getClass(), "year", 2011);
        setShortField(term22565, term22565.getClass(), "month", (short) 3);
        setShortField(term22565, term22565.getClass(), "day", (short) 25);
        setField(term22564, term22564.getClass(), "date", term22565);
        setByteField(term22569, term22569.getClass(), "hour", (byte) 20);
        setByteField(term22569, term22569.getClass(), "minute", (byte) 10);
        setByteField(term22569, term22569.getClass(), "second", (byte) 51);
        setIntField(term22569, term22569.getClass(), "nano", 162102574);
        setField(term22564, term22564.getClass(), "time", term22569);
        setField(term22539, term22539.getClass(), "lastLoginDate", term22564);
        setBooleanField(term22539, term22539.getClass(), "isWebJoin", false);
        setField(term22539, term22539.getClass(), "webLimitDate", "gwTUlYNpjM");
        setIntField(term22539, term22539.getClass(), "level", -2025555268);
        setIntField(term22539, term22539.getClass(), "reincarnationNum", -746950289);
        setField(term22539, term22539.getClass(), "exp", "uXYojRmxrM");
        setLongField(term22539, term22539.getClass(), "point", 6351887424140565471L);
        setLongField(term22539, term22539.getClass(), "totalPoint", 6273670659288205855L);
        setIntField(term22539, term22539.getClass(), "playCount", -137577510);
        setIntField(term22539, term22539.getClass(), "multiPlayCount", 719185716);
        setIntField(term22539, term22539.getClass(), "multiWinCount", 1624820010);
        setIntField(term22539, term22539.getClass(), "requestResCount", -831921156);
        setIntField(term22539, term22539.getClass(), "acceptResCount", -2085566906);
        setIntField(term22539, term22539.getClass(), "successResCount", 1773193728);
        setIntField(term22539, term22539.getClass(), "playerRating", -1341357647);
        setIntField(term22539, term22539.getClass(), "highestRating", 138447019);
        setIntField(term22539, term22539.getClass(), "nameplateId", 114915275);
        setIntField(term22539, term22539.getClass(), "frameId", 338519695);
        setIntField(term22539, term22539.getClass(), "characterId", 2025566580);
        setIntField(term22539, term22539.getClass(), "trophyId", -1231122778);
        setIntField(term22539, term22539.getClass(), "playedTutorialBit", 1923558221);
        setIntField(term22539, term22539.getClass(), "firstTutorialCancelNum", 1762934060);
        setIntField(term22539, term22539.getClass(), "masterTutorialCancelNum", -859828739);
        setIntField(term22539, term22539.getClass(), "totalRepertoireCount", 1986855642);
        setIntField(term22539, term22539.getClass(), "totalMapNum", 1280322790);
        setLongField(term22539, term22539.getClass(), "totalHiScore", -4776514981294468834L);
        setLongField(term22539, term22539.getClass(), "totalBasicHighScore", -7273680182770718108L);
        setLongField(term22539, term22539.getClass(), "totalAdvancedHighScore", -421166328269063791L);
        setLongField(term22539, term22539.getClass(), "totalExpertHighScore", 4811527754205378980L);
        setLongField(term22539, term22539.getClass(), "totalMasterHighScore", 9174730812791817537L);
        setIntField(term22626, term22626.getClass(), "year", 2027);
        setShortField(term22626, term22626.getClass(), "month", (short) 8);
        setShortField(term22626, term22626.getClass(), "day", (short) 16);
        setField(term22625, term22625.getClass(), "date", term22626);
        setByteField(term22630, term22630.getClass(), "hour", (byte) 8);
        setByteField(term22630, term22630.getClass(), "minute", (byte) 3);
        setByteField(term22630, term22630.getClass(), "second", (byte) 15);
        setIntField(term22630, term22630.getClass(), "nano", 332963320);
        setField(term22625, term22625.getClass(), "time", term22630);
        setField(term22539, term22539.getClass(), "eventWatchedDate", term22625);
        setIntField(term22539, term22539.getClass(), "friendCount", -1702209203);
        setBooleanField(term22539, term22539.getClass(), "isMaimai", false);
        setField(term22539, term22539.getClass(), "firstGameId", "cxRwRcodud");
        setField(term22539, term22539.getClass(), "firstRomVersion", "GDGBPlYeLn");
        setField(term22539, term22539.getClass(), "firstDataVersion", "jdQANIXSTq");
        setIntField(term22674, term22674.getClass(), "year", 2021);
        setShortField(term22674, term22674.getClass(), "month", (short) 11);
        setShortField(term22674, term22674.getClass(), "day", (short) 12);
        setField(term22673, term22673.getClass(), "date", term22674);
        setByteField(term22678, term22678.getClass(), "hour", (byte) 0);
        setByteField(term22678, term22678.getClass(), "minute", (byte) 51);
        setByteField(term22678, term22678.getClass(), "second", (byte) 55);
        setIntField(term22678, term22678.getClass(), "nano", 745543124);
        setField(term22673, term22673.getClass(), "time", term22678);
        setField(term22539, term22539.getClass(), "firstPlayDate", term22673);
        setField(term22539, term22539.getClass(), "lastGameId", "stVcZLTNpu");
        setField(term22539, term22539.getClass(), "lastRomVersion", "LgXdqWrsLL");
        setField(term22539, term22539.getClass(), "lastDataVersion", "bbHWyibNmy");
        setIntField(term22720, term22720.getClass(), "year", 2028);
        setShortField(term22720, term22720.getClass(), "month", (short) 12);
        setShortField(term22720, term22720.getClass(), "day", (short) 2);
        setField(term22719, term22719.getClass(), "date", term22720);
        setByteField(term22724, term22724.getClass(), "hour", (byte) 18);
        setByteField(term22724, term22724.getClass(), "minute", (byte) 6);
        setByteField(term22724, term22724.getClass(), "second", (byte) 45);
        setIntField(term22724, term22724.getClass(), "nano", 967474945);
        setField(term22719, term22719.getClass(), "time", term22724);
        setField(term22539, term22539.getClass(), "lastPlayDate", term22719);
        setIntField(term22539, term22539.getClass(), "lastPlaceId", -1592307668);
        setField(term22539, term22539.getClass(), "lastPlaceName", "vYYOYhWMWZ");
        setField(term22539, term22539.getClass(), "lastRegionId", "FLQJOzEXff");
        setField(term22539, term22539.getClass(), "lastRegionName", "qlaIVJBSfQ");
        setField(term22539, term22539.getClass(), "lastAllNetId", "lYvIWBFFsq");
        setField(term22539, term22539.getClass(), "lastClientId", "tThwsqWKcE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bkSgsDrkCN";
        callMethod(klass, "setExp", argTypes, term22539, args);
    }

};


