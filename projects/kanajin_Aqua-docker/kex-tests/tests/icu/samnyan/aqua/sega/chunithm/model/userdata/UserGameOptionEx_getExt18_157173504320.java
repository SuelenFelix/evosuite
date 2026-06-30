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

public class UserGameOptionEx_getExt18_157173504320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318543;

    public UserGameOptionEx_getExt18_157173504320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318549 = new Long(1909175111101717943L);
        term318543 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term318545 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term318547 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term318563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318661 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318755 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term318543, term318543.getClass(), "id", 3361198376644316821L);
        setLongField(term318545, term318545.getClass(), "id", -2596368385325108340L);
        setLongField(term318547, term318547.getClass(), "id", -9006683565777348144L);
        setField(term318547, term318547.getClass(), "extId", term318549);
        setField(term318547, term318547.getClass(), "luid", "OQwMSrFmSo");
        setIntField(term318564, term318564.getClass(), "year", 2030);
        setShortField(term318564, term318564.getClass(), "month", (short) 1);
        setShortField(term318564, term318564.getClass(), "day", (short) 1);
        setField(term318563, term318563.getClass(), "date", term318564);
        setByteField(term318568, term318568.getClass(), "hour", (byte) 10);
        setByteField(term318568, term318568.getClass(), "minute", (byte) 46);
        setByteField(term318568, term318568.getClass(), "second", (byte) 34);
        setIntField(term318568, term318568.getClass(), "nano", 939728529);
        setField(term318563, term318563.getClass(), "time", term318568);
        setField(term318547, term318547.getClass(), "registerTime", term318563);
        setIntField(term318574, term318574.getClass(), "year", 2023);
        setShortField(term318574, term318574.getClass(), "month", (short) 5);
        setShortField(term318574, term318574.getClass(), "day", (short) 12);
        setField(term318573, term318573.getClass(), "date", term318574);
        setByteField(term318578, term318578.getClass(), "hour", (byte) 8);
        setByteField(term318578, term318578.getClass(), "minute", (byte) 27);
        setByteField(term318578, term318578.getClass(), "second", (byte) 2);
        setIntField(term318578, term318578.getClass(), "nano", 788184911);
        setField(term318573, term318573.getClass(), "time", term318578);
        setField(term318547, term318547.getClass(), "accessTime", term318573);
        setField(term318545, term318545.getClass(), "card", term318547);
        setField(term318545, term318545.getClass(), "userName", "iIxzLmizFZ");
        setIntField(term318596, term318596.getClass(), "year", 2015);
        setShortField(term318596, term318596.getClass(), "month", (short) 10);
        setShortField(term318596, term318596.getClass(), "day", (short) 1);
        setField(term318595, term318595.getClass(), "date", term318596);
        setByteField(term318600, term318600.getClass(), "hour", (byte) 15);
        setByteField(term318600, term318600.getClass(), "minute", (byte) 7);
        setByteField(term318600, term318600.getClass(), "second", (byte) 5);
        setIntField(term318600, term318600.getClass(), "nano", 80960799);
        setField(term318595, term318595.getClass(), "time", term318600);
        setField(term318545, term318545.getClass(), "lastLoginDate", term318595);
        setBooleanField(term318545, term318545.getClass(), "isWebJoin", true);
        setField(term318545, term318545.getClass(), "webLimitDate", "nirCEPCEzD");
        setIntField(term318545, term318545.getClass(), "level", -1254576977);
        setIntField(term318545, term318545.getClass(), "reincarnationNum", -1258344496);
        setField(term318545, term318545.getClass(), "exp", "wPRvAQKTop");
        setLongField(term318545, term318545.getClass(), "point", 6564495724575130929L);
        setLongField(term318545, term318545.getClass(), "totalPoint", -8620792848897119300L);
        setIntField(term318545, term318545.getClass(), "playCount", -1827033542);
        setIntField(term318545, term318545.getClass(), "multiPlayCount", -1247831869);
        setIntField(term318545, term318545.getClass(), "multiWinCount", 1449688423);
        setIntField(term318545, term318545.getClass(), "requestResCount", -1845034925);
        setIntField(term318545, term318545.getClass(), "acceptResCount", 994445695);
        setIntField(term318545, term318545.getClass(), "successResCount", -492928823);
        setIntField(term318545, term318545.getClass(), "playerRating", 1368633048);
        setIntField(term318545, term318545.getClass(), "highestRating", -1444516296);
        setIntField(term318545, term318545.getClass(), "nameplateId", 308255845);
        setIntField(term318545, term318545.getClass(), "frameId", -988334088);
        setIntField(term318545, term318545.getClass(), "characterId", 1129188729);
        setIntField(term318545, term318545.getClass(), "trophyId", -751261444);
        setIntField(term318545, term318545.getClass(), "playedTutorialBit", -1117817445);
        setIntField(term318545, term318545.getClass(), "firstTutorialCancelNum", 1230680785);
        setIntField(term318545, term318545.getClass(), "masterTutorialCancelNum", 1940583073);
        setIntField(term318545, term318545.getClass(), "totalRepertoireCount", 1524271170);
        setIntField(term318545, term318545.getClass(), "totalMapNum", 1281890678);
        setLongField(term318545, term318545.getClass(), "totalHiScore", 9102003843549749951L);
        setLongField(term318545, term318545.getClass(), "totalBasicHighScore", 5989562756283635902L);
        setLongField(term318545, term318545.getClass(), "totalAdvancedHighScore", -4456338403298981816L);
        setLongField(term318545, term318545.getClass(), "totalExpertHighScore", 3322189457255921095L);
        setLongField(term318545, term318545.getClass(), "totalMasterHighScore", -7448875288248747337L);
        setIntField(term318657, term318657.getClass(), "year", 2015);
        setShortField(term318657, term318657.getClass(), "month", (short) 12);
        setShortField(term318657, term318657.getClass(), "day", (short) 22);
        setField(term318656, term318656.getClass(), "date", term318657);
        setByteField(term318661, term318661.getClass(), "hour", (byte) 0);
        setByteField(term318661, term318661.getClass(), "minute", (byte) 55);
        setByteField(term318661, term318661.getClass(), "second", (byte) 8);
        setIntField(term318661, term318661.getClass(), "nano", 555515689);
        setField(term318656, term318656.getClass(), "time", term318661);
        setField(term318545, term318545.getClass(), "eventWatchedDate", term318656);
        setIntField(term318545, term318545.getClass(), "friendCount", -625924102);
        setBooleanField(term318545, term318545.getClass(), "isMaimai", true);
        setField(term318545, term318545.getClass(), "firstGameId", "OhnhYqFRhK");
        setField(term318545, term318545.getClass(), "firstRomVersion", "muqzcvKPzU");
        setField(term318545, term318545.getClass(), "firstDataVersion", "LIfRcijYBP");
        setIntField(term318705, term318705.getClass(), "year", 2025);
        setShortField(term318705, term318705.getClass(), "month", (short) 3);
        setShortField(term318705, term318705.getClass(), "day", (short) 1);
        setField(term318704, term318704.getClass(), "date", term318705);
        setByteField(term318709, term318709.getClass(), "hour", (byte) 0);
        setByteField(term318709, term318709.getClass(), "minute", (byte) 34);
        setByteField(term318709, term318709.getClass(), "second", (byte) 59);
        setIntField(term318709, term318709.getClass(), "nano", 447141493);
        setField(term318704, term318704.getClass(), "time", term318709);
        setField(term318545, term318545.getClass(), "firstPlayDate", term318704);
        setField(term318545, term318545.getClass(), "lastGameId", "UWfjAouyWX");
        setField(term318545, term318545.getClass(), "lastRomVersion", "lXEruUZEjX");
        setField(term318545, term318545.getClass(), "lastDataVersion", "BMZYmMvpIa");
        setIntField(term318751, term318751.getClass(), "year", 2014);
        setShortField(term318751, term318751.getClass(), "month", (short) 6);
        setShortField(term318751, term318751.getClass(), "day", (short) 27);
        setField(term318750, term318750.getClass(), "date", term318751);
        setByteField(term318755, term318755.getClass(), "hour", (byte) 19);
        setByteField(term318755, term318755.getClass(), "minute", (byte) 7);
        setByteField(term318755, term318755.getClass(), "second", (byte) 4);
        setIntField(term318755, term318755.getClass(), "nano", 44526354);
        setField(term318750, term318750.getClass(), "time", term318755);
        setField(term318545, term318545.getClass(), "lastPlayDate", term318750);
        setIntField(term318545, term318545.getClass(), "lastPlaceId", 695176233);
        setField(term318545, term318545.getClass(), "lastPlaceName", "vpVENawnlE");
        setField(term318545, term318545.getClass(), "lastRegionId", "dgciCbbLcm");
        setField(term318545, term318545.getClass(), "lastRegionName", "MaoZhZpQjB");
        setField(term318545, term318545.getClass(), "lastAllNetId", "geQbYhZCon");
        setField(term318545, term318545.getClass(), "lastClientId", "csWAyLZbkB");
        setField(term318543, term318543.getClass(), "user", term318545);
        setIntField(term318543, term318543.getClass(), "ext1", -538942305);
        setIntField(term318543, term318543.getClass(), "ext2", 2125548603);
        setIntField(term318543, term318543.getClass(), "ext3", -1792522449);
        setIntField(term318543, term318543.getClass(), "ext4", 1697610319);
        setIntField(term318543, term318543.getClass(), "ext5", -87021135);
        setIntField(term318543, term318543.getClass(), "ext6", 619691165);
        setIntField(term318543, term318543.getClass(), "ext7", -124163210);
        setIntField(term318543, term318543.getClass(), "ext8", 200992733);
        setIntField(term318543, term318543.getClass(), "ext9", 1285682550);
        setIntField(term318543, term318543.getClass(), "ext10", -852602236);
        setIntField(term318543, term318543.getClass(), "ext11", -442221418);
        setIntField(term318543, term318543.getClass(), "ext12", 974356617);
        setIntField(term318543, term318543.getClass(), "ext13", 660265178);
        setIntField(term318543, term318543.getClass(), "ext14", 1982277135);
        setIntField(term318543, term318543.getClass(), "ext15", 405631945);
        setIntField(term318543, term318543.getClass(), "ext16", -1114642017);
        setIntField(term318543, term318543.getClass(), "ext17", 322604433);
        setIntField(term318543, term318543.getClass(), "ext18", -863608100);
        setIntField(term318543, term318543.getClass(), "ext19", -809977936);
        setIntField(term318543, term318543.getClass(), "ext20", -584343331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt18", argTypes, term318543, args);
    }

};


