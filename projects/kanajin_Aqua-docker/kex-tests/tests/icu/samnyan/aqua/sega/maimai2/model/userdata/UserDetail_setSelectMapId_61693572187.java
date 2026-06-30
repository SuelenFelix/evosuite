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

public class UserDetail_setSelectMapId_61693572187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244311;
     Object term244670;

    public UserDetail_setSelectMapId_61693572187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244315 = new Long(5304481534735378567L);
        Integer term244378 = new Integer(733174414);
        Integer term244380 = new Integer(-1055100686);
        Integer term244382 = new Integer(1994661826);
        Integer term244384 = new Integer(-2050574403);
        Integer term244386 = new Integer(1891840747);
        ArrayList term244376 = new ArrayList();
        ((ArrayList) term244376).add(term244378);
        ((ArrayList) term244376).add(term244380);
        ((ArrayList) term244376).add(term244382);
        ((ArrayList) term244376).add(term244384);
        ((ArrayList) term244376).add(term244386);
        Integer term244392 = new Integer(-118389472);
        Integer term244394 = new Integer(-706486666);
        Integer term244396 = new Integer(1426550776);
        Integer term244398 = new Integer(1793694701);
        Integer term244400 = new Integer(1334634518);
        ArrayList term244390 = new ArrayList();
        ((ArrayList) term244390).add(term244392);
        ((ArrayList) term244390).add(term244394);
        ((ArrayList) term244390).add(term244396);
        ((ArrayList) term244390).add(term244398);
        ((ArrayList) term244390).add(term244400);
        term244311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term244313 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term244329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term244339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term244311, term244311.getClass(), "id", 7089967479740710378L);
        setLongField(term244313, term244313.getClass(), "id", -7887148464064467817L);
        setField(term244313, term244313.getClass(), "extId", term244315);
        setField(term244313, term244313.getClass(), "luid", "AbzkZFggJr");
        setIntField(term244330, term244330.getClass(), "year", 2014);
        setShortField(term244330, term244330.getClass(), "month", (short) 6);
        setShortField(term244330, term244330.getClass(), "day", (short) 26);
        setField(term244329, term244329.getClass(), "date", term244330);
        setByteField(term244334, term244334.getClass(), "hour", (byte) 23);
        setByteField(term244334, term244334.getClass(), "minute", (byte) 29);
        setByteField(term244334, term244334.getClass(), "second", (byte) 42);
        setIntField(term244334, term244334.getClass(), "nano", 792765324);
        setField(term244329, term244329.getClass(), "time", term244334);
        setField(term244313, term244313.getClass(), "registerTime", term244329);
        setIntField(term244340, term244340.getClass(), "year", 2019);
        setShortField(term244340, term244340.getClass(), "month", (short) 3);
        setShortField(term244340, term244340.getClass(), "day", (short) 23);
        setField(term244339, term244339.getClass(), "date", term244340);
        setByteField(term244344, term244344.getClass(), "hour", (byte) 1);
        setByteField(term244344, term244344.getClass(), "minute", (byte) 15);
        setByteField(term244344, term244344.getClass(), "second", (byte) 57);
        setIntField(term244344, term244344.getClass(), "nano", 53985671);
        setField(term244339, term244339.getClass(), "time", term244344);
        setField(term244313, term244313.getClass(), "accessTime", term244339);
        setField(term244311, term244311.getClass(), "card", term244313);
        setField(term244311, term244311.getClass(), "userName", "tslhBSOQwF");
        setIntField(term244311, term244311.getClass(), "isNetMember", 262955641);
        setIntField(term244311, term244311.getClass(), "iconId", -1166567844);
        setIntField(term244311, term244311.getClass(), "plateId", 708985205);
        setIntField(term244311, term244311.getClass(), "titleId", -658757442);
        setIntField(term244311, term244311.getClass(), "partnerId", -975652694);
        setIntField(term244311, term244311.getClass(), "frameId", 342903868);
        setIntField(term244311, term244311.getClass(), "selectMapId", 1553091005);
        setIntField(term244311, term244311.getClass(), "totalAwake", 1926386070);
        setIntField(term244311, term244311.getClass(), "gradeRating", -222129138);
        setIntField(term244311, term244311.getClass(), "musicRating", -2044855583);
        setIntField(term244311, term244311.getClass(), "playerRating", 12915970);
        setIntField(term244311, term244311.getClass(), "highestRating", 1693148976);
        setIntField(term244311, term244311.getClass(), "gradeRank", -638507792);
        setIntField(term244311, term244311.getClass(), "classRank", -1233239714);
        setIntField(term244311, term244311.getClass(), "courseRank", -699807547);
        setField(term244311, term244311.getClass(), "charaSlot", term244376);
        setField(term244311, term244311.getClass(), "charaLockSlot", term244390);
        setLongField(term244311, term244311.getClass(), "contentBit", -5327523406341861572L);
        setIntField(term244311, term244311.getClass(), "playCount", -367006964);
        setField(term244311, term244311.getClass(), "eventWatchedDate", "aodFIcJOBQ");
        setField(term244311, term244311.getClass(), "lastGameId", "sTtkOgTFht");
        setField(term244311, term244311.getClass(), "lastRomVersion", "rlGSusXzPG");
        setField(term244311, term244311.getClass(), "lastDataVersion", "whEcuYLKhg");
        setField(term244311, term244311.getClass(), "lastLoginDate", "gQBDWeRxHb");
        setField(term244311, term244311.getClass(), "lastPlayDate", "yaQlsOUqsP");
        setIntField(term244311, term244311.getClass(), "lastPlayCredit", 770134239);
        setIntField(term244311, term244311.getClass(), "lastPlayMode", -1196107767);
        setIntField(term244311, term244311.getClass(), "lastPlaceId", -1090930776);
        setField(term244311, term244311.getClass(), "lastPlaceName", "YGhgJpKqvy");
        setIntField(term244311, term244311.getClass(), "lastAllNetId", -664970301);
        setIntField(term244311, term244311.getClass(), "lastRegionId", -430975239);
        setField(term244311, term244311.getClass(), "lastRegionName", "wmQJCThqui");
        setField(term244311, term244311.getClass(), "lastClientId", "LPKxpcUvxv");
        setField(term244311, term244311.getClass(), "lastCountryCode", "nRWGYtemZz");
        setIntField(term244311, term244311.getClass(), "lastSelectEMoney", 1276909937);
        setIntField(term244311, term244311.getClass(), "lastSelectTicket", -1172444844);
        setIntField(term244311, term244311.getClass(), "lastSelectCourse", 2013784342);
        setIntField(term244311, term244311.getClass(), "lastCountCourse", -1307511700);
        setField(term244311, term244311.getClass(), "firstGameId", "iRcITsMQmk");
        setField(term244311, term244311.getClass(), "firstRomVersion", "KNlBfmVqJG");
        setField(term244311, term244311.getClass(), "firstDataVersion", "UEwBYiCmKK");
        setField(term244311, term244311.getClass(), "firstPlayDate", "EbRWmGnzKZ");
        setField(term244311, term244311.getClass(), "compatibleCmVersion", "LntssJRTBe");
        setField(term244311, term244311.getClass(), "dailyBonusDate", "mniTAjwteh");
        setField(term244311, term244311.getClass(), "dailyCourseBonusDate", "lTLrjyvTTD");
        setField(term244311, term244311.getClass(), "lastPairLoginDate", "gOCHuwsUsW");
        setField(term244311, term244311.getClass(), "lastTrialPlayDate", "RIjCVNuoXk");
        setIntField(term244311, term244311.getClass(), "playVsCount", 908109455);
        setIntField(term244311, term244311.getClass(), "playSyncCount", -194331492);
        setIntField(term244311, term244311.getClass(), "winCount", 385537347);
        setIntField(term244311, term244311.getClass(), "helpCount", 2002210105);
        setIntField(term244311, term244311.getClass(), "comboCount", 548837946);
        setLongField(term244311, term244311.getClass(), "totalDeluxscore", 4734683168662979798L);
        setLongField(term244311, term244311.getClass(), "totalBasicDeluxscore", 5594992202386284628L);
        setLongField(term244311, term244311.getClass(), "totalAdvancedDeluxscore", -502703297021630604L);
        setLongField(term244311, term244311.getClass(), "totalExpertDeluxscore", -1390963631815706L);
        setLongField(term244311, term244311.getClass(), "totalMasterDeluxscore", -1111812172959551896L);
        setLongField(term244311, term244311.getClass(), "totalReMasterDeluxscore", -6126984846852356170L);
        setIntField(term244311, term244311.getClass(), "totalSync", -753858590);
        setIntField(term244311, term244311.getClass(), "totalBasicSync", -1239607397);
        setIntField(term244311, term244311.getClass(), "totalAdvancedSync", -27255493);
        setIntField(term244311, term244311.getClass(), "totalExpertSync", -1574305824);
        setIntField(term244311, term244311.getClass(), "totalMasterSync", 404118457);
        setIntField(term244311, term244311.getClass(), "totalReMasterSync", 1980044368);
        setLongField(term244311, term244311.getClass(), "totalAchievement", -3907298561134364296L);
        setLongField(term244311, term244311.getClass(), "totalBasicAchievement", 5301305320742611363L);
        setLongField(term244311, term244311.getClass(), "totalAdvancedAchievement", 1493463312387265756L);
        setLongField(term244311, term244311.getClass(), "totalExpertAchievement", 5506851250415917286L);
        setLongField(term244311, term244311.getClass(), "totalMasterAchievement", -8199288513452759519L);
        setLongField(term244311, term244311.getClass(), "totalReMasterAchievement", -4463919563374999653L);
        setLongField(term244311, term244311.getClass(), "playerOldRating", 8248304521230959440L);
        setLongField(term244311, term244311.getClass(), "playerNewRating", 4137758271081238657L);
        setIntField(term244311, term244311.getClass(), "banState", -1715014296);
        setLongField(term244311, term244311.getClass(), "dateTime", 821366466562824271L);
        term244670 = new Integer(821264755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term244670;
        callMethod(klass, "setSelectMapId", argTypes, term244311, args);
    }

};


