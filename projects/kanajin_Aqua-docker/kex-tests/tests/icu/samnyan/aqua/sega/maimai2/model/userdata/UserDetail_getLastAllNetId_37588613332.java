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

public class UserDetail_getLastAllNetId_37588613332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4247672;

    public UserDetail_getLastAllNetId_37588613332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4247676 = new Long(5350491402991286599L);
        Integer term4247739 = new Integer(-167763728);
        ArrayList term4247737 = new ArrayList();
        ((ArrayList) term4247737).add(term4247739);
        Integer term4247745 = new Integer(-413077084);
        Integer term4247747 = new Integer(-2108615302);
        Integer term4247749 = new Integer(708531286);
        Integer term4247751 = new Integer(-1789461612);
        Integer term4247753 = new Integer(461243699);
        ArrayList term4247743 = new ArrayList();
        ((ArrayList) term4247743).add(term4247745);
        ((ArrayList) term4247743).add(term4247747);
        ((ArrayList) term4247743).add(term4247749);
        ((ArrayList) term4247743).add(term4247751);
        ((ArrayList) term4247743).add(term4247753);
        term4247672 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4247674 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4247690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4247691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4247695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4247700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4247701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4247705 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4247672, term4247672.getClass(), "id", 565743498836390907L);
        setLongField(term4247674, term4247674.getClass(), "id", 4869052832137161047L);
        setField(term4247674, term4247674.getClass(), "extId", term4247676);
        setField(term4247674, term4247674.getClass(), "luid", "nBwVXvSjwV");
        setIntField(term4247691, term4247691.getClass(), "year", 2022);
        setShortField(term4247691, term4247691.getClass(), "month", (short) 1);
        setShortField(term4247691, term4247691.getClass(), "day", (short) 6);
        setField(term4247690, term4247690.getClass(), "date", term4247691);
        setByteField(term4247695, term4247695.getClass(), "hour", (byte) 15);
        setByteField(term4247695, term4247695.getClass(), "minute", (byte) 6);
        setByteField(term4247695, term4247695.getClass(), "second", (byte) 5);
        setIntField(term4247695, term4247695.getClass(), "nano", 537951996);
        setField(term4247690, term4247690.getClass(), "time", term4247695);
        setField(term4247674, term4247674.getClass(), "registerTime", term4247690);
        setIntField(term4247701, term4247701.getClass(), "year", 2012);
        setShortField(term4247701, term4247701.getClass(), "month", (short) 5);
        setShortField(term4247701, term4247701.getClass(), "day", (short) 30);
        setField(term4247700, term4247700.getClass(), "date", term4247701);
        setByteField(term4247705, term4247705.getClass(), "hour", (byte) 1);
        setByteField(term4247705, term4247705.getClass(), "minute", (byte) 30);
        setByteField(term4247705, term4247705.getClass(), "second", (byte) 19);
        setIntField(term4247705, term4247705.getClass(), "nano", 51409457);
        setField(term4247700, term4247700.getClass(), "time", term4247705);
        setField(term4247674, term4247674.getClass(), "accessTime", term4247700);
        setField(term4247672, term4247672.getClass(), "card", term4247674);
        setField(term4247672, term4247672.getClass(), "userName", "hvwHMPWSiA");
        setIntField(term4247672, term4247672.getClass(), "isNetMember", 2115506202);
        setIntField(term4247672, term4247672.getClass(), "iconId", -1196401275);
        setIntField(term4247672, term4247672.getClass(), "plateId", 2113457442);
        setIntField(term4247672, term4247672.getClass(), "titleId", 89462709);
        setIntField(term4247672, term4247672.getClass(), "partnerId", 1916740328);
        setIntField(term4247672, term4247672.getClass(), "frameId", 1265815673);
        setIntField(term4247672, term4247672.getClass(), "selectMapId", 385263124);
        setIntField(term4247672, term4247672.getClass(), "totalAwake", 638380860);
        setIntField(term4247672, term4247672.getClass(), "gradeRating", 837377653);
        setIntField(term4247672, term4247672.getClass(), "musicRating", -396882588);
        setIntField(term4247672, term4247672.getClass(), "playerRating", 1258522959);
        setIntField(term4247672, term4247672.getClass(), "highestRating", 1915236527);
        setIntField(term4247672, term4247672.getClass(), "gradeRank", -267302655);
        setIntField(term4247672, term4247672.getClass(), "classRank", 408546788);
        setIntField(term4247672, term4247672.getClass(), "courseRank", -603686009);
        setField(term4247672, term4247672.getClass(), "charaSlot", term4247737);
        setField(term4247672, term4247672.getClass(), "charaLockSlot", term4247743);
        setLongField(term4247672, term4247672.getClass(), "contentBit", -7194976612751825140L);
        setIntField(term4247672, term4247672.getClass(), "playCount", -799481580);
        setField(term4247672, term4247672.getClass(), "eventWatchedDate", "BsonuVhHta");
        setField(term4247672, term4247672.getClass(), "lastGameId", "RWzpuNcDLr");
        setField(term4247672, term4247672.getClass(), "lastRomVersion", "kiSGcECKCR");
        setField(term4247672, term4247672.getClass(), "lastDataVersion", "qgxtSDQpvt");
        setField(term4247672, term4247672.getClass(), "lastLoginDate", "iEuABjKVQn");
        setField(term4247672, term4247672.getClass(), "lastPlayDate", "uXBPjGoYzK");
        setIntField(term4247672, term4247672.getClass(), "lastPlayCredit", -1577692331);
        setIntField(term4247672, term4247672.getClass(), "lastPlayMode", 1635081719);
        setIntField(term4247672, term4247672.getClass(), "lastPlaceId", 337910435);
        setField(term4247672, term4247672.getClass(), "lastPlaceName", "VsoiqQjdyj");
        setIntField(term4247672, term4247672.getClass(), "lastAllNetId", -2143083982);
        setIntField(term4247672, term4247672.getClass(), "lastRegionId", 167235368);
        setField(term4247672, term4247672.getClass(), "lastRegionName", "cTmtjDLxSW");
        setField(term4247672, term4247672.getClass(), "lastClientId", "LtLAloJXYh");
        setField(term4247672, term4247672.getClass(), "lastCountryCode", "OngRSWtDQJ");
        setIntField(term4247672, term4247672.getClass(), "lastSelectEMoney", 2071141513);
        setIntField(term4247672, term4247672.getClass(), "lastSelectTicket", 2093061317);
        setIntField(term4247672, term4247672.getClass(), "lastSelectCourse", -539358397);
        setIntField(term4247672, term4247672.getClass(), "lastCountCourse", -2034341949);
        setField(term4247672, term4247672.getClass(), "firstGameId", "okbAUDpYKh");
        setField(term4247672, term4247672.getClass(), "firstRomVersion", "MumjFFLkSY");
        setField(term4247672, term4247672.getClass(), "firstDataVersion", "wLjqtGiTVw");
        setField(term4247672, term4247672.getClass(), "firstPlayDate", "NwmtlYkogy");
        setField(term4247672, term4247672.getClass(), "compatibleCmVersion", "yEWKQAxTak");
        setField(term4247672, term4247672.getClass(), "dailyBonusDate", "grakQnVcHX");
        setField(term4247672, term4247672.getClass(), "dailyCourseBonusDate", "muRKgNcvDX");
        setField(term4247672, term4247672.getClass(), "lastPairLoginDate", "THTuHXtkXZ");
        setField(term4247672, term4247672.getClass(), "lastTrialPlayDate", "fQuvLyLFwG");
        setIntField(term4247672, term4247672.getClass(), "playVsCount", 908292430);
        setIntField(term4247672, term4247672.getClass(), "playSyncCount", 44665735);
        setIntField(term4247672, term4247672.getClass(), "winCount", 1853325544);
        setIntField(term4247672, term4247672.getClass(), "helpCount", 821166311);
        setIntField(term4247672, term4247672.getClass(), "comboCount", -1203835950);
        setLongField(term4247672, term4247672.getClass(), "totalDeluxscore", -5420741410031040067L);
        setLongField(term4247672, term4247672.getClass(), "totalBasicDeluxscore", -5941898582501714037L);
        setLongField(term4247672, term4247672.getClass(), "totalAdvancedDeluxscore", 6353333248499631314L);
        setLongField(term4247672, term4247672.getClass(), "totalExpertDeluxscore", -1410798673844739321L);
        setLongField(term4247672, term4247672.getClass(), "totalMasterDeluxscore", 4819242153842560460L);
        setLongField(term4247672, term4247672.getClass(), "totalReMasterDeluxscore", -2248135178720318793L);
        setIntField(term4247672, term4247672.getClass(), "totalSync", 635660168);
        setIntField(term4247672, term4247672.getClass(), "totalBasicSync", 369187932);
        setIntField(term4247672, term4247672.getClass(), "totalAdvancedSync", -1657528338);
        setIntField(term4247672, term4247672.getClass(), "totalExpertSync", 917209037);
        setIntField(term4247672, term4247672.getClass(), "totalMasterSync", 251781158);
        setIntField(term4247672, term4247672.getClass(), "totalReMasterSync", -1193455124);
        setLongField(term4247672, term4247672.getClass(), "totalAchievement", -5336876328940000668L);
        setLongField(term4247672, term4247672.getClass(), "totalBasicAchievement", 2058904063281380799L);
        setLongField(term4247672, term4247672.getClass(), "totalAdvancedAchievement", -1179507491961868104L);
        setLongField(term4247672, term4247672.getClass(), "totalExpertAchievement", -5775943277613997134L);
        setLongField(term4247672, term4247672.getClass(), "totalMasterAchievement", -1059779237497782415L);
        setLongField(term4247672, term4247672.getClass(), "totalReMasterAchievement", 7073977314988411736L);
        setLongField(term4247672, term4247672.getClass(), "playerOldRating", 4582347797283607592L);
        setLongField(term4247672, term4247672.getClass(), "playerNewRating", -3534582728179506768L);
        setIntField(term4247672, term4247672.getClass(), "banState", 2029339439);
        setLongField(term4247672, term4247672.getClass(), "dateTime", -8910725107463642107L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term4247672, args);
    }

};


