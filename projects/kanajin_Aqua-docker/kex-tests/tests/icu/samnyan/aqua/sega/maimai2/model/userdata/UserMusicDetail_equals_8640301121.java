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

public class UserMusicDetail_equals_8640301121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67693;
     Object term68064;

    public UserMusicDetail_equals_8640301121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67699 = new Long(-3936701866695933852L);
        Integer term67762 = new Integer(805176809);
        Integer term67764 = new Integer(-82632953);
        Integer term67766 = new Integer(-1473876284);
        Integer term67768 = new Integer(-1389314671);
        ArrayList term67760 = new ArrayList();
        ((ArrayList) term67760).add(term67762);
        ((ArrayList) term67760).add(term67764);
        ((ArrayList) term67760).add(term67766);
        ((ArrayList) term67760).add(term67768);
        Integer term67774 = new Integer(-499699841);
        Integer term67776 = new Integer(360972386);
        Integer term67778 = new Integer(-2063884849);
        Integer term67780 = new Integer(1054887169);
        Integer term67782 = new Integer(692873905);
        Integer term67784 = new Integer(1734759369);
        Integer term67786 = new Integer(1841493736);
        ArrayList term67772 = new ArrayList();
        ((ArrayList) term67772).add(term67774);
        ((ArrayList) term67772).add(term67776);
        ((ArrayList) term67772).add(term67778);
        ((ArrayList) term67772).add(term67780);
        ((ArrayList) term67772).add(term67782);
        ((ArrayList) term67772).add(term67784);
        ((ArrayList) term67772).add(term67786);
        term67693 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term67695 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term67697 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67718 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67728 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67693, term67693.getClass(), "id", -6799265768469176623L);
        setLongField(term67695, term67695.getClass(), "id", -6960323426014178409L);
        setLongField(term67697, term67697.getClass(), "id", 5254427735699890849L);
        setField(term67697, term67697.getClass(), "extId", term67699);
        setField(term67697, term67697.getClass(), "luid", "WXUKmhwFsK");
        setIntField(term67714, term67714.getClass(), "year", 2010);
        setShortField(term67714, term67714.getClass(), "month", (short) 9);
        setShortField(term67714, term67714.getClass(), "day", (short) 20);
        setField(term67713, term67713.getClass(), "date", term67714);
        setByteField(term67718, term67718.getClass(), "hour", (byte) 3);
        setByteField(term67718, term67718.getClass(), "minute", (byte) 41);
        setByteField(term67718, term67718.getClass(), "second", (byte) 7);
        setIntField(term67718, term67718.getClass(), "nano", 796515800);
        setField(term67713, term67713.getClass(), "time", term67718);
        setField(term67697, term67697.getClass(), "registerTime", term67713);
        setIntField(term67724, term67724.getClass(), "year", 2015);
        setShortField(term67724, term67724.getClass(), "month", (short) 10);
        setShortField(term67724, term67724.getClass(), "day", (short) 2);
        setField(term67723, term67723.getClass(), "date", term67724);
        setByteField(term67728, term67728.getClass(), "hour", (byte) 21);
        setByteField(term67728, term67728.getClass(), "minute", (byte) 18);
        setByteField(term67728, term67728.getClass(), "second", (byte) 42);
        setIntField(term67728, term67728.getClass(), "nano", 185569616);
        setField(term67723, term67723.getClass(), "time", term67728);
        setField(term67697, term67697.getClass(), "accessTime", term67723);
        setField(term67695, term67695.getClass(), "card", term67697);
        setField(term67695, term67695.getClass(), "userName", "OcfokBTzZZ");
        setIntField(term67695, term67695.getClass(), "isNetMember", 199979610);
        setIntField(term67695, term67695.getClass(), "iconId", -605796164);
        setIntField(term67695, term67695.getClass(), "plateId", -931072478);
        setIntField(term67695, term67695.getClass(), "titleId", 2032311568);
        setIntField(term67695, term67695.getClass(), "partnerId", 92598850);
        setIntField(term67695, term67695.getClass(), "frameId", 1856498878);
        setIntField(term67695, term67695.getClass(), "selectMapId", 274237632);
        setIntField(term67695, term67695.getClass(), "totalAwake", -1033663489);
        setIntField(term67695, term67695.getClass(), "gradeRating", 476488543);
        setIntField(term67695, term67695.getClass(), "musicRating", -1626915417);
        setIntField(term67695, term67695.getClass(), "playerRating", 665442653);
        setIntField(term67695, term67695.getClass(), "highestRating", 803178808);
        setIntField(term67695, term67695.getClass(), "gradeRank", 1767729920);
        setIntField(term67695, term67695.getClass(), "classRank", -154656640);
        setIntField(term67695, term67695.getClass(), "courseRank", 638814614);
        setField(term67695, term67695.getClass(), "charaSlot", term67760);
        setField(term67695, term67695.getClass(), "charaLockSlot", term67772);
        setLongField(term67695, term67695.getClass(), "contentBit", -2981899957757551501L);
        setIntField(term67695, term67695.getClass(), "playCount", 832395207);
        setField(term67695, term67695.getClass(), "eventWatchedDate", "zeBhlhyhkL");
        setField(term67695, term67695.getClass(), "lastGameId", "PxinRhWgwT");
        setField(term67695, term67695.getClass(), "lastRomVersion", "pZcEKUNIXL");
        setField(term67695, term67695.getClass(), "lastDataVersion", "QbRtvZIDtW");
        setField(term67695, term67695.getClass(), "lastLoginDate", "fbsmDvjMqr");
        setField(term67695, term67695.getClass(), "lastPlayDate", "tycssGWZvU");
        setIntField(term67695, term67695.getClass(), "lastPlayCredit", 1161114638);
        setIntField(term67695, term67695.getClass(), "lastPlayMode", -1391162351);
        setIntField(term67695, term67695.getClass(), "lastPlaceId", 863863650);
        setField(term67695, term67695.getClass(), "lastPlaceName", "jcvrILwbgt");
        setIntField(term67695, term67695.getClass(), "lastAllNetId", 326665488);
        setIntField(term67695, term67695.getClass(), "lastRegionId", -556521634);
        setField(term67695, term67695.getClass(), "lastRegionName", "AphrAHzPMC");
        setField(term67695, term67695.getClass(), "lastClientId", "iwismCnYjB");
        setField(term67695, term67695.getClass(), "lastCountryCode", "GerBZdiruT");
        setIntField(term67695, term67695.getClass(), "lastSelectEMoney", -904069976);
        setIntField(term67695, term67695.getClass(), "lastSelectTicket", 1492540298);
        setIntField(term67695, term67695.getClass(), "lastSelectCourse", 751340602);
        setIntField(term67695, term67695.getClass(), "lastCountCourse", 123770182);
        setField(term67695, term67695.getClass(), "firstGameId", "VzkPDPPGQl");
        setField(term67695, term67695.getClass(), "firstRomVersion", "iojOXjfZFr");
        setField(term67695, term67695.getClass(), "firstDataVersion", "yyrkuIYJKj");
        setField(term67695, term67695.getClass(), "firstPlayDate", "reGIMbnrGF");
        setField(term67695, term67695.getClass(), "compatibleCmVersion", "yquSngBHqd");
        setField(term67695, term67695.getClass(), "dailyBonusDate", "ZSdaJkZZPm");
        setField(term67695, term67695.getClass(), "dailyCourseBonusDate", "ICnzwgujDT");
        setField(term67695, term67695.getClass(), "lastPairLoginDate", "RfDgUkIYjW");
        setField(term67695, term67695.getClass(), "lastTrialPlayDate", "QnZKCwkmMh");
        setIntField(term67695, term67695.getClass(), "playVsCount", -813178856);
        setIntField(term67695, term67695.getClass(), "playSyncCount", 1591732055);
        setIntField(term67695, term67695.getClass(), "winCount", -1580446775);
        setIntField(term67695, term67695.getClass(), "helpCount", -1008507790);
        setIntField(term67695, term67695.getClass(), "comboCount", -1382203900);
        setLongField(term67695, term67695.getClass(), "totalDeluxscore", -3796499281571450784L);
        setLongField(term67695, term67695.getClass(), "totalBasicDeluxscore", 2856654200900890130L);
        setLongField(term67695, term67695.getClass(), "totalAdvancedDeluxscore", 2362710323589009829L);
        setLongField(term67695, term67695.getClass(), "totalExpertDeluxscore", -1353104097704898755L);
        setLongField(term67695, term67695.getClass(), "totalMasterDeluxscore", 1331926449821360443L);
        setLongField(term67695, term67695.getClass(), "totalReMasterDeluxscore", 38842281830560892L);
        setIntField(term67695, term67695.getClass(), "totalSync", -2140997236);
        setIntField(term67695, term67695.getClass(), "totalBasicSync", -1868254835);
        setIntField(term67695, term67695.getClass(), "totalAdvancedSync", -660465161);
        setIntField(term67695, term67695.getClass(), "totalExpertSync", -967958435);
        setIntField(term67695, term67695.getClass(), "totalMasterSync", 791509654);
        setIntField(term67695, term67695.getClass(), "totalReMasterSync", -1695301446);
        setLongField(term67695, term67695.getClass(), "totalAchievement", 2485168218246856776L);
        setLongField(term67695, term67695.getClass(), "totalBasicAchievement", 7984812876118160348L);
        setLongField(term67695, term67695.getClass(), "totalAdvancedAchievement", -234963564219631183L);
        setLongField(term67695, term67695.getClass(), "totalExpertAchievement", 3148960129338863858L);
        setLongField(term67695, term67695.getClass(), "totalMasterAchievement", 8567007307199068093L);
        setLongField(term67695, term67695.getClass(), "totalReMasterAchievement", 8125394137486820640L);
        setLongField(term67695, term67695.getClass(), "playerOldRating", -3034337124103524360L);
        setLongField(term67695, term67695.getClass(), "playerNewRating", 7703860081138133014L);
        setIntField(term67695, term67695.getClass(), "banState", 579391144);
        setLongField(term67695, term67695.getClass(), "dateTime", -5836140469306562215L);
        setField(term67693, term67693.getClass(), "user", term67695);
        setIntField(term67693, term67693.getClass(), "musicId", 858488872);
        setIntField(term67693, term67693.getClass(), "level", -218279934);
        setIntField(term67693, term67693.getClass(), "playCount", -689744296);
        setIntField(term67693, term67693.getClass(), "achievement", 263038376);
        setIntField(term67693, term67693.getClass(), "comboStatus", -631719292);
        setIntField(term67693, term67693.getClass(), "syncStatus", -2119317714);
        setIntField(term67693, term67693.getClass(), "deluxscoreMax", -1867952163);
        setIntField(term67693, term67693.getClass(), "scoreRank", -1770219455);
        term68064 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68064;
        callMethod(klass, "equals", argTypes, term67693, args);
    }

};


