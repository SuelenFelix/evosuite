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

public class UserDetail_setLastPlaceName_1189842157108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291001;

    public UserDetail_setLastPlaceName_1189842157108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4291005 = new Long(-790773781296622829L);
        Integer term4291068 = new Integer(162685569);
        Integer term4291070 = new Integer(-291983428);
        Integer term4291072 = new Integer(-1465588855);
        ArrayList term4291066 = new ArrayList();
        ((ArrayList) term4291066).add(term4291068);
        ((ArrayList) term4291066).add(term4291070);
        ((ArrayList) term4291066).add(term4291072);
        Integer term4291078 = new Integer(758026643);
        Integer term4291080 = new Integer(-1012041102);
        Integer term4291082 = new Integer(997299459);
        Integer term4291084 = new Integer(1765607800);
        Integer term4291086 = new Integer(1162343322);
        Integer term4291088 = new Integer(-769830529);
        Integer term4291090 = new Integer(980926498);
        Integer term4291092 = new Integer(215326924);
        ArrayList term4291076 = new ArrayList();
        ((ArrayList) term4291076).add(term4291078);
        ((ArrayList) term4291076).add(term4291080);
        ((ArrayList) term4291076).add(term4291082);
        ((ArrayList) term4291076).add(term4291084);
        ((ArrayList) term4291076).add(term4291086);
        ((ArrayList) term4291076).add(term4291088);
        ((ArrayList) term4291076).add(term4291090);
        ((ArrayList) term4291076).add(term4291092);
        term4291001 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4291003 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4291019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4291020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4291024 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4291029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4291030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4291034 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4291001, term4291001.getClass(), "id", -4666126551043069098L);
        setLongField(term4291003, term4291003.getClass(), "id", -6595990783844329412L);
        setField(term4291003, term4291003.getClass(), "extId", term4291005);
        setField(term4291003, term4291003.getClass(), "luid", "SwmzGuNGcy");
        setIntField(term4291020, term4291020.getClass(), "year", 2017);
        setShortField(term4291020, term4291020.getClass(), "month", (short) 5);
        setShortField(term4291020, term4291020.getClass(), "day", (short) 4);
        setField(term4291019, term4291019.getClass(), "date", term4291020);
        setByteField(term4291024, term4291024.getClass(), "hour", (byte) 7);
        setByteField(term4291024, term4291024.getClass(), "minute", (byte) 57);
        setByteField(term4291024, term4291024.getClass(), "second", (byte) 6);
        setIntField(term4291024, term4291024.getClass(), "nano", 191080686);
        setField(term4291019, term4291019.getClass(), "time", term4291024);
        setField(term4291003, term4291003.getClass(), "registerTime", term4291019);
        setIntField(term4291030, term4291030.getClass(), "year", 2018);
        setShortField(term4291030, term4291030.getClass(), "month", (short) 3);
        setShortField(term4291030, term4291030.getClass(), "day", (short) 8);
        setField(term4291029, term4291029.getClass(), "date", term4291030);
        setByteField(term4291034, term4291034.getClass(), "hour", (byte) 20);
        setByteField(term4291034, term4291034.getClass(), "minute", (byte) 19);
        setByteField(term4291034, term4291034.getClass(), "second", (byte) 54);
        setIntField(term4291034, term4291034.getClass(), "nano", 762926676);
        setField(term4291029, term4291029.getClass(), "time", term4291034);
        setField(term4291003, term4291003.getClass(), "accessTime", term4291029);
        setField(term4291001, term4291001.getClass(), "card", term4291003);
        setField(term4291001, term4291001.getClass(), "userName", "GNGpVVJGZi");
        setIntField(term4291001, term4291001.getClass(), "isNetMember", -114011422);
        setIntField(term4291001, term4291001.getClass(), "iconId", -425372072);
        setIntField(term4291001, term4291001.getClass(), "plateId", 538425278);
        setIntField(term4291001, term4291001.getClass(), "titleId", -1348168534);
        setIntField(term4291001, term4291001.getClass(), "partnerId", 1740331386);
        setIntField(term4291001, term4291001.getClass(), "frameId", -605732481);
        setIntField(term4291001, term4291001.getClass(), "selectMapId", -127716481);
        setIntField(term4291001, term4291001.getClass(), "totalAwake", -1028061336);
        setIntField(term4291001, term4291001.getClass(), "gradeRating", -789401557);
        setIntField(term4291001, term4291001.getClass(), "musicRating", -176165877);
        setIntField(term4291001, term4291001.getClass(), "playerRating", -720190606);
        setIntField(term4291001, term4291001.getClass(), "highestRating", 636597850);
        setIntField(term4291001, term4291001.getClass(), "gradeRank", -947308793);
        setIntField(term4291001, term4291001.getClass(), "classRank", -864884631);
        setIntField(term4291001, term4291001.getClass(), "courseRank", 646739986);
        setField(term4291001, term4291001.getClass(), "charaSlot", term4291066);
        setField(term4291001, term4291001.getClass(), "charaLockSlot", term4291076);
        setLongField(term4291001, term4291001.getClass(), "contentBit", 553024782599457091L);
        setIntField(term4291001, term4291001.getClass(), "playCount", -1756524468);
        setField(term4291001, term4291001.getClass(), "eventWatchedDate", "UmvBPWBofQ");
        setField(term4291001, term4291001.getClass(), "lastGameId", "ScFXePdzaE");
        setField(term4291001, term4291001.getClass(), "lastRomVersion", "kYWqTAnptT");
        setField(term4291001, term4291001.getClass(), "lastDataVersion", "cQjLcZqaXc");
        setField(term4291001, term4291001.getClass(), "lastLoginDate", "xcjnyfpnQo");
        setField(term4291001, term4291001.getClass(), "lastPlayDate", "FfDLvBskAj");
        setIntField(term4291001, term4291001.getClass(), "lastPlayCredit", 1318586810);
        setIntField(term4291001, term4291001.getClass(), "lastPlayMode", 488875429);
        setIntField(term4291001, term4291001.getClass(), "lastPlaceId", 575989002);
        setField(term4291001, term4291001.getClass(), "lastPlaceName", "oqpEQHGpOB");
        setIntField(term4291001, term4291001.getClass(), "lastAllNetId", -1747253808);
        setIntField(term4291001, term4291001.getClass(), "lastRegionId", 1976817151);
        setField(term4291001, term4291001.getClass(), "lastRegionName", "AYXGxelyFZ");
        setField(term4291001, term4291001.getClass(), "lastClientId", "cCXQmfwbbi");
        setField(term4291001, term4291001.getClass(), "lastCountryCode", "xvjfYILctY");
        setIntField(term4291001, term4291001.getClass(), "lastSelectEMoney", -419596600);
        setIntField(term4291001, term4291001.getClass(), "lastSelectTicket", -1137959229);
        setIntField(term4291001, term4291001.getClass(), "lastSelectCourse", -1521288898);
        setIntField(term4291001, term4291001.getClass(), "lastCountCourse", -807885482);
        setField(term4291001, term4291001.getClass(), "firstGameId", "EasIYExpJJ");
        setField(term4291001, term4291001.getClass(), "firstRomVersion", "ZvEQfSLvku");
        setField(term4291001, term4291001.getClass(), "firstDataVersion", "YRhrCNmLVg");
        setField(term4291001, term4291001.getClass(), "firstPlayDate", "wmmvXsVVvp");
        setField(term4291001, term4291001.getClass(), "compatibleCmVersion", "MvBPpTrKDZ");
        setField(term4291001, term4291001.getClass(), "dailyBonusDate", "wwVJJolxlk");
        setField(term4291001, term4291001.getClass(), "dailyCourseBonusDate", "tGEgFeRkhJ");
        setField(term4291001, term4291001.getClass(), "lastPairLoginDate", "iaYSZHCipz");
        setField(term4291001, term4291001.getClass(), "lastTrialPlayDate", "WvhndWdhor");
        setIntField(term4291001, term4291001.getClass(), "playVsCount", -337761157);
        setIntField(term4291001, term4291001.getClass(), "playSyncCount", 1417968957);
        setIntField(term4291001, term4291001.getClass(), "winCount", -1457247493);
        setIntField(term4291001, term4291001.getClass(), "helpCount", -1006891533);
        setIntField(term4291001, term4291001.getClass(), "comboCount", 394274031);
        setLongField(term4291001, term4291001.getClass(), "totalDeluxscore", 6181997717664203933L);
        setLongField(term4291001, term4291001.getClass(), "totalBasicDeluxscore", 9051836356890912805L);
        setLongField(term4291001, term4291001.getClass(), "totalAdvancedDeluxscore", -1522759921325838054L);
        setLongField(term4291001, term4291001.getClass(), "totalExpertDeluxscore", -2826275719983320595L);
        setLongField(term4291001, term4291001.getClass(), "totalMasterDeluxscore", -3434519563615398138L);
        setLongField(term4291001, term4291001.getClass(), "totalReMasterDeluxscore", 1451566388776307111L);
        setIntField(term4291001, term4291001.getClass(), "totalSync", 1763850274);
        setIntField(term4291001, term4291001.getClass(), "totalBasicSync", -854415874);
        setIntField(term4291001, term4291001.getClass(), "totalAdvancedSync", -748880135);
        setIntField(term4291001, term4291001.getClass(), "totalExpertSync", 1889203712);
        setIntField(term4291001, term4291001.getClass(), "totalMasterSync", -1441779688);
        setIntField(term4291001, term4291001.getClass(), "totalReMasterSync", -977080176);
        setLongField(term4291001, term4291001.getClass(), "totalAchievement", -3462548563216058278L);
        setLongField(term4291001, term4291001.getClass(), "totalBasicAchievement", 1551259125082791574L);
        setLongField(term4291001, term4291001.getClass(), "totalAdvancedAchievement", -1087234916914634384L);
        setLongField(term4291001, term4291001.getClass(), "totalExpertAchievement", -4054904325439713892L);
        setLongField(term4291001, term4291001.getClass(), "totalMasterAchievement", -4996336515957538037L);
        setLongField(term4291001, term4291001.getClass(), "totalReMasterAchievement", -372003602234706721L);
        setLongField(term4291001, term4291001.getClass(), "playerOldRating", 4087506825922324634L);
        setLongField(term4291001, term4291001.getClass(), "playerNewRating", -7899925613690348118L);
        setIntField(term4291001, term4291001.getClass(), "banState", 1353161703);
        setLongField(term4291001, term4291001.getClass(), "dateTime", -5650208280500334915L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jlEypCZkfM";
        callMethod(klass, "setLastPlaceName", argTypes, term4291001, args);
    }

};


