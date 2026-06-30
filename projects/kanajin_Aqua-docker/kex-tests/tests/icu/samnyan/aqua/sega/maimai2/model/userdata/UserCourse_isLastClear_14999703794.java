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

public class UserCourse_isLastClear_14999703794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73448;

    public UserCourse_isLastClear_14999703794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73454 = new Long(-4822736661741380518L);
        Integer term73517 = new Integer(-1264595049);
        ArrayList term73515 = new ArrayList();
        ((ArrayList) term73515).add(term73517);
        Integer term73523 = new Integer(-2058884635);
        ArrayList term73521 = new ArrayList();
        ((ArrayList) term73521).add(term73523);
        term73448 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term73450 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term73452 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73448, term73448.getClass(), "id", -6952791032114194905L);
        setLongField(term73450, term73450.getClass(), "id", -2341380687381948599L);
        setLongField(term73452, term73452.getClass(), "id", -7871012741246584386L);
        setField(term73452, term73452.getClass(), "extId", term73454);
        setField(term73452, term73452.getClass(), "luid", "XLjtkfroHJ");
        setIntField(term73469, term73469.getClass(), "year", 2016);
        setShortField(term73469, term73469.getClass(), "month", (short) 4);
        setShortField(term73469, term73469.getClass(), "day", (short) 23);
        setField(term73468, term73468.getClass(), "date", term73469);
        setByteField(term73473, term73473.getClass(), "hour", (byte) 13);
        setByteField(term73473, term73473.getClass(), "minute", (byte) 34);
        setByteField(term73473, term73473.getClass(), "second", (byte) 22);
        setIntField(term73473, term73473.getClass(), "nano", 20103660);
        setField(term73468, term73468.getClass(), "time", term73473);
        setField(term73452, term73452.getClass(), "registerTime", term73468);
        setIntField(term73479, term73479.getClass(), "year", 2023);
        setShortField(term73479, term73479.getClass(), "month", (short) 1);
        setShortField(term73479, term73479.getClass(), "day", (short) 24);
        setField(term73478, term73478.getClass(), "date", term73479);
        setByteField(term73483, term73483.getClass(), "hour", (byte) 10);
        setByteField(term73483, term73483.getClass(), "minute", (byte) 26);
        setByteField(term73483, term73483.getClass(), "second", (byte) 14);
        setIntField(term73483, term73483.getClass(), "nano", 736807866);
        setField(term73478, term73478.getClass(), "time", term73483);
        setField(term73452, term73452.getClass(), "accessTime", term73478);
        setField(term73450, term73450.getClass(), "card", term73452);
        setField(term73450, term73450.getClass(), "userName", "hdqypaATat");
        setIntField(term73450, term73450.getClass(), "isNetMember", -866061427);
        setIntField(term73450, term73450.getClass(), "iconId", 1628734156);
        setIntField(term73450, term73450.getClass(), "plateId", -578890556);
        setIntField(term73450, term73450.getClass(), "titleId", 2129122634);
        setIntField(term73450, term73450.getClass(), "partnerId", 382196976);
        setIntField(term73450, term73450.getClass(), "frameId", 506884160);
        setIntField(term73450, term73450.getClass(), "selectMapId", 347846893);
        setIntField(term73450, term73450.getClass(), "totalAwake", -1522343998);
        setIntField(term73450, term73450.getClass(), "gradeRating", -514980586);
        setIntField(term73450, term73450.getClass(), "musicRating", 1857474216);
        setIntField(term73450, term73450.getClass(), "playerRating", -53071149);
        setIntField(term73450, term73450.getClass(), "highestRating", -2041534507);
        setIntField(term73450, term73450.getClass(), "gradeRank", 2090333247);
        setIntField(term73450, term73450.getClass(), "classRank", 1612944193);
        setIntField(term73450, term73450.getClass(), "courseRank", 1274552070);
        setField(term73450, term73450.getClass(), "charaSlot", term73515);
        setField(term73450, term73450.getClass(), "charaLockSlot", term73521);
        setLongField(term73450, term73450.getClass(), "contentBit", 4814035531351879181L);
        setIntField(term73450, term73450.getClass(), "playCount", 701800239);
        setField(term73450, term73450.getClass(), "eventWatchedDate", "yXrHDHEipD");
        setField(term73450, term73450.getClass(), "lastGameId", "pbqIeikQzp");
        setField(term73450, term73450.getClass(), "lastRomVersion", "baLJgqNNUx");
        setField(term73450, term73450.getClass(), "lastDataVersion", "GlPSGqVaBj");
        setField(term73450, term73450.getClass(), "lastLoginDate", "jieMNXAAbL");
        setField(term73450, term73450.getClass(), "lastPlayDate", "NbmTxmqOjh");
        setIntField(term73450, term73450.getClass(), "lastPlayCredit", -1208601938);
        setIntField(term73450, term73450.getClass(), "lastPlayMode", -1949786069);
        setIntField(term73450, term73450.getClass(), "lastPlaceId", -1357939737);
        setField(term73450, term73450.getClass(), "lastPlaceName", "rLDmBbcLaC");
        setIntField(term73450, term73450.getClass(), "lastAllNetId", 1032926922);
        setIntField(term73450, term73450.getClass(), "lastRegionId", -478839397);
        setField(term73450, term73450.getClass(), "lastRegionName", "tUKcXglBlG");
        setField(term73450, term73450.getClass(), "lastClientId", "ZGptycjjRq");
        setField(term73450, term73450.getClass(), "lastCountryCode", "kXJaxapFer");
        setIntField(term73450, term73450.getClass(), "lastSelectEMoney", -266762167);
        setIntField(term73450, term73450.getClass(), "lastSelectTicket", -1341806138);
        setIntField(term73450, term73450.getClass(), "lastSelectCourse", 684728176);
        setIntField(term73450, term73450.getClass(), "lastCountCourse", 2089342829);
        setField(term73450, term73450.getClass(), "firstGameId", "OEeAVwVwuj");
        setField(term73450, term73450.getClass(), "firstRomVersion", "WEgFuDZsxi");
        setField(term73450, term73450.getClass(), "firstDataVersion", "kvcaSGNTHd");
        setField(term73450, term73450.getClass(), "firstPlayDate", "opXkGeBDoI");
        setField(term73450, term73450.getClass(), "compatibleCmVersion", "UHxidCtatV");
        setField(term73450, term73450.getClass(), "dailyBonusDate", "LRzADDSjVT");
        setField(term73450, term73450.getClass(), "dailyCourseBonusDate", "lpFCMaAYxj");
        setField(term73450, term73450.getClass(), "lastPairLoginDate", "fzHVMNSLii");
        setField(term73450, term73450.getClass(), "lastTrialPlayDate", "TxymnVINZF");
        setIntField(term73450, term73450.getClass(), "playVsCount", 1201220971);
        setIntField(term73450, term73450.getClass(), "playSyncCount", -811460564);
        setIntField(term73450, term73450.getClass(), "winCount", 1527746173);
        setIntField(term73450, term73450.getClass(), "helpCount", -1236801752);
        setIntField(term73450, term73450.getClass(), "comboCount", -1407542097);
        setLongField(term73450, term73450.getClass(), "totalDeluxscore", 1939660974143295045L);
        setLongField(term73450, term73450.getClass(), "totalBasicDeluxscore", -2240386714187527144L);
        setLongField(term73450, term73450.getClass(), "totalAdvancedDeluxscore", 3524743556565317852L);
        setLongField(term73450, term73450.getClass(), "totalExpertDeluxscore", -6550059544186211121L);
        setLongField(term73450, term73450.getClass(), "totalMasterDeluxscore", -3035941748055157425L);
        setLongField(term73450, term73450.getClass(), "totalReMasterDeluxscore", 4511007950410890732L);
        setIntField(term73450, term73450.getClass(), "totalSync", 844756084);
        setIntField(term73450, term73450.getClass(), "totalBasicSync", -1078424855);
        setIntField(term73450, term73450.getClass(), "totalAdvancedSync", -17867996);
        setIntField(term73450, term73450.getClass(), "totalExpertSync", -586625757);
        setIntField(term73450, term73450.getClass(), "totalMasterSync", -111956576);
        setIntField(term73450, term73450.getClass(), "totalReMasterSync", 746489478);
        setLongField(term73450, term73450.getClass(), "totalAchievement", 4662333912633380472L);
        setLongField(term73450, term73450.getClass(), "totalBasicAchievement", 6951012907724798081L);
        setLongField(term73450, term73450.getClass(), "totalAdvancedAchievement", 1454269751791376609L);
        setLongField(term73450, term73450.getClass(), "totalExpertAchievement", 2124910767108105788L);
        setLongField(term73450, term73450.getClass(), "totalMasterAchievement", 7080612204208157613L);
        setLongField(term73450, term73450.getClass(), "totalReMasterAchievement", -5251321271779688724L);
        setLongField(term73450, term73450.getClass(), "playerOldRating", -2563454768051334217L);
        setLongField(term73450, term73450.getClass(), "playerNewRating", -5735822732056753596L);
        setIntField(term73450, term73450.getClass(), "banState", 620249855);
        setLongField(term73450, term73450.getClass(), "dateTime", 8187221303948483835L);
        setField(term73448, term73448.getClass(), "user", term73450);
        setIntField(term73448, term73448.getClass(), "courseId", -1978063697);
        setBooleanField(term73448, term73448.getClass(), "isLastClear", true);
        setIntField(term73448, term73448.getClass(), "totalRestlife", -1375837847);
        setIntField(term73448, term73448.getClass(), "totalAchievement", 591972229);
        setIntField(term73448, term73448.getClass(), "totalDeluxscore", 1509332180);
        setIntField(term73448, term73448.getClass(), "playCount", 1537664818);
        setField(term73448, term73448.getClass(), "clearDate", "fkBfmixBEh");
        setField(term73448, term73448.getClass(), "lastPlayDate", "SWbairdDKL");
        setIntField(term73448, term73448.getClass(), "bestAchievement", -1542814057);
        setField(term73448, term73448.getClass(), "bestAchievementDate", "AibUFEALwF");
        setIntField(term73448, term73448.getClass(), "bestDeluxscore", -813013442);
        setField(term73448, term73448.getClass(), "bestDeluxscoreDate", "eXOUrXTrdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLastClear", argTypes, term73448, args);
    }

};


