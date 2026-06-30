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

public class UserUdemae_getRate_6076965243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96078;

    public UserUdemae_getRate_6076965243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96084 = new Long(-4360569253593381888L);
        Integer term96147 = new Integer(-1443680397);
        Integer term96149 = new Integer(-1331169079);
        Integer term96151 = new Integer(1109050836);
        Integer term96153 = new Integer(1978065000);
        ArrayList term96145 = new ArrayList();
        ((ArrayList) term96145).add(term96147);
        ((ArrayList) term96145).add(term96149);
        ((ArrayList) term96145).add(term96151);
        ((ArrayList) term96145).add(term96153);
        Integer term96159 = new Integer(-2121133707);
        Integer term96161 = new Integer(-1005498887);
        ArrayList term96157 = new ArrayList();
        ((ArrayList) term96157).add(term96159);
        ((ArrayList) term96157).add(term96161);
        term96078 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term96080 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term96082 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96113 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96078, term96078.getClass(), "id", -8836354257007073767L);
        setLongField(term96080, term96080.getClass(), "id", -1461657660894361614L);
        setLongField(term96082, term96082.getClass(), "id", 1715352043372419387L);
        setField(term96082, term96082.getClass(), "extId", term96084);
        setField(term96082, term96082.getClass(), "luid", "RlMsoYxesz");
        setIntField(term96099, term96099.getClass(), "year", 2017);
        setShortField(term96099, term96099.getClass(), "month", (short) 1);
        setShortField(term96099, term96099.getClass(), "day", (short) 3);
        setField(term96098, term96098.getClass(), "date", term96099);
        setByteField(term96103, term96103.getClass(), "hour", (byte) 14);
        setByteField(term96103, term96103.getClass(), "minute", (byte) 1);
        setByteField(term96103, term96103.getClass(), "second", (byte) 1);
        setIntField(term96103, term96103.getClass(), "nano", 827128674);
        setField(term96098, term96098.getClass(), "time", term96103);
        setField(term96082, term96082.getClass(), "registerTime", term96098);
        setIntField(term96109, term96109.getClass(), "year", 2022);
        setShortField(term96109, term96109.getClass(), "month", (short) 9);
        setShortField(term96109, term96109.getClass(), "day", (short) 3);
        setField(term96108, term96108.getClass(), "date", term96109);
        setByteField(term96113, term96113.getClass(), "hour", (byte) 22);
        setByteField(term96113, term96113.getClass(), "minute", (byte) 31);
        setByteField(term96113, term96113.getClass(), "second", (byte) 44);
        setIntField(term96113, term96113.getClass(), "nano", 798112760);
        setField(term96108, term96108.getClass(), "time", term96113);
        setField(term96082, term96082.getClass(), "accessTime", term96108);
        setField(term96080, term96080.getClass(), "card", term96082);
        setField(term96080, term96080.getClass(), "userName", "FkuWKCInZG");
        setIntField(term96080, term96080.getClass(), "isNetMember", -984062764);
        setIntField(term96080, term96080.getClass(), "iconId", -1115743900);
        setIntField(term96080, term96080.getClass(), "plateId", 1859865234);
        setIntField(term96080, term96080.getClass(), "titleId", -201519710);
        setIntField(term96080, term96080.getClass(), "partnerId", 746214721);
        setIntField(term96080, term96080.getClass(), "frameId", 219641616);
        setIntField(term96080, term96080.getClass(), "selectMapId", -1933520989);
        setIntField(term96080, term96080.getClass(), "totalAwake", 1458764208);
        setIntField(term96080, term96080.getClass(), "gradeRating", 1367265936);
        setIntField(term96080, term96080.getClass(), "musicRating", 1755253293);
        setIntField(term96080, term96080.getClass(), "playerRating", 140215223);
        setIntField(term96080, term96080.getClass(), "highestRating", 1754589351);
        setIntField(term96080, term96080.getClass(), "gradeRank", 1600131068);
        setIntField(term96080, term96080.getClass(), "classRank", 1652840562);
        setIntField(term96080, term96080.getClass(), "courseRank", 2101098539);
        setField(term96080, term96080.getClass(), "charaSlot", term96145);
        setField(term96080, term96080.getClass(), "charaLockSlot", term96157);
        setLongField(term96080, term96080.getClass(), "contentBit", 5275491898202461780L);
        setIntField(term96080, term96080.getClass(), "playCount", 222587472);
        setField(term96080, term96080.getClass(), "eventWatchedDate", "WoRWEXpkMK");
        setField(term96080, term96080.getClass(), "lastGameId", "EkKMYiEKHU");
        setField(term96080, term96080.getClass(), "lastRomVersion", "gvLQDVFTIF");
        setField(term96080, term96080.getClass(), "lastDataVersion", "ROkWEBVPGe");
        setField(term96080, term96080.getClass(), "lastLoginDate", "BHWsGhxwwy");
        setField(term96080, term96080.getClass(), "lastPlayDate", "AOwXDxldzy");
        setIntField(term96080, term96080.getClass(), "lastPlayCredit", -222360853);
        setIntField(term96080, term96080.getClass(), "lastPlayMode", -886522384);
        setIntField(term96080, term96080.getClass(), "lastPlaceId", -1780849406);
        setField(term96080, term96080.getClass(), "lastPlaceName", "oPjvcZQHAL");
        setIntField(term96080, term96080.getClass(), "lastAllNetId", -938188610);
        setIntField(term96080, term96080.getClass(), "lastRegionId", 716282229);
        setField(term96080, term96080.getClass(), "lastRegionName", "uCNCXXRNau");
        setField(term96080, term96080.getClass(), "lastClientId", "eRcAzhxOsA");
        setField(term96080, term96080.getClass(), "lastCountryCode", "uyydsCcltT");
        setIntField(term96080, term96080.getClass(), "lastSelectEMoney", -749259966);
        setIntField(term96080, term96080.getClass(), "lastSelectTicket", 1042892041);
        setIntField(term96080, term96080.getClass(), "lastSelectCourse", 1690194849);
        setIntField(term96080, term96080.getClass(), "lastCountCourse", 411327783);
        setField(term96080, term96080.getClass(), "firstGameId", "gRGZBrxxxv");
        setField(term96080, term96080.getClass(), "firstRomVersion", "YvYPXzCrcU");
        setField(term96080, term96080.getClass(), "firstDataVersion", "KESrHnsKCa");
        setField(term96080, term96080.getClass(), "firstPlayDate", "PRagOHCKmN");
        setField(term96080, term96080.getClass(), "compatibleCmVersion", "lvnwgMKxXk");
        setField(term96080, term96080.getClass(), "dailyBonusDate", "FiSaNxpGPk");
        setField(term96080, term96080.getClass(), "dailyCourseBonusDate", "QMzQRRhneO");
        setField(term96080, term96080.getClass(), "lastPairLoginDate", "VFWNaQoDnL");
        setField(term96080, term96080.getClass(), "lastTrialPlayDate", "BFwtIJkozx");
        setIntField(term96080, term96080.getClass(), "playVsCount", -1499151614);
        setIntField(term96080, term96080.getClass(), "playSyncCount", -417329093);
        setIntField(term96080, term96080.getClass(), "winCount", -1454824229);
        setIntField(term96080, term96080.getClass(), "helpCount", -94200317);
        setIntField(term96080, term96080.getClass(), "comboCount", -1822530946);
        setLongField(term96080, term96080.getClass(), "totalDeluxscore", -2039714302053648737L);
        setLongField(term96080, term96080.getClass(), "totalBasicDeluxscore", -8013526278764187887L);
        setLongField(term96080, term96080.getClass(), "totalAdvancedDeluxscore", 697161019627941929L);
        setLongField(term96080, term96080.getClass(), "totalExpertDeluxscore", 5572685640122211331L);
        setLongField(term96080, term96080.getClass(), "totalMasterDeluxscore", -8410507195062360746L);
        setLongField(term96080, term96080.getClass(), "totalReMasterDeluxscore", 2635341406861932189L);
        setIntField(term96080, term96080.getClass(), "totalSync", 362870886);
        setIntField(term96080, term96080.getClass(), "totalBasicSync", -728892845);
        setIntField(term96080, term96080.getClass(), "totalAdvancedSync", -344829493);
        setIntField(term96080, term96080.getClass(), "totalExpertSync", -542170709);
        setIntField(term96080, term96080.getClass(), "totalMasterSync", 1069599758);
        setIntField(term96080, term96080.getClass(), "totalReMasterSync", 339833097);
        setLongField(term96080, term96080.getClass(), "totalAchievement", -4881546824985102139L);
        setLongField(term96080, term96080.getClass(), "totalBasicAchievement", 573913569116349195L);
        setLongField(term96080, term96080.getClass(), "totalAdvancedAchievement", 8421862887742044664L);
        setLongField(term96080, term96080.getClass(), "totalExpertAchievement", 8943359131971541399L);
        setLongField(term96080, term96080.getClass(), "totalMasterAchievement", -274302069813205157L);
        setLongField(term96080, term96080.getClass(), "totalReMasterAchievement", -1828741393158004146L);
        setLongField(term96080, term96080.getClass(), "playerOldRating", -8310891844261180284L);
        setLongField(term96080, term96080.getClass(), "playerNewRating", 5125563429780203235L);
        setIntField(term96080, term96080.getClass(), "banState", -669854850);
        setLongField(term96080, term96080.getClass(), "dateTime", 6728314318147485883L);
        setField(term96078, term96078.getClass(), "user", term96080);
        setIntField(term96078, term96078.getClass(), "rate", -958077351);
        setIntField(term96078, term96078.getClass(), "maxRate", 254501776);
        setIntField(term96078, term96078.getClass(), "classValue", -655069845);
        setIntField(term96078, term96078.getClass(), "maxClassValue", -489615582);
        setIntField(term96078, term96078.getClass(), "totalWinNum", 627648167);
        setIntField(term96078, term96078.getClass(), "totalLoseNum", -1937818486);
        setIntField(term96078, term96078.getClass(), "maxWinNum", -1847517978);
        setIntField(term96078, term96078.getClass(), "maxLoseNum", 1452025284);
        setIntField(term96078, term96078.getClass(), "winNum", 694572730);
        setIntField(term96078, term96078.getClass(), "loseNum", 809297786);
        setIntField(term96078, term96078.getClass(), "npcTotalWinNum", 1250819263);
        setIntField(term96078, term96078.getClass(), "npcTotalLoseNum", 1618070973);
        setIntField(term96078, term96078.getClass(), "npcMaxWinNum", -127271511);
        setIntField(term96078, term96078.getClass(), "npcMaxLoseNum", -259183708);
        setIntField(term96078, term96078.getClass(), "npcWinNum", 1520040482);
        setIntField(term96078, term96078.getClass(), "npcLoseNum", 959050550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term96078, args);
    }

};


