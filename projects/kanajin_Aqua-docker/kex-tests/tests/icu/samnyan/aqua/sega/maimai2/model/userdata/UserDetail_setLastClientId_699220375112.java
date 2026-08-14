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

public class UserDetail_setLastClientId_699220375112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259228;

    public UserDetail_setLastClientId_699220375112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term259232 = new Long(-9168517519350392654L);
        Integer term259295 = new Integer(1085224973);
        Integer term259297 = new Integer(580824436);
        Integer term259299 = new Integer(400588448);
        Integer term259301 = new Integer(-798151545);
        ArrayList term259293 = new ArrayList();
        ((ArrayList) term259293).add(term259295);
        ((ArrayList) term259293).add(term259297);
        ((ArrayList) term259293).add(term259299);
        ((ArrayList) term259293).add(term259301);
        Integer term259307 = new Integer(-243386399);
        Integer term259309 = new Integer(1238856040);
        ArrayList term259305 = new ArrayList();
        ((ArrayList) term259305).add(term259307);
        ((ArrayList) term259305).add(term259309);
        term259228 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term259230 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term259246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259261 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term259228, term259228.getClass(), "id", 7963191089490625391L);
        setLongField(term259230, term259230.getClass(), "id", 769015120300273114L);
        setField(term259230, term259230.getClass(), "extId", term259232);
        setField(term259230, term259230.getClass(), "luid", "foaQZmXMHo");
        setIntField(term259247, term259247.getClass(), "year", 2012);
        setShortField(term259247, term259247.getClass(), "month", (short) 10);
        setShortField(term259247, term259247.getClass(), "day", (short) 1);
        setField(term259246, term259246.getClass(), "date", term259247);
        setByteField(term259251, term259251.getClass(), "hour", (byte) 19);
        setByteField(term259251, term259251.getClass(), "minute", (byte) 43);
        setByteField(term259251, term259251.getClass(), "second", (byte) 49);
        setIntField(term259251, term259251.getClass(), "nano", 81513180);
        setField(term259246, term259246.getClass(), "time", term259251);
        setField(term259230, term259230.getClass(), "registerTime", term259246);
        setIntField(term259257, term259257.getClass(), "year", 2028);
        setShortField(term259257, term259257.getClass(), "month", (short) 2);
        setShortField(term259257, term259257.getClass(), "day", (short) 2);
        setField(term259256, term259256.getClass(), "date", term259257);
        setByteField(term259261, term259261.getClass(), "hour", (byte) 17);
        setByteField(term259261, term259261.getClass(), "minute", (byte) 55);
        setByteField(term259261, term259261.getClass(), "second", (byte) 40);
        setIntField(term259261, term259261.getClass(), "nano", 907692691);
        setField(term259256, term259256.getClass(), "time", term259261);
        setField(term259230, term259230.getClass(), "accessTime", term259256);
        setField(term259228, term259228.getClass(), "card", term259230);
        setField(term259228, term259228.getClass(), "userName", "BTiRFFuMmf");
        setIntField(term259228, term259228.getClass(), "isNetMember", 1700003880);
        setIntField(term259228, term259228.getClass(), "iconId", 1479107053);
        setIntField(term259228, term259228.getClass(), "plateId", -1251439328);
        setIntField(term259228, term259228.getClass(), "titleId", 1798785752);
        setIntField(term259228, term259228.getClass(), "partnerId", 195739943);
        setIntField(term259228, term259228.getClass(), "frameId", 594364543);
        setIntField(term259228, term259228.getClass(), "selectMapId", 401266476);
        setIntField(term259228, term259228.getClass(), "totalAwake", -1352592419);
        setIntField(term259228, term259228.getClass(), "gradeRating", -1352699741);
        setIntField(term259228, term259228.getClass(), "musicRating", 1775677389);
        setIntField(term259228, term259228.getClass(), "playerRating", 781977367);
        setIntField(term259228, term259228.getClass(), "highestRating", 1734793666);
        setIntField(term259228, term259228.getClass(), "gradeRank", -2143217889);
        setIntField(term259228, term259228.getClass(), "classRank", -2098845580);
        setIntField(term259228, term259228.getClass(), "courseRank", 2130134973);
        setField(term259228, term259228.getClass(), "charaSlot", term259293);
        setField(term259228, term259228.getClass(), "charaLockSlot", term259305);
        setLongField(term259228, term259228.getClass(), "contentBit", -3283802672481131163L);
        setIntField(term259228, term259228.getClass(), "playCount", -503344387);
        setField(term259228, term259228.getClass(), "eventWatchedDate", "eUQNprkBYk");
        setField(term259228, term259228.getClass(), "lastGameId", "RCWgKGfqgy");
        setField(term259228, term259228.getClass(), "lastRomVersion", "RownRxaaCW");
        setField(term259228, term259228.getClass(), "lastDataVersion", "QJsmuCTCTh");
        setField(term259228, term259228.getClass(), "lastLoginDate", "kTuulZLRxo");
        setField(term259228, term259228.getClass(), "lastPlayDate", "ZiwCIBjVsO");
        setIntField(term259228, term259228.getClass(), "lastPlayCredit", 65559668);
        setIntField(term259228, term259228.getClass(), "lastPlayMode", -1000807164);
        setIntField(term259228, term259228.getClass(), "lastPlaceId", -426025570);
        setField(term259228, term259228.getClass(), "lastPlaceName", "llOXbdniOh");
        setIntField(term259228, term259228.getClass(), "lastAllNetId", 585898209);
        setIntField(term259228, term259228.getClass(), "lastRegionId", 427844033);
        setField(term259228, term259228.getClass(), "lastRegionName", "COqsWjaVOy");
        setField(term259228, term259228.getClass(), "lastClientId", "PJOXWELqDU");
        setField(term259228, term259228.getClass(), "lastCountryCode", "qxYfLsDxVm");
        setIntField(term259228, term259228.getClass(), "lastSelectEMoney", 393133795);
        setIntField(term259228, term259228.getClass(), "lastSelectTicket", 1286575093);
        setIntField(term259228, term259228.getClass(), "lastSelectCourse", -27258592);
        setIntField(term259228, term259228.getClass(), "lastCountCourse", -1527855457);
        setField(term259228, term259228.getClass(), "firstGameId", "IyiMbCQwHK");
        setField(term259228, term259228.getClass(), "firstRomVersion", "qgMxuDOVlx");
        setField(term259228, term259228.getClass(), "firstDataVersion", "zjOGGlnQSZ");
        setField(term259228, term259228.getClass(), "firstPlayDate", "lqDEahPiir");
        setField(term259228, term259228.getClass(), "compatibleCmVersion", "GyYnoejQdg");
        setField(term259228, term259228.getClass(), "dailyBonusDate", "NuDZzHrXrn");
        setField(term259228, term259228.getClass(), "dailyCourseBonusDate", "OuLKyvvPWX");
        setField(term259228, term259228.getClass(), "lastPairLoginDate", "XCikiAMbLv");
        setField(term259228, term259228.getClass(), "lastTrialPlayDate", "VnvZpXcWbJ");
        setIntField(term259228, term259228.getClass(), "playVsCount", -1315887759);
        setIntField(term259228, term259228.getClass(), "playSyncCount", -385751288);
        setIntField(term259228, term259228.getClass(), "winCount", 1481730960);
        setIntField(term259228, term259228.getClass(), "helpCount", -681947751);
        setIntField(term259228, term259228.getClass(), "comboCount", 542595949);
        setLongField(term259228, term259228.getClass(), "totalDeluxscore", -5389608052232415914L);
        setLongField(term259228, term259228.getClass(), "totalBasicDeluxscore", -7444418465968698441L);
        setLongField(term259228, term259228.getClass(), "totalAdvancedDeluxscore", -7922427377156460217L);
        setLongField(term259228, term259228.getClass(), "totalExpertDeluxscore", -5511998375609359627L);
        setLongField(term259228, term259228.getClass(), "totalMasterDeluxscore", -8188822578116625966L);
        setLongField(term259228, term259228.getClass(), "totalReMasterDeluxscore", 6794389101025451177L);
        setIntField(term259228, term259228.getClass(), "totalSync", -2127757374);
        setIntField(term259228, term259228.getClass(), "totalBasicSync", -1843693519);
        setIntField(term259228, term259228.getClass(), "totalAdvancedSync", 655545306);
        setIntField(term259228, term259228.getClass(), "totalExpertSync", -1312381290);
        setIntField(term259228, term259228.getClass(), "totalMasterSync", -1712728962);
        setIntField(term259228, term259228.getClass(), "totalReMasterSync", -64038546);
        setLongField(term259228, term259228.getClass(), "totalAchievement", -6895333545467490660L);
        setLongField(term259228, term259228.getClass(), "totalBasicAchievement", -4053297795358597004L);
        setLongField(term259228, term259228.getClass(), "totalAdvancedAchievement", -3549664535100930420L);
        setLongField(term259228, term259228.getClass(), "totalExpertAchievement", -6726101200732427402L);
        setLongField(term259228, term259228.getClass(), "totalMasterAchievement", 5924875213091649492L);
        setLongField(term259228, term259228.getClass(), "totalReMasterAchievement", -1036580260417519117L);
        setLongField(term259228, term259228.getClass(), "playerOldRating", -2146539727904523216L);
        setLongField(term259228, term259228.getClass(), "playerNewRating", 984937315565295411L);
        setIntField(term259228, term259228.getClass(), "banState", 433360936);
        setLongField(term259228, term259228.getClass(), "dateTime", -8489133101477792400L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CqfTXppaYd";
        callMethod(klass, "setLastClientId", argTypes, term259228, args);
    }

};


