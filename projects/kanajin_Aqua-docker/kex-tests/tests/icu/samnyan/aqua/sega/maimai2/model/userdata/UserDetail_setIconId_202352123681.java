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

public class UserDetail_setIconId_202352123681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241427;
     Object term241790;

    public UserDetail_setIconId_202352123681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241431 = new Long(-1223573843683081410L);
        Integer term241494 = new Integer(-930966430);
        Integer term241496 = new Integer(-1137340653);
        Integer term241498 = new Integer(-520048649);
        Integer term241500 = new Integer(-39379486);
        Integer term241502 = new Integer(92637602);
        ArrayList term241492 = new ArrayList();
        ((ArrayList) term241492).add(term241494);
        ((ArrayList) term241492).add(term241496);
        ((ArrayList) term241492).add(term241498);
        ((ArrayList) term241492).add(term241500);
        ((ArrayList) term241492).add(term241502);
        Integer term241508 = new Integer(-702644184);
        Integer term241510 = new Integer(873158899);
        Integer term241512 = new Integer(-939494687);
        Integer term241514 = new Integer(1818886574);
        Integer term241516 = new Integer(-1082194143);
        Integer term241518 = new Integer(1109687027);
        Integer term241520 = new Integer(-1583077425);
        ArrayList term241506 = new ArrayList();
        ((ArrayList) term241506).add(term241508);
        ((ArrayList) term241506).add(term241510);
        ((ArrayList) term241506).add(term241512);
        ((ArrayList) term241506).add(term241514);
        ((ArrayList) term241506).add(term241516);
        ((ArrayList) term241506).add(term241518);
        ((ArrayList) term241506).add(term241520);
        term241427 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term241429 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term241445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term241455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term241427, term241427.getClass(), "id", -6345194618964055206L);
        setLongField(term241429, term241429.getClass(), "id", -8608669791686665284L);
        setField(term241429, term241429.getClass(), "extId", term241431);
        setField(term241429, term241429.getClass(), "luid", "fETlboOXMD");
        setIntField(term241446, term241446.getClass(), "year", 2016);
        setShortField(term241446, term241446.getClass(), "month", (short) 4);
        setShortField(term241446, term241446.getClass(), "day", (short) 6);
        setField(term241445, term241445.getClass(), "date", term241446);
        setByteField(term241450, term241450.getClass(), "hour", (byte) 11);
        setByteField(term241450, term241450.getClass(), "minute", (byte) 33);
        setByteField(term241450, term241450.getClass(), "second", (byte) 12);
        setIntField(term241450, term241450.getClass(), "nano", 167392252);
        setField(term241445, term241445.getClass(), "time", term241450);
        setField(term241429, term241429.getClass(), "registerTime", term241445);
        setIntField(term241456, term241456.getClass(), "year", 2014);
        setShortField(term241456, term241456.getClass(), "month", (short) 7);
        setShortField(term241456, term241456.getClass(), "day", (short) 24);
        setField(term241455, term241455.getClass(), "date", term241456);
        setByteField(term241460, term241460.getClass(), "hour", (byte) 5);
        setByteField(term241460, term241460.getClass(), "minute", (byte) 31);
        setByteField(term241460, term241460.getClass(), "second", (byte) 45);
        setIntField(term241460, term241460.getClass(), "nano", 932508724);
        setField(term241455, term241455.getClass(), "time", term241460);
        setField(term241429, term241429.getClass(), "accessTime", term241455);
        setField(term241427, term241427.getClass(), "card", term241429);
        setField(term241427, term241427.getClass(), "userName", "VUNSRpHsgz");
        setIntField(term241427, term241427.getClass(), "isNetMember", 452734504);
        setIntField(term241427, term241427.getClass(), "iconId", -813938461);
        setIntField(term241427, term241427.getClass(), "plateId", -1426913833);
        setIntField(term241427, term241427.getClass(), "titleId", -720649081);
        setIntField(term241427, term241427.getClass(), "partnerId", -2090357328);
        setIntField(term241427, term241427.getClass(), "frameId", 1501440504);
        setIntField(term241427, term241427.getClass(), "selectMapId", -249248566);
        setIntField(term241427, term241427.getClass(), "totalAwake", -259006503);
        setIntField(term241427, term241427.getClass(), "gradeRating", 1786896440);
        setIntField(term241427, term241427.getClass(), "musicRating", 1014633648);
        setIntField(term241427, term241427.getClass(), "playerRating", 1926810383);
        setIntField(term241427, term241427.getClass(), "highestRating", -1055243697);
        setIntField(term241427, term241427.getClass(), "gradeRank", -1915150284);
        setIntField(term241427, term241427.getClass(), "classRank", 1498762865);
        setIntField(term241427, term241427.getClass(), "courseRank", -1057997237);
        setField(term241427, term241427.getClass(), "charaSlot", term241492);
        setField(term241427, term241427.getClass(), "charaLockSlot", term241506);
        setLongField(term241427, term241427.getClass(), "contentBit", -8747118984293982721L);
        setIntField(term241427, term241427.getClass(), "playCount", 535946436);
        setField(term241427, term241427.getClass(), "eventWatchedDate", "THoPgbPYUF");
        setField(term241427, term241427.getClass(), "lastGameId", "FLJqMgPbQm");
        setField(term241427, term241427.getClass(), "lastRomVersion", "npMxjCfNPy");
        setField(term241427, term241427.getClass(), "lastDataVersion", "skQRylzRMg");
        setField(term241427, term241427.getClass(), "lastLoginDate", "PwmioJcxYU");
        setField(term241427, term241427.getClass(), "lastPlayDate", "wkgBbdahBJ");
        setIntField(term241427, term241427.getClass(), "lastPlayCredit", -907030403);
        setIntField(term241427, term241427.getClass(), "lastPlayMode", 746058743);
        setIntField(term241427, term241427.getClass(), "lastPlaceId", -527463696);
        setField(term241427, term241427.getClass(), "lastPlaceName", "TIOKoSkgvB");
        setIntField(term241427, term241427.getClass(), "lastAllNetId", 2087282313);
        setIntField(term241427, term241427.getClass(), "lastRegionId", 1966889005);
        setField(term241427, term241427.getClass(), "lastRegionName", "klYAJTFSIk");
        setField(term241427, term241427.getClass(), "lastClientId", "YLhafUDZSf");
        setField(term241427, term241427.getClass(), "lastCountryCode", "NkqVectDCd");
        setIntField(term241427, term241427.getClass(), "lastSelectEMoney", 2001342823);
        setIntField(term241427, term241427.getClass(), "lastSelectTicket", 1668521151);
        setIntField(term241427, term241427.getClass(), "lastSelectCourse", 1520350621);
        setIntField(term241427, term241427.getClass(), "lastCountCourse", -1328383795);
        setField(term241427, term241427.getClass(), "firstGameId", "PAiEsxsOUA");
        setField(term241427, term241427.getClass(), "firstRomVersion", "YKgbVyVpIQ");
        setField(term241427, term241427.getClass(), "firstDataVersion", "nrxEBlDDtw");
        setField(term241427, term241427.getClass(), "firstPlayDate", "ZKcDOgjedL");
        setField(term241427, term241427.getClass(), "compatibleCmVersion", "fbIyjOnFlU");
        setField(term241427, term241427.getClass(), "dailyBonusDate", "mHJnsoOUVm");
        setField(term241427, term241427.getClass(), "dailyCourseBonusDate", "SZTwFHuOlF");
        setField(term241427, term241427.getClass(), "lastPairLoginDate", "HuNcrtnuIr");
        setField(term241427, term241427.getClass(), "lastTrialPlayDate", "UOgVwpVTwb");
        setIntField(term241427, term241427.getClass(), "playVsCount", 1558292388);
        setIntField(term241427, term241427.getClass(), "playSyncCount", -1203528819);
        setIntField(term241427, term241427.getClass(), "winCount", -225409509);
        setIntField(term241427, term241427.getClass(), "helpCount", 617177778);
        setIntField(term241427, term241427.getClass(), "comboCount", -738512159);
        setLongField(term241427, term241427.getClass(), "totalDeluxscore", -3909789175484339105L);
        setLongField(term241427, term241427.getClass(), "totalBasicDeluxscore", -6101667454828837191L);
        setLongField(term241427, term241427.getClass(), "totalAdvancedDeluxscore", 4145769595519377169L);
        setLongField(term241427, term241427.getClass(), "totalExpertDeluxscore", 8160350704249508632L);
        setLongField(term241427, term241427.getClass(), "totalMasterDeluxscore", 8843956033819537876L);
        setLongField(term241427, term241427.getClass(), "totalReMasterDeluxscore", 1265899772376089802L);
        setIntField(term241427, term241427.getClass(), "totalSync", 1656434761);
        setIntField(term241427, term241427.getClass(), "totalBasicSync", 735005939);
        setIntField(term241427, term241427.getClass(), "totalAdvancedSync", 1640246179);
        setIntField(term241427, term241427.getClass(), "totalExpertSync", 1608222328);
        setIntField(term241427, term241427.getClass(), "totalMasterSync", 516265532);
        setIntField(term241427, term241427.getClass(), "totalReMasterSync", -1003048484);
        setLongField(term241427, term241427.getClass(), "totalAchievement", -5061970786410027421L);
        setLongField(term241427, term241427.getClass(), "totalBasicAchievement", -1364604486220092575L);
        setLongField(term241427, term241427.getClass(), "totalAdvancedAchievement", 1534202191046171546L);
        setLongField(term241427, term241427.getClass(), "totalExpertAchievement", 6732357522802046553L);
        setLongField(term241427, term241427.getClass(), "totalMasterAchievement", -7068002414706403052L);
        setLongField(term241427, term241427.getClass(), "totalReMasterAchievement", -492059693254892712L);
        setLongField(term241427, term241427.getClass(), "playerOldRating", -2743473751385689835L);
        setLongField(term241427, term241427.getClass(), "playerNewRating", 8178157849316461751L);
        setIntField(term241427, term241427.getClass(), "banState", -1623684161);
        setLongField(term241427, term241427.getClass(), "dateTime", 4115881428866636970L);
        term241790 = new Integer(2085818873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term241790;
        callMethod(klass, "setIconId", argTypes, term241427, args);
    }

};


