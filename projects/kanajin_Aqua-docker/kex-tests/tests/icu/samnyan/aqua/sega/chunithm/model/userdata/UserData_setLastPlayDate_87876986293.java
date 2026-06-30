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

public class UserData_setLastPlayDate_87876986293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169333;
     Object term169609;

    public UserData_setLastPlayDate_87876986293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169337 = new Long(-6490254947459640565L);
        term169333 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term169335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169388 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169543 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169333, term169333.getClass(), "id", -4452401102510626548L);
        setLongField(term169335, term169335.getClass(), "id", -8645820241213403338L);
        setField(term169335, term169335.getClass(), "extId", term169337);
        setField(term169335, term169335.getClass(), "luid", "xfbZhodhmq");
        setIntField(term169352, term169352.getClass(), "year", 2014);
        setShortField(term169352, term169352.getClass(), "month", (short) 10);
        setShortField(term169352, term169352.getClass(), "day", (short) 15);
        setField(term169351, term169351.getClass(), "date", term169352);
        setByteField(term169356, term169356.getClass(), "hour", (byte) 0);
        setByteField(term169356, term169356.getClass(), "minute", (byte) 26);
        setByteField(term169356, term169356.getClass(), "second", (byte) 1);
        setIntField(term169356, term169356.getClass(), "nano", 345656337);
        setField(term169351, term169351.getClass(), "time", term169356);
        setField(term169335, term169335.getClass(), "registerTime", term169351);
        setIntField(term169362, term169362.getClass(), "year", 2022);
        setShortField(term169362, term169362.getClass(), "month", (short) 12);
        setShortField(term169362, term169362.getClass(), "day", (short) 29);
        setField(term169361, term169361.getClass(), "date", term169362);
        setByteField(term169366, term169366.getClass(), "hour", (byte) 20);
        setByteField(term169366, term169366.getClass(), "minute", (byte) 51);
        setByteField(term169366, term169366.getClass(), "second", (byte) 43);
        setIntField(term169366, term169366.getClass(), "nano", 527256611);
        setField(term169361, term169361.getClass(), "time", term169366);
        setField(term169335, term169335.getClass(), "accessTime", term169361);
        setField(term169333, term169333.getClass(), "card", term169335);
        setField(term169333, term169333.getClass(), "userName", "DjJOlQgBbP");
        setIntField(term169384, term169384.getClass(), "year", 2023);
        setShortField(term169384, term169384.getClass(), "month", (short) 9);
        setShortField(term169384, term169384.getClass(), "day", (short) 1);
        setField(term169383, term169383.getClass(), "date", term169384);
        setByteField(term169388, term169388.getClass(), "hour", (byte) 18);
        setByteField(term169388, term169388.getClass(), "minute", (byte) 12);
        setByteField(term169388, term169388.getClass(), "second", (byte) 10);
        setIntField(term169388, term169388.getClass(), "nano", 169593342);
        setField(term169383, term169383.getClass(), "time", term169388);
        setField(term169333, term169333.getClass(), "lastLoginDate", term169383);
        setBooleanField(term169333, term169333.getClass(), "isWebJoin", false);
        setField(term169333, term169333.getClass(), "webLimitDate", "ITgJRrDzJt");
        setIntField(term169333, term169333.getClass(), "level", -1415132995);
        setIntField(term169333, term169333.getClass(), "reincarnationNum", -298988561);
        setField(term169333, term169333.getClass(), "exp", "oBFbmCpapG");
        setLongField(term169333, term169333.getClass(), "point", 2816249404742724931L);
        setLongField(term169333, term169333.getClass(), "totalPoint", 1884132702816460886L);
        setIntField(term169333, term169333.getClass(), "playCount", 83719437);
        setIntField(term169333, term169333.getClass(), "multiPlayCount", 992945340);
        setIntField(term169333, term169333.getClass(), "multiWinCount", -1487299154);
        setIntField(term169333, term169333.getClass(), "requestResCount", 1803636451);
        setIntField(term169333, term169333.getClass(), "acceptResCount", -409541287);
        setIntField(term169333, term169333.getClass(), "successResCount", -294350291);
        setIntField(term169333, term169333.getClass(), "playerRating", 741222064);
        setIntField(term169333, term169333.getClass(), "highestRating", -1480233398);
        setIntField(term169333, term169333.getClass(), "nameplateId", 735898654);
        setIntField(term169333, term169333.getClass(), "frameId", -1440883870);
        setIntField(term169333, term169333.getClass(), "characterId", -1201667200);
        setIntField(term169333, term169333.getClass(), "trophyId", -1698014200);
        setIntField(term169333, term169333.getClass(), "playedTutorialBit", -1048905765);
        setIntField(term169333, term169333.getClass(), "firstTutorialCancelNum", 196993945);
        setIntField(term169333, term169333.getClass(), "masterTutorialCancelNum", 1692789621);
        setIntField(term169333, term169333.getClass(), "totalRepertoireCount", 1024925524);
        setIntField(term169333, term169333.getClass(), "totalMapNum", 1138562815);
        setLongField(term169333, term169333.getClass(), "totalHiScore", -146957100924633583L);
        setLongField(term169333, term169333.getClass(), "totalBasicHighScore", -2066293017654650396L);
        setLongField(term169333, term169333.getClass(), "totalAdvancedHighScore", -7667306510947529358L);
        setLongField(term169333, term169333.getClass(), "totalExpertHighScore", 2125142245553494427L);
        setLongField(term169333, term169333.getClass(), "totalMasterHighScore", 2948932720021770792L);
        setIntField(term169445, term169445.getClass(), "year", 2012);
        setShortField(term169445, term169445.getClass(), "month", (short) 1);
        setShortField(term169445, term169445.getClass(), "day", (short) 13);
        setField(term169444, term169444.getClass(), "date", term169445);
        setByteField(term169449, term169449.getClass(), "hour", (byte) 14);
        setByteField(term169449, term169449.getClass(), "minute", (byte) 25);
        setByteField(term169449, term169449.getClass(), "second", (byte) 52);
        setIntField(term169449, term169449.getClass(), "nano", 652758861);
        setField(term169444, term169444.getClass(), "time", term169449);
        setField(term169333, term169333.getClass(), "eventWatchedDate", term169444);
        setIntField(term169333, term169333.getClass(), "friendCount", -1468904016);
        setBooleanField(term169333, term169333.getClass(), "isMaimai", true);
        setField(term169333, term169333.getClass(), "firstGameId", "XdVoIkavja");
        setField(term169333, term169333.getClass(), "firstRomVersion", "CDXBhicnsV");
        setField(term169333, term169333.getClass(), "firstDataVersion", "BzaFlqnXjh");
        setIntField(term169493, term169493.getClass(), "year", 2013);
        setShortField(term169493, term169493.getClass(), "month", (short) 8);
        setShortField(term169493, term169493.getClass(), "day", (short) 28);
        setField(term169492, term169492.getClass(), "date", term169493);
        setByteField(term169497, term169497.getClass(), "hour", (byte) 7);
        setByteField(term169497, term169497.getClass(), "minute", (byte) 13);
        setByteField(term169497, term169497.getClass(), "second", (byte) 16);
        setIntField(term169497, term169497.getClass(), "nano", 141657605);
        setField(term169492, term169492.getClass(), "time", term169497);
        setField(term169333, term169333.getClass(), "firstPlayDate", term169492);
        setField(term169333, term169333.getClass(), "lastGameId", "GkpQCrijZx");
        setField(term169333, term169333.getClass(), "lastRomVersion", "IxKqBRlNhC");
        setField(term169333, term169333.getClass(), "lastDataVersion", "luSAqFzxeY");
        setIntField(term169539, term169539.getClass(), "year", 2017);
        setShortField(term169539, term169539.getClass(), "month", (short) 12);
        setShortField(term169539, term169539.getClass(), "day", (short) 28);
        setField(term169538, term169538.getClass(), "date", term169539);
        setByteField(term169543, term169543.getClass(), "hour", (byte) 21);
        setByteField(term169543, term169543.getClass(), "minute", (byte) 50);
        setByteField(term169543, term169543.getClass(), "second", (byte) 13);
        setIntField(term169543, term169543.getClass(), "nano", 905209020);
        setField(term169538, term169538.getClass(), "time", term169543);
        setField(term169333, term169333.getClass(), "lastPlayDate", term169538);
        setIntField(term169333, term169333.getClass(), "lastPlaceId", -1831885121);
        setField(term169333, term169333.getClass(), "lastPlaceName", "gHSquTdfrK");
        setField(term169333, term169333.getClass(), "lastRegionId", "lwSNhfQGzI");
        setField(term169333, term169333.getClass(), "lastRegionName", "MvvzPTyVSb");
        setField(term169333, term169333.getClass(), "lastAllNetId", "aLyUXyVGbN");
        setField(term169333, term169333.getClass(), "lastClientId", "OHqCZWvTjl");
        term169609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169614 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term169610, term169610.getClass(), "year", 2012);
        setShortField(term169610, term169610.getClass(), "month", (short) 3);
        setShortField(term169610, term169610.getClass(), "day", (short) 9);
        setField(term169609, term169609.getClass(), "date", term169610);
        setByteField(term169614, term169614.getClass(), "hour", (byte) 18);
        setByteField(term169614, term169614.getClass(), "minute", (byte) 48);
        setByteField(term169614, term169614.getClass(), "second", (byte) 44);
        setIntField(term169614, term169614.getClass(), "nano", 512730653);
        setField(term169609, term169609.getClass(), "time", term169614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term169609;
        callMethod(klass, "setLastPlayDate", argTypes, term169333, args);
    }

};


