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

public class UserDetail_getHelpCount_212661772853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4259511;

    public UserDetail_getHelpCount_212661772853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4259515 = new Long(6426040306923535246L);
        Integer term4259578 = new Integer(-9921028);
        Integer term4259580 = new Integer(159933777);
        Integer term4259582 = new Integer(-2049503346);
        Integer term4259584 = new Integer(178356944);
        ArrayList term4259576 = new ArrayList();
        ((ArrayList) term4259576).add(term4259578);
        ((ArrayList) term4259576).add(term4259580);
        ((ArrayList) term4259576).add(term4259582);
        ((ArrayList) term4259576).add(term4259584);
        Integer term4259590 = new Integer(1296233741);
        Integer term4259592 = new Integer(-1453122829);
        Integer term4259594 = new Integer(1723930455);
        Integer term4259596 = new Integer(-172568972);
        Integer term4259598 = new Integer(952493182);
        Integer term4259600 = new Integer(-1820882307);
        ArrayList term4259588 = new ArrayList();
        ((ArrayList) term4259588).add(term4259590);
        ((ArrayList) term4259588).add(term4259592);
        ((ArrayList) term4259588).add(term4259594);
        ((ArrayList) term4259588).add(term4259596);
        ((ArrayList) term4259588).add(term4259598);
        ((ArrayList) term4259588).add(term4259600);
        term4259511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4259513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4259529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4259530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4259534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4259539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4259540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4259544 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4259511, term4259511.getClass(), "id", 791261755519914486L);
        setLongField(term4259513, term4259513.getClass(), "id", 2514659599708213598L);
        setField(term4259513, term4259513.getClass(), "extId", term4259515);
        setField(term4259513, term4259513.getClass(), "luid", "bTIKVUdYMv");
        setIntField(term4259530, term4259530.getClass(), "year", 2019);
        setShortField(term4259530, term4259530.getClass(), "month", (short) 5);
        setShortField(term4259530, term4259530.getClass(), "day", (short) 31);
        setField(term4259529, term4259529.getClass(), "date", term4259530);
        setByteField(term4259534, term4259534.getClass(), "hour", (byte) 13);
        setByteField(term4259534, term4259534.getClass(), "minute", (byte) 8);
        setByteField(term4259534, term4259534.getClass(), "second", (byte) 49);
        setIntField(term4259534, term4259534.getClass(), "nano", 648983684);
        setField(term4259529, term4259529.getClass(), "time", term4259534);
        setField(term4259513, term4259513.getClass(), "registerTime", term4259529);
        setIntField(term4259540, term4259540.getClass(), "year", 2019);
        setShortField(term4259540, term4259540.getClass(), "month", (short) 5);
        setShortField(term4259540, term4259540.getClass(), "day", (short) 16);
        setField(term4259539, term4259539.getClass(), "date", term4259540);
        setByteField(term4259544, term4259544.getClass(), "hour", (byte) 8);
        setByteField(term4259544, term4259544.getClass(), "minute", (byte) 18);
        setByteField(term4259544, term4259544.getClass(), "second", (byte) 36);
        setIntField(term4259544, term4259544.getClass(), "nano", 914987901);
        setField(term4259539, term4259539.getClass(), "time", term4259544);
        setField(term4259513, term4259513.getClass(), "accessTime", term4259539);
        setField(term4259511, term4259511.getClass(), "card", term4259513);
        setField(term4259511, term4259511.getClass(), "userName", "VPxYVLZttl");
        setIntField(term4259511, term4259511.getClass(), "isNetMember", -586160665);
        setIntField(term4259511, term4259511.getClass(), "iconId", 1671148489);
        setIntField(term4259511, term4259511.getClass(), "plateId", 1029291353);
        setIntField(term4259511, term4259511.getClass(), "titleId", -1662279347);
        setIntField(term4259511, term4259511.getClass(), "partnerId", -719263710);
        setIntField(term4259511, term4259511.getClass(), "frameId", -1336229117);
        setIntField(term4259511, term4259511.getClass(), "selectMapId", -38106218);
        setIntField(term4259511, term4259511.getClass(), "totalAwake", -850484686);
        setIntField(term4259511, term4259511.getClass(), "gradeRating", 1255998758);
        setIntField(term4259511, term4259511.getClass(), "musicRating", 1106784140);
        setIntField(term4259511, term4259511.getClass(), "playerRating", -543741413);
        setIntField(term4259511, term4259511.getClass(), "highestRating", 1215405688);
        setIntField(term4259511, term4259511.getClass(), "gradeRank", -1069344688);
        setIntField(term4259511, term4259511.getClass(), "classRank", -1347820746);
        setIntField(term4259511, term4259511.getClass(), "courseRank", -1204766190);
        setField(term4259511, term4259511.getClass(), "charaSlot", term4259576);
        setField(term4259511, term4259511.getClass(), "charaLockSlot", term4259588);
        setLongField(term4259511, term4259511.getClass(), "contentBit", -7929301865577555161L);
        setIntField(term4259511, term4259511.getClass(), "playCount", -1620763493);
        setField(term4259511, term4259511.getClass(), "eventWatchedDate", "qxjCQKjvCF");
        setField(term4259511, term4259511.getClass(), "lastGameId", "IhhhvIkKeQ");
        setField(term4259511, term4259511.getClass(), "lastRomVersion", "osbjndEGUT");
        setField(term4259511, term4259511.getClass(), "lastDataVersion", "RsnvxRsSYV");
        setField(term4259511, term4259511.getClass(), "lastLoginDate", "hOlHdykZLM");
        setField(term4259511, term4259511.getClass(), "lastPlayDate", "xCcsRPCaxh");
        setIntField(term4259511, term4259511.getClass(), "lastPlayCredit", 2055789765);
        setIntField(term4259511, term4259511.getClass(), "lastPlayMode", -1822079413);
        setIntField(term4259511, term4259511.getClass(), "lastPlaceId", 771741964);
        setField(term4259511, term4259511.getClass(), "lastPlaceName", "nddMCeNQhI");
        setIntField(term4259511, term4259511.getClass(), "lastAllNetId", -900899191);
        setIntField(term4259511, term4259511.getClass(), "lastRegionId", -113632129);
        setField(term4259511, term4259511.getClass(), "lastRegionName", "gwaJaHEuAM");
        setField(term4259511, term4259511.getClass(), "lastClientId", "jiMfcdWrDE");
        setField(term4259511, term4259511.getClass(), "lastCountryCode", "obWgBbAHYY");
        setIntField(term4259511, term4259511.getClass(), "lastSelectEMoney", 81937177);
        setIntField(term4259511, term4259511.getClass(), "lastSelectTicket", -2083145676);
        setIntField(term4259511, term4259511.getClass(), "lastSelectCourse", -599655731);
        setIntField(term4259511, term4259511.getClass(), "lastCountCourse", -718062424);
        setField(term4259511, term4259511.getClass(), "firstGameId", "HsMUsvYBci");
        setField(term4259511, term4259511.getClass(), "firstRomVersion", "eufHobWFvl");
        setField(term4259511, term4259511.getClass(), "firstDataVersion", "GjcdNAaLES");
        setField(term4259511, term4259511.getClass(), "firstPlayDate", "npiiCShUJl");
        setField(term4259511, term4259511.getClass(), "compatibleCmVersion", "vIaNMUiefW");
        setField(term4259511, term4259511.getClass(), "dailyBonusDate", "LXPKrzxFrI");
        setField(term4259511, term4259511.getClass(), "dailyCourseBonusDate", "HmwfXCRlKP");
        setField(term4259511, term4259511.getClass(), "lastPairLoginDate", "qGYxVjKgkn");
        setField(term4259511, term4259511.getClass(), "lastTrialPlayDate", "wDPcdOjdkU");
        setIntField(term4259511, term4259511.getClass(), "playVsCount", -640909904);
        setIntField(term4259511, term4259511.getClass(), "playSyncCount", -2036665657);
        setIntField(term4259511, term4259511.getClass(), "winCount", -47488017);
        setIntField(term4259511, term4259511.getClass(), "helpCount", -1278756053);
        setIntField(term4259511, term4259511.getClass(), "comboCount", -563493911);
        setLongField(term4259511, term4259511.getClass(), "totalDeluxscore", 2872648063499059646L);
        setLongField(term4259511, term4259511.getClass(), "totalBasicDeluxscore", -2742918067103265010L);
        setLongField(term4259511, term4259511.getClass(), "totalAdvancedDeluxscore", 487155276633829746L);
        setLongField(term4259511, term4259511.getClass(), "totalExpertDeluxscore", 7092222212881275659L);
        setLongField(term4259511, term4259511.getClass(), "totalMasterDeluxscore", 7006381713345275953L);
        setLongField(term4259511, term4259511.getClass(), "totalReMasterDeluxscore", 178240096046945750L);
        setIntField(term4259511, term4259511.getClass(), "totalSync", -259991613);
        setIntField(term4259511, term4259511.getClass(), "totalBasicSync", -135855591);
        setIntField(term4259511, term4259511.getClass(), "totalAdvancedSync", 375026054);
        setIntField(term4259511, term4259511.getClass(), "totalExpertSync", 2028534187);
        setIntField(term4259511, term4259511.getClass(), "totalMasterSync", -1601103138);
        setIntField(term4259511, term4259511.getClass(), "totalReMasterSync", -1268727043);
        setLongField(term4259511, term4259511.getClass(), "totalAchievement", 431499284355710730L);
        setLongField(term4259511, term4259511.getClass(), "totalBasicAchievement", -2817821805400141558L);
        setLongField(term4259511, term4259511.getClass(), "totalAdvancedAchievement", -2877601897362753660L);
        setLongField(term4259511, term4259511.getClass(), "totalExpertAchievement", 8807939777044627175L);
        setLongField(term4259511, term4259511.getClass(), "totalMasterAchievement", 4661583936812933382L);
        setLongField(term4259511, term4259511.getClass(), "totalReMasterAchievement", 7804028480920301651L);
        setLongField(term4259511, term4259511.getClass(), "playerOldRating", -8321980331562766215L);
        setLongField(term4259511, term4259511.getClass(), "playerNewRating", 968129198901292834L);
        setIntField(term4259511, term4259511.getClass(), "banState", -1397313307);
        setLongField(term4259511, term4259511.getClass(), "dateTime", -3861421470833398229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpCount", argTypes, term4259511, args);
    }

};


