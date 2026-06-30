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

public class UserExtend_setSelectScoreType_179159046724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156311;
     Object term156694;

    public UserExtend_setSelectScoreType_179159046724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156317 = new Long(-1635471392209071620L);
        Integer term156380 = new Integer(-705528573);
        ArrayList term156378 = new ArrayList();
        ((ArrayList) term156378).add(term156380);
        Integer term156386 = new Integer(-480070896);
        Integer term156388 = new Integer(-1811732249);
        Integer term156390 = new Integer(1993504802);
        Integer term156392 = new Integer(526852618);
        Integer term156394 = new Integer(903788782);
        Integer term156396 = new Integer(-608033702);
        ArrayList term156384 = new ArrayList();
        ((ArrayList) term156384).add(term156386);
        ((ArrayList) term156384).add(term156388);
        ((ArrayList) term156384).add(term156390);
        ((ArrayList) term156384).add(term156392);
        ((ArrayList) term156384).add(term156394);
        ((ArrayList) term156384).add(term156396);
        Integer term156680 = new Integer(1118825073);
        Integer term156682 = new Integer(751108197);
        Integer term156684 = new Integer(-1810066487);
        Integer term156686 = new Integer(12697707);
        ArrayList term156678 = new ArrayList();
        ((ArrayList) term156678).add(term156680);
        ((ArrayList) term156678).add(term156682);
        ((ArrayList) term156678).add(term156684);
        ((ArrayList) term156678).add(term156686);
        ArrayList term156690 = new ArrayList();
        term156311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term156313 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term156315 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156346 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156311, term156311.getClass(), "id", 1793595070224541046L);
        setLongField(term156313, term156313.getClass(), "id", -4971115993947209680L);
        setLongField(term156315, term156315.getClass(), "id", -8422750569803860744L);
        setField(term156315, term156315.getClass(), "extId", term156317);
        setField(term156315, term156315.getClass(), "luid", "gQbWOQsNZq");
        setIntField(term156332, term156332.getClass(), "year", 2029);
        setShortField(term156332, term156332.getClass(), "month", (short) 6);
        setShortField(term156332, term156332.getClass(), "day", (short) 25);
        setField(term156331, term156331.getClass(), "date", term156332);
        setByteField(term156336, term156336.getClass(), "hour", (byte) 14);
        setByteField(term156336, term156336.getClass(), "minute", (byte) 19);
        setByteField(term156336, term156336.getClass(), "second", (byte) 52);
        setIntField(term156336, term156336.getClass(), "nano", 250367769);
        setField(term156331, term156331.getClass(), "time", term156336);
        setField(term156315, term156315.getClass(), "registerTime", term156331);
        setIntField(term156342, term156342.getClass(), "year", 2011);
        setShortField(term156342, term156342.getClass(), "month", (short) 11);
        setShortField(term156342, term156342.getClass(), "day", (short) 24);
        setField(term156341, term156341.getClass(), "date", term156342);
        setByteField(term156346, term156346.getClass(), "hour", (byte) 5);
        setByteField(term156346, term156346.getClass(), "minute", (byte) 45);
        setByteField(term156346, term156346.getClass(), "second", (byte) 11);
        setIntField(term156346, term156346.getClass(), "nano", 438339982);
        setField(term156341, term156341.getClass(), "time", term156346);
        setField(term156315, term156315.getClass(), "accessTime", term156341);
        setField(term156313, term156313.getClass(), "card", term156315);
        setField(term156313, term156313.getClass(), "userName", "gwXrkdkdqW");
        setIntField(term156313, term156313.getClass(), "isNetMember", -1779673407);
        setIntField(term156313, term156313.getClass(), "iconId", -974331461);
        setIntField(term156313, term156313.getClass(), "plateId", -1970561622);
        setIntField(term156313, term156313.getClass(), "titleId", -1823273876);
        setIntField(term156313, term156313.getClass(), "partnerId", -1730970144);
        setIntField(term156313, term156313.getClass(), "frameId", 1746099578);
        setIntField(term156313, term156313.getClass(), "selectMapId", -783114572);
        setIntField(term156313, term156313.getClass(), "totalAwake", 1808573799);
        setIntField(term156313, term156313.getClass(), "gradeRating", 1246473923);
        setIntField(term156313, term156313.getClass(), "musicRating", -1966362089);
        setIntField(term156313, term156313.getClass(), "playerRating", -590160537);
        setIntField(term156313, term156313.getClass(), "highestRating", 338926069);
        setIntField(term156313, term156313.getClass(), "gradeRank", 1270815383);
        setIntField(term156313, term156313.getClass(), "classRank", -1570777149);
        setIntField(term156313, term156313.getClass(), "courseRank", 1402458571);
        setField(term156313, term156313.getClass(), "charaSlot", term156378);
        setField(term156313, term156313.getClass(), "charaLockSlot", term156384);
        setLongField(term156313, term156313.getClass(), "contentBit", -3174182568917015653L);
        setIntField(term156313, term156313.getClass(), "playCount", 1057231536);
        setField(term156313, term156313.getClass(), "eventWatchedDate", "ePMStkWVSW");
        setField(term156313, term156313.getClass(), "lastGameId", "lYCXiqdVVs");
        setField(term156313, term156313.getClass(), "lastRomVersion", "AwEMMAveFP");
        setField(term156313, term156313.getClass(), "lastDataVersion", "uILgJuNCYC");
        setField(term156313, term156313.getClass(), "lastLoginDate", "gUkbWFfDwB");
        setField(term156313, term156313.getClass(), "lastPlayDate", "kTamONbRjQ");
        setIntField(term156313, term156313.getClass(), "lastPlayCredit", 1094699239);
        setIntField(term156313, term156313.getClass(), "lastPlayMode", -340660877);
        setIntField(term156313, term156313.getClass(), "lastPlaceId", -1057260995);
        setField(term156313, term156313.getClass(), "lastPlaceName", "hGULbvEJOJ");
        setIntField(term156313, term156313.getClass(), "lastAllNetId", 2052974699);
        setIntField(term156313, term156313.getClass(), "lastRegionId", -1104398051);
        setField(term156313, term156313.getClass(), "lastRegionName", "mHRhpRdJAm");
        setField(term156313, term156313.getClass(), "lastClientId", "JPPiPXJaoa");
        setField(term156313, term156313.getClass(), "lastCountryCode", "fGLEhwmSAi");
        setIntField(term156313, term156313.getClass(), "lastSelectEMoney", 1965135387);
        setIntField(term156313, term156313.getClass(), "lastSelectTicket", 1954267797);
        setIntField(term156313, term156313.getClass(), "lastSelectCourse", 1329325699);
        setIntField(term156313, term156313.getClass(), "lastCountCourse", 851318857);
        setField(term156313, term156313.getClass(), "firstGameId", "oBoeDHJtuf");
        setField(term156313, term156313.getClass(), "firstRomVersion", "NVbdJpwYOX");
        setField(term156313, term156313.getClass(), "firstDataVersion", "zDqikHgSHj");
        setField(term156313, term156313.getClass(), "firstPlayDate", "JwEjJzczOl");
        setField(term156313, term156313.getClass(), "compatibleCmVersion", "FsIwpRCskv");
        setField(term156313, term156313.getClass(), "dailyBonusDate", "tuIzCHeOzK");
        setField(term156313, term156313.getClass(), "dailyCourseBonusDate", "czPFpmmjeR");
        setField(term156313, term156313.getClass(), "lastPairLoginDate", "iwjGXKxveT");
        setField(term156313, term156313.getClass(), "lastTrialPlayDate", "nShYXXfNhZ");
        setIntField(term156313, term156313.getClass(), "playVsCount", 72185115);
        setIntField(term156313, term156313.getClass(), "playSyncCount", 2111617419);
        setIntField(term156313, term156313.getClass(), "winCount", 1210867323);
        setIntField(term156313, term156313.getClass(), "helpCount", 27791137);
        setIntField(term156313, term156313.getClass(), "comboCount", 1963687417);
        setLongField(term156313, term156313.getClass(), "totalDeluxscore", -5482642096772378137L);
        setLongField(term156313, term156313.getClass(), "totalBasicDeluxscore", -8768240613860401887L);
        setLongField(term156313, term156313.getClass(), "totalAdvancedDeluxscore", 8879904246779438572L);
        setLongField(term156313, term156313.getClass(), "totalExpertDeluxscore", -1874151381486412150L);
        setLongField(term156313, term156313.getClass(), "totalMasterDeluxscore", 9142527737239136670L);
        setLongField(term156313, term156313.getClass(), "totalReMasterDeluxscore", -3156457124749522987L);
        setIntField(term156313, term156313.getClass(), "totalSync", -965855146);
        setIntField(term156313, term156313.getClass(), "totalBasicSync", 197583048);
        setIntField(term156313, term156313.getClass(), "totalAdvancedSync", -1011618744);
        setIntField(term156313, term156313.getClass(), "totalExpertSync", -1939207343);
        setIntField(term156313, term156313.getClass(), "totalMasterSync", -1542332267);
        setIntField(term156313, term156313.getClass(), "totalReMasterSync", 511979240);
        setLongField(term156313, term156313.getClass(), "totalAchievement", 20026154777394470L);
        setLongField(term156313, term156313.getClass(), "totalBasicAchievement", 7108298520514144896L);
        setLongField(term156313, term156313.getClass(), "totalAdvancedAchievement", 6187770300210095908L);
        setLongField(term156313, term156313.getClass(), "totalExpertAchievement", 3941156330515774726L);
        setLongField(term156313, term156313.getClass(), "totalMasterAchievement", -6858496236542861868L);
        setLongField(term156313, term156313.getClass(), "totalReMasterAchievement", 7749759205937611432L);
        setLongField(term156313, term156313.getClass(), "playerOldRating", -6617910489517703572L);
        setLongField(term156313, term156313.getClass(), "playerNewRating", 8422271285152148336L);
        setIntField(term156313, term156313.getClass(), "banState", 1453502162);
        setLongField(term156313, term156313.getClass(), "dateTime", -4128797968092293431L);
        setField(term156311, term156311.getClass(), "user", term156313);
        setIntField(term156311, term156311.getClass(), "selectMusicId", -1053363959);
        setIntField(term156311, term156311.getClass(), "selectDifficultyId", 1963496562);
        setIntField(term156311, term156311.getClass(), "categoryIndex", -866469192);
        setIntField(term156311, term156311.getClass(), "musicIndex", 681850120);
        setIntField(term156311, term156311.getClass(), "extraFlag", -106365496);
        setIntField(term156311, term156311.getClass(), "selectScoreType", -1705194235);
        setLongField(term156311, term156311.getClass(), "extendContentBit", -145719648620089230L);
        setBooleanField(term156311, term156311.getClass(), "isPhotoAgree", true);
        setBooleanField(term156311, term156311.getClass(), "isGotoCodeRead", false);
        setBooleanField(term156311, term156311.getClass(), "selectResultDetails", true);
        setIntField(term156311, term156311.getClass(), "sortCategorySetting", -1378662649);
        setIntField(term156311, term156311.getClass(), "sortMusicSetting", -892038297);
        setField(term156311, term156311.getClass(), "selectedCardList", term156678);
        setField(term156311, term156311.getClass(), "encountMapNpcList", term156690);
        term156694 = new Integer(916168616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term156694;
        callMethod(klass, "setSelectScoreType", argTypes, term156311, args);
    }

};


