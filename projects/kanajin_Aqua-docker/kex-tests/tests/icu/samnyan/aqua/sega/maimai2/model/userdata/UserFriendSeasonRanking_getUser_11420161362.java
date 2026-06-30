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

public class UserFriendSeasonRanking_getUser_11420161362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15810;

    public UserFriendSeasonRanking_getUser_11420161362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15816 = new Long(-4502405999831680926L);
        ArrayList term15877 = new ArrayList();
        Integer term15883 = new Integer(-1111249833);
        Integer term15885 = new Integer(-1692331299);
        ArrayList term15881 = new ArrayList();
        ((ArrayList) term15881).add(term15883);
        ((ArrayList) term15881).add(term15885);
        term15810 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term15812 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term15814 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15835 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15845 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15810, term15810.getClass(), "id", 2166921473521388808L);
        setLongField(term15812, term15812.getClass(), "id", 1964822153944985001L);
        setLongField(term15814, term15814.getClass(), "id", -955253666696787757L);
        setField(term15814, term15814.getClass(), "extId", term15816);
        setField(term15814, term15814.getClass(), "luid", "lJoltmsadS");
        setIntField(term15831, term15831.getClass(), "year", 2025);
        setShortField(term15831, term15831.getClass(), "month", (short) 9);
        setShortField(term15831, term15831.getClass(), "day", (short) 25);
        setField(term15830, term15830.getClass(), "date", term15831);
        setByteField(term15835, term15835.getClass(), "hour", (byte) 20);
        setByteField(term15835, term15835.getClass(), "minute", (byte) 0);
        setByteField(term15835, term15835.getClass(), "second", (byte) 25);
        setIntField(term15835, term15835.getClass(), "nano", 65871584);
        setField(term15830, term15830.getClass(), "time", term15835);
        setField(term15814, term15814.getClass(), "registerTime", term15830);
        setIntField(term15841, term15841.getClass(), "year", 2011);
        setShortField(term15841, term15841.getClass(), "month", (short) 9);
        setShortField(term15841, term15841.getClass(), "day", (short) 25);
        setField(term15840, term15840.getClass(), "date", term15841);
        setByteField(term15845, term15845.getClass(), "hour", (byte) 16);
        setByteField(term15845, term15845.getClass(), "minute", (byte) 45);
        setByteField(term15845, term15845.getClass(), "second", (byte) 19);
        setIntField(term15845, term15845.getClass(), "nano", 962864785);
        setField(term15840, term15840.getClass(), "time", term15845);
        setField(term15814, term15814.getClass(), "accessTime", term15840);
        setField(term15812, term15812.getClass(), "card", term15814);
        setField(term15812, term15812.getClass(), "userName", "mvfDtZNEHr");
        setIntField(term15812, term15812.getClass(), "isNetMember", 1833713431);
        setIntField(term15812, term15812.getClass(), "iconId", -706222608);
        setIntField(term15812, term15812.getClass(), "plateId", -2003607923);
        setIntField(term15812, term15812.getClass(), "titleId", 1378805929);
        setIntField(term15812, term15812.getClass(), "partnerId", 695052304);
        setIntField(term15812, term15812.getClass(), "frameId", -179937218);
        setIntField(term15812, term15812.getClass(), "selectMapId", 940896043);
        setIntField(term15812, term15812.getClass(), "totalAwake", -1156002984);
        setIntField(term15812, term15812.getClass(), "gradeRating", 1676254730);
        setIntField(term15812, term15812.getClass(), "musicRating", -1661200819);
        setIntField(term15812, term15812.getClass(), "playerRating", -235039141);
        setIntField(term15812, term15812.getClass(), "highestRating", -1414233013);
        setIntField(term15812, term15812.getClass(), "gradeRank", -1174440096);
        setIntField(term15812, term15812.getClass(), "classRank", -679614653);
        setIntField(term15812, term15812.getClass(), "courseRank", -561851867);
        setField(term15812, term15812.getClass(), "charaSlot", term15877);
        setField(term15812, term15812.getClass(), "charaLockSlot", term15881);
        setLongField(term15812, term15812.getClass(), "contentBit", -99017747847004910L);
        setIntField(term15812, term15812.getClass(), "playCount", -1809928454);
        setField(term15812, term15812.getClass(), "eventWatchedDate", "bvSgmFUDOU");
        setField(term15812, term15812.getClass(), "lastGameId", "XMHwbfiHRl");
        setField(term15812, term15812.getClass(), "lastRomVersion", "bucTnYicnp");
        setField(term15812, term15812.getClass(), "lastDataVersion", "EkgprvqZlM");
        setField(term15812, term15812.getClass(), "lastLoginDate", "fbnKvthhOz");
        setField(term15812, term15812.getClass(), "lastPlayDate", "PGfCDJTBek");
        setIntField(term15812, term15812.getClass(), "lastPlayCredit", -191639503);
        setIntField(term15812, term15812.getClass(), "lastPlayMode", -1563700756);
        setIntField(term15812, term15812.getClass(), "lastPlaceId", -208314837);
        setField(term15812, term15812.getClass(), "lastPlaceName", "ZwjARhAtHC");
        setIntField(term15812, term15812.getClass(), "lastAllNetId", 697841387);
        setIntField(term15812, term15812.getClass(), "lastRegionId", -1749591213);
        setField(term15812, term15812.getClass(), "lastRegionName", "XXvscsYBWv");
        setField(term15812, term15812.getClass(), "lastClientId", "uePedtiAfL");
        setField(term15812, term15812.getClass(), "lastCountryCode", "AdSHvysxQB");
        setIntField(term15812, term15812.getClass(), "lastSelectEMoney", 1703093401);
        setIntField(term15812, term15812.getClass(), "lastSelectTicket", 47607734);
        setIntField(term15812, term15812.getClass(), "lastSelectCourse", 1717232691);
        setIntField(term15812, term15812.getClass(), "lastCountCourse", -938127737);
        setField(term15812, term15812.getClass(), "firstGameId", "jlraKkBWFA");
        setField(term15812, term15812.getClass(), "firstRomVersion", "mRBtFTxVdE");
        setField(term15812, term15812.getClass(), "firstDataVersion", "IVacFDAZcj");
        setField(term15812, term15812.getClass(), "firstPlayDate", "EEYmuwyVDP");
        setField(term15812, term15812.getClass(), "compatibleCmVersion", "EWFbEDAVrE");
        setField(term15812, term15812.getClass(), "dailyBonusDate", "EMiMtYgfvr");
        setField(term15812, term15812.getClass(), "dailyCourseBonusDate", "OyYyYYnJuF");
        setField(term15812, term15812.getClass(), "lastPairLoginDate", "aYLvcxZohT");
        setField(term15812, term15812.getClass(), "lastTrialPlayDate", "mnHyQbMyld");
        setIntField(term15812, term15812.getClass(), "playVsCount", -1408678076);
        setIntField(term15812, term15812.getClass(), "playSyncCount", 1201413899);
        setIntField(term15812, term15812.getClass(), "winCount", -376722373);
        setIntField(term15812, term15812.getClass(), "helpCount", 1180687854);
        setIntField(term15812, term15812.getClass(), "comboCount", 328631288);
        setLongField(term15812, term15812.getClass(), "totalDeluxscore", 797798302378380033L);
        setLongField(term15812, term15812.getClass(), "totalBasicDeluxscore", 4892304277320345810L);
        setLongField(term15812, term15812.getClass(), "totalAdvancedDeluxscore", -3271370917942710167L);
        setLongField(term15812, term15812.getClass(), "totalExpertDeluxscore", -8928717808154338062L);
        setLongField(term15812, term15812.getClass(), "totalMasterDeluxscore", 4628458998884457238L);
        setLongField(term15812, term15812.getClass(), "totalReMasterDeluxscore", -6806576523000182981L);
        setIntField(term15812, term15812.getClass(), "totalSync", -1631415805);
        setIntField(term15812, term15812.getClass(), "totalBasicSync", 1073400519);
        setIntField(term15812, term15812.getClass(), "totalAdvancedSync", -2025555268);
        setIntField(term15812, term15812.getClass(), "totalExpertSync", -746950289);
        setIntField(term15812, term15812.getClass(), "totalMasterSync", -137577510);
        setIntField(term15812, term15812.getClass(), "totalReMasterSync", 719185716);
        setLongField(term15812, term15812.getClass(), "totalAchievement", 6437032166810658671L);
        setLongField(term15812, term15812.getClass(), "totalBasicAchievement", 6044346825617132280L);
        setLongField(term15812, term15812.getClass(), "totalAdvancedAchievement", -4994148485124075625L);
        setLongField(term15812, term15812.getClass(), "totalExpertAchievement", -8842842172497711872L);
        setLongField(term15812, term15812.getClass(), "totalMasterAchievement", -5367775625638780650L);
        setLongField(term15812, term15812.getClass(), "totalReMasterAchievement", -7830820957252387854L);
        setLongField(term15812, term15812.getClass(), "playerOldRating", -8985577692063635272L);
        setLongField(term15812, term15812.getClass(), "playerNewRating", 6545086285386938562L);
        setIntField(term15812, term15812.getClass(), "banState", 1624820010);
        setLongField(term15812, term15812.getClass(), "dateTime", 3951346165629352117L);
        setField(term15810, term15810.getClass(), "user", term15812);
        setIntField(term15810, term15810.getClass(), "seasonId", -831921156);
        setIntField(term15810, term15810.getClass(), "point", -2085566906);
        setIntField(term15810, term15810.getClass(), "rank", 1773193728);
        setBooleanField(term15810, term15810.getClass(), "rewardGet", false);
        setField(term15810, term15810.getClass(), "userName", "KHtaDOIcJZ");
        setField(term15810, term15810.getClass(), "recordDate", "vgdwrCZczl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term15810, args);
    }

};


