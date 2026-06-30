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

public class UserDetail_setTotalSync_1924382043139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274235;
     Object term274596;

    public UserDetail_setTotalSync_1924382043139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274239 = new Long(-4146453776626172590L);
        Integer term274302 = new Integer(-1698291583);
        Integer term274304 = new Integer(-246710651);
        Integer term274306 = new Integer(-374626618);
        Integer term274308 = new Integer(1449690385);
        Integer term274310 = new Integer(-1063098623);
        ArrayList term274300 = new ArrayList();
        ((ArrayList) term274300).add(term274302);
        ((ArrayList) term274300).add(term274304);
        ((ArrayList) term274300).add(term274306);
        ((ArrayList) term274300).add(term274308);
        ((ArrayList) term274300).add(term274310);
        Integer term274316 = new Integer(1519335351);
        Integer term274318 = new Integer(1995841517);
        Integer term274320 = new Integer(-1865261069);
        Integer term274322 = new Integer(159666228);
        Integer term274324 = new Integer(-1706840691);
        Integer term274326 = new Integer(-722277466);
        ArrayList term274314 = new ArrayList();
        ((ArrayList) term274314).add(term274316);
        ((ArrayList) term274314).add(term274318);
        ((ArrayList) term274314).add(term274320);
        ((ArrayList) term274314).add(term274322);
        ((ArrayList) term274314).add(term274324);
        ((ArrayList) term274314).add(term274326);
        term274235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term274237 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274258 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274268 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274235, term274235.getClass(), "id", 8738012409587071936L);
        setLongField(term274237, term274237.getClass(), "id", -29609808522769499L);
        setField(term274237, term274237.getClass(), "extId", term274239);
        setField(term274237, term274237.getClass(), "luid", "HWIRsNWmQm");
        setIntField(term274254, term274254.getClass(), "year", 2014);
        setShortField(term274254, term274254.getClass(), "month", (short) 4);
        setShortField(term274254, term274254.getClass(), "day", (short) 15);
        setField(term274253, term274253.getClass(), "date", term274254);
        setByteField(term274258, term274258.getClass(), "hour", (byte) 8);
        setByteField(term274258, term274258.getClass(), "minute", (byte) 15);
        setByteField(term274258, term274258.getClass(), "second", (byte) 19);
        setIntField(term274258, term274258.getClass(), "nano", 362225421);
        setField(term274253, term274253.getClass(), "time", term274258);
        setField(term274237, term274237.getClass(), "registerTime", term274253);
        setIntField(term274264, term274264.getClass(), "year", 2015);
        setShortField(term274264, term274264.getClass(), "month", (short) 12);
        setShortField(term274264, term274264.getClass(), "day", (short) 2);
        setField(term274263, term274263.getClass(), "date", term274264);
        setByteField(term274268, term274268.getClass(), "hour", (byte) 16);
        setByteField(term274268, term274268.getClass(), "minute", (byte) 26);
        setByteField(term274268, term274268.getClass(), "second", (byte) 42);
        setIntField(term274268, term274268.getClass(), "nano", 766720106);
        setField(term274263, term274263.getClass(), "time", term274268);
        setField(term274237, term274237.getClass(), "accessTime", term274263);
        setField(term274235, term274235.getClass(), "card", term274237);
        setField(term274235, term274235.getClass(), "userName", "HcmfXAxXeu");
        setIntField(term274235, term274235.getClass(), "isNetMember", 929549819);
        setIntField(term274235, term274235.getClass(), "iconId", -893906033);
        setIntField(term274235, term274235.getClass(), "plateId", 1239659216);
        setIntField(term274235, term274235.getClass(), "titleId", -1660602244);
        setIntField(term274235, term274235.getClass(), "partnerId", -1171500236);
        setIntField(term274235, term274235.getClass(), "frameId", 694083079);
        setIntField(term274235, term274235.getClass(), "selectMapId", -334527875);
        setIntField(term274235, term274235.getClass(), "totalAwake", 669174813);
        setIntField(term274235, term274235.getClass(), "gradeRating", -305180205);
        setIntField(term274235, term274235.getClass(), "musicRating", 430010306);
        setIntField(term274235, term274235.getClass(), "playerRating", 1873195725);
        setIntField(term274235, term274235.getClass(), "highestRating", -2019071652);
        setIntField(term274235, term274235.getClass(), "gradeRank", -366565977);
        setIntField(term274235, term274235.getClass(), "classRank", 836999750);
        setIntField(term274235, term274235.getClass(), "courseRank", 406322331);
        setField(term274235, term274235.getClass(), "charaSlot", term274300);
        setField(term274235, term274235.getClass(), "charaLockSlot", term274314);
        setLongField(term274235, term274235.getClass(), "contentBit", 5943369765371591991L);
        setIntField(term274235, term274235.getClass(), "playCount", -1068057012);
        setField(term274235, term274235.getClass(), "eventWatchedDate", "ENHMPCkJAF");
        setField(term274235, term274235.getClass(), "lastGameId", "ltsPzZddLV");
        setField(term274235, term274235.getClass(), "lastRomVersion", "dLPiVldLcA");
        setField(term274235, term274235.getClass(), "lastDataVersion", "MNSfoGNbaW");
        setField(term274235, term274235.getClass(), "lastLoginDate", "XJpICVQclj");
        setField(term274235, term274235.getClass(), "lastPlayDate", "mLRSsQVYlf");
        setIntField(term274235, term274235.getClass(), "lastPlayCredit", -1814939038);
        setIntField(term274235, term274235.getClass(), "lastPlayMode", -1698429753);
        setIntField(term274235, term274235.getClass(), "lastPlaceId", 2137622499);
        setField(term274235, term274235.getClass(), "lastPlaceName", "iBDUqVqJzF");
        setIntField(term274235, term274235.getClass(), "lastAllNetId", 1999042147);
        setIntField(term274235, term274235.getClass(), "lastRegionId", -105005664);
        setField(term274235, term274235.getClass(), "lastRegionName", "vuNCvBpVGd");
        setField(term274235, term274235.getClass(), "lastClientId", "eqvYvwCahH");
        setField(term274235, term274235.getClass(), "lastCountryCode", "ZCDVAsozYB");
        setIntField(term274235, term274235.getClass(), "lastSelectEMoney", -118190113);
        setIntField(term274235, term274235.getClass(), "lastSelectTicket", -1851844767);
        setIntField(term274235, term274235.getClass(), "lastSelectCourse", 1134995273);
        setIntField(term274235, term274235.getClass(), "lastCountCourse", 545058087);
        setField(term274235, term274235.getClass(), "firstGameId", "izLOxsKUuC");
        setField(term274235, term274235.getClass(), "firstRomVersion", "rtyYakLsIf");
        setField(term274235, term274235.getClass(), "firstDataVersion", "TEcCIAqJQZ");
        setField(term274235, term274235.getClass(), "firstPlayDate", "xmIiNFcOaN");
        setField(term274235, term274235.getClass(), "compatibleCmVersion", "wckDOvwjxa");
        setField(term274235, term274235.getClass(), "dailyBonusDate", "nURdupsOyS");
        setField(term274235, term274235.getClass(), "dailyCourseBonusDate", "VWjUkRBRfp");
        setField(term274235, term274235.getClass(), "lastPairLoginDate", "HgEbIAfQHC");
        setField(term274235, term274235.getClass(), "lastTrialPlayDate", "OOqAMsnNEY");
        setIntField(term274235, term274235.getClass(), "playVsCount", 277397630);
        setIntField(term274235, term274235.getClass(), "playSyncCount", -1151022473);
        setIntField(term274235, term274235.getClass(), "winCount", 1720989427);
        setIntField(term274235, term274235.getClass(), "helpCount", -735574672);
        setIntField(term274235, term274235.getClass(), "comboCount", -2067044834);
        setLongField(term274235, term274235.getClass(), "totalDeluxscore", -2586147508253318639L);
        setLongField(term274235, term274235.getClass(), "totalBasicDeluxscore", -197323410420958598L);
        setLongField(term274235, term274235.getClass(), "totalAdvancedDeluxscore", 1230514846457580877L);
        setLongField(term274235, term274235.getClass(), "totalExpertDeluxscore", 674662610363840076L);
        setLongField(term274235, term274235.getClass(), "totalMasterDeluxscore", -8470415008864596944L);
        setLongField(term274235, term274235.getClass(), "totalReMasterDeluxscore", -1089262331970772423L);
        setIntField(term274235, term274235.getClass(), "totalSync", -626419373);
        setIntField(term274235, term274235.getClass(), "totalBasicSync", -1266872592);
        setIntField(term274235, term274235.getClass(), "totalAdvancedSync", -1078848410);
        setIntField(term274235, term274235.getClass(), "totalExpertSync", -1693716421);
        setIntField(term274235, term274235.getClass(), "totalMasterSync", 165867345);
        setIntField(term274235, term274235.getClass(), "totalReMasterSync", 483143938);
        setLongField(term274235, term274235.getClass(), "totalAchievement", -2551255033424087802L);
        setLongField(term274235, term274235.getClass(), "totalBasicAchievement", 9073080424968034558L);
        setLongField(term274235, term274235.getClass(), "totalAdvancedAchievement", 1084054996097126548L);
        setLongField(term274235, term274235.getClass(), "totalExpertAchievement", 6077985729139464999L);
        setLongField(term274235, term274235.getClass(), "totalMasterAchievement", 1305021030177562968L);
        setLongField(term274235, term274235.getClass(), "totalReMasterAchievement", 956525760002044410L);
        setLongField(term274235, term274235.getClass(), "playerOldRating", 7908063799140277012L);
        setLongField(term274235, term274235.getClass(), "playerNewRating", -3992722525798409069L);
        setIntField(term274235, term274235.getClass(), "banState", 1477129324);
        setLongField(term274235, term274235.getClass(), "dateTime", -1163015358945210739L);
        term274596 = new Integer(-119068926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term274596;
        callMethod(klass, "setTotalSync", argTypes, term274235, args);
    }

};


