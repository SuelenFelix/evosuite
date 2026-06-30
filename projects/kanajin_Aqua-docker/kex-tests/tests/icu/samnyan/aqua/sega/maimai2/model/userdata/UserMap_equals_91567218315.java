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

public class UserMap_equals_91567218315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582455;
     Object term582813;

    public UserMap_equals_91567218315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term582461 = new Long(-6344058468200613078L);
        Integer term582524 = new Integer(1944258008);
        ArrayList term582522 = new ArrayList();
        ((ArrayList) term582522).add(term582524);
        Integer term582530 = new Integer(-1292525809);
        Integer term582532 = new Integer(-642577507);
        Integer term582534 = new Integer(1430669401);
        Integer term582536 = new Integer(-39090052);
        Integer term582538 = new Integer(-1893438887);
        ArrayList term582528 = new ArrayList();
        ((ArrayList) term582528).add(term582530);
        ((ArrayList) term582528).add(term582532);
        ((ArrayList) term582528).add(term582534);
        ((ArrayList) term582528).add(term582536);
        ((ArrayList) term582528).add(term582538);
        term582455 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term582457 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term582459 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term582475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term582476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term582480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term582485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term582486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term582490 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term582455, term582455.getClass(), "id", -8336226077622940639L);
        setLongField(term582457, term582457.getClass(), "id", -1645888491108291487L);
        setLongField(term582459, term582459.getClass(), "id", 647195020536982296L);
        setField(term582459, term582459.getClass(), "extId", term582461);
        setField(term582459, term582459.getClass(), "luid", "qDoNyxUSpb");
        setIntField(term582476, term582476.getClass(), "year", 2027);
        setShortField(term582476, term582476.getClass(), "month", (short) 9);
        setShortField(term582476, term582476.getClass(), "day", (short) 8);
        setField(term582475, term582475.getClass(), "date", term582476);
        setByteField(term582480, term582480.getClass(), "hour", (byte) 1);
        setByteField(term582480, term582480.getClass(), "minute", (byte) 31);
        setByteField(term582480, term582480.getClass(), "second", (byte) 26);
        setIntField(term582480, term582480.getClass(), "nano", 866365204);
        setField(term582475, term582475.getClass(), "time", term582480);
        setField(term582459, term582459.getClass(), "registerTime", term582475);
        setIntField(term582486, term582486.getClass(), "year", 2028);
        setShortField(term582486, term582486.getClass(), "month", (short) 8);
        setShortField(term582486, term582486.getClass(), "day", (short) 6);
        setField(term582485, term582485.getClass(), "date", term582486);
        setByteField(term582490, term582490.getClass(), "hour", (byte) 14);
        setByteField(term582490, term582490.getClass(), "minute", (byte) 40);
        setByteField(term582490, term582490.getClass(), "second", (byte) 5);
        setIntField(term582490, term582490.getClass(), "nano", 121134357);
        setField(term582485, term582485.getClass(), "time", term582490);
        setField(term582459, term582459.getClass(), "accessTime", term582485);
        setField(term582457, term582457.getClass(), "card", term582459);
        setField(term582457, term582457.getClass(), "userName", "qiAYNwcUYr");
        setIntField(term582457, term582457.getClass(), "isNetMember", 1927478966);
        setIntField(term582457, term582457.getClass(), "iconId", 255716776);
        setIntField(term582457, term582457.getClass(), "plateId", -1443171414);
        setIntField(term582457, term582457.getClass(), "titleId", 2078198606);
        setIntField(term582457, term582457.getClass(), "partnerId", -1394876077);
        setIntField(term582457, term582457.getClass(), "frameId", -1542188335);
        setIntField(term582457, term582457.getClass(), "selectMapId", 544155129);
        setIntField(term582457, term582457.getClass(), "totalAwake", -1504298622);
        setIntField(term582457, term582457.getClass(), "gradeRating", 742108852);
        setIntField(term582457, term582457.getClass(), "musicRating", -1760418084);
        setIntField(term582457, term582457.getClass(), "playerRating", 1938399897);
        setIntField(term582457, term582457.getClass(), "highestRating", -2102599311);
        setIntField(term582457, term582457.getClass(), "gradeRank", -768654989);
        setIntField(term582457, term582457.getClass(), "classRank", 177370762);
        setIntField(term582457, term582457.getClass(), "courseRank", 1076335352);
        setField(term582457, term582457.getClass(), "charaSlot", term582522);
        setField(term582457, term582457.getClass(), "charaLockSlot", term582528);
        setLongField(term582457, term582457.getClass(), "contentBit", 5068515394034740380L);
        setIntField(term582457, term582457.getClass(), "playCount", -183805107);
        setField(term582457, term582457.getClass(), "eventWatchedDate", "IfGGdhCDGO");
        setField(term582457, term582457.getClass(), "lastGameId", "ecmlOajGhh");
        setField(term582457, term582457.getClass(), "lastRomVersion", "UlPyTLZwRX");
        setField(term582457, term582457.getClass(), "lastDataVersion", "FQbCGoUXxT");
        setField(term582457, term582457.getClass(), "lastLoginDate", "FDfDdawdVP");
        setField(term582457, term582457.getClass(), "lastPlayDate", "gqDSFscakf");
        setIntField(term582457, term582457.getClass(), "lastPlayCredit", -1049341537);
        setIntField(term582457, term582457.getClass(), "lastPlayMode", 655939447);
        setIntField(term582457, term582457.getClass(), "lastPlaceId", -510684031);
        setField(term582457, term582457.getClass(), "lastPlaceName", "PbBGPimdIY");
        setIntField(term582457, term582457.getClass(), "lastAllNetId", 443800802);
        setIntField(term582457, term582457.getClass(), "lastRegionId", 27864547);
        setField(term582457, term582457.getClass(), "lastRegionName", "nIlFVAfpuy");
        setField(term582457, term582457.getClass(), "lastClientId", "qmGujqgpwN");
        setField(term582457, term582457.getClass(), "lastCountryCode", "OaLfqTmyaT");
        setIntField(term582457, term582457.getClass(), "lastSelectEMoney", 701158510);
        setIntField(term582457, term582457.getClass(), "lastSelectTicket", 1205866597);
        setIntField(term582457, term582457.getClass(), "lastSelectCourse", -1723355124);
        setIntField(term582457, term582457.getClass(), "lastCountCourse", 2071749351);
        setField(term582457, term582457.getClass(), "firstGameId", "gyQOnGttev");
        setField(term582457, term582457.getClass(), "firstRomVersion", "YVtBSvfWro");
        setField(term582457, term582457.getClass(), "firstDataVersion", "wIwnNHNsug");
        setField(term582457, term582457.getClass(), "firstPlayDate", "fyClIZCYOI");
        setField(term582457, term582457.getClass(), "compatibleCmVersion", "sglNGrsvca");
        setField(term582457, term582457.getClass(), "dailyBonusDate", "knrXFgMJip");
        setField(term582457, term582457.getClass(), "dailyCourseBonusDate", "tTUArWzUOh");
        setField(term582457, term582457.getClass(), "lastPairLoginDate", "FsVzzDFYtV");
        setField(term582457, term582457.getClass(), "lastTrialPlayDate", "GtqERCGlRm");
        setIntField(term582457, term582457.getClass(), "playVsCount", -1655846152);
        setIntField(term582457, term582457.getClass(), "playSyncCount", 1503972254);
        setIntField(term582457, term582457.getClass(), "winCount", -922149784);
        setIntField(term582457, term582457.getClass(), "helpCount", -1473973002);
        setIntField(term582457, term582457.getClass(), "comboCount", 1861275190);
        setLongField(term582457, term582457.getClass(), "totalDeluxscore", -146550835030644060L);
        setLongField(term582457, term582457.getClass(), "totalBasicDeluxscore", 1164838802167935427L);
        setLongField(term582457, term582457.getClass(), "totalAdvancedDeluxscore", 6705015082395602463L);
        setLongField(term582457, term582457.getClass(), "totalExpertDeluxscore", 7674209554584626132L);
        setLongField(term582457, term582457.getClass(), "totalMasterDeluxscore", -4925112132814370394L);
        setLongField(term582457, term582457.getClass(), "totalReMasterDeluxscore", 8075343440807805171L);
        setIntField(term582457, term582457.getClass(), "totalSync", -1947798736);
        setIntField(term582457, term582457.getClass(), "totalBasicSync", 585480270);
        setIntField(term582457, term582457.getClass(), "totalAdvancedSync", -101576736);
        setIntField(term582457, term582457.getClass(), "totalExpertSync", 1779524336);
        setIntField(term582457, term582457.getClass(), "totalMasterSync", -1485100879);
        setIntField(term582457, term582457.getClass(), "totalReMasterSync", 1692423422);
        setLongField(term582457, term582457.getClass(), "totalAchievement", 166208065239213052L);
        setLongField(term582457, term582457.getClass(), "totalBasicAchievement", -3308852732197049349L);
        setLongField(term582457, term582457.getClass(), "totalAdvancedAchievement", -6997282881773808979L);
        setLongField(term582457, term582457.getClass(), "totalExpertAchievement", 6955864670593670965L);
        setLongField(term582457, term582457.getClass(), "totalMasterAchievement", -7721472394006203274L);
        setLongField(term582457, term582457.getClass(), "totalReMasterAchievement", -7806899821019363482L);
        setLongField(term582457, term582457.getClass(), "playerOldRating", 5100771697908518372L);
        setLongField(term582457, term582457.getClass(), "playerNewRating", 8610769641740798734L);
        setIntField(term582457, term582457.getClass(), "banState", 1464553761);
        setLongField(term582457, term582457.getClass(), "dateTime", 8864846810750676026L);
        setField(term582455, term582455.getClass(), "user", term582457);
        setIntField(term582455, term582455.getClass(), "mapId", 1795647725);
        setIntField(term582455, term582455.getClass(), "distance", 1552241420);
        setBooleanField(term582455, term582455.getClass(), "isLock", false);
        setBooleanField(term582455, term582455.getClass(), "isClear", false);
        setBooleanField(term582455, term582455.getClass(), "isComplete", true);
        term582813 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term582813;
        callMethod(klass, "equals", argTypes, term582455, args);
    }

};


