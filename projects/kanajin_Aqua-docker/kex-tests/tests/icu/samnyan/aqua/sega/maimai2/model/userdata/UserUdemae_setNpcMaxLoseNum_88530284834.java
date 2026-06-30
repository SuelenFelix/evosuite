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

public class UserUdemae_setNpcMaxLoseNum_88530284834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114878;
     Object term115245;

    public UserUdemae_setNpcMaxLoseNum_88530284834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114884 = new Long(-4030863184426321096L);
        Integer term114947 = new Integer(-1547322575);
        Integer term114949 = new Integer(-61444233);
        Integer term114951 = new Integer(-400720912);
        Integer term114953 = new Integer(1266192397);
        Integer term114955 = new Integer(218346781);
        ArrayList term114945 = new ArrayList();
        ((ArrayList) term114945).add(term114947);
        ((ArrayList) term114945).add(term114949);
        ((ArrayList) term114945).add(term114951);
        ((ArrayList) term114945).add(term114953);
        ((ArrayList) term114945).add(term114955);
        ArrayList term114959 = new ArrayList();
        term114878 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term114880 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term114882 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114913 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114878, term114878.getClass(), "id", -7801053273167145554L);
        setLongField(term114880, term114880.getClass(), "id", -3527774235000527109L);
        setLongField(term114882, term114882.getClass(), "id", 7471635522817277586L);
        setField(term114882, term114882.getClass(), "extId", term114884);
        setField(term114882, term114882.getClass(), "luid", "ALdRRCOlhZ");
        setIntField(term114899, term114899.getClass(), "year", 2025);
        setShortField(term114899, term114899.getClass(), "month", (short) 2);
        setShortField(term114899, term114899.getClass(), "day", (short) 24);
        setField(term114898, term114898.getClass(), "date", term114899);
        setByteField(term114903, term114903.getClass(), "hour", (byte) 10);
        setByteField(term114903, term114903.getClass(), "minute", (byte) 56);
        setByteField(term114903, term114903.getClass(), "second", (byte) 29);
        setIntField(term114903, term114903.getClass(), "nano", 207724630);
        setField(term114898, term114898.getClass(), "time", term114903);
        setField(term114882, term114882.getClass(), "registerTime", term114898);
        setIntField(term114909, term114909.getClass(), "year", 2027);
        setShortField(term114909, term114909.getClass(), "month", (short) 8);
        setShortField(term114909, term114909.getClass(), "day", (short) 16);
        setField(term114908, term114908.getClass(), "date", term114909);
        setByteField(term114913, term114913.getClass(), "hour", (byte) 1);
        setByteField(term114913, term114913.getClass(), "minute", (byte) 50);
        setByteField(term114913, term114913.getClass(), "second", (byte) 52);
        setIntField(term114913, term114913.getClass(), "nano", 161814778);
        setField(term114908, term114908.getClass(), "time", term114913);
        setField(term114882, term114882.getClass(), "accessTime", term114908);
        setField(term114880, term114880.getClass(), "card", term114882);
        setField(term114880, term114880.getClass(), "userName", "vXmDfMgmHu");
        setIntField(term114880, term114880.getClass(), "isNetMember", -428024469);
        setIntField(term114880, term114880.getClass(), "iconId", -428926218);
        setIntField(term114880, term114880.getClass(), "plateId", 1874384865);
        setIntField(term114880, term114880.getClass(), "titleId", -559576348);
        setIntField(term114880, term114880.getClass(), "partnerId", -779864176);
        setIntField(term114880, term114880.getClass(), "frameId", -819912343);
        setIntField(term114880, term114880.getClass(), "selectMapId", 1828884130);
        setIntField(term114880, term114880.getClass(), "totalAwake", -1130376171);
        setIntField(term114880, term114880.getClass(), "gradeRating", 1286975918);
        setIntField(term114880, term114880.getClass(), "musicRating", 1198027781);
        setIntField(term114880, term114880.getClass(), "playerRating", -488875141);
        setIntField(term114880, term114880.getClass(), "highestRating", 168611945);
        setIntField(term114880, term114880.getClass(), "gradeRank", 1037377774);
        setIntField(term114880, term114880.getClass(), "classRank", 270481103);
        setIntField(term114880, term114880.getClass(), "courseRank", -515394013);
        setField(term114880, term114880.getClass(), "charaSlot", term114945);
        setField(term114880, term114880.getClass(), "charaLockSlot", term114959);
        setLongField(term114880, term114880.getClass(), "contentBit", -275396578570511122L);
        setIntField(term114880, term114880.getClass(), "playCount", 2109927830);
        setField(term114880, term114880.getClass(), "eventWatchedDate", "fyRJvzWMpe");
        setField(term114880, term114880.getClass(), "lastGameId", "KMDtTdvTCJ");
        setField(term114880, term114880.getClass(), "lastRomVersion", "EGFHrFOTWy");
        setField(term114880, term114880.getClass(), "lastDataVersion", "VQLNXTwXTJ");
        setField(term114880, term114880.getClass(), "lastLoginDate", "GZygAttIuk");
        setField(term114880, term114880.getClass(), "lastPlayDate", "WSDrFHxHqO");
        setIntField(term114880, term114880.getClass(), "lastPlayCredit", 145834234);
        setIntField(term114880, term114880.getClass(), "lastPlayMode", -228810962);
        setIntField(term114880, term114880.getClass(), "lastPlaceId", 1375191716);
        setField(term114880, term114880.getClass(), "lastPlaceName", "kbdjWUKDix");
        setIntField(term114880, term114880.getClass(), "lastAllNetId", 740991259);
        setIntField(term114880, term114880.getClass(), "lastRegionId", -592719629);
        setField(term114880, term114880.getClass(), "lastRegionName", "jhXmnsQIUw");
        setField(term114880, term114880.getClass(), "lastClientId", "qTRnuuLERk");
        setField(term114880, term114880.getClass(), "lastCountryCode", "ieCQQDUgWu");
        setIntField(term114880, term114880.getClass(), "lastSelectEMoney", 1432125390);
        setIntField(term114880, term114880.getClass(), "lastSelectTicket", -2117682827);
        setIntField(term114880, term114880.getClass(), "lastSelectCourse", -735213364);
        setIntField(term114880, term114880.getClass(), "lastCountCourse", -1015936088);
        setField(term114880, term114880.getClass(), "firstGameId", "tIHHXpuCOh");
        setField(term114880, term114880.getClass(), "firstRomVersion", "oCLpbAHyax");
        setField(term114880, term114880.getClass(), "firstDataVersion", "nKWQlKSRtt");
        setField(term114880, term114880.getClass(), "firstPlayDate", "PiyYqhsqYA");
        setField(term114880, term114880.getClass(), "compatibleCmVersion", "awpFkVwkVc");
        setField(term114880, term114880.getClass(), "dailyBonusDate", "mfjXySIEmZ");
        setField(term114880, term114880.getClass(), "dailyCourseBonusDate", "IGtYdNRgoQ");
        setField(term114880, term114880.getClass(), "lastPairLoginDate", "bQNBqTrhUF");
        setField(term114880, term114880.getClass(), "lastTrialPlayDate", "pNNhlLiKcO");
        setIntField(term114880, term114880.getClass(), "playVsCount", 653864647);
        setIntField(term114880, term114880.getClass(), "playSyncCount", 43072711);
        setIntField(term114880, term114880.getClass(), "winCount", -1716297843);
        setIntField(term114880, term114880.getClass(), "helpCount", -456659197);
        setIntField(term114880, term114880.getClass(), "comboCount", -765777411);
        setLongField(term114880, term114880.getClass(), "totalDeluxscore", -8062307215635891271L);
        setLongField(term114880, term114880.getClass(), "totalBasicDeluxscore", 4269096919613934136L);
        setLongField(term114880, term114880.getClass(), "totalAdvancedDeluxscore", -2563244893214775249L);
        setLongField(term114880, term114880.getClass(), "totalExpertDeluxscore", 2634037196192273345L);
        setLongField(term114880, term114880.getClass(), "totalMasterDeluxscore", 2205040918557782878L);
        setLongField(term114880, term114880.getClass(), "totalReMasterDeluxscore", 8369727850301838022L);
        setIntField(term114880, term114880.getClass(), "totalSync", -975098081);
        setIntField(term114880, term114880.getClass(), "totalBasicSync", 93863517);
        setIntField(term114880, term114880.getClass(), "totalAdvancedSync", -1434712378);
        setIntField(term114880, term114880.getClass(), "totalExpertSync", -1932255799);
        setIntField(term114880, term114880.getClass(), "totalMasterSync", -178856156);
        setIntField(term114880, term114880.getClass(), "totalReMasterSync", -414924394);
        setLongField(term114880, term114880.getClass(), "totalAchievement", 1683089019175871123L);
        setLongField(term114880, term114880.getClass(), "totalBasicAchievement", -116582168956576769L);
        setLongField(term114880, term114880.getClass(), "totalAdvancedAchievement", -3371877100400482630L);
        setLongField(term114880, term114880.getClass(), "totalExpertAchievement", 3994546230408844547L);
        setLongField(term114880, term114880.getClass(), "totalMasterAchievement", 1481162221525502572L);
        setLongField(term114880, term114880.getClass(), "totalReMasterAchievement", 7397544487121976299L);
        setLongField(term114880, term114880.getClass(), "playerOldRating", -1979212149451637717L);
        setLongField(term114880, term114880.getClass(), "playerNewRating", 7118890039290414390L);
        setIntField(term114880, term114880.getClass(), "banState", 515944055);
        setLongField(term114880, term114880.getClass(), "dateTime", 3568278118244677868L);
        setField(term114878, term114878.getClass(), "user", term114880);
        setIntField(term114878, term114878.getClass(), "rate", 403780056);
        setIntField(term114878, term114878.getClass(), "maxRate", 1834523834);
        setIntField(term114878, term114878.getClass(), "classValue", 399538802);
        setIntField(term114878, term114878.getClass(), "maxClassValue", 293797529);
        setIntField(term114878, term114878.getClass(), "totalWinNum", -2060795821);
        setIntField(term114878, term114878.getClass(), "totalLoseNum", -159511730);
        setIntField(term114878, term114878.getClass(), "maxWinNum", 370898129);
        setIntField(term114878, term114878.getClass(), "maxLoseNum", -970532580);
        setIntField(term114878, term114878.getClass(), "winNum", 869653312);
        setIntField(term114878, term114878.getClass(), "loseNum", 464373107);
        setIntField(term114878, term114878.getClass(), "npcTotalWinNum", -153889480);
        setIntField(term114878, term114878.getClass(), "npcTotalLoseNum", 1435683093);
        setIntField(term114878, term114878.getClass(), "npcMaxWinNum", -1906424793);
        setIntField(term114878, term114878.getClass(), "npcMaxLoseNum", 1262036398);
        setIntField(term114878, term114878.getClass(), "npcWinNum", 1864946460);
        setIntField(term114878, term114878.getClass(), "npcLoseNum", -1209161295);
        term115245 = new Integer(341162488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115245;
        callMethod(klass, "setNpcMaxLoseNum", argTypes, term114878, args);
    }

};


