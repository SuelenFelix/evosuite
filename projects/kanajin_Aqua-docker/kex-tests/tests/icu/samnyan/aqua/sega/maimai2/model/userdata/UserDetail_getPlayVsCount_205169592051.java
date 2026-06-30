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

public class UserDetail_getPlayVsCount_205169592051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223955;

    public UserDetail_getPlayVsCount_205169592051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223959 = new Long(4811527754205378980L);
        Integer term224022 = new Integer(-214099950);
        Integer term224024 = new Integer(-1324210306);
        ArrayList term224020 = new ArrayList();
        ((ArrayList) term224020).add(term224022);
        ((ArrayList) term224020).add(term224024);
        Integer term224030 = new Integer(-1148507981);
        Integer term224032 = new Integer(149806587);
        ArrayList term224028 = new ArrayList();
        ((ArrayList) term224028).add(term224030);
        ((ArrayList) term224028).add(term224032);
        term223955 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term223957 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term223973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term223983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223988 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term223955, term223955.getClass(), "id", -1933693943060764133L);
        setLongField(term223957, term223957.getClass(), "id", -4003046645689014889L);
        setField(term223957, term223957.getClass(), "extId", term223959);
        setField(term223957, term223957.getClass(), "luid", "LIRwUxQwJQ");
        setIntField(term223974, term223974.getClass(), "year", 2023);
        setShortField(term223974, term223974.getClass(), "month", (short) 3);
        setShortField(term223974, term223974.getClass(), "day", (short) 26);
        setField(term223973, term223973.getClass(), "date", term223974);
        setByteField(term223978, term223978.getClass(), "hour", (byte) 7);
        setByteField(term223978, term223978.getClass(), "minute", (byte) 20);
        setByteField(term223978, term223978.getClass(), "second", (byte) 59);
        setIntField(term223978, term223978.getClass(), "nano", 990229662);
        setField(term223973, term223973.getClass(), "time", term223978);
        setField(term223957, term223957.getClass(), "registerTime", term223973);
        setIntField(term223984, term223984.getClass(), "year", 2028);
        setShortField(term223984, term223984.getClass(), "month", (short) 3);
        setShortField(term223984, term223984.getClass(), "day", (short) 16);
        setField(term223983, term223983.getClass(), "date", term223984);
        setByteField(term223988, term223988.getClass(), "hour", (byte) 3);
        setByteField(term223988, term223988.getClass(), "minute", (byte) 36);
        setByteField(term223988, term223988.getClass(), "second", (byte) 15);
        setIntField(term223988, term223988.getClass(), "nano", 536214083);
        setField(term223983, term223983.getClass(), "time", term223988);
        setField(term223957, term223957.getClass(), "accessTime", term223983);
        setField(term223955, term223955.getClass(), "card", term223957);
        setField(term223955, term223955.getClass(), "userName", "zkYdmJnPHQ");
        setIntField(term223955, term223955.getClass(), "isNetMember", -2047451359);
        setIntField(term223955, term223955.getClass(), "iconId", 460067592);
        setIntField(term223955, term223955.getClass(), "plateId", 2077115892);
        setIntField(term223955, term223955.getClass(), "titleId", -1419433911);
        setIntField(term223955, term223955.getClass(), "partnerId", 1822969869);
        setIntField(term223955, term223955.getClass(), "frameId", -1408911173);
        setIntField(term223955, term223955.getClass(), "selectMapId", -1658565244);
        setIntField(term223955, term223955.getClass(), "totalAwake", 222302842);
        setIntField(term223955, term223955.getClass(), "gradeRating", -1879308935);
        setIntField(term223955, term223955.getClass(), "musicRating", 1433334366);
        setIntField(term223955, term223955.getClass(), "playerRating", 1570982083);
        setIntField(term223955, term223955.getClass(), "highestRating", 79001036);
        setIntField(term223955, term223955.getClass(), "gradeRank", -2128177291);
        setIntField(term223955, term223955.getClass(), "classRank", -1298705021);
        setIntField(term223955, term223955.getClass(), "courseRank", 802170906);
        setField(term223955, term223955.getClass(), "charaSlot", term224020);
        setField(term223955, term223955.getClass(), "charaLockSlot", term224028);
        setLongField(term223955, term223955.getClass(), "contentBit", 6658691713150865522L);
        setIntField(term223955, term223955.getClass(), "playCount", 39907880);
        setField(term223955, term223955.getClass(), "eventWatchedDate", "eKrvhRMeKX");
        setField(term223955, term223955.getClass(), "lastGameId", "MXnvohzLvr");
        setField(term223955, term223955.getClass(), "lastRomVersion", "DNPdhtkeVM");
        setField(term223955, term223955.getClass(), "lastDataVersion", "VBYbHFvBYL");
        setField(term223955, term223955.getClass(), "lastLoginDate", "oStLILVrJT");
        setField(term223955, term223955.getClass(), "lastPlayDate", "aNjBtIPdyW");
        setIntField(term223955, term223955.getClass(), "lastPlayCredit", 358366676);
        setIntField(term223955, term223955.getClass(), "lastPlayMode", -18998104);
        setIntField(term223955, term223955.getClass(), "lastPlaceId", -1335254334);
        setField(term223955, term223955.getClass(), "lastPlaceName", "GJihgIWDBW");
        setIntField(term223955, term223955.getClass(), "lastAllNetId", 2039605156);
        setIntField(term223955, term223955.getClass(), "lastRegionId", -1335894442);
        setField(term223955, term223955.getClass(), "lastRegionName", "NlinVPPOra");
        setField(term223955, term223955.getClass(), "lastClientId", "cqlcNoSGlk");
        setField(term223955, term223955.getClass(), "lastCountryCode", "JMXPWYyevd");
        setIntField(term223955, term223955.getClass(), "lastSelectEMoney", 269878407);
        setIntField(term223955, term223955.getClass(), "lastSelectTicket", 1951853449);
        setIntField(term223955, term223955.getClass(), "lastSelectCourse", -1576630796);
        setIntField(term223955, term223955.getClass(), "lastCountCourse", -1476732663);
        setField(term223955, term223955.getClass(), "firstGameId", "UoKbiqlYaP");
        setField(term223955, term223955.getClass(), "firstRomVersion", "KnKwEJJmlp");
        setField(term223955, term223955.getClass(), "firstDataVersion", "sXCFvcWXVQ");
        setField(term223955, term223955.getClass(), "firstPlayDate", "BuezMdZiDi");
        setField(term223955, term223955.getClass(), "compatibleCmVersion", "XyXBTcjQXz");
        setField(term223955, term223955.getClass(), "dailyBonusDate", "irrGjVGFVJ");
        setField(term223955, term223955.getClass(), "dailyCourseBonusDate", "CPSMRfiYiL");
        setField(term223955, term223955.getClass(), "lastPairLoginDate", "IlNjdEdHul");
        setField(term223955, term223955.getClass(), "lastTrialPlayDate", "nHGTkPFggH");
        setIntField(term223955, term223955.getClass(), "playVsCount", 1985555115);
        setIntField(term223955, term223955.getClass(), "playSyncCount", 2017881557);
        setIntField(term223955, term223955.getClass(), "winCount", 1409539871);
        setIntField(term223955, term223955.getClass(), "helpCount", -252004629);
        setIntField(term223955, term223955.getClass(), "comboCount", 1176748358);
        setLongField(term223955, term223955.getClass(), "totalDeluxscore", -6088951695311332675L);
        setLongField(term223955, term223955.getClass(), "totalBasicDeluxscore", -8361095709109236209L);
        setLongField(term223955, term223955.getClass(), "totalAdvancedDeluxscore", 8345721568537802019L);
        setLongField(term223955, term223955.getClass(), "totalExpertDeluxscore", 6375393214793723627L);
        setLongField(term223955, term223955.getClass(), "totalMasterDeluxscore", -5691229805091221434L);
        setLongField(term223955, term223955.getClass(), "totalReMasterDeluxscore", -8861409251849023554L);
        setIntField(term223955, term223955.getClass(), "totalSync", -888350999);
        setIntField(term223955, term223955.getClass(), "totalBasicSync", 2010116469);
        setIntField(term223955, term223955.getClass(), "totalAdvancedSync", 564948);
        setIntField(term223955, term223955.getClass(), "totalExpertSync", -515527615);
        setIntField(term223955, term223955.getClass(), "totalMasterSync", 1444212583);
        setIntField(term223955, term223955.getClass(), "totalReMasterSync", -663888705);
        setLongField(term223955, term223955.getClass(), "totalAchievement", -6221207054545737477L);
        setLongField(term223955, term223955.getClass(), "totalBasicAchievement", -1547432966497730106L);
        setLongField(term223955, term223955.getClass(), "totalAdvancedAchievement", 1514689428748955863L);
        setLongField(term223955, term223955.getClass(), "totalExpertAchievement", 8422562998353389254L);
        setLongField(term223955, term223955.getClass(), "totalMasterAchievement", 2579025162835686352L);
        setLongField(term223955, term223955.getClass(), "totalReMasterAchievement", -3022212091469657775L);
        setLongField(term223955, term223955.getClass(), "playerOldRating", 2883675100866950179L);
        setLongField(term223955, term223955.getClass(), "playerNewRating", -2383745875227495097L);
        setIntField(term223955, term223955.getClass(), "banState", -1081559918);
        setLongField(term223955, term223955.getClass(), "dateTime", -982807115169128327L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayVsCount", argTypes, term223955, args);
    }

};


