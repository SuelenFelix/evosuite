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

public class UserCharge_getChargeId_10701903463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122161;

    public UserCharge_getChargeId_10701903463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122167 = new Long(4394651392080968777L);
        Integer term122230 = new Integer(-2065157320);
        Integer term122232 = new Integer(1782011477);
        Integer term122234 = new Integer(2129957018);
        Integer term122236 = new Integer(691663312);
        ArrayList term122228 = new ArrayList();
        ((ArrayList) term122228).add(term122230);
        ((ArrayList) term122228).add(term122232);
        ((ArrayList) term122228).add(term122234);
        ((ArrayList) term122228).add(term122236);
        Integer term122242 = new Integer(-1236696275);
        Integer term122244 = new Integer(575249858);
        Integer term122246 = new Integer(-297957951);
        Integer term122248 = new Integer(-1816920588);
        Integer term122250 = new Integer(1674165862);
        Integer term122252 = new Integer(1875252647);
        Integer term122254 = new Integer(-1298688401);
        Integer term122256 = new Integer(1907832341);
        Integer term122258 = new Integer(932199784);
        ArrayList term122240 = new ArrayList();
        ((ArrayList) term122240).add(term122242);
        ((ArrayList) term122240).add(term122244);
        ((ArrayList) term122240).add(term122246);
        ((ArrayList) term122240).add(term122248);
        ((ArrayList) term122240).add(term122250);
        ((ArrayList) term122240).add(term122252);
        ((ArrayList) term122240).add(term122254);
        ((ArrayList) term122240).add(term122256);
        ((ArrayList) term122240).add(term122258);
        term122161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term122163 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term122165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122196 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122161, term122161.getClass(), "id", 1077896998632593692L);
        setLongField(term122163, term122163.getClass(), "id", -7560431579053662981L);
        setLongField(term122165, term122165.getClass(), "id", -2661716358705218539L);
        setField(term122165, term122165.getClass(), "extId", term122167);
        setField(term122165, term122165.getClass(), "luid", "FSxGuVZthC");
        setIntField(term122182, term122182.getClass(), "year", 2013);
        setShortField(term122182, term122182.getClass(), "month", (short) 1);
        setShortField(term122182, term122182.getClass(), "day", (short) 1);
        setField(term122181, term122181.getClass(), "date", term122182);
        setByteField(term122186, term122186.getClass(), "hour", (byte) 17);
        setByteField(term122186, term122186.getClass(), "minute", (byte) 16);
        setByteField(term122186, term122186.getClass(), "second", (byte) 19);
        setIntField(term122186, term122186.getClass(), "nano", 656333309);
        setField(term122181, term122181.getClass(), "time", term122186);
        setField(term122165, term122165.getClass(), "registerTime", term122181);
        setIntField(term122192, term122192.getClass(), "year", 2012);
        setShortField(term122192, term122192.getClass(), "month", (short) 3);
        setShortField(term122192, term122192.getClass(), "day", (short) 8);
        setField(term122191, term122191.getClass(), "date", term122192);
        setByteField(term122196, term122196.getClass(), "hour", (byte) 18);
        setByteField(term122196, term122196.getClass(), "minute", (byte) 5);
        setByteField(term122196, term122196.getClass(), "second", (byte) 29);
        setIntField(term122196, term122196.getClass(), "nano", 800260160);
        setField(term122191, term122191.getClass(), "time", term122196);
        setField(term122165, term122165.getClass(), "accessTime", term122191);
        setField(term122163, term122163.getClass(), "card", term122165);
        setField(term122163, term122163.getClass(), "userName", "vZxqxBKdGD");
        setIntField(term122163, term122163.getClass(), "isNetMember", -1683063075);
        setIntField(term122163, term122163.getClass(), "iconId", 1391093985);
        setIntField(term122163, term122163.getClass(), "plateId", -1936658953);
        setIntField(term122163, term122163.getClass(), "titleId", 758083956);
        setIntField(term122163, term122163.getClass(), "partnerId", 82402802);
        setIntField(term122163, term122163.getClass(), "frameId", 83591041);
        setIntField(term122163, term122163.getClass(), "selectMapId", 149454673);
        setIntField(term122163, term122163.getClass(), "totalAwake", -392494577);
        setIntField(term122163, term122163.getClass(), "gradeRating", -1182169103);
        setIntField(term122163, term122163.getClass(), "musicRating", 75613974);
        setIntField(term122163, term122163.getClass(), "playerRating", -184719611);
        setIntField(term122163, term122163.getClass(), "highestRating", -1275570760);
        setIntField(term122163, term122163.getClass(), "gradeRank", -1359553558);
        setIntField(term122163, term122163.getClass(), "classRank", -1307021664);
        setIntField(term122163, term122163.getClass(), "courseRank", -202359899);
        setField(term122163, term122163.getClass(), "charaSlot", term122228);
        setField(term122163, term122163.getClass(), "charaLockSlot", term122240);
        setLongField(term122163, term122163.getClass(), "contentBit", -7527835270984650383L);
        setIntField(term122163, term122163.getClass(), "playCount", -2145573227);
        setField(term122163, term122163.getClass(), "eventWatchedDate", "ScVMeCBvvv");
        setField(term122163, term122163.getClass(), "lastGameId", "xysssjuOdh");
        setField(term122163, term122163.getClass(), "lastRomVersion", "LQWvIhnGeL");
        setField(term122163, term122163.getClass(), "lastDataVersion", "fSsmODkNFb");
        setField(term122163, term122163.getClass(), "lastLoginDate", "jXaYbKgogd");
        setField(term122163, term122163.getClass(), "lastPlayDate", "MxPRraPVdF");
        setIntField(term122163, term122163.getClass(), "lastPlayCredit", 1334594060);
        setIntField(term122163, term122163.getClass(), "lastPlayMode", 2070138820);
        setIntField(term122163, term122163.getClass(), "lastPlaceId", -323557659);
        setField(term122163, term122163.getClass(), "lastPlaceName", "dnWHLTYWVU");
        setIntField(term122163, term122163.getClass(), "lastAllNetId", 1046757455);
        setIntField(term122163, term122163.getClass(), "lastRegionId", 597376126);
        setField(term122163, term122163.getClass(), "lastRegionName", "AOSOeWGCwi");
        setField(term122163, term122163.getClass(), "lastClientId", "pBmevrFCmp");
        setField(term122163, term122163.getClass(), "lastCountryCode", "DOCvwqbYDn");
        setIntField(term122163, term122163.getClass(), "lastSelectEMoney", 1562609944);
        setIntField(term122163, term122163.getClass(), "lastSelectTicket", -568660846);
        setIntField(term122163, term122163.getClass(), "lastSelectCourse", -1734283788);
        setIntField(term122163, term122163.getClass(), "lastCountCourse", -553895569);
        setField(term122163, term122163.getClass(), "firstGameId", "mnqceiHjKv");
        setField(term122163, term122163.getClass(), "firstRomVersion", "AsVDXoZoBU");
        setField(term122163, term122163.getClass(), "firstDataVersion", "cPxpxZMgIo");
        setField(term122163, term122163.getClass(), "firstPlayDate", "uWtOISrfeA");
        setField(term122163, term122163.getClass(), "compatibleCmVersion", "tYlSzqLqvb");
        setField(term122163, term122163.getClass(), "dailyBonusDate", "GzeLmNKDuY");
        setField(term122163, term122163.getClass(), "dailyCourseBonusDate", "hPPpARaLPc");
        setField(term122163, term122163.getClass(), "lastPairLoginDate", "DtBDapYLSe");
        setField(term122163, term122163.getClass(), "lastTrialPlayDate", "PrJzEmEvlo");
        setIntField(term122163, term122163.getClass(), "playVsCount", 1574271133);
        setIntField(term122163, term122163.getClass(), "playSyncCount", -320820030);
        setIntField(term122163, term122163.getClass(), "winCount", 1564533277);
        setIntField(term122163, term122163.getClass(), "helpCount", 457118315);
        setIntField(term122163, term122163.getClass(), "comboCount", -1741727092);
        setLongField(term122163, term122163.getClass(), "totalDeluxscore", -8146697214903197715L);
        setLongField(term122163, term122163.getClass(), "totalBasicDeluxscore", 1673521388331739069L);
        setLongField(term122163, term122163.getClass(), "totalAdvancedDeluxscore", -7531495309331019558L);
        setLongField(term122163, term122163.getClass(), "totalExpertDeluxscore", -2699593118451160322L);
        setLongField(term122163, term122163.getClass(), "totalMasterDeluxscore", 8882961437534648338L);
        setLongField(term122163, term122163.getClass(), "totalReMasterDeluxscore", 4036743295367021645L);
        setIntField(term122163, term122163.getClass(), "totalSync", 1927550284);
        setIntField(term122163, term122163.getClass(), "totalBasicSync", -454951597);
        setIntField(term122163, term122163.getClass(), "totalAdvancedSync", -992070416);
        setIntField(term122163, term122163.getClass(), "totalExpertSync", 1959596117);
        setIntField(term122163, term122163.getClass(), "totalMasterSync", 298481274);
        setIntField(term122163, term122163.getClass(), "totalReMasterSync", -82602322);
        setLongField(term122163, term122163.getClass(), "totalAchievement", 9002973165154424650L);
        setLongField(term122163, term122163.getClass(), "totalBasicAchievement", 4330983022024825820L);
        setLongField(term122163, term122163.getClass(), "totalAdvancedAchievement", 5824690013848082553L);
        setLongField(term122163, term122163.getClass(), "totalExpertAchievement", 5038298513906018396L);
        setLongField(term122163, term122163.getClass(), "totalMasterAchievement", -2046751618441507359L);
        setLongField(term122163, term122163.getClass(), "totalReMasterAchievement", -256653518357663585L);
        setLongField(term122163, term122163.getClass(), "playerOldRating", 6001930553633799759L);
        setLongField(term122163, term122163.getClass(), "playerNewRating", 256887861773960063L);
        setIntField(term122163, term122163.getClass(), "banState", 201191489);
        setLongField(term122163, term122163.getClass(), "dateTime", 3134594715337882016L);
        setField(term122161, term122161.getClass(), "user", term122163);
        setIntField(term122161, term122161.getClass(), "chargeId", 1003344868);
        setIntField(term122161, term122161.getClass(), "stock", 699428605);
        setField(term122161, term122161.getClass(), "purchaseDate", "DWGWVuqpug");
        setField(term122161, term122161.getClass(), "validDate", "MCSpZrEsbC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeId", argTypes, term122161, args);
    }

};


