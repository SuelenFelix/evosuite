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

public class UserCharge_getValidDate_6761715546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124018;

    public UserCharge_getValidDate_6761715546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124024 = new Long(9205327385733285058L);
        Integer term124087 = new Integer(1677171453);
        ArrayList term124085 = new ArrayList();
        ((ArrayList) term124085).add(term124087);
        Integer term124093 = new Integer(-2108979704);
        Integer term124095 = new Integer(1629835601);
        Integer term124097 = new Integer(1866184476);
        Integer term124099 = new Integer(-17998574);
        Integer term124101 = new Integer(145080354);
        ArrayList term124091 = new ArrayList();
        ((ArrayList) term124091).add(term124093);
        ((ArrayList) term124091).add(term124095);
        ((ArrayList) term124091).add(term124097);
        ((ArrayList) term124091).add(term124099);
        ((ArrayList) term124091).add(term124101);
        term124018 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term124020 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term124022 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124053 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124018, term124018.getClass(), "id", -9026849565527391227L);
        setLongField(term124020, term124020.getClass(), "id", -5639012319234864257L);
        setLongField(term124022, term124022.getClass(), "id", 3226886549938182892L);
        setField(term124022, term124022.getClass(), "extId", term124024);
        setField(term124022, term124022.getClass(), "luid", "GBSKSryDNr");
        setIntField(term124039, term124039.getClass(), "year", 2029);
        setShortField(term124039, term124039.getClass(), "month", (short) 10);
        setShortField(term124039, term124039.getClass(), "day", (short) 12);
        setField(term124038, term124038.getClass(), "date", term124039);
        setByteField(term124043, term124043.getClass(), "hour", (byte) 12);
        setByteField(term124043, term124043.getClass(), "minute", (byte) 8);
        setByteField(term124043, term124043.getClass(), "second", (byte) 27);
        setIntField(term124043, term124043.getClass(), "nano", 729635487);
        setField(term124038, term124038.getClass(), "time", term124043);
        setField(term124022, term124022.getClass(), "registerTime", term124038);
        setIntField(term124049, term124049.getClass(), "year", 2015);
        setShortField(term124049, term124049.getClass(), "month", (short) 3);
        setShortField(term124049, term124049.getClass(), "day", (short) 29);
        setField(term124048, term124048.getClass(), "date", term124049);
        setByteField(term124053, term124053.getClass(), "hour", (byte) 23);
        setByteField(term124053, term124053.getClass(), "minute", (byte) 1);
        setByteField(term124053, term124053.getClass(), "second", (byte) 57);
        setIntField(term124053, term124053.getClass(), "nano", 425020447);
        setField(term124048, term124048.getClass(), "time", term124053);
        setField(term124022, term124022.getClass(), "accessTime", term124048);
        setField(term124020, term124020.getClass(), "card", term124022);
        setField(term124020, term124020.getClass(), "userName", "lewYJfdwbu");
        setIntField(term124020, term124020.getClass(), "isNetMember", -921428041);
        setIntField(term124020, term124020.getClass(), "iconId", 61264180);
        setIntField(term124020, term124020.getClass(), "plateId", -1036194324);
        setIntField(term124020, term124020.getClass(), "titleId", -486471150);
        setIntField(term124020, term124020.getClass(), "partnerId", 837208909);
        setIntField(term124020, term124020.getClass(), "frameId", 1016033285);
        setIntField(term124020, term124020.getClass(), "selectMapId", -1981879284);
        setIntField(term124020, term124020.getClass(), "totalAwake", -1922383305);
        setIntField(term124020, term124020.getClass(), "gradeRating", -1515149854);
        setIntField(term124020, term124020.getClass(), "musicRating", 2127902475);
        setIntField(term124020, term124020.getClass(), "playerRating", -974929860);
        setIntField(term124020, term124020.getClass(), "highestRating", -229722367);
        setIntField(term124020, term124020.getClass(), "gradeRank", 46745820);
        setIntField(term124020, term124020.getClass(), "classRank", 521784908);
        setIntField(term124020, term124020.getClass(), "courseRank", -716648067);
        setField(term124020, term124020.getClass(), "charaSlot", term124085);
        setField(term124020, term124020.getClass(), "charaLockSlot", term124091);
        setLongField(term124020, term124020.getClass(), "contentBit", -7259275759445296815L);
        setIntField(term124020, term124020.getClass(), "playCount", 100573346);
        setField(term124020, term124020.getClass(), "eventWatchedDate", "wmCdnKXFIV");
        setField(term124020, term124020.getClass(), "lastGameId", "OQFYTZSsmT");
        setField(term124020, term124020.getClass(), "lastRomVersion", "sERwhJnfhH");
        setField(term124020, term124020.getClass(), "lastDataVersion", "ttMftcuYTC");
        setField(term124020, term124020.getClass(), "lastLoginDate", "ktSwbNnkjp");
        setField(term124020, term124020.getClass(), "lastPlayDate", "GnPQSLhuqc");
        setIntField(term124020, term124020.getClass(), "lastPlayCredit", 72576894);
        setIntField(term124020, term124020.getClass(), "lastPlayMode", 1802709528);
        setIntField(term124020, term124020.getClass(), "lastPlaceId", 625411236);
        setField(term124020, term124020.getClass(), "lastPlaceName", "mfxNrcSOVD");
        setIntField(term124020, term124020.getClass(), "lastAllNetId", 1278363908);
        setIntField(term124020, term124020.getClass(), "lastRegionId", 1679478889);
        setField(term124020, term124020.getClass(), "lastRegionName", "jrsTEswExz");
        setField(term124020, term124020.getClass(), "lastClientId", "ZQJeRspiaW");
        setField(term124020, term124020.getClass(), "lastCountryCode", "ZPHvVTleEx");
        setIntField(term124020, term124020.getClass(), "lastSelectEMoney", 1711128633);
        setIntField(term124020, term124020.getClass(), "lastSelectTicket", 558898048);
        setIntField(term124020, term124020.getClass(), "lastSelectCourse", -1751947747);
        setIntField(term124020, term124020.getClass(), "lastCountCourse", 750226278);
        setField(term124020, term124020.getClass(), "firstGameId", "HTaevTdmSx");
        setField(term124020, term124020.getClass(), "firstRomVersion", "fxACzuCTdG");
        setField(term124020, term124020.getClass(), "firstDataVersion", "ZbjykDvTqF");
        setField(term124020, term124020.getClass(), "firstPlayDate", "HmpRVfDNrn");
        setField(term124020, term124020.getClass(), "compatibleCmVersion", "PdGPETcyXN");
        setField(term124020, term124020.getClass(), "dailyBonusDate", "rWXLyvesHI");
        setField(term124020, term124020.getClass(), "dailyCourseBonusDate", "iRfJJNrMLZ");
        setField(term124020, term124020.getClass(), "lastPairLoginDate", "sYrnlJNHsq");
        setField(term124020, term124020.getClass(), "lastTrialPlayDate", "POHTKvZAAU");
        setIntField(term124020, term124020.getClass(), "playVsCount", -1153409944);
        setIntField(term124020, term124020.getClass(), "playSyncCount", 1063281217);
        setIntField(term124020, term124020.getClass(), "winCount", 981222791);
        setIntField(term124020, term124020.getClass(), "helpCount", 1297362786);
        setIntField(term124020, term124020.getClass(), "comboCount", -1701558271);
        setLongField(term124020, term124020.getClass(), "totalDeluxscore", 2146205273504422497L);
        setLongField(term124020, term124020.getClass(), "totalBasicDeluxscore", -6170196256774544832L);
        setLongField(term124020, term124020.getClass(), "totalAdvancedDeluxscore", -3949902082933699941L);
        setLongField(term124020, term124020.getClass(), "totalExpertDeluxscore", -611126419518448657L);
        setLongField(term124020, term124020.getClass(), "totalMasterDeluxscore", 3498203783805987897L);
        setLongField(term124020, term124020.getClass(), "totalReMasterDeluxscore", 1448097862876060784L);
        setIntField(term124020, term124020.getClass(), "totalSync", 1777553175);
        setIntField(term124020, term124020.getClass(), "totalBasicSync", 1321016655);
        setIntField(term124020, term124020.getClass(), "totalAdvancedSync", -893412167);
        setIntField(term124020, term124020.getClass(), "totalExpertSync", 985381114);
        setIntField(term124020, term124020.getClass(), "totalMasterSync", 2091907097);
        setIntField(term124020, term124020.getClass(), "totalReMasterSync", 589633036);
        setLongField(term124020, term124020.getClass(), "totalAchievement", 8557138019134828645L);
        setLongField(term124020, term124020.getClass(), "totalBasicAchievement", -4452401102510626548L);
        setLongField(term124020, term124020.getClass(), "totalAdvancedAchievement", -8645820241213403338L);
        setLongField(term124020, term124020.getClass(), "totalExpertAchievement", 2816249404742724931L);
        setLongField(term124020, term124020.getClass(), "totalMasterAchievement", 1884132702816460886L);
        setLongField(term124020, term124020.getClass(), "totalReMasterAchievement", -146957100924633583L);
        setLongField(term124020, term124020.getClass(), "playerOldRating", -2066293017654650396L);
        setLongField(term124020, term124020.getClass(), "playerNewRating", -7667306510947529358L);
        setIntField(term124020, term124020.getClass(), "banState", 608454583);
        setLongField(term124020, term124020.getClass(), "dateTime", 2125142245553494427L);
        setField(term124018, term124018.getClass(), "user", term124020);
        setIntField(term124018, term124018.getClass(), "chargeId", -117720047);
        setIntField(term124018, term124018.getClass(), "stock", -892566680);
        setField(term124018, term124018.getClass(), "purchaseDate", "HSQaALDFNu");
        setField(term124018, term124018.getClass(), "validDate", "aOaXBQyJal");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValidDate", argTypes, term124018, args);
    }

};


