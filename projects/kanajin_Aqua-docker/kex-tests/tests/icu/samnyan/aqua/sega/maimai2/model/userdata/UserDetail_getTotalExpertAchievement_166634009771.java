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

public class UserDetail_getTotalExpertAchievement_166634009771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235213;

    public UserDetail_getTotalExpertAchievement_166634009771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235217 = new Long(3103198349031409063L);
        Integer term235280 = new Integer(1234771885);
        Integer term235282 = new Integer(1821658782);
        Integer term235284 = new Integer(871613900);
        Integer term235286 = new Integer(1322676409);
        Integer term235288 = new Integer(-954764876);
        Integer term235290 = new Integer(1870177323);
        Integer term235292 = new Integer(-1027146644);
        Integer term235294 = new Integer(341013967);
        Integer term235296 = new Integer(1873439089);
        ArrayList term235278 = new ArrayList();
        ((ArrayList) term235278).add(term235280);
        ((ArrayList) term235278).add(term235282);
        ((ArrayList) term235278).add(term235284);
        ((ArrayList) term235278).add(term235286);
        ((ArrayList) term235278).add(term235288);
        ((ArrayList) term235278).add(term235290);
        ((ArrayList) term235278).add(term235292);
        ((ArrayList) term235278).add(term235294);
        ((ArrayList) term235278).add(term235296);
        ArrayList term235300 = new ArrayList();
        term235213 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term235215 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term235231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term235241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235246 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term235213, term235213.getClass(), "id", -7646899338332480839L);
        setLongField(term235215, term235215.getClass(), "id", 6759680599257464822L);
        setField(term235215, term235215.getClass(), "extId", term235217);
        setField(term235215, term235215.getClass(), "luid", "wCkJXDKrUp");
        setIntField(term235232, term235232.getClass(), "year", 2010);
        setShortField(term235232, term235232.getClass(), "month", (short) 5);
        setShortField(term235232, term235232.getClass(), "day", (short) 14);
        setField(term235231, term235231.getClass(), "date", term235232);
        setByteField(term235236, term235236.getClass(), "hour", (byte) 17);
        setByteField(term235236, term235236.getClass(), "minute", (byte) 11);
        setByteField(term235236, term235236.getClass(), "second", (byte) 30);
        setIntField(term235236, term235236.getClass(), "nano", 641019384);
        setField(term235231, term235231.getClass(), "time", term235236);
        setField(term235215, term235215.getClass(), "registerTime", term235231);
        setIntField(term235242, term235242.getClass(), "year", 2022);
        setShortField(term235242, term235242.getClass(), "month", (short) 9);
        setShortField(term235242, term235242.getClass(), "day", (short) 6);
        setField(term235241, term235241.getClass(), "date", term235242);
        setByteField(term235246, term235246.getClass(), "hour", (byte) 0);
        setByteField(term235246, term235246.getClass(), "minute", (byte) 36);
        setByteField(term235246, term235246.getClass(), "second", (byte) 57);
        setIntField(term235246, term235246.getClass(), "nano", 623892951);
        setField(term235241, term235241.getClass(), "time", term235246);
        setField(term235215, term235215.getClass(), "accessTime", term235241);
        setField(term235213, term235213.getClass(), "card", term235215);
        setField(term235213, term235213.getClass(), "userName", "NgJJQVugOQ");
        setIntField(term235213, term235213.getClass(), "isNetMember", -1805354048);
        setIntField(term235213, term235213.getClass(), "iconId", -6894071);
        setIntField(term235213, term235213.getClass(), "plateId", 958532517);
        setIntField(term235213, term235213.getClass(), "titleId", 1383798608);
        setIntField(term235213, term235213.getClass(), "partnerId", -238731977);
        setIntField(term235213, term235213.getClass(), "frameId", -602134389);
        setIntField(term235213, term235213.getClass(), "selectMapId", 298623505);
        setIntField(term235213, term235213.getClass(), "totalAwake", -45942937);
        setIntField(term235213, term235213.getClass(), "gradeRating", 1476229754);
        setIntField(term235213, term235213.getClass(), "musicRating", 286501564);
        setIntField(term235213, term235213.getClass(), "playerRating", -1175270067);
        setIntField(term235213, term235213.getClass(), "highestRating", 157082130);
        setIntField(term235213, term235213.getClass(), "gradeRank", -772180404);
        setIntField(term235213, term235213.getClass(), "classRank", -1972172179);
        setIntField(term235213, term235213.getClass(), "courseRank", 2021461040);
        setField(term235213, term235213.getClass(), "charaSlot", term235278);
        setField(term235213, term235213.getClass(), "charaLockSlot", term235300);
        setLongField(term235213, term235213.getClass(), "contentBit", 4578508757232108216L);
        setIntField(term235213, term235213.getClass(), "playCount", -253613650);
        setField(term235213, term235213.getClass(), "eventWatchedDate", "yavShYfpzp");
        setField(term235213, term235213.getClass(), "lastGameId", "wMZoTYqRWV");
        setField(term235213, term235213.getClass(), "lastRomVersion", "IPZjpMvLsa");
        setField(term235213, term235213.getClass(), "lastDataVersion", "MOtWhQGbIj");
        setField(term235213, term235213.getClass(), "lastLoginDate", "VdjPvREeyI");
        setField(term235213, term235213.getClass(), "lastPlayDate", "nNqIIVCGzo");
        setIntField(term235213, term235213.getClass(), "lastPlayCredit", 598417977);
        setIntField(term235213, term235213.getClass(), "lastPlayMode", -594010352);
        setIntField(term235213, term235213.getClass(), "lastPlaceId", 1901360390);
        setField(term235213, term235213.getClass(), "lastPlaceName", "nWaFLoaXIX");
        setIntField(term235213, term235213.getClass(), "lastAllNetId", 2112491155);
        setIntField(term235213, term235213.getClass(), "lastRegionId", 1153767678);
        setField(term235213, term235213.getClass(), "lastRegionName", "DmaQuEDBEG");
        setField(term235213, term235213.getClass(), "lastClientId", "aaNzgFeDgm");
        setField(term235213, term235213.getClass(), "lastCountryCode", "ytiHcLzHGW");
        setIntField(term235213, term235213.getClass(), "lastSelectEMoney", 252401222);
        setIntField(term235213, term235213.getClass(), "lastSelectTicket", 2136690836);
        setIntField(term235213, term235213.getClass(), "lastSelectCourse", 1415141329);
        setIntField(term235213, term235213.getClass(), "lastCountCourse", 1866488615);
        setField(term235213, term235213.getClass(), "firstGameId", "rmCPjphyKc");
        setField(term235213, term235213.getClass(), "firstRomVersion", "utbzEJyvkT");
        setField(term235213, term235213.getClass(), "firstDataVersion", "EGuWNBnXmf");
        setField(term235213, term235213.getClass(), "firstPlayDate", "ZLrfDlvNrO");
        setField(term235213, term235213.getClass(), "compatibleCmVersion", "qyHVBwYBiI");
        setField(term235213, term235213.getClass(), "dailyBonusDate", "OvKCcDcgnu");
        setField(term235213, term235213.getClass(), "dailyCourseBonusDate", "zSnQxCKMoz");
        setField(term235213, term235213.getClass(), "lastPairLoginDate", "OEZrCUzBFY");
        setField(term235213, term235213.getClass(), "lastTrialPlayDate", "auaGyHcPwZ");
        setIntField(term235213, term235213.getClass(), "playVsCount", 303848886);
        setIntField(term235213, term235213.getClass(), "playSyncCount", 1881530712);
        setIntField(term235213, term235213.getClass(), "winCount", 222708508);
        setIntField(term235213, term235213.getClass(), "helpCount", 1601090042);
        setIntField(term235213, term235213.getClass(), "comboCount", 1841239584);
        setLongField(term235213, term235213.getClass(), "totalDeluxscore", -8350558671563402440L);
        setLongField(term235213, term235213.getClass(), "totalBasicDeluxscore", -8545542915745803688L);
        setLongField(term235213, term235213.getClass(), "totalAdvancedDeluxscore", 2093720573953757774L);
        setLongField(term235213, term235213.getClass(), "totalExpertDeluxscore", -7359299566670725640L);
        setLongField(term235213, term235213.getClass(), "totalMasterDeluxscore", 5122235896758869025L);
        setLongField(term235213, term235213.getClass(), "totalReMasterDeluxscore", 1639764991428545540L);
        setIntField(term235213, term235213.getClass(), "totalSync", 1759632148);
        setIntField(term235213, term235213.getClass(), "totalBasicSync", -929628156);
        setIntField(term235213, term235213.getClass(), "totalAdvancedSync", 1662377107);
        setIntField(term235213, term235213.getClass(), "totalExpertSync", -270785615);
        setIntField(term235213, term235213.getClass(), "totalMasterSync", 1707036301);
        setIntField(term235213, term235213.getClass(), "totalReMasterSync", 19933800);
        setLongField(term235213, term235213.getClass(), "totalAchievement", -2585624432000034107L);
        setLongField(term235213, term235213.getClass(), "totalBasicAchievement", 8327431796101021119L);
        setLongField(term235213, term235213.getClass(), "totalAdvancedAchievement", 4135426471711941594L);
        setLongField(term235213, term235213.getClass(), "totalExpertAchievement", -6076971976423849918L);
        setLongField(term235213, term235213.getClass(), "totalMasterAchievement", -6147480950782624972L);
        setLongField(term235213, term235213.getClass(), "totalReMasterAchievement", 4552903135246330307L);
        setLongField(term235213, term235213.getClass(), "playerOldRating", 2293806674628074430L);
        setLongField(term235213, term235213.getClass(), "playerNewRating", 8769239443508889370L);
        setIntField(term235213, term235213.getClass(), "banState", -298980528);
        setLongField(term235213, term235213.getClass(), "dateTime", 7242225263554767514L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertAchievement", argTypes, term235213, args);
    }

};


