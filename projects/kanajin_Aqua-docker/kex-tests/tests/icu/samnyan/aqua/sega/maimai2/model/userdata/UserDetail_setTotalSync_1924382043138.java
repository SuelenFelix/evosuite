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

public class UserDetail_setTotalSync_1924382043138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274180;
     Object term274541;

    public UserDetail_setTotalSync_1924382043138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274184 = new Long(-4146453776626172590L);
        Integer term274247 = new Integer(-1698291583);
        Integer term274249 = new Integer(-246710651);
        Integer term274251 = new Integer(-374626618);
        Integer term274253 = new Integer(1449690385);
        Integer term274255 = new Integer(-1063098623);
        ArrayList term274245 = new ArrayList();
        ((ArrayList) term274245).add(term274247);
        ((ArrayList) term274245).add(term274249);
        ((ArrayList) term274245).add(term274251);
        ((ArrayList) term274245).add(term274253);
        ((ArrayList) term274245).add(term274255);
        Integer term274261 = new Integer(1519335351);
        Integer term274263 = new Integer(1995841517);
        Integer term274265 = new Integer(-1865261069);
        Integer term274267 = new Integer(159666228);
        Integer term274269 = new Integer(-1706840691);
        Integer term274271 = new Integer(-722277466);
        ArrayList term274259 = new ArrayList();
        ((ArrayList) term274259).add(term274261);
        ((ArrayList) term274259).add(term274263);
        ((ArrayList) term274259).add(term274265);
        ((ArrayList) term274259).add(term274267);
        ((ArrayList) term274259).add(term274269);
        ((ArrayList) term274259).add(term274271);
        term274180 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term274182 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274213 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274180, term274180.getClass(), "id", 8738012409587071936L);
        setLongField(term274182, term274182.getClass(), "id", -29609808522769499L);
        setField(term274182, term274182.getClass(), "extId", term274184);
        setField(term274182, term274182.getClass(), "luid", "HWIRsNWmQm");
        setIntField(term274199, term274199.getClass(), "year", 2014);
        setShortField(term274199, term274199.getClass(), "month", (short) 4);
        setShortField(term274199, term274199.getClass(), "day", (short) 15);
        setField(term274198, term274198.getClass(), "date", term274199);
        setByteField(term274203, term274203.getClass(), "hour", (byte) 8);
        setByteField(term274203, term274203.getClass(), "minute", (byte) 15);
        setByteField(term274203, term274203.getClass(), "second", (byte) 19);
        setIntField(term274203, term274203.getClass(), "nano", 362225421);
        setField(term274198, term274198.getClass(), "time", term274203);
        setField(term274182, term274182.getClass(), "registerTime", term274198);
        setIntField(term274209, term274209.getClass(), "year", 2015);
        setShortField(term274209, term274209.getClass(), "month", (short) 12);
        setShortField(term274209, term274209.getClass(), "day", (short) 2);
        setField(term274208, term274208.getClass(), "date", term274209);
        setByteField(term274213, term274213.getClass(), "hour", (byte) 16);
        setByteField(term274213, term274213.getClass(), "minute", (byte) 26);
        setByteField(term274213, term274213.getClass(), "second", (byte) 42);
        setIntField(term274213, term274213.getClass(), "nano", 766720106);
        setField(term274208, term274208.getClass(), "time", term274213);
        setField(term274182, term274182.getClass(), "accessTime", term274208);
        setField(term274180, term274180.getClass(), "card", term274182);
        setField(term274180, term274180.getClass(), "userName", "HcmfXAxXeu");
        setIntField(term274180, term274180.getClass(), "isNetMember", 929549819);
        setIntField(term274180, term274180.getClass(), "iconId", -893906033);
        setIntField(term274180, term274180.getClass(), "plateId", 1239659216);
        setIntField(term274180, term274180.getClass(), "titleId", -1660602244);
        setIntField(term274180, term274180.getClass(), "partnerId", -1171500236);
        setIntField(term274180, term274180.getClass(), "frameId", 694083079);
        setIntField(term274180, term274180.getClass(), "selectMapId", -334527875);
        setIntField(term274180, term274180.getClass(), "totalAwake", 669174813);
        setIntField(term274180, term274180.getClass(), "gradeRating", -305180205);
        setIntField(term274180, term274180.getClass(), "musicRating", 430010306);
        setIntField(term274180, term274180.getClass(), "playerRating", 1873195725);
        setIntField(term274180, term274180.getClass(), "highestRating", -2019071652);
        setIntField(term274180, term274180.getClass(), "gradeRank", -366565977);
        setIntField(term274180, term274180.getClass(), "classRank", 836999750);
        setIntField(term274180, term274180.getClass(), "courseRank", 406322331);
        setField(term274180, term274180.getClass(), "charaSlot", term274245);
        setField(term274180, term274180.getClass(), "charaLockSlot", term274259);
        setLongField(term274180, term274180.getClass(), "contentBit", 5943369765371591991L);
        setIntField(term274180, term274180.getClass(), "playCount", -1068057012);
        setField(term274180, term274180.getClass(), "eventWatchedDate", "ENHMPCkJAF");
        setField(term274180, term274180.getClass(), "lastGameId", "ltsPzZddLV");
        setField(term274180, term274180.getClass(), "lastRomVersion", "dLPiVldLcA");
        setField(term274180, term274180.getClass(), "lastDataVersion", "MNSfoGNbaW");
        setField(term274180, term274180.getClass(), "lastLoginDate", "XJpICVQclj");
        setField(term274180, term274180.getClass(), "lastPlayDate", "mLRSsQVYlf");
        setIntField(term274180, term274180.getClass(), "lastPlayCredit", -1814939038);
        setIntField(term274180, term274180.getClass(), "lastPlayMode", -1698429753);
        setIntField(term274180, term274180.getClass(), "lastPlaceId", 2137622499);
        setField(term274180, term274180.getClass(), "lastPlaceName", "iBDUqVqJzF");
        setIntField(term274180, term274180.getClass(), "lastAllNetId", 1999042147);
        setIntField(term274180, term274180.getClass(), "lastRegionId", -105005664);
        setField(term274180, term274180.getClass(), "lastRegionName", "vuNCvBpVGd");
        setField(term274180, term274180.getClass(), "lastClientId", "eqvYvwCahH");
        setField(term274180, term274180.getClass(), "lastCountryCode", "ZCDVAsozYB");
        setIntField(term274180, term274180.getClass(), "lastSelectEMoney", -118190113);
        setIntField(term274180, term274180.getClass(), "lastSelectTicket", -1851844767);
        setIntField(term274180, term274180.getClass(), "lastSelectCourse", 1134995273);
        setIntField(term274180, term274180.getClass(), "lastCountCourse", 545058087);
        setField(term274180, term274180.getClass(), "firstGameId", "izLOxsKUuC");
        setField(term274180, term274180.getClass(), "firstRomVersion", "rtyYakLsIf");
        setField(term274180, term274180.getClass(), "firstDataVersion", "TEcCIAqJQZ");
        setField(term274180, term274180.getClass(), "firstPlayDate", "xmIiNFcOaN");
        setField(term274180, term274180.getClass(), "compatibleCmVersion", "wckDOvwjxa");
        setField(term274180, term274180.getClass(), "dailyBonusDate", "nURdupsOyS");
        setField(term274180, term274180.getClass(), "dailyCourseBonusDate", "VWjUkRBRfp");
        setField(term274180, term274180.getClass(), "lastPairLoginDate", "HgEbIAfQHC");
        setField(term274180, term274180.getClass(), "lastTrialPlayDate", "OOqAMsnNEY");
        setIntField(term274180, term274180.getClass(), "playVsCount", 277397630);
        setIntField(term274180, term274180.getClass(), "playSyncCount", -1151022473);
        setIntField(term274180, term274180.getClass(), "winCount", 1720989427);
        setIntField(term274180, term274180.getClass(), "helpCount", -735574672);
        setIntField(term274180, term274180.getClass(), "comboCount", -2067044834);
        setLongField(term274180, term274180.getClass(), "totalDeluxscore", -2586147508253318639L);
        setLongField(term274180, term274180.getClass(), "totalBasicDeluxscore", -197323410420958598L);
        setLongField(term274180, term274180.getClass(), "totalAdvancedDeluxscore", 1230514846457580877L);
        setLongField(term274180, term274180.getClass(), "totalExpertDeluxscore", 674662610363840076L);
        setLongField(term274180, term274180.getClass(), "totalMasterDeluxscore", -8470415008864596944L);
        setLongField(term274180, term274180.getClass(), "totalReMasterDeluxscore", -1089262331970772423L);
        setIntField(term274180, term274180.getClass(), "totalSync", -626419373);
        setIntField(term274180, term274180.getClass(), "totalBasicSync", -1266872592);
        setIntField(term274180, term274180.getClass(), "totalAdvancedSync", -1078848410);
        setIntField(term274180, term274180.getClass(), "totalExpertSync", -1693716421);
        setIntField(term274180, term274180.getClass(), "totalMasterSync", 165867345);
        setIntField(term274180, term274180.getClass(), "totalReMasterSync", 483143938);
        setLongField(term274180, term274180.getClass(), "totalAchievement", -2551255033424087802L);
        setLongField(term274180, term274180.getClass(), "totalBasicAchievement", 9073080424968034558L);
        setLongField(term274180, term274180.getClass(), "totalAdvancedAchievement", 1084054996097126548L);
        setLongField(term274180, term274180.getClass(), "totalExpertAchievement", 6077985729139464999L);
        setLongField(term274180, term274180.getClass(), "totalMasterAchievement", 1305021030177562968L);
        setLongField(term274180, term274180.getClass(), "totalReMasterAchievement", 956525760002044410L);
        setLongField(term274180, term274180.getClass(), "playerOldRating", 7908063799140277012L);
        setLongField(term274180, term274180.getClass(), "playerNewRating", -3992722525798409069L);
        setIntField(term274180, term274180.getClass(), "banState", 1477129324);
        setLongField(term274180, term274180.getClass(), "dateTime", -1163015358945210739L);
        term274541 = new Integer(-119068926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term274541;
        callMethod(klass, "setTotalSync", argTypes, term274180, args);
    }

};


