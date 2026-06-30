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

public class UserDetail_getLastPairLoginDate_102353251048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4256716;

    public UserDetail_getLastPairLoginDate_102353251048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4256720 = new Long(8021841383006833732L);
        Integer term4256783 = new Integer(257817118);
        ArrayList term4256781 = new ArrayList();
        ((ArrayList) term4256781).add(term4256783);
        Integer term4256789 = new Integer(2037455054);
        Integer term4256791 = new Integer(-2037705033);
        ArrayList term4256787 = new ArrayList();
        ((ArrayList) term4256787).add(term4256789);
        ((ArrayList) term4256787).add(term4256791);
        term4256716 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4256718 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4256734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4256735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4256739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4256744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4256745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4256749 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4256716, term4256716.getClass(), "id", 522230002516175353L);
        setLongField(term4256718, term4256718.getClass(), "id", -903158059308837890L);
        setField(term4256718, term4256718.getClass(), "extId", term4256720);
        setField(term4256718, term4256718.getClass(), "luid", "XogQMeVfIb");
        setIntField(term4256735, term4256735.getClass(), "year", 2029);
        setShortField(term4256735, term4256735.getClass(), "month", (short) 12);
        setShortField(term4256735, term4256735.getClass(), "day", (short) 11);
        setField(term4256734, term4256734.getClass(), "date", term4256735);
        setByteField(term4256739, term4256739.getClass(), "hour", (byte) 10);
        setByteField(term4256739, term4256739.getClass(), "minute", (byte) 40);
        setByteField(term4256739, term4256739.getClass(), "second", (byte) 53);
        setIntField(term4256739, term4256739.getClass(), "nano", 822219240);
        setField(term4256734, term4256734.getClass(), "time", term4256739);
        setField(term4256718, term4256718.getClass(), "registerTime", term4256734);
        setIntField(term4256745, term4256745.getClass(), "year", 2010);
        setShortField(term4256745, term4256745.getClass(), "month", (short) 5);
        setShortField(term4256745, term4256745.getClass(), "day", (short) 14);
        setField(term4256744, term4256744.getClass(), "date", term4256745);
        setByteField(term4256749, term4256749.getClass(), "hour", (byte) 4);
        setByteField(term4256749, term4256749.getClass(), "minute", (byte) 6);
        setByteField(term4256749, term4256749.getClass(), "second", (byte) 39);
        setIntField(term4256749, term4256749.getClass(), "nano", 227714598);
        setField(term4256744, term4256744.getClass(), "time", term4256749);
        setField(term4256718, term4256718.getClass(), "accessTime", term4256744);
        setField(term4256716, term4256716.getClass(), "card", term4256718);
        setField(term4256716, term4256716.getClass(), "userName", "TuhxUhNFEY");
        setIntField(term4256716, term4256716.getClass(), "isNetMember", 497919226);
        setIntField(term4256716, term4256716.getClass(), "iconId", -491005583);
        setIntField(term4256716, term4256716.getClass(), "plateId", 512123115);
        setIntField(term4256716, term4256716.getClass(), "titleId", -2086598947);
        setIntField(term4256716, term4256716.getClass(), "partnerId", -1945991810);
        setIntField(term4256716, term4256716.getClass(), "frameId", -1086861880);
        setIntField(term4256716, term4256716.getClass(), "selectMapId", 822383388);
        setIntField(term4256716, term4256716.getClass(), "totalAwake", 1271212221);
        setIntField(term4256716, term4256716.getClass(), "gradeRating", 417249849);
        setIntField(term4256716, term4256716.getClass(), "musicRating", -687341630);
        setIntField(term4256716, term4256716.getClass(), "playerRating", 1173900455);
        setIntField(term4256716, term4256716.getClass(), "highestRating", 1799352611);
        setIntField(term4256716, term4256716.getClass(), "gradeRank", 307398542);
        setIntField(term4256716, term4256716.getClass(), "classRank", 609844417);
        setIntField(term4256716, term4256716.getClass(), "courseRank", 1719599467);
        setField(term4256716, term4256716.getClass(), "charaSlot", term4256781);
        setField(term4256716, term4256716.getClass(), "charaLockSlot", term4256787);
        setLongField(term4256716, term4256716.getClass(), "contentBit", 415591019892295520L);
        setIntField(term4256716, term4256716.getClass(), "playCount", 1395203392);
        setField(term4256716, term4256716.getClass(), "eventWatchedDate", "unqvcWhEdE");
        setField(term4256716, term4256716.getClass(), "lastGameId", "dnXsAHCvUT");
        setField(term4256716, term4256716.getClass(), "lastRomVersion", "klBGrbwgzW");
        setField(term4256716, term4256716.getClass(), "lastDataVersion", "GpRuPwwWyF");
        setField(term4256716, term4256716.getClass(), "lastLoginDate", "LGXVDLAXXy");
        setField(term4256716, term4256716.getClass(), "lastPlayDate", "VnGbrOKNUl");
        setIntField(term4256716, term4256716.getClass(), "lastPlayCredit", 754629053);
        setIntField(term4256716, term4256716.getClass(), "lastPlayMode", 1307590544);
        setIntField(term4256716, term4256716.getClass(), "lastPlaceId", -1887411122);
        setField(term4256716, term4256716.getClass(), "lastPlaceName", "rPVcGbQAET");
        setIntField(term4256716, term4256716.getClass(), "lastAllNetId", -37875563);
        setIntField(term4256716, term4256716.getClass(), "lastRegionId", -1602871232);
        setField(term4256716, term4256716.getClass(), "lastRegionName", "hZnBRiNsrm");
        setField(term4256716, term4256716.getClass(), "lastClientId", "glTbechHJH");
        setField(term4256716, term4256716.getClass(), "lastCountryCode", "SXaupZwpZq");
        setIntField(term4256716, term4256716.getClass(), "lastSelectEMoney", -902262272);
        setIntField(term4256716, term4256716.getClass(), "lastSelectTicket", -1976571075);
        setIntField(term4256716, term4256716.getClass(), "lastSelectCourse", -1512922462);
        setIntField(term4256716, term4256716.getClass(), "lastCountCourse", 1429003128);
        setField(term4256716, term4256716.getClass(), "firstGameId", "pCTEREQuzc");
        setField(term4256716, term4256716.getClass(), "firstRomVersion", "pGdcosPyvR");
        setField(term4256716, term4256716.getClass(), "firstDataVersion", "wyzDFZqJod");
        setField(term4256716, term4256716.getClass(), "firstPlayDate", "ibhLqyzwgS");
        setField(term4256716, term4256716.getClass(), "compatibleCmVersion", "yvDWchFKXr");
        setField(term4256716, term4256716.getClass(), "dailyBonusDate", "BYcpKBONRa");
        setField(term4256716, term4256716.getClass(), "dailyCourseBonusDate", "tOSSFGcMeP");
        setField(term4256716, term4256716.getClass(), "lastPairLoginDate", "gmCxnVsydU");
        setField(term4256716, term4256716.getClass(), "lastTrialPlayDate", "soXhAxUnyB");
        setIntField(term4256716, term4256716.getClass(), "playVsCount", 940864435);
        setIntField(term4256716, term4256716.getClass(), "playSyncCount", -380366992);
        setIntField(term4256716, term4256716.getClass(), "winCount", -661351453);
        setIntField(term4256716, term4256716.getClass(), "helpCount", 2022465673);
        setIntField(term4256716, term4256716.getClass(), "comboCount", -1239934409);
        setLongField(term4256716, term4256716.getClass(), "totalDeluxscore", 7489525102451666388L);
        setLongField(term4256716, term4256716.getClass(), "totalBasicDeluxscore", 2669156334775247633L);
        setLongField(term4256716, term4256716.getClass(), "totalAdvancedDeluxscore", -2375354774536202449L);
        setLongField(term4256716, term4256716.getClass(), "totalExpertDeluxscore", 678039683158828064L);
        setLongField(term4256716, term4256716.getClass(), "totalMasterDeluxscore", -3030432522802638231L);
        setLongField(term4256716, term4256716.getClass(), "totalReMasterDeluxscore", 2729188016233957767L);
        setIntField(term4256716, term4256716.getClass(), "totalSync", -209007118);
        setIntField(term4256716, term4256716.getClass(), "totalBasicSync", -1310925316);
        setIntField(term4256716, term4256716.getClass(), "totalAdvancedSync", 1101354881);
        setIntField(term4256716, term4256716.getClass(), "totalExpertSync", 1887821398);
        setIntField(term4256716, term4256716.getClass(), "totalMasterSync", 272051296);
        setIntField(term4256716, term4256716.getClass(), "totalReMasterSync", -11971790);
        setLongField(term4256716, term4256716.getClass(), "totalAchievement", -2636364300726418785L);
        setLongField(term4256716, term4256716.getClass(), "totalBasicAchievement", 5625712477300349038L);
        setLongField(term4256716, term4256716.getClass(), "totalAdvancedAchievement", -1046316032975647340L);
        setLongField(term4256716, term4256716.getClass(), "totalExpertAchievement", -4748395679692707156L);
        setLongField(term4256716, term4256716.getClass(), "totalMasterAchievement", 8833815581069408212L);
        setLongField(term4256716, term4256716.getClass(), "totalReMasterAchievement", 8877931064979235213L);
        setLongField(term4256716, term4256716.getClass(), "playerOldRating", -1696794879480553700L);
        setLongField(term4256716, term4256716.getClass(), "playerNewRating", -518951616026771243L);
        setIntField(term4256716, term4256716.getClass(), "banState", 2135340991);
        setLongField(term4256716, term4256716.getClass(), "dateTime", -7859441157190895879L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPairLoginDate", argTypes, term4256716, args);
    }

};


