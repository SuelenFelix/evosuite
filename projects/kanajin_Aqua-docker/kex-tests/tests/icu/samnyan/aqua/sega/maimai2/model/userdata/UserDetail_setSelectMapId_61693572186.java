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

public class UserDetail_setSelectMapId_61693572186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244256;
     Object term244615;

    public UserDetail_setSelectMapId_61693572186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244260 = new Long(5304481534735378567L);
        Integer term244323 = new Integer(733174414);
        Integer term244325 = new Integer(-1055100686);
        Integer term244327 = new Integer(1994661826);
        Integer term244329 = new Integer(-2050574403);
        Integer term244331 = new Integer(1891840747);
        ArrayList term244321 = new ArrayList();
        ((ArrayList) term244321).add(term244323);
        ((ArrayList) term244321).add(term244325);
        ((ArrayList) term244321).add(term244327);
        ((ArrayList) term244321).add(term244329);
        ((ArrayList) term244321).add(term244331);
        Integer term244337 = new Integer(-118389472);
        Integer term244339 = new Integer(-706486666);
        Integer term244341 = new Integer(1426550776);
        Integer term244343 = new Integer(1793694701);
        Integer term244345 = new Integer(1334634518);
        ArrayList term244335 = new ArrayList();
        ((ArrayList) term244335).add(term244337);
        ((ArrayList) term244335).add(term244339);
        ((ArrayList) term244335).add(term244341);
        ((ArrayList) term244335).add(term244343);
        ((ArrayList) term244335).add(term244345);
        term244256 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term244258 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term244274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term244284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244289 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term244256, term244256.getClass(), "id", 7089967479740710378L);
        setLongField(term244258, term244258.getClass(), "id", -7887148464064467817L);
        setField(term244258, term244258.getClass(), "extId", term244260);
        setField(term244258, term244258.getClass(), "luid", "AbzkZFggJr");
        setIntField(term244275, term244275.getClass(), "year", 2014);
        setShortField(term244275, term244275.getClass(), "month", (short) 6);
        setShortField(term244275, term244275.getClass(), "day", (short) 26);
        setField(term244274, term244274.getClass(), "date", term244275);
        setByteField(term244279, term244279.getClass(), "hour", (byte) 23);
        setByteField(term244279, term244279.getClass(), "minute", (byte) 29);
        setByteField(term244279, term244279.getClass(), "second", (byte) 42);
        setIntField(term244279, term244279.getClass(), "nano", 792765324);
        setField(term244274, term244274.getClass(), "time", term244279);
        setField(term244258, term244258.getClass(), "registerTime", term244274);
        setIntField(term244285, term244285.getClass(), "year", 2019);
        setShortField(term244285, term244285.getClass(), "month", (short) 3);
        setShortField(term244285, term244285.getClass(), "day", (short) 23);
        setField(term244284, term244284.getClass(), "date", term244285);
        setByteField(term244289, term244289.getClass(), "hour", (byte) 1);
        setByteField(term244289, term244289.getClass(), "minute", (byte) 15);
        setByteField(term244289, term244289.getClass(), "second", (byte) 57);
        setIntField(term244289, term244289.getClass(), "nano", 53985671);
        setField(term244284, term244284.getClass(), "time", term244289);
        setField(term244258, term244258.getClass(), "accessTime", term244284);
        setField(term244256, term244256.getClass(), "card", term244258);
        setField(term244256, term244256.getClass(), "userName", "tslhBSOQwF");
        setIntField(term244256, term244256.getClass(), "isNetMember", 262955641);
        setIntField(term244256, term244256.getClass(), "iconId", -1166567844);
        setIntField(term244256, term244256.getClass(), "plateId", 708985205);
        setIntField(term244256, term244256.getClass(), "titleId", -658757442);
        setIntField(term244256, term244256.getClass(), "partnerId", -975652694);
        setIntField(term244256, term244256.getClass(), "frameId", 342903868);
        setIntField(term244256, term244256.getClass(), "selectMapId", 1553091005);
        setIntField(term244256, term244256.getClass(), "totalAwake", 1926386070);
        setIntField(term244256, term244256.getClass(), "gradeRating", -222129138);
        setIntField(term244256, term244256.getClass(), "musicRating", -2044855583);
        setIntField(term244256, term244256.getClass(), "playerRating", 12915970);
        setIntField(term244256, term244256.getClass(), "highestRating", 1693148976);
        setIntField(term244256, term244256.getClass(), "gradeRank", -638507792);
        setIntField(term244256, term244256.getClass(), "classRank", -1233239714);
        setIntField(term244256, term244256.getClass(), "courseRank", -699807547);
        setField(term244256, term244256.getClass(), "charaSlot", term244321);
        setField(term244256, term244256.getClass(), "charaLockSlot", term244335);
        setLongField(term244256, term244256.getClass(), "contentBit", -5327523406341861572L);
        setIntField(term244256, term244256.getClass(), "playCount", -367006964);
        setField(term244256, term244256.getClass(), "eventWatchedDate", "aodFIcJOBQ");
        setField(term244256, term244256.getClass(), "lastGameId", "sTtkOgTFht");
        setField(term244256, term244256.getClass(), "lastRomVersion", "rlGSusXzPG");
        setField(term244256, term244256.getClass(), "lastDataVersion", "whEcuYLKhg");
        setField(term244256, term244256.getClass(), "lastLoginDate", "gQBDWeRxHb");
        setField(term244256, term244256.getClass(), "lastPlayDate", "yaQlsOUqsP");
        setIntField(term244256, term244256.getClass(), "lastPlayCredit", 770134239);
        setIntField(term244256, term244256.getClass(), "lastPlayMode", -1196107767);
        setIntField(term244256, term244256.getClass(), "lastPlaceId", -1090930776);
        setField(term244256, term244256.getClass(), "lastPlaceName", "YGhgJpKqvy");
        setIntField(term244256, term244256.getClass(), "lastAllNetId", -664970301);
        setIntField(term244256, term244256.getClass(), "lastRegionId", -430975239);
        setField(term244256, term244256.getClass(), "lastRegionName", "wmQJCThqui");
        setField(term244256, term244256.getClass(), "lastClientId", "LPKxpcUvxv");
        setField(term244256, term244256.getClass(), "lastCountryCode", "nRWGYtemZz");
        setIntField(term244256, term244256.getClass(), "lastSelectEMoney", 1276909937);
        setIntField(term244256, term244256.getClass(), "lastSelectTicket", -1172444844);
        setIntField(term244256, term244256.getClass(), "lastSelectCourse", 2013784342);
        setIntField(term244256, term244256.getClass(), "lastCountCourse", -1307511700);
        setField(term244256, term244256.getClass(), "firstGameId", "iRcITsMQmk");
        setField(term244256, term244256.getClass(), "firstRomVersion", "KNlBfmVqJG");
        setField(term244256, term244256.getClass(), "firstDataVersion", "UEwBYiCmKK");
        setField(term244256, term244256.getClass(), "firstPlayDate", "EbRWmGnzKZ");
        setField(term244256, term244256.getClass(), "compatibleCmVersion", "LntssJRTBe");
        setField(term244256, term244256.getClass(), "dailyBonusDate", "mniTAjwteh");
        setField(term244256, term244256.getClass(), "dailyCourseBonusDate", "lTLrjyvTTD");
        setField(term244256, term244256.getClass(), "lastPairLoginDate", "gOCHuwsUsW");
        setField(term244256, term244256.getClass(), "lastTrialPlayDate", "RIjCVNuoXk");
        setIntField(term244256, term244256.getClass(), "playVsCount", 908109455);
        setIntField(term244256, term244256.getClass(), "playSyncCount", -194331492);
        setIntField(term244256, term244256.getClass(), "winCount", 385537347);
        setIntField(term244256, term244256.getClass(), "helpCount", 2002210105);
        setIntField(term244256, term244256.getClass(), "comboCount", 548837946);
        setLongField(term244256, term244256.getClass(), "totalDeluxscore", 4734683168662979798L);
        setLongField(term244256, term244256.getClass(), "totalBasicDeluxscore", 5594992202386284628L);
        setLongField(term244256, term244256.getClass(), "totalAdvancedDeluxscore", -502703297021630604L);
        setLongField(term244256, term244256.getClass(), "totalExpertDeluxscore", -1390963631815706L);
        setLongField(term244256, term244256.getClass(), "totalMasterDeluxscore", -1111812172959551896L);
        setLongField(term244256, term244256.getClass(), "totalReMasterDeluxscore", -6126984846852356170L);
        setIntField(term244256, term244256.getClass(), "totalSync", -753858590);
        setIntField(term244256, term244256.getClass(), "totalBasicSync", -1239607397);
        setIntField(term244256, term244256.getClass(), "totalAdvancedSync", -27255493);
        setIntField(term244256, term244256.getClass(), "totalExpertSync", -1574305824);
        setIntField(term244256, term244256.getClass(), "totalMasterSync", 404118457);
        setIntField(term244256, term244256.getClass(), "totalReMasterSync", 1980044368);
        setLongField(term244256, term244256.getClass(), "totalAchievement", -3907298561134364296L);
        setLongField(term244256, term244256.getClass(), "totalBasicAchievement", 5301305320742611363L);
        setLongField(term244256, term244256.getClass(), "totalAdvancedAchievement", 1493463312387265756L);
        setLongField(term244256, term244256.getClass(), "totalExpertAchievement", 5506851250415917286L);
        setLongField(term244256, term244256.getClass(), "totalMasterAchievement", -8199288513452759519L);
        setLongField(term244256, term244256.getClass(), "totalReMasterAchievement", -4463919563374999653L);
        setLongField(term244256, term244256.getClass(), "playerOldRating", 8248304521230959440L);
        setLongField(term244256, term244256.getClass(), "playerNewRating", 4137758271081238657L);
        setIntField(term244256, term244256.getClass(), "banState", -1715014296);
        setLongField(term244256, term244256.getClass(), "dateTime", 821366466562824271L);
        term244615 = new Integer(821264755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term244615;
        callMethod(klass, "setSelectMapId", argTypes, term244256, args);
    }

};


