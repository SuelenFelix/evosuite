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

public class UserDetail_setTotalReMasterSync_1735519792143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4311168;
     Object term4311543;

    public UserDetail_setTotalReMasterSync_1735519792143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4311172 = new Long(7626275182194750265L);
        Integer term4311235 = new Integer(1087645970);
        Integer term4311237 = new Integer(1832542619);
        Integer term4311239 = new Integer(-892031259);
        Integer term4311241 = new Integer(1353006335);
        Integer term4311243 = new Integer(-943705013);
        Integer term4311245 = new Integer(1210869725);
        Integer term4311247 = new Integer(-1098995713);
        Integer term4311249 = new Integer(1553880710);
        Integer term4311251 = new Integer(-1228290517);
        ArrayList term4311233 = new ArrayList();
        ((ArrayList) term4311233).add(term4311235);
        ((ArrayList) term4311233).add(term4311237);
        ((ArrayList) term4311233).add(term4311239);
        ((ArrayList) term4311233).add(term4311241);
        ((ArrayList) term4311233).add(term4311243);
        ((ArrayList) term4311233).add(term4311245);
        ((ArrayList) term4311233).add(term4311247);
        ((ArrayList) term4311233).add(term4311249);
        ((ArrayList) term4311233).add(term4311251);
        Integer term4311257 = new Integer(1650761692);
        Integer term4311259 = new Integer(-888914454);
        Integer term4311261 = new Integer(-1836369853);
        Integer term4311263 = new Integer(-2069140329);
        Integer term4311265 = new Integer(-1240410704);
        Integer term4311267 = new Integer(946474812);
        Integer term4311269 = new Integer(1102379330);
        Integer term4311271 = new Integer(-1473411882);
        Integer term4311273 = new Integer(1302685636);
        ArrayList term4311255 = new ArrayList();
        ((ArrayList) term4311255).add(term4311257);
        ((ArrayList) term4311255).add(term4311259);
        ((ArrayList) term4311255).add(term4311261);
        ((ArrayList) term4311255).add(term4311263);
        ((ArrayList) term4311255).add(term4311265);
        ((ArrayList) term4311255).add(term4311267);
        ((ArrayList) term4311255).add(term4311269);
        ((ArrayList) term4311255).add(term4311271);
        ((ArrayList) term4311255).add(term4311273);
        term4311168 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4311170 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4311186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4311187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4311191 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4311196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4311197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4311201 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4311168, term4311168.getClass(), "id", 1183354386666381430L);
        setLongField(term4311170, term4311170.getClass(), "id", 6633257442014957148L);
        setField(term4311170, term4311170.getClass(), "extId", term4311172);
        setField(term4311170, term4311170.getClass(), "luid", "kcTBZCpKGj");
        setIntField(term4311187, term4311187.getClass(), "year", 2014);
        setShortField(term4311187, term4311187.getClass(), "month", (short) 12);
        setShortField(term4311187, term4311187.getClass(), "day", (short) 29);
        setField(term4311186, term4311186.getClass(), "date", term4311187);
        setByteField(term4311191, term4311191.getClass(), "hour", (byte) 0);
        setByteField(term4311191, term4311191.getClass(), "minute", (byte) 21);
        setByteField(term4311191, term4311191.getClass(), "second", (byte) 14);
        setIntField(term4311191, term4311191.getClass(), "nano", 916388630);
        setField(term4311186, term4311186.getClass(), "time", term4311191);
        setField(term4311170, term4311170.getClass(), "registerTime", term4311186);
        setIntField(term4311197, term4311197.getClass(), "year", 2029);
        setShortField(term4311197, term4311197.getClass(), "month", (short) 8);
        setShortField(term4311197, term4311197.getClass(), "day", (short) 18);
        setField(term4311196, term4311196.getClass(), "date", term4311197);
        setByteField(term4311201, term4311201.getClass(), "hour", (byte) 17);
        setByteField(term4311201, term4311201.getClass(), "minute", (byte) 14);
        setByteField(term4311201, term4311201.getClass(), "second", (byte) 28);
        setIntField(term4311201, term4311201.getClass(), "nano", 478905855);
        setField(term4311196, term4311196.getClass(), "time", term4311201);
        setField(term4311170, term4311170.getClass(), "accessTime", term4311196);
        setField(term4311168, term4311168.getClass(), "card", term4311170);
        setField(term4311168, term4311168.getClass(), "userName", "WvbygyvAdm");
        setIntField(term4311168, term4311168.getClass(), "isNetMember", -752919427);
        setIntField(term4311168, term4311168.getClass(), "iconId", -169996709);
        setIntField(term4311168, term4311168.getClass(), "plateId", -53237447);
        setIntField(term4311168, term4311168.getClass(), "titleId", -2120699634);
        setIntField(term4311168, term4311168.getClass(), "partnerId", 503351447);
        setIntField(term4311168, term4311168.getClass(), "frameId", 472676093);
        setIntField(term4311168, term4311168.getClass(), "selectMapId", 1906612133);
        setIntField(term4311168, term4311168.getClass(), "totalAwake", -810972526);
        setIntField(term4311168, term4311168.getClass(), "gradeRating", -1326006898);
        setIntField(term4311168, term4311168.getClass(), "musicRating", -23027772);
        setIntField(term4311168, term4311168.getClass(), "playerRating", 1811082279);
        setIntField(term4311168, term4311168.getClass(), "highestRating", 1116070220);
        setIntField(term4311168, term4311168.getClass(), "gradeRank", 997625202);
        setIntField(term4311168, term4311168.getClass(), "classRank", 1697921500);
        setIntField(term4311168, term4311168.getClass(), "courseRank", -1116955326);
        setField(term4311168, term4311168.getClass(), "charaSlot", term4311233);
        setField(term4311168, term4311168.getClass(), "charaLockSlot", term4311255);
        setLongField(term4311168, term4311168.getClass(), "contentBit", 4297661731432429543L);
        setIntField(term4311168, term4311168.getClass(), "playCount", -1003582109);
        setField(term4311168, term4311168.getClass(), "eventWatchedDate", "cHWEgpEIyp");
        setField(term4311168, term4311168.getClass(), "lastGameId", "yFbwlkhSIk");
        setField(term4311168, term4311168.getClass(), "lastRomVersion", "aAOUNtvSDF");
        setField(term4311168, term4311168.getClass(), "lastDataVersion", "wvtKfwGLzP");
        setField(term4311168, term4311168.getClass(), "lastLoginDate", "coJwKLlXRp");
        setField(term4311168, term4311168.getClass(), "lastPlayDate", "gXFUeyEpjP");
        setIntField(term4311168, term4311168.getClass(), "lastPlayCredit", -830429584);
        setIntField(term4311168, term4311168.getClass(), "lastPlayMode", -1492588118);
        setIntField(term4311168, term4311168.getClass(), "lastPlaceId", -328700622);
        setField(term4311168, term4311168.getClass(), "lastPlaceName", "SHDqAeQarX");
        setIntField(term4311168, term4311168.getClass(), "lastAllNetId", 1690270409);
        setIntField(term4311168, term4311168.getClass(), "lastRegionId", -2028041060);
        setField(term4311168, term4311168.getClass(), "lastRegionName", "VdQlVxGNUi");
        setField(term4311168, term4311168.getClass(), "lastClientId", "orOuWImMqk");
        setField(term4311168, term4311168.getClass(), "lastCountryCode", "HSFljeQrkL");
        setIntField(term4311168, term4311168.getClass(), "lastSelectEMoney", -1994819772);
        setIntField(term4311168, term4311168.getClass(), "lastSelectTicket", 2043659089);
        setIntField(term4311168, term4311168.getClass(), "lastSelectCourse", 1484853460);
        setIntField(term4311168, term4311168.getClass(), "lastCountCourse", 860531696);
        setField(term4311168, term4311168.getClass(), "firstGameId", "YAlxWoBDQt");
        setField(term4311168, term4311168.getClass(), "firstRomVersion", "PaWUKqtUTI");
        setField(term4311168, term4311168.getClass(), "firstDataVersion", "qQtrGBJJtu");
        setField(term4311168, term4311168.getClass(), "firstPlayDate", "UrBnvpTSGj");
        setField(term4311168, term4311168.getClass(), "compatibleCmVersion", "SIoZsBnKBX");
        setField(term4311168, term4311168.getClass(), "dailyBonusDate", "XddNCVKhoa");
        setField(term4311168, term4311168.getClass(), "dailyCourseBonusDate", "AqYRqYLQHl");
        setField(term4311168, term4311168.getClass(), "lastPairLoginDate", "ngNiRsJFqr");
        setField(term4311168, term4311168.getClass(), "lastTrialPlayDate", "EeMnRRVpld");
        setIntField(term4311168, term4311168.getClass(), "playVsCount", 149492259);
        setIntField(term4311168, term4311168.getClass(), "playSyncCount", 646068156);
        setIntField(term4311168, term4311168.getClass(), "winCount", -437256436);
        setIntField(term4311168, term4311168.getClass(), "helpCount", 1488520852);
        setIntField(term4311168, term4311168.getClass(), "comboCount", 724999191);
        setLongField(term4311168, term4311168.getClass(), "totalDeluxscore", 4146891771277527517L);
        setLongField(term4311168, term4311168.getClass(), "totalBasicDeluxscore", 4182130589158051421L);
        setLongField(term4311168, term4311168.getClass(), "totalAdvancedDeluxscore", 4477320658601778921L);
        setLongField(term4311168, term4311168.getClass(), "totalExpertDeluxscore", -1225537565391770790L);
        setLongField(term4311168, term4311168.getClass(), "totalMasterDeluxscore", 6423830334471029171L);
        setLongField(term4311168, term4311168.getClass(), "totalReMasterDeluxscore", -1774476251383650064L);
        setIntField(term4311168, term4311168.getClass(), "totalSync", -1141656266);
        setIntField(term4311168, term4311168.getClass(), "totalBasicSync", -642481338);
        setIntField(term4311168, term4311168.getClass(), "totalAdvancedSync", -1333394593);
        setIntField(term4311168, term4311168.getClass(), "totalExpertSync", -1935331462);
        setIntField(term4311168, term4311168.getClass(), "totalMasterSync", -596617908);
        setIntField(term4311168, term4311168.getClass(), "totalReMasterSync", 1417641201);
        setLongField(term4311168, term4311168.getClass(), "totalAchievement", 3895347649201459523L);
        setLongField(term4311168, term4311168.getClass(), "totalBasicAchievement", -3099560675764263327L);
        setLongField(term4311168, term4311168.getClass(), "totalAdvancedAchievement", 5755736385053705410L);
        setLongField(term4311168, term4311168.getClass(), "totalExpertAchievement", -7311346955329535735L);
        setLongField(term4311168, term4311168.getClass(), "totalMasterAchievement", 8489992138990446837L);
        setLongField(term4311168, term4311168.getClass(), "totalReMasterAchievement", -2783446187428677764L);
        setLongField(term4311168, term4311168.getClass(), "playerOldRating", 4157122432074854919L);
        setLongField(term4311168, term4311168.getClass(), "playerNewRating", 6104974077667072747L);
        setIntField(term4311168, term4311168.getClass(), "banState", 388309149);
        setLongField(term4311168, term4311168.getClass(), "dateTime", -4206311554701597302L);
        term4311543 = new Integer(-1012247384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4311543;
        callMethod(klass, "setTotalReMasterSync", argTypes, term4311168, args);
    }

};


