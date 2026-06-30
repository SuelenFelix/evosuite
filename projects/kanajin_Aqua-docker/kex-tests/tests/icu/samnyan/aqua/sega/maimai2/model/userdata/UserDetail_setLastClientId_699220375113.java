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

public class UserDetail_setLastClientId_699220375113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259283;

    public UserDetail_setLastClientId_699220375113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term259287 = new Long(-9168517519350392654L);
        Integer term259350 = new Integer(1085224973);
        Integer term259352 = new Integer(580824436);
        Integer term259354 = new Integer(400588448);
        Integer term259356 = new Integer(-798151545);
        ArrayList term259348 = new ArrayList();
        ((ArrayList) term259348).add(term259350);
        ((ArrayList) term259348).add(term259352);
        ((ArrayList) term259348).add(term259354);
        ((ArrayList) term259348).add(term259356);
        Integer term259362 = new Integer(-243386399);
        Integer term259364 = new Integer(1238856040);
        ArrayList term259360 = new ArrayList();
        ((ArrayList) term259360).add(term259362);
        ((ArrayList) term259360).add(term259364);
        term259283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term259285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term259301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term259283, term259283.getClass(), "id", 7963191089490625391L);
        setLongField(term259285, term259285.getClass(), "id", 769015120300273114L);
        setField(term259285, term259285.getClass(), "extId", term259287);
        setField(term259285, term259285.getClass(), "luid", "foaQZmXMHo");
        setIntField(term259302, term259302.getClass(), "year", 2012);
        setShortField(term259302, term259302.getClass(), "month", (short) 10);
        setShortField(term259302, term259302.getClass(), "day", (short) 1);
        setField(term259301, term259301.getClass(), "date", term259302);
        setByteField(term259306, term259306.getClass(), "hour", (byte) 19);
        setByteField(term259306, term259306.getClass(), "minute", (byte) 43);
        setByteField(term259306, term259306.getClass(), "second", (byte) 49);
        setIntField(term259306, term259306.getClass(), "nano", 81513180);
        setField(term259301, term259301.getClass(), "time", term259306);
        setField(term259285, term259285.getClass(), "registerTime", term259301);
        setIntField(term259312, term259312.getClass(), "year", 2028);
        setShortField(term259312, term259312.getClass(), "month", (short) 2);
        setShortField(term259312, term259312.getClass(), "day", (short) 2);
        setField(term259311, term259311.getClass(), "date", term259312);
        setByteField(term259316, term259316.getClass(), "hour", (byte) 17);
        setByteField(term259316, term259316.getClass(), "minute", (byte) 55);
        setByteField(term259316, term259316.getClass(), "second", (byte) 40);
        setIntField(term259316, term259316.getClass(), "nano", 907692691);
        setField(term259311, term259311.getClass(), "time", term259316);
        setField(term259285, term259285.getClass(), "accessTime", term259311);
        setField(term259283, term259283.getClass(), "card", term259285);
        setField(term259283, term259283.getClass(), "userName", "BTiRFFuMmf");
        setIntField(term259283, term259283.getClass(), "isNetMember", 1700003880);
        setIntField(term259283, term259283.getClass(), "iconId", 1479107053);
        setIntField(term259283, term259283.getClass(), "plateId", -1251439328);
        setIntField(term259283, term259283.getClass(), "titleId", 1798785752);
        setIntField(term259283, term259283.getClass(), "partnerId", 195739943);
        setIntField(term259283, term259283.getClass(), "frameId", 594364543);
        setIntField(term259283, term259283.getClass(), "selectMapId", 401266476);
        setIntField(term259283, term259283.getClass(), "totalAwake", -1352592419);
        setIntField(term259283, term259283.getClass(), "gradeRating", -1352699741);
        setIntField(term259283, term259283.getClass(), "musicRating", 1775677389);
        setIntField(term259283, term259283.getClass(), "playerRating", 781977367);
        setIntField(term259283, term259283.getClass(), "highestRating", 1734793666);
        setIntField(term259283, term259283.getClass(), "gradeRank", -2143217889);
        setIntField(term259283, term259283.getClass(), "classRank", -2098845580);
        setIntField(term259283, term259283.getClass(), "courseRank", 2130134973);
        setField(term259283, term259283.getClass(), "charaSlot", term259348);
        setField(term259283, term259283.getClass(), "charaLockSlot", term259360);
        setLongField(term259283, term259283.getClass(), "contentBit", -3283802672481131163L);
        setIntField(term259283, term259283.getClass(), "playCount", -503344387);
        setField(term259283, term259283.getClass(), "eventWatchedDate", "eUQNprkBYk");
        setField(term259283, term259283.getClass(), "lastGameId", "RCWgKGfqgy");
        setField(term259283, term259283.getClass(), "lastRomVersion", "RownRxaaCW");
        setField(term259283, term259283.getClass(), "lastDataVersion", "QJsmuCTCTh");
        setField(term259283, term259283.getClass(), "lastLoginDate", "kTuulZLRxo");
        setField(term259283, term259283.getClass(), "lastPlayDate", "ZiwCIBjVsO");
        setIntField(term259283, term259283.getClass(), "lastPlayCredit", 65559668);
        setIntField(term259283, term259283.getClass(), "lastPlayMode", -1000807164);
        setIntField(term259283, term259283.getClass(), "lastPlaceId", -426025570);
        setField(term259283, term259283.getClass(), "lastPlaceName", "llOXbdniOh");
        setIntField(term259283, term259283.getClass(), "lastAllNetId", 585898209);
        setIntField(term259283, term259283.getClass(), "lastRegionId", 427844033);
        setField(term259283, term259283.getClass(), "lastRegionName", "COqsWjaVOy");
        setField(term259283, term259283.getClass(), "lastClientId", "PJOXWELqDU");
        setField(term259283, term259283.getClass(), "lastCountryCode", "qxYfLsDxVm");
        setIntField(term259283, term259283.getClass(), "lastSelectEMoney", 393133795);
        setIntField(term259283, term259283.getClass(), "lastSelectTicket", 1286575093);
        setIntField(term259283, term259283.getClass(), "lastSelectCourse", -27258592);
        setIntField(term259283, term259283.getClass(), "lastCountCourse", -1527855457);
        setField(term259283, term259283.getClass(), "firstGameId", "IyiMbCQwHK");
        setField(term259283, term259283.getClass(), "firstRomVersion", "qgMxuDOVlx");
        setField(term259283, term259283.getClass(), "firstDataVersion", "zjOGGlnQSZ");
        setField(term259283, term259283.getClass(), "firstPlayDate", "lqDEahPiir");
        setField(term259283, term259283.getClass(), "compatibleCmVersion", "GyYnoejQdg");
        setField(term259283, term259283.getClass(), "dailyBonusDate", "NuDZzHrXrn");
        setField(term259283, term259283.getClass(), "dailyCourseBonusDate", "OuLKyvvPWX");
        setField(term259283, term259283.getClass(), "lastPairLoginDate", "XCikiAMbLv");
        setField(term259283, term259283.getClass(), "lastTrialPlayDate", "VnvZpXcWbJ");
        setIntField(term259283, term259283.getClass(), "playVsCount", -1315887759);
        setIntField(term259283, term259283.getClass(), "playSyncCount", -385751288);
        setIntField(term259283, term259283.getClass(), "winCount", 1481730960);
        setIntField(term259283, term259283.getClass(), "helpCount", -681947751);
        setIntField(term259283, term259283.getClass(), "comboCount", 542595949);
        setLongField(term259283, term259283.getClass(), "totalDeluxscore", -5389608052232415914L);
        setLongField(term259283, term259283.getClass(), "totalBasicDeluxscore", -7444418465968698441L);
        setLongField(term259283, term259283.getClass(), "totalAdvancedDeluxscore", -7922427377156460217L);
        setLongField(term259283, term259283.getClass(), "totalExpertDeluxscore", -5511998375609359627L);
        setLongField(term259283, term259283.getClass(), "totalMasterDeluxscore", -8188822578116625966L);
        setLongField(term259283, term259283.getClass(), "totalReMasterDeluxscore", 6794389101025451177L);
        setIntField(term259283, term259283.getClass(), "totalSync", -2127757374);
        setIntField(term259283, term259283.getClass(), "totalBasicSync", -1843693519);
        setIntField(term259283, term259283.getClass(), "totalAdvancedSync", 655545306);
        setIntField(term259283, term259283.getClass(), "totalExpertSync", -1312381290);
        setIntField(term259283, term259283.getClass(), "totalMasterSync", -1712728962);
        setIntField(term259283, term259283.getClass(), "totalReMasterSync", -64038546);
        setLongField(term259283, term259283.getClass(), "totalAchievement", -6895333545467490660L);
        setLongField(term259283, term259283.getClass(), "totalBasicAchievement", -4053297795358597004L);
        setLongField(term259283, term259283.getClass(), "totalAdvancedAchievement", -3549664535100930420L);
        setLongField(term259283, term259283.getClass(), "totalExpertAchievement", -6726101200732427402L);
        setLongField(term259283, term259283.getClass(), "totalMasterAchievement", 5924875213091649492L);
        setLongField(term259283, term259283.getClass(), "totalReMasterAchievement", -1036580260417519117L);
        setLongField(term259283, term259283.getClass(), "playerOldRating", -2146539727904523216L);
        setLongField(term259283, term259283.getClass(), "playerNewRating", 984937315565295411L);
        setIntField(term259283, term259283.getClass(), "banState", 433360936);
        setLongField(term259283, term259283.getClass(), "dateTime", -8489133101477792400L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CqfTXppaYd";
        callMethod(klass, "setLastClientId", argTypes, term259283, args);
    }

};


