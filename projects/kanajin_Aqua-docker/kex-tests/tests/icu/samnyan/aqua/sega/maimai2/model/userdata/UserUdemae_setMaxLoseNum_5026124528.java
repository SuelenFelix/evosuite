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

public class UserUdemae_setMaxLoseNum_5026124528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111312;
     Object term111693;

    public UserUdemae_setMaxLoseNum_5026124528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111318 = new Long(5465527210299101732L);
        Integer term111381 = new Integer(30837706);
        Integer term111383 = new Integer(379523101);
        Integer term111385 = new Integer(1017354215);
        Integer term111387 = new Integer(695330987);
        Integer term111389 = new Integer(-267289967);
        ArrayList term111379 = new ArrayList();
        ((ArrayList) term111379).add(term111381);
        ((ArrayList) term111379).add(term111383);
        ((ArrayList) term111379).add(term111385);
        ((ArrayList) term111379).add(term111387);
        ((ArrayList) term111379).add(term111389);
        Integer term111395 = new Integer(773432822);
        Integer term111397 = new Integer(-488294922);
        Integer term111399 = new Integer(-397161164);
        Integer term111401 = new Integer(-703717191);
        Integer term111403 = new Integer(-1255535445);
        Integer term111405 = new Integer(-2033952124);
        Integer term111407 = new Integer(560401653);
        ArrayList term111393 = new ArrayList();
        ((ArrayList) term111393).add(term111395);
        ((ArrayList) term111393).add(term111397);
        ((ArrayList) term111393).add(term111399);
        ((ArrayList) term111393).add(term111401);
        ((ArrayList) term111393).add(term111403);
        ((ArrayList) term111393).add(term111405);
        ((ArrayList) term111393).add(term111407);
        term111312 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term111314 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term111316 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111347 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111312, term111312.getClass(), "id", 5979804142582983080L);
        setLongField(term111314, term111314.getClass(), "id", 411230505626862378L);
        setLongField(term111316, term111316.getClass(), "id", 7322238963049087952L);
        setField(term111316, term111316.getClass(), "extId", term111318);
        setField(term111316, term111316.getClass(), "luid", "mezvZVqRCp");
        setIntField(term111333, term111333.getClass(), "year", 2017);
        setShortField(term111333, term111333.getClass(), "month", (short) 11);
        setShortField(term111333, term111333.getClass(), "day", (short) 19);
        setField(term111332, term111332.getClass(), "date", term111333);
        setByteField(term111337, term111337.getClass(), "hour", (byte) 2);
        setByteField(term111337, term111337.getClass(), "minute", (byte) 52);
        setByteField(term111337, term111337.getClass(), "second", (byte) 15);
        setIntField(term111337, term111337.getClass(), "nano", 625778933);
        setField(term111332, term111332.getClass(), "time", term111337);
        setField(term111316, term111316.getClass(), "registerTime", term111332);
        setIntField(term111343, term111343.getClass(), "year", 2015);
        setShortField(term111343, term111343.getClass(), "month", (short) 10);
        setShortField(term111343, term111343.getClass(), "day", (short) 3);
        setField(term111342, term111342.getClass(), "date", term111343);
        setByteField(term111347, term111347.getClass(), "hour", (byte) 10);
        setByteField(term111347, term111347.getClass(), "minute", (byte) 45);
        setByteField(term111347, term111347.getClass(), "second", (byte) 18);
        setIntField(term111347, term111347.getClass(), "nano", 333457081);
        setField(term111342, term111342.getClass(), "time", term111347);
        setField(term111316, term111316.getClass(), "accessTime", term111342);
        setField(term111314, term111314.getClass(), "card", term111316);
        setField(term111314, term111314.getClass(), "userName", "bZOShgQvtT");
        setIntField(term111314, term111314.getClass(), "isNetMember", 1558553325);
        setIntField(term111314, term111314.getClass(), "iconId", -401500792);
        setIntField(term111314, term111314.getClass(), "plateId", -1497822933);
        setIntField(term111314, term111314.getClass(), "titleId", 1402422395);
        setIntField(term111314, term111314.getClass(), "partnerId", -1842694062);
        setIntField(term111314, term111314.getClass(), "frameId", 1926671230);
        setIntField(term111314, term111314.getClass(), "selectMapId", 591515356);
        setIntField(term111314, term111314.getClass(), "totalAwake", -496031198);
        setIntField(term111314, term111314.getClass(), "gradeRating", -2031306487);
        setIntField(term111314, term111314.getClass(), "musicRating", -266787195);
        setIntField(term111314, term111314.getClass(), "playerRating", 1967526359);
        setIntField(term111314, term111314.getClass(), "highestRating", -405827477);
        setIntField(term111314, term111314.getClass(), "gradeRank", -418743608);
        setIntField(term111314, term111314.getClass(), "classRank", 217176849);
        setIntField(term111314, term111314.getClass(), "courseRank", 665322254);
        setField(term111314, term111314.getClass(), "charaSlot", term111379);
        setField(term111314, term111314.getClass(), "charaLockSlot", term111393);
        setLongField(term111314, term111314.getClass(), "contentBit", 7041318987404374954L);
        setIntField(term111314, term111314.getClass(), "playCount", -950956143);
        setField(term111314, term111314.getClass(), "eventWatchedDate", "SrodJwobhd");
        setField(term111314, term111314.getClass(), "lastGameId", "aEKxCMZaAl");
        setField(term111314, term111314.getClass(), "lastRomVersion", "uVksDvNeyo");
        setField(term111314, term111314.getClass(), "lastDataVersion", "KThgZcLeyJ");
        setField(term111314, term111314.getClass(), "lastLoginDate", "qTgeYJrPfV");
        setField(term111314, term111314.getClass(), "lastPlayDate", "aMXuzqauuw");
        setIntField(term111314, term111314.getClass(), "lastPlayCredit", 146996690);
        setIntField(term111314, term111314.getClass(), "lastPlayMode", 490172433);
        setIntField(term111314, term111314.getClass(), "lastPlaceId", 387768499);
        setField(term111314, term111314.getClass(), "lastPlaceName", "OsLyHIAMvZ");
        setIntField(term111314, term111314.getClass(), "lastAllNetId", 1727693843);
        setIntField(term111314, term111314.getClass(), "lastRegionId", -371048786);
        setField(term111314, term111314.getClass(), "lastRegionName", "fANlppmeZc");
        setField(term111314, term111314.getClass(), "lastClientId", "vwXdXCgQIr");
        setField(term111314, term111314.getClass(), "lastCountryCode", "nSnrziJcBE");
        setIntField(term111314, term111314.getClass(), "lastSelectEMoney", -1779736424);
        setIntField(term111314, term111314.getClass(), "lastSelectTicket", 1027604749);
        setIntField(term111314, term111314.getClass(), "lastSelectCourse", -1786633473);
        setIntField(term111314, term111314.getClass(), "lastCountCourse", 1484582681);
        setField(term111314, term111314.getClass(), "firstGameId", "xbhJrXUuCP");
        setField(term111314, term111314.getClass(), "firstRomVersion", "bvjVBhkXQU");
        setField(term111314, term111314.getClass(), "firstDataVersion", "IrOvUMupuD");
        setField(term111314, term111314.getClass(), "firstPlayDate", "UgFQTaylqs");
        setField(term111314, term111314.getClass(), "compatibleCmVersion", "CZksebZXsC");
        setField(term111314, term111314.getClass(), "dailyBonusDate", "NDTlULiAEp");
        setField(term111314, term111314.getClass(), "dailyCourseBonusDate", "KakVHGlMtc");
        setField(term111314, term111314.getClass(), "lastPairLoginDate", "XQkRBflDak");
        setField(term111314, term111314.getClass(), "lastTrialPlayDate", "UXtNgOITuj");
        setIntField(term111314, term111314.getClass(), "playVsCount", 641921984);
        setIntField(term111314, term111314.getClass(), "playSyncCount", -1505020273);
        setIntField(term111314, term111314.getClass(), "winCount", -298905997);
        setIntField(term111314, term111314.getClass(), "helpCount", -2030417348);
        setIntField(term111314, term111314.getClass(), "comboCount", 1282232010);
        setLongField(term111314, term111314.getClass(), "totalDeluxscore", -2429166277021159153L);
        setLongField(term111314, term111314.getClass(), "totalBasicDeluxscore", -1488574802388008699L);
        setLongField(term111314, term111314.getClass(), "totalAdvancedDeluxscore", -2210548996625197569L);
        setLongField(term111314, term111314.getClass(), "totalExpertDeluxscore", 3355897565139344162L);
        setLongField(term111314, term111314.getClass(), "totalMasterDeluxscore", 1710057988242023022L);
        setLongField(term111314, term111314.getClass(), "totalReMasterDeluxscore", 8050970842743258746L);
        setIntField(term111314, term111314.getClass(), "totalSync", -1360469722);
        setIntField(term111314, term111314.getClass(), "totalBasicSync", -1203130784);
        setIntField(term111314, term111314.getClass(), "totalAdvancedSync", 728397857);
        setIntField(term111314, term111314.getClass(), "totalExpertSync", -1851390582);
        setIntField(term111314, term111314.getClass(), "totalMasterSync", 436551890);
        setIntField(term111314, term111314.getClass(), "totalReMasterSync", -1176677999);
        setLongField(term111314, term111314.getClass(), "totalAchievement", 4371439569332200617L);
        setLongField(term111314, term111314.getClass(), "totalBasicAchievement", 6474084420599808766L);
        setLongField(term111314, term111314.getClass(), "totalAdvancedAchievement", -8402003070954353411L);
        setLongField(term111314, term111314.getClass(), "totalExpertAchievement", -5271009603200420552L);
        setLongField(term111314, term111314.getClass(), "totalMasterAchievement", 7281428481290626426L);
        setLongField(term111314, term111314.getClass(), "totalReMasterAchievement", 5565875410088779184L);
        setLongField(term111314, term111314.getClass(), "playerOldRating", -551041417190456838L);
        setLongField(term111314, term111314.getClass(), "playerNewRating", -8928602881850680688L);
        setIntField(term111314, term111314.getClass(), "banState", -1491389341);
        setLongField(term111314, term111314.getClass(), "dateTime", -5639249342644786079L);
        setField(term111312, term111312.getClass(), "user", term111314);
        setIntField(term111312, term111312.getClass(), "rate", -1204433663);
        setIntField(term111312, term111312.getClass(), "maxRate", 784981368);
        setIntField(term111312, term111312.getClass(), "classValue", 1786501867);
        setIntField(term111312, term111312.getClass(), "maxClassValue", 608414757);
        setIntField(term111312, term111312.getClass(), "totalWinNum", -67554229);
        setIntField(term111312, term111312.getClass(), "totalLoseNum", 1715935221);
        setIntField(term111312, term111312.getClass(), "maxWinNum", 1396211446);
        setIntField(term111312, term111312.getClass(), "maxLoseNum", -407124155);
        setIntField(term111312, term111312.getClass(), "winNum", 488605627);
        setIntField(term111312, term111312.getClass(), "loseNum", 469579894);
        setIntField(term111312, term111312.getClass(), "npcTotalWinNum", 1767003547);
        setIntField(term111312, term111312.getClass(), "npcTotalLoseNum", -2092805936);
        setIntField(term111312, term111312.getClass(), "npcMaxWinNum", -1286454716);
        setIntField(term111312, term111312.getClass(), "npcMaxLoseNum", -1514697210);
        setIntField(term111312, term111312.getClass(), "npcWinNum", -1991261137);
        setIntField(term111312, term111312.getClass(), "npcLoseNum", 353940151);
        term111693 = new Integer(1335341338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term111693;
        callMethod(klass, "setMaxLoseNum", argTypes, term111312, args);
    }

};


