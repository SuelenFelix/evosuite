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

public class UserDetail_getPlayVsCount_205169592050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223900;

    public UserDetail_getPlayVsCount_205169592050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223904 = new Long(4811527754205378980L);
        Integer term223967 = new Integer(-214099950);
        Integer term223969 = new Integer(-1324210306);
        ArrayList term223965 = new ArrayList();
        ((ArrayList) term223965).add(term223967);
        ((ArrayList) term223965).add(term223969);
        Integer term223975 = new Integer(-1148507981);
        Integer term223977 = new Integer(149806587);
        ArrayList term223973 = new ArrayList();
        ((ArrayList) term223973).add(term223975);
        ((ArrayList) term223973).add(term223977);
        term223900 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term223902 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term223918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term223928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223933 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term223900, term223900.getClass(), "id", -1933693943060764133L);
        setLongField(term223902, term223902.getClass(), "id", -4003046645689014889L);
        setField(term223902, term223902.getClass(), "extId", term223904);
        setField(term223902, term223902.getClass(), "luid", "LIRwUxQwJQ");
        setIntField(term223919, term223919.getClass(), "year", 2023);
        setShortField(term223919, term223919.getClass(), "month", (short) 3);
        setShortField(term223919, term223919.getClass(), "day", (short) 26);
        setField(term223918, term223918.getClass(), "date", term223919);
        setByteField(term223923, term223923.getClass(), "hour", (byte) 7);
        setByteField(term223923, term223923.getClass(), "minute", (byte) 20);
        setByteField(term223923, term223923.getClass(), "second", (byte) 59);
        setIntField(term223923, term223923.getClass(), "nano", 990229662);
        setField(term223918, term223918.getClass(), "time", term223923);
        setField(term223902, term223902.getClass(), "registerTime", term223918);
        setIntField(term223929, term223929.getClass(), "year", 2028);
        setShortField(term223929, term223929.getClass(), "month", (short) 3);
        setShortField(term223929, term223929.getClass(), "day", (short) 16);
        setField(term223928, term223928.getClass(), "date", term223929);
        setByteField(term223933, term223933.getClass(), "hour", (byte) 3);
        setByteField(term223933, term223933.getClass(), "minute", (byte) 36);
        setByteField(term223933, term223933.getClass(), "second", (byte) 15);
        setIntField(term223933, term223933.getClass(), "nano", 536214083);
        setField(term223928, term223928.getClass(), "time", term223933);
        setField(term223902, term223902.getClass(), "accessTime", term223928);
        setField(term223900, term223900.getClass(), "card", term223902);
        setField(term223900, term223900.getClass(), "userName", "zkYdmJnPHQ");
        setIntField(term223900, term223900.getClass(), "isNetMember", -2047451359);
        setIntField(term223900, term223900.getClass(), "iconId", 460067592);
        setIntField(term223900, term223900.getClass(), "plateId", 2077115892);
        setIntField(term223900, term223900.getClass(), "titleId", -1419433911);
        setIntField(term223900, term223900.getClass(), "partnerId", 1822969869);
        setIntField(term223900, term223900.getClass(), "frameId", -1408911173);
        setIntField(term223900, term223900.getClass(), "selectMapId", -1658565244);
        setIntField(term223900, term223900.getClass(), "totalAwake", 222302842);
        setIntField(term223900, term223900.getClass(), "gradeRating", -1879308935);
        setIntField(term223900, term223900.getClass(), "musicRating", 1433334366);
        setIntField(term223900, term223900.getClass(), "playerRating", 1570982083);
        setIntField(term223900, term223900.getClass(), "highestRating", 79001036);
        setIntField(term223900, term223900.getClass(), "gradeRank", -2128177291);
        setIntField(term223900, term223900.getClass(), "classRank", -1298705021);
        setIntField(term223900, term223900.getClass(), "courseRank", 802170906);
        setField(term223900, term223900.getClass(), "charaSlot", term223965);
        setField(term223900, term223900.getClass(), "charaLockSlot", term223973);
        setLongField(term223900, term223900.getClass(), "contentBit", 6658691713150865522L);
        setIntField(term223900, term223900.getClass(), "playCount", 39907880);
        setField(term223900, term223900.getClass(), "eventWatchedDate", "eKrvhRMeKX");
        setField(term223900, term223900.getClass(), "lastGameId", "MXnvohzLvr");
        setField(term223900, term223900.getClass(), "lastRomVersion", "DNPdhtkeVM");
        setField(term223900, term223900.getClass(), "lastDataVersion", "VBYbHFvBYL");
        setField(term223900, term223900.getClass(), "lastLoginDate", "oStLILVrJT");
        setField(term223900, term223900.getClass(), "lastPlayDate", "aNjBtIPdyW");
        setIntField(term223900, term223900.getClass(), "lastPlayCredit", 358366676);
        setIntField(term223900, term223900.getClass(), "lastPlayMode", -18998104);
        setIntField(term223900, term223900.getClass(), "lastPlaceId", -1335254334);
        setField(term223900, term223900.getClass(), "lastPlaceName", "GJihgIWDBW");
        setIntField(term223900, term223900.getClass(), "lastAllNetId", 2039605156);
        setIntField(term223900, term223900.getClass(), "lastRegionId", -1335894442);
        setField(term223900, term223900.getClass(), "lastRegionName", "NlinVPPOra");
        setField(term223900, term223900.getClass(), "lastClientId", "cqlcNoSGlk");
        setField(term223900, term223900.getClass(), "lastCountryCode", "JMXPWYyevd");
        setIntField(term223900, term223900.getClass(), "lastSelectEMoney", 269878407);
        setIntField(term223900, term223900.getClass(), "lastSelectTicket", 1951853449);
        setIntField(term223900, term223900.getClass(), "lastSelectCourse", -1576630796);
        setIntField(term223900, term223900.getClass(), "lastCountCourse", -1476732663);
        setField(term223900, term223900.getClass(), "firstGameId", "UoKbiqlYaP");
        setField(term223900, term223900.getClass(), "firstRomVersion", "KnKwEJJmlp");
        setField(term223900, term223900.getClass(), "firstDataVersion", "sXCFvcWXVQ");
        setField(term223900, term223900.getClass(), "firstPlayDate", "BuezMdZiDi");
        setField(term223900, term223900.getClass(), "compatibleCmVersion", "XyXBTcjQXz");
        setField(term223900, term223900.getClass(), "dailyBonusDate", "irrGjVGFVJ");
        setField(term223900, term223900.getClass(), "dailyCourseBonusDate", "CPSMRfiYiL");
        setField(term223900, term223900.getClass(), "lastPairLoginDate", "IlNjdEdHul");
        setField(term223900, term223900.getClass(), "lastTrialPlayDate", "nHGTkPFggH");
        setIntField(term223900, term223900.getClass(), "playVsCount", 1985555115);
        setIntField(term223900, term223900.getClass(), "playSyncCount", 2017881557);
        setIntField(term223900, term223900.getClass(), "winCount", 1409539871);
        setIntField(term223900, term223900.getClass(), "helpCount", -252004629);
        setIntField(term223900, term223900.getClass(), "comboCount", 1176748358);
        setLongField(term223900, term223900.getClass(), "totalDeluxscore", -6088951695311332675L);
        setLongField(term223900, term223900.getClass(), "totalBasicDeluxscore", -8361095709109236209L);
        setLongField(term223900, term223900.getClass(), "totalAdvancedDeluxscore", 8345721568537802019L);
        setLongField(term223900, term223900.getClass(), "totalExpertDeluxscore", 6375393214793723627L);
        setLongField(term223900, term223900.getClass(), "totalMasterDeluxscore", -5691229805091221434L);
        setLongField(term223900, term223900.getClass(), "totalReMasterDeluxscore", -8861409251849023554L);
        setIntField(term223900, term223900.getClass(), "totalSync", -888350999);
        setIntField(term223900, term223900.getClass(), "totalBasicSync", 2010116469);
        setIntField(term223900, term223900.getClass(), "totalAdvancedSync", 564948);
        setIntField(term223900, term223900.getClass(), "totalExpertSync", -515527615);
        setIntField(term223900, term223900.getClass(), "totalMasterSync", 1444212583);
        setIntField(term223900, term223900.getClass(), "totalReMasterSync", -663888705);
        setLongField(term223900, term223900.getClass(), "totalAchievement", -6221207054545737477L);
        setLongField(term223900, term223900.getClass(), "totalBasicAchievement", -1547432966497730106L);
        setLongField(term223900, term223900.getClass(), "totalAdvancedAchievement", 1514689428748955863L);
        setLongField(term223900, term223900.getClass(), "totalExpertAchievement", 8422562998353389254L);
        setLongField(term223900, term223900.getClass(), "totalMasterAchievement", 2579025162835686352L);
        setLongField(term223900, term223900.getClass(), "totalReMasterAchievement", -3022212091469657775L);
        setLongField(term223900, term223900.getClass(), "playerOldRating", 2883675100866950179L);
        setLongField(term223900, term223900.getClass(), "playerNewRating", -2383745875227495097L);
        setIntField(term223900, term223900.getClass(), "banState", -1081559918);
        setLongField(term223900, term223900.getClass(), "dateTime", -982807115169128327L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayVsCount", argTypes, term223900, args);
    }

};


