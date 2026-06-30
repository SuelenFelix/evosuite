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

public class UserAct_canEqual_171947936620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12066;
     Object term12430;

    public UserAct_canEqual_171947936620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12072 = new Long(-2585684163342970173L);
        Integer term12135 = new Integer(663292551);
        Integer term12137 = new Integer(-1885090354);
        Integer term12139 = new Integer(-2066804303);
        Integer term12141 = new Integer(-1731761810);
        Integer term12143 = new Integer(197109649);
        Integer term12145 = new Integer(-1239406390);
        ArrayList term12133 = new ArrayList();
        ((ArrayList) term12133).add(term12135);
        ((ArrayList) term12133).add(term12137);
        ((ArrayList) term12133).add(term12139);
        ((ArrayList) term12133).add(term12141);
        ((ArrayList) term12133).add(term12143);
        ((ArrayList) term12133).add(term12145);
        Integer term12151 = new Integer(1557431527);
        Integer term12153 = new Integer(-1504890659);
        ArrayList term12149 = new ArrayList();
        ((ArrayList) term12149).add(term12151);
        ((ArrayList) term12149).add(term12153);
        term12066 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term12068 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term12070 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12101 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12066, term12066.getClass(), "id", 753095050088595263L);
        setLongField(term12068, term12068.getClass(), "id", 3643973882575578879L);
        setLongField(term12070, term12070.getClass(), "id", -1750555031444556464L);
        setField(term12070, term12070.getClass(), "extId", term12072);
        setField(term12070, term12070.getClass(), "luid", "aSATgQUpoe");
        setIntField(term12087, term12087.getClass(), "year", 2020);
        setShortField(term12087, term12087.getClass(), "month", (short) 8);
        setShortField(term12087, term12087.getClass(), "day", (short) 15);
        setField(term12086, term12086.getClass(), "date", term12087);
        setByteField(term12091, term12091.getClass(), "hour", (byte) 2);
        setByteField(term12091, term12091.getClass(), "minute", (byte) 0);
        setByteField(term12091, term12091.getClass(), "second", (byte) 38);
        setIntField(term12091, term12091.getClass(), "nano", 146431486);
        setField(term12086, term12086.getClass(), "time", term12091);
        setField(term12070, term12070.getClass(), "registerTime", term12086);
        setIntField(term12097, term12097.getClass(), "year", 2014);
        setShortField(term12097, term12097.getClass(), "month", (short) 11);
        setShortField(term12097, term12097.getClass(), "day", (short) 8);
        setField(term12096, term12096.getClass(), "date", term12097);
        setByteField(term12101, term12101.getClass(), "hour", (byte) 8);
        setByteField(term12101, term12101.getClass(), "minute", (byte) 43);
        setByteField(term12101, term12101.getClass(), "second", (byte) 32);
        setIntField(term12101, term12101.getClass(), "nano", 154434838);
        setField(term12096, term12096.getClass(), "time", term12101);
        setField(term12070, term12070.getClass(), "accessTime", term12096);
        setField(term12068, term12068.getClass(), "card", term12070);
        setField(term12068, term12068.getClass(), "userName", "VkPSXewZfB");
        setIntField(term12068, term12068.getClass(), "isNetMember", 1822317628);
        setIntField(term12068, term12068.getClass(), "iconId", -608830309);
        setIntField(term12068, term12068.getClass(), "plateId", -537786484);
        setIntField(term12068, term12068.getClass(), "titleId", 263859424);
        setIntField(term12068, term12068.getClass(), "partnerId", 1436978289);
        setIntField(term12068, term12068.getClass(), "frameId", 696225243);
        setIntField(term12068, term12068.getClass(), "selectMapId", -1421649118);
        setIntField(term12068, term12068.getClass(), "totalAwake", -511248284);
        setIntField(term12068, term12068.getClass(), "gradeRating", 788630042);
        setIntField(term12068, term12068.getClass(), "musicRating", 1430066560);
        setIntField(term12068, term12068.getClass(), "playerRating", 836734074);
        setIntField(term12068, term12068.getClass(), "highestRating", -1747711865);
        setIntField(term12068, term12068.getClass(), "gradeRank", 682812715);
        setIntField(term12068, term12068.getClass(), "classRank", -1092883950);
        setIntField(term12068, term12068.getClass(), "courseRank", 950385621);
        setField(term12068, term12068.getClass(), "charaSlot", term12133);
        setField(term12068, term12068.getClass(), "charaLockSlot", term12149);
        setLongField(term12068, term12068.getClass(), "contentBit", -3231440836116263235L);
        setIntField(term12068, term12068.getClass(), "playCount", -232352320);
        setField(term12068, term12068.getClass(), "eventWatchedDate", "ubodzJoMGW");
        setField(term12068, term12068.getClass(), "lastGameId", "weddIktxOA");
        setField(term12068, term12068.getClass(), "lastRomVersion", "uSlMeISsDD");
        setField(term12068, term12068.getClass(), "lastDataVersion", "WdCiTDUKqn");
        setField(term12068, term12068.getClass(), "lastLoginDate", "PSizQDoxxe");
        setField(term12068, term12068.getClass(), "lastPlayDate", "mKaHyMybrK");
        setIntField(term12068, term12068.getClass(), "lastPlayCredit", -232333014);
        setIntField(term12068, term12068.getClass(), "lastPlayMode", -139694079);
        setIntField(term12068, term12068.getClass(), "lastPlaceId", -1602072035);
        setField(term12068, term12068.getClass(), "lastPlaceName", "AyrEXuGrEj");
        setIntField(term12068, term12068.getClass(), "lastAllNetId", 1902624392);
        setIntField(term12068, term12068.getClass(), "lastRegionId", 904607217);
        setField(term12068, term12068.getClass(), "lastRegionName", "yevIIoVYHq");
        setField(term12068, term12068.getClass(), "lastClientId", "UuYWMTqWTV");
        setField(term12068, term12068.getClass(), "lastCountryCode", "DSFGlcaXUb");
        setIntField(term12068, term12068.getClass(), "lastSelectEMoney", 434914590);
        setIntField(term12068, term12068.getClass(), "lastSelectTicket", 1983756621);
        setIntField(term12068, term12068.getClass(), "lastSelectCourse", -2134711835);
        setIntField(term12068, term12068.getClass(), "lastCountCourse", -1641244494);
        setField(term12068, term12068.getClass(), "firstGameId", "sHMXNUzNeM");
        setField(term12068, term12068.getClass(), "firstRomVersion", "gPzGDOEPPw");
        setField(term12068, term12068.getClass(), "firstDataVersion", "rwKoAngzCu");
        setField(term12068, term12068.getClass(), "firstPlayDate", "VUkRVwROTl");
        setField(term12068, term12068.getClass(), "compatibleCmVersion", "UDlkdccCRn");
        setField(term12068, term12068.getClass(), "dailyBonusDate", "McpzErOcYb");
        setField(term12068, term12068.getClass(), "dailyCourseBonusDate", "jqrVEUvYEz");
        setField(term12068, term12068.getClass(), "lastPairLoginDate", "QITgiBrmfj");
        setField(term12068, term12068.getClass(), "lastTrialPlayDate", "pXxkiXgQnq");
        setIntField(term12068, term12068.getClass(), "playVsCount", 1124282188);
        setIntField(term12068, term12068.getClass(), "playSyncCount", -489441521);
        setIntField(term12068, term12068.getClass(), "winCount", 225873732);
        setIntField(term12068, term12068.getClass(), "helpCount", 529879356);
        setIntField(term12068, term12068.getClass(), "comboCount", 18072182);
        setLongField(term12068, term12068.getClass(), "totalDeluxscore", 8010417010297313651L);
        setLongField(term12068, term12068.getClass(), "totalBasicDeluxscore", 5845993504299821981L);
        setLongField(term12068, term12068.getClass(), "totalAdvancedDeluxscore", -1528017371096319990L);
        setLongField(term12068, term12068.getClass(), "totalExpertDeluxscore", -1526328443223793465L);
        setLongField(term12068, term12068.getClass(), "totalMasterDeluxscore", -412186147449928821L);
        setLongField(term12068, term12068.getClass(), "totalReMasterDeluxscore", -1449569009562240465L);
        setIntField(term12068, term12068.getClass(), "totalSync", 1544768934);
        setIntField(term12068, term12068.getClass(), "totalBasicSync", -383508597);
        setIntField(term12068, term12068.getClass(), "totalAdvancedSync", -819372164);
        setIntField(term12068, term12068.getClass(), "totalExpertSync", 958132675);
        setIntField(term12068, term12068.getClass(), "totalMasterSync", -689879283);
        setIntField(term12068, term12068.getClass(), "totalReMasterSync", 1985432430);
        setLongField(term12068, term12068.getClass(), "totalAchievement", 2287449183416662404L);
        setLongField(term12068, term12068.getClass(), "totalBasicAchievement", -1223573843683081410L);
        setLongField(term12068, term12068.getClass(), "totalAdvancedAchievement", 3453457027014743006L);
        setLongField(term12068, term12068.getClass(), "totalExpertAchievement", 3931473624300151730L);
        setLongField(term12068, term12068.getClass(), "totalMasterAchievement", 661905373566913125L);
        setLongField(term12068, term12068.getClass(), "totalReMasterAchievement", -3753621038448351550L);
        setLongField(term12068, term12068.getClass(), "playerOldRating", 5304481534735378567L);
        setLongField(term12068, term12068.getClass(), "playerNewRating", 3423155413133381764L);
        setIntField(term12068, term12068.getClass(), "banState", -1769933499);
        setLongField(term12068, term12068.getClass(), "dateTime", 7711054832353934171L);
        setField(term12066, term12066.getClass(), "user", term12068);
        setIntField(term12066, term12066.getClass(), "kind", -1510932472);
        setIntField(term12066, term12066.getClass(), "activityId", 1970654816);
        setLongField(term12066, term12066.getClass(), "sortNumber", 185544001230120339L);
        setIntField(term12066, term12066.getClass(), "param1", 1354781442);
        setIntField(term12066, term12066.getClass(), "param2", -393590701);
        setIntField(term12066, term12066.getClass(), "param3", 86344574);
        setIntField(term12066, term12066.getClass(), "param4", -829441157);
        term12430 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12430;
        callMethod(klass, "canEqual", argTypes, term12066, args);
    }

};


