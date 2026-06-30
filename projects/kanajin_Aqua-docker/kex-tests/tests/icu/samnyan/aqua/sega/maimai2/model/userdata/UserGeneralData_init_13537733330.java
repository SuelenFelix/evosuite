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

public class UserGeneralData_init_13537733330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132149;

    public UserGeneralData_init_13537733330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132153 = new Long(6426732259596412988L);
        Integer term132216 = new Integer(-1713723083);
        Integer term132218 = new Integer(-1337690242);
        Integer term132220 = new Integer(264872152);
        Integer term132222 = new Integer(1645751151);
        ArrayList term132214 = new ArrayList();
        ((ArrayList) term132214).add(term132216);
        ((ArrayList) term132214).add(term132218);
        ((ArrayList) term132214).add(term132220);
        ((ArrayList) term132214).add(term132222);
        Integer term132228 = new Integer(-2117930201);
        Integer term132230 = new Integer(1839150896);
        Integer term132232 = new Integer(-1487860516);
        Integer term132234 = new Integer(784631129);
        ArrayList term132226 = new ArrayList();
        ((ArrayList) term132226).add(term132228);
        ((ArrayList) term132226).add(term132230);
        ((ArrayList) term132226).add(term132232);
        ((ArrayList) term132226).add(term132234);
        term132149 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term132151 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132172 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132182 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132149, term132149.getClass(), "id", 6258616282584609602L);
        setLongField(term132151, term132151.getClass(), "id", -7169750344402266944L);
        setField(term132151, term132151.getClass(), "extId", term132153);
        setField(term132151, term132151.getClass(), "luid", "HnUeaoqlvY");
        setIntField(term132168, term132168.getClass(), "year", 2011);
        setShortField(term132168, term132168.getClass(), "month", (short) 1);
        setShortField(term132168, term132168.getClass(), "day", (short) 7);
        setField(term132167, term132167.getClass(), "date", term132168);
        setByteField(term132172, term132172.getClass(), "hour", (byte) 10);
        setByteField(term132172, term132172.getClass(), "minute", (byte) 6);
        setByteField(term132172, term132172.getClass(), "second", (byte) 28);
        setIntField(term132172, term132172.getClass(), "nano", 669533698);
        setField(term132167, term132167.getClass(), "time", term132172);
        setField(term132151, term132151.getClass(), "registerTime", term132167);
        setIntField(term132178, term132178.getClass(), "year", 2016);
        setShortField(term132178, term132178.getClass(), "month", (short) 11);
        setShortField(term132178, term132178.getClass(), "day", (short) 15);
        setField(term132177, term132177.getClass(), "date", term132178);
        setByteField(term132182, term132182.getClass(), "hour", (byte) 14);
        setByteField(term132182, term132182.getClass(), "minute", (byte) 34);
        setByteField(term132182, term132182.getClass(), "second", (byte) 23);
        setIntField(term132182, term132182.getClass(), "nano", 287070581);
        setField(term132177, term132177.getClass(), "time", term132182);
        setField(term132151, term132151.getClass(), "accessTime", term132177);
        setField(term132149, term132149.getClass(), "card", term132151);
        setField(term132149, term132149.getClass(), "userName", "QoDtuFsSzS");
        setIntField(term132149, term132149.getClass(), "isNetMember", -986489468);
        setIntField(term132149, term132149.getClass(), "iconId", -204607039);
        setIntField(term132149, term132149.getClass(), "plateId", 78293336);
        setIntField(term132149, term132149.getClass(), "titleId", -257780975);
        setIntField(term132149, term132149.getClass(), "partnerId", 1303949911);
        setIntField(term132149, term132149.getClass(), "frameId", 981415365);
        setIntField(term132149, term132149.getClass(), "selectMapId", 578948651);
        setIntField(term132149, term132149.getClass(), "totalAwake", -159365198);
        setIntField(term132149, term132149.getClass(), "gradeRating", 403862627);
        setIntField(term132149, term132149.getClass(), "musicRating", -1058988340);
        setIntField(term132149, term132149.getClass(), "playerRating", 10811623);
        setIntField(term132149, term132149.getClass(), "highestRating", 188015737);
        setIntField(term132149, term132149.getClass(), "gradeRank", 1054374404);
        setIntField(term132149, term132149.getClass(), "classRank", -666072892);
        setIntField(term132149, term132149.getClass(), "courseRank", -626435102);
        setField(term132149, term132149.getClass(), "charaSlot", term132214);
        setField(term132149, term132149.getClass(), "charaLockSlot", term132226);
        setLongField(term132149, term132149.getClass(), "contentBit", 2469102234876835465L);
        setIntField(term132149, term132149.getClass(), "playCount", 734226321);
        setField(term132149, term132149.getClass(), "eventWatchedDate", "hlFZKpXZIY");
        setField(term132149, term132149.getClass(), "lastGameId", "tRkHyXXipG");
        setField(term132149, term132149.getClass(), "lastRomVersion", "OAJdjKRfIM");
        setField(term132149, term132149.getClass(), "lastDataVersion", "BvzAbMTwzf");
        setField(term132149, term132149.getClass(), "lastLoginDate", "fcmWxpNhDp");
        setField(term132149, term132149.getClass(), "lastPlayDate", "eAuqPLqmIz");
        setIntField(term132149, term132149.getClass(), "lastPlayCredit", -818023324);
        setIntField(term132149, term132149.getClass(), "lastPlayMode", 540998196);
        setIntField(term132149, term132149.getClass(), "lastPlaceId", -1360947775);
        setField(term132149, term132149.getClass(), "lastPlaceName", "jttexnFOYa");
        setIntField(term132149, term132149.getClass(), "lastAllNetId", -688211428);
        setIntField(term132149, term132149.getClass(), "lastRegionId", 976339797);
        setField(term132149, term132149.getClass(), "lastRegionName", "VTcNUeCrHP");
        setField(term132149, term132149.getClass(), "lastClientId", "dRGHrevrGk");
        setField(term132149, term132149.getClass(), "lastCountryCode", "nUztHQImUf");
        setIntField(term132149, term132149.getClass(), "lastSelectEMoney", -606155396);
        setIntField(term132149, term132149.getClass(), "lastSelectTicket", 1734679414);
        setIntField(term132149, term132149.getClass(), "lastSelectCourse", -1815657201);
        setIntField(term132149, term132149.getClass(), "lastCountCourse", -888163744);
        setField(term132149, term132149.getClass(), "firstGameId", "ntLvGqxKQC");
        setField(term132149, term132149.getClass(), "firstRomVersion", "KJiHZHSclg");
        setField(term132149, term132149.getClass(), "firstDataVersion", "EVCYyZgkIk");
        setField(term132149, term132149.getClass(), "firstPlayDate", "YzWEZeucrS");
        setField(term132149, term132149.getClass(), "compatibleCmVersion", "dWqMWOnvZA");
        setField(term132149, term132149.getClass(), "dailyBonusDate", "LWvhNNTPry");
        setField(term132149, term132149.getClass(), "dailyCourseBonusDate", "NKZtzKmNMG");
        setField(term132149, term132149.getClass(), "lastPairLoginDate", "bybEmXMboY");
        setField(term132149, term132149.getClass(), "lastTrialPlayDate", "mSHWVzcYng");
        setIntField(term132149, term132149.getClass(), "playVsCount", 1589783137);
        setIntField(term132149, term132149.getClass(), "playSyncCount", 1822772585);
        setIntField(term132149, term132149.getClass(), "winCount", -1240567719);
        setIntField(term132149, term132149.getClass(), "helpCount", 444592925);
        setIntField(term132149, term132149.getClass(), "comboCount", 1533907913);
        setLongField(term132149, term132149.getClass(), "totalDeluxscore", 8757869191630189440L);
        setLongField(term132149, term132149.getClass(), "totalBasicDeluxscore", -1393374527446406666L);
        setLongField(term132149, term132149.getClass(), "totalAdvancedDeluxscore", -1485987978753564134L);
        setLongField(term132149, term132149.getClass(), "totalExpertDeluxscore", 5230084303674835670L);
        setLongField(term132149, term132149.getClass(), "totalMasterDeluxscore", -1230135382587684425L);
        setLongField(term132149, term132149.getClass(), "totalReMasterDeluxscore", 5822337126842986196L);
        setIntField(term132149, term132149.getClass(), "totalSync", 1834871797);
        setIntField(term132149, term132149.getClass(), "totalBasicSync", 2074112074);
        setIntField(term132149, term132149.getClass(), "totalAdvancedSync", -1339856700);
        setIntField(term132149, term132149.getClass(), "totalExpertSync", -1979249214);
        setIntField(term132149, term132149.getClass(), "totalMasterSync", -793518315);
        setIntField(term132149, term132149.getClass(), "totalReMasterSync", 2091844914);
        setLongField(term132149, term132149.getClass(), "totalAchievement", -895662208563639340L);
        setLongField(term132149, term132149.getClass(), "totalBasicAchievement", 1783736733445461370L);
        setLongField(term132149, term132149.getClass(), "totalAdvancedAchievement", 664293159969917289L);
        setLongField(term132149, term132149.getClass(), "totalExpertAchievement", -3191452368223818248L);
        setLongField(term132149, term132149.getClass(), "totalMasterAchievement", -6017624031365056434L);
        setLongField(term132149, term132149.getClass(), "totalReMasterAchievement", 7511527551718845732L);
        setLongField(term132149, term132149.getClass(), "playerOldRating", 7416025899853163226L);
        setLongField(term132149, term132149.getClass(), "playerNewRating", -2387579833943568446L);
        setIntField(term132149, term132149.getClass(), "banState", 2021693700);
        setLongField(term132149, term132149.getClass(), "dateTime", -3335753735355355699L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term132149;
        args[1] = "JbyjPaAJuH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


