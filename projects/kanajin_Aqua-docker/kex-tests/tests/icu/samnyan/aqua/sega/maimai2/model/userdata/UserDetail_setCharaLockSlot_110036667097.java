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

public class UserDetail_setCharaLockSlot_110036667097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249988;
     Object term250351;

    public UserDetail_setCharaLockSlot_110036667097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249992 = new Long(-6108006981756732593L);
        Integer term250055 = new Integer(-1074336148);
        Integer term250057 = new Integer(-561801733);
        Integer term250059 = new Integer(2134609936);
        Integer term250061 = new Integer(-409989519);
        Integer term250063 = new Integer(-1293074430);
        Integer term250065 = new Integer(608662433);
        Integer term250067 = new Integer(-2015476493);
        ArrayList term250053 = new ArrayList();
        ((ArrayList) term250053).add(term250055);
        ((ArrayList) term250053).add(term250057);
        ((ArrayList) term250053).add(term250059);
        ((ArrayList) term250053).add(term250061);
        ((ArrayList) term250053).add(term250063);
        ((ArrayList) term250053).add(term250065);
        ((ArrayList) term250053).add(term250067);
        Integer term250073 = new Integer(41528103);
        Integer term250075 = new Integer(-1732381818);
        Integer term250077 = new Integer(1960614460);
        Integer term250079 = new Integer(-1488501179);
        Integer term250081 = new Integer(2086648406);
        ArrayList term250071 = new ArrayList();
        ((ArrayList) term250071).add(term250073);
        ((ArrayList) term250071).add(term250075);
        ((ArrayList) term250071).add(term250077);
        ((ArrayList) term250071).add(term250079);
        ((ArrayList) term250071).add(term250081);
        term249988 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term249990 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term250006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250021 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term249988, term249988.getClass(), "id", -3565427088173942850L);
        setLongField(term249990, term249990.getClass(), "id", 4566627118772404875L);
        setField(term249990, term249990.getClass(), "extId", term249992);
        setField(term249990, term249990.getClass(), "luid", "qkPcNUMMFU");
        setIntField(term250007, term250007.getClass(), "year", 2027);
        setShortField(term250007, term250007.getClass(), "month", (short) 5);
        setShortField(term250007, term250007.getClass(), "day", (short) 9);
        setField(term250006, term250006.getClass(), "date", term250007);
        setByteField(term250011, term250011.getClass(), "hour", (byte) 18);
        setByteField(term250011, term250011.getClass(), "minute", (byte) 17);
        setByteField(term250011, term250011.getClass(), "second", (byte) 45);
        setIntField(term250011, term250011.getClass(), "nano", 184100659);
        setField(term250006, term250006.getClass(), "time", term250011);
        setField(term249990, term249990.getClass(), "registerTime", term250006);
        setIntField(term250017, term250017.getClass(), "year", 2029);
        setShortField(term250017, term250017.getClass(), "month", (short) 7);
        setShortField(term250017, term250017.getClass(), "day", (short) 19);
        setField(term250016, term250016.getClass(), "date", term250017);
        setByteField(term250021, term250021.getClass(), "hour", (byte) 21);
        setByteField(term250021, term250021.getClass(), "minute", (byte) 46);
        setByteField(term250021, term250021.getClass(), "second", (byte) 27);
        setIntField(term250021, term250021.getClass(), "nano", 413909191);
        setField(term250016, term250016.getClass(), "time", term250021);
        setField(term249990, term249990.getClass(), "accessTime", term250016);
        setField(term249988, term249988.getClass(), "card", term249990);
        setField(term249988, term249988.getClass(), "userName", "ZXmgWZeTRn");
        setIntField(term249988, term249988.getClass(), "isNetMember", 1797675970);
        setIntField(term249988, term249988.getClass(), "iconId", -924878521);
        setIntField(term249988, term249988.getClass(), "plateId", -70341831);
        setIntField(term249988, term249988.getClass(), "titleId", -1047558161);
        setIntField(term249988, term249988.getClass(), "partnerId", 1441666373);
        setIntField(term249988, term249988.getClass(), "frameId", 2079040820);
        setIntField(term249988, term249988.getClass(), "selectMapId", -383589548);
        setIntField(term249988, term249988.getClass(), "totalAwake", -1377370776);
        setIntField(term249988, term249988.getClass(), "gradeRating", 1899117502);
        setIntField(term249988, term249988.getClass(), "musicRating", -791226570);
        setIntField(term249988, term249988.getClass(), "playerRating", 992634471);
        setIntField(term249988, term249988.getClass(), "highestRating", 292969469);
        setIntField(term249988, term249988.getClass(), "gradeRank", -861174022);
        setIntField(term249988, term249988.getClass(), "classRank", 1004739369);
        setIntField(term249988, term249988.getClass(), "courseRank", -2039607314);
        setField(term249988, term249988.getClass(), "charaSlot", term250053);
        setField(term249988, term249988.getClass(), "charaLockSlot", term250071);
        setLongField(term249988, term249988.getClass(), "contentBit", 2693575958210743549L);
        setIntField(term249988, term249988.getClass(), "playCount", 793550408);
        setField(term249988, term249988.getClass(), "eventWatchedDate", "GoLHmDBAJB");
        setField(term249988, term249988.getClass(), "lastGameId", "AZqmZETlNN");
        setField(term249988, term249988.getClass(), "lastRomVersion", "bToiDutxBd");
        setField(term249988, term249988.getClass(), "lastDataVersion", "iIhNOWZSiI");
        setField(term249988, term249988.getClass(), "lastLoginDate", "NQIBkRnfjL");
        setField(term249988, term249988.getClass(), "lastPlayDate", "roYYoUvuve");
        setIntField(term249988, term249988.getClass(), "lastPlayCredit", -802007311);
        setIntField(term249988, term249988.getClass(), "lastPlayMode", -1357070417);
        setIntField(term249988, term249988.getClass(), "lastPlaceId", -1560511884);
        setField(term249988, term249988.getClass(), "lastPlaceName", "saBbwEJwaU");
        setIntField(term249988, term249988.getClass(), "lastAllNetId", -811480093);
        setIntField(term249988, term249988.getClass(), "lastRegionId", 766050656);
        setField(term249988, term249988.getClass(), "lastRegionName", "deyNBzGoAl");
        setField(term249988, term249988.getClass(), "lastClientId", "FBbQyFgPdH");
        setField(term249988, term249988.getClass(), "lastCountryCode", "AjdUNyCugb");
        setIntField(term249988, term249988.getClass(), "lastSelectEMoney", -113224144);
        setIntField(term249988, term249988.getClass(), "lastSelectTicket", 873175368);
        setIntField(term249988, term249988.getClass(), "lastSelectCourse", -106093816);
        setIntField(term249988, term249988.getClass(), "lastCountCourse", 96789653);
        setField(term249988, term249988.getClass(), "firstGameId", "dKDzzuLoLW");
        setField(term249988, term249988.getClass(), "firstRomVersion", "EPVoKzYjsa");
        setField(term249988, term249988.getClass(), "firstDataVersion", "exwRDMTrUH");
        setField(term249988, term249988.getClass(), "firstPlayDate", "THLGPyhTxM");
        setField(term249988, term249988.getClass(), "compatibleCmVersion", "XdUkazWzCb");
        setField(term249988, term249988.getClass(), "dailyBonusDate", "pqVRGoWaeR");
        setField(term249988, term249988.getClass(), "dailyCourseBonusDate", "JqdeuiBTPA");
        setField(term249988, term249988.getClass(), "lastPairLoginDate", "tDOAjYoXYW");
        setField(term249988, term249988.getClass(), "lastTrialPlayDate", "cniOQvwvCr");
        setIntField(term249988, term249988.getClass(), "playVsCount", 1236414242);
        setIntField(term249988, term249988.getClass(), "playSyncCount", -1196574351);
        setIntField(term249988, term249988.getClass(), "winCount", 679590007);
        setIntField(term249988, term249988.getClass(), "helpCount", -1076538487);
        setIntField(term249988, term249988.getClass(), "comboCount", -1027942774);
        setLongField(term249988, term249988.getClass(), "totalDeluxscore", 2059816248193136822L);
        setLongField(term249988, term249988.getClass(), "totalBasicDeluxscore", -1372454737855229606L);
        setLongField(term249988, term249988.getClass(), "totalAdvancedDeluxscore", -3191714101062829070L);
        setLongField(term249988, term249988.getClass(), "totalExpertDeluxscore", -8263314123267951048L);
        setLongField(term249988, term249988.getClass(), "totalMasterDeluxscore", 6287571817698408046L);
        setLongField(term249988, term249988.getClass(), "totalReMasterDeluxscore", -8450327920929877833L);
        setIntField(term249988, term249988.getClass(), "totalSync", 1763778014);
        setIntField(term249988, term249988.getClass(), "totalBasicSync", 607826332);
        setIntField(term249988, term249988.getClass(), "totalAdvancedSync", 251965235);
        setIntField(term249988, term249988.getClass(), "totalExpertSync", 1685083329);
        setIntField(term249988, term249988.getClass(), "totalMasterSync", 2030086881);
        setIntField(term249988, term249988.getClass(), "totalReMasterSync", -1850835728);
        setLongField(term249988, term249988.getClass(), "totalAchievement", 1891842528150050060L);
        setLongField(term249988, term249988.getClass(), "totalBasicAchievement", -2175762656324079304L);
        setLongField(term249988, term249988.getClass(), "totalAdvancedAchievement", -7009057727205976949L);
        setLongField(term249988, term249988.getClass(), "totalExpertAchievement", -9052898833627222241L);
        setLongField(term249988, term249988.getClass(), "totalMasterAchievement", -5101291534910276377L);
        setLongField(term249988, term249988.getClass(), "totalReMasterAchievement", 3270953737179770074L);
        setLongField(term249988, term249988.getClass(), "playerOldRating", 4968794749037768447L);
        setLongField(term249988, term249988.getClass(), "playerNewRating", -5102730793444288478L);
        setIntField(term249988, term249988.getClass(), "banState", -629063398);
        setLongField(term249988, term249988.getClass(), "dateTime", 2107707144148494456L);
        term250351 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term250351;
        callMethod(klass, "setCharaLockSlot", argTypes, term249988, args);
    }

};


