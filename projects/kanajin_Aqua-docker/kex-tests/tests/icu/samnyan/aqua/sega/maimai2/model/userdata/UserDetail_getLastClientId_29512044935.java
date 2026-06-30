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

public class UserDetail_getLastClientId_29512044935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4249367;

    public UserDetail_getLastClientId_29512044935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4249371 = new Long(6039526514925686649L);
        ArrayList term4249432 = new ArrayList();
        Integer term4249438 = new Integer(-997603268);
        Integer term4249440 = new Integer(-1827144788);
        Integer term4249442 = new Integer(-1031810940);
        ArrayList term4249436 = new ArrayList();
        ((ArrayList) term4249436).add(term4249438);
        ((ArrayList) term4249436).add(term4249440);
        ((ArrayList) term4249436).add(term4249442);
        term4249367 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4249369 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4249385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4249386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4249390 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4249395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4249396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4249400 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4249367, term4249367.getClass(), "id", -5219704137054940138L);
        setLongField(term4249369, term4249369.getClass(), "id", 8157224354290698194L);
        setField(term4249369, term4249369.getClass(), "extId", term4249371);
        setField(term4249369, term4249369.getClass(), "luid", "QOVbRDDDqq");
        setIntField(term4249386, term4249386.getClass(), "year", 2029);
        setShortField(term4249386, term4249386.getClass(), "month", (short) 9);
        setShortField(term4249386, term4249386.getClass(), "day", (short) 3);
        setField(term4249385, term4249385.getClass(), "date", term4249386);
        setByteField(term4249390, term4249390.getClass(), "hour", (byte) 12);
        setByteField(term4249390, term4249390.getClass(), "minute", (byte) 36);
        setByteField(term4249390, term4249390.getClass(), "second", (byte) 25);
        setIntField(term4249390, term4249390.getClass(), "nano", 400538639);
        setField(term4249385, term4249385.getClass(), "time", term4249390);
        setField(term4249369, term4249369.getClass(), "registerTime", term4249385);
        setIntField(term4249396, term4249396.getClass(), "year", 2011);
        setShortField(term4249396, term4249396.getClass(), "month", (short) 6);
        setShortField(term4249396, term4249396.getClass(), "day", (short) 13);
        setField(term4249395, term4249395.getClass(), "date", term4249396);
        setByteField(term4249400, term4249400.getClass(), "hour", (byte) 3);
        setByteField(term4249400, term4249400.getClass(), "minute", (byte) 31);
        setByteField(term4249400, term4249400.getClass(), "second", (byte) 44);
        setIntField(term4249400, term4249400.getClass(), "nano", 756519696);
        setField(term4249395, term4249395.getClass(), "time", term4249400);
        setField(term4249369, term4249369.getClass(), "accessTime", term4249395);
        setField(term4249367, term4249367.getClass(), "card", term4249369);
        setField(term4249367, term4249367.getClass(), "userName", "wOhPcKzfGe");
        setIntField(term4249367, term4249367.getClass(), "isNetMember", -285687070);
        setIntField(term4249367, term4249367.getClass(), "iconId", 1331481916);
        setIntField(term4249367, term4249367.getClass(), "plateId", -173539951);
        setIntField(term4249367, term4249367.getClass(), "titleId", 2137720805);
        setIntField(term4249367, term4249367.getClass(), "partnerId", -438652764);
        setIntField(term4249367, term4249367.getClass(), "frameId", 470563090);
        setIntField(term4249367, term4249367.getClass(), "selectMapId", 861220049);
        setIntField(term4249367, term4249367.getClass(), "totalAwake", -535146112);
        setIntField(term4249367, term4249367.getClass(), "gradeRating", -876947344);
        setIntField(term4249367, term4249367.getClass(), "musicRating", -20977381);
        setIntField(term4249367, term4249367.getClass(), "playerRating", -866988850);
        setIntField(term4249367, term4249367.getClass(), "highestRating", -337024482);
        setIntField(term4249367, term4249367.getClass(), "gradeRank", 796761222);
        setIntField(term4249367, term4249367.getClass(), "classRank", -325373603);
        setIntField(term4249367, term4249367.getClass(), "courseRank", -481354013);
        setField(term4249367, term4249367.getClass(), "charaSlot", term4249432);
        setField(term4249367, term4249367.getClass(), "charaLockSlot", term4249436);
        setLongField(term4249367, term4249367.getClass(), "contentBit", -6551762473471995354L);
        setIntField(term4249367, term4249367.getClass(), "playCount", -1239186672);
        setField(term4249367, term4249367.getClass(), "eventWatchedDate", "KjnNagedkI");
        setField(term4249367, term4249367.getClass(), "lastGameId", "yWjadyxTBo");
        setField(term4249367, term4249367.getClass(), "lastRomVersion", "DfbJBkhzlR");
        setField(term4249367, term4249367.getClass(), "lastDataVersion", "szOzKbwlxf");
        setField(term4249367, term4249367.getClass(), "lastLoginDate", "ztucmImKHn");
        setField(term4249367, term4249367.getClass(), "lastPlayDate", "PQBBOkBIpI");
        setIntField(term4249367, term4249367.getClass(), "lastPlayCredit", 1895878559);
        setIntField(term4249367, term4249367.getClass(), "lastPlayMode", -1021049385);
        setIntField(term4249367, term4249367.getClass(), "lastPlaceId", -421243017);
        setField(term4249367, term4249367.getClass(), "lastPlaceName", "xUovaHqlOY");
        setIntField(term4249367, term4249367.getClass(), "lastAllNetId", 1872703950);
        setIntField(term4249367, term4249367.getClass(), "lastRegionId", -1050707610);
        setField(term4249367, term4249367.getClass(), "lastRegionName", "SWwbDIcJSY");
        setField(term4249367, term4249367.getClass(), "lastClientId", "zVKijWvBzF");
        setField(term4249367, term4249367.getClass(), "lastCountryCode", "wgzzeYLVyE");
        setIntField(term4249367, term4249367.getClass(), "lastSelectEMoney", -91367447);
        setIntField(term4249367, term4249367.getClass(), "lastSelectTicket", -1903117934);
        setIntField(term4249367, term4249367.getClass(), "lastSelectCourse", -912710153);
        setIntField(term4249367, term4249367.getClass(), "lastCountCourse", -45552089);
        setField(term4249367, term4249367.getClass(), "firstGameId", "asGKSEueDE");
        setField(term4249367, term4249367.getClass(), "firstRomVersion", "CkxLhqqyog");
        setField(term4249367, term4249367.getClass(), "firstDataVersion", "xOLwqzNksL");
        setField(term4249367, term4249367.getClass(), "firstPlayDate", "TOFOazVuqs");
        setField(term4249367, term4249367.getClass(), "compatibleCmVersion", "AuKxBzBlaS");
        setField(term4249367, term4249367.getClass(), "dailyBonusDate", "GzCjxLrIzQ");
        setField(term4249367, term4249367.getClass(), "dailyCourseBonusDate", "dDkibtgZZa");
        setField(term4249367, term4249367.getClass(), "lastPairLoginDate", "rkyOqgIvMa");
        setField(term4249367, term4249367.getClass(), "lastTrialPlayDate", "qORYioHtaF");
        setIntField(term4249367, term4249367.getClass(), "playVsCount", -838179340);
        setIntField(term4249367, term4249367.getClass(), "playSyncCount", 1121736626);
        setIntField(term4249367, term4249367.getClass(), "winCount", -730481770);
        setIntField(term4249367, term4249367.getClass(), "helpCount", 1032138181);
        setIntField(term4249367, term4249367.getClass(), "comboCount", -765107907);
        setLongField(term4249367, term4249367.getClass(), "totalDeluxscore", 4066299944630219105L);
        setLongField(term4249367, term4249367.getClass(), "totalBasicDeluxscore", 7157462592283321815L);
        setLongField(term4249367, term4249367.getClass(), "totalAdvancedDeluxscore", 4692551308052372101L);
        setLongField(term4249367, term4249367.getClass(), "totalExpertDeluxscore", -6277969798553274893L);
        setLongField(term4249367, term4249367.getClass(), "totalMasterDeluxscore", 40450609237150478L);
        setLongField(term4249367, term4249367.getClass(), "totalReMasterDeluxscore", 3933076851974868439L);
        setIntField(term4249367, term4249367.getClass(), "totalSync", -1160147489);
        setIntField(term4249367, term4249367.getClass(), "totalBasicSync", 1603464614);
        setIntField(term4249367, term4249367.getClass(), "totalAdvancedSync", 1290518001);
        setIntField(term4249367, term4249367.getClass(), "totalExpertSync", 941231638);
        setIntField(term4249367, term4249367.getClass(), "totalMasterSync", 1718257917);
        setIntField(term4249367, term4249367.getClass(), "totalReMasterSync", 1239968984);
        setLongField(term4249367, term4249367.getClass(), "totalAchievement", 1768485793190532631L);
        setLongField(term4249367, term4249367.getClass(), "totalBasicAchievement", -2539981651395106183L);
        setLongField(term4249367, term4249367.getClass(), "totalAdvancedAchievement", 2368079144169396402L);
        setLongField(term4249367, term4249367.getClass(), "totalExpertAchievement", -6679256617065098325L);
        setLongField(term4249367, term4249367.getClass(), "totalMasterAchievement", -7905875457147027773L);
        setLongField(term4249367, term4249367.getClass(), "totalReMasterAchievement", 680828965186487712L);
        setLongField(term4249367, term4249367.getClass(), "playerOldRating", 5702364973480227372L);
        setLongField(term4249367, term4249367.getClass(), "playerNewRating", -5869345410956464465L);
        setIntField(term4249367, term4249367.getClass(), "banState", -978226280);
        setLongField(term4249367, term4249367.getClass(), "dateTime", -2587663017638864854L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term4249367, args);
    }

};


