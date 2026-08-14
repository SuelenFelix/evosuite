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

public class UserDetail_setEventWatchedDate_102827017999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251645;

    public UserDetail_setEventWatchedDate_102827017999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251649 = new Long(-4231979631084175364L);
        Integer term251712 = new Integer(-583361854);
        Integer term251714 = new Integer(717140857);
        Integer term251716 = new Integer(891889211);
        ArrayList term251710 = new ArrayList();
        ((ArrayList) term251710).add(term251712);
        ((ArrayList) term251710).add(term251714);
        ((ArrayList) term251710).add(term251716);
        Integer term251722 = new Integer(265502816);
        Integer term251724 = new Integer(-1730476579);
        Integer term251726 = new Integer(-1501333599);
        ArrayList term251720 = new ArrayList();
        ((ArrayList) term251720).add(term251722);
        ((ArrayList) term251720).add(term251724);
        ((ArrayList) term251720).add(term251726);
        term251645 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term251647 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term251663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251678 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term251645, term251645.getClass(), "id", 8675979225201408630L);
        setLongField(term251647, term251647.getClass(), "id", 935656218787704165L);
        setField(term251647, term251647.getClass(), "extId", term251649);
        setField(term251647, term251647.getClass(), "luid", "DlaIwKXfcE");
        setIntField(term251664, term251664.getClass(), "year", 2013);
        setShortField(term251664, term251664.getClass(), "month", (short) 10);
        setShortField(term251664, term251664.getClass(), "day", (short) 4);
        setField(term251663, term251663.getClass(), "date", term251664);
        setByteField(term251668, term251668.getClass(), "hour", (byte) 13);
        setByteField(term251668, term251668.getClass(), "minute", (byte) 8);
        setByteField(term251668, term251668.getClass(), "second", (byte) 57);
        setIntField(term251668, term251668.getClass(), "nano", 285165765);
        setField(term251663, term251663.getClass(), "time", term251668);
        setField(term251647, term251647.getClass(), "registerTime", term251663);
        setIntField(term251674, term251674.getClass(), "year", 2029);
        setShortField(term251674, term251674.getClass(), "month", (short) 8);
        setShortField(term251674, term251674.getClass(), "day", (short) 12);
        setField(term251673, term251673.getClass(), "date", term251674);
        setByteField(term251678, term251678.getClass(), "hour", (byte) 20);
        setByteField(term251678, term251678.getClass(), "minute", (byte) 27);
        setByteField(term251678, term251678.getClass(), "second", (byte) 47);
        setIntField(term251678, term251678.getClass(), "nano", 668392287);
        setField(term251673, term251673.getClass(), "time", term251678);
        setField(term251647, term251647.getClass(), "accessTime", term251673);
        setField(term251645, term251645.getClass(), "card", term251647);
        setField(term251645, term251645.getClass(), "userName", "XqyZdgkVGJ");
        setIntField(term251645, term251645.getClass(), "isNetMember", 180724721);
        setIntField(term251645, term251645.getClass(), "iconId", -51295499);
        setIntField(term251645, term251645.getClass(), "plateId", 1802378804);
        setIntField(term251645, term251645.getClass(), "titleId", 2019634795);
        setIntField(term251645, term251645.getClass(), "partnerId", -225977108);
        setIntField(term251645, term251645.getClass(), "frameId", 226506265);
        setIntField(term251645, term251645.getClass(), "selectMapId", 197752687);
        setIntField(term251645, term251645.getClass(), "totalAwake", 1205131779);
        setIntField(term251645, term251645.getClass(), "gradeRating", -280037455);
        setIntField(term251645, term251645.getClass(), "musicRating", 2111270695);
        setIntField(term251645, term251645.getClass(), "playerRating", 337789164);
        setIntField(term251645, term251645.getClass(), "highestRating", 949433965);
        setIntField(term251645, term251645.getClass(), "gradeRank", -1866766202);
        setIntField(term251645, term251645.getClass(), "classRank", -694238117);
        setIntField(term251645, term251645.getClass(), "courseRank", -964005222);
        setField(term251645, term251645.getClass(), "charaSlot", term251710);
        setField(term251645, term251645.getClass(), "charaLockSlot", term251720);
        setLongField(term251645, term251645.getClass(), "contentBit", 2680829883928078040L);
        setIntField(term251645, term251645.getClass(), "playCount", -1800688324);
        setField(term251645, term251645.getClass(), "eventWatchedDate", "lDHOULUQIk");
        setField(term251645, term251645.getClass(), "lastGameId", "NXdDKYbdXI");
        setField(term251645, term251645.getClass(), "lastRomVersion", "pxtuUGpEnU");
        setField(term251645, term251645.getClass(), "lastDataVersion", "uRwndqhyZT");
        setField(term251645, term251645.getClass(), "lastLoginDate", "ZyhPGeQowD");
        setField(term251645, term251645.getClass(), "lastPlayDate", "YBDATxOjKA");
        setIntField(term251645, term251645.getClass(), "lastPlayCredit", 1310636176);
        setIntField(term251645, term251645.getClass(), "lastPlayMode", -1189499484);
        setIntField(term251645, term251645.getClass(), "lastPlaceId", -1149356121);
        setField(term251645, term251645.getClass(), "lastPlaceName", "HMHWwIqMRa");
        setIntField(term251645, term251645.getClass(), "lastAllNetId", 858213742);
        setIntField(term251645, term251645.getClass(), "lastRegionId", -418255260);
        setField(term251645, term251645.getClass(), "lastRegionName", "oYEupxjTZn");
        setField(term251645, term251645.getClass(), "lastClientId", "vnBZyaIYnL");
        setField(term251645, term251645.getClass(), "lastCountryCode", "lVKHMYsoNI");
        setIntField(term251645, term251645.getClass(), "lastSelectEMoney", -510211158);
        setIntField(term251645, term251645.getClass(), "lastSelectTicket", -1490379978);
        setIntField(term251645, term251645.getClass(), "lastSelectCourse", 1147276309);
        setIntField(term251645, term251645.getClass(), "lastCountCourse", 1672571869);
        setField(term251645, term251645.getClass(), "firstGameId", "MPUPYPQuHB");
        setField(term251645, term251645.getClass(), "firstRomVersion", "blJZUhevsA");
        setField(term251645, term251645.getClass(), "firstDataVersion", "nbJzmGdHpB");
        setField(term251645, term251645.getClass(), "firstPlayDate", "HxihxzuKfN");
        setField(term251645, term251645.getClass(), "compatibleCmVersion", "kenKdxPVfm");
        setField(term251645, term251645.getClass(), "dailyBonusDate", "fnztsFUlSX");
        setField(term251645, term251645.getClass(), "dailyCourseBonusDate", "eqAUffwade");
        setField(term251645, term251645.getClass(), "lastPairLoginDate", "NnRkGusQSv");
        setField(term251645, term251645.getClass(), "lastTrialPlayDate", "psNOiLjLdY");
        setIntField(term251645, term251645.getClass(), "playVsCount", 1638519569);
        setIntField(term251645, term251645.getClass(), "playSyncCount", 136694863);
        setIntField(term251645, term251645.getClass(), "winCount", -2140607687);
        setIntField(term251645, term251645.getClass(), "helpCount", -61319889);
        setIntField(term251645, term251645.getClass(), "comboCount", 134375423);
        setLongField(term251645, term251645.getClass(), "totalDeluxscore", 3270425302522829038L);
        setLongField(term251645, term251645.getClass(), "totalBasicDeluxscore", -3052321286896271663L);
        setLongField(term251645, term251645.getClass(), "totalAdvancedDeluxscore", 7973858127089084011L);
        setLongField(term251645, term251645.getClass(), "totalExpertDeluxscore", 7066509184871687011L);
        setLongField(term251645, term251645.getClass(), "totalMasterDeluxscore", 1304807977437263807L);
        setLongField(term251645, term251645.getClass(), "totalReMasterDeluxscore", -6448459846174484267L);
        setIntField(term251645, term251645.getClass(), "totalSync", 1020472599);
        setIntField(term251645, term251645.getClass(), "totalBasicSync", 1144072956);
        setIntField(term251645, term251645.getClass(), "totalAdvancedSync", 197317948);
        setIntField(term251645, term251645.getClass(), "totalExpertSync", 399945179);
        setIntField(term251645, term251645.getClass(), "totalMasterSync", -644046528);
        setIntField(term251645, term251645.getClass(), "totalReMasterSync", -1351948033);
        setLongField(term251645, term251645.getClass(), "totalAchievement", -3717895521027064967L);
        setLongField(term251645, term251645.getClass(), "totalBasicAchievement", 3968517739295019151L);
        setLongField(term251645, term251645.getClass(), "totalAdvancedAchievement", -8060974486087736487L);
        setLongField(term251645, term251645.getClass(), "totalExpertAchievement", 3922307168245869896L);
        setLongField(term251645, term251645.getClass(), "totalMasterAchievement", 4245323783212941075L);
        setLongField(term251645, term251645.getClass(), "totalReMasterAchievement", -939048076614277790L);
        setLongField(term251645, term251645.getClass(), "playerOldRating", 2031977872303816530L);
        setLongField(term251645, term251645.getClass(), "playerNewRating", -4917591950289901676L);
        setIntField(term251645, term251645.getClass(), "banState", -1524640986);
        setLongField(term251645, term251645.getClass(), "dateTime", -747588793353231105L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LMXTwgTyDv";
        callMethod(klass, "setEventWatchedDate", argTypes, term251645, args);
    }

};


