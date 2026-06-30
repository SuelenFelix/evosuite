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

public class UserDetail_getLastLoginDate_127754626426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4244254;

    public UserDetail_getLastLoginDate_127754626426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4244258 = new Long(495841436056901201L);
        Integer term4244321 = new Integer(-143315713);
        Integer term4244323 = new Integer(-362106921);
        ArrayList term4244319 = new ArrayList();
        ((ArrayList) term4244319).add(term4244321);
        ((ArrayList) term4244319).add(term4244323);
        Integer term4244329 = new Integer(86367204);
        Integer term4244331 = new Integer(-602995676);
        Integer term4244333 = new Integer(815088701);
        ArrayList term4244327 = new ArrayList();
        ((ArrayList) term4244327).add(term4244329);
        ((ArrayList) term4244327).add(term4244331);
        ((ArrayList) term4244327).add(term4244333);
        term4244254 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4244256 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4244272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4244273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4244277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4244282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4244283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4244287 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4244254, term4244254.getClass(), "id", 6562027708608127562L);
        setLongField(term4244256, term4244256.getClass(), "id", 515029579631801064L);
        setField(term4244256, term4244256.getClass(), "extId", term4244258);
        setField(term4244256, term4244256.getClass(), "luid", "fjKvWcUKgr");
        setIntField(term4244273, term4244273.getClass(), "year", 2029);
        setShortField(term4244273, term4244273.getClass(), "month", (short) 7);
        setShortField(term4244273, term4244273.getClass(), "day", (short) 18);
        setField(term4244272, term4244272.getClass(), "date", term4244273);
        setByteField(term4244277, term4244277.getClass(), "hour", (byte) 8);
        setByteField(term4244277, term4244277.getClass(), "minute", (byte) 37);
        setByteField(term4244277, term4244277.getClass(), "second", (byte) 27);
        setIntField(term4244277, term4244277.getClass(), "nano", 793836080);
        setField(term4244272, term4244272.getClass(), "time", term4244277);
        setField(term4244256, term4244256.getClass(), "registerTime", term4244272);
        setIntField(term4244283, term4244283.getClass(), "year", 2015);
        setShortField(term4244283, term4244283.getClass(), "month", (short) 1);
        setShortField(term4244283, term4244283.getClass(), "day", (short) 11);
        setField(term4244282, term4244282.getClass(), "date", term4244283);
        setByteField(term4244287, term4244287.getClass(), "hour", (byte) 21);
        setByteField(term4244287, term4244287.getClass(), "minute", (byte) 30);
        setByteField(term4244287, term4244287.getClass(), "second", (byte) 33);
        setIntField(term4244287, term4244287.getClass(), "nano", 62938316);
        setField(term4244282, term4244282.getClass(), "time", term4244287);
        setField(term4244256, term4244256.getClass(), "accessTime", term4244282);
        setField(term4244254, term4244254.getClass(), "card", term4244256);
        setField(term4244254, term4244254.getClass(), "userName", "tXUxKeGRsM");
        setIntField(term4244254, term4244254.getClass(), "isNetMember", 830027264);
        setIntField(term4244254, term4244254.getClass(), "iconId", -153143797);
        setIntField(term4244254, term4244254.getClass(), "plateId", -1544512030);
        setIntField(term4244254, term4244254.getClass(), "titleId", -439322306);
        setIntField(term4244254, term4244254.getClass(), "partnerId", 1745914783);
        setIntField(term4244254, term4244254.getClass(), "frameId", -2141187110);
        setIntField(term4244254, term4244254.getClass(), "selectMapId", 872318536);
        setIntField(term4244254, term4244254.getClass(), "totalAwake", -894207605);
        setIntField(term4244254, term4244254.getClass(), "gradeRating", 1369344354);
        setIntField(term4244254, term4244254.getClass(), "musicRating", -947252684);
        setIntField(term4244254, term4244254.getClass(), "playerRating", 754999652);
        setIntField(term4244254, term4244254.getClass(), "highestRating", -1300891354);
        setIntField(term4244254, term4244254.getClass(), "gradeRank", 141788030);
        setIntField(term4244254, term4244254.getClass(), "classRank", -905523078);
        setIntField(term4244254, term4244254.getClass(), "courseRank", 840192081);
        setField(term4244254, term4244254.getClass(), "charaSlot", term4244319);
        setField(term4244254, term4244254.getClass(), "charaLockSlot", term4244327);
        setLongField(term4244254, term4244254.getClass(), "contentBit", -435675806898990484L);
        setIntField(term4244254, term4244254.getClass(), "playCount", -454581514);
        setField(term4244254, term4244254.getClass(), "eventWatchedDate", "etOpaHRdhG");
        setField(term4244254, term4244254.getClass(), "lastGameId", "PMfJxhIFAc");
        setField(term4244254, term4244254.getClass(), "lastRomVersion", "NODBhVIpFV");
        setField(term4244254, term4244254.getClass(), "lastDataVersion", "EPsXZUChjD");
        setField(term4244254, term4244254.getClass(), "lastLoginDate", "ACqxwwQWqU");
        setField(term4244254, term4244254.getClass(), "lastPlayDate", "fdIjeavfFA");
        setIntField(term4244254, term4244254.getClass(), "lastPlayCredit", -1598841475);
        setIntField(term4244254, term4244254.getClass(), "lastPlayMode", -1574967700);
        setIntField(term4244254, term4244254.getClass(), "lastPlaceId", -1595291593);
        setField(term4244254, term4244254.getClass(), "lastPlaceName", "oYXjHJQzCu");
        setIntField(term4244254, term4244254.getClass(), "lastAllNetId", -1008682637);
        setIntField(term4244254, term4244254.getClass(), "lastRegionId", -339803327);
        setField(term4244254, term4244254.getClass(), "lastRegionName", "UcWvDTaAnt");
        setField(term4244254, term4244254.getClass(), "lastClientId", "kNTkqeKuCg");
        setField(term4244254, term4244254.getClass(), "lastCountryCode", "eHDyjPUOfk");
        setIntField(term4244254, term4244254.getClass(), "lastSelectEMoney", 1695072991);
        setIntField(term4244254, term4244254.getClass(), "lastSelectTicket", -80012044);
        setIntField(term4244254, term4244254.getClass(), "lastSelectCourse", -306088328);
        setIntField(term4244254, term4244254.getClass(), "lastCountCourse", -940167608);
        setField(term4244254, term4244254.getClass(), "firstGameId", "qgLWjJwcFe");
        setField(term4244254, term4244254.getClass(), "firstRomVersion", "ZfKwqDGcOi");
        setField(term4244254, term4244254.getClass(), "firstDataVersion", "OvZKpIMHDj");
        setField(term4244254, term4244254.getClass(), "firstPlayDate", "rmPzCpCjva");
        setField(term4244254, term4244254.getClass(), "compatibleCmVersion", "LBrwcQYNdE");
        setField(term4244254, term4244254.getClass(), "dailyBonusDate", "zGbScFOJIw");
        setField(term4244254, term4244254.getClass(), "dailyCourseBonusDate", "NwbdtFyWNX");
        setField(term4244254, term4244254.getClass(), "lastPairLoginDate", "nDdRVGJOHW");
        setField(term4244254, term4244254.getClass(), "lastTrialPlayDate", "qSZJEzSQiO");
        setIntField(term4244254, term4244254.getClass(), "playVsCount", 1113276846);
        setIntField(term4244254, term4244254.getClass(), "playSyncCount", 310546936);
        setIntField(term4244254, term4244254.getClass(), "winCount", -790162339);
        setIntField(term4244254, term4244254.getClass(), "helpCount", -970540240);
        setIntField(term4244254, term4244254.getClass(), "comboCount", 150154477);
        setLongField(term4244254, term4244254.getClass(), "totalDeluxscore", -4524830070903784410L);
        setLongField(term4244254, term4244254.getClass(), "totalBasicDeluxscore", 2193718312129812538L);
        setLongField(term4244254, term4244254.getClass(), "totalAdvancedDeluxscore", 3836383027812154502L);
        setLongField(term4244254, term4244254.getClass(), "totalExpertDeluxscore", -9080844404973605318L);
        setLongField(term4244254, term4244254.getClass(), "totalMasterDeluxscore", 4076060644642187609L);
        setLongField(term4244254, term4244254.getClass(), "totalReMasterDeluxscore", -1898449461435032703L);
        setIntField(term4244254, term4244254.getClass(), "totalSync", 58004848);
        setIntField(term4244254, term4244254.getClass(), "totalBasicSync", -1069558715);
        setIntField(term4244254, term4244254.getClass(), "totalAdvancedSync", -1749970050);
        setIntField(term4244254, term4244254.getClass(), "totalExpertSync", -815522460);
        setIntField(term4244254, term4244254.getClass(), "totalMasterSync", 1523255718);
        setIntField(term4244254, term4244254.getClass(), "totalReMasterSync", 1642632627);
        setLongField(term4244254, term4244254.getClass(), "totalAchievement", -679726516159774308L);
        setLongField(term4244254, term4244254.getClass(), "totalBasicAchievement", -8500187066041006984L);
        setLongField(term4244254, term4244254.getClass(), "totalAdvancedAchievement", -4728516275532687786L);
        setLongField(term4244254, term4244254.getClass(), "totalExpertAchievement", 4788589575374504931L);
        setLongField(term4244254, term4244254.getClass(), "totalMasterAchievement", -1275603632420948667L);
        setLongField(term4244254, term4244254.getClass(), "totalReMasterAchievement", 2183366602416410655L);
        setLongField(term4244254, term4244254.getClass(), "playerOldRating", 6401524729218144697L);
        setLongField(term4244254, term4244254.getClass(), "playerNewRating", 5164841667760828586L);
        setIntField(term4244254, term4244254.getClass(), "banState", -767332454);
        setLongField(term4244254, term4244254.getClass(), "dateTime", -7421327815936882754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term4244254, args);
    }

};


