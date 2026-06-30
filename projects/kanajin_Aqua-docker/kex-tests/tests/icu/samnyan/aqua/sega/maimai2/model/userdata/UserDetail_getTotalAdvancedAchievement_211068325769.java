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

public class UserDetail_getTotalAdvancedAchievement_211068325769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4268641;

    public UserDetail_getTotalAdvancedAchievement_211068325769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4268645 = new Long(686910339691253646L);
        Integer term4268708 = new Integer(-1090683004);
        Integer term4268710 = new Integer(1077547795);
        Integer term4268712 = new Integer(-287532994);
        Integer term4268714 = new Integer(-224320349);
        Integer term4268716 = new Integer(-526888962);
        ArrayList term4268706 = new ArrayList();
        ((ArrayList) term4268706).add(term4268708);
        ((ArrayList) term4268706).add(term4268710);
        ((ArrayList) term4268706).add(term4268712);
        ((ArrayList) term4268706).add(term4268714);
        ((ArrayList) term4268706).add(term4268716);
        Integer term4268722 = new Integer(-23497981);
        Integer term4268724 = new Integer(-1204518409);
        Integer term4268726 = new Integer(1564920368);
        Integer term4268728 = new Integer(380619960);
        ArrayList term4268720 = new ArrayList();
        ((ArrayList) term4268720).add(term4268722);
        ((ArrayList) term4268720).add(term4268724);
        ((ArrayList) term4268720).add(term4268726);
        ((ArrayList) term4268720).add(term4268728);
        term4268641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4268643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4268659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4268660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4268664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4268669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4268670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4268674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4268641, term4268641.getClass(), "id", -4045817271760718194L);
        setLongField(term4268643, term4268643.getClass(), "id", 2761944996006814183L);
        setField(term4268643, term4268643.getClass(), "extId", term4268645);
        setField(term4268643, term4268643.getClass(), "luid", "pxOPmKhfVb");
        setIntField(term4268660, term4268660.getClass(), "year", 2023);
        setShortField(term4268660, term4268660.getClass(), "month", (short) 7);
        setShortField(term4268660, term4268660.getClass(), "day", (short) 7);
        setField(term4268659, term4268659.getClass(), "date", term4268660);
        setByteField(term4268664, term4268664.getClass(), "hour", (byte) 22);
        setByteField(term4268664, term4268664.getClass(), "minute", (byte) 26);
        setByteField(term4268664, term4268664.getClass(), "second", (byte) 27);
        setIntField(term4268664, term4268664.getClass(), "nano", 897044105);
        setField(term4268659, term4268659.getClass(), "time", term4268664);
        setField(term4268643, term4268643.getClass(), "registerTime", term4268659);
        setIntField(term4268670, term4268670.getClass(), "year", 2023);
        setShortField(term4268670, term4268670.getClass(), "month", (short) 11);
        setShortField(term4268670, term4268670.getClass(), "day", (short) 18);
        setField(term4268669, term4268669.getClass(), "date", term4268670);
        setByteField(term4268674, term4268674.getClass(), "hour", (byte) 21);
        setByteField(term4268674, term4268674.getClass(), "minute", (byte) 39);
        setByteField(term4268674, term4268674.getClass(), "second", (byte) 21);
        setIntField(term4268674, term4268674.getClass(), "nano", 983756601);
        setField(term4268669, term4268669.getClass(), "time", term4268674);
        setField(term4268643, term4268643.getClass(), "accessTime", term4268669);
        setField(term4268641, term4268641.getClass(), "card", term4268643);
        setField(term4268641, term4268641.getClass(), "userName", "ZTTKrTYYpK");
        setIntField(term4268641, term4268641.getClass(), "isNetMember", 1537833184);
        setIntField(term4268641, term4268641.getClass(), "iconId", -1937907323);
        setIntField(term4268641, term4268641.getClass(), "plateId", 1720871110);
        setIntField(term4268641, term4268641.getClass(), "titleId", -467834813);
        setIntField(term4268641, term4268641.getClass(), "partnerId", -334066043);
        setIntField(term4268641, term4268641.getClass(), "frameId", 1232690631);
        setIntField(term4268641, term4268641.getClass(), "selectMapId", 770552200);
        setIntField(term4268641, term4268641.getClass(), "totalAwake", -380086817);
        setIntField(term4268641, term4268641.getClass(), "gradeRating", 852719602);
        setIntField(term4268641, term4268641.getClass(), "musicRating", 1923998803);
        setIntField(term4268641, term4268641.getClass(), "playerRating", 2020909519);
        setIntField(term4268641, term4268641.getClass(), "highestRating", 1815343987);
        setIntField(term4268641, term4268641.getClass(), "gradeRank", 1763182438);
        setIntField(term4268641, term4268641.getClass(), "classRank", -2050186555);
        setIntField(term4268641, term4268641.getClass(), "courseRank", 1137338126);
        setField(term4268641, term4268641.getClass(), "charaSlot", term4268706);
        setField(term4268641, term4268641.getClass(), "charaLockSlot", term4268720);
        setLongField(term4268641, term4268641.getClass(), "contentBit", 6848669827906753737L);
        setIntField(term4268641, term4268641.getClass(), "playCount", -405432178);
        setField(term4268641, term4268641.getClass(), "eventWatchedDate", "LDSdNDEzDT");
        setField(term4268641, term4268641.getClass(), "lastGameId", "DZlhNNRkFD");
        setField(term4268641, term4268641.getClass(), "lastRomVersion", "lfWcPeSzDB");
        setField(term4268641, term4268641.getClass(), "lastDataVersion", "XzyldWioRD");
        setField(term4268641, term4268641.getClass(), "lastLoginDate", "ZZTucIDypM");
        setField(term4268641, term4268641.getClass(), "lastPlayDate", "vClKthwcHH");
        setIntField(term4268641, term4268641.getClass(), "lastPlayCredit", 673962997);
        setIntField(term4268641, term4268641.getClass(), "lastPlayMode", 459248903);
        setIntField(term4268641, term4268641.getClass(), "lastPlaceId", 1392871088);
        setField(term4268641, term4268641.getClass(), "lastPlaceName", "OgNUgxmXor");
        setIntField(term4268641, term4268641.getClass(), "lastAllNetId", 1274426500);
        setIntField(term4268641, term4268641.getClass(), "lastRegionId", 1556959643);
        setField(term4268641, term4268641.getClass(), "lastRegionName", "olTqGBtrgM");
        setField(term4268641, term4268641.getClass(), "lastClientId", "WRNTDSIkzi");
        setField(term4268641, term4268641.getClass(), "lastCountryCode", "WqGHsVRrvJ");
        setIntField(term4268641, term4268641.getClass(), "lastSelectEMoney", -1346390573);
        setIntField(term4268641, term4268641.getClass(), "lastSelectTicket", 550051401);
        setIntField(term4268641, term4268641.getClass(), "lastSelectCourse", 155278486);
        setIntField(term4268641, term4268641.getClass(), "lastCountCourse", 865001107);
        setField(term4268641, term4268641.getClass(), "firstGameId", "sBcswGhisQ");
        setField(term4268641, term4268641.getClass(), "firstRomVersion", "qNjpRDxevU");
        setField(term4268641, term4268641.getClass(), "firstDataVersion", "gMDSlMIWYK");
        setField(term4268641, term4268641.getClass(), "firstPlayDate", "GIdIKsFwlB");
        setField(term4268641, term4268641.getClass(), "compatibleCmVersion", "lRjVRIxmWa");
        setField(term4268641, term4268641.getClass(), "dailyBonusDate", "wSCHBFVpQI");
        setField(term4268641, term4268641.getClass(), "dailyCourseBonusDate", "enAMThxuiF");
        setField(term4268641, term4268641.getClass(), "lastPairLoginDate", "wKgsbmAneT");
        setField(term4268641, term4268641.getClass(), "lastTrialPlayDate", "yiGMiWColE");
        setIntField(term4268641, term4268641.getClass(), "playVsCount", 169816950);
        setIntField(term4268641, term4268641.getClass(), "playSyncCount", -2034928882);
        setIntField(term4268641, term4268641.getClass(), "winCount", 1410635856);
        setIntField(term4268641, term4268641.getClass(), "helpCount", -2028178967);
        setIntField(term4268641, term4268641.getClass(), "comboCount", 192654549);
        setLongField(term4268641, term4268641.getClass(), "totalDeluxscore", 2940273305089839036L);
        setLongField(term4268641, term4268641.getClass(), "totalBasicDeluxscore", 3870132629724352138L);
        setLongField(term4268641, term4268641.getClass(), "totalAdvancedDeluxscore", 4521002859095155919L);
        setLongField(term4268641, term4268641.getClass(), "totalExpertDeluxscore", 8840562713826469364L);
        setLongField(term4268641, term4268641.getClass(), "totalMasterDeluxscore", 4627996044621731131L);
        setLongField(term4268641, term4268641.getClass(), "totalReMasterDeluxscore", 863386572498505413L);
        setIntField(term4268641, term4268641.getClass(), "totalSync", 890078343);
        setIntField(term4268641, term4268641.getClass(), "totalBasicSync", 767332402);
        setIntField(term4268641, term4268641.getClass(), "totalAdvancedSync", -27285682);
        setIntField(term4268641, term4268641.getClass(), "totalExpertSync", -1442268491);
        setIntField(term4268641, term4268641.getClass(), "totalMasterSync", -115960190);
        setIntField(term4268641, term4268641.getClass(), "totalReMasterSync", -167509358);
        setLongField(term4268641, term4268641.getClass(), "totalAchievement", -1160533088830519116L);
        setLongField(term4268641, term4268641.getClass(), "totalBasicAchievement", -678490585961544740L);
        setLongField(term4268641, term4268641.getClass(), "totalAdvancedAchievement", 3124101483220358564L);
        setLongField(term4268641, term4268641.getClass(), "totalExpertAchievement", -7628792097375194885L);
        setLongField(term4268641, term4268641.getClass(), "totalMasterAchievement", -2374244475687875946L);
        setLongField(term4268641, term4268641.getClass(), "totalReMasterAchievement", -1978688717087148850L);
        setLongField(term4268641, term4268641.getClass(), "playerOldRating", 632883474440939991L);
        setLongField(term4268641, term4268641.getClass(), "playerNewRating", -3933573617073668308L);
        setIntField(term4268641, term4268641.getClass(), "banState", -258808789);
        setLongField(term4268641, term4268641.getClass(), "dateTime", -224295632994600102L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedAchievement", argTypes, term4268641, args);
    }

};


