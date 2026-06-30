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

public class UserGeneralData_canEqual_71840517810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307688;
     Object term307990;

    public UserGeneralData_canEqual_71840517810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term307694 = new Long(-1486519351300660432L);
        term307688 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term307690 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term307692 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term307708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307723 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307900 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term307688, term307688.getClass(), "id", -8345234984232913153L);
        setLongField(term307690, term307690.getClass(), "id", -2442368390326309307L);
        setLongField(term307692, term307692.getClass(), "id", 7572573105910581497L);
        setField(term307692, term307692.getClass(), "extId", term307694);
        setField(term307692, term307692.getClass(), "luid", "mJAIaSwRTZ");
        setIntField(term307709, term307709.getClass(), "year", 2011);
        setShortField(term307709, term307709.getClass(), "month", (short) 10);
        setShortField(term307709, term307709.getClass(), "day", (short) 12);
        setField(term307708, term307708.getClass(), "date", term307709);
        setByteField(term307713, term307713.getClass(), "hour", (byte) 10);
        setByteField(term307713, term307713.getClass(), "minute", (byte) 39);
        setByteField(term307713, term307713.getClass(), "second", (byte) 2);
        setIntField(term307713, term307713.getClass(), "nano", 859833019);
        setField(term307708, term307708.getClass(), "time", term307713);
        setField(term307692, term307692.getClass(), "registerTime", term307708);
        setIntField(term307719, term307719.getClass(), "year", 2019);
        setShortField(term307719, term307719.getClass(), "month", (short) 1);
        setShortField(term307719, term307719.getClass(), "day", (short) 12);
        setField(term307718, term307718.getClass(), "date", term307719);
        setByteField(term307723, term307723.getClass(), "hour", (byte) 3);
        setByteField(term307723, term307723.getClass(), "minute", (byte) 42);
        setByteField(term307723, term307723.getClass(), "second", (byte) 47);
        setIntField(term307723, term307723.getClass(), "nano", 224181908);
        setField(term307718, term307718.getClass(), "time", term307723);
        setField(term307692, term307692.getClass(), "accessTime", term307718);
        setField(term307690, term307690.getClass(), "card", term307692);
        setField(term307690, term307690.getClass(), "userName", "SHSHsYUaOc");
        setIntField(term307741, term307741.getClass(), "year", 2023);
        setShortField(term307741, term307741.getClass(), "month", (short) 6);
        setShortField(term307741, term307741.getClass(), "day", (short) 1);
        setField(term307740, term307740.getClass(), "date", term307741);
        setByteField(term307745, term307745.getClass(), "hour", (byte) 3);
        setByteField(term307745, term307745.getClass(), "minute", (byte) 50);
        setByteField(term307745, term307745.getClass(), "second", (byte) 38);
        setIntField(term307745, term307745.getClass(), "nano", 666744386);
        setField(term307740, term307740.getClass(), "time", term307745);
        setField(term307690, term307690.getClass(), "lastLoginDate", term307740);
        setBooleanField(term307690, term307690.getClass(), "isWebJoin", false);
        setField(term307690, term307690.getClass(), "webLimitDate", "jXMTXHvttw");
        setIntField(term307690, term307690.getClass(), "level", -717365307);
        setIntField(term307690, term307690.getClass(), "reincarnationNum", 1581920815);
        setField(term307690, term307690.getClass(), "exp", "WOqkLnLgei");
        setLongField(term307690, term307690.getClass(), "point", -6674527660526749596L);
        setLongField(term307690, term307690.getClass(), "totalPoint", 1256500349564726688L);
        setIntField(term307690, term307690.getClass(), "playCount", -59811391);
        setIntField(term307690, term307690.getClass(), "multiPlayCount", -1196302168);
        setIntField(term307690, term307690.getClass(), "multiWinCount", 78919121);
        setIntField(term307690, term307690.getClass(), "requestResCount", -526768095);
        setIntField(term307690, term307690.getClass(), "acceptResCount", -1453641510);
        setIntField(term307690, term307690.getClass(), "successResCount", 1963023357);
        setIntField(term307690, term307690.getClass(), "playerRating", -47434320);
        setIntField(term307690, term307690.getClass(), "highestRating", 1237862596);
        setIntField(term307690, term307690.getClass(), "nameplateId", -1393307484);
        setIntField(term307690, term307690.getClass(), "frameId", -1622786371);
        setIntField(term307690, term307690.getClass(), "characterId", -227208597);
        setIntField(term307690, term307690.getClass(), "trophyId", 1224191712);
        setIntField(term307690, term307690.getClass(), "playedTutorialBit", -635900964);
        setIntField(term307690, term307690.getClass(), "firstTutorialCancelNum", -257307819);
        setIntField(term307690, term307690.getClass(), "masterTutorialCancelNum", 2121002514);
        setIntField(term307690, term307690.getClass(), "totalRepertoireCount", 116421144);
        setIntField(term307690, term307690.getClass(), "totalMapNum", 1133487857);
        setLongField(term307690, term307690.getClass(), "totalHiScore", -4864013709685046559L);
        setLongField(term307690, term307690.getClass(), "totalBasicHighScore", 4955370853212845591L);
        setLongField(term307690, term307690.getClass(), "totalAdvancedHighScore", 9223314585031555854L);
        setLongField(term307690, term307690.getClass(), "totalExpertHighScore", -9155416892107621510L);
        setLongField(term307690, term307690.getClass(), "totalMasterHighScore", -5044427064349686382L);
        setIntField(term307802, term307802.getClass(), "year", 2014);
        setShortField(term307802, term307802.getClass(), "month", (short) 12);
        setShortField(term307802, term307802.getClass(), "day", (short) 9);
        setField(term307801, term307801.getClass(), "date", term307802);
        setByteField(term307806, term307806.getClass(), "hour", (byte) 5);
        setByteField(term307806, term307806.getClass(), "minute", (byte) 14);
        setByteField(term307806, term307806.getClass(), "second", (byte) 42);
        setIntField(term307806, term307806.getClass(), "nano", 124347514);
        setField(term307801, term307801.getClass(), "time", term307806);
        setField(term307690, term307690.getClass(), "eventWatchedDate", term307801);
        setIntField(term307690, term307690.getClass(), "friendCount", -589717643);
        setBooleanField(term307690, term307690.getClass(), "isMaimai", false);
        setField(term307690, term307690.getClass(), "firstGameId", "xiCFEluOSq");
        setField(term307690, term307690.getClass(), "firstRomVersion", "EDeReFiqFY");
        setField(term307690, term307690.getClass(), "firstDataVersion", "uWHxeGcEwu");
        setIntField(term307850, term307850.getClass(), "year", 2019);
        setShortField(term307850, term307850.getClass(), "month", (short) 7);
        setShortField(term307850, term307850.getClass(), "day", (short) 6);
        setField(term307849, term307849.getClass(), "date", term307850);
        setByteField(term307854, term307854.getClass(), "hour", (byte) 3);
        setByteField(term307854, term307854.getClass(), "minute", (byte) 16);
        setByteField(term307854, term307854.getClass(), "second", (byte) 55);
        setIntField(term307854, term307854.getClass(), "nano", 392601826);
        setField(term307849, term307849.getClass(), "time", term307854);
        setField(term307690, term307690.getClass(), "firstPlayDate", term307849);
        setField(term307690, term307690.getClass(), "lastGameId", "GVkEKlhcrr");
        setField(term307690, term307690.getClass(), "lastRomVersion", "uNKWJhnHHl");
        setField(term307690, term307690.getClass(), "lastDataVersion", "wjhYcpvRUu");
        setIntField(term307896, term307896.getClass(), "year", 2017);
        setShortField(term307896, term307896.getClass(), "month", (short) 5);
        setShortField(term307896, term307896.getClass(), "day", (short) 18);
        setField(term307895, term307895.getClass(), "date", term307896);
        setByteField(term307900, term307900.getClass(), "hour", (byte) 23);
        setByteField(term307900, term307900.getClass(), "minute", (byte) 12);
        setByteField(term307900, term307900.getClass(), "second", (byte) 11);
        setIntField(term307900, term307900.getClass(), "nano", 538700708);
        setField(term307895, term307895.getClass(), "time", term307900);
        setField(term307690, term307690.getClass(), "lastPlayDate", term307895);
        setIntField(term307690, term307690.getClass(), "lastPlaceId", -955082715);
        setField(term307690, term307690.getClass(), "lastPlaceName", "YqeXdoWJfV");
        setField(term307690, term307690.getClass(), "lastRegionId", "qEABplGAwB");
        setField(term307690, term307690.getClass(), "lastRegionName", "crdvuBefUh");
        setField(term307690, term307690.getClass(), "lastAllNetId", "DmSGIaLFxy");
        setField(term307690, term307690.getClass(), "lastClientId", "EIfTZcAWvK");
        setField(term307688, term307688.getClass(), "user", term307690);
        setField(term307688, term307688.getClass(), "propertyKey", "UTxMkvUfrZ");
        setField(term307688, term307688.getClass(), "propertyValue", "NQsrTzOjPP");
        term307990 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term307990;
        callMethod(klass, "canEqual", argTypes, term307688, args);
    }

};


