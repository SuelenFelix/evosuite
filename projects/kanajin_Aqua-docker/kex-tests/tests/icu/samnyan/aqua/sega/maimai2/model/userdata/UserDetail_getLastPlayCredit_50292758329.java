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

public class UserDetail_getLastPlayCredit_50292758329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211491;

    public UserDetail_getLastPlayCredit_50292758329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term211495 = new Long(-1465819833800717311L);
        Integer term211558 = new Integer(1016118972);
        Integer term211560 = new Integer(1276607451);
        ArrayList term211556 = new ArrayList();
        ((ArrayList) term211556).add(term211558);
        ((ArrayList) term211556).add(term211560);
        ArrayList term211564 = new ArrayList();
        term211491 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term211493 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term211509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term211519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term211491, term211491.getClass(), "id", -2649346725715360483L);
        setLongField(term211493, term211493.getClass(), "id", 5116248057543182857L);
        setField(term211493, term211493.getClass(), "extId", term211495);
        setField(term211493, term211493.getClass(), "luid", "JMrNmyCgHl");
        setIntField(term211510, term211510.getClass(), "year", 2010);
        setShortField(term211510, term211510.getClass(), "month", (short) 11);
        setShortField(term211510, term211510.getClass(), "day", (short) 7);
        setField(term211509, term211509.getClass(), "date", term211510);
        setByteField(term211514, term211514.getClass(), "hour", (byte) 17);
        setByteField(term211514, term211514.getClass(), "minute", (byte) 2);
        setByteField(term211514, term211514.getClass(), "second", (byte) 45);
        setIntField(term211514, term211514.getClass(), "nano", 891551261);
        setField(term211509, term211509.getClass(), "time", term211514);
        setField(term211493, term211493.getClass(), "registerTime", term211509);
        setIntField(term211520, term211520.getClass(), "year", 2018);
        setShortField(term211520, term211520.getClass(), "month", (short) 4);
        setShortField(term211520, term211520.getClass(), "day", (short) 19);
        setField(term211519, term211519.getClass(), "date", term211520);
        setByteField(term211524, term211524.getClass(), "hour", (byte) 14);
        setByteField(term211524, term211524.getClass(), "minute", (byte) 21);
        setByteField(term211524, term211524.getClass(), "second", (byte) 19);
        setIntField(term211524, term211524.getClass(), "nano", 997536814);
        setField(term211519, term211519.getClass(), "time", term211524);
        setField(term211493, term211493.getClass(), "accessTime", term211519);
        setField(term211491, term211491.getClass(), "card", term211493);
        setField(term211491, term211491.getClass(), "userName", "SWCpynwUdj");
        setIntField(term211491, term211491.getClass(), "isNetMember", 1597389967);
        setIntField(term211491, term211491.getClass(), "iconId", -1597870129);
        setIntField(term211491, term211491.getClass(), "plateId", -225312817);
        setIntField(term211491, term211491.getClass(), "titleId", -1260130532);
        setIntField(term211491, term211491.getClass(), "partnerId", 1087742967);
        setIntField(term211491, term211491.getClass(), "frameId", -627819349);
        setIntField(term211491, term211491.getClass(), "selectMapId", 800478138);
        setIntField(term211491, term211491.getClass(), "totalAwake", -1710282313);
        setIntField(term211491, term211491.getClass(), "gradeRating", 206796423);
        setIntField(term211491, term211491.getClass(), "musicRating", 1775312686);
        setIntField(term211491, term211491.getClass(), "playerRating", 260588054);
        setIntField(term211491, term211491.getClass(), "highestRating", -1349711909);
        setIntField(term211491, term211491.getClass(), "gradeRank", -1813258003);
        setIntField(term211491, term211491.getClass(), "classRank", -2049220956);
        setIntField(term211491, term211491.getClass(), "courseRank", -274830075);
        setField(term211491, term211491.getClass(), "charaSlot", term211556);
        setField(term211491, term211491.getClass(), "charaLockSlot", term211564);
        setLongField(term211491, term211491.getClass(), "contentBit", -7370456374047763255L);
        setIntField(term211491, term211491.getClass(), "playCount", 1931556045);
        setField(term211491, term211491.getClass(), "eventWatchedDate", "VacAbcqLvp");
        setField(term211491, term211491.getClass(), "lastGameId", "QjHTTvWYfx");
        setField(term211491, term211491.getClass(), "lastRomVersion", "RHSIwPDIRa");
        setField(term211491, term211491.getClass(), "lastDataVersion", "GvtOmctHFD");
        setField(term211491, term211491.getClass(), "lastLoginDate", "jKLHPwpcBA");
        setField(term211491, term211491.getClass(), "lastPlayDate", "xalmJnvfFZ");
        setIntField(term211491, term211491.getClass(), "lastPlayCredit", 1036137976);
        setIntField(term211491, term211491.getClass(), "lastPlayMode", 1761376146);
        setIntField(term211491, term211491.getClass(), "lastPlaceId", -671916958);
        setField(term211491, term211491.getClass(), "lastPlaceName", "tKHcauhuwb");
        setIntField(term211491, term211491.getClass(), "lastAllNetId", 984646048);
        setIntField(term211491, term211491.getClass(), "lastRegionId", 1422149722);
        setField(term211491, term211491.getClass(), "lastRegionName", "UqmzVnBkuq");
        setField(term211491, term211491.getClass(), "lastClientId", "NcgTgymnDd");
        setField(term211491, term211491.getClass(), "lastCountryCode", "JARYYetgvz");
        setIntField(term211491, term211491.getClass(), "lastSelectEMoney", -1131910097);
        setIntField(term211491, term211491.getClass(), "lastSelectTicket", 52885289);
        setIntField(term211491, term211491.getClass(), "lastSelectCourse", -1419678518);
        setIntField(term211491, term211491.getClass(), "lastCountCourse", 1338186927);
        setField(term211491, term211491.getClass(), "firstGameId", "YlBAgLvyUu");
        setField(term211491, term211491.getClass(), "firstRomVersion", "sLlmeMSoXg");
        setField(term211491, term211491.getClass(), "firstDataVersion", "sCuUAZsHXx");
        setField(term211491, term211491.getClass(), "firstPlayDate", "AmRcDBBIwM");
        setField(term211491, term211491.getClass(), "compatibleCmVersion", "QQsshQCyqk");
        setField(term211491, term211491.getClass(), "dailyBonusDate", "PCWsEibBhR");
        setField(term211491, term211491.getClass(), "dailyCourseBonusDate", "OeHsepdQel");
        setField(term211491, term211491.getClass(), "lastPairLoginDate", "dyfeuNBHxU");
        setField(term211491, term211491.getClass(), "lastTrialPlayDate", "JJtsuUsIeT");
        setIntField(term211491, term211491.getClass(), "playVsCount", -1576982510);
        setIntField(term211491, term211491.getClass(), "playSyncCount", -1877758186);
        setIntField(term211491, term211491.getClass(), "winCount", -830140684);
        setIntField(term211491, term211491.getClass(), "helpCount", 685127614);
        setIntField(term211491, term211491.getClass(), "comboCount", 1063250731);
        setLongField(term211491, term211491.getClass(), "totalDeluxscore", -4065810640319169457L);
        setLongField(term211491, term211491.getClass(), "totalBasicDeluxscore", 995699203956083797L);
        setLongField(term211491, term211491.getClass(), "totalAdvancedDeluxscore", -4460367475200173823L);
        setLongField(term211491, term211491.getClass(), "totalExpertDeluxscore", 5899207062544713626L);
        setLongField(term211491, term211491.getClass(), "totalMasterDeluxscore", 2944697398766065795L);
        setLongField(term211491, term211491.getClass(), "totalReMasterDeluxscore", 8820651670792928989L);
        setIntField(term211491, term211491.getClass(), "totalSync", 1679311499);
        setIntField(term211491, term211491.getClass(), "totalBasicSync", 627147024);
        setIntField(term211491, term211491.getClass(), "totalAdvancedSync", 347016445);
        setIntField(term211491, term211491.getClass(), "totalExpertSync", 479588343);
        setIntField(term211491, term211491.getClass(), "totalMasterSync", -534693706);
        setIntField(term211491, term211491.getClass(), "totalReMasterSync", -319549520);
        setLongField(term211491, term211491.getClass(), "totalAchievement", -2230923720710312838L);
        setLongField(term211491, term211491.getClass(), "totalBasicAchievement", 8846363547841887499L);
        setLongField(term211491, term211491.getClass(), "totalAdvancedAchievement", -2382291585354651217L);
        setLongField(term211491, term211491.getClass(), "totalExpertAchievement", 3020454374230144582L);
        setLongField(term211491, term211491.getClass(), "totalMasterAchievement", 6435239117290925113L);
        setLongField(term211491, term211491.getClass(), "totalReMasterAchievement", -1470980835830824288L);
        setLongField(term211491, term211491.getClass(), "playerOldRating", 6417094644459526619L);
        setLongField(term211491, term211491.getClass(), "playerNewRating", -5730039719833517787L);
        setIntField(term211491, term211491.getClass(), "banState", -2731686);
        setLongField(term211491, term211491.getClass(), "dateTime", -1907847047451777366L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayCredit", argTypes, term211491, args);
    }

};


