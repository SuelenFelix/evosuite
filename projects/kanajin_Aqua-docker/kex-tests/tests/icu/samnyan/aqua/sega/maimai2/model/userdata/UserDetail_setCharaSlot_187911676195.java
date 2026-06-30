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

public class UserDetail_setCharaSlot_187911676195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4283477;
     Object term4283834;

    public UserDetail_setCharaSlot_187911676195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4283481 = new Long(2815686903333436830L);
        Integer term4283544 = new Integer(-967532244);
        Integer term4283546 = new Integer(679724363);
        Integer term4283548 = new Integer(1827829669);
        Integer term4283550 = new Integer(1084226733);
        Integer term4283552 = new Integer(853211145);
        Integer term4283554 = new Integer(281265026);
        Integer term4283556 = new Integer(-10577848);
        ArrayList term4283542 = new ArrayList();
        ((ArrayList) term4283542).add(term4283544);
        ((ArrayList) term4283542).add(term4283546);
        ((ArrayList) term4283542).add(term4283548);
        ((ArrayList) term4283542).add(term4283550);
        ((ArrayList) term4283542).add(term4283552);
        ((ArrayList) term4283542).add(term4283554);
        ((ArrayList) term4283542).add(term4283556);
        Integer term4283562 = new Integer(1914024362);
        Integer term4283564 = new Integer(498177640);
        ArrayList term4283560 = new ArrayList();
        ((ArrayList) term4283560).add(term4283562);
        ((ArrayList) term4283560).add(term4283564);
        term4283477 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4283479 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4283495 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4283496 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4283500 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4283505 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4283506 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4283510 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4283477, term4283477.getClass(), "id", 8040949121557202259L);
        setLongField(term4283479, term4283479.getClass(), "id", 240117730667915552L);
        setField(term4283479, term4283479.getClass(), "extId", term4283481);
        setField(term4283479, term4283479.getClass(), "luid", "dVRlscQGto");
        setIntField(term4283496, term4283496.getClass(), "year", 2029);
        setShortField(term4283496, term4283496.getClass(), "month", (short) 8);
        setShortField(term4283496, term4283496.getClass(), "day", (short) 15);
        setField(term4283495, term4283495.getClass(), "date", term4283496);
        setByteField(term4283500, term4283500.getClass(), "hour", (byte) 22);
        setByteField(term4283500, term4283500.getClass(), "minute", (byte) 7);
        setByteField(term4283500, term4283500.getClass(), "second", (byte) 15);
        setIntField(term4283500, term4283500.getClass(), "nano", 644541490);
        setField(term4283495, term4283495.getClass(), "time", term4283500);
        setField(term4283479, term4283479.getClass(), "registerTime", term4283495);
        setIntField(term4283506, term4283506.getClass(), "year", 2018);
        setShortField(term4283506, term4283506.getClass(), "month", (short) 7);
        setShortField(term4283506, term4283506.getClass(), "day", (short) 10);
        setField(term4283505, term4283505.getClass(), "date", term4283506);
        setByteField(term4283510, term4283510.getClass(), "hour", (byte) 20);
        setByteField(term4283510, term4283510.getClass(), "minute", (byte) 15);
        setByteField(term4283510, term4283510.getClass(), "second", (byte) 41);
        setIntField(term4283510, term4283510.getClass(), "nano", 426014007);
        setField(term4283505, term4283505.getClass(), "time", term4283510);
        setField(term4283479, term4283479.getClass(), "accessTime", term4283505);
        setField(term4283477, term4283477.getClass(), "card", term4283479);
        setField(term4283477, term4283477.getClass(), "userName", "JNYVWUjuDw");
        setIntField(term4283477, term4283477.getClass(), "isNetMember", 1548571791);
        setIntField(term4283477, term4283477.getClass(), "iconId", -1899793162);
        setIntField(term4283477, term4283477.getClass(), "plateId", 1934047387);
        setIntField(term4283477, term4283477.getClass(), "titleId", -1477586085);
        setIntField(term4283477, term4283477.getClass(), "partnerId", -312104383);
        setIntField(term4283477, term4283477.getClass(), "frameId", 1390813105);
        setIntField(term4283477, term4283477.getClass(), "selectMapId", 741052454);
        setIntField(term4283477, term4283477.getClass(), "totalAwake", -921301899);
        setIntField(term4283477, term4283477.getClass(), "gradeRating", 775085967);
        setIntField(term4283477, term4283477.getClass(), "musicRating", 264560715);
        setIntField(term4283477, term4283477.getClass(), "playerRating", 2051954677);
        setIntField(term4283477, term4283477.getClass(), "highestRating", -1225217858);
        setIntField(term4283477, term4283477.getClass(), "gradeRank", -1664146947);
        setIntField(term4283477, term4283477.getClass(), "classRank", -1027893577);
        setIntField(term4283477, term4283477.getClass(), "courseRank", 398773892);
        setField(term4283477, term4283477.getClass(), "charaSlot", term4283542);
        setField(term4283477, term4283477.getClass(), "charaLockSlot", term4283560);
        setLongField(term4283477, term4283477.getClass(), "contentBit", -2722786419308346250L);
        setIntField(term4283477, term4283477.getClass(), "playCount", -923301839);
        setField(term4283477, term4283477.getClass(), "eventWatchedDate", "wNgPoUhByT");
        setField(term4283477, term4283477.getClass(), "lastGameId", "sjRuwwHglU");
        setField(term4283477, term4283477.getClass(), "lastRomVersion", "HlNCxFmiKO");
        setField(term4283477, term4283477.getClass(), "lastDataVersion", "BIzQnNsCiH");
        setField(term4283477, term4283477.getClass(), "lastLoginDate", "awRJgbWlDo");
        setField(term4283477, term4283477.getClass(), "lastPlayDate", "sudglPmzcJ");
        setIntField(term4283477, term4283477.getClass(), "lastPlayCredit", 1041196711);
        setIntField(term4283477, term4283477.getClass(), "lastPlayMode", 1502511601);
        setIntField(term4283477, term4283477.getClass(), "lastPlaceId", 77868005);
        setField(term4283477, term4283477.getClass(), "lastPlaceName", "idQZeqrNBC");
        setIntField(term4283477, term4283477.getClass(), "lastAllNetId", -1062089402);
        setIntField(term4283477, term4283477.getClass(), "lastRegionId", 165535694);
        setField(term4283477, term4283477.getClass(), "lastRegionName", "yAnEKybcfa");
        setField(term4283477, term4283477.getClass(), "lastClientId", "xgdFbQhkID");
        setField(term4283477, term4283477.getClass(), "lastCountryCode", "epkKpTUTKS");
        setIntField(term4283477, term4283477.getClass(), "lastSelectEMoney", -399318738);
        setIntField(term4283477, term4283477.getClass(), "lastSelectTicket", 1647508707);
        setIntField(term4283477, term4283477.getClass(), "lastSelectCourse", -1290140864);
        setIntField(term4283477, term4283477.getClass(), "lastCountCourse", 1032308370);
        setField(term4283477, term4283477.getClass(), "firstGameId", "NOYLRglSYR");
        setField(term4283477, term4283477.getClass(), "firstRomVersion", "grNeEnKFum");
        setField(term4283477, term4283477.getClass(), "firstDataVersion", "GAmdeUbCPe");
        setField(term4283477, term4283477.getClass(), "firstPlayDate", "xaHRpgbzME");
        setField(term4283477, term4283477.getClass(), "compatibleCmVersion", "ADoqDIgQsL");
        setField(term4283477, term4283477.getClass(), "dailyBonusDate", "fUyWNjiFaH");
        setField(term4283477, term4283477.getClass(), "dailyCourseBonusDate", "dnUTjPYUCu");
        setField(term4283477, term4283477.getClass(), "lastPairLoginDate", "gJswApqSfa");
        setField(term4283477, term4283477.getClass(), "lastTrialPlayDate", "LqRaxqXZas");
        setIntField(term4283477, term4283477.getClass(), "playVsCount", -1880886188);
        setIntField(term4283477, term4283477.getClass(), "playSyncCount", -1204646806);
        setIntField(term4283477, term4283477.getClass(), "winCount", 1570231747);
        setIntField(term4283477, term4283477.getClass(), "helpCount", 2054651137);
        setIntField(term4283477, term4283477.getClass(), "comboCount", -1566371925);
        setLongField(term4283477, term4283477.getClass(), "totalDeluxscore", -4431345084242103775L);
        setLongField(term4283477, term4283477.getClass(), "totalBasicDeluxscore", 7850160941998842699L);
        setLongField(term4283477, term4283477.getClass(), "totalAdvancedDeluxscore", 1402170307856829031L);
        setLongField(term4283477, term4283477.getClass(), "totalExpertDeluxscore", 974282102947959743L);
        setLongField(term4283477, term4283477.getClass(), "totalMasterDeluxscore", -419211089242788937L);
        setLongField(term4283477, term4283477.getClass(), "totalReMasterDeluxscore", 2446963688602874695L);
        setIntField(term4283477, term4283477.getClass(), "totalSync", 1711996710);
        setIntField(term4283477, term4283477.getClass(), "totalBasicSync", -1445646935);
        setIntField(term4283477, term4283477.getClass(), "totalAdvancedSync", -1746908081);
        setIntField(term4283477, term4283477.getClass(), "totalExpertSync", -1795639595);
        setIntField(term4283477, term4283477.getClass(), "totalMasterSync", -2127886999);
        setIntField(term4283477, term4283477.getClass(), "totalReMasterSync", 209700629);
        setLongField(term4283477, term4283477.getClass(), "totalAchievement", 3862616610548743480L);
        setLongField(term4283477, term4283477.getClass(), "totalBasicAchievement", 8849360940968907556L);
        setLongField(term4283477, term4283477.getClass(), "totalAdvancedAchievement", -5214955965215006891L);
        setLongField(term4283477, term4283477.getClass(), "totalExpertAchievement", 2975774067291177193L);
        setLongField(term4283477, term4283477.getClass(), "totalMasterAchievement", -3359385378413882904L);
        setLongField(term4283477, term4283477.getClass(), "totalReMasterAchievement", -3043798893857467590L);
        setLongField(term4283477, term4283477.getClass(), "playerOldRating", 3194660566229194900L);
        setLongField(term4283477, term4283477.getClass(), "playerNewRating", -8533442774833529131L);
        setIntField(term4283477, term4283477.getClass(), "banState", -1703853209);
        setLongField(term4283477, term4283477.getClass(), "dateTime", 7793144765019439474L);
        term4283834 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4283834;
        callMethod(klass, "setCharaSlot", argTypes, term4283477, args);
    }

};


