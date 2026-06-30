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
import java.lang.Boolean;

public class UserLoginBonus_setComplete_35075013212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51399;
     Object term51758;

    public UserLoginBonus_setComplete_35075013212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51405 = new Long(5510783420697225605L);
        Integer term51468 = new Integer(-222012928);
        Integer term51470 = new Integer(-146564963);
        Integer term51472 = new Integer(-83178716);
        Integer term51474 = new Integer(-1292704466);
        Integer term51476 = new Integer(1991858584);
        ArrayList term51466 = new ArrayList();
        ((ArrayList) term51466).add(term51468);
        ((ArrayList) term51466).add(term51470);
        ((ArrayList) term51466).add(term51472);
        ((ArrayList) term51466).add(term51474);
        ((ArrayList) term51466).add(term51476);
        Integer term51482 = new Integer(-1300947782);
        Integer term51484 = new Integer(188512644);
        ArrayList term51480 = new ArrayList();
        ((ArrayList) term51480).add(term51482);
        ((ArrayList) term51480).add(term51484);
        term51399 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term51401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term51403 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51424 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51434 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51399, term51399.getClass(), "id", 508795580601675574L);
        setLongField(term51401, term51401.getClass(), "id", 3872000207938391416L);
        setLongField(term51403, term51403.getClass(), "id", -1383665096049300821L);
        setField(term51403, term51403.getClass(), "extId", term51405);
        setField(term51403, term51403.getClass(), "luid", "XlNXxsYNss");
        setIntField(term51420, term51420.getClass(), "year", 2027);
        setShortField(term51420, term51420.getClass(), "month", (short) 5);
        setShortField(term51420, term51420.getClass(), "day", (short) 2);
        setField(term51419, term51419.getClass(), "date", term51420);
        setByteField(term51424, term51424.getClass(), "hour", (byte) 6);
        setByteField(term51424, term51424.getClass(), "minute", (byte) 10);
        setByteField(term51424, term51424.getClass(), "second", (byte) 19);
        setIntField(term51424, term51424.getClass(), "nano", 422884120);
        setField(term51419, term51419.getClass(), "time", term51424);
        setField(term51403, term51403.getClass(), "registerTime", term51419);
        setIntField(term51430, term51430.getClass(), "year", 2029);
        setShortField(term51430, term51430.getClass(), "month", (short) 10);
        setShortField(term51430, term51430.getClass(), "day", (short) 19);
        setField(term51429, term51429.getClass(), "date", term51430);
        setByteField(term51434, term51434.getClass(), "hour", (byte) 15);
        setByteField(term51434, term51434.getClass(), "minute", (byte) 8);
        setByteField(term51434, term51434.getClass(), "second", (byte) 15);
        setIntField(term51434, term51434.getClass(), "nano", 25396748);
        setField(term51429, term51429.getClass(), "time", term51434);
        setField(term51403, term51403.getClass(), "accessTime", term51429);
        setField(term51401, term51401.getClass(), "card", term51403);
        setField(term51401, term51401.getClass(), "userName", "jheRZWjuaB");
        setIntField(term51401, term51401.getClass(), "isNetMember", 331010013);
        setIntField(term51401, term51401.getClass(), "iconId", 275287586);
        setIntField(term51401, term51401.getClass(), "plateId", 628507821);
        setIntField(term51401, term51401.getClass(), "titleId", 247792610);
        setIntField(term51401, term51401.getClass(), "partnerId", -2059652097);
        setIntField(term51401, term51401.getClass(), "frameId", 75564248);
        setIntField(term51401, term51401.getClass(), "selectMapId", -829801689);
        setIntField(term51401, term51401.getClass(), "totalAwake", 265481386);
        setIntField(term51401, term51401.getClass(), "gradeRating", -893720551);
        setIntField(term51401, term51401.getClass(), "musicRating", 696829611);
        setIntField(term51401, term51401.getClass(), "playerRating", 1751983051);
        setIntField(term51401, term51401.getClass(), "highestRating", -1416766445);
        setIntField(term51401, term51401.getClass(), "gradeRank", -203238563);
        setIntField(term51401, term51401.getClass(), "classRank", -132358473);
        setIntField(term51401, term51401.getClass(), "courseRank", 130567867);
        setField(term51401, term51401.getClass(), "charaSlot", term51466);
        setField(term51401, term51401.getClass(), "charaLockSlot", term51480);
        setLongField(term51401, term51401.getClass(), "contentBit", 3462550822198292676L);
        setIntField(term51401, term51401.getClass(), "playCount", 33782620);
        setField(term51401, term51401.getClass(), "eventWatchedDate", "IERziToRSQ");
        setField(term51401, term51401.getClass(), "lastGameId", "mDTRMwjBpc");
        setField(term51401, term51401.getClass(), "lastRomVersion", "sCLAuKoiVL");
        setField(term51401, term51401.getClass(), "lastDataVersion", "pFWiDEnVnU");
        setField(term51401, term51401.getClass(), "lastLoginDate", "NeEetzFhTt");
        setField(term51401, term51401.getClass(), "lastPlayDate", "UgvuvUxKed");
        setIntField(term51401, term51401.getClass(), "lastPlayCredit", -818766632);
        setIntField(term51401, term51401.getClass(), "lastPlayMode", 45627161);
        setIntField(term51401, term51401.getClass(), "lastPlaceId", -206817101);
        setField(term51401, term51401.getClass(), "lastPlaceName", "ljBBMsQpaM");
        setIntField(term51401, term51401.getClass(), "lastAllNetId", 1541533024);
        setIntField(term51401, term51401.getClass(), "lastRegionId", -1032828989);
        setField(term51401, term51401.getClass(), "lastRegionName", "hHNIOlOzJc");
        setField(term51401, term51401.getClass(), "lastClientId", "ALRSeULyWV");
        setField(term51401, term51401.getClass(), "lastCountryCode", "WVhzXHdyFF");
        setIntField(term51401, term51401.getClass(), "lastSelectEMoney", -649944911);
        setIntField(term51401, term51401.getClass(), "lastSelectTicket", -1426067073);
        setIntField(term51401, term51401.getClass(), "lastSelectCourse", -1679645192);
        setIntField(term51401, term51401.getClass(), "lastCountCourse", 1524285721);
        setField(term51401, term51401.getClass(), "firstGameId", "GLAWYoxkyw");
        setField(term51401, term51401.getClass(), "firstRomVersion", "cfpPTNNVnW");
        setField(term51401, term51401.getClass(), "firstDataVersion", "VPkEFShMUB");
        setField(term51401, term51401.getClass(), "firstPlayDate", "ZIgHysIFcL");
        setField(term51401, term51401.getClass(), "compatibleCmVersion", "ofSfQtWBjp");
        setField(term51401, term51401.getClass(), "dailyBonusDate", "vkbIpZOlcY");
        setField(term51401, term51401.getClass(), "dailyCourseBonusDate", "XbAeosZekH");
        setField(term51401, term51401.getClass(), "lastPairLoginDate", "EvGPvjswTz");
        setField(term51401, term51401.getClass(), "lastTrialPlayDate", "lbnnCkEZgE");
        setIntField(term51401, term51401.getClass(), "playVsCount", -808971480);
        setIntField(term51401, term51401.getClass(), "playSyncCount", 534508972);
        setIntField(term51401, term51401.getClass(), "winCount", -301935716);
        setIntField(term51401, term51401.getClass(), "helpCount", 1701720681);
        setIntField(term51401, term51401.getClass(), "comboCount", -378738380);
        setLongField(term51401, term51401.getClass(), "totalDeluxscore", 4366106993552057355L);
        setLongField(term51401, term51401.getClass(), "totalBasicDeluxscore", -1403100578084357233L);
        setLongField(term51401, term51401.getClass(), "totalAdvancedDeluxscore", -5878958370799790472L);
        setLongField(term51401, term51401.getClass(), "totalExpertDeluxscore", 1801020535033823321L);
        setLongField(term51401, term51401.getClass(), "totalMasterDeluxscore", 7022012163884672746L);
        setLongField(term51401, term51401.getClass(), "totalReMasterDeluxscore", -5668489101686002218L);
        setIntField(term51401, term51401.getClass(), "totalSync", 1984720770);
        setIntField(term51401, term51401.getClass(), "totalBasicSync", -8765616);
        setIntField(term51401, term51401.getClass(), "totalAdvancedSync", -1365627412);
        setIntField(term51401, term51401.getClass(), "totalExpertSync", 520625434);
        setIntField(term51401, term51401.getClass(), "totalMasterSync", 1531056945);
        setIntField(term51401, term51401.getClass(), "totalReMasterSync", -2128361795);
        setLongField(term51401, term51401.getClass(), "totalAchievement", 8713229483070783866L);
        setLongField(term51401, term51401.getClass(), "totalBasicAchievement", 7598786125321910224L);
        setLongField(term51401, term51401.getClass(), "totalAdvancedAchievement", 2008211696778135261L);
        setLongField(term51401, term51401.getClass(), "totalExpertAchievement", 915665059113544268L);
        setLongField(term51401, term51401.getClass(), "totalMasterAchievement", -3380318205328241107L);
        setLongField(term51401, term51401.getClass(), "totalReMasterAchievement", -3551818295265883412L);
        setLongField(term51401, term51401.getClass(), "playerOldRating", -8031780876521881873L);
        setLongField(term51401, term51401.getClass(), "playerNewRating", -8015150842907349869L);
        setIntField(term51401, term51401.getClass(), "banState", 925239258);
        setLongField(term51401, term51401.getClass(), "dateTime", 9132190239280924497L);
        setField(term51399, term51399.getClass(), "user", term51401);
        setIntField(term51399, term51399.getClass(), "bonusId", 1041156468);
        setIntField(term51399, term51399.getClass(), "point", 825756233);
        setBooleanField(term51399, term51399.getClass(), "isCurrent", true);
        setBooleanField(term51399, term51399.getClass(), "isComplete", false);
        term51758 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51758;
        callMethod(klass, "setComplete", argTypes, term51399, args);
    }

};


