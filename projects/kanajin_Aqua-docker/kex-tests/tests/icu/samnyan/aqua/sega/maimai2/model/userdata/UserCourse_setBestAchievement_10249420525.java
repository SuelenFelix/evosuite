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

public class UserCourse_setBestAchievement_10249420525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87940;
     Object term88343;

    public UserCourse_setBestAchievement_10249420525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87946 = new Long(4513004407927379358L);
        ArrayList term88007 = new ArrayList();
        Integer term88013 = new Integer(-1470115841);
        Integer term88015 = new Integer(480909331);
        Integer term88017 = new Integer(-2024983877);
        ArrayList term88011 = new ArrayList();
        ((ArrayList) term88011).add(term88013);
        ((ArrayList) term88011).add(term88015);
        ((ArrayList) term88011).add(term88017);
        term87940 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term87942 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term87944 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87975 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87940, term87940.getClass(), "id", -3770150361529994189L);
        setLongField(term87942, term87942.getClass(), "id", -5192359707785218791L);
        setLongField(term87944, term87944.getClass(), "id", 667203912128652795L);
        setField(term87944, term87944.getClass(), "extId", term87946);
        setField(term87944, term87944.getClass(), "luid", "SkfJvbcpSy");
        setIntField(term87961, term87961.getClass(), "year", 2015);
        setShortField(term87961, term87961.getClass(), "month", (short) 1);
        setShortField(term87961, term87961.getClass(), "day", (short) 7);
        setField(term87960, term87960.getClass(), "date", term87961);
        setByteField(term87965, term87965.getClass(), "hour", (byte) 10);
        setByteField(term87965, term87965.getClass(), "minute", (byte) 8);
        setByteField(term87965, term87965.getClass(), "second", (byte) 31);
        setIntField(term87965, term87965.getClass(), "nano", 617142943);
        setField(term87960, term87960.getClass(), "time", term87965);
        setField(term87944, term87944.getClass(), "registerTime", term87960);
        setIntField(term87971, term87971.getClass(), "year", 2024);
        setShortField(term87971, term87971.getClass(), "month", (short) 2);
        setShortField(term87971, term87971.getClass(), "day", (short) 2);
        setField(term87970, term87970.getClass(), "date", term87971);
        setByteField(term87975, term87975.getClass(), "hour", (byte) 5);
        setByteField(term87975, term87975.getClass(), "minute", (byte) 8);
        setByteField(term87975, term87975.getClass(), "second", (byte) 10);
        setIntField(term87975, term87975.getClass(), "nano", 897554578);
        setField(term87970, term87970.getClass(), "time", term87975);
        setField(term87944, term87944.getClass(), "accessTime", term87970);
        setField(term87942, term87942.getClass(), "card", term87944);
        setField(term87942, term87942.getClass(), "userName", "NQVfrHmuUQ");
        setIntField(term87942, term87942.getClass(), "isNetMember", -1473884288);
        setIntField(term87942, term87942.getClass(), "iconId", 995576841);
        setIntField(term87942, term87942.getClass(), "plateId", 35377738);
        setIntField(term87942, term87942.getClass(), "titleId", -1203460897);
        setIntField(term87942, term87942.getClass(), "partnerId", 461696366);
        setIntField(term87942, term87942.getClass(), "frameId", -1208838584);
        setIntField(term87942, term87942.getClass(), "selectMapId", 800934965);
        setIntField(term87942, term87942.getClass(), "totalAwake", -648802697);
        setIntField(term87942, term87942.getClass(), "gradeRating", -1853172793);
        setIntField(term87942, term87942.getClass(), "musicRating", 1629792321);
        setIntField(term87942, term87942.getClass(), "playerRating", 1671901268);
        setIntField(term87942, term87942.getClass(), "highestRating", 664189062);
        setIntField(term87942, term87942.getClass(), "gradeRank", 142248510);
        setIntField(term87942, term87942.getClass(), "classRank", -216485815);
        setIntField(term87942, term87942.getClass(), "courseRank", -2089843700);
        setField(term87942, term87942.getClass(), "charaSlot", term88007);
        setField(term87942, term87942.getClass(), "charaLockSlot", term88011);
        setLongField(term87942, term87942.getClass(), "contentBit", 6406550558830666117L);
        setIntField(term87942, term87942.getClass(), "playCount", 1415280814);
        setField(term87942, term87942.getClass(), "eventWatchedDate", "BxUEPMTBxW");
        setField(term87942, term87942.getClass(), "lastGameId", "OkwcYhqTPO");
        setField(term87942, term87942.getClass(), "lastRomVersion", "XeHaPiTvPt");
        setField(term87942, term87942.getClass(), "lastDataVersion", "GsyGZIlHgo");
        setField(term87942, term87942.getClass(), "lastLoginDate", "DPTUtDUuOf");
        setField(term87942, term87942.getClass(), "lastPlayDate", "TwTeGrJqeV");
        setIntField(term87942, term87942.getClass(), "lastPlayCredit", -1126317271);
        setIntField(term87942, term87942.getClass(), "lastPlayMode", -131983803);
        setIntField(term87942, term87942.getClass(), "lastPlaceId", -939562832);
        setField(term87942, term87942.getClass(), "lastPlaceName", "EmqjtKbtwp");
        setIntField(term87942, term87942.getClass(), "lastAllNetId", 885547834);
        setIntField(term87942, term87942.getClass(), "lastRegionId", 950260961);
        setField(term87942, term87942.getClass(), "lastRegionName", "BIcjuljzhc");
        setField(term87942, term87942.getClass(), "lastClientId", "SQDHGXSyaX");
        setField(term87942, term87942.getClass(), "lastCountryCode", "apdJoJDItV");
        setIntField(term87942, term87942.getClass(), "lastSelectEMoney", 1260887150);
        setIntField(term87942, term87942.getClass(), "lastSelectTicket", -1320147216);
        setIntField(term87942, term87942.getClass(), "lastSelectCourse", -2003639421);
        setIntField(term87942, term87942.getClass(), "lastCountCourse", -1986137013);
        setField(term87942, term87942.getClass(), "firstGameId", "UidjRWfqYK");
        setField(term87942, term87942.getClass(), "firstRomVersion", "SrmUNtssfz");
        setField(term87942, term87942.getClass(), "firstDataVersion", "ARMUeNVaDF");
        setField(term87942, term87942.getClass(), "firstPlayDate", "EUduJelZVE");
        setField(term87942, term87942.getClass(), "compatibleCmVersion", "uwfvHKGrlb");
        setField(term87942, term87942.getClass(), "dailyBonusDate", "pSLljKyfgK");
        setField(term87942, term87942.getClass(), "dailyCourseBonusDate", "JTQXicvesT");
        setField(term87942, term87942.getClass(), "lastPairLoginDate", "lfirJwUftT");
        setField(term87942, term87942.getClass(), "lastTrialPlayDate", "oiIvvyhWbf");
        setIntField(term87942, term87942.getClass(), "playVsCount", 1067010136);
        setIntField(term87942, term87942.getClass(), "playSyncCount", 1093205391);
        setIntField(term87942, term87942.getClass(), "winCount", 712406676);
        setIntField(term87942, term87942.getClass(), "helpCount", -689175370);
        setIntField(term87942, term87942.getClass(), "comboCount", 1928157231);
        setLongField(term87942, term87942.getClass(), "totalDeluxscore", 6809106978780494840L);
        setLongField(term87942, term87942.getClass(), "totalBasicDeluxscore", -6385753772670302830L);
        setLongField(term87942, term87942.getClass(), "totalAdvancedDeluxscore", -5492665078635116313L);
        setLongField(term87942, term87942.getClass(), "totalExpertDeluxscore", -6642317903316072178L);
        setLongField(term87942, term87942.getClass(), "totalMasterDeluxscore", -8663415403140355626L);
        setLongField(term87942, term87942.getClass(), "totalReMasterDeluxscore", -6164870242783962017L);
        setIntField(term87942, term87942.getClass(), "totalSync", -2074171560);
        setIntField(term87942, term87942.getClass(), "totalBasicSync", -1484133359);
        setIntField(term87942, term87942.getClass(), "totalAdvancedSync", -221900568);
        setIntField(term87942, term87942.getClass(), "totalExpertSync", -660551612);
        setIntField(term87942, term87942.getClass(), "totalMasterSync", -1263481774);
        setIntField(term87942, term87942.getClass(), "totalReMasterSync", 304959828);
        setLongField(term87942, term87942.getClass(), "totalAchievement", -852178810374130490L);
        setLongField(term87942, term87942.getClass(), "totalBasicAchievement", 3557402050530427336L);
        setLongField(term87942, term87942.getClass(), "totalAdvancedAchievement", -8153392834863780469L);
        setLongField(term87942, term87942.getClass(), "totalExpertAchievement", 2099475006510474987L);
        setLongField(term87942, term87942.getClass(), "totalMasterAchievement", 8670871793677477111L);
        setLongField(term87942, term87942.getClass(), "totalReMasterAchievement", 1849019432435290766L);
        setLongField(term87942, term87942.getClass(), "playerOldRating", 1860828043112015415L);
        setLongField(term87942, term87942.getClass(), "playerNewRating", -5221172945585313119L);
        setIntField(term87942, term87942.getClass(), "banState", -398737037);
        setLongField(term87942, term87942.getClass(), "dateTime", -4331547344847792516L);
        setField(term87940, term87940.getClass(), "user", term87942);
        setIntField(term87940, term87940.getClass(), "courseId", 108801223);
        setBooleanField(term87940, term87940.getClass(), "isLastClear", true);
        setIntField(term87940, term87940.getClass(), "totalRestlife", 1181798962);
        setIntField(term87940, term87940.getClass(), "totalAchievement", 1950935768);
        setIntField(term87940, term87940.getClass(), "totalDeluxscore", -733715380);
        setIntField(term87940, term87940.getClass(), "playCount", 1537598422);
        setField(term87940, term87940.getClass(), "clearDate", "EhCoIxBpMd");
        setField(term87940, term87940.getClass(), "lastPlayDate", "bUOSwRmGmB");
        setIntField(term87940, term87940.getClass(), "bestAchievement", 2011217936);
        setField(term87940, term87940.getClass(), "bestAchievementDate", "jJzyVCBtLl");
        setIntField(term87940, term87940.getClass(), "bestDeluxscore", 490201050);
        setField(term87940, term87940.getClass(), "bestDeluxscoreDate", "MZPPOYZzth");
        term88343 = new Integer(1544509853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term88343;
        callMethod(klass, "setBestAchievement", argTypes, term87940, args);
    }

};


