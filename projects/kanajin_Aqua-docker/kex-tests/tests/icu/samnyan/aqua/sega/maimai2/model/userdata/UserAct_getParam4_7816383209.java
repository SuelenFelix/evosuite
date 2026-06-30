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

public class UserAct_getParam4_7816383209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5140;

    public UserAct_getParam4_7816383209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5146 = new Long(6967924379644551255L);
        Integer term5209 = new Integer(-2095575670);
        Integer term5211 = new Integer(1225272962);
        Integer term5213 = new Integer(1324040357);
        Integer term5215 = new Integer(-1588772968);
        Integer term5217 = new Integer(-93135961);
        Integer term5219 = new Integer(-112921587);
        Integer term5221 = new Integer(933028652);
        Integer term5223 = new Integer(287287233);
        ArrayList term5207 = new ArrayList();
        ((ArrayList) term5207).add(term5209);
        ((ArrayList) term5207).add(term5211);
        ((ArrayList) term5207).add(term5213);
        ((ArrayList) term5207).add(term5215);
        ((ArrayList) term5207).add(term5217);
        ((ArrayList) term5207).add(term5219);
        ((ArrayList) term5207).add(term5221);
        ((ArrayList) term5207).add(term5223);
        Integer term5229 = new Integer(962840079);
        Integer term5231 = new Integer(1540719661);
        Integer term5233 = new Integer(1265463001);
        Integer term5235 = new Integer(335112684);
        Integer term5237 = new Integer(1551099402);
        Integer term5239 = new Integer(-2027534003);
        ArrayList term5227 = new ArrayList();
        ((ArrayList) term5227).add(term5229);
        ((ArrayList) term5227).add(term5231);
        ((ArrayList) term5227).add(term5233);
        ((ArrayList) term5227).add(term5235);
        ((ArrayList) term5227).add(term5237);
        ((ArrayList) term5227).add(term5239);
        term5140 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term5142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term5144 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5140, term5140.getClass(), "id", 4699157009689333952L);
        setLongField(term5142, term5142.getClass(), "id", -78240609295693193L);
        setLongField(term5144, term5144.getClass(), "id", 3090901538358721367L);
        setField(term5144, term5144.getClass(), "extId", term5146);
        setField(term5144, term5144.getClass(), "luid", "vKQukfbJUd");
        setIntField(term5161, term5161.getClass(), "year", 2017);
        setShortField(term5161, term5161.getClass(), "month", (short) 3);
        setShortField(term5161, term5161.getClass(), "day", (short) 5);
        setField(term5160, term5160.getClass(), "date", term5161);
        setByteField(term5165, term5165.getClass(), "hour", (byte) 20);
        setByteField(term5165, term5165.getClass(), "minute", (byte) 34);
        setByteField(term5165, term5165.getClass(), "second", (byte) 55);
        setIntField(term5165, term5165.getClass(), "nano", 78024496);
        setField(term5160, term5160.getClass(), "time", term5165);
        setField(term5144, term5144.getClass(), "registerTime", term5160);
        setIntField(term5171, term5171.getClass(), "year", 2020);
        setShortField(term5171, term5171.getClass(), "month", (short) 7);
        setShortField(term5171, term5171.getClass(), "day", (short) 24);
        setField(term5170, term5170.getClass(), "date", term5171);
        setByteField(term5175, term5175.getClass(), "hour", (byte) 0);
        setByteField(term5175, term5175.getClass(), "minute", (byte) 59);
        setByteField(term5175, term5175.getClass(), "second", (byte) 56);
        setIntField(term5175, term5175.getClass(), "nano", 320219201);
        setField(term5170, term5170.getClass(), "time", term5175);
        setField(term5144, term5144.getClass(), "accessTime", term5170);
        setField(term5142, term5142.getClass(), "card", term5144);
        setField(term5142, term5142.getClass(), "userName", "lFRJFUMVbx");
        setIntField(term5142, term5142.getClass(), "isNetMember", -1148142995);
        setIntField(term5142, term5142.getClass(), "iconId", -233024044);
        setIntField(term5142, term5142.getClass(), "plateId", 1820784228);
        setIntField(term5142, term5142.getClass(), "titleId", 1390820006);
        setIntField(term5142, term5142.getClass(), "partnerId", -828982065);
        setIntField(term5142, term5142.getClass(), "frameId", 1221443226);
        setIntField(term5142, term5142.getClass(), "selectMapId", 908108726);
        setIntField(term5142, term5142.getClass(), "totalAwake", 1023209512);
        setIntField(term5142, term5142.getClass(), "gradeRating", 1084849225);
        setIntField(term5142, term5142.getClass(), "musicRating", -1702055571);
        setIntField(term5142, term5142.getClass(), "playerRating", -944542900);
        setIntField(term5142, term5142.getClass(), "highestRating", 2063762142);
        setIntField(term5142, term5142.getClass(), "gradeRank", 1658391716);
        setIntField(term5142, term5142.getClass(), "classRank", 2143282300);
        setIntField(term5142, term5142.getClass(), "courseRank", 1137624258);
        setField(term5142, term5142.getClass(), "charaSlot", term5207);
        setField(term5142, term5142.getClass(), "charaLockSlot", term5227);
        setLongField(term5142, term5142.getClass(), "contentBit", -1677189124507026637L);
        setIntField(term5142, term5142.getClass(), "playCount", 977862393);
        setField(term5142, term5142.getClass(), "eventWatchedDate", "sZdUNdggUW");
        setField(term5142, term5142.getClass(), "lastGameId", "OqbwYQfvAe");
        setField(term5142, term5142.getClass(), "lastRomVersion", "tRxZafjqIx");
        setField(term5142, term5142.getClass(), "lastDataVersion", "DhjNLmRMCu");
        setField(term5142, term5142.getClass(), "lastLoginDate", "PgPzMSEjjX");
        setField(term5142, term5142.getClass(), "lastPlayDate", "wzsPSPcRdj");
        setIntField(term5142, term5142.getClass(), "lastPlayCredit", 301401782);
        setIntField(term5142, term5142.getClass(), "lastPlayMode", 1988605357);
        setIntField(term5142, term5142.getClass(), "lastPlaceId", 808203320);
        setField(term5142, term5142.getClass(), "lastPlaceName", "kGMQdqJYyB");
        setIntField(term5142, term5142.getClass(), "lastAllNetId", -544382127);
        setIntField(term5142, term5142.getClass(), "lastRegionId", -1830198043);
        setField(term5142, term5142.getClass(), "lastRegionName", "XJJNClzHRf");
        setField(term5142, term5142.getClass(), "lastClientId", "HDaezxQfQR");
        setField(term5142, term5142.getClass(), "lastCountryCode", "iikZEapDlu");
        setIntField(term5142, term5142.getClass(), "lastSelectEMoney", -439048495);
        setIntField(term5142, term5142.getClass(), "lastSelectTicket", -1849105286);
        setIntField(term5142, term5142.getClass(), "lastSelectCourse", 1334483645);
        setIntField(term5142, term5142.getClass(), "lastCountCourse", 917513193);
        setField(term5142, term5142.getClass(), "firstGameId", "nhoHrZfnIN");
        setField(term5142, term5142.getClass(), "firstRomVersion", "ZkMALXpEAZ");
        setField(term5142, term5142.getClass(), "firstDataVersion", "tXfQjSqDzN");
        setField(term5142, term5142.getClass(), "firstPlayDate", "BjugTaMcxJ");
        setField(term5142, term5142.getClass(), "compatibleCmVersion", "vGiuZVPJNH");
        setField(term5142, term5142.getClass(), "dailyBonusDate", "tlzpzIjMib");
        setField(term5142, term5142.getClass(), "dailyCourseBonusDate", "AZdLeSugwv");
        setField(term5142, term5142.getClass(), "lastPairLoginDate", "RMsXuyzKJV");
        setField(term5142, term5142.getClass(), "lastTrialPlayDate", "FwPbDZcHmB");
        setIntField(term5142, term5142.getClass(), "playVsCount", 787278105);
        setIntField(term5142, term5142.getClass(), "playSyncCount", -2063843486);
        setIntField(term5142, term5142.getClass(), "winCount", 833762980);
        setIntField(term5142, term5142.getClass(), "helpCount", 320711637);
        setIntField(term5142, term5142.getClass(), "comboCount", 1241164745);
        setLongField(term5142, term5142.getClass(), "totalDeluxscore", 4795660804170399986L);
        setLongField(term5142, term5142.getClass(), "totalBasicDeluxscore", -4030863184426321096L);
        setLongField(term5142, term5142.getClass(), "totalAdvancedDeluxscore", -8010214112439224349L);
        setLongField(term5142, term5142.getClass(), "totalExpertDeluxscore", -6673920710396545553L);
        setLongField(term5142, term5142.getClass(), "totalMasterDeluxscore", 3412644969878030772L);
        setLongField(term5142, term5142.getClass(), "totalReMasterDeluxscore", 6698455537431331246L);
        setIntField(term5142, term5142.getClass(), "totalSync", 1723148410);
        setIntField(term5142, term5142.getClass(), "totalBasicSync", -920797484);
        setIntField(term5142, term5142.getClass(), "totalAdvancedSync", -1631697577);
        setIntField(term5142, term5142.getClass(), "totalExpertSync", 765731371);
        setIntField(term5142, term5142.getClass(), "totalMasterSync", -1703035419);
        setIntField(term5142, term5142.getClass(), "totalReMasterSync", 765766290);
        setLongField(term5142, term5142.getClass(), "totalAchievement", -8327432141027603933L);
        setLongField(term5142, term5142.getClass(), "totalBasicAchievement", -433040798405298080L);
        setLongField(term5142, term5142.getClass(), "totalAdvancedAchievement", -1505191021111100819L);
        setLongField(term5142, term5142.getClass(), "totalExpertAchievement", -1000830646340880796L);
        setLongField(term5142, term5142.getClass(), "totalMasterAchievement", 5973526439563541711L);
        setLongField(term5142, term5142.getClass(), "totalReMasterAchievement", 5246058710498845622L);
        setLongField(term5142, term5142.getClass(), "playerOldRating", 4394651392080968777L);
        setLongField(term5142, term5142.getClass(), "playerNewRating", -7310273014364148916L);
        setIntField(term5142, term5142.getClass(), "banState", -1284825282);
        setLongField(term5142, term5142.getClass(), "dateTime", 8863790908271299748L);
        setField(term5140, term5140.getClass(), "user", term5142);
        setIntField(term5140, term5140.getClass(), "kind", -1941343035);
        setIntField(term5140, term5140.getClass(), "activityId", 947897214);
        setLongField(term5140, term5140.getClass(), "sortNumber", 9205327385733285058L);
        setIntField(term5140, term5140.getClass(), "param1", 1496340209);
        setIntField(term5140, term5140.getClass(), "param2", -1748391876);
        setIntField(term5140, term5140.getClass(), "param3", 43258317);
        setIntField(term5140, term5140.getClass(), "param4", 1707220033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term5140, args);
    }

};


