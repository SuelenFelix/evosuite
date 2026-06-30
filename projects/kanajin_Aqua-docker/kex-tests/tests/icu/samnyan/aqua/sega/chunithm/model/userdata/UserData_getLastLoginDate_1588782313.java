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

public class UserData_getLastLoginDate_1588782313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130659;

    public UserData_getLastLoginDate_1588782313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130663 = new Long(5184635470881147510L);
        term130659 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term130661 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130692 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130709 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130710 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130714 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130775 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130823 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130869 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130659, term130659.getClass(), "id", -6223422928407204267L);
        setLongField(term130661, term130661.getClass(), "id", 2173963419392699484L);
        setField(term130661, term130661.getClass(), "extId", term130663);
        setField(term130661, term130661.getClass(), "luid", "rxVTeZJIuC");
        setIntField(term130678, term130678.getClass(), "year", 2022);
        setShortField(term130678, term130678.getClass(), "month", (short) 2);
        setShortField(term130678, term130678.getClass(), "day", (short) 16);
        setField(term130677, term130677.getClass(), "date", term130678);
        setByteField(term130682, term130682.getClass(), "hour", (byte) 0);
        setByteField(term130682, term130682.getClass(), "minute", (byte) 9);
        setByteField(term130682, term130682.getClass(), "second", (byte) 46);
        setIntField(term130682, term130682.getClass(), "nano", 791140978);
        setField(term130677, term130677.getClass(), "time", term130682);
        setField(term130661, term130661.getClass(), "registerTime", term130677);
        setIntField(term130688, term130688.getClass(), "year", 2012);
        setShortField(term130688, term130688.getClass(), "month", (short) 12);
        setShortField(term130688, term130688.getClass(), "day", (short) 10);
        setField(term130687, term130687.getClass(), "date", term130688);
        setByteField(term130692, term130692.getClass(), "hour", (byte) 11);
        setByteField(term130692, term130692.getClass(), "minute", (byte) 54);
        setByteField(term130692, term130692.getClass(), "second", (byte) 59);
        setIntField(term130692, term130692.getClass(), "nano", 665602693);
        setField(term130687, term130687.getClass(), "time", term130692);
        setField(term130661, term130661.getClass(), "accessTime", term130687);
        setField(term130659, term130659.getClass(), "card", term130661);
        setField(term130659, term130659.getClass(), "userName", "EPpDDOGAQG");
        setIntField(term130710, term130710.getClass(), "year", 2028);
        setShortField(term130710, term130710.getClass(), "month", (short) 2);
        setShortField(term130710, term130710.getClass(), "day", (short) 16);
        setField(term130709, term130709.getClass(), "date", term130710);
        setByteField(term130714, term130714.getClass(), "hour", (byte) 17);
        setByteField(term130714, term130714.getClass(), "minute", (byte) 27);
        setByteField(term130714, term130714.getClass(), "second", (byte) 38);
        setIntField(term130714, term130714.getClass(), "nano", 378395020);
        setField(term130709, term130709.getClass(), "time", term130714);
        setField(term130659, term130659.getClass(), "lastLoginDate", term130709);
        setBooleanField(term130659, term130659.getClass(), "isWebJoin", false);
        setField(term130659, term130659.getClass(), "webLimitDate", "QCvbbAbluL");
        setIntField(term130659, term130659.getClass(), "level", 1622273215);
        setIntField(term130659, term130659.getClass(), "reincarnationNum", 2023282992);
        setField(term130659, term130659.getClass(), "exp", "TCfDANoRXy");
        setLongField(term130659, term130659.getClass(), "point", 7698059415513870721L);
        setLongField(term130659, term130659.getClass(), "totalPoint", -3622313282311155782L);
        setIntField(term130659, term130659.getClass(), "playCount", -854998820);
        setIntField(term130659, term130659.getClass(), "multiPlayCount", 1361637334);
        setIntField(term130659, term130659.getClass(), "multiWinCount", 640213918);
        setIntField(term130659, term130659.getClass(), "requestResCount", -1683063075);
        setIntField(term130659, term130659.getClass(), "acceptResCount", 1391093985);
        setIntField(term130659, term130659.getClass(), "successResCount", -1936658953);
        setIntField(term130659, term130659.getClass(), "playerRating", 758083956);
        setIntField(term130659, term130659.getClass(), "highestRating", 82402802);
        setIntField(term130659, term130659.getClass(), "nameplateId", 83591041);
        setIntField(term130659, term130659.getClass(), "frameId", 149454673);
        setIntField(term130659, term130659.getClass(), "characterId", -392494577);
        setIntField(term130659, term130659.getClass(), "trophyId", -1182169103);
        setIntField(term130659, term130659.getClass(), "playedTutorialBit", 75613974);
        setIntField(term130659, term130659.getClass(), "firstTutorialCancelNum", -184719611);
        setIntField(term130659, term130659.getClass(), "masterTutorialCancelNum", -1275570760);
        setIntField(term130659, term130659.getClass(), "totalRepertoireCount", -1359553558);
        setIntField(term130659, term130659.getClass(), "totalMapNum", -1307021664);
        setLongField(term130659, term130659.getClass(), "totalHiScore", -4007892234713320168L);
        setLongField(term130659, term130659.getClass(), "totalBasicHighScore", -6673616791847296767L);
        setLongField(term130659, term130659.getClass(), "totalAdvancedHighScore", -2571747498538728579L);
        setLongField(term130659, term130659.getClass(), "totalExpertHighScore", 1167523958905554808L);
        setLongField(term130659, term130659.getClass(), "totalMasterHighScore", 5047458066598459178L);
        setIntField(term130771, term130771.getClass(), "year", 2018);
        setShortField(term130771, term130771.getClass(), "month", (short) 9);
        setShortField(term130771, term130771.getClass(), "day", (short) 4);
        setField(term130770, term130770.getClass(), "date", term130771);
        setByteField(term130775, term130775.getClass(), "hour", (byte) 8);
        setByteField(term130775, term130775.getClass(), "minute", (byte) 51);
        setByteField(term130775, term130775.getClass(), "second", (byte) 5);
        setIntField(term130775, term130775.getClass(), "nano", 460408617);
        setField(term130770, term130770.getClass(), "time", term130775);
        setField(term130659, term130659.getClass(), "eventWatchedDate", term130770);
        setIntField(term130659, term130659.getClass(), "friendCount", -202359899);
        setBooleanField(term130659, term130659.getClass(), "isMaimai", false);
        setField(term130659, term130659.getClass(), "firstGameId", "SNBGphBiIl");
        setField(term130659, term130659.getClass(), "firstRomVersion", "RmHGsfbaBq");
        setField(term130659, term130659.getClass(), "firstDataVersion", "RSDlfIpFkY");
        setIntField(term130819, term130819.getClass(), "year", 2025);
        setShortField(term130819, term130819.getClass(), "month", (short) 4);
        setShortField(term130819, term130819.getClass(), "day", (short) 5);
        setField(term130818, term130818.getClass(), "date", term130819);
        setByteField(term130823, term130823.getClass(), "hour", (byte) 3);
        setByteField(term130823, term130823.getClass(), "minute", (byte) 17);
        setByteField(term130823, term130823.getClass(), "second", (byte) 50);
        setIntField(term130823, term130823.getClass(), "nano", 174847283);
        setField(term130818, term130818.getClass(), "time", term130823);
        setField(term130659, term130659.getClass(), "firstPlayDate", term130818);
        setField(term130659, term130659.getClass(), "lastGameId", "ZaTowywgws");
        setField(term130659, term130659.getClass(), "lastRomVersion", "XPrRiBUedX");
        setField(term130659, term130659.getClass(), "lastDataVersion", "kultXgiMsw");
        setIntField(term130865, term130865.getClass(), "year", 2019);
        setShortField(term130865, term130865.getClass(), "month", (short) 8);
        setShortField(term130865, term130865.getClass(), "day", (short) 9);
        setField(term130864, term130864.getClass(), "date", term130865);
        setByteField(term130869, term130869.getClass(), "hour", (byte) 14);
        setByteField(term130869, term130869.getClass(), "minute", (byte) 22);
        setByteField(term130869, term130869.getClass(), "second", (byte) 37);
        setIntField(term130869, term130869.getClass(), "nano", 474796589);
        setField(term130864, term130864.getClass(), "time", term130869);
        setField(term130659, term130659.getClass(), "lastPlayDate", term130864);
        setIntField(term130659, term130659.getClass(), "lastPlaceId", -2145573227);
        setField(term130659, term130659.getClass(), "lastPlaceName", "invWIgTrSn");
        setField(term130659, term130659.getClass(), "lastRegionId", "tdDWYXQBpB");
        setField(term130659, term130659.getClass(), "lastRegionName", "yLbSZvdjZX");
        setField(term130659, term130659.getClass(), "lastAllNetId", "FhCGxrukXm");
        setField(term130659, term130659.getClass(), "lastClientId", "KAmjFnlvKU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term130659, args);
    }

};


