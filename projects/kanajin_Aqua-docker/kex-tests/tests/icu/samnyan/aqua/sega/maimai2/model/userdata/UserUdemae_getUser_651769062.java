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

public class UserUdemae_getUser_651769062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95499;

    public UserUdemae_getUser_651769062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95505 = new Long(-1333707622307134180L);
        Integer term95568 = new Integer(1016087323);
        Integer term95570 = new Integer(1957748979);
        Integer term95572 = new Integer(-1290093259);
        ArrayList term95566 = new ArrayList();
        ((ArrayList) term95566).add(term95568);
        ((ArrayList) term95566).add(term95570);
        ((ArrayList) term95566).add(term95572);
        Integer term95578 = new Integer(-1200934890);
        Integer term95580 = new Integer(1765633108);
        Integer term95582 = new Integer(1312888741);
        ArrayList term95576 = new ArrayList();
        ((ArrayList) term95576).add(term95578);
        ((ArrayList) term95576).add(term95580);
        ((ArrayList) term95576).add(term95582);
        term95499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term95501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term95503 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95534 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95499, term95499.getClass(), "id", -4743773691033199856L);
        setLongField(term95501, term95501.getClass(), "id", 5445249338164045376L);
        setLongField(term95503, term95503.getClass(), "id", 3904137395052612619L);
        setField(term95503, term95503.getClass(), "extId", term95505);
        setField(term95503, term95503.getClass(), "luid", "DKFEMZUVhd");
        setIntField(term95520, term95520.getClass(), "year", 2015);
        setShortField(term95520, term95520.getClass(), "month", (short) 5);
        setShortField(term95520, term95520.getClass(), "day", (short) 14);
        setField(term95519, term95519.getClass(), "date", term95520);
        setByteField(term95524, term95524.getClass(), "hour", (byte) 13);
        setByteField(term95524, term95524.getClass(), "minute", (byte) 25);
        setByteField(term95524, term95524.getClass(), "second", (byte) 10);
        setIntField(term95524, term95524.getClass(), "nano", 246578829);
        setField(term95519, term95519.getClass(), "time", term95524);
        setField(term95503, term95503.getClass(), "registerTime", term95519);
        setIntField(term95530, term95530.getClass(), "year", 2028);
        setShortField(term95530, term95530.getClass(), "month", (short) 5);
        setShortField(term95530, term95530.getClass(), "day", (short) 23);
        setField(term95529, term95529.getClass(), "date", term95530);
        setByteField(term95534, term95534.getClass(), "hour", (byte) 6);
        setByteField(term95534, term95534.getClass(), "minute", (byte) 0);
        setByteField(term95534, term95534.getClass(), "second", (byte) 51);
        setIntField(term95534, term95534.getClass(), "nano", 258967293);
        setField(term95529, term95529.getClass(), "time", term95534);
        setField(term95503, term95503.getClass(), "accessTime", term95529);
        setField(term95501, term95501.getClass(), "card", term95503);
        setField(term95501, term95501.getClass(), "userName", "xhjqWwsjmc");
        setIntField(term95501, term95501.getClass(), "isNetMember", 344859953);
        setIntField(term95501, term95501.getClass(), "iconId", 1690405484);
        setIntField(term95501, term95501.getClass(), "plateId", 1722375044);
        setIntField(term95501, term95501.getClass(), "titleId", 1695415275);
        setIntField(term95501, term95501.getClass(), "partnerId", -460821239);
        setIntField(term95501, term95501.getClass(), "frameId", 1355562027);
        setIntField(term95501, term95501.getClass(), "selectMapId", 1657495750);
        setIntField(term95501, term95501.getClass(), "totalAwake", -218577610);
        setIntField(term95501, term95501.getClass(), "gradeRating", 830804491);
        setIntField(term95501, term95501.getClass(), "musicRating", 29751532);
        setIntField(term95501, term95501.getClass(), "playerRating", 16496303);
        setIntField(term95501, term95501.getClass(), "highestRating", 971650028);
        setIntField(term95501, term95501.getClass(), "gradeRank", 287999347);
        setIntField(term95501, term95501.getClass(), "classRank", -1849779499);
        setIntField(term95501, term95501.getClass(), "courseRank", 77244996);
        setField(term95501, term95501.getClass(), "charaSlot", term95566);
        setField(term95501, term95501.getClass(), "charaLockSlot", term95576);
        setLongField(term95501, term95501.getClass(), "contentBit", -2627351923440470903L);
        setIntField(term95501, term95501.getClass(), "playCount", -845033467);
        setField(term95501, term95501.getClass(), "eventWatchedDate", "GmFORCKDuz");
        setField(term95501, term95501.getClass(), "lastGameId", "uiZFXEVOdS");
        setField(term95501, term95501.getClass(), "lastRomVersion", "kLUzmGfJsV");
        setField(term95501, term95501.getClass(), "lastDataVersion", "NtSnrngAmM");
        setField(term95501, term95501.getClass(), "lastLoginDate", "OYnrHBNcZV");
        setField(term95501, term95501.getClass(), "lastPlayDate", "pwkepWBxgL");
        setIntField(term95501, term95501.getClass(), "lastPlayCredit", 1425416046);
        setIntField(term95501, term95501.getClass(), "lastPlayMode", -2069229498);
        setIntField(term95501, term95501.getClass(), "lastPlaceId", -592794112);
        setField(term95501, term95501.getClass(), "lastPlaceName", "RDXQLsyKOu");
        setIntField(term95501, term95501.getClass(), "lastAllNetId", -1152540918);
        setIntField(term95501, term95501.getClass(), "lastRegionId", -1651174160);
        setField(term95501, term95501.getClass(), "lastRegionName", "ZnIRhQxVXw");
        setField(term95501, term95501.getClass(), "lastClientId", "AVAyxUcLrK");
        setField(term95501, term95501.getClass(), "lastCountryCode", "xLwgTuAlud");
        setIntField(term95501, term95501.getClass(), "lastSelectEMoney", 1770880797);
        setIntField(term95501, term95501.getClass(), "lastSelectTicket", 1281848772);
        setIntField(term95501, term95501.getClass(), "lastSelectCourse", 1911440124);
        setIntField(term95501, term95501.getClass(), "lastCountCourse", 1937143493);
        setField(term95501, term95501.getClass(), "firstGameId", "rwsyozeRfD");
        setField(term95501, term95501.getClass(), "firstRomVersion", "FYBnWmfXch");
        setField(term95501, term95501.getClass(), "firstDataVersion", "ZCKJKntKil");
        setField(term95501, term95501.getClass(), "firstPlayDate", "fyrqWlhCEt");
        setField(term95501, term95501.getClass(), "compatibleCmVersion", "tFABhePKqp");
        setField(term95501, term95501.getClass(), "dailyBonusDate", "FtjQbVqqqx");
        setField(term95501, term95501.getClass(), "dailyCourseBonusDate", "FMhmrgLOkN");
        setField(term95501, term95501.getClass(), "lastPairLoginDate", "UqPFsSwrTW");
        setField(term95501, term95501.getClass(), "lastTrialPlayDate", "zwAKIxjbAz");
        setIntField(term95501, term95501.getClass(), "playVsCount", -96151498);
        setIntField(term95501, term95501.getClass(), "playSyncCount", -358719988);
        setIntField(term95501, term95501.getClass(), "winCount", -1549556875);
        setIntField(term95501, term95501.getClass(), "helpCount", 966102502);
        setIntField(term95501, term95501.getClass(), "comboCount", 1074765616);
        setLongField(term95501, term95501.getClass(), "totalDeluxscore", 2227412096769748963L);
        setLongField(term95501, term95501.getClass(), "totalBasicDeluxscore", -5691770586987635129L);
        setLongField(term95501, term95501.getClass(), "totalAdvancedDeluxscore", 278469276073195090L);
        setLongField(term95501, term95501.getClass(), "totalExpertDeluxscore", -8721079966012575280L);
        setLongField(term95501, term95501.getClass(), "totalMasterDeluxscore", 3103352049634176766L);
        setLongField(term95501, term95501.getClass(), "totalReMasterDeluxscore", 3732205319116661941L);
        setIntField(term95501, term95501.getClass(), "totalSync", 1305055843);
        setIntField(term95501, term95501.getClass(), "totalBasicSync", 2092467469);
        setIntField(term95501, term95501.getClass(), "totalAdvancedSync", 1335699725);
        setIntField(term95501, term95501.getClass(), "totalExpertSync", -1329862026);
        setIntField(term95501, term95501.getClass(), "totalMasterSync", -1793939688);
        setIntField(term95501, term95501.getClass(), "totalReMasterSync", 432386815);
        setLongField(term95501, term95501.getClass(), "totalAchievement", -2437083850262908381L);
        setLongField(term95501, term95501.getClass(), "totalBasicAchievement", 833849456046483202L);
        setLongField(term95501, term95501.getClass(), "totalAdvancedAchievement", 3498660691906309998L);
        setLongField(term95501, term95501.getClass(), "totalExpertAchievement", -2863041629805353276L);
        setLongField(term95501, term95501.getClass(), "totalMasterAchievement", 2542595135669094188L);
        setLongField(term95501, term95501.getClass(), "totalReMasterAchievement", 5163944658879449034L);
        setLongField(term95501, term95501.getClass(), "playerOldRating", -2762998546435960413L);
        setLongField(term95501, term95501.getClass(), "playerNewRating", -1286201195708279888L);
        setIntField(term95501, term95501.getClass(), "banState", -1854296181);
        setLongField(term95501, term95501.getClass(), "dateTime", -4497907374818723648L);
        setField(term95499, term95499.getClass(), "user", term95501);
        setIntField(term95499, term95499.getClass(), "rate", -265101443);
        setIntField(term95499, term95499.getClass(), "maxRate", -1887921614);
        setIntField(term95499, term95499.getClass(), "classValue", -794058997);
        setIntField(term95499, term95499.getClass(), "maxClassValue", -847704743);
        setIntField(term95499, term95499.getClass(), "totalWinNum", -996528310);
        setIntField(term95499, term95499.getClass(), "totalLoseNum", 94400416);
        setIntField(term95499, term95499.getClass(), "maxWinNum", 581671837);
        setIntField(term95499, term95499.getClass(), "maxLoseNum", 1416940652);
        setIntField(term95499, term95499.getClass(), "winNum", 2087868215);
        setIntField(term95499, term95499.getClass(), "loseNum", 261545140);
        setIntField(term95499, term95499.getClass(), "npcTotalWinNum", -422046674);
        setIntField(term95499, term95499.getClass(), "npcTotalLoseNum", -1837895860);
        setIntField(term95499, term95499.getClass(), "npcMaxWinNum", 777103861);
        setIntField(term95499, term95499.getClass(), "npcMaxLoseNum", 154973906);
        setIntField(term95499, term95499.getClass(), "npcWinNum", -307927063);
        setIntField(term95499, term95499.getClass(), "npcLoseNum", -1627954969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term95499, args);
    }

};


