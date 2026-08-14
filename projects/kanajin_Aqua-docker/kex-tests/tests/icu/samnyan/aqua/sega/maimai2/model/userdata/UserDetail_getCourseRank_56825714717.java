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

public class UserDetail_getCourseRank_56825714717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205229;

    public UserDetail_getCourseRank_56825714717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205233 = new Long(-7005300544167632229L);
        Integer term205296 = new Integer(1253469190);
        ArrayList term205294 = new ArrayList();
        ((ArrayList) term205294).add(term205296);
        Integer term205302 = new Integer(-92568219);
        ArrayList term205300 = new ArrayList();
        ((ArrayList) term205300).add(term205302);
        term205229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term205231 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205262 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205229, term205229.getClass(), "id", 1176329535134080860L);
        setLongField(term205231, term205231.getClass(), "id", -956849515813002310L);
        setField(term205231, term205231.getClass(), "extId", term205233);
        setField(term205231, term205231.getClass(), "luid", "VrbjjUMSDU");
        setIntField(term205248, term205248.getClass(), "year", 2016);
        setShortField(term205248, term205248.getClass(), "month", (short) 10);
        setShortField(term205248, term205248.getClass(), "day", (short) 4);
        setField(term205247, term205247.getClass(), "date", term205248);
        setByteField(term205252, term205252.getClass(), "hour", (byte) 21);
        setByteField(term205252, term205252.getClass(), "minute", (byte) 48);
        setByteField(term205252, term205252.getClass(), "second", (byte) 47);
        setIntField(term205252, term205252.getClass(), "nano", 98983875);
        setField(term205247, term205247.getClass(), "time", term205252);
        setField(term205231, term205231.getClass(), "registerTime", term205247);
        setIntField(term205258, term205258.getClass(), "year", 2027);
        setShortField(term205258, term205258.getClass(), "month", (short) 1);
        setShortField(term205258, term205258.getClass(), "day", (short) 18);
        setField(term205257, term205257.getClass(), "date", term205258);
        setByteField(term205262, term205262.getClass(), "hour", (byte) 14);
        setByteField(term205262, term205262.getClass(), "minute", (byte) 46);
        setByteField(term205262, term205262.getClass(), "second", (byte) 5);
        setIntField(term205262, term205262.getClass(), "nano", 748048450);
        setField(term205257, term205257.getClass(), "time", term205262);
        setField(term205231, term205231.getClass(), "accessTime", term205257);
        setField(term205229, term205229.getClass(), "card", term205231);
        setField(term205229, term205229.getClass(), "userName", "xDGzHtrwxK");
        setIntField(term205229, term205229.getClass(), "isNetMember", -1797863095);
        setIntField(term205229, term205229.getClass(), "iconId", 857108422);
        setIntField(term205229, term205229.getClass(), "plateId", -1089564718);
        setIntField(term205229, term205229.getClass(), "titleId", 1985944979);
        setIntField(term205229, term205229.getClass(), "partnerId", 600742414);
        setIntField(term205229, term205229.getClass(), "frameId", -848491327);
        setIntField(term205229, term205229.getClass(), "selectMapId", 271036746);
        setIntField(term205229, term205229.getClass(), "totalAwake", 1921972298);
        setIntField(term205229, term205229.getClass(), "gradeRating", 1759412486);
        setIntField(term205229, term205229.getClass(), "musicRating", -609040240);
        setIntField(term205229, term205229.getClass(), "playerRating", -263119455);
        setIntField(term205229, term205229.getClass(), "highestRating", 1676382020);
        setIntField(term205229, term205229.getClass(), "gradeRank", -368458204);
        setIntField(term205229, term205229.getClass(), "classRank", 385413138);
        setIntField(term205229, term205229.getClass(), "courseRank", 546200121);
        setField(term205229, term205229.getClass(), "charaSlot", term205294);
        setField(term205229, term205229.getClass(), "charaLockSlot", term205300);
        setLongField(term205229, term205229.getClass(), "contentBit", -6483907418875523184L);
        setIntField(term205229, term205229.getClass(), "playCount", -100422031);
        setField(term205229, term205229.getClass(), "eventWatchedDate", "CwwTZmvKmY");
        setField(term205229, term205229.getClass(), "lastGameId", "zAKYtlhVLD");
        setField(term205229, term205229.getClass(), "lastRomVersion", "WBtPWXOEmq");
        setField(term205229, term205229.getClass(), "lastDataVersion", "QuikledFWs");
        setField(term205229, term205229.getClass(), "lastLoginDate", "KciBQcVUbd");
        setField(term205229, term205229.getClass(), "lastPlayDate", "rVkPxsXMLd");
        setIntField(term205229, term205229.getClass(), "lastPlayCredit", -906004322);
        setIntField(term205229, term205229.getClass(), "lastPlayMode", -2047208630);
        setIntField(term205229, term205229.getClass(), "lastPlaceId", 1549289354);
        setField(term205229, term205229.getClass(), "lastPlaceName", "TRbwDxScJC");
        setIntField(term205229, term205229.getClass(), "lastAllNetId", -1656094384);
        setIntField(term205229, term205229.getClass(), "lastRegionId", -1810376733);
        setField(term205229, term205229.getClass(), "lastRegionName", "ANMeqCzXZC");
        setField(term205229, term205229.getClass(), "lastClientId", "sJiwjUaOUV");
        setField(term205229, term205229.getClass(), "lastCountryCode", "PbUFUUpAeg");
        setIntField(term205229, term205229.getClass(), "lastSelectEMoney", 1564142914);
        setIntField(term205229, term205229.getClass(), "lastSelectTicket", -702106315);
        setIntField(term205229, term205229.getClass(), "lastSelectCourse", -350021779);
        setIntField(term205229, term205229.getClass(), "lastCountCourse", 1208670155);
        setField(term205229, term205229.getClass(), "firstGameId", "QRkBZbnTOB");
        setField(term205229, term205229.getClass(), "firstRomVersion", "DdAgifzFnx");
        setField(term205229, term205229.getClass(), "firstDataVersion", "iuNvrVmuxg");
        setField(term205229, term205229.getClass(), "firstPlayDate", "qTbxfEkSoD");
        setField(term205229, term205229.getClass(), "compatibleCmVersion", "CdxLYiruKu");
        setField(term205229, term205229.getClass(), "dailyBonusDate", "kmsDyQSade");
        setField(term205229, term205229.getClass(), "dailyCourseBonusDate", "SVKsHbrKuH");
        setField(term205229, term205229.getClass(), "lastPairLoginDate", "mWohnyQvua");
        setField(term205229, term205229.getClass(), "lastTrialPlayDate", "HmJTytenTU");
        setIntField(term205229, term205229.getClass(), "playVsCount", -294164949);
        setIntField(term205229, term205229.getClass(), "playSyncCount", 1240900440);
        setIntField(term205229, term205229.getClass(), "winCount", 1227926827);
        setIntField(term205229, term205229.getClass(), "helpCount", -1056033776);
        setIntField(term205229, term205229.getClass(), "comboCount", 484119496);
        setLongField(term205229, term205229.getClass(), "totalDeluxscore", -3609163494345805186L);
        setLongField(term205229, term205229.getClass(), "totalBasicDeluxscore", 4242550647316343079L);
        setLongField(term205229, term205229.getClass(), "totalAdvancedDeluxscore", 2907467836687806397L);
        setLongField(term205229, term205229.getClass(), "totalExpertDeluxscore", -5275968844798955518L);
        setLongField(term205229, term205229.getClass(), "totalMasterDeluxscore", 7306081329674635089L);
        setLongField(term205229, term205229.getClass(), "totalReMasterDeluxscore", 7148058443193955745L);
        setIntField(term205229, term205229.getClass(), "totalSync", 1357038884);
        setIntField(term205229, term205229.getClass(), "totalBasicSync", 990002371);
        setIntField(term205229, term205229.getClass(), "totalAdvancedSync", -67320068);
        setIntField(term205229, term205229.getClass(), "totalExpertSync", -1718166515);
        setIntField(term205229, term205229.getClass(), "totalMasterSync", -1003939669);
        setIntField(term205229, term205229.getClass(), "totalReMasterSync", 1632574348);
        setLongField(term205229, term205229.getClass(), "totalAchievement", -3375083120558893907L);
        setLongField(term205229, term205229.getClass(), "totalBasicAchievement", -8061922010585633118L);
        setLongField(term205229, term205229.getClass(), "totalAdvancedAchievement", -28132922818978307L);
        setLongField(term205229, term205229.getClass(), "totalExpertAchievement", 6455656644270038151L);
        setLongField(term205229, term205229.getClass(), "totalMasterAchievement", -4993366704575832693L);
        setLongField(term205229, term205229.getClass(), "totalReMasterAchievement", -2391200937247895620L);
        setLongField(term205229, term205229.getClass(), "playerOldRating", 6463427973591776612L);
        setLongField(term205229, term205229.getClass(), "playerNewRating", -4088229342833015337L);
        setIntField(term205229, term205229.getClass(), "banState", -334489756);
        setLongField(term205229, term205229.getClass(), "dateTime", 8086775999426177339L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseRank", argTypes, term205229, args);
    }

};


