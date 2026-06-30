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

public class UserItem_getItemId_14362686944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35209;

    public UserItem_getItemId_14362686944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35215 = new Long(-1154553077993834885L);
        Integer term35278 = new Integer(-1252345779);
        Integer term35280 = new Integer(-2063365430);
        Integer term35282 = new Integer(812570053);
        Integer term35284 = new Integer(-1488938905);
        Integer term35286 = new Integer(1916544127);
        Integer term35288 = new Integer(-1133405894);
        ArrayList term35276 = new ArrayList();
        ((ArrayList) term35276).add(term35278);
        ((ArrayList) term35276).add(term35280);
        ((ArrayList) term35276).add(term35282);
        ((ArrayList) term35276).add(term35284);
        ((ArrayList) term35276).add(term35286);
        ((ArrayList) term35276).add(term35288);
        Integer term35294 = new Integer(1289741214);
        Integer term35296 = new Integer(243280944);
        Integer term35298 = new Integer(-726681073);
        Integer term35300 = new Integer(-1724487863);
        Integer term35302 = new Integer(-128490829);
        Integer term35304 = new Integer(202214133);
        Integer term35306 = new Integer(1543091617);
        ArrayList term35292 = new ArrayList();
        ((ArrayList) term35292).add(term35294);
        ((ArrayList) term35292).add(term35296);
        ((ArrayList) term35292).add(term35298);
        ((ArrayList) term35292).add(term35300);
        ((ArrayList) term35292).add(term35302);
        ((ArrayList) term35292).add(term35304);
        ((ArrayList) term35292).add(term35306);
        term35209 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term35211 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term35213 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35234 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35244 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35209, term35209.getClass(), "id", 732331270654896650L);
        setLongField(term35211, term35211.getClass(), "id", 8578289401978257809L);
        setLongField(term35213, term35213.getClass(), "id", -1719189544794576143L);
        setField(term35213, term35213.getClass(), "extId", term35215);
        setField(term35213, term35213.getClass(), "luid", "MzXzaqaiHW");
        setIntField(term35230, term35230.getClass(), "year", 2013);
        setShortField(term35230, term35230.getClass(), "month", (short) 7);
        setShortField(term35230, term35230.getClass(), "day", (short) 26);
        setField(term35229, term35229.getClass(), "date", term35230);
        setByteField(term35234, term35234.getClass(), "hour", (byte) 14);
        setByteField(term35234, term35234.getClass(), "minute", (byte) 45);
        setByteField(term35234, term35234.getClass(), "second", (byte) 33);
        setIntField(term35234, term35234.getClass(), "nano", 547995853);
        setField(term35229, term35229.getClass(), "time", term35234);
        setField(term35213, term35213.getClass(), "registerTime", term35229);
        setIntField(term35240, term35240.getClass(), "year", 2016);
        setShortField(term35240, term35240.getClass(), "month", (short) 12);
        setShortField(term35240, term35240.getClass(), "day", (short) 20);
        setField(term35239, term35239.getClass(), "date", term35240);
        setByteField(term35244, term35244.getClass(), "hour", (byte) 8);
        setByteField(term35244, term35244.getClass(), "minute", (byte) 46);
        setByteField(term35244, term35244.getClass(), "second", (byte) 16);
        setIntField(term35244, term35244.getClass(), "nano", 10071864);
        setField(term35239, term35239.getClass(), "time", term35244);
        setField(term35213, term35213.getClass(), "accessTime", term35239);
        setField(term35211, term35211.getClass(), "card", term35213);
        setField(term35211, term35211.getClass(), "userName", "jWOWtrhVkA");
        setIntField(term35211, term35211.getClass(), "isNetMember", -697986260);
        setIntField(term35211, term35211.getClass(), "iconId", -672315403);
        setIntField(term35211, term35211.getClass(), "plateId", 507507290);
        setIntField(term35211, term35211.getClass(), "titleId", 9057138);
        setIntField(term35211, term35211.getClass(), "partnerId", 2130019201);
        setIntField(term35211, term35211.getClass(), "frameId", 504634766);
        setIntField(term35211, term35211.getClass(), "selectMapId", 1963462917);
        setIntField(term35211, term35211.getClass(), "totalAwake", 552203554);
        setIntField(term35211, term35211.getClass(), "gradeRating", 1645215896);
        setIntField(term35211, term35211.getClass(), "musicRating", -914100840);
        setIntField(term35211, term35211.getClass(), "playerRating", 1806294616);
        setIntField(term35211, term35211.getClass(), "highestRating", 1766086753);
        setIntField(term35211, term35211.getClass(), "gradeRank", -1211119545);
        setIntField(term35211, term35211.getClass(), "classRank", 1584121590);
        setIntField(term35211, term35211.getClass(), "courseRank", 1133839602);
        setField(term35211, term35211.getClass(), "charaSlot", term35276);
        setField(term35211, term35211.getClass(), "charaLockSlot", term35292);
        setLongField(term35211, term35211.getClass(), "contentBit", 60910260492008727L);
        setIntField(term35211, term35211.getClass(), "playCount", -986002923);
        setField(term35211, term35211.getClass(), "eventWatchedDate", "IyOhWYyaDV");
        setField(term35211, term35211.getClass(), "lastGameId", "omWrkCSFzy");
        setField(term35211, term35211.getClass(), "lastRomVersion", "VFYvUTgYFB");
        setField(term35211, term35211.getClass(), "lastDataVersion", "BrWqhEIUUj");
        setField(term35211, term35211.getClass(), "lastLoginDate", "WfUmxdiHcU");
        setField(term35211, term35211.getClass(), "lastPlayDate", "BRrftvRvmF");
        setIntField(term35211, term35211.getClass(), "lastPlayCredit", 724930183);
        setIntField(term35211, term35211.getClass(), "lastPlayMode", 1053680722);
        setIntField(term35211, term35211.getClass(), "lastPlaceId", -1920949340);
        setField(term35211, term35211.getClass(), "lastPlaceName", "fvoyRbZTsm");
        setIntField(term35211, term35211.getClass(), "lastAllNetId", 1211730228);
        setIntField(term35211, term35211.getClass(), "lastRegionId", 892506528);
        setField(term35211, term35211.getClass(), "lastRegionName", "iOCnOQXWTl");
        setField(term35211, term35211.getClass(), "lastClientId", "ARnOWpgtAg");
        setField(term35211, term35211.getClass(), "lastCountryCode", "MRrYxZoJBW");
        setIntField(term35211, term35211.getClass(), "lastSelectEMoney", -1203169418);
        setIntField(term35211, term35211.getClass(), "lastSelectTicket", -938772433);
        setIntField(term35211, term35211.getClass(), "lastSelectCourse", 46527533);
        setIntField(term35211, term35211.getClass(), "lastCountCourse", 1199950979);
        setField(term35211, term35211.getClass(), "firstGameId", "fheZXFNQZh");
        setField(term35211, term35211.getClass(), "firstRomVersion", "YxHVWlebna");
        setField(term35211, term35211.getClass(), "firstDataVersion", "IEmAQCkrPE");
        setField(term35211, term35211.getClass(), "firstPlayDate", "lqFGhtlNRM");
        setField(term35211, term35211.getClass(), "compatibleCmVersion", "GLxLHUsuLw");
        setField(term35211, term35211.getClass(), "dailyBonusDate", "HuKdqrrxIm");
        setField(term35211, term35211.getClass(), "dailyCourseBonusDate", "yJKKddLqMb");
        setField(term35211, term35211.getClass(), "lastPairLoginDate", "LWEYaXeKBe");
        setField(term35211, term35211.getClass(), "lastTrialPlayDate", "cNoFvpHBHw");
        setIntField(term35211, term35211.getClass(), "playVsCount", 733812186);
        setIntField(term35211, term35211.getClass(), "playSyncCount", -840076719);
        setIntField(term35211, term35211.getClass(), "winCount", 2002762153);
        setIntField(term35211, term35211.getClass(), "helpCount", -531666058);
        setIntField(term35211, term35211.getClass(), "comboCount", -1659995523);
        setLongField(term35211, term35211.getClass(), "totalDeluxscore", 1696831840206676000L);
        setLongField(term35211, term35211.getClass(), "totalBasicDeluxscore", 6079978726138581731L);
        setLongField(term35211, term35211.getClass(), "totalAdvancedDeluxscore", 2001497540145118L);
        setLongField(term35211, term35211.getClass(), "totalExpertDeluxscore", -9048797705753068816L);
        setLongField(term35211, term35211.getClass(), "totalMasterDeluxscore", -5796564556566273156L);
        setLongField(term35211, term35211.getClass(), "totalReMasterDeluxscore", 4376251358600000238L);
        setIntField(term35211, term35211.getClass(), "totalSync", -1384058110);
        setIntField(term35211, term35211.getClass(), "totalBasicSync", -109584269);
        setIntField(term35211, term35211.getClass(), "totalAdvancedSync", -682334474);
        setIntField(term35211, term35211.getClass(), "totalExpertSync", -666332937);
        setIntField(term35211, term35211.getClass(), "totalMasterSync", 1661615099);
        setIntField(term35211, term35211.getClass(), "totalReMasterSync", 1908136627);
        setLongField(term35211, term35211.getClass(), "totalAchievement", -3708632729138387526L);
        setLongField(term35211, term35211.getClass(), "totalBasicAchievement", 2359134970522271046L);
        setLongField(term35211, term35211.getClass(), "totalAdvancedAchievement", -6198150397627694231L);
        setLongField(term35211, term35211.getClass(), "totalExpertAchievement", 7725924092701084764L);
        setLongField(term35211, term35211.getClass(), "totalMasterAchievement", -3646702249834556847L);
        setLongField(term35211, term35211.getClass(), "totalReMasterAchievement", 2701558556303760915L);
        setLongField(term35211, term35211.getClass(), "playerOldRating", 4187385369384657492L);
        setLongField(term35211, term35211.getClass(), "playerNewRating", -8947510185810654315L);
        setIntField(term35211, term35211.getClass(), "banState", 824600792);
        setLongField(term35211, term35211.getClass(), "dateTime", -2356977949142999853L);
        setField(term35209, term35209.getClass(), "user", term35211);
        setIntField(term35209, term35209.getClass(), "itemKind", -1498923569);
        setIntField(term35209, term35209.getClass(), "itemId", 1082643319);
        setIntField(term35209, term35209.getClass(), "stock", -1138616222);
        setBooleanField(term35209, term35209.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemId", argTypes, term35209, args);
    }

};


