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

public class UserDetail_getFirstDataVersion_97329555143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219903;

    public UserDetail_getFirstDataVersion_97329555143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219907 = new Long(2287785643837657068L);
        Integer term219970 = new Integer(1513817979);
        Integer term219972 = new Integer(222944981);
        Integer term219974 = new Integer(-1880135720);
        Integer term219976 = new Integer(1065058113);
        Integer term219978 = new Integer(159521199);
        Integer term219980 = new Integer(2020510924);
        Integer term219982 = new Integer(-644848160);
        ArrayList term219968 = new ArrayList();
        ((ArrayList) term219968).add(term219970);
        ((ArrayList) term219968).add(term219972);
        ((ArrayList) term219968).add(term219974);
        ((ArrayList) term219968).add(term219976);
        ((ArrayList) term219968).add(term219978);
        ((ArrayList) term219968).add(term219980);
        ((ArrayList) term219968).add(term219982);
        Integer term219988 = new Integer(-413768483);
        ArrayList term219986 = new ArrayList();
        ((ArrayList) term219986).add(term219988);
        term219903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term219905 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219936 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219903, term219903.getClass(), "id", -3681588184887129859L);
        setLongField(term219905, term219905.getClass(), "id", 7389663485430652067L);
        setField(term219905, term219905.getClass(), "extId", term219907);
        setField(term219905, term219905.getClass(), "luid", "qkgnEdoEMU");
        setIntField(term219922, term219922.getClass(), "year", 2019);
        setShortField(term219922, term219922.getClass(), "month", (short) 3);
        setShortField(term219922, term219922.getClass(), "day", (short) 15);
        setField(term219921, term219921.getClass(), "date", term219922);
        setByteField(term219926, term219926.getClass(), "hour", (byte) 19);
        setByteField(term219926, term219926.getClass(), "minute", (byte) 20);
        setByteField(term219926, term219926.getClass(), "second", (byte) 17);
        setIntField(term219926, term219926.getClass(), "nano", 872983779);
        setField(term219921, term219921.getClass(), "time", term219926);
        setField(term219905, term219905.getClass(), "registerTime", term219921);
        setIntField(term219932, term219932.getClass(), "year", 2028);
        setShortField(term219932, term219932.getClass(), "month", (short) 10);
        setShortField(term219932, term219932.getClass(), "day", (short) 1);
        setField(term219931, term219931.getClass(), "date", term219932);
        setByteField(term219936, term219936.getClass(), "hour", (byte) 12);
        setByteField(term219936, term219936.getClass(), "minute", (byte) 47);
        setByteField(term219936, term219936.getClass(), "second", (byte) 33);
        setIntField(term219936, term219936.getClass(), "nano", 170475636);
        setField(term219931, term219931.getClass(), "time", term219936);
        setField(term219905, term219905.getClass(), "accessTime", term219931);
        setField(term219903, term219903.getClass(), "card", term219905);
        setField(term219903, term219903.getClass(), "userName", "jgTKIKOHDz");
        setIntField(term219903, term219903.getClass(), "isNetMember", 1396813980);
        setIntField(term219903, term219903.getClass(), "iconId", -326534947);
        setIntField(term219903, term219903.getClass(), "plateId", 928430778);
        setIntField(term219903, term219903.getClass(), "titleId", -677542538);
        setIntField(term219903, term219903.getClass(), "partnerId", 310695506);
        setIntField(term219903, term219903.getClass(), "frameId", -2079854393);
        setIntField(term219903, term219903.getClass(), "selectMapId", 125914013);
        setIntField(term219903, term219903.getClass(), "totalAwake", 236993107);
        setIntField(term219903, term219903.getClass(), "gradeRating", 1900650812);
        setIntField(term219903, term219903.getClass(), "musicRating", 1824505737);
        setIntField(term219903, term219903.getClass(), "playerRating", -1231776024);
        setIntField(term219903, term219903.getClass(), "highestRating", -201286705);
        setIntField(term219903, term219903.getClass(), "gradeRank", 1946136392);
        setIntField(term219903, term219903.getClass(), "classRank", 845409458);
        setIntField(term219903, term219903.getClass(), "courseRank", -334809793);
        setField(term219903, term219903.getClass(), "charaSlot", term219968);
        setField(term219903, term219903.getClass(), "charaLockSlot", term219986);
        setLongField(term219903, term219903.getClass(), "contentBit", -1486523688091782488L);
        setIntField(term219903, term219903.getClass(), "playCount", 1336526057);
        setField(term219903, term219903.getClass(), "eventWatchedDate", "aIusuRXNkV");
        setField(term219903, term219903.getClass(), "lastGameId", "EmRWfUMyqJ");
        setField(term219903, term219903.getClass(), "lastRomVersion", "FbqKjXdeuJ");
        setField(term219903, term219903.getClass(), "lastDataVersion", "NjrcxkYaHq");
        setField(term219903, term219903.getClass(), "lastLoginDate", "sssJhNdUjG");
        setField(term219903, term219903.getClass(), "lastPlayDate", "XOkulfLyFB");
        setIntField(term219903, term219903.getClass(), "lastPlayCredit", -1183222215);
        setIntField(term219903, term219903.getClass(), "lastPlayMode", 280886553);
        setIntField(term219903, term219903.getClass(), "lastPlaceId", 1599117883);
        setField(term219903, term219903.getClass(), "lastPlaceName", "TWxIeAVyij");
        setIntField(term219903, term219903.getClass(), "lastAllNetId", -1690488985);
        setIntField(term219903, term219903.getClass(), "lastRegionId", -929504323);
        setField(term219903, term219903.getClass(), "lastRegionName", "TNTJNnihvv");
        setField(term219903, term219903.getClass(), "lastClientId", "DPtVWGCAtJ");
        setField(term219903, term219903.getClass(), "lastCountryCode", "UZOnqpPQsA");
        setIntField(term219903, term219903.getClass(), "lastSelectEMoney", 141562728);
        setIntField(term219903, term219903.getClass(), "lastSelectTicket", -1991277407);
        setIntField(term219903, term219903.getClass(), "lastSelectCourse", 519516662);
        setIntField(term219903, term219903.getClass(), "lastCountCourse", 396192446);
        setField(term219903, term219903.getClass(), "firstGameId", "wYZNsqEOJb");
        setField(term219903, term219903.getClass(), "firstRomVersion", "psufmwuxCV");
        setField(term219903, term219903.getClass(), "firstDataVersion", "HCLZNLlrSc");
        setField(term219903, term219903.getClass(), "firstPlayDate", "DQrthrhMjb");
        setField(term219903, term219903.getClass(), "compatibleCmVersion", "BGKoNLhthG");
        setField(term219903, term219903.getClass(), "dailyBonusDate", "IQDGAZwOGa");
        setField(term219903, term219903.getClass(), "dailyCourseBonusDate", "vXrsPbRaYX");
        setField(term219903, term219903.getClass(), "lastPairLoginDate", "ojTCLisiWi");
        setField(term219903, term219903.getClass(), "lastTrialPlayDate", "WhKYLxRhpk");
        setIntField(term219903, term219903.getClass(), "playVsCount", 1016730846);
        setIntField(term219903, term219903.getClass(), "playSyncCount", -1082475050);
        setIntField(term219903, term219903.getClass(), "winCount", 1725611156);
        setIntField(term219903, term219903.getClass(), "helpCount", -709553672);
        setIntField(term219903, term219903.getClass(), "comboCount", -517614001);
        setLongField(term219903, term219903.getClass(), "totalDeluxscore", -656132478494175508L);
        setLongField(term219903, term219903.getClass(), "totalBasicDeluxscore", -838122048368919304L);
        setLongField(term219903, term219903.getClass(), "totalAdvancedDeluxscore", -4625916681960163535L);
        setLongField(term219903, term219903.getClass(), "totalExpertDeluxscore", 1385272929057395735L);
        setLongField(term219903, term219903.getClass(), "totalMasterDeluxscore", -7591104665472989385L);
        setLongField(term219903, term219903.getClass(), "totalReMasterDeluxscore", -8977725568527294543L);
        setIntField(term219903, term219903.getClass(), "totalSync", 308141202);
        setIntField(term219903, term219903.getClass(), "totalBasicSync", -1422788814);
        setIntField(term219903, term219903.getClass(), "totalAdvancedSync", 1870092235);
        setIntField(term219903, term219903.getClass(), "totalExpertSync", -348482192);
        setIntField(term219903, term219903.getClass(), "totalMasterSync", -261423404);
        setIntField(term219903, term219903.getClass(), "totalReMasterSync", -64510316);
        setLongField(term219903, term219903.getClass(), "totalAchievement", -5082845034262723454L);
        setLongField(term219903, term219903.getClass(), "totalBasicAchievement", -2403845829743948038L);
        setLongField(term219903, term219903.getClass(), "totalAdvancedAchievement", 8533827589273378299L);
        setLongField(term219903, term219903.getClass(), "totalExpertAchievement", -1097488180177149706L);
        setLongField(term219903, term219903.getClass(), "totalMasterAchievement", -7727811943108626484L);
        setLongField(term219903, term219903.getClass(), "totalReMasterAchievement", 4364403881941265652L);
        setLongField(term219903, term219903.getClass(), "playerOldRating", -4929298995378859634L);
        setLongField(term219903, term219903.getClass(), "playerNewRating", -8457480468325339301L);
        setIntField(term219903, term219903.getClass(), "banState", -1442185390);
        setLongField(term219903, term219903.getClass(), "dateTime", 2491271805738363558L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term219903, args);
    }

};


