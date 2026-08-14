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

public class UserDetail_getLastPlayCredit_50292758328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211436;

    public UserDetail_getLastPlayCredit_50292758328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term211440 = new Long(-1465819833800717311L);
        Integer term211503 = new Integer(1016118972);
        Integer term211505 = new Integer(1276607451);
        ArrayList term211501 = new ArrayList();
        ((ArrayList) term211501).add(term211503);
        ((ArrayList) term211501).add(term211505);
        ArrayList term211509 = new ArrayList();
        term211436 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term211438 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term211454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term211464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211469 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term211436, term211436.getClass(), "id", -2649346725715360483L);
        setLongField(term211438, term211438.getClass(), "id", 5116248057543182857L);
        setField(term211438, term211438.getClass(), "extId", term211440);
        setField(term211438, term211438.getClass(), "luid", "JMrNmyCgHl");
        setIntField(term211455, term211455.getClass(), "year", 2010);
        setShortField(term211455, term211455.getClass(), "month", (short) 11);
        setShortField(term211455, term211455.getClass(), "day", (short) 7);
        setField(term211454, term211454.getClass(), "date", term211455);
        setByteField(term211459, term211459.getClass(), "hour", (byte) 17);
        setByteField(term211459, term211459.getClass(), "minute", (byte) 2);
        setByteField(term211459, term211459.getClass(), "second", (byte) 45);
        setIntField(term211459, term211459.getClass(), "nano", 891551261);
        setField(term211454, term211454.getClass(), "time", term211459);
        setField(term211438, term211438.getClass(), "registerTime", term211454);
        setIntField(term211465, term211465.getClass(), "year", 2018);
        setShortField(term211465, term211465.getClass(), "month", (short) 4);
        setShortField(term211465, term211465.getClass(), "day", (short) 19);
        setField(term211464, term211464.getClass(), "date", term211465);
        setByteField(term211469, term211469.getClass(), "hour", (byte) 14);
        setByteField(term211469, term211469.getClass(), "minute", (byte) 21);
        setByteField(term211469, term211469.getClass(), "second", (byte) 19);
        setIntField(term211469, term211469.getClass(), "nano", 997536814);
        setField(term211464, term211464.getClass(), "time", term211469);
        setField(term211438, term211438.getClass(), "accessTime", term211464);
        setField(term211436, term211436.getClass(), "card", term211438);
        setField(term211436, term211436.getClass(), "userName", "SWCpynwUdj");
        setIntField(term211436, term211436.getClass(), "isNetMember", 1597389967);
        setIntField(term211436, term211436.getClass(), "iconId", -1597870129);
        setIntField(term211436, term211436.getClass(), "plateId", -225312817);
        setIntField(term211436, term211436.getClass(), "titleId", -1260130532);
        setIntField(term211436, term211436.getClass(), "partnerId", 1087742967);
        setIntField(term211436, term211436.getClass(), "frameId", -627819349);
        setIntField(term211436, term211436.getClass(), "selectMapId", 800478138);
        setIntField(term211436, term211436.getClass(), "totalAwake", -1710282313);
        setIntField(term211436, term211436.getClass(), "gradeRating", 206796423);
        setIntField(term211436, term211436.getClass(), "musicRating", 1775312686);
        setIntField(term211436, term211436.getClass(), "playerRating", 260588054);
        setIntField(term211436, term211436.getClass(), "highestRating", -1349711909);
        setIntField(term211436, term211436.getClass(), "gradeRank", -1813258003);
        setIntField(term211436, term211436.getClass(), "classRank", -2049220956);
        setIntField(term211436, term211436.getClass(), "courseRank", -274830075);
        setField(term211436, term211436.getClass(), "charaSlot", term211501);
        setField(term211436, term211436.getClass(), "charaLockSlot", term211509);
        setLongField(term211436, term211436.getClass(), "contentBit", -7370456374047763255L);
        setIntField(term211436, term211436.getClass(), "playCount", 1931556045);
        setField(term211436, term211436.getClass(), "eventWatchedDate", "VacAbcqLvp");
        setField(term211436, term211436.getClass(), "lastGameId", "QjHTTvWYfx");
        setField(term211436, term211436.getClass(), "lastRomVersion", "RHSIwPDIRa");
        setField(term211436, term211436.getClass(), "lastDataVersion", "GvtOmctHFD");
        setField(term211436, term211436.getClass(), "lastLoginDate", "jKLHPwpcBA");
        setField(term211436, term211436.getClass(), "lastPlayDate", "xalmJnvfFZ");
        setIntField(term211436, term211436.getClass(), "lastPlayCredit", 1036137976);
        setIntField(term211436, term211436.getClass(), "lastPlayMode", 1761376146);
        setIntField(term211436, term211436.getClass(), "lastPlaceId", -671916958);
        setField(term211436, term211436.getClass(), "lastPlaceName", "tKHcauhuwb");
        setIntField(term211436, term211436.getClass(), "lastAllNetId", 984646048);
        setIntField(term211436, term211436.getClass(), "lastRegionId", 1422149722);
        setField(term211436, term211436.getClass(), "lastRegionName", "UqmzVnBkuq");
        setField(term211436, term211436.getClass(), "lastClientId", "NcgTgymnDd");
        setField(term211436, term211436.getClass(), "lastCountryCode", "JARYYetgvz");
        setIntField(term211436, term211436.getClass(), "lastSelectEMoney", -1131910097);
        setIntField(term211436, term211436.getClass(), "lastSelectTicket", 52885289);
        setIntField(term211436, term211436.getClass(), "lastSelectCourse", -1419678518);
        setIntField(term211436, term211436.getClass(), "lastCountCourse", 1338186927);
        setField(term211436, term211436.getClass(), "firstGameId", "YlBAgLvyUu");
        setField(term211436, term211436.getClass(), "firstRomVersion", "sLlmeMSoXg");
        setField(term211436, term211436.getClass(), "firstDataVersion", "sCuUAZsHXx");
        setField(term211436, term211436.getClass(), "firstPlayDate", "AmRcDBBIwM");
        setField(term211436, term211436.getClass(), "compatibleCmVersion", "QQsshQCyqk");
        setField(term211436, term211436.getClass(), "dailyBonusDate", "PCWsEibBhR");
        setField(term211436, term211436.getClass(), "dailyCourseBonusDate", "OeHsepdQel");
        setField(term211436, term211436.getClass(), "lastPairLoginDate", "dyfeuNBHxU");
        setField(term211436, term211436.getClass(), "lastTrialPlayDate", "JJtsuUsIeT");
        setIntField(term211436, term211436.getClass(), "playVsCount", -1576982510);
        setIntField(term211436, term211436.getClass(), "playSyncCount", -1877758186);
        setIntField(term211436, term211436.getClass(), "winCount", -830140684);
        setIntField(term211436, term211436.getClass(), "helpCount", 685127614);
        setIntField(term211436, term211436.getClass(), "comboCount", 1063250731);
        setLongField(term211436, term211436.getClass(), "totalDeluxscore", -4065810640319169457L);
        setLongField(term211436, term211436.getClass(), "totalBasicDeluxscore", 995699203956083797L);
        setLongField(term211436, term211436.getClass(), "totalAdvancedDeluxscore", -4460367475200173823L);
        setLongField(term211436, term211436.getClass(), "totalExpertDeluxscore", 5899207062544713626L);
        setLongField(term211436, term211436.getClass(), "totalMasterDeluxscore", 2944697398766065795L);
        setLongField(term211436, term211436.getClass(), "totalReMasterDeluxscore", 8820651670792928989L);
        setIntField(term211436, term211436.getClass(), "totalSync", 1679311499);
        setIntField(term211436, term211436.getClass(), "totalBasicSync", 627147024);
        setIntField(term211436, term211436.getClass(), "totalAdvancedSync", 347016445);
        setIntField(term211436, term211436.getClass(), "totalExpertSync", 479588343);
        setIntField(term211436, term211436.getClass(), "totalMasterSync", -534693706);
        setIntField(term211436, term211436.getClass(), "totalReMasterSync", -319549520);
        setLongField(term211436, term211436.getClass(), "totalAchievement", -2230923720710312838L);
        setLongField(term211436, term211436.getClass(), "totalBasicAchievement", 8846363547841887499L);
        setLongField(term211436, term211436.getClass(), "totalAdvancedAchievement", -2382291585354651217L);
        setLongField(term211436, term211436.getClass(), "totalExpertAchievement", 3020454374230144582L);
        setLongField(term211436, term211436.getClass(), "totalMasterAchievement", 6435239117290925113L);
        setLongField(term211436, term211436.getClass(), "totalReMasterAchievement", -1470980835830824288L);
        setLongField(term211436, term211436.getClass(), "playerOldRating", 6417094644459526619L);
        setLongField(term211436, term211436.getClass(), "playerNewRating", -5730039719833517787L);
        setIntField(term211436, term211436.getClass(), "banState", -2731686);
        setLongField(term211436, term211436.getClass(), "dateTime", -1907847047451777366L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayCredit", argTypes, term211436, args);
    }

};


