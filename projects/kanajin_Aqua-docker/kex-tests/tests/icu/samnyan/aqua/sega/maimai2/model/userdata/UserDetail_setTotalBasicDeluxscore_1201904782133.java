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

public class UserDetail_setTotalBasicDeluxscore_1201904782133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4305476;
     Object term4305819;

    public UserDetail_setTotalBasicDeluxscore_1201904782133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4305480 = new Long(3671531966262068453L);
        ArrayList term4305541 = new ArrayList();
        Integer term4305547 = new Integer(816418778);
        Integer term4305549 = new Integer(-1343139679);
        ArrayList term4305545 = new ArrayList();
        ((ArrayList) term4305545).add(term4305547);
        ((ArrayList) term4305545).add(term4305549);
        term4305476 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4305478 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4305494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4305495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4305499 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4305504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4305505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4305509 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4305476, term4305476.getClass(), "id", 3303004648685443826L);
        setLongField(term4305478, term4305478.getClass(), "id", 4409650019056855937L);
        setField(term4305478, term4305478.getClass(), "extId", term4305480);
        setField(term4305478, term4305478.getClass(), "luid", "uKCWHqzIFC");
        setIntField(term4305495, term4305495.getClass(), "year", 2010);
        setShortField(term4305495, term4305495.getClass(), "month", (short) 10);
        setShortField(term4305495, term4305495.getClass(), "day", (short) 11);
        setField(term4305494, term4305494.getClass(), "date", term4305495);
        setByteField(term4305499, term4305499.getClass(), "hour", (byte) 3);
        setByteField(term4305499, term4305499.getClass(), "minute", (byte) 28);
        setByteField(term4305499, term4305499.getClass(), "second", (byte) 15);
        setIntField(term4305499, term4305499.getClass(), "nano", 228385223);
        setField(term4305494, term4305494.getClass(), "time", term4305499);
        setField(term4305478, term4305478.getClass(), "registerTime", term4305494);
        setIntField(term4305505, term4305505.getClass(), "year", 2022);
        setShortField(term4305505, term4305505.getClass(), "month", (short) 5);
        setShortField(term4305505, term4305505.getClass(), "day", (short) 10);
        setField(term4305504, term4305504.getClass(), "date", term4305505);
        setByteField(term4305509, term4305509.getClass(), "hour", (byte) 19);
        setByteField(term4305509, term4305509.getClass(), "minute", (byte) 39);
        setByteField(term4305509, term4305509.getClass(), "second", (byte) 6);
        setIntField(term4305509, term4305509.getClass(), "nano", 993632244);
        setField(term4305504, term4305504.getClass(), "time", term4305509);
        setField(term4305478, term4305478.getClass(), "accessTime", term4305504);
        setField(term4305476, term4305476.getClass(), "card", term4305478);
        setField(term4305476, term4305476.getClass(), "userName", "bXgIrtGjLa");
        setIntField(term4305476, term4305476.getClass(), "isNetMember", -571586946);
        setIntField(term4305476, term4305476.getClass(), "iconId", 34805914);
        setIntField(term4305476, term4305476.getClass(), "plateId", -695682839);
        setIntField(term4305476, term4305476.getClass(), "titleId", -901270291);
        setIntField(term4305476, term4305476.getClass(), "partnerId", 215249991);
        setIntField(term4305476, term4305476.getClass(), "frameId", -1828680580);
        setIntField(term4305476, term4305476.getClass(), "selectMapId", -234362848);
        setIntField(term4305476, term4305476.getClass(), "totalAwake", -820021616);
        setIntField(term4305476, term4305476.getClass(), "gradeRating", 28259416);
        setIntField(term4305476, term4305476.getClass(), "musicRating", -704906311);
        setIntField(term4305476, term4305476.getClass(), "playerRating", -1021635348);
        setIntField(term4305476, term4305476.getClass(), "highestRating", -503989877);
        setIntField(term4305476, term4305476.getClass(), "gradeRank", -599738548);
        setIntField(term4305476, term4305476.getClass(), "classRank", 1746960276);
        setIntField(term4305476, term4305476.getClass(), "courseRank", 1458165352);
        setField(term4305476, term4305476.getClass(), "charaSlot", term4305541);
        setField(term4305476, term4305476.getClass(), "charaLockSlot", term4305545);
        setLongField(term4305476, term4305476.getClass(), "contentBit", -7318862596290052805L);
        setIntField(term4305476, term4305476.getClass(), "playCount", 689566210);
        setField(term4305476, term4305476.getClass(), "eventWatchedDate", "SjrKLVyGsv");
        setField(term4305476, term4305476.getClass(), "lastGameId", "lHxbplYnBL");
        setField(term4305476, term4305476.getClass(), "lastRomVersion", "FFKjPYQfJP");
        setField(term4305476, term4305476.getClass(), "lastDataVersion", "KoCOvLmstS");
        setField(term4305476, term4305476.getClass(), "lastLoginDate", "RhfVNYuazl");
        setField(term4305476, term4305476.getClass(), "lastPlayDate", "UIvYmTPaYN");
        setIntField(term4305476, term4305476.getClass(), "lastPlayCredit", -797665882);
        setIntField(term4305476, term4305476.getClass(), "lastPlayMode", -964716398);
        setIntField(term4305476, term4305476.getClass(), "lastPlaceId", 1541292135);
        setField(term4305476, term4305476.getClass(), "lastPlaceName", "XdHcqVedce");
        setIntField(term4305476, term4305476.getClass(), "lastAllNetId", -1798535998);
        setIntField(term4305476, term4305476.getClass(), "lastRegionId", 72524478);
        setField(term4305476, term4305476.getClass(), "lastRegionName", "mqcERcNxaY");
        setField(term4305476, term4305476.getClass(), "lastClientId", "ygImWxhlaW");
        setField(term4305476, term4305476.getClass(), "lastCountryCode", "RmOqMUIVMK");
        setIntField(term4305476, term4305476.getClass(), "lastSelectEMoney", 150747228);
        setIntField(term4305476, term4305476.getClass(), "lastSelectTicket", 1375400323);
        setIntField(term4305476, term4305476.getClass(), "lastSelectCourse", 385400269);
        setIntField(term4305476, term4305476.getClass(), "lastCountCourse", 391609077);
        setField(term4305476, term4305476.getClass(), "firstGameId", "RfUDAqTIey");
        setField(term4305476, term4305476.getClass(), "firstRomVersion", "JvzwNfrXjd");
        setField(term4305476, term4305476.getClass(), "firstDataVersion", "dDBaBlJgSd");
        setField(term4305476, term4305476.getClass(), "firstPlayDate", "GrGzwkTEhp");
        setField(term4305476, term4305476.getClass(), "compatibleCmVersion", "msbgXFwCJq");
        setField(term4305476, term4305476.getClass(), "dailyBonusDate", "WwwHbVJWUQ");
        setField(term4305476, term4305476.getClass(), "dailyCourseBonusDate", "hDWYrKausB");
        setField(term4305476, term4305476.getClass(), "lastPairLoginDate", "ISoCPnDyzr");
        setField(term4305476, term4305476.getClass(), "lastTrialPlayDate", "VbfKAYDHEi");
        setIntField(term4305476, term4305476.getClass(), "playVsCount", 1118963177);
        setIntField(term4305476, term4305476.getClass(), "playSyncCount", 1731948149);
        setIntField(term4305476, term4305476.getClass(), "winCount", 330902292);
        setIntField(term4305476, term4305476.getClass(), "helpCount", -1727315665);
        setIntField(term4305476, term4305476.getClass(), "comboCount", -1387642916);
        setLongField(term4305476, term4305476.getClass(), "totalDeluxscore", 6856343863882827787L);
        setLongField(term4305476, term4305476.getClass(), "totalBasicDeluxscore", -2892676802936789556L);
        setLongField(term4305476, term4305476.getClass(), "totalAdvancedDeluxscore", 2676993040581042666L);
        setLongField(term4305476, term4305476.getClass(), "totalExpertDeluxscore", -5360818791205725036L);
        setLongField(term4305476, term4305476.getClass(), "totalMasterDeluxscore", 2871036179687754522L);
        setLongField(term4305476, term4305476.getClass(), "totalReMasterDeluxscore", -3087710395630150811L);
        setIntField(term4305476, term4305476.getClass(), "totalSync", -1706139993);
        setIntField(term4305476, term4305476.getClass(), "totalBasicSync", -1384095866);
        setIntField(term4305476, term4305476.getClass(), "totalAdvancedSync", 1430404994);
        setIntField(term4305476, term4305476.getClass(), "totalExpertSync", 1859248426);
        setIntField(term4305476, term4305476.getClass(), "totalMasterSync", 1524530695);
        setIntField(term4305476, term4305476.getClass(), "totalReMasterSync", 1423729225);
        setLongField(term4305476, term4305476.getClass(), "totalAchievement", 4561705378316859061L);
        setLongField(term4305476, term4305476.getClass(), "totalBasicAchievement", 4672249298872098811L);
        setLongField(term4305476, term4305476.getClass(), "totalAdvancedAchievement", 2511171571772982423L);
        setLongField(term4305476, term4305476.getClass(), "totalExpertAchievement", -645766605181314499L);
        setLongField(term4305476, term4305476.getClass(), "totalMasterAchievement", -4034534933789056187L);
        setLongField(term4305476, term4305476.getClass(), "totalReMasterAchievement", 8664411609835076290L);
        setLongField(term4305476, term4305476.getClass(), "playerOldRating", 5002337917380897802L);
        setLongField(term4305476, term4305476.getClass(), "playerNewRating", 8136279891104408982L);
        setIntField(term4305476, term4305476.getClass(), "banState", -1426432214);
        setLongField(term4305476, term4305476.getClass(), "dateTime", -314591967686484638L);
        term4305819 = new Long(4342321144498851133L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4305819;
        callMethod(klass, "setTotalBasicDeluxscore", argTypes, term4305476, args);
    }

};


