package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserAct_setParam4_86659089418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10905;
     Object term11271;

    public UserAct_setParam4_86659089418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10911 = new Long(-4920224193275732920L);
        ArrayList term10972 = new ArrayList();
        Integer term10978 = new Integer(-1498296052);
        Integer term10980 = new Integer(2098647989);
        Integer term10982 = new Integer(1598895173);
        Integer term10984 = new Integer(1830648570);
        Integer term10986 = new Integer(-227365013);
        Integer term10988 = new Integer(11724947);
        Integer term10990 = new Integer(1953277050);
        Integer term10992 = new Integer(1283079251);
        Integer term10994 = new Integer(-523949691);
        ArrayList term10976 = new ArrayList();
        ((ArrayList) term10976).add(term10978);
        ((ArrayList) term10976).add(term10980);
        ((ArrayList) term10976).add(term10982);
        ((ArrayList) term10976).add(term10984);
        ((ArrayList) term10976).add(term10986);
        ((ArrayList) term10976).add(term10988);
        ((ArrayList) term10976).add(term10990);
        ((ArrayList) term10976).add(term10992);
        ((ArrayList) term10976).add(term10994);
        term10905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term10907 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term10909 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10940 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10905, term10905.getClass(), "id", -2083524977884307536L);
        setLongField(term10907, term10907.getClass(), "id", -2691996476200751382L);
        setLongField(term10909, term10909.getClass(), "id", -3806202176947356197L);
        setField(term10909, term10909.getClass(), "extId", term10911);
        setField(term10909, term10909.getClass(), "luid", "oKwCDqywym");
        setIntField(term10926, term10926.getClass(), "year", 2023);
        setShortField(term10926, term10926.getClass(), "month", (short) 7);
        setShortField(term10926, term10926.getClass(), "day", (short) 16);
        setField(term10925, term10925.getClass(), "date", term10926);
        setByteField(term10930, term10930.getClass(), "hour", (byte) 3);
        setByteField(term10930, term10930.getClass(), "minute", (byte) 1);
        setByteField(term10930, term10930.getClass(), "second", (byte) 19);
        setIntField(term10930, term10930.getClass(), "nano", 488629554);
        setField(term10925, term10925.getClass(), "time", term10930);
        setField(term10909, term10909.getClass(), "registerTime", term10925);
        setIntField(term10936, term10936.getClass(), "year", 2018);
        setShortField(term10936, term10936.getClass(), "month", (short) 7);
        setShortField(term10936, term10936.getClass(), "day", (short) 12);
        setField(term10935, term10935.getClass(), "date", term10936);
        setByteField(term10940, term10940.getClass(), "hour", (byte) 1);
        setByteField(term10940, term10940.getClass(), "minute", (byte) 3);
        setByteField(term10940, term10940.getClass(), "second", (byte) 47);
        setIntField(term10940, term10940.getClass(), "nano", 2729929);
        setField(term10935, term10935.getClass(), "time", term10940);
        setField(term10909, term10909.getClass(), "accessTime", term10935);
        setField(term10907, term10907.getClass(), "card", term10909);
        setField(term10907, term10907.getClass(), "userName", "zjZYTddemL");
        setIntField(term10907, term10907.getClass(), "isNetMember", 934338954);
        setIntField(term10907, term10907.getClass(), "iconId", 598635505);
        setIntField(term10907, term10907.getClass(), "plateId", -944986533);
        setIntField(term10907, term10907.getClass(), "titleId", 1894454926);
        setIntField(term10907, term10907.getClass(), "partnerId", 1415142780);
        setIntField(term10907, term10907.getClass(), "frameId", -574105759);
        setIntField(term10907, term10907.getClass(), "selectMapId", -1165271567);
        setIntField(term10907, term10907.getClass(), "totalAwake", 376834234);
        setIntField(term10907, term10907.getClass(), "gradeRating", -1911972560);
        setIntField(term10907, term10907.getClass(), "musicRating", -642716895);
        setIntField(term10907, term10907.getClass(), "playerRating", 1743398246);
        setIntField(term10907, term10907.getClass(), "highestRating", -934658823);
        setIntField(term10907, term10907.getClass(), "gradeRank", 1632177303);
        setIntField(term10907, term10907.getClass(), "classRank", -802592348);
        setIntField(term10907, term10907.getClass(), "courseRank", -1576584269);
        setField(term10907, term10907.getClass(), "charaSlot", term10972);
        setField(term10907, term10907.getClass(), "charaLockSlot", term10976);
        setLongField(term10907, term10907.getClass(), "contentBit", -5534222035915952617L);
        setIntField(term10907, term10907.getClass(), "playCount", 1474899591);
        setField(term10907, term10907.getClass(), "eventWatchedDate", "QtrylgCLiF");
        setField(term10907, term10907.getClass(), "lastGameId", "orEuhCStGM");
        setField(term10907, term10907.getClass(), "lastRomVersion", "HhEaSXWvrY");
        setField(term10907, term10907.getClass(), "lastDataVersion", "CVRGEomOth");
        setField(term10907, term10907.getClass(), "lastLoginDate", "vSeruUyNWX");
        setField(term10907, term10907.getClass(), "lastPlayDate", "UkKvaeJfEC");
        setIntField(term10907, term10907.getClass(), "lastPlayCredit", 297582552);
        setIntField(term10907, term10907.getClass(), "lastPlayMode", -1485916498);
        setIntField(term10907, term10907.getClass(), "lastPlaceId", 722787672);
        setField(term10907, term10907.getClass(), "lastPlaceName", "WPxXsahPRq");
        setIntField(term10907, term10907.getClass(), "lastAllNetId", 2077491675);
        setIntField(term10907, term10907.getClass(), "lastRegionId", -1728316609);
        setField(term10907, term10907.getClass(), "lastRegionName", "IENRuqmwUU");
        setField(term10907, term10907.getClass(), "lastClientId", "GsWxOwXvSu");
        setField(term10907, term10907.getClass(), "lastCountryCode", "bKBSncrMEZ");
        setIntField(term10907, term10907.getClass(), "lastSelectEMoney", 47118909);
        setIntField(term10907, term10907.getClass(), "lastSelectTicket", -2093707412);
        setIntField(term10907, term10907.getClass(), "lastSelectCourse", -680627153);
        setIntField(term10907, term10907.getClass(), "lastCountCourse", 722519669);
        setField(term10907, term10907.getClass(), "firstGameId", "yeSXGqQExb");
        setField(term10907, term10907.getClass(), "firstRomVersion", "uXYcXVYJZM");
        setField(term10907, term10907.getClass(), "firstDataVersion", "BJhjdJUhkz");
        setField(term10907, term10907.getClass(), "firstPlayDate", "cdHYQDgUZR");
        setField(term10907, term10907.getClass(), "compatibleCmVersion", "KAORSSPSeV");
        setField(term10907, term10907.getClass(), "dailyBonusDate", "UimMMORkzd");
        setField(term10907, term10907.getClass(), "dailyCourseBonusDate", "huVIXUWLtI");
        setField(term10907, term10907.getClass(), "lastPairLoginDate", "vhKzFyKPOT");
        setField(term10907, term10907.getClass(), "lastTrialPlayDate", "nQhIgWXdRc");
        setIntField(term10907, term10907.getClass(), "playVsCount", -40335961);
        setIntField(term10907, term10907.getClass(), "playSyncCount", 175343605);
        setIntField(term10907, term10907.getClass(), "winCount", 1050853183);
        setIntField(term10907, term10907.getClass(), "helpCount", 848428785);
        setIntField(term10907, term10907.getClass(), "comboCount", -1984436481);
        setLongField(term10907, term10907.getClass(), "totalDeluxscore", 8073378116544724166L);
        setLongField(term10907, term10907.getClass(), "totalBasicDeluxscore", -8303973304709662279L);
        setLongField(term10907, term10907.getClass(), "totalAdvancedDeluxscore", 6853972830905120647L);
        setLongField(term10907, term10907.getClass(), "totalExpertDeluxscore", 1442167273909860961L);
        setLongField(term10907, term10907.getClass(), "totalMasterDeluxscore", 6895382576300001141L);
        setLongField(term10907, term10907.getClass(), "totalReMasterDeluxscore", 9062006526792682783L);
        setIntField(term10907, term10907.getClass(), "totalSync", -407582855);
        setIntField(term10907, term10907.getClass(), "totalBasicSync", 1190753616);
        setIntField(term10907, term10907.getClass(), "totalAdvancedSync", -752378450);
        setIntField(term10907, term10907.getClass(), "totalExpertSync", 848907965);
        setIntField(term10907, term10907.getClass(), "totalMasterSync", 1865070548);
        setIntField(term10907, term10907.getClass(), "totalReMasterSync", 1904515443);
        setLongField(term10907, term10907.getClass(), "totalAchievement", -7400951017937830861L);
        setLongField(term10907, term10907.getClass(), "totalBasicAchievement", -8993073054427011802L);
        setLongField(term10907, term10907.getClass(), "totalAdvancedAchievement", 2287785643837657068L);
        setLongField(term10907, term10907.getClass(), "totalExpertAchievement", -7283193381993602128L);
        setLongField(term10907, term10907.getClass(), "totalMasterAchievement", 6351887424140565471L);
        setLongField(term10907, term10907.getClass(), "totalReMasterAchievement", 6273670659288205855L);
        setLongField(term10907, term10907.getClass(), "playerOldRating", -4776514981294468834L);
        setLongField(term10907, term10907.getClass(), "playerNewRating", -7273680182770718108L);
        setIntField(term10907, term10907.getClass(), "banState", 1361126430);
        setLongField(term10907, term10907.getClass(), "dateTime", -421166328269063791L);
        setField(term10905, term10905.getClass(), "user", term10907);
        setIntField(term10905, term10905.getClass(), "kind", 1728588701);
        setIntField(term10905, term10905.getClass(), "activityId", -355769268);
        setLongField(term10905, term10905.getClass(), "sortNumber", 4811527754205378980L);
        setIntField(term10905, term10905.getClass(), "param1", -114460662);
        setIntField(term10905, term10905.getClass(), "param2", -355376034);
        setIntField(term10905, term10905.getClass(), "param3", 588390599);
        setIntField(term10905, term10905.getClass(), "param4", -95969566);
        term11271 = new Integer(-68615285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11271;
        callMethod(klass, "setParam4", argTypes, term10905, args);
    }

};


