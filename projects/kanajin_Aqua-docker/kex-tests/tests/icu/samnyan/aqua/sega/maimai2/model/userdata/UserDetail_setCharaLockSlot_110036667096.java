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
import java.util.LinkedList;

public class UserDetail_setCharaLockSlot_110036667096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249933;
     Object term250296;

    public UserDetail_setCharaLockSlot_110036667096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249937 = new Long(-6108006981756732593L);
        Integer term250000 = new Integer(-1074336148);
        Integer term250002 = new Integer(-561801733);
        Integer term250004 = new Integer(2134609936);
        Integer term250006 = new Integer(-409989519);
        Integer term250008 = new Integer(-1293074430);
        Integer term250010 = new Integer(608662433);
        Integer term250012 = new Integer(-2015476493);
        ArrayList term249998 = new ArrayList();
        ((ArrayList) term249998).add(term250000);
        ((ArrayList) term249998).add(term250002);
        ((ArrayList) term249998).add(term250004);
        ((ArrayList) term249998).add(term250006);
        ((ArrayList) term249998).add(term250008);
        ((ArrayList) term249998).add(term250010);
        ((ArrayList) term249998).add(term250012);
        Integer term250018 = new Integer(41528103);
        Integer term250020 = new Integer(-1732381818);
        Integer term250022 = new Integer(1960614460);
        Integer term250024 = new Integer(-1488501179);
        Integer term250026 = new Integer(2086648406);
        ArrayList term250016 = new ArrayList();
        ((ArrayList) term250016).add(term250018);
        ((ArrayList) term250016).add(term250020);
        ((ArrayList) term250016).add(term250022);
        ((ArrayList) term250016).add(term250024);
        ((ArrayList) term250016).add(term250026);
        term249933 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term249935 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term249951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249966 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term249933, term249933.getClass(), "id", -3565427088173942850L);
        setLongField(term249935, term249935.getClass(), "id", 4566627118772404875L);
        setField(term249935, term249935.getClass(), "extId", term249937);
        setField(term249935, term249935.getClass(), "luid", "qkPcNUMMFU");
        setIntField(term249952, term249952.getClass(), "year", 2027);
        setShortField(term249952, term249952.getClass(), "month", (short) 5);
        setShortField(term249952, term249952.getClass(), "day", (short) 9);
        setField(term249951, term249951.getClass(), "date", term249952);
        setByteField(term249956, term249956.getClass(), "hour", (byte) 18);
        setByteField(term249956, term249956.getClass(), "minute", (byte) 17);
        setByteField(term249956, term249956.getClass(), "second", (byte) 45);
        setIntField(term249956, term249956.getClass(), "nano", 184100659);
        setField(term249951, term249951.getClass(), "time", term249956);
        setField(term249935, term249935.getClass(), "registerTime", term249951);
        setIntField(term249962, term249962.getClass(), "year", 2029);
        setShortField(term249962, term249962.getClass(), "month", (short) 7);
        setShortField(term249962, term249962.getClass(), "day", (short) 19);
        setField(term249961, term249961.getClass(), "date", term249962);
        setByteField(term249966, term249966.getClass(), "hour", (byte) 21);
        setByteField(term249966, term249966.getClass(), "minute", (byte) 46);
        setByteField(term249966, term249966.getClass(), "second", (byte) 27);
        setIntField(term249966, term249966.getClass(), "nano", 413909191);
        setField(term249961, term249961.getClass(), "time", term249966);
        setField(term249935, term249935.getClass(), "accessTime", term249961);
        setField(term249933, term249933.getClass(), "card", term249935);
        setField(term249933, term249933.getClass(), "userName", "ZXmgWZeTRn");
        setIntField(term249933, term249933.getClass(), "isNetMember", 1797675970);
        setIntField(term249933, term249933.getClass(), "iconId", -924878521);
        setIntField(term249933, term249933.getClass(), "plateId", -70341831);
        setIntField(term249933, term249933.getClass(), "titleId", -1047558161);
        setIntField(term249933, term249933.getClass(), "partnerId", 1441666373);
        setIntField(term249933, term249933.getClass(), "frameId", 2079040820);
        setIntField(term249933, term249933.getClass(), "selectMapId", -383589548);
        setIntField(term249933, term249933.getClass(), "totalAwake", -1377370776);
        setIntField(term249933, term249933.getClass(), "gradeRating", 1899117502);
        setIntField(term249933, term249933.getClass(), "musicRating", -791226570);
        setIntField(term249933, term249933.getClass(), "playerRating", 992634471);
        setIntField(term249933, term249933.getClass(), "highestRating", 292969469);
        setIntField(term249933, term249933.getClass(), "gradeRank", -861174022);
        setIntField(term249933, term249933.getClass(), "classRank", 1004739369);
        setIntField(term249933, term249933.getClass(), "courseRank", -2039607314);
        setField(term249933, term249933.getClass(), "charaSlot", term249998);
        setField(term249933, term249933.getClass(), "charaLockSlot", term250016);
        setLongField(term249933, term249933.getClass(), "contentBit", 2693575958210743549L);
        setIntField(term249933, term249933.getClass(), "playCount", 793550408);
        setField(term249933, term249933.getClass(), "eventWatchedDate", "GoLHmDBAJB");
        setField(term249933, term249933.getClass(), "lastGameId", "AZqmZETlNN");
        setField(term249933, term249933.getClass(), "lastRomVersion", "bToiDutxBd");
        setField(term249933, term249933.getClass(), "lastDataVersion", "iIhNOWZSiI");
        setField(term249933, term249933.getClass(), "lastLoginDate", "NQIBkRnfjL");
        setField(term249933, term249933.getClass(), "lastPlayDate", "roYYoUvuve");
        setIntField(term249933, term249933.getClass(), "lastPlayCredit", -802007311);
        setIntField(term249933, term249933.getClass(), "lastPlayMode", -1357070417);
        setIntField(term249933, term249933.getClass(), "lastPlaceId", -1560511884);
        setField(term249933, term249933.getClass(), "lastPlaceName", "saBbwEJwaU");
        setIntField(term249933, term249933.getClass(), "lastAllNetId", -811480093);
        setIntField(term249933, term249933.getClass(), "lastRegionId", 766050656);
        setField(term249933, term249933.getClass(), "lastRegionName", "deyNBzGoAl");
        setField(term249933, term249933.getClass(), "lastClientId", "FBbQyFgPdH");
        setField(term249933, term249933.getClass(), "lastCountryCode", "AjdUNyCugb");
        setIntField(term249933, term249933.getClass(), "lastSelectEMoney", -113224144);
        setIntField(term249933, term249933.getClass(), "lastSelectTicket", 873175368);
        setIntField(term249933, term249933.getClass(), "lastSelectCourse", -106093816);
        setIntField(term249933, term249933.getClass(), "lastCountCourse", 96789653);
        setField(term249933, term249933.getClass(), "firstGameId", "dKDzzuLoLW");
        setField(term249933, term249933.getClass(), "firstRomVersion", "EPVoKzYjsa");
        setField(term249933, term249933.getClass(), "firstDataVersion", "exwRDMTrUH");
        setField(term249933, term249933.getClass(), "firstPlayDate", "THLGPyhTxM");
        setField(term249933, term249933.getClass(), "compatibleCmVersion", "XdUkazWzCb");
        setField(term249933, term249933.getClass(), "dailyBonusDate", "pqVRGoWaeR");
        setField(term249933, term249933.getClass(), "dailyCourseBonusDate", "JqdeuiBTPA");
        setField(term249933, term249933.getClass(), "lastPairLoginDate", "tDOAjYoXYW");
        setField(term249933, term249933.getClass(), "lastTrialPlayDate", "cniOQvwvCr");
        setIntField(term249933, term249933.getClass(), "playVsCount", 1236414242);
        setIntField(term249933, term249933.getClass(), "playSyncCount", -1196574351);
        setIntField(term249933, term249933.getClass(), "winCount", 679590007);
        setIntField(term249933, term249933.getClass(), "helpCount", -1076538487);
        setIntField(term249933, term249933.getClass(), "comboCount", -1027942774);
        setLongField(term249933, term249933.getClass(), "totalDeluxscore", 2059816248193136822L);
        setLongField(term249933, term249933.getClass(), "totalBasicDeluxscore", -1372454737855229606L);
        setLongField(term249933, term249933.getClass(), "totalAdvancedDeluxscore", -3191714101062829070L);
        setLongField(term249933, term249933.getClass(), "totalExpertDeluxscore", -8263314123267951048L);
        setLongField(term249933, term249933.getClass(), "totalMasterDeluxscore", 6287571817698408046L);
        setLongField(term249933, term249933.getClass(), "totalReMasterDeluxscore", -8450327920929877833L);
        setIntField(term249933, term249933.getClass(), "totalSync", 1763778014);
        setIntField(term249933, term249933.getClass(), "totalBasicSync", 607826332);
        setIntField(term249933, term249933.getClass(), "totalAdvancedSync", 251965235);
        setIntField(term249933, term249933.getClass(), "totalExpertSync", 1685083329);
        setIntField(term249933, term249933.getClass(), "totalMasterSync", 2030086881);
        setIntField(term249933, term249933.getClass(), "totalReMasterSync", -1850835728);
        setLongField(term249933, term249933.getClass(), "totalAchievement", 1891842528150050060L);
        setLongField(term249933, term249933.getClass(), "totalBasicAchievement", -2175762656324079304L);
        setLongField(term249933, term249933.getClass(), "totalAdvancedAchievement", -7009057727205976949L);
        setLongField(term249933, term249933.getClass(), "totalExpertAchievement", -9052898833627222241L);
        setLongField(term249933, term249933.getClass(), "totalMasterAchievement", -5101291534910276377L);
        setLongField(term249933, term249933.getClass(), "totalReMasterAchievement", 3270953737179770074L);
        setLongField(term249933, term249933.getClass(), "playerOldRating", 4968794749037768447L);
        setLongField(term249933, term249933.getClass(), "playerNewRating", -5102730793444288478L);
        setIntField(term249933, term249933.getClass(), "banState", -629063398);
        setLongField(term249933, term249933.getClass(), "dateTime", 2107707144148494456L);
        term250296 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term250296;
        callMethod(klass, "setCharaLockSlot", argTypes, term249933, args);
    }

};


