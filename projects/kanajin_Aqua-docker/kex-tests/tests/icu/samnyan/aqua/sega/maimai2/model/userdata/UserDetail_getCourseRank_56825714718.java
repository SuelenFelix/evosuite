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

public class UserDetail_getCourseRank_56825714718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205284;

    public UserDetail_getCourseRank_56825714718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205288 = new Long(-7005300544167632229L);
        Integer term205351 = new Integer(1253469190);
        ArrayList term205349 = new ArrayList();
        ((ArrayList) term205349).add(term205351);
        Integer term205357 = new Integer(-92568219);
        ArrayList term205355 = new ArrayList();
        ((ArrayList) term205355).add(term205357);
        term205284 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term205286 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205317 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205284, term205284.getClass(), "id", 1176329535134080860L);
        setLongField(term205286, term205286.getClass(), "id", -956849515813002310L);
        setField(term205286, term205286.getClass(), "extId", term205288);
        setField(term205286, term205286.getClass(), "luid", "VrbjjUMSDU");
        setIntField(term205303, term205303.getClass(), "year", 2016);
        setShortField(term205303, term205303.getClass(), "month", (short) 10);
        setShortField(term205303, term205303.getClass(), "day", (short) 4);
        setField(term205302, term205302.getClass(), "date", term205303);
        setByteField(term205307, term205307.getClass(), "hour", (byte) 21);
        setByteField(term205307, term205307.getClass(), "minute", (byte) 48);
        setByteField(term205307, term205307.getClass(), "second", (byte) 47);
        setIntField(term205307, term205307.getClass(), "nano", 98983875);
        setField(term205302, term205302.getClass(), "time", term205307);
        setField(term205286, term205286.getClass(), "registerTime", term205302);
        setIntField(term205313, term205313.getClass(), "year", 2027);
        setShortField(term205313, term205313.getClass(), "month", (short) 1);
        setShortField(term205313, term205313.getClass(), "day", (short) 18);
        setField(term205312, term205312.getClass(), "date", term205313);
        setByteField(term205317, term205317.getClass(), "hour", (byte) 14);
        setByteField(term205317, term205317.getClass(), "minute", (byte) 46);
        setByteField(term205317, term205317.getClass(), "second", (byte) 5);
        setIntField(term205317, term205317.getClass(), "nano", 748048450);
        setField(term205312, term205312.getClass(), "time", term205317);
        setField(term205286, term205286.getClass(), "accessTime", term205312);
        setField(term205284, term205284.getClass(), "card", term205286);
        setField(term205284, term205284.getClass(), "userName", "xDGzHtrwxK");
        setIntField(term205284, term205284.getClass(), "isNetMember", -1797863095);
        setIntField(term205284, term205284.getClass(), "iconId", 857108422);
        setIntField(term205284, term205284.getClass(), "plateId", -1089564718);
        setIntField(term205284, term205284.getClass(), "titleId", 1985944979);
        setIntField(term205284, term205284.getClass(), "partnerId", 600742414);
        setIntField(term205284, term205284.getClass(), "frameId", -848491327);
        setIntField(term205284, term205284.getClass(), "selectMapId", 271036746);
        setIntField(term205284, term205284.getClass(), "totalAwake", 1921972298);
        setIntField(term205284, term205284.getClass(), "gradeRating", 1759412486);
        setIntField(term205284, term205284.getClass(), "musicRating", -609040240);
        setIntField(term205284, term205284.getClass(), "playerRating", -263119455);
        setIntField(term205284, term205284.getClass(), "highestRating", 1676382020);
        setIntField(term205284, term205284.getClass(), "gradeRank", -368458204);
        setIntField(term205284, term205284.getClass(), "classRank", 385413138);
        setIntField(term205284, term205284.getClass(), "courseRank", 546200121);
        setField(term205284, term205284.getClass(), "charaSlot", term205349);
        setField(term205284, term205284.getClass(), "charaLockSlot", term205355);
        setLongField(term205284, term205284.getClass(), "contentBit", -6483907418875523184L);
        setIntField(term205284, term205284.getClass(), "playCount", -100422031);
        setField(term205284, term205284.getClass(), "eventWatchedDate", "CwwTZmvKmY");
        setField(term205284, term205284.getClass(), "lastGameId", "zAKYtlhVLD");
        setField(term205284, term205284.getClass(), "lastRomVersion", "WBtPWXOEmq");
        setField(term205284, term205284.getClass(), "lastDataVersion", "QuikledFWs");
        setField(term205284, term205284.getClass(), "lastLoginDate", "KciBQcVUbd");
        setField(term205284, term205284.getClass(), "lastPlayDate", "rVkPxsXMLd");
        setIntField(term205284, term205284.getClass(), "lastPlayCredit", -906004322);
        setIntField(term205284, term205284.getClass(), "lastPlayMode", -2047208630);
        setIntField(term205284, term205284.getClass(), "lastPlaceId", 1549289354);
        setField(term205284, term205284.getClass(), "lastPlaceName", "TRbwDxScJC");
        setIntField(term205284, term205284.getClass(), "lastAllNetId", -1656094384);
        setIntField(term205284, term205284.getClass(), "lastRegionId", -1810376733);
        setField(term205284, term205284.getClass(), "lastRegionName", "ANMeqCzXZC");
        setField(term205284, term205284.getClass(), "lastClientId", "sJiwjUaOUV");
        setField(term205284, term205284.getClass(), "lastCountryCode", "PbUFUUpAeg");
        setIntField(term205284, term205284.getClass(), "lastSelectEMoney", 1564142914);
        setIntField(term205284, term205284.getClass(), "lastSelectTicket", -702106315);
        setIntField(term205284, term205284.getClass(), "lastSelectCourse", -350021779);
        setIntField(term205284, term205284.getClass(), "lastCountCourse", 1208670155);
        setField(term205284, term205284.getClass(), "firstGameId", "QRkBZbnTOB");
        setField(term205284, term205284.getClass(), "firstRomVersion", "DdAgifzFnx");
        setField(term205284, term205284.getClass(), "firstDataVersion", "iuNvrVmuxg");
        setField(term205284, term205284.getClass(), "firstPlayDate", "qTbxfEkSoD");
        setField(term205284, term205284.getClass(), "compatibleCmVersion", "CdxLYiruKu");
        setField(term205284, term205284.getClass(), "dailyBonusDate", "kmsDyQSade");
        setField(term205284, term205284.getClass(), "dailyCourseBonusDate", "SVKsHbrKuH");
        setField(term205284, term205284.getClass(), "lastPairLoginDate", "mWohnyQvua");
        setField(term205284, term205284.getClass(), "lastTrialPlayDate", "HmJTytenTU");
        setIntField(term205284, term205284.getClass(), "playVsCount", -294164949);
        setIntField(term205284, term205284.getClass(), "playSyncCount", 1240900440);
        setIntField(term205284, term205284.getClass(), "winCount", 1227926827);
        setIntField(term205284, term205284.getClass(), "helpCount", -1056033776);
        setIntField(term205284, term205284.getClass(), "comboCount", 484119496);
        setLongField(term205284, term205284.getClass(), "totalDeluxscore", -3609163494345805186L);
        setLongField(term205284, term205284.getClass(), "totalBasicDeluxscore", 4242550647316343079L);
        setLongField(term205284, term205284.getClass(), "totalAdvancedDeluxscore", 2907467836687806397L);
        setLongField(term205284, term205284.getClass(), "totalExpertDeluxscore", -5275968844798955518L);
        setLongField(term205284, term205284.getClass(), "totalMasterDeluxscore", 7306081329674635089L);
        setLongField(term205284, term205284.getClass(), "totalReMasterDeluxscore", 7148058443193955745L);
        setIntField(term205284, term205284.getClass(), "totalSync", 1357038884);
        setIntField(term205284, term205284.getClass(), "totalBasicSync", 990002371);
        setIntField(term205284, term205284.getClass(), "totalAdvancedSync", -67320068);
        setIntField(term205284, term205284.getClass(), "totalExpertSync", -1718166515);
        setIntField(term205284, term205284.getClass(), "totalMasterSync", -1003939669);
        setIntField(term205284, term205284.getClass(), "totalReMasterSync", 1632574348);
        setLongField(term205284, term205284.getClass(), "totalAchievement", -3375083120558893907L);
        setLongField(term205284, term205284.getClass(), "totalBasicAchievement", -8061922010585633118L);
        setLongField(term205284, term205284.getClass(), "totalAdvancedAchievement", -28132922818978307L);
        setLongField(term205284, term205284.getClass(), "totalExpertAchievement", 6455656644270038151L);
        setLongField(term205284, term205284.getClass(), "totalMasterAchievement", -4993366704575832693L);
        setLongField(term205284, term205284.getClass(), "totalReMasterAchievement", -2391200937247895620L);
        setLongField(term205284, term205284.getClass(), "playerOldRating", 6463427973591776612L);
        setLongField(term205284, term205284.getClass(), "playerNewRating", -4088229342833015337L);
        setIntField(term205284, term205284.getClass(), "banState", -334489756);
        setLongField(term205284, term205284.getClass(), "dateTime", 8086775999426177339L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseRank", argTypes, term205284, args);
    }

};


