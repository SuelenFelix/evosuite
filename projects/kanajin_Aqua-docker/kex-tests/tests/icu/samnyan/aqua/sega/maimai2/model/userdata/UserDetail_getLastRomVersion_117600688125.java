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

public class UserDetail_getLastRomVersion_117600688125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209213;

    public UserDetail_getLastRomVersion_117600688125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209217 = new Long(-1571034605670661708L);
        Integer term209280 = new Integer(-1648760670);
        Integer term209282 = new Integer(590703291);
        ArrayList term209278 = new ArrayList();
        ((ArrayList) term209278).add(term209280);
        ((ArrayList) term209278).add(term209282);
        Integer term209288 = new Integer(-2033199492);
        Integer term209290 = new Integer(350096397);
        Integer term209292 = new Integer(-325295536);
        Integer term209294 = new Integer(-411068820);
        Integer term209296 = new Integer(-608484309);
        Integer term209298 = new Integer(-396456847);
        Integer term209300 = new Integer(1826615515);
        Integer term209302 = new Integer(1129458600);
        ArrayList term209286 = new ArrayList();
        ((ArrayList) term209286).add(term209288);
        ((ArrayList) term209286).add(term209290);
        ((ArrayList) term209286).add(term209292);
        ((ArrayList) term209286).add(term209294);
        ((ArrayList) term209286).add(term209296);
        ((ArrayList) term209286).add(term209298);
        ((ArrayList) term209286).add(term209300);
        ((ArrayList) term209286).add(term209302);
        term209213 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term209215 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209246 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209213, term209213.getClass(), "id", -5011107037416422675L);
        setLongField(term209215, term209215.getClass(), "id", -8958846949993717340L);
        setField(term209215, term209215.getClass(), "extId", term209217);
        setField(term209215, term209215.getClass(), "luid", "nSQlbmzzLW");
        setIntField(term209232, term209232.getClass(), "year", 2015);
        setShortField(term209232, term209232.getClass(), "month", (short) 3);
        setShortField(term209232, term209232.getClass(), "day", (short) 31);
        setField(term209231, term209231.getClass(), "date", term209232);
        setByteField(term209236, term209236.getClass(), "hour", (byte) 9);
        setByteField(term209236, term209236.getClass(), "minute", (byte) 42);
        setByteField(term209236, term209236.getClass(), "second", (byte) 3);
        setIntField(term209236, term209236.getClass(), "nano", 508678403);
        setField(term209231, term209231.getClass(), "time", term209236);
        setField(term209215, term209215.getClass(), "registerTime", term209231);
        setIntField(term209242, term209242.getClass(), "year", 2020);
        setShortField(term209242, term209242.getClass(), "month", (short) 9);
        setShortField(term209242, term209242.getClass(), "day", (short) 13);
        setField(term209241, term209241.getClass(), "date", term209242);
        setByteField(term209246, term209246.getClass(), "hour", (byte) 0);
        setByteField(term209246, term209246.getClass(), "minute", (byte) 7);
        setByteField(term209246, term209246.getClass(), "second", (byte) 27);
        setIntField(term209246, term209246.getClass(), "nano", 835567947);
        setField(term209241, term209241.getClass(), "time", term209246);
        setField(term209215, term209215.getClass(), "accessTime", term209241);
        setField(term209213, term209213.getClass(), "card", term209215);
        setField(term209213, term209213.getClass(), "userName", "NzCUIjYlSt");
        setIntField(term209213, term209213.getClass(), "isNetMember", 2053260189);
        setIntField(term209213, term209213.getClass(), "iconId", -2053852874);
        setIntField(term209213, term209213.getClass(), "plateId", -495359675);
        setIntField(term209213, term209213.getClass(), "titleId", -384263579);
        setIntField(term209213, term209213.getClass(), "partnerId", 846361208);
        setIntField(term209213, term209213.getClass(), "frameId", 1800799519);
        setIntField(term209213, term209213.getClass(), "selectMapId", 100734387);
        setIntField(term209213, term209213.getClass(), "totalAwake", 654779093);
        setIntField(term209213, term209213.getClass(), "gradeRating", -2111377072);
        setIntField(term209213, term209213.getClass(), "musicRating", -983510285);
        setIntField(term209213, term209213.getClass(), "playerRating", 515505845);
        setIntField(term209213, term209213.getClass(), "highestRating", 2062061908);
        setIntField(term209213, term209213.getClass(), "gradeRank", 52784804);
        setIntField(term209213, term209213.getClass(), "classRank", -1368391368);
        setIntField(term209213, term209213.getClass(), "courseRank", 1369129310);
        setField(term209213, term209213.getClass(), "charaSlot", term209278);
        setField(term209213, term209213.getClass(), "charaLockSlot", term209286);
        setLongField(term209213, term209213.getClass(), "contentBit", 8754835613868455656L);
        setIntField(term209213, term209213.getClass(), "playCount", -780519895);
        setField(term209213, term209213.getClass(), "eventWatchedDate", "lFUtoXWQuy");
        setField(term209213, term209213.getClass(), "lastGameId", "cqUSTqSiGn");
        setField(term209213, term209213.getClass(), "lastRomVersion", "uMUfxkPQVb");
        setField(term209213, term209213.getClass(), "lastDataVersion", "antCkERyql");
        setField(term209213, term209213.getClass(), "lastLoginDate", "RLzWpKyOcm");
        setField(term209213, term209213.getClass(), "lastPlayDate", "AiDeJiJcDC");
        setIntField(term209213, term209213.getClass(), "lastPlayCredit", 137957762);
        setIntField(term209213, term209213.getClass(), "lastPlayMode", -1051997267);
        setIntField(term209213, term209213.getClass(), "lastPlaceId", -62396728);
        setField(term209213, term209213.getClass(), "lastPlaceName", "ACFOBqKUKd");
        setIntField(term209213, term209213.getClass(), "lastAllNetId", -268599867);
        setIntField(term209213, term209213.getClass(), "lastRegionId", -1052701176);
        setField(term209213, term209213.getClass(), "lastRegionName", "BIrUkKfKmF");
        setField(term209213, term209213.getClass(), "lastClientId", "kKWwlRUdxO");
        setField(term209213, term209213.getClass(), "lastCountryCode", "mPmWMlHjdS");
        setIntField(term209213, term209213.getClass(), "lastSelectEMoney", 545101691);
        setIntField(term209213, term209213.getClass(), "lastSelectTicket", 1161229876);
        setIntField(term209213, term209213.getClass(), "lastSelectCourse", -960232938);
        setIntField(term209213, term209213.getClass(), "lastCountCourse", 164986407);
        setField(term209213, term209213.getClass(), "firstGameId", "vVMAKTsnWp");
        setField(term209213, term209213.getClass(), "firstRomVersion", "gHkufiBxQY");
        setField(term209213, term209213.getClass(), "firstDataVersion", "FpnOTthGSf");
        setField(term209213, term209213.getClass(), "firstPlayDate", "ZlDJfKbWuT");
        setField(term209213, term209213.getClass(), "compatibleCmVersion", "KPKvkukffl");
        setField(term209213, term209213.getClass(), "dailyBonusDate", "DztkzYmExj");
        setField(term209213, term209213.getClass(), "dailyCourseBonusDate", "jgLlnOSDbQ");
        setField(term209213, term209213.getClass(), "lastPairLoginDate", "KJGZNumCAL");
        setField(term209213, term209213.getClass(), "lastTrialPlayDate", "iBvRhpQbES");
        setIntField(term209213, term209213.getClass(), "playVsCount", 1508923050);
        setIntField(term209213, term209213.getClass(), "playSyncCount", 1732773238);
        setIntField(term209213, term209213.getClass(), "winCount", -312812260);
        setIntField(term209213, term209213.getClass(), "helpCount", -1403354454);
        setIntField(term209213, term209213.getClass(), "comboCount", 225390294);
        setLongField(term209213, term209213.getClass(), "totalDeluxscore", -5172868456632523478L);
        setLongField(term209213, term209213.getClass(), "totalBasicDeluxscore", -4738020182896727772L);
        setLongField(term209213, term209213.getClass(), "totalAdvancedDeluxscore", -3991476732027265263L);
        setLongField(term209213, term209213.getClass(), "totalExpertDeluxscore", -8337971790150085955L);
        setLongField(term209213, term209213.getClass(), "totalMasterDeluxscore", 8803656305740741780L);
        setLongField(term209213, term209213.getClass(), "totalReMasterDeluxscore", 6508795630556315171L);
        setIntField(term209213, term209213.getClass(), "totalSync", 627436431);
        setIntField(term209213, term209213.getClass(), "totalBasicSync", -226488133);
        setIntField(term209213, term209213.getClass(), "totalAdvancedSync", 2016800886);
        setIntField(term209213, term209213.getClass(), "totalExpertSync", 1306220321);
        setIntField(term209213, term209213.getClass(), "totalMasterSync", -925927013);
        setIntField(term209213, term209213.getClass(), "totalReMasterSync", 560338899);
        setLongField(term209213, term209213.getClass(), "totalAchievement", -2254422363064059234L);
        setLongField(term209213, term209213.getClass(), "totalBasicAchievement", -6360645794639848346L);
        setLongField(term209213, term209213.getClass(), "totalAdvancedAchievement", -409755716386126160L);
        setLongField(term209213, term209213.getClass(), "totalExpertAchievement", -2762250715796493645L);
        setLongField(term209213, term209213.getClass(), "totalMasterAchievement", 9187657468194834951L);
        setLongField(term209213, term209213.getClass(), "totalReMasterAchievement", 1002083751724182558L);
        setLongField(term209213, term209213.getClass(), "playerOldRating", -9203915944121138435L);
        setLongField(term209213, term209213.getClass(), "playerNewRating", 7415866669809957793L);
        setIntField(term209213, term209213.getClass(), "banState", 173805075);
        setLongField(term209213, term209213.getClass(), "dateTime", -6971932757611425617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term209213, args);
    }

};


