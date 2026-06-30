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

public class UserDetail_setPlayerOldRating_789141119151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281067;
     Object term281430;

    public UserDetail_setPlayerOldRating_789141119151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281071 = new Long(8847748922379375307L);
        Integer term281134 = new Integer(338229726);
        Integer term281136 = new Integer(-1891580978);
        Integer term281138 = new Integer(1101260257);
        Integer term281140 = new Integer(1800400048);
        Integer term281142 = new Integer(-1248348901);
        ArrayList term281132 = new ArrayList();
        ((ArrayList) term281132).add(term281134);
        ((ArrayList) term281132).add(term281136);
        ((ArrayList) term281132).add(term281138);
        ((ArrayList) term281132).add(term281140);
        ((ArrayList) term281132).add(term281142);
        Integer term281148 = new Integer(-808864128);
        Integer term281150 = new Integer(-1813216452);
        Integer term281152 = new Integer(180516410);
        Integer term281154 = new Integer(606206987);
        Integer term281156 = new Integer(-534930572);
        Integer term281158 = new Integer(-748140133);
        Integer term281160 = new Integer(795993216);
        ArrayList term281146 = new ArrayList();
        ((ArrayList) term281146).add(term281148);
        ((ArrayList) term281146).add(term281150);
        ((ArrayList) term281146).add(term281152);
        ((ArrayList) term281146).add(term281154);
        ((ArrayList) term281146).add(term281156);
        ((ArrayList) term281146).add(term281158);
        ((ArrayList) term281146).add(term281160);
        term281067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term281069 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281100 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281067, term281067.getClass(), "id", -4308060436706063425L);
        setLongField(term281069, term281069.getClass(), "id", 8958523844182801555L);
        setField(term281069, term281069.getClass(), "extId", term281071);
        setField(term281069, term281069.getClass(), "luid", "wbTCLFBQCF");
        setIntField(term281086, term281086.getClass(), "year", 2023);
        setShortField(term281086, term281086.getClass(), "month", (short) 8);
        setShortField(term281086, term281086.getClass(), "day", (short) 23);
        setField(term281085, term281085.getClass(), "date", term281086);
        setByteField(term281090, term281090.getClass(), "hour", (byte) 23);
        setByteField(term281090, term281090.getClass(), "minute", (byte) 38);
        setByteField(term281090, term281090.getClass(), "second", (byte) 9);
        setIntField(term281090, term281090.getClass(), "nano", 356476969);
        setField(term281085, term281085.getClass(), "time", term281090);
        setField(term281069, term281069.getClass(), "registerTime", term281085);
        setIntField(term281096, term281096.getClass(), "year", 2014);
        setShortField(term281096, term281096.getClass(), "month", (short) 4);
        setShortField(term281096, term281096.getClass(), "day", (short) 23);
        setField(term281095, term281095.getClass(), "date", term281096);
        setByteField(term281100, term281100.getClass(), "hour", (byte) 21);
        setByteField(term281100, term281100.getClass(), "minute", (byte) 18);
        setByteField(term281100, term281100.getClass(), "second", (byte) 52);
        setIntField(term281100, term281100.getClass(), "nano", 192261366);
        setField(term281095, term281095.getClass(), "time", term281100);
        setField(term281069, term281069.getClass(), "accessTime", term281095);
        setField(term281067, term281067.getClass(), "card", term281069);
        setField(term281067, term281067.getClass(), "userName", "YdrFzLJmBL");
        setIntField(term281067, term281067.getClass(), "isNetMember", 1198986574);
        setIntField(term281067, term281067.getClass(), "iconId", 1496477362);
        setIntField(term281067, term281067.getClass(), "plateId", 694634515);
        setIntField(term281067, term281067.getClass(), "titleId", -1684684863);
        setIntField(term281067, term281067.getClass(), "partnerId", -1337880590);
        setIntField(term281067, term281067.getClass(), "frameId", -40671465);
        setIntField(term281067, term281067.getClass(), "selectMapId", 906922634);
        setIntField(term281067, term281067.getClass(), "totalAwake", 50121333);
        setIntField(term281067, term281067.getClass(), "gradeRating", 1552254538);
        setIntField(term281067, term281067.getClass(), "musicRating", -66330072);
        setIntField(term281067, term281067.getClass(), "playerRating", 1911156222);
        setIntField(term281067, term281067.getClass(), "highestRating", -595089281);
        setIntField(term281067, term281067.getClass(), "gradeRank", 336328847);
        setIntField(term281067, term281067.getClass(), "classRank", -1839425499);
        setIntField(term281067, term281067.getClass(), "courseRank", -1228260643);
        setField(term281067, term281067.getClass(), "charaSlot", term281132);
        setField(term281067, term281067.getClass(), "charaLockSlot", term281146);
        setLongField(term281067, term281067.getClass(), "contentBit", -5370634325913369443L);
        setIntField(term281067, term281067.getClass(), "playCount", 574874911);
        setField(term281067, term281067.getClass(), "eventWatchedDate", "oJxwTUrGoA");
        setField(term281067, term281067.getClass(), "lastGameId", "DZyWRMZKkh");
        setField(term281067, term281067.getClass(), "lastRomVersion", "FfDRlqapMv");
        setField(term281067, term281067.getClass(), "lastDataVersion", "REXiUGDUvP");
        setField(term281067, term281067.getClass(), "lastLoginDate", "kxhtDyZCFj");
        setField(term281067, term281067.getClass(), "lastPlayDate", "ksqLSkOdPn");
        setIntField(term281067, term281067.getClass(), "lastPlayCredit", -526061609);
        setIntField(term281067, term281067.getClass(), "lastPlayMode", -1784695440);
        setIntField(term281067, term281067.getClass(), "lastPlaceId", -770471106);
        setField(term281067, term281067.getClass(), "lastPlaceName", "OjuNeqiAeo");
        setIntField(term281067, term281067.getClass(), "lastAllNetId", 1307638203);
        setIntField(term281067, term281067.getClass(), "lastRegionId", 1624606138);
        setField(term281067, term281067.getClass(), "lastRegionName", "NMHarFCqvq");
        setField(term281067, term281067.getClass(), "lastClientId", "MmNWdQUdHF");
        setField(term281067, term281067.getClass(), "lastCountryCode", "nIGJbiiUvW");
        setIntField(term281067, term281067.getClass(), "lastSelectEMoney", 1148154717);
        setIntField(term281067, term281067.getClass(), "lastSelectTicket", 1743443237);
        setIntField(term281067, term281067.getClass(), "lastSelectCourse", 1817003214);
        setIntField(term281067, term281067.getClass(), "lastCountCourse", 1718370872);
        setField(term281067, term281067.getClass(), "firstGameId", "JzhWLyxXkj");
        setField(term281067, term281067.getClass(), "firstRomVersion", "AAidHZAyKB");
        setField(term281067, term281067.getClass(), "firstDataVersion", "krYrsxROnJ");
        setField(term281067, term281067.getClass(), "firstPlayDate", "QUrFaZSXXZ");
        setField(term281067, term281067.getClass(), "compatibleCmVersion", "fzsErxnPmd");
        setField(term281067, term281067.getClass(), "dailyBonusDate", "sDIrgCFfkO");
        setField(term281067, term281067.getClass(), "dailyCourseBonusDate", "hNDigjtAOH");
        setField(term281067, term281067.getClass(), "lastPairLoginDate", "KRnwDMPCbm");
        setField(term281067, term281067.getClass(), "lastTrialPlayDate", "YWxoRQOEME");
        setIntField(term281067, term281067.getClass(), "playVsCount", 1587341901);
        setIntField(term281067, term281067.getClass(), "playSyncCount", 1329288453);
        setIntField(term281067, term281067.getClass(), "winCount", -758711264);
        setIntField(term281067, term281067.getClass(), "helpCount", -1402801191);
        setIntField(term281067, term281067.getClass(), "comboCount", -138841862);
        setLongField(term281067, term281067.getClass(), "totalDeluxscore", 3172754617115999258L);
        setLongField(term281067, term281067.getClass(), "totalBasicDeluxscore", 7280844066232587956L);
        setLongField(term281067, term281067.getClass(), "totalAdvancedDeluxscore", 6101527964967183690L);
        setLongField(term281067, term281067.getClass(), "totalExpertDeluxscore", 550863938148788477L);
        setLongField(term281067, term281067.getClass(), "totalMasterDeluxscore", -8060664115470734715L);
        setLongField(term281067, term281067.getClass(), "totalReMasterDeluxscore", 847288150704981718L);
        setIntField(term281067, term281067.getClass(), "totalSync", 1531550853);
        setIntField(term281067, term281067.getClass(), "totalBasicSync", -1492283849);
        setIntField(term281067, term281067.getClass(), "totalAdvancedSync", -1673304554);
        setIntField(term281067, term281067.getClass(), "totalExpertSync", -620356333);
        setIntField(term281067, term281067.getClass(), "totalMasterSync", -157136506);
        setIntField(term281067, term281067.getClass(), "totalReMasterSync", 2127767309);
        setLongField(term281067, term281067.getClass(), "totalAchievement", 7846897591824181919L);
        setLongField(term281067, term281067.getClass(), "totalBasicAchievement", -5656540365912860631L);
        setLongField(term281067, term281067.getClass(), "totalAdvancedAchievement", -5697641509048557664L);
        setLongField(term281067, term281067.getClass(), "totalExpertAchievement", 11459664456333261L);
        setLongField(term281067, term281067.getClass(), "totalMasterAchievement", -7966363509507508793L);
        setLongField(term281067, term281067.getClass(), "totalReMasterAchievement", -8170709579257820116L);
        setLongField(term281067, term281067.getClass(), "playerOldRating", 5559447669412695762L);
        setLongField(term281067, term281067.getClass(), "playerNewRating", -8463695230560696795L);
        setIntField(term281067, term281067.getClass(), "banState", -1632200201);
        setLongField(term281067, term281067.getClass(), "dateTime", -7578977401060608644L);
        term281430 = new Long(-4720079533116855758L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term281430;
        callMethod(klass, "setPlayerOldRating", argTypes, term281067, args);
    }

};


