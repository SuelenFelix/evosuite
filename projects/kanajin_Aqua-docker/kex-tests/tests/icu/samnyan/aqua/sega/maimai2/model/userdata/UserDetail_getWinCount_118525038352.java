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

public class UserDetail_getWinCount_118525038352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4258960;

    public UserDetail_getWinCount_118525038352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4258964 = new Long(6005391128356452368L);
        ArrayList term4259025 = new ArrayList();
        Integer term4259031 = new Integer(-1851410176);
        ArrayList term4259029 = new ArrayList();
        ((ArrayList) term4259029).add(term4259031);
        term4258960 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4258962 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4258978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4258979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4258983 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4258988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4258989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4258993 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4258960, term4258960.getClass(), "id", -6535526748310999741L);
        setLongField(term4258962, term4258962.getClass(), "id", -6832512881250995478L);
        setField(term4258962, term4258962.getClass(), "extId", term4258964);
        setField(term4258962, term4258962.getClass(), "luid", "PQrusGKkWa");
        setIntField(term4258979, term4258979.getClass(), "year", 2010);
        setShortField(term4258979, term4258979.getClass(), "month", (short) 6);
        setShortField(term4258979, term4258979.getClass(), "day", (short) 2);
        setField(term4258978, term4258978.getClass(), "date", term4258979);
        setByteField(term4258983, term4258983.getClass(), "hour", (byte) 2);
        setByteField(term4258983, term4258983.getClass(), "minute", (byte) 58);
        setByteField(term4258983, term4258983.getClass(), "second", (byte) 31);
        setIntField(term4258983, term4258983.getClass(), "nano", 386899443);
        setField(term4258978, term4258978.getClass(), "time", term4258983);
        setField(term4258962, term4258962.getClass(), "registerTime", term4258978);
        setIntField(term4258989, term4258989.getClass(), "year", 2020);
        setShortField(term4258989, term4258989.getClass(), "month", (short) 8);
        setShortField(term4258989, term4258989.getClass(), "day", (short) 27);
        setField(term4258988, term4258988.getClass(), "date", term4258989);
        setByteField(term4258993, term4258993.getClass(), "hour", (byte) 19);
        setByteField(term4258993, term4258993.getClass(), "minute", (byte) 44);
        setByteField(term4258993, term4258993.getClass(), "second", (byte) 30);
        setIntField(term4258993, term4258993.getClass(), "nano", 999473715);
        setField(term4258988, term4258988.getClass(), "time", term4258993);
        setField(term4258962, term4258962.getClass(), "accessTime", term4258988);
        setField(term4258960, term4258960.getClass(), "card", term4258962);
        setField(term4258960, term4258960.getClass(), "userName", "dGCxBXUmvK");
        setIntField(term4258960, term4258960.getClass(), "isNetMember", 1343601373);
        setIntField(term4258960, term4258960.getClass(), "iconId", 372917884);
        setIntField(term4258960, term4258960.getClass(), "plateId", 1862312729);
        setIntField(term4258960, term4258960.getClass(), "titleId", 1893136118);
        setIntField(term4258960, term4258960.getClass(), "partnerId", 951750525);
        setIntField(term4258960, term4258960.getClass(), "frameId", 1167606753);
        setIntField(term4258960, term4258960.getClass(), "selectMapId", 1855867004);
        setIntField(term4258960, term4258960.getClass(), "totalAwake", -1864222913);
        setIntField(term4258960, term4258960.getClass(), "gradeRating", -142151945);
        setIntField(term4258960, term4258960.getClass(), "musicRating", 1391633998);
        setIntField(term4258960, term4258960.getClass(), "playerRating", 973452898);
        setIntField(term4258960, term4258960.getClass(), "highestRating", 2019272635);
        setIntField(term4258960, term4258960.getClass(), "gradeRank", 749519073);
        setIntField(term4258960, term4258960.getClass(), "classRank", -1909980301);
        setIntField(term4258960, term4258960.getClass(), "courseRank", 381178161);
        setField(term4258960, term4258960.getClass(), "charaSlot", term4259025);
        setField(term4258960, term4258960.getClass(), "charaLockSlot", term4259029);
        setLongField(term4258960, term4258960.getClass(), "contentBit", -3122841645304724586L);
        setIntField(term4258960, term4258960.getClass(), "playCount", -1588124202);
        setField(term4258960, term4258960.getClass(), "eventWatchedDate", "uaDfjQJxhT");
        setField(term4258960, term4258960.getClass(), "lastGameId", "NkcVYoVcwn");
        setField(term4258960, term4258960.getClass(), "lastRomVersion", "nXxcamGGmQ");
        setField(term4258960, term4258960.getClass(), "lastDataVersion", "BmGrCQvTLF");
        setField(term4258960, term4258960.getClass(), "lastLoginDate", "vUYCMxaPCB");
        setField(term4258960, term4258960.getClass(), "lastPlayDate", "sToReUnNGv");
        setIntField(term4258960, term4258960.getClass(), "lastPlayCredit", 472100001);
        setIntField(term4258960, term4258960.getClass(), "lastPlayMode", -1707087530);
        setIntField(term4258960, term4258960.getClass(), "lastPlaceId", 573126502);
        setField(term4258960, term4258960.getClass(), "lastPlaceName", "wsQhdyptQF");
        setIntField(term4258960, term4258960.getClass(), "lastAllNetId", 2061604049);
        setIntField(term4258960, term4258960.getClass(), "lastRegionId", -479879154);
        setField(term4258960, term4258960.getClass(), "lastRegionName", "UpEAeRlRsT");
        setField(term4258960, term4258960.getClass(), "lastClientId", "DfXFiQMCWc");
        setField(term4258960, term4258960.getClass(), "lastCountryCode", "uPKRhrCklh");
        setIntField(term4258960, term4258960.getClass(), "lastSelectEMoney", 114788895);
        setIntField(term4258960, term4258960.getClass(), "lastSelectTicket", -2032999715);
        setIntField(term4258960, term4258960.getClass(), "lastSelectCourse", 348757937);
        setIntField(term4258960, term4258960.getClass(), "lastCountCourse", 1629133911);
        setField(term4258960, term4258960.getClass(), "firstGameId", "iKguBAJAsV");
        setField(term4258960, term4258960.getClass(), "firstRomVersion", "KklNhlUjXq");
        setField(term4258960, term4258960.getClass(), "firstDataVersion", "CdmGzMFkSn");
        setField(term4258960, term4258960.getClass(), "firstPlayDate", "GZlZYKiHGP");
        setField(term4258960, term4258960.getClass(), "compatibleCmVersion", "VUMqHHiWVz");
        setField(term4258960, term4258960.getClass(), "dailyBonusDate", "gorPFTBtDU");
        setField(term4258960, term4258960.getClass(), "dailyCourseBonusDate", "UtXlwXabpd");
        setField(term4258960, term4258960.getClass(), "lastPairLoginDate", "RrYAbNCyxN");
        setField(term4258960, term4258960.getClass(), "lastTrialPlayDate", "RQlYuakLCQ");
        setIntField(term4258960, term4258960.getClass(), "playVsCount", -393424592);
        setIntField(term4258960, term4258960.getClass(), "playSyncCount", 1563368015);
        setIntField(term4258960, term4258960.getClass(), "winCount", -908188038);
        setIntField(term4258960, term4258960.getClass(), "helpCount", -1950749405);
        setIntField(term4258960, term4258960.getClass(), "comboCount", -1604504199);
        setLongField(term4258960, term4258960.getClass(), "totalDeluxscore", 6011642263126081252L);
        setLongField(term4258960, term4258960.getClass(), "totalBasicDeluxscore", -3913337811080301772L);
        setLongField(term4258960, term4258960.getClass(), "totalAdvancedDeluxscore", 6956740717064747122L);
        setLongField(term4258960, term4258960.getClass(), "totalExpertDeluxscore", 9110153316154062898L);
        setLongField(term4258960, term4258960.getClass(), "totalMasterDeluxscore", 1524836092755839319L);
        setLongField(term4258960, term4258960.getClass(), "totalReMasterDeluxscore", 7109821118924035483L);
        setIntField(term4258960, term4258960.getClass(), "totalSync", 2105407258);
        setIntField(term4258960, term4258960.getClass(), "totalBasicSync", -1450587491);
        setIntField(term4258960, term4258960.getClass(), "totalAdvancedSync", 1004875257);
        setIntField(term4258960, term4258960.getClass(), "totalExpertSync", 2070863113);
        setIntField(term4258960, term4258960.getClass(), "totalMasterSync", 1657865032);
        setIntField(term4258960, term4258960.getClass(), "totalReMasterSync", 1144409774);
        setLongField(term4258960, term4258960.getClass(), "totalAchievement", -103394699044804181L);
        setLongField(term4258960, term4258960.getClass(), "totalBasicAchievement", 7664554758467118265L);
        setLongField(term4258960, term4258960.getClass(), "totalAdvancedAchievement", -7035108765848630601L);
        setLongField(term4258960, term4258960.getClass(), "totalExpertAchievement", 1014029275823985810L);
        setLongField(term4258960, term4258960.getClass(), "totalMasterAchievement", 2221677495659645987L);
        setLongField(term4258960, term4258960.getClass(), "totalReMasterAchievement", 4142565802545208757L);
        setLongField(term4258960, term4258960.getClass(), "playerOldRating", 23161520321617746L);
        setLongField(term4258960, term4258960.getClass(), "playerNewRating", 8802852505829240374L);
        setIntField(term4258960, term4258960.getClass(), "banState", -861683230);
        setLongField(term4258960, term4258960.getClass(), "dateTime", -4736064424388543219L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term4258960, args);
    }

};


