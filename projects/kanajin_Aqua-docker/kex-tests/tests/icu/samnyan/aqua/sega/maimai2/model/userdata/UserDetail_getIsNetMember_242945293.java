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

public class UserDetail_getIsNetMember_242945293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197265;

    public UserDetail_getIsNetMember_242945293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term197269 = new Long(3077284143733577490L);
        Integer term197332 = new Integer(-646227135);
        Integer term197334 = new Integer(445886422);
        Integer term197336 = new Integer(-52982078);
        Integer term197338 = new Integer(-1176310275);
        Integer term197340 = new Integer(-992072250);
        Integer term197342 = new Integer(-21937920);
        Integer term197344 = new Integer(-1136589460);
        Integer term197346 = new Integer(-503938545);
        Integer term197348 = new Integer(2025866025);
        ArrayList term197330 = new ArrayList();
        ((ArrayList) term197330).add(term197332);
        ((ArrayList) term197330).add(term197334);
        ((ArrayList) term197330).add(term197336);
        ((ArrayList) term197330).add(term197338);
        ((ArrayList) term197330).add(term197340);
        ((ArrayList) term197330).add(term197342);
        ((ArrayList) term197330).add(term197344);
        ((ArrayList) term197330).add(term197346);
        ((ArrayList) term197330).add(term197348);
        Integer term197354 = new Integer(1509936407);
        Integer term197356 = new Integer(480159064);
        Integer term197358 = new Integer(1447658561);
        Integer term197360 = new Integer(-2004177132);
        Integer term197362 = new Integer(1111078487);
        Integer term197364 = new Integer(1426568609);
        Integer term197366 = new Integer(-1214249196);
        ArrayList term197352 = new ArrayList();
        ((ArrayList) term197352).add(term197354);
        ((ArrayList) term197352).add(term197356);
        ((ArrayList) term197352).add(term197358);
        ((ArrayList) term197352).add(term197360);
        ((ArrayList) term197352).add(term197362);
        ((ArrayList) term197352).add(term197364);
        ((ArrayList) term197352).add(term197366);
        term197265 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term197267 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term197283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term197293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197298 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term197265, term197265.getClass(), "id", 5875644536140988550L);
        setLongField(term197267, term197267.getClass(), "id", -7616963718648168070L);
        setField(term197267, term197267.getClass(), "extId", term197269);
        setField(term197267, term197267.getClass(), "luid", "RJAxEvOrMM");
        setIntField(term197284, term197284.getClass(), "year", 2017);
        setShortField(term197284, term197284.getClass(), "month", (short) 10);
        setShortField(term197284, term197284.getClass(), "day", (short) 2);
        setField(term197283, term197283.getClass(), "date", term197284);
        setByteField(term197288, term197288.getClass(), "hour", (byte) 4);
        setByteField(term197288, term197288.getClass(), "minute", (byte) 40);
        setByteField(term197288, term197288.getClass(), "second", (byte) 56);
        setIntField(term197288, term197288.getClass(), "nano", 701221907);
        setField(term197283, term197283.getClass(), "time", term197288);
        setField(term197267, term197267.getClass(), "registerTime", term197283);
        setIntField(term197294, term197294.getClass(), "year", 2017);
        setShortField(term197294, term197294.getClass(), "month", (short) 8);
        setShortField(term197294, term197294.getClass(), "day", (short) 6);
        setField(term197293, term197293.getClass(), "date", term197294);
        setByteField(term197298, term197298.getClass(), "hour", (byte) 8);
        setByteField(term197298, term197298.getClass(), "minute", (byte) 40);
        setByteField(term197298, term197298.getClass(), "second", (byte) 43);
        setIntField(term197298, term197298.getClass(), "nano", 384847912);
        setField(term197293, term197293.getClass(), "time", term197298);
        setField(term197267, term197267.getClass(), "accessTime", term197293);
        setField(term197265, term197265.getClass(), "card", term197267);
        setField(term197265, term197265.getClass(), "userName", "IsqJSeebBs");
        setIntField(term197265, term197265.getClass(), "isNetMember", -1878396438);
        setIntField(term197265, term197265.getClass(), "iconId", 22205123);
        setIntField(term197265, term197265.getClass(), "plateId", 479068999);
        setIntField(term197265, term197265.getClass(), "titleId", -1528330666);
        setIntField(term197265, term197265.getClass(), "partnerId", -453088521);
        setIntField(term197265, term197265.getClass(), "frameId", -1951273050);
        setIntField(term197265, term197265.getClass(), "selectMapId", 924528463);
        setIntField(term197265, term197265.getClass(), "totalAwake", 148137606);
        setIntField(term197265, term197265.getClass(), "gradeRating", 364962451);
        setIntField(term197265, term197265.getClass(), "musicRating", -368045173);
        setIntField(term197265, term197265.getClass(), "playerRating", -38776100);
        setIntField(term197265, term197265.getClass(), "highestRating", -1097669979);
        setIntField(term197265, term197265.getClass(), "gradeRank", -1780432495);
        setIntField(term197265, term197265.getClass(), "classRank", 428202681);
        setIntField(term197265, term197265.getClass(), "courseRank", 1573860785);
        setField(term197265, term197265.getClass(), "charaSlot", term197330);
        setField(term197265, term197265.getClass(), "charaLockSlot", term197352);
        setLongField(term197265, term197265.getClass(), "contentBit", 7513193376333191949L);
        setIntField(term197265, term197265.getClass(), "playCount", -774422538);
        setField(term197265, term197265.getClass(), "eventWatchedDate", "diTEsrXXCQ");
        setField(term197265, term197265.getClass(), "lastGameId", "SqOEqSQZkw");
        setField(term197265, term197265.getClass(), "lastRomVersion", "PPyLKHSTwq");
        setField(term197265, term197265.getClass(), "lastDataVersion", "yDpRwXOtSw");
        setField(term197265, term197265.getClass(), "lastLoginDate", "ccgyaCnTmH");
        setField(term197265, term197265.getClass(), "lastPlayDate", "SifpHjYmTO");
        setIntField(term197265, term197265.getClass(), "lastPlayCredit", 1066017141);
        setIntField(term197265, term197265.getClass(), "lastPlayMode", -338312520);
        setIntField(term197265, term197265.getClass(), "lastPlaceId", -1944265950);
        setField(term197265, term197265.getClass(), "lastPlaceName", "IZnDRSkVLZ");
        setIntField(term197265, term197265.getClass(), "lastAllNetId", -1587031240);
        setIntField(term197265, term197265.getClass(), "lastRegionId", -1989664257);
        setField(term197265, term197265.getClass(), "lastRegionName", "uUUzJGuMoJ");
        setField(term197265, term197265.getClass(), "lastClientId", "lIEluQGchu");
        setField(term197265, term197265.getClass(), "lastCountryCode", "NstGHXZBme");
        setIntField(term197265, term197265.getClass(), "lastSelectEMoney", -1910664616);
        setIntField(term197265, term197265.getClass(), "lastSelectTicket", 487482309);
        setIntField(term197265, term197265.getClass(), "lastSelectCourse", -579808690);
        setIntField(term197265, term197265.getClass(), "lastCountCourse", -1713470455);
        setField(term197265, term197265.getClass(), "firstGameId", "LIOTUNOVds");
        setField(term197265, term197265.getClass(), "firstRomVersion", "YfPFrlDgAP");
        setField(term197265, term197265.getClass(), "firstDataVersion", "NTlzrMTFhB");
        setField(term197265, term197265.getClass(), "firstPlayDate", "yTZpTnBddt");
        setField(term197265, term197265.getClass(), "compatibleCmVersion", "MZpJiKRbDf");
        setField(term197265, term197265.getClass(), "dailyBonusDate", "pzowNkfzax");
        setField(term197265, term197265.getClass(), "dailyCourseBonusDate", "pHIiFQwtzh");
        setField(term197265, term197265.getClass(), "lastPairLoginDate", "IpeAMdfzEl");
        setField(term197265, term197265.getClass(), "lastTrialPlayDate", "czwByajnQU");
        setIntField(term197265, term197265.getClass(), "playVsCount", 216514040);
        setIntField(term197265, term197265.getClass(), "playSyncCount", 1192613481);
        setIntField(term197265, term197265.getClass(), "winCount", -904848351);
        setIntField(term197265, term197265.getClass(), "helpCount", 381787538);
        setIntField(term197265, term197265.getClass(), "comboCount", 1698188292);
        setLongField(term197265, term197265.getClass(), "totalDeluxscore", 4190534065690990308L);
        setLongField(term197265, term197265.getClass(), "totalBasicDeluxscore", 5269765578770913317L);
        setLongField(term197265, term197265.getClass(), "totalAdvancedDeluxscore", 7345544463513017748L);
        setLongField(term197265, term197265.getClass(), "totalExpertDeluxscore", 3719699734794738508L);
        setLongField(term197265, term197265.getClass(), "totalMasterDeluxscore", -4703905308104862314L);
        setLongField(term197265, term197265.getClass(), "totalReMasterDeluxscore", 33430713669591782L);
        setIntField(term197265, term197265.getClass(), "totalSync", -602012601);
        setIntField(term197265, term197265.getClass(), "totalBasicSync", 1074862789);
        setIntField(term197265, term197265.getClass(), "totalAdvancedSync", 1938881305);
        setIntField(term197265, term197265.getClass(), "totalExpertSync", 300219839);
        setIntField(term197265, term197265.getClass(), "totalMasterSync", 962854007);
        setIntField(term197265, term197265.getClass(), "totalReMasterSync", 824386522);
        setLongField(term197265, term197265.getClass(), "totalAchievement", 7155943267569250580L);
        setLongField(term197265, term197265.getClass(), "totalBasicAchievement", -2995857644224632258L);
        setLongField(term197265, term197265.getClass(), "totalAdvancedAchievement", -3931041430901886981L);
        setLongField(term197265, term197265.getClass(), "totalExpertAchievement", -5052135911483840566L);
        setLongField(term197265, term197265.getClass(), "totalMasterAchievement", 7782854995772117469L);
        setLongField(term197265, term197265.getClass(), "totalReMasterAchievement", -4482026236867875918L);
        setLongField(term197265, term197265.getClass(), "playerOldRating", 3980744608339083800L);
        setLongField(term197265, term197265.getClass(), "playerNewRating", -5514455953680227693L);
        setIntField(term197265, term197265.getClass(), "banState", -1414905297);
        setLongField(term197265, term197265.getClass(), "dateTime", -3285774727775346120L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNetMember", argTypes, term197265, args);
    }

};


