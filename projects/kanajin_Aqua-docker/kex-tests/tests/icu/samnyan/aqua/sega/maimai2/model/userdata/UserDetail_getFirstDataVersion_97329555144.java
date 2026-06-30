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

public class UserDetail_getFirstDataVersion_97329555144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219958;

    public UserDetail_getFirstDataVersion_97329555144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219962 = new Long(2287785643837657068L);
        Integer term220025 = new Integer(1513817979);
        Integer term220027 = new Integer(222944981);
        Integer term220029 = new Integer(-1880135720);
        Integer term220031 = new Integer(1065058113);
        Integer term220033 = new Integer(159521199);
        Integer term220035 = new Integer(2020510924);
        Integer term220037 = new Integer(-644848160);
        ArrayList term220023 = new ArrayList();
        ((ArrayList) term220023).add(term220025);
        ((ArrayList) term220023).add(term220027);
        ((ArrayList) term220023).add(term220029);
        ((ArrayList) term220023).add(term220031);
        ((ArrayList) term220023).add(term220033);
        ((ArrayList) term220023).add(term220035);
        ((ArrayList) term220023).add(term220037);
        Integer term220043 = new Integer(-413768483);
        ArrayList term220041 = new ArrayList();
        ((ArrayList) term220041).add(term220043);
        term219958 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term219960 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219991 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219958, term219958.getClass(), "id", -3681588184887129859L);
        setLongField(term219960, term219960.getClass(), "id", 7389663485430652067L);
        setField(term219960, term219960.getClass(), "extId", term219962);
        setField(term219960, term219960.getClass(), "luid", "qkgnEdoEMU");
        setIntField(term219977, term219977.getClass(), "year", 2019);
        setShortField(term219977, term219977.getClass(), "month", (short) 3);
        setShortField(term219977, term219977.getClass(), "day", (short) 15);
        setField(term219976, term219976.getClass(), "date", term219977);
        setByteField(term219981, term219981.getClass(), "hour", (byte) 19);
        setByteField(term219981, term219981.getClass(), "minute", (byte) 20);
        setByteField(term219981, term219981.getClass(), "second", (byte) 17);
        setIntField(term219981, term219981.getClass(), "nano", 872983779);
        setField(term219976, term219976.getClass(), "time", term219981);
        setField(term219960, term219960.getClass(), "registerTime", term219976);
        setIntField(term219987, term219987.getClass(), "year", 2028);
        setShortField(term219987, term219987.getClass(), "month", (short) 10);
        setShortField(term219987, term219987.getClass(), "day", (short) 1);
        setField(term219986, term219986.getClass(), "date", term219987);
        setByteField(term219991, term219991.getClass(), "hour", (byte) 12);
        setByteField(term219991, term219991.getClass(), "minute", (byte) 47);
        setByteField(term219991, term219991.getClass(), "second", (byte) 33);
        setIntField(term219991, term219991.getClass(), "nano", 170475636);
        setField(term219986, term219986.getClass(), "time", term219991);
        setField(term219960, term219960.getClass(), "accessTime", term219986);
        setField(term219958, term219958.getClass(), "card", term219960);
        setField(term219958, term219958.getClass(), "userName", "jgTKIKOHDz");
        setIntField(term219958, term219958.getClass(), "isNetMember", 1396813980);
        setIntField(term219958, term219958.getClass(), "iconId", -326534947);
        setIntField(term219958, term219958.getClass(), "plateId", 928430778);
        setIntField(term219958, term219958.getClass(), "titleId", -677542538);
        setIntField(term219958, term219958.getClass(), "partnerId", 310695506);
        setIntField(term219958, term219958.getClass(), "frameId", -2079854393);
        setIntField(term219958, term219958.getClass(), "selectMapId", 125914013);
        setIntField(term219958, term219958.getClass(), "totalAwake", 236993107);
        setIntField(term219958, term219958.getClass(), "gradeRating", 1900650812);
        setIntField(term219958, term219958.getClass(), "musicRating", 1824505737);
        setIntField(term219958, term219958.getClass(), "playerRating", -1231776024);
        setIntField(term219958, term219958.getClass(), "highestRating", -201286705);
        setIntField(term219958, term219958.getClass(), "gradeRank", 1946136392);
        setIntField(term219958, term219958.getClass(), "classRank", 845409458);
        setIntField(term219958, term219958.getClass(), "courseRank", -334809793);
        setField(term219958, term219958.getClass(), "charaSlot", term220023);
        setField(term219958, term219958.getClass(), "charaLockSlot", term220041);
        setLongField(term219958, term219958.getClass(), "contentBit", -1486523688091782488L);
        setIntField(term219958, term219958.getClass(), "playCount", 1336526057);
        setField(term219958, term219958.getClass(), "eventWatchedDate", "aIusuRXNkV");
        setField(term219958, term219958.getClass(), "lastGameId", "EmRWfUMyqJ");
        setField(term219958, term219958.getClass(), "lastRomVersion", "FbqKjXdeuJ");
        setField(term219958, term219958.getClass(), "lastDataVersion", "NjrcxkYaHq");
        setField(term219958, term219958.getClass(), "lastLoginDate", "sssJhNdUjG");
        setField(term219958, term219958.getClass(), "lastPlayDate", "XOkulfLyFB");
        setIntField(term219958, term219958.getClass(), "lastPlayCredit", -1183222215);
        setIntField(term219958, term219958.getClass(), "lastPlayMode", 280886553);
        setIntField(term219958, term219958.getClass(), "lastPlaceId", 1599117883);
        setField(term219958, term219958.getClass(), "lastPlaceName", "TWxIeAVyij");
        setIntField(term219958, term219958.getClass(), "lastAllNetId", -1690488985);
        setIntField(term219958, term219958.getClass(), "lastRegionId", -929504323);
        setField(term219958, term219958.getClass(), "lastRegionName", "TNTJNnihvv");
        setField(term219958, term219958.getClass(), "lastClientId", "DPtVWGCAtJ");
        setField(term219958, term219958.getClass(), "lastCountryCode", "UZOnqpPQsA");
        setIntField(term219958, term219958.getClass(), "lastSelectEMoney", 141562728);
        setIntField(term219958, term219958.getClass(), "lastSelectTicket", -1991277407);
        setIntField(term219958, term219958.getClass(), "lastSelectCourse", 519516662);
        setIntField(term219958, term219958.getClass(), "lastCountCourse", 396192446);
        setField(term219958, term219958.getClass(), "firstGameId", "wYZNsqEOJb");
        setField(term219958, term219958.getClass(), "firstRomVersion", "psufmwuxCV");
        setField(term219958, term219958.getClass(), "firstDataVersion", "HCLZNLlrSc");
        setField(term219958, term219958.getClass(), "firstPlayDate", "DQrthrhMjb");
        setField(term219958, term219958.getClass(), "compatibleCmVersion", "BGKoNLhthG");
        setField(term219958, term219958.getClass(), "dailyBonusDate", "IQDGAZwOGa");
        setField(term219958, term219958.getClass(), "dailyCourseBonusDate", "vXrsPbRaYX");
        setField(term219958, term219958.getClass(), "lastPairLoginDate", "ojTCLisiWi");
        setField(term219958, term219958.getClass(), "lastTrialPlayDate", "WhKYLxRhpk");
        setIntField(term219958, term219958.getClass(), "playVsCount", 1016730846);
        setIntField(term219958, term219958.getClass(), "playSyncCount", -1082475050);
        setIntField(term219958, term219958.getClass(), "winCount", 1725611156);
        setIntField(term219958, term219958.getClass(), "helpCount", -709553672);
        setIntField(term219958, term219958.getClass(), "comboCount", -517614001);
        setLongField(term219958, term219958.getClass(), "totalDeluxscore", -656132478494175508L);
        setLongField(term219958, term219958.getClass(), "totalBasicDeluxscore", -838122048368919304L);
        setLongField(term219958, term219958.getClass(), "totalAdvancedDeluxscore", -4625916681960163535L);
        setLongField(term219958, term219958.getClass(), "totalExpertDeluxscore", 1385272929057395735L);
        setLongField(term219958, term219958.getClass(), "totalMasterDeluxscore", -7591104665472989385L);
        setLongField(term219958, term219958.getClass(), "totalReMasterDeluxscore", -8977725568527294543L);
        setIntField(term219958, term219958.getClass(), "totalSync", 308141202);
        setIntField(term219958, term219958.getClass(), "totalBasicSync", -1422788814);
        setIntField(term219958, term219958.getClass(), "totalAdvancedSync", 1870092235);
        setIntField(term219958, term219958.getClass(), "totalExpertSync", -348482192);
        setIntField(term219958, term219958.getClass(), "totalMasterSync", -261423404);
        setIntField(term219958, term219958.getClass(), "totalReMasterSync", -64510316);
        setLongField(term219958, term219958.getClass(), "totalAchievement", -5082845034262723454L);
        setLongField(term219958, term219958.getClass(), "totalBasicAchievement", -2403845829743948038L);
        setLongField(term219958, term219958.getClass(), "totalAdvancedAchievement", 8533827589273378299L);
        setLongField(term219958, term219958.getClass(), "totalExpertAchievement", -1097488180177149706L);
        setLongField(term219958, term219958.getClass(), "totalMasterAchievement", -7727811943108626484L);
        setLongField(term219958, term219958.getClass(), "totalReMasterAchievement", 4364403881941265652L);
        setLongField(term219958, term219958.getClass(), "playerOldRating", -4929298995378859634L);
        setLongField(term219958, term219958.getClass(), "playerNewRating", -8457480468325339301L);
        setIntField(term219958, term219958.getClass(), "banState", -1442185390);
        setLongField(term219958, term219958.getClass(), "dateTime", 2491271805738363558L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term219958, args);
    }

};


