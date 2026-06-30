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

public class UserAct_setParam3_86659185517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10333;
     Object term10693;

    public UserAct_setParam3_86659185517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10339 = new Long(-6573104506744284592L);
        Integer term10402 = new Integer(202001407);
        Integer term10404 = new Integer(158873461);
        Integer term10406 = new Integer(-430151637);
        Integer term10408 = new Integer(-1697741339);
        Integer term10410 = new Integer(98922530);
        ArrayList term10400 = new ArrayList();
        ((ArrayList) term10400).add(term10402);
        ((ArrayList) term10400).add(term10404);
        ((ArrayList) term10400).add(term10406);
        ((ArrayList) term10400).add(term10408);
        ((ArrayList) term10400).add(term10410);
        Integer term10416 = new Integer(-1388471422);
        ArrayList term10414 = new ArrayList();
        ((ArrayList) term10414).add(term10416);
        term10333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term10335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term10337 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10368 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10333, term10333.getClass(), "id", -6001151456088965547L);
        setLongField(term10335, term10335.getClass(), "id", 1740732617708040141L);
        setLongField(term10337, term10337.getClass(), "id", 3472971833455746664L);
        setField(term10337, term10337.getClass(), "extId", term10339);
        setField(term10337, term10337.getClass(), "luid", "IEYhJmgCVd");
        setIntField(term10354, term10354.getClass(), "year", 2010);
        setShortField(term10354, term10354.getClass(), "month", (short) 1);
        setShortField(term10354, term10354.getClass(), "day", (short) 17);
        setField(term10353, term10353.getClass(), "date", term10354);
        setByteField(term10358, term10358.getClass(), "hour", (byte) 13);
        setByteField(term10358, term10358.getClass(), "minute", (byte) 5);
        setByteField(term10358, term10358.getClass(), "second", (byte) 51);
        setIntField(term10358, term10358.getClass(), "nano", 362260580);
        setField(term10353, term10353.getClass(), "time", term10358);
        setField(term10337, term10337.getClass(), "registerTime", term10353);
        setIntField(term10364, term10364.getClass(), "year", 2010);
        setShortField(term10364, term10364.getClass(), "month", (short) 9);
        setShortField(term10364, term10364.getClass(), "day", (short) 28);
        setField(term10363, term10363.getClass(), "date", term10364);
        setByteField(term10368, term10368.getClass(), "hour", (byte) 6);
        setByteField(term10368, term10368.getClass(), "minute", (byte) 4);
        setByteField(term10368, term10368.getClass(), "second", (byte) 54);
        setIntField(term10368, term10368.getClass(), "nano", 604713782);
        setField(term10363, term10363.getClass(), "time", term10368);
        setField(term10337, term10337.getClass(), "accessTime", term10363);
        setField(term10335, term10335.getClass(), "card", term10337);
        setField(term10335, term10335.getClass(), "userName", "KSJeYkkvpk");
        setIntField(term10335, term10335.getClass(), "isNetMember", -1933419449);
        setIntField(term10335, term10335.getClass(), "iconId", -1804322375);
        setIntField(term10335, term10335.getClass(), "plateId", 1595814906);
        setIntField(term10335, term10335.getClass(), "titleId", -834193529);
        setIntField(term10335, term10335.getClass(), "partnerId", 335780735);
        setIntField(term10335, term10335.getClass(), "frameId", -1541981599);
        setIntField(term10335, term10335.getClass(), "selectMapId", 1605456363);
        setIntField(term10335, term10335.getClass(), "totalAwake", 2059896693);
        setIntField(term10335, term10335.getClass(), "gradeRating", 2109912812);
        setIntField(term10335, term10335.getClass(), "musicRating", 1841286431);
        setIntField(term10335, term10335.getClass(), "playerRating", -1723168189);
        setIntField(term10335, term10335.getClass(), "highestRating", -675283917);
        setIntField(term10335, term10335.getClass(), "gradeRank", -2093862988);
        setIntField(term10335, term10335.getClass(), "classRank", 1337828646);
        setIntField(term10335, term10335.getClass(), "courseRank", 532666604);
        setField(term10335, term10335.getClass(), "charaSlot", term10400);
        setField(term10335, term10335.getClass(), "charaLockSlot", term10414);
        setLongField(term10335, term10335.getClass(), "contentBit", 3731931947533293029L);
        setIntField(term10335, term10335.getClass(), "playCount", -13725716);
        setField(term10335, term10335.getClass(), "eventWatchedDate", "qUtkFGMNUV");
        setField(term10335, term10335.getClass(), "lastGameId", "mGRiYhnMcR");
        setField(term10335, term10335.getClass(), "lastRomVersion", "NFlvfJCVPO");
        setField(term10335, term10335.getClass(), "lastDataVersion", "KarbTXFmUU");
        setField(term10335, term10335.getClass(), "lastLoginDate", "jiUSjqwSIQ");
        setField(term10335, term10335.getClass(), "lastPlayDate", "MgLCedQfoj");
        setIntField(term10335, term10335.getClass(), "lastPlayCredit", -1695750603);
        setIntField(term10335, term10335.getClass(), "lastPlayMode", 63677360);
        setIntField(term10335, term10335.getClass(), "lastPlaceId", 1478914037);
        setField(term10335, term10335.getClass(), "lastPlaceName", "zgKiINdgNu");
        setIntField(term10335, term10335.getClass(), "lastAllNetId", 1630231519);
        setIntField(term10335, term10335.getClass(), "lastRegionId", 1460702778);
        setField(term10335, term10335.getClass(), "lastRegionName", "zLMTXDQHYH");
        setField(term10335, term10335.getClass(), "lastClientId", "PqywFWJlpE");
        setField(term10335, term10335.getClass(), "lastCountryCode", "OzXRsFGTIp");
        setIntField(term10335, term10335.getClass(), "lastSelectEMoney", -1398142433);
        setIntField(term10335, term10335.getClass(), "lastSelectTicket", -1112119058);
        setIntField(term10335, term10335.getClass(), "lastSelectCourse", 2073858334);
        setIntField(term10335, term10335.getClass(), "lastCountCourse", -1693535639);
        setField(term10335, term10335.getClass(), "firstGameId", "TjWpyghUWN");
        setField(term10335, term10335.getClass(), "firstRomVersion", "dkZFDZxcde");
        setField(term10335, term10335.getClass(), "firstDataVersion", "WXcZEtUKlI");
        setField(term10335, term10335.getClass(), "firstPlayDate", "IkpjUOuWQU");
        setField(term10335, term10335.getClass(), "compatibleCmVersion", "boSSpezHeU");
        setField(term10335, term10335.getClass(), "dailyBonusDate", "OUeBWNTQDh");
        setField(term10335, term10335.getClass(), "dailyCourseBonusDate", "gltJarNuUk");
        setField(term10335, term10335.getClass(), "lastPairLoginDate", "ZwZIDwYcSW");
        setField(term10335, term10335.getClass(), "lastTrialPlayDate", "sOdkipUKRu");
        setIntField(term10335, term10335.getClass(), "playVsCount", 1344744036);
        setIntField(term10335, term10335.getClass(), "playSyncCount", -98060427);
        setIntField(term10335, term10335.getClass(), "winCount", -1272268399);
        setIntField(term10335, term10335.getClass(), "helpCount", 1120271104);
        setIntField(term10335, term10335.getClass(), "comboCount", -128435804);
        setLongField(term10335, term10335.getClass(), "totalDeluxscore", 9214973322210954344L);
        setLongField(term10335, term10335.getClass(), "totalBasicDeluxscore", 3662777917800385964L);
        setLongField(term10335, term10335.getClass(), "totalAdvancedDeluxscore", -7005300544167632229L);
        setLongField(term10335, term10335.getClass(), "totalExpertDeluxscore", -278716491237139968L);
        setLongField(term10335, term10335.getClass(), "totalMasterDeluxscore", -629491722907628764L);
        setLongField(term10335, term10335.getClass(), "totalReMasterDeluxscore", -5552123402871285352L);
        setIntField(term10335, term10335.getClass(), "totalSync", 2136158480);
        setIntField(term10335, term10335.getClass(), "totalBasicSync", 2118747457);
        setIntField(term10335, term10335.getClass(), "totalAdvancedSync", 1868344256);
        setIntField(term10335, term10335.getClass(), "totalExpertSync", 1857693976);
        setIntField(term10335, term10335.getClass(), "totalMasterSync", 1631305277);
        setIntField(term10335, term10335.getClass(), "totalReMasterSync", 162113491);
        setLongField(term10335, term10335.getClass(), "totalAchievement", -5587528177305224828L);
        setLongField(term10335, term10335.getClass(), "totalBasicAchievement", 7950532649535587877L);
        setLongField(term10335, term10335.getClass(), "totalAdvancedAchievement", 7799452759993694308L);
        setLongField(term10335, term10335.getClass(), "totalExpertAchievement", -1571034605670661708L);
        setLongField(term10335, term10335.getClass(), "totalMasterAchievement", -7983954942068142191L);
        setLongField(term10335, term10335.getClass(), "totalReMasterAchievement", 2274723545906746965L);
        setLongField(term10335, term10335.getClass(), "playerOldRating", 1353683663053784647L);
        setLongField(term10335, term10335.getClass(), "playerNewRating", -1465819833800717311L);
        setIntField(term10335, term10335.getClass(), "banState", -932147928);
        setLongField(term10335, term10335.getClass(), "dateTime", -8306611953768020559L);
        setField(term10333, term10333.getClass(), "user", term10335);
        setIntField(term10333, term10333.getClass(), "kind", 487369012);
        setIntField(term10333, term10333.getClass(), "activityId", -179238712);
        setLongField(term10333, term10333.getClass(), "sortNumber", -8692119547314358088L);
        setIntField(term10333, term10333.getClass(), "param1", -2018735535);
        setIntField(term10333, term10333.getClass(), "param2", -658524954);
        setIntField(term10333, term10333.getClass(), "param3", -2009613557);
        setIntField(term10333, term10333.getClass(), "param4", 654195547);
        term10693 = new Integer(1622857008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10693;
        callMethod(klass, "setParam3", argTypes, term10333, args);
    }

};


