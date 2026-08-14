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

public class UserDetail_getTotalExpertAchievement_166634009770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235158;

    public UserDetail_getTotalExpertAchievement_166634009770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235162 = new Long(3103198349031409063L);
        Integer term235225 = new Integer(1234771885);
        Integer term235227 = new Integer(1821658782);
        Integer term235229 = new Integer(871613900);
        Integer term235231 = new Integer(1322676409);
        Integer term235233 = new Integer(-954764876);
        Integer term235235 = new Integer(1870177323);
        Integer term235237 = new Integer(-1027146644);
        Integer term235239 = new Integer(341013967);
        Integer term235241 = new Integer(1873439089);
        ArrayList term235223 = new ArrayList();
        ((ArrayList) term235223).add(term235225);
        ((ArrayList) term235223).add(term235227);
        ((ArrayList) term235223).add(term235229);
        ((ArrayList) term235223).add(term235231);
        ((ArrayList) term235223).add(term235233);
        ((ArrayList) term235223).add(term235235);
        ((ArrayList) term235223).add(term235237);
        ((ArrayList) term235223).add(term235239);
        ((ArrayList) term235223).add(term235241);
        ArrayList term235245 = new ArrayList();
        term235158 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term235160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term235176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term235186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term235158, term235158.getClass(), "id", -7646899338332480839L);
        setLongField(term235160, term235160.getClass(), "id", 6759680599257464822L);
        setField(term235160, term235160.getClass(), "extId", term235162);
        setField(term235160, term235160.getClass(), "luid", "wCkJXDKrUp");
        setIntField(term235177, term235177.getClass(), "year", 2010);
        setShortField(term235177, term235177.getClass(), "month", (short) 5);
        setShortField(term235177, term235177.getClass(), "day", (short) 14);
        setField(term235176, term235176.getClass(), "date", term235177);
        setByteField(term235181, term235181.getClass(), "hour", (byte) 17);
        setByteField(term235181, term235181.getClass(), "minute", (byte) 11);
        setByteField(term235181, term235181.getClass(), "second", (byte) 30);
        setIntField(term235181, term235181.getClass(), "nano", 641019384);
        setField(term235176, term235176.getClass(), "time", term235181);
        setField(term235160, term235160.getClass(), "registerTime", term235176);
        setIntField(term235187, term235187.getClass(), "year", 2022);
        setShortField(term235187, term235187.getClass(), "month", (short) 9);
        setShortField(term235187, term235187.getClass(), "day", (short) 6);
        setField(term235186, term235186.getClass(), "date", term235187);
        setByteField(term235191, term235191.getClass(), "hour", (byte) 0);
        setByteField(term235191, term235191.getClass(), "minute", (byte) 36);
        setByteField(term235191, term235191.getClass(), "second", (byte) 57);
        setIntField(term235191, term235191.getClass(), "nano", 623892951);
        setField(term235186, term235186.getClass(), "time", term235191);
        setField(term235160, term235160.getClass(), "accessTime", term235186);
        setField(term235158, term235158.getClass(), "card", term235160);
        setField(term235158, term235158.getClass(), "userName", "NgJJQVugOQ");
        setIntField(term235158, term235158.getClass(), "isNetMember", -1805354048);
        setIntField(term235158, term235158.getClass(), "iconId", -6894071);
        setIntField(term235158, term235158.getClass(), "plateId", 958532517);
        setIntField(term235158, term235158.getClass(), "titleId", 1383798608);
        setIntField(term235158, term235158.getClass(), "partnerId", -238731977);
        setIntField(term235158, term235158.getClass(), "frameId", -602134389);
        setIntField(term235158, term235158.getClass(), "selectMapId", 298623505);
        setIntField(term235158, term235158.getClass(), "totalAwake", -45942937);
        setIntField(term235158, term235158.getClass(), "gradeRating", 1476229754);
        setIntField(term235158, term235158.getClass(), "musicRating", 286501564);
        setIntField(term235158, term235158.getClass(), "playerRating", -1175270067);
        setIntField(term235158, term235158.getClass(), "highestRating", 157082130);
        setIntField(term235158, term235158.getClass(), "gradeRank", -772180404);
        setIntField(term235158, term235158.getClass(), "classRank", -1972172179);
        setIntField(term235158, term235158.getClass(), "courseRank", 2021461040);
        setField(term235158, term235158.getClass(), "charaSlot", term235223);
        setField(term235158, term235158.getClass(), "charaLockSlot", term235245);
        setLongField(term235158, term235158.getClass(), "contentBit", 4578508757232108216L);
        setIntField(term235158, term235158.getClass(), "playCount", -253613650);
        setField(term235158, term235158.getClass(), "eventWatchedDate", "yavShYfpzp");
        setField(term235158, term235158.getClass(), "lastGameId", "wMZoTYqRWV");
        setField(term235158, term235158.getClass(), "lastRomVersion", "IPZjpMvLsa");
        setField(term235158, term235158.getClass(), "lastDataVersion", "MOtWhQGbIj");
        setField(term235158, term235158.getClass(), "lastLoginDate", "VdjPvREeyI");
        setField(term235158, term235158.getClass(), "lastPlayDate", "nNqIIVCGzo");
        setIntField(term235158, term235158.getClass(), "lastPlayCredit", 598417977);
        setIntField(term235158, term235158.getClass(), "lastPlayMode", -594010352);
        setIntField(term235158, term235158.getClass(), "lastPlaceId", 1901360390);
        setField(term235158, term235158.getClass(), "lastPlaceName", "nWaFLoaXIX");
        setIntField(term235158, term235158.getClass(), "lastAllNetId", 2112491155);
        setIntField(term235158, term235158.getClass(), "lastRegionId", 1153767678);
        setField(term235158, term235158.getClass(), "lastRegionName", "DmaQuEDBEG");
        setField(term235158, term235158.getClass(), "lastClientId", "aaNzgFeDgm");
        setField(term235158, term235158.getClass(), "lastCountryCode", "ytiHcLzHGW");
        setIntField(term235158, term235158.getClass(), "lastSelectEMoney", 252401222);
        setIntField(term235158, term235158.getClass(), "lastSelectTicket", 2136690836);
        setIntField(term235158, term235158.getClass(), "lastSelectCourse", 1415141329);
        setIntField(term235158, term235158.getClass(), "lastCountCourse", 1866488615);
        setField(term235158, term235158.getClass(), "firstGameId", "rmCPjphyKc");
        setField(term235158, term235158.getClass(), "firstRomVersion", "utbzEJyvkT");
        setField(term235158, term235158.getClass(), "firstDataVersion", "EGuWNBnXmf");
        setField(term235158, term235158.getClass(), "firstPlayDate", "ZLrfDlvNrO");
        setField(term235158, term235158.getClass(), "compatibleCmVersion", "qyHVBwYBiI");
        setField(term235158, term235158.getClass(), "dailyBonusDate", "OvKCcDcgnu");
        setField(term235158, term235158.getClass(), "dailyCourseBonusDate", "zSnQxCKMoz");
        setField(term235158, term235158.getClass(), "lastPairLoginDate", "OEZrCUzBFY");
        setField(term235158, term235158.getClass(), "lastTrialPlayDate", "auaGyHcPwZ");
        setIntField(term235158, term235158.getClass(), "playVsCount", 303848886);
        setIntField(term235158, term235158.getClass(), "playSyncCount", 1881530712);
        setIntField(term235158, term235158.getClass(), "winCount", 222708508);
        setIntField(term235158, term235158.getClass(), "helpCount", 1601090042);
        setIntField(term235158, term235158.getClass(), "comboCount", 1841239584);
        setLongField(term235158, term235158.getClass(), "totalDeluxscore", -8350558671563402440L);
        setLongField(term235158, term235158.getClass(), "totalBasicDeluxscore", -8545542915745803688L);
        setLongField(term235158, term235158.getClass(), "totalAdvancedDeluxscore", 2093720573953757774L);
        setLongField(term235158, term235158.getClass(), "totalExpertDeluxscore", -7359299566670725640L);
        setLongField(term235158, term235158.getClass(), "totalMasterDeluxscore", 5122235896758869025L);
        setLongField(term235158, term235158.getClass(), "totalReMasterDeluxscore", 1639764991428545540L);
        setIntField(term235158, term235158.getClass(), "totalSync", 1759632148);
        setIntField(term235158, term235158.getClass(), "totalBasicSync", -929628156);
        setIntField(term235158, term235158.getClass(), "totalAdvancedSync", 1662377107);
        setIntField(term235158, term235158.getClass(), "totalExpertSync", -270785615);
        setIntField(term235158, term235158.getClass(), "totalMasterSync", 1707036301);
        setIntField(term235158, term235158.getClass(), "totalReMasterSync", 19933800);
        setLongField(term235158, term235158.getClass(), "totalAchievement", -2585624432000034107L);
        setLongField(term235158, term235158.getClass(), "totalBasicAchievement", 8327431796101021119L);
        setLongField(term235158, term235158.getClass(), "totalAdvancedAchievement", 4135426471711941594L);
        setLongField(term235158, term235158.getClass(), "totalExpertAchievement", -6076971976423849918L);
        setLongField(term235158, term235158.getClass(), "totalMasterAchievement", -6147480950782624972L);
        setLongField(term235158, term235158.getClass(), "totalReMasterAchievement", 4552903135246330307L);
        setLongField(term235158, term235158.getClass(), "playerOldRating", 2293806674628074430L);
        setLongField(term235158, term235158.getClass(), "playerNewRating", 8769239443508889370L);
        setIntField(term235158, term235158.getClass(), "banState", -298980528);
        setLongField(term235158, term235158.getClass(), "dateTime", 7242225263554767514L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertAchievement", argTypes, term235158, args);
    }

};


