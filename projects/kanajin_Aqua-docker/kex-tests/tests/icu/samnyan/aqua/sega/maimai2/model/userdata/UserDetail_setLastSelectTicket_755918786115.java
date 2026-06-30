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

public class UserDetail_setLastSelectTicket_755918786115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4295064;
     Object term4295433;

    public UserDetail_setLastSelectTicket_755918786115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4295068 = new Long(-9190628802748301406L);
        Integer term4295131 = new Integer(631763699);
        Integer term4295133 = new Integer(-2016696905);
        Integer term4295135 = new Integer(820644673);
        Integer term4295137 = new Integer(1395411611);
        Integer term4295139 = new Integer(1535159183);
        Integer term4295141 = new Integer(542305172);
        Integer term4295143 = new Integer(1880502684);
        Integer term4295145 = new Integer(1208089406);
        Integer term4295147 = new Integer(-822607091);
        ArrayList term4295129 = new ArrayList();
        ((ArrayList) term4295129).add(term4295131);
        ((ArrayList) term4295129).add(term4295133);
        ((ArrayList) term4295129).add(term4295135);
        ((ArrayList) term4295129).add(term4295137);
        ((ArrayList) term4295129).add(term4295139);
        ((ArrayList) term4295129).add(term4295141);
        ((ArrayList) term4295129).add(term4295143);
        ((ArrayList) term4295129).add(term4295145);
        ((ArrayList) term4295129).add(term4295147);
        Integer term4295153 = new Integer(-1404356844);
        Integer term4295155 = new Integer(1214654693);
        Integer term4295157 = new Integer(-1144368319);
        Integer term4295159 = new Integer(-1299647512);
        Integer term4295161 = new Integer(-738749379);
        Integer term4295163 = new Integer(2067337022);
        ArrayList term4295151 = new ArrayList();
        ((ArrayList) term4295151).add(term4295153);
        ((ArrayList) term4295151).add(term4295155);
        ((ArrayList) term4295151).add(term4295157);
        ((ArrayList) term4295151).add(term4295159);
        ((ArrayList) term4295151).add(term4295161);
        ((ArrayList) term4295151).add(term4295163);
        term4295064 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4295066 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4295082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4295083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4295087 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4295092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4295093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4295097 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4295064, term4295064.getClass(), "id", 7324620603019807663L);
        setLongField(term4295066, term4295066.getClass(), "id", 9076217607847014124L);
        setField(term4295066, term4295066.getClass(), "extId", term4295068);
        setField(term4295066, term4295066.getClass(), "luid", "lLKqlBEzUB");
        setIntField(term4295083, term4295083.getClass(), "year", 2025);
        setShortField(term4295083, term4295083.getClass(), "month", (short) 3);
        setShortField(term4295083, term4295083.getClass(), "day", (short) 2);
        setField(term4295082, term4295082.getClass(), "date", term4295083);
        setByteField(term4295087, term4295087.getClass(), "hour", (byte) 2);
        setByteField(term4295087, term4295087.getClass(), "minute", (byte) 41);
        setByteField(term4295087, term4295087.getClass(), "second", (byte) 31);
        setIntField(term4295087, term4295087.getClass(), "nano", 905303246);
        setField(term4295082, term4295082.getClass(), "time", term4295087);
        setField(term4295066, term4295066.getClass(), "registerTime", term4295082);
        setIntField(term4295093, term4295093.getClass(), "year", 2018);
        setShortField(term4295093, term4295093.getClass(), "month", (short) 3);
        setShortField(term4295093, term4295093.getClass(), "day", (short) 21);
        setField(term4295092, term4295092.getClass(), "date", term4295093);
        setByteField(term4295097, term4295097.getClass(), "hour", (byte) 15);
        setByteField(term4295097, term4295097.getClass(), "minute", (byte) 22);
        setByteField(term4295097, term4295097.getClass(), "second", (byte) 23);
        setIntField(term4295097, term4295097.getClass(), "nano", 142082891);
        setField(term4295092, term4295092.getClass(), "time", term4295097);
        setField(term4295066, term4295066.getClass(), "accessTime", term4295092);
        setField(term4295064, term4295064.getClass(), "card", term4295066);
        setField(term4295064, term4295064.getClass(), "userName", "nIJqnFIKyd");
        setIntField(term4295064, term4295064.getClass(), "isNetMember", 321784159);
        setIntField(term4295064, term4295064.getClass(), "iconId", -1504434720);
        setIntField(term4295064, term4295064.getClass(), "plateId", -359659784);
        setIntField(term4295064, term4295064.getClass(), "titleId", 2143256122);
        setIntField(term4295064, term4295064.getClass(), "partnerId", -609533855);
        setIntField(term4295064, term4295064.getClass(), "frameId", -47649938);
        setIntField(term4295064, term4295064.getClass(), "selectMapId", 1697952112);
        setIntField(term4295064, term4295064.getClass(), "totalAwake", 909104135);
        setIntField(term4295064, term4295064.getClass(), "gradeRating", 657697599);
        setIntField(term4295064, term4295064.getClass(), "musicRating", -353189852);
        setIntField(term4295064, term4295064.getClass(), "playerRating", 678994741);
        setIntField(term4295064, term4295064.getClass(), "highestRating", 448665986);
        setIntField(term4295064, term4295064.getClass(), "gradeRank", -1162181776);
        setIntField(term4295064, term4295064.getClass(), "classRank", -1483370970);
        setIntField(term4295064, term4295064.getClass(), "courseRank", -655578032);
        setField(term4295064, term4295064.getClass(), "charaSlot", term4295129);
        setField(term4295064, term4295064.getClass(), "charaLockSlot", term4295151);
        setLongField(term4295064, term4295064.getClass(), "contentBit", -2963782609246298660L);
        setIntField(term4295064, term4295064.getClass(), "playCount", 1461984709);
        setField(term4295064, term4295064.getClass(), "eventWatchedDate", "QgqnrARsfa");
        setField(term4295064, term4295064.getClass(), "lastGameId", "nlLAnNHKjy");
        setField(term4295064, term4295064.getClass(), "lastRomVersion", "RzCZSKfpQI");
        setField(term4295064, term4295064.getClass(), "lastDataVersion", "IkGFVwVPnN");
        setField(term4295064, term4295064.getClass(), "lastLoginDate", "CHOsjHfZOw");
        setField(term4295064, term4295064.getClass(), "lastPlayDate", "yzGFJLUlNQ");
        setIntField(term4295064, term4295064.getClass(), "lastPlayCredit", 1335955504);
        setIntField(term4295064, term4295064.getClass(), "lastPlayMode", -506217894);
        setIntField(term4295064, term4295064.getClass(), "lastPlaceId", -1303982702);
        setField(term4295064, term4295064.getClass(), "lastPlaceName", "BOPBrHDVRr");
        setIntField(term4295064, term4295064.getClass(), "lastAllNetId", 1598021257);
        setIntField(term4295064, term4295064.getClass(), "lastRegionId", -1549190834);
        setField(term4295064, term4295064.getClass(), "lastRegionName", "oVdtpriMSh");
        setField(term4295064, term4295064.getClass(), "lastClientId", "TJEwKQXMBH");
        setField(term4295064, term4295064.getClass(), "lastCountryCode", "qcvbfhPost");
        setIntField(term4295064, term4295064.getClass(), "lastSelectEMoney", -1393483593);
        setIntField(term4295064, term4295064.getClass(), "lastSelectTicket", -1424180864);
        setIntField(term4295064, term4295064.getClass(), "lastSelectCourse", 810002447);
        setIntField(term4295064, term4295064.getClass(), "lastCountCourse", 1425929028);
        setField(term4295064, term4295064.getClass(), "firstGameId", "bkeWVMAjLa");
        setField(term4295064, term4295064.getClass(), "firstRomVersion", "geIwqjPuyy");
        setField(term4295064, term4295064.getClass(), "firstDataVersion", "IwVfBPfJXW");
        setField(term4295064, term4295064.getClass(), "firstPlayDate", "VwrZyKcAsi");
        setField(term4295064, term4295064.getClass(), "compatibleCmVersion", "HiEMbtqsCz");
        setField(term4295064, term4295064.getClass(), "dailyBonusDate", "IZlEOtYfJO");
        setField(term4295064, term4295064.getClass(), "dailyCourseBonusDate", "SDZDICsncl");
        setField(term4295064, term4295064.getClass(), "lastPairLoginDate", "wWynkPCcfh");
        setField(term4295064, term4295064.getClass(), "lastTrialPlayDate", "qCTzQfSAnn");
        setIntField(term4295064, term4295064.getClass(), "playVsCount", -1143795517);
        setIntField(term4295064, term4295064.getClass(), "playSyncCount", -1609502581);
        setIntField(term4295064, term4295064.getClass(), "winCount", 1380306756);
        setIntField(term4295064, term4295064.getClass(), "helpCount", 2119030920);
        setIntField(term4295064, term4295064.getClass(), "comboCount", -276492714);
        setLongField(term4295064, term4295064.getClass(), "totalDeluxscore", -253922433354879018L);
        setLongField(term4295064, term4295064.getClass(), "totalBasicDeluxscore", 13028990995325517L);
        setLongField(term4295064, term4295064.getClass(), "totalAdvancedDeluxscore", 7830723915100341914L);
        setLongField(term4295064, term4295064.getClass(), "totalExpertDeluxscore", -1040519742371745070L);
        setLongField(term4295064, term4295064.getClass(), "totalMasterDeluxscore", -3281278172749023232L);
        setLongField(term4295064, term4295064.getClass(), "totalReMasterDeluxscore", -2417058544292484496L);
        setIntField(term4295064, term4295064.getClass(), "totalSync", -197596028);
        setIntField(term4295064, term4295064.getClass(), "totalBasicSync", -1785501153);
        setIntField(term4295064, term4295064.getClass(), "totalAdvancedSync", 1508213793);
        setIntField(term4295064, term4295064.getClass(), "totalExpertSync", 1329748643);
        setIntField(term4295064, term4295064.getClass(), "totalMasterSync", -2047471794);
        setIntField(term4295064, term4295064.getClass(), "totalReMasterSync", 1604037198);
        setLongField(term4295064, term4295064.getClass(), "totalAchievement", 6723539678109236465L);
        setLongField(term4295064, term4295064.getClass(), "totalBasicAchievement", 8598916152636563007L);
        setLongField(term4295064, term4295064.getClass(), "totalAdvancedAchievement", 5759826028859834353L);
        setLongField(term4295064, term4295064.getClass(), "totalExpertAchievement", -7556958210320465771L);
        setLongField(term4295064, term4295064.getClass(), "totalMasterAchievement", -4770473430827602195L);
        setLongField(term4295064, term4295064.getClass(), "totalReMasterAchievement", 1090210542467175012L);
        setLongField(term4295064, term4295064.getClass(), "playerOldRating", -3405282006110722762L);
        setLongField(term4295064, term4295064.getClass(), "playerNewRating", -4892418709870131488L);
        setIntField(term4295064, term4295064.getClass(), "banState", 998015356);
        setLongField(term4295064, term4295064.getClass(), "dateTime", 7306231808185217485L);
        term4295433 = new Integer(1939900792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4295433;
        callMethod(klass, "setLastSelectTicket", argTypes, term4295064, args);
    }

};


