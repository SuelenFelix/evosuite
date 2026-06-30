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

public class UserDetail_getDailyBonusDate_60346613546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4255580;

    public UserDetail_getDailyBonusDate_60346613546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4255584 = new Long(8040374950080130138L);
        ArrayList term4255645 = new ArrayList();
        Integer term4255651 = new Integer(-663114662);
        Integer term4255653 = new Integer(1816340610);
        Integer term4255655 = new Integer(-2106969244);
        Integer term4255657 = new Integer(1867730492);
        Integer term4255659 = new Integer(2124844100);
        Integer term4255661 = new Integer(23858291);
        Integer term4255663 = new Integer(59541663);
        Integer term4255665 = new Integer(-200802631);
        ArrayList term4255649 = new ArrayList();
        ((ArrayList) term4255649).add(term4255651);
        ((ArrayList) term4255649).add(term4255653);
        ((ArrayList) term4255649).add(term4255655);
        ((ArrayList) term4255649).add(term4255657);
        ((ArrayList) term4255649).add(term4255659);
        ((ArrayList) term4255649).add(term4255661);
        ((ArrayList) term4255649).add(term4255663);
        ((ArrayList) term4255649).add(term4255665);
        term4255580 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4255582 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4255598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4255599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4255603 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4255608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4255609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4255613 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4255580, term4255580.getClass(), "id", 53485632316686239L);
        setLongField(term4255582, term4255582.getClass(), "id", -5922009651793114496L);
        setField(term4255582, term4255582.getClass(), "extId", term4255584);
        setField(term4255582, term4255582.getClass(), "luid", "AdIYrTnqea");
        setIntField(term4255599, term4255599.getClass(), "year", 2015);
        setShortField(term4255599, term4255599.getClass(), "month", (short) 1);
        setShortField(term4255599, term4255599.getClass(), "day", (short) 23);
        setField(term4255598, term4255598.getClass(), "date", term4255599);
        setByteField(term4255603, term4255603.getClass(), "hour", (byte) 13);
        setByteField(term4255603, term4255603.getClass(), "minute", (byte) 12);
        setByteField(term4255603, term4255603.getClass(), "second", (byte) 37);
        setIntField(term4255603, term4255603.getClass(), "nano", 935302079);
        setField(term4255598, term4255598.getClass(), "time", term4255603);
        setField(term4255582, term4255582.getClass(), "registerTime", term4255598);
        setIntField(term4255609, term4255609.getClass(), "year", 2010);
        setShortField(term4255609, term4255609.getClass(), "month", (short) 12);
        setShortField(term4255609, term4255609.getClass(), "day", (short) 10);
        setField(term4255608, term4255608.getClass(), "date", term4255609);
        setByteField(term4255613, term4255613.getClass(), "hour", (byte) 12);
        setByteField(term4255613, term4255613.getClass(), "minute", (byte) 9);
        setByteField(term4255613, term4255613.getClass(), "second", (byte) 26);
        setIntField(term4255613, term4255613.getClass(), "nano", 693594897);
        setField(term4255608, term4255608.getClass(), "time", term4255613);
        setField(term4255582, term4255582.getClass(), "accessTime", term4255608);
        setField(term4255580, term4255580.getClass(), "card", term4255582);
        setField(term4255580, term4255580.getClass(), "userName", "qaCexsPlwe");
        setIntField(term4255580, term4255580.getClass(), "isNetMember", -135815992);
        setIntField(term4255580, term4255580.getClass(), "iconId", 1508398612);
        setIntField(term4255580, term4255580.getClass(), "plateId", 1049646853);
        setIntField(term4255580, term4255580.getClass(), "titleId", -1276441476);
        setIntField(term4255580, term4255580.getClass(), "partnerId", 1205982706);
        setIntField(term4255580, term4255580.getClass(), "frameId", -76052201);
        setIntField(term4255580, term4255580.getClass(), "selectMapId", 311941093);
        setIntField(term4255580, term4255580.getClass(), "totalAwake", 1048380302);
        setIntField(term4255580, term4255580.getClass(), "gradeRating", 327334379);
        setIntField(term4255580, term4255580.getClass(), "musicRating", -88134793);
        setIntField(term4255580, term4255580.getClass(), "playerRating", -2106288721);
        setIntField(term4255580, term4255580.getClass(), "highestRating", 1978760621);
        setIntField(term4255580, term4255580.getClass(), "gradeRank", 1040814523);
        setIntField(term4255580, term4255580.getClass(), "classRank", -663814246);
        setIntField(term4255580, term4255580.getClass(), "courseRank", -1800449478);
        setField(term4255580, term4255580.getClass(), "charaSlot", term4255645);
        setField(term4255580, term4255580.getClass(), "charaLockSlot", term4255649);
        setLongField(term4255580, term4255580.getClass(), "contentBit", -6628519925066999979L);
        setIntField(term4255580, term4255580.getClass(), "playCount", 1878177637);
        setField(term4255580, term4255580.getClass(), "eventWatchedDate", "RObQbAmEqO");
        setField(term4255580, term4255580.getClass(), "lastGameId", "qhIzRhmLSF");
        setField(term4255580, term4255580.getClass(), "lastRomVersion", "ckMfxjRyHk");
        setField(term4255580, term4255580.getClass(), "lastDataVersion", "yVlZmXAXYl");
        setField(term4255580, term4255580.getClass(), "lastLoginDate", "rbrrLHeQTR");
        setField(term4255580, term4255580.getClass(), "lastPlayDate", "xstpfQWsJI");
        setIntField(term4255580, term4255580.getClass(), "lastPlayCredit", 1882572961);
        setIntField(term4255580, term4255580.getClass(), "lastPlayMode", -555818151);
        setIntField(term4255580, term4255580.getClass(), "lastPlaceId", -1261630737);
        setField(term4255580, term4255580.getClass(), "lastPlaceName", "xKfeAkOoub");
        setIntField(term4255580, term4255580.getClass(), "lastAllNetId", -580341751);
        setIntField(term4255580, term4255580.getClass(), "lastRegionId", -999887013);
        setField(term4255580, term4255580.getClass(), "lastRegionName", "qURBLTgdDf");
        setField(term4255580, term4255580.getClass(), "lastClientId", "NfbDiCQZFR");
        setField(term4255580, term4255580.getClass(), "lastCountryCode", "wkGxashVDW");
        setIntField(term4255580, term4255580.getClass(), "lastSelectEMoney", 693062646);
        setIntField(term4255580, term4255580.getClass(), "lastSelectTicket", -1777272913);
        setIntField(term4255580, term4255580.getClass(), "lastSelectCourse", -1807513402);
        setIntField(term4255580, term4255580.getClass(), "lastCountCourse", 1101213604);
        setField(term4255580, term4255580.getClass(), "firstGameId", "WlLNitoLHS");
        setField(term4255580, term4255580.getClass(), "firstRomVersion", "emnzAyKhzI");
        setField(term4255580, term4255580.getClass(), "firstDataVersion", "GlIpEIRECR");
        setField(term4255580, term4255580.getClass(), "firstPlayDate", "NPHwkBgTMC");
        setField(term4255580, term4255580.getClass(), "compatibleCmVersion", "dEtwrJUhZk");
        setField(term4255580, term4255580.getClass(), "dailyBonusDate", "XiZBRfvzhy");
        setField(term4255580, term4255580.getClass(), "dailyCourseBonusDate", "NfwWSAZctO");
        setField(term4255580, term4255580.getClass(), "lastPairLoginDate", "xghqpqbrQA");
        setField(term4255580, term4255580.getClass(), "lastTrialPlayDate", "EfpiCRVaSf");
        setIntField(term4255580, term4255580.getClass(), "playVsCount", -954135218);
        setIntField(term4255580, term4255580.getClass(), "playSyncCount", 186979316);
        setIntField(term4255580, term4255580.getClass(), "winCount", 1923367158);
        setIntField(term4255580, term4255580.getClass(), "helpCount", -1567427586);
        setIntField(term4255580, term4255580.getClass(), "comboCount", 778428490);
        setLongField(term4255580, term4255580.getClass(), "totalDeluxscore", 9162443772531800639L);
        setLongField(term4255580, term4255580.getClass(), "totalBasicDeluxscore", -2291854004219043945L);
        setLongField(term4255580, term4255580.getClass(), "totalAdvancedDeluxscore", 7355090853469757401L);
        setLongField(term4255580, term4255580.getClass(), "totalExpertDeluxscore", 6737723327490957198L);
        setLongField(term4255580, term4255580.getClass(), "totalMasterDeluxscore", -352692572036705716L);
        setLongField(term4255580, term4255580.getClass(), "totalReMasterDeluxscore", -828421085694644153L);
        setIntField(term4255580, term4255580.getClass(), "totalSync", 828347957);
        setIntField(term4255580, term4255580.getClass(), "totalBasicSync", -52141135);
        setIntField(term4255580, term4255580.getClass(), "totalAdvancedSync", -517421135);
        setIntField(term4255580, term4255580.getClass(), "totalExpertSync", -2125570917);
        setIntField(term4255580, term4255580.getClass(), "totalMasterSync", 417200527);
        setIntField(term4255580, term4255580.getClass(), "totalReMasterSync", 1458731690);
        setLongField(term4255580, term4255580.getClass(), "totalAchievement", 4453481216530153487L);
        setLongField(term4255580, term4255580.getClass(), "totalBasicAchievement", -3754080519167061394L);
        setLongField(term4255580, term4255580.getClass(), "totalAdvancedAchievement", -4372740744196209543L);
        setLongField(term4255580, term4255580.getClass(), "totalExpertAchievement", 9016362617401744475L);
        setLongField(term4255580, term4255580.getClass(), "totalMasterAchievement", -4305654234915459229L);
        setLongField(term4255580, term4255580.getClass(), "totalReMasterAchievement", -2449222493745085358L);
        setLongField(term4255580, term4255580.getClass(), "playerOldRating", 1423823335724114699L);
        setLongField(term4255580, term4255580.getClass(), "playerNewRating", 8600967688457128710L);
        setIntField(term4255580, term4255580.getClass(), "banState", 630764306);
        setLongField(term4255580, term4255580.getClass(), "dateTime", 7098307398986411067L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyBonusDate", argTypes, term4255580, args);
    }

};


