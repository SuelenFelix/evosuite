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

public class UserCharge_getPurchaseDate_13041775855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123407;

    public UserCharge_getPurchaseDate_13041775855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123413 = new Long(8863790908271299748L);
        ArrayList term123474 = new ArrayList();
        Integer term123480 = new Integer(-1056969264);
        Integer term123482 = new Integer(-709130701);
        Integer term123484 = new Integer(86144663);
        Integer term123486 = new Integer(-1480903995);
        Integer term123488 = new Integer(-2111772603);
        Integer term123490 = new Integer(637942911);
        Integer term123492 = new Integer(-395396657);
        ArrayList term123478 = new ArrayList();
        ((ArrayList) term123478).add(term123480);
        ((ArrayList) term123478).add(term123482);
        ((ArrayList) term123478).add(term123484);
        ((ArrayList) term123478).add(term123486);
        ((ArrayList) term123478).add(term123488);
        ((ArrayList) term123478).add(term123490);
        ((ArrayList) term123478).add(term123492);
        term123407 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term123409 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term123411 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123407, term123407.getClass(), "id", -9019732071183292416L);
        setLongField(term123409, term123409.getClass(), "id", 964480357268932511L);
        setLongField(term123411, term123411.getClass(), "id", -4250525757325272766L);
        setField(term123411, term123411.getClass(), "extId", term123413);
        setField(term123411, term123411.getClass(), "luid", "BotFhHNSzH");
        setIntField(term123428, term123428.getClass(), "year", 2025);
        setShortField(term123428, term123428.getClass(), "month", (short) 9);
        setShortField(term123428, term123428.getClass(), "day", (short) 5);
        setField(term123427, term123427.getClass(), "date", term123428);
        setByteField(term123432, term123432.getClass(), "hour", (byte) 11);
        setByteField(term123432, term123432.getClass(), "minute", (byte) 59);
        setByteField(term123432, term123432.getClass(), "second", (byte) 37);
        setIntField(term123432, term123432.getClass(), "nano", 93740487);
        setField(term123427, term123427.getClass(), "time", term123432);
        setField(term123411, term123411.getClass(), "registerTime", term123427);
        setIntField(term123438, term123438.getClass(), "year", 2028);
        setShortField(term123438, term123438.getClass(), "month", (short) 12);
        setShortField(term123438, term123438.getClass(), "day", (short) 28);
        setField(term123437, term123437.getClass(), "date", term123438);
        setByteField(term123442, term123442.getClass(), "hour", (byte) 11);
        setByteField(term123442, term123442.getClass(), "minute", (byte) 37);
        setByteField(term123442, term123442.getClass(), "second", (byte) 0);
        setIntField(term123442, term123442.getClass(), "nano", 315383282);
        setField(term123437, term123437.getClass(), "time", term123442);
        setField(term123411, term123411.getClass(), "accessTime", term123437);
        setField(term123409, term123409.getClass(), "card", term123411);
        setField(term123409, term123409.getClass(), "userName", "LcLfqpnOTW");
        setIntField(term123409, term123409.getClass(), "isNetMember", 674695717);
        setIntField(term123409, term123409.getClass(), "iconId", 1298497946);
        setIntField(term123409, term123409.getClass(), "plateId", -1334742529);
        setIntField(term123409, term123409.getClass(), "titleId", -935891827);
        setIntField(term123409, term123409.getClass(), "partnerId", 1922432280);
        setIntField(term123409, term123409.getClass(), "frameId", -358531856);
        setIntField(term123409, term123409.getClass(), "selectMapId", 249710866);
        setIntField(term123409, term123409.getClass(), "totalAwake", -1526265440);
        setIntField(term123409, term123409.getClass(), "gradeRating", 1627034192);
        setIntField(term123409, term123409.getClass(), "musicRating", -1316138191);
        setIntField(term123409, term123409.getClass(), "playerRating", 1739661119);
        setIntField(term123409, term123409.getClass(), "highestRating", -616399232);
        setIntField(term123409, term123409.getClass(), "gradeRank", -1754380742);
        setIntField(term123409, term123409.getClass(), "classRank", -1377304901);
        setIntField(term123409, term123409.getClass(), "courseRank", -362697593);
        setField(term123409, term123409.getClass(), "charaSlot", term123474);
        setField(term123409, term123409.getClass(), "charaLockSlot", term123478);
        setLongField(term123409, term123409.getClass(), "contentBit", -4598924338147045508L);
        setIntField(term123409, term123409.getClass(), "playCount", -1972052281);
        setField(term123409, term123409.getClass(), "eventWatchedDate", "hGwBHMBbGw");
        setField(term123409, term123409.getClass(), "lastGameId", "CzTiZXTrcB");
        setField(term123409, term123409.getClass(), "lastRomVersion", "HOEmWmVnLk");
        setField(term123409, term123409.getClass(), "lastDataVersion", "LxSzRiSUke");
        setField(term123409, term123409.getClass(), "lastLoginDate", "NxbQJWSXQu");
        setField(term123409, term123409.getClass(), "lastPlayDate", "ByfIvofaQE");
        setIntField(term123409, term123409.getClass(), "lastPlayCredit", 1935086654);
        setIntField(term123409, term123409.getClass(), "lastPlayMode", -1631985638);
        setIntField(term123409, term123409.getClass(), "lastPlaceId", -2095728614);
        setField(term123409, term123409.getClass(), "lastPlaceName", "xvhHgJLoQS");
        setIntField(term123409, term123409.getClass(), "lastAllNetId", 436401547);
        setIntField(term123409, term123409.getClass(), "lastRegionId", 788471676);
        setField(term123409, term123409.getClass(), "lastRegionName", "bKSYtrrxDp");
        setField(term123409, term123409.getClass(), "lastClientId", "fQYVEGPLIF");
        setField(term123409, term123409.getClass(), "lastCountryCode", "qRwTBVZctS");
        setIntField(term123409, term123409.getClass(), "lastSelectEMoney", -1768256854);
        setIntField(term123409, term123409.getClass(), "lastSelectTicket", -1924640207);
        setIntField(term123409, term123409.getClass(), "lastSelectCourse", -1337500518);
        setIntField(term123409, term123409.getClass(), "lastCountCourse", 1075950264);
        setField(term123409, term123409.getClass(), "firstGameId", "BRBDbdsahC");
        setField(term123409, term123409.getClass(), "firstRomVersion", "TQAFOeWgvq");
        setField(term123409, term123409.getClass(), "firstDataVersion", "AtYIxbvLDg");
        setField(term123409, term123409.getClass(), "firstPlayDate", "rQdqhBCIJv");
        setField(term123409, term123409.getClass(), "compatibleCmVersion", "OWnGgqSmUN");
        setField(term123409, term123409.getClass(), "dailyBonusDate", "BLSUZfTILp");
        setField(term123409, term123409.getClass(), "dailyCourseBonusDate", "tlymfAhXiZ");
        setField(term123409, term123409.getClass(), "lastPairLoginDate", "rlLIYBJlxU");
        setField(term123409, term123409.getClass(), "lastTrialPlayDate", "jtfkxwFefh");
        setIntField(term123409, term123409.getClass(), "playVsCount", 2023667585);
        setIntField(term123409, term123409.getClass(), "playSyncCount", -1457367270);
        setIntField(term123409, term123409.getClass(), "winCount", 599933959);
        setIntField(term123409, term123409.getClass(), "helpCount", 1546898322);
        setIntField(term123409, term123409.getClass(), "comboCount", 1681670795);
        setLongField(term123409, term123409.getClass(), "totalDeluxscore", -7798512476724848724L);
        setLongField(term123409, term123409.getClass(), "totalBasicDeluxscore", -6636305539248410003L);
        setLongField(term123409, term123409.getClass(), "totalAdvancedDeluxscore", -8306549483888831076L);
        setLongField(term123409, term123409.getClass(), "totalExpertDeluxscore", 3001030288522197031L);
        setLongField(term123409, term123409.getClass(), "totalMasterDeluxscore", -8936504960030242824L);
        setLongField(term123409, term123409.getClass(), "totalReMasterDeluxscore", -4291328560280156992L);
        setIntField(term123409, term123409.getClass(), "totalSync", 371953556);
        setIntField(term123409, term123409.getClass(), "totalBasicSync", 1627368933);
        setIntField(term123409, term123409.getClass(), "totalAdvancedSync", -976378630);
        setIntField(term123409, term123409.getClass(), "totalExpertSync", -1198631435);
        setIntField(term123409, term123409.getClass(), "totalMasterSync", 243073628);
        setIntField(term123409, term123409.getClass(), "totalReMasterSync", 12526162);
        setLongField(term123409, term123409.getClass(), "totalAchievement", -1163727825723957648L);
        setLongField(term123409, term123409.getClass(), "totalBasicAchievement", 8220792944351089814L);
        setLongField(term123409, term123409.getClass(), "totalAdvancedAchievement", -9040298392772084730L);
        setLongField(term123409, term123409.getClass(), "totalExpertAchievement", 2095007304108397167L);
        setLongField(term123409, term123409.getClass(), "totalMasterAchievement", -7594793421594151985L);
        setLongField(term123409, term123409.getClass(), "totalReMasterAchievement", 8363401122590878689L);
        setLongField(term123409, term123409.getClass(), "playerOldRating", 4929068297635679738L);
        setLongField(term123409, term123409.getClass(), "playerNewRating", 2399802570466674676L);
        setIntField(term123409, term123409.getClass(), "banState", 1392375010);
        setLongField(term123409, term123409.getClass(), "dateTime", 761224603953256721L);
        setField(term123407, term123407.getClass(), "user", term123409);
        setIntField(term123407, term123407.getClass(), "chargeId", -1993971761);
        setIntField(term123407, term123407.getClass(), "stock", 1389251335);
        setField(term123407, term123407.getClass(), "purchaseDate", "ESnYpdjELS");
        setField(term123407, term123407.getClass(), "validDate", "IsOpDBwqZb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPurchaseDate", argTypes, term123407, args);
    }

};


