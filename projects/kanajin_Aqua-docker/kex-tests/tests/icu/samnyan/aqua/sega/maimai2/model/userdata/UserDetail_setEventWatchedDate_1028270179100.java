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

public class UserDetail_setEventWatchedDate_1028270179100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251700;

    public UserDetail_setEventWatchedDate_1028270179100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251704 = new Long(-4231979631084175364L);
        Integer term251767 = new Integer(-583361854);
        Integer term251769 = new Integer(717140857);
        Integer term251771 = new Integer(891889211);
        ArrayList term251765 = new ArrayList();
        ((ArrayList) term251765).add(term251767);
        ((ArrayList) term251765).add(term251769);
        ((ArrayList) term251765).add(term251771);
        Integer term251777 = new Integer(265502816);
        Integer term251779 = new Integer(-1730476579);
        Integer term251781 = new Integer(-1501333599);
        ArrayList term251775 = new ArrayList();
        ((ArrayList) term251775).add(term251777);
        ((ArrayList) term251775).add(term251779);
        ((ArrayList) term251775).add(term251781);
        term251700 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term251702 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term251718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251723 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251733 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term251700, term251700.getClass(), "id", 8675979225201408630L);
        setLongField(term251702, term251702.getClass(), "id", 935656218787704165L);
        setField(term251702, term251702.getClass(), "extId", term251704);
        setField(term251702, term251702.getClass(), "luid", "DlaIwKXfcE");
        setIntField(term251719, term251719.getClass(), "year", 2013);
        setShortField(term251719, term251719.getClass(), "month", (short) 10);
        setShortField(term251719, term251719.getClass(), "day", (short) 4);
        setField(term251718, term251718.getClass(), "date", term251719);
        setByteField(term251723, term251723.getClass(), "hour", (byte) 13);
        setByteField(term251723, term251723.getClass(), "minute", (byte) 8);
        setByteField(term251723, term251723.getClass(), "second", (byte) 57);
        setIntField(term251723, term251723.getClass(), "nano", 285165765);
        setField(term251718, term251718.getClass(), "time", term251723);
        setField(term251702, term251702.getClass(), "registerTime", term251718);
        setIntField(term251729, term251729.getClass(), "year", 2029);
        setShortField(term251729, term251729.getClass(), "month", (short) 8);
        setShortField(term251729, term251729.getClass(), "day", (short) 12);
        setField(term251728, term251728.getClass(), "date", term251729);
        setByteField(term251733, term251733.getClass(), "hour", (byte) 20);
        setByteField(term251733, term251733.getClass(), "minute", (byte) 27);
        setByteField(term251733, term251733.getClass(), "second", (byte) 47);
        setIntField(term251733, term251733.getClass(), "nano", 668392287);
        setField(term251728, term251728.getClass(), "time", term251733);
        setField(term251702, term251702.getClass(), "accessTime", term251728);
        setField(term251700, term251700.getClass(), "card", term251702);
        setField(term251700, term251700.getClass(), "userName", "XqyZdgkVGJ");
        setIntField(term251700, term251700.getClass(), "isNetMember", 180724721);
        setIntField(term251700, term251700.getClass(), "iconId", -51295499);
        setIntField(term251700, term251700.getClass(), "plateId", 1802378804);
        setIntField(term251700, term251700.getClass(), "titleId", 2019634795);
        setIntField(term251700, term251700.getClass(), "partnerId", -225977108);
        setIntField(term251700, term251700.getClass(), "frameId", 226506265);
        setIntField(term251700, term251700.getClass(), "selectMapId", 197752687);
        setIntField(term251700, term251700.getClass(), "totalAwake", 1205131779);
        setIntField(term251700, term251700.getClass(), "gradeRating", -280037455);
        setIntField(term251700, term251700.getClass(), "musicRating", 2111270695);
        setIntField(term251700, term251700.getClass(), "playerRating", 337789164);
        setIntField(term251700, term251700.getClass(), "highestRating", 949433965);
        setIntField(term251700, term251700.getClass(), "gradeRank", -1866766202);
        setIntField(term251700, term251700.getClass(), "classRank", -694238117);
        setIntField(term251700, term251700.getClass(), "courseRank", -964005222);
        setField(term251700, term251700.getClass(), "charaSlot", term251765);
        setField(term251700, term251700.getClass(), "charaLockSlot", term251775);
        setLongField(term251700, term251700.getClass(), "contentBit", 2680829883928078040L);
        setIntField(term251700, term251700.getClass(), "playCount", -1800688324);
        setField(term251700, term251700.getClass(), "eventWatchedDate", "lDHOULUQIk");
        setField(term251700, term251700.getClass(), "lastGameId", "NXdDKYbdXI");
        setField(term251700, term251700.getClass(), "lastRomVersion", "pxtuUGpEnU");
        setField(term251700, term251700.getClass(), "lastDataVersion", "uRwndqhyZT");
        setField(term251700, term251700.getClass(), "lastLoginDate", "ZyhPGeQowD");
        setField(term251700, term251700.getClass(), "lastPlayDate", "YBDATxOjKA");
        setIntField(term251700, term251700.getClass(), "lastPlayCredit", 1310636176);
        setIntField(term251700, term251700.getClass(), "lastPlayMode", -1189499484);
        setIntField(term251700, term251700.getClass(), "lastPlaceId", -1149356121);
        setField(term251700, term251700.getClass(), "lastPlaceName", "HMHWwIqMRa");
        setIntField(term251700, term251700.getClass(), "lastAllNetId", 858213742);
        setIntField(term251700, term251700.getClass(), "lastRegionId", -418255260);
        setField(term251700, term251700.getClass(), "lastRegionName", "oYEupxjTZn");
        setField(term251700, term251700.getClass(), "lastClientId", "vnBZyaIYnL");
        setField(term251700, term251700.getClass(), "lastCountryCode", "lVKHMYsoNI");
        setIntField(term251700, term251700.getClass(), "lastSelectEMoney", -510211158);
        setIntField(term251700, term251700.getClass(), "lastSelectTicket", -1490379978);
        setIntField(term251700, term251700.getClass(), "lastSelectCourse", 1147276309);
        setIntField(term251700, term251700.getClass(), "lastCountCourse", 1672571869);
        setField(term251700, term251700.getClass(), "firstGameId", "MPUPYPQuHB");
        setField(term251700, term251700.getClass(), "firstRomVersion", "blJZUhevsA");
        setField(term251700, term251700.getClass(), "firstDataVersion", "nbJzmGdHpB");
        setField(term251700, term251700.getClass(), "firstPlayDate", "HxihxzuKfN");
        setField(term251700, term251700.getClass(), "compatibleCmVersion", "kenKdxPVfm");
        setField(term251700, term251700.getClass(), "dailyBonusDate", "fnztsFUlSX");
        setField(term251700, term251700.getClass(), "dailyCourseBonusDate", "eqAUffwade");
        setField(term251700, term251700.getClass(), "lastPairLoginDate", "NnRkGusQSv");
        setField(term251700, term251700.getClass(), "lastTrialPlayDate", "psNOiLjLdY");
        setIntField(term251700, term251700.getClass(), "playVsCount", 1638519569);
        setIntField(term251700, term251700.getClass(), "playSyncCount", 136694863);
        setIntField(term251700, term251700.getClass(), "winCount", -2140607687);
        setIntField(term251700, term251700.getClass(), "helpCount", -61319889);
        setIntField(term251700, term251700.getClass(), "comboCount", 134375423);
        setLongField(term251700, term251700.getClass(), "totalDeluxscore", 3270425302522829038L);
        setLongField(term251700, term251700.getClass(), "totalBasicDeluxscore", -3052321286896271663L);
        setLongField(term251700, term251700.getClass(), "totalAdvancedDeluxscore", 7973858127089084011L);
        setLongField(term251700, term251700.getClass(), "totalExpertDeluxscore", 7066509184871687011L);
        setLongField(term251700, term251700.getClass(), "totalMasterDeluxscore", 1304807977437263807L);
        setLongField(term251700, term251700.getClass(), "totalReMasterDeluxscore", -6448459846174484267L);
        setIntField(term251700, term251700.getClass(), "totalSync", 1020472599);
        setIntField(term251700, term251700.getClass(), "totalBasicSync", 1144072956);
        setIntField(term251700, term251700.getClass(), "totalAdvancedSync", 197317948);
        setIntField(term251700, term251700.getClass(), "totalExpertSync", 399945179);
        setIntField(term251700, term251700.getClass(), "totalMasterSync", -644046528);
        setIntField(term251700, term251700.getClass(), "totalReMasterSync", -1351948033);
        setLongField(term251700, term251700.getClass(), "totalAchievement", -3717895521027064967L);
        setLongField(term251700, term251700.getClass(), "totalBasicAchievement", 3968517739295019151L);
        setLongField(term251700, term251700.getClass(), "totalAdvancedAchievement", -8060974486087736487L);
        setLongField(term251700, term251700.getClass(), "totalExpertAchievement", 3922307168245869896L);
        setLongField(term251700, term251700.getClass(), "totalMasterAchievement", 4245323783212941075L);
        setLongField(term251700, term251700.getClass(), "totalReMasterAchievement", -939048076614277790L);
        setLongField(term251700, term251700.getClass(), "playerOldRating", 2031977872303816530L);
        setLongField(term251700, term251700.getClass(), "playerNewRating", -4917591950289901676L);
        setIntField(term251700, term251700.getClass(), "banState", -1524640986);
        setLongField(term251700, term251700.getClass(), "dateTime", -747588793353231105L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LMXTwgTyDv";
        callMethod(klass, "setEventWatchedDate", argTypes, term251700, args);
    }

};


