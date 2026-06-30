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

public class UserDetail_setTotalReMasterAchievement_667561686149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314594;
     Object term4314943;

    public UserDetail_setTotalReMasterAchievement_667561686149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4314598 = new Long(3971997283680673075L);
        ArrayList term4314659 = new ArrayList();
        Integer term4314665 = new Integer(-685473621);
        Integer term4314667 = new Integer(-1507226157);
        Integer term4314669 = new Integer(2048976325);
        Integer term4314671 = new Integer(1946370960);
        Integer term4314673 = new Integer(-1208286860);
        ArrayList term4314663 = new ArrayList();
        ((ArrayList) term4314663).add(term4314665);
        ((ArrayList) term4314663).add(term4314667);
        ((ArrayList) term4314663).add(term4314669);
        ((ArrayList) term4314663).add(term4314671);
        ((ArrayList) term4314663).add(term4314673);
        term4314594 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4314596 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4314612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4314613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4314617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4314622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4314623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4314627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4314594, term4314594.getClass(), "id", 2885494698658639447L);
        setLongField(term4314596, term4314596.getClass(), "id", 3212507807235561433L);
        setField(term4314596, term4314596.getClass(), "extId", term4314598);
        setField(term4314596, term4314596.getClass(), "luid", "EwFjMfuGsa");
        setIntField(term4314613, term4314613.getClass(), "year", 2019);
        setShortField(term4314613, term4314613.getClass(), "month", (short) 4);
        setShortField(term4314613, term4314613.getClass(), "day", (short) 12);
        setField(term4314612, term4314612.getClass(), "date", term4314613);
        setByteField(term4314617, term4314617.getClass(), "hour", (byte) 19);
        setByteField(term4314617, term4314617.getClass(), "minute", (byte) 50);
        setByteField(term4314617, term4314617.getClass(), "second", (byte) 46);
        setIntField(term4314617, term4314617.getClass(), "nano", 310311126);
        setField(term4314612, term4314612.getClass(), "time", term4314617);
        setField(term4314596, term4314596.getClass(), "registerTime", term4314612);
        setIntField(term4314623, term4314623.getClass(), "year", 2010);
        setShortField(term4314623, term4314623.getClass(), "month", (short) 7);
        setShortField(term4314623, term4314623.getClass(), "day", (short) 3);
        setField(term4314622, term4314622.getClass(), "date", term4314623);
        setByteField(term4314627, term4314627.getClass(), "hour", (byte) 13);
        setByteField(term4314627, term4314627.getClass(), "minute", (byte) 15);
        setByteField(term4314627, term4314627.getClass(), "second", (byte) 15);
        setIntField(term4314627, term4314627.getClass(), "nano", 392444497);
        setField(term4314622, term4314622.getClass(), "time", term4314627);
        setField(term4314596, term4314596.getClass(), "accessTime", term4314622);
        setField(term4314594, term4314594.getClass(), "card", term4314596);
        setField(term4314594, term4314594.getClass(), "userName", "NWoyxIdrtJ");
        setIntField(term4314594, term4314594.getClass(), "isNetMember", -299081182);
        setIntField(term4314594, term4314594.getClass(), "iconId", -694491335);
        setIntField(term4314594, term4314594.getClass(), "plateId", -1990731165);
        setIntField(term4314594, term4314594.getClass(), "titleId", 1995889373);
        setIntField(term4314594, term4314594.getClass(), "partnerId", -1210805512);
        setIntField(term4314594, term4314594.getClass(), "frameId", -204513239);
        setIntField(term4314594, term4314594.getClass(), "selectMapId", -1244477560);
        setIntField(term4314594, term4314594.getClass(), "totalAwake", 1631446957);
        setIntField(term4314594, term4314594.getClass(), "gradeRating", 920594858);
        setIntField(term4314594, term4314594.getClass(), "musicRating", -792382282);
        setIntField(term4314594, term4314594.getClass(), "playerRating", 1917686725);
        setIntField(term4314594, term4314594.getClass(), "highestRating", -1822438906);
        setIntField(term4314594, term4314594.getClass(), "gradeRank", 1254450875);
        setIntField(term4314594, term4314594.getClass(), "classRank", -1803167987);
        setIntField(term4314594, term4314594.getClass(), "courseRank", -769109749);
        setField(term4314594, term4314594.getClass(), "charaSlot", term4314659);
        setField(term4314594, term4314594.getClass(), "charaLockSlot", term4314663);
        setLongField(term4314594, term4314594.getClass(), "contentBit", 4909309753583708412L);
        setIntField(term4314594, term4314594.getClass(), "playCount", -551841607);
        setField(term4314594, term4314594.getClass(), "eventWatchedDate", "BnBktIyYBH");
        setField(term4314594, term4314594.getClass(), "lastGameId", "AXaebyirSy");
        setField(term4314594, term4314594.getClass(), "lastRomVersion", "IzxMeJJFVf");
        setField(term4314594, term4314594.getClass(), "lastDataVersion", "yJMPooprjH");
        setField(term4314594, term4314594.getClass(), "lastLoginDate", "uvOZwdMgGf");
        setField(term4314594, term4314594.getClass(), "lastPlayDate", "mIJRIeDayp");
        setIntField(term4314594, term4314594.getClass(), "lastPlayCredit", 1284345737);
        setIntField(term4314594, term4314594.getClass(), "lastPlayMode", -146278053);
        setIntField(term4314594, term4314594.getClass(), "lastPlaceId", -666727706);
        setField(term4314594, term4314594.getClass(), "lastPlaceName", "zJfkIpDVhp");
        setIntField(term4314594, term4314594.getClass(), "lastAllNetId", -1822978768);
        setIntField(term4314594, term4314594.getClass(), "lastRegionId", -1904289125);
        setField(term4314594, term4314594.getClass(), "lastRegionName", "qDxCYgTTLS");
        setField(term4314594, term4314594.getClass(), "lastClientId", "ygMkgcHJlp");
        setField(term4314594, term4314594.getClass(), "lastCountryCode", "iMLFxzoGQZ");
        setIntField(term4314594, term4314594.getClass(), "lastSelectEMoney", -36788848);
        setIntField(term4314594, term4314594.getClass(), "lastSelectTicket", -1904050959);
        setIntField(term4314594, term4314594.getClass(), "lastSelectCourse", -963659054);
        setIntField(term4314594, term4314594.getClass(), "lastCountCourse", 1178029373);
        setField(term4314594, term4314594.getClass(), "firstGameId", "sHqYSaDMmS");
        setField(term4314594, term4314594.getClass(), "firstRomVersion", "gLtGyKkdRo");
        setField(term4314594, term4314594.getClass(), "firstDataVersion", "SdJiejkqux");
        setField(term4314594, term4314594.getClass(), "firstPlayDate", "VCTQABBVau");
        setField(term4314594, term4314594.getClass(), "compatibleCmVersion", "mhNMakueav");
        setField(term4314594, term4314594.getClass(), "dailyBonusDate", "IUXQpXPkPk");
        setField(term4314594, term4314594.getClass(), "dailyCourseBonusDate", "QcJqVEPvZf");
        setField(term4314594, term4314594.getClass(), "lastPairLoginDate", "VEdlIMCYLs");
        setField(term4314594, term4314594.getClass(), "lastTrialPlayDate", "tqRYJwrDvf");
        setIntField(term4314594, term4314594.getClass(), "playVsCount", -432304795);
        setIntField(term4314594, term4314594.getClass(), "playSyncCount", 183811212);
        setIntField(term4314594, term4314594.getClass(), "winCount", -2118600532);
        setIntField(term4314594, term4314594.getClass(), "helpCount", 382295631);
        setIntField(term4314594, term4314594.getClass(), "comboCount", -1972906336);
        setLongField(term4314594, term4314594.getClass(), "totalDeluxscore", -5113651334966870709L);
        setLongField(term4314594, term4314594.getClass(), "totalBasicDeluxscore", 8312450883443736208L);
        setLongField(term4314594, term4314594.getClass(), "totalAdvancedDeluxscore", -4428987015863197189L);
        setLongField(term4314594, term4314594.getClass(), "totalExpertDeluxscore", -7497560009371367004L);
        setLongField(term4314594, term4314594.getClass(), "totalMasterDeluxscore", -5815616230551746423L);
        setLongField(term4314594, term4314594.getClass(), "totalReMasterDeluxscore", -3422791258996484226L);
        setIntField(term4314594, term4314594.getClass(), "totalSync", 1573931467);
        setIntField(term4314594, term4314594.getClass(), "totalBasicSync", -131712691);
        setIntField(term4314594, term4314594.getClass(), "totalAdvancedSync", -997166504);
        setIntField(term4314594, term4314594.getClass(), "totalExpertSync", -1824069738);
        setIntField(term4314594, term4314594.getClass(), "totalMasterSync", 938884017);
        setIntField(term4314594, term4314594.getClass(), "totalReMasterSync", -124908304);
        setLongField(term4314594, term4314594.getClass(), "totalAchievement", -3943797915562151002L);
        setLongField(term4314594, term4314594.getClass(), "totalBasicAchievement", 358289931927892836L);
        setLongField(term4314594, term4314594.getClass(), "totalAdvancedAchievement", 6702270438512422137L);
        setLongField(term4314594, term4314594.getClass(), "totalExpertAchievement", -3573395041335909861L);
        setLongField(term4314594, term4314594.getClass(), "totalMasterAchievement", 8261671443631773254L);
        setLongField(term4314594, term4314594.getClass(), "totalReMasterAchievement", -7109119434023710294L);
        setLongField(term4314594, term4314594.getClass(), "playerOldRating", 8169260753715030221L);
        setLongField(term4314594, term4314594.getClass(), "playerNewRating", 7752754615825121635L);
        setIntField(term4314594, term4314594.getClass(), "banState", -1614248735);
        setLongField(term4314594, term4314594.getClass(), "dateTime", 3765081239929652976L);
        term4314943 = new Long(1122001704127047203L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4314943;
        callMethod(klass, "setTotalReMasterAchievement", argTypes, term4314594, args);
    }

};


