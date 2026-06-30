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

public class UserDetail_setIconId_202352123682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241482;
     Object term241845;

    public UserDetail_setIconId_202352123682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241486 = new Long(-1223573843683081410L);
        Integer term241549 = new Integer(-930966430);
        Integer term241551 = new Integer(-1137340653);
        Integer term241553 = new Integer(-520048649);
        Integer term241555 = new Integer(-39379486);
        Integer term241557 = new Integer(92637602);
        ArrayList term241547 = new ArrayList();
        ((ArrayList) term241547).add(term241549);
        ((ArrayList) term241547).add(term241551);
        ((ArrayList) term241547).add(term241553);
        ((ArrayList) term241547).add(term241555);
        ((ArrayList) term241547).add(term241557);
        Integer term241563 = new Integer(-702644184);
        Integer term241565 = new Integer(873158899);
        Integer term241567 = new Integer(-939494687);
        Integer term241569 = new Integer(1818886574);
        Integer term241571 = new Integer(-1082194143);
        Integer term241573 = new Integer(1109687027);
        Integer term241575 = new Integer(-1583077425);
        ArrayList term241561 = new ArrayList();
        ((ArrayList) term241561).add(term241563);
        ((ArrayList) term241561).add(term241565);
        ((ArrayList) term241561).add(term241567);
        ((ArrayList) term241561).add(term241569);
        ((ArrayList) term241561).add(term241571);
        ((ArrayList) term241561).add(term241573);
        ((ArrayList) term241561).add(term241575);
        term241482 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term241484 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term241500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term241510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241515 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term241482, term241482.getClass(), "id", -6345194618964055206L);
        setLongField(term241484, term241484.getClass(), "id", -8608669791686665284L);
        setField(term241484, term241484.getClass(), "extId", term241486);
        setField(term241484, term241484.getClass(), "luid", "fETlboOXMD");
        setIntField(term241501, term241501.getClass(), "year", 2016);
        setShortField(term241501, term241501.getClass(), "month", (short) 4);
        setShortField(term241501, term241501.getClass(), "day", (short) 6);
        setField(term241500, term241500.getClass(), "date", term241501);
        setByteField(term241505, term241505.getClass(), "hour", (byte) 11);
        setByteField(term241505, term241505.getClass(), "minute", (byte) 33);
        setByteField(term241505, term241505.getClass(), "second", (byte) 12);
        setIntField(term241505, term241505.getClass(), "nano", 167392252);
        setField(term241500, term241500.getClass(), "time", term241505);
        setField(term241484, term241484.getClass(), "registerTime", term241500);
        setIntField(term241511, term241511.getClass(), "year", 2014);
        setShortField(term241511, term241511.getClass(), "month", (short) 7);
        setShortField(term241511, term241511.getClass(), "day", (short) 24);
        setField(term241510, term241510.getClass(), "date", term241511);
        setByteField(term241515, term241515.getClass(), "hour", (byte) 5);
        setByteField(term241515, term241515.getClass(), "minute", (byte) 31);
        setByteField(term241515, term241515.getClass(), "second", (byte) 45);
        setIntField(term241515, term241515.getClass(), "nano", 932508724);
        setField(term241510, term241510.getClass(), "time", term241515);
        setField(term241484, term241484.getClass(), "accessTime", term241510);
        setField(term241482, term241482.getClass(), "card", term241484);
        setField(term241482, term241482.getClass(), "userName", "VUNSRpHsgz");
        setIntField(term241482, term241482.getClass(), "isNetMember", 452734504);
        setIntField(term241482, term241482.getClass(), "iconId", -813938461);
        setIntField(term241482, term241482.getClass(), "plateId", -1426913833);
        setIntField(term241482, term241482.getClass(), "titleId", -720649081);
        setIntField(term241482, term241482.getClass(), "partnerId", -2090357328);
        setIntField(term241482, term241482.getClass(), "frameId", 1501440504);
        setIntField(term241482, term241482.getClass(), "selectMapId", -249248566);
        setIntField(term241482, term241482.getClass(), "totalAwake", -259006503);
        setIntField(term241482, term241482.getClass(), "gradeRating", 1786896440);
        setIntField(term241482, term241482.getClass(), "musicRating", 1014633648);
        setIntField(term241482, term241482.getClass(), "playerRating", 1926810383);
        setIntField(term241482, term241482.getClass(), "highestRating", -1055243697);
        setIntField(term241482, term241482.getClass(), "gradeRank", -1915150284);
        setIntField(term241482, term241482.getClass(), "classRank", 1498762865);
        setIntField(term241482, term241482.getClass(), "courseRank", -1057997237);
        setField(term241482, term241482.getClass(), "charaSlot", term241547);
        setField(term241482, term241482.getClass(), "charaLockSlot", term241561);
        setLongField(term241482, term241482.getClass(), "contentBit", -8747118984293982721L);
        setIntField(term241482, term241482.getClass(), "playCount", 535946436);
        setField(term241482, term241482.getClass(), "eventWatchedDate", "THoPgbPYUF");
        setField(term241482, term241482.getClass(), "lastGameId", "FLJqMgPbQm");
        setField(term241482, term241482.getClass(), "lastRomVersion", "npMxjCfNPy");
        setField(term241482, term241482.getClass(), "lastDataVersion", "skQRylzRMg");
        setField(term241482, term241482.getClass(), "lastLoginDate", "PwmioJcxYU");
        setField(term241482, term241482.getClass(), "lastPlayDate", "wkgBbdahBJ");
        setIntField(term241482, term241482.getClass(), "lastPlayCredit", -907030403);
        setIntField(term241482, term241482.getClass(), "lastPlayMode", 746058743);
        setIntField(term241482, term241482.getClass(), "lastPlaceId", -527463696);
        setField(term241482, term241482.getClass(), "lastPlaceName", "TIOKoSkgvB");
        setIntField(term241482, term241482.getClass(), "lastAllNetId", 2087282313);
        setIntField(term241482, term241482.getClass(), "lastRegionId", 1966889005);
        setField(term241482, term241482.getClass(), "lastRegionName", "klYAJTFSIk");
        setField(term241482, term241482.getClass(), "lastClientId", "YLhafUDZSf");
        setField(term241482, term241482.getClass(), "lastCountryCode", "NkqVectDCd");
        setIntField(term241482, term241482.getClass(), "lastSelectEMoney", 2001342823);
        setIntField(term241482, term241482.getClass(), "lastSelectTicket", 1668521151);
        setIntField(term241482, term241482.getClass(), "lastSelectCourse", 1520350621);
        setIntField(term241482, term241482.getClass(), "lastCountCourse", -1328383795);
        setField(term241482, term241482.getClass(), "firstGameId", "PAiEsxsOUA");
        setField(term241482, term241482.getClass(), "firstRomVersion", "YKgbVyVpIQ");
        setField(term241482, term241482.getClass(), "firstDataVersion", "nrxEBlDDtw");
        setField(term241482, term241482.getClass(), "firstPlayDate", "ZKcDOgjedL");
        setField(term241482, term241482.getClass(), "compatibleCmVersion", "fbIyjOnFlU");
        setField(term241482, term241482.getClass(), "dailyBonusDate", "mHJnsoOUVm");
        setField(term241482, term241482.getClass(), "dailyCourseBonusDate", "SZTwFHuOlF");
        setField(term241482, term241482.getClass(), "lastPairLoginDate", "HuNcrtnuIr");
        setField(term241482, term241482.getClass(), "lastTrialPlayDate", "UOgVwpVTwb");
        setIntField(term241482, term241482.getClass(), "playVsCount", 1558292388);
        setIntField(term241482, term241482.getClass(), "playSyncCount", -1203528819);
        setIntField(term241482, term241482.getClass(), "winCount", -225409509);
        setIntField(term241482, term241482.getClass(), "helpCount", 617177778);
        setIntField(term241482, term241482.getClass(), "comboCount", -738512159);
        setLongField(term241482, term241482.getClass(), "totalDeluxscore", -3909789175484339105L);
        setLongField(term241482, term241482.getClass(), "totalBasicDeluxscore", -6101667454828837191L);
        setLongField(term241482, term241482.getClass(), "totalAdvancedDeluxscore", 4145769595519377169L);
        setLongField(term241482, term241482.getClass(), "totalExpertDeluxscore", 8160350704249508632L);
        setLongField(term241482, term241482.getClass(), "totalMasterDeluxscore", 8843956033819537876L);
        setLongField(term241482, term241482.getClass(), "totalReMasterDeluxscore", 1265899772376089802L);
        setIntField(term241482, term241482.getClass(), "totalSync", 1656434761);
        setIntField(term241482, term241482.getClass(), "totalBasicSync", 735005939);
        setIntField(term241482, term241482.getClass(), "totalAdvancedSync", 1640246179);
        setIntField(term241482, term241482.getClass(), "totalExpertSync", 1608222328);
        setIntField(term241482, term241482.getClass(), "totalMasterSync", 516265532);
        setIntField(term241482, term241482.getClass(), "totalReMasterSync", -1003048484);
        setLongField(term241482, term241482.getClass(), "totalAchievement", -5061970786410027421L);
        setLongField(term241482, term241482.getClass(), "totalBasicAchievement", -1364604486220092575L);
        setLongField(term241482, term241482.getClass(), "totalAdvancedAchievement", 1534202191046171546L);
        setLongField(term241482, term241482.getClass(), "totalExpertAchievement", 6732357522802046553L);
        setLongField(term241482, term241482.getClass(), "totalMasterAchievement", -7068002414706403052L);
        setLongField(term241482, term241482.getClass(), "totalReMasterAchievement", -492059693254892712L);
        setLongField(term241482, term241482.getClass(), "playerOldRating", -2743473751385689835L);
        setLongField(term241482, term241482.getClass(), "playerNewRating", 8178157849316461751L);
        setIntField(term241482, term241482.getClass(), "banState", -1623684161);
        setLongField(term241482, term241482.getClass(), "dateTime", 4115881428866636970L);
        term241845 = new Integer(2085818873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term241845;
        callMethod(klass, "setIconId", argTypes, term241482, args);
    }

};


